package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import io.sentry.metrics.MetricsUnit;

@ReactModule(name = RNDatePickerDialogModule.FRAGMENT_TAG)
/* loaded from: classes8.dex */
public class RNDatePickerDialogModule extends ReactContextBaseJavaModule {

    @VisibleForTesting
    public static final String FRAGMENT_TAG = "RNDatePickerAndroid";

    public RNDatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return FRAGMENT_TAG;
    }

    private class DatePickerDialogListener implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
        private final Promise mPromise;
        private boolean mPromiseResolved = false;

        public DatePickerDialogListener(Promise promise) {
            this.mPromise = promise;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (this.mPromiseResolved || !RNDatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", RNConstants.ACTION_DATE_SET);
            writableNativeMap.putInt("year", i);
            writableNativeMap.putInt("month", i2);
            writableNativeMap.putInt(MetricsUnit.Duration.DAY, i3);
            this.mPromise.resolve(writableNativeMap);
            this.mPromiseResolved = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.mPromiseResolved || !RNDatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", RNConstants.ACTION_DISMISSED);
            this.mPromise.resolve(writableNativeMap);
            this.mPromiseResolved = true;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.mPromiseResolved || !RNDatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", RNConstants.ACTION_NEUTRAL_BUTTON);
            this.mPromise.resolve(writableNativeMap);
            this.mPromiseResolved = true;
        }
    }

    @ReactMethod
    public void open(final ReadableMap readableMap, Promise promise) {
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        if (fragmentActivity == null) {
            promise.reject(RNConstants.ERROR_NO_ACTIVITY, "Tried to open a DatePicker dialog while not attached to an Activity");
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        final RNDatePickerDialogFragment rNDatePickerDialogFragment = (RNDatePickerDialogFragment) supportFragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (rNDatePickerDialogFragment != null && readableMap != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactcommunity.rndatetimepicker.RNDatePickerDialogModule.1
                @Override // java.lang.Runnable
                public void run() {
                    rNDatePickerDialogFragment.update(RNDatePickerDialogModule.this.createFragmentArguments(readableMap));
                }
            });
            return;
        }
        RNDatePickerDialogFragment rNDatePickerDialogFragment2 = new RNDatePickerDialogFragment();
        if (readableMap != null) {
            rNDatePickerDialogFragment2.setArguments(createFragmentArguments(readableMap));
        }
        DatePickerDialogListener datePickerDialogListener = new DatePickerDialogListener(promise);
        rNDatePickerDialogFragment2.setOnDismissListener(datePickerDialogListener);
        rNDatePickerDialogFragment2.setOnDateSetListener(datePickerDialogListener);
        rNDatePickerDialogFragment2.setOnNeutralButtonActionListener(datePickerDialogListener);
        rNDatePickerDialogFragment2.show(supportFragmentManager, FRAGMENT_TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("value") && !readableMap.isNull("value")) {
            bundle.putLong("value", (long) readableMap.getDouble("value"));
        }
        if (readableMap.hasKey("minimumDate") && !readableMap.isNull("minimumDate")) {
            bundle.putLong("minimumDate", (long) readableMap.getDouble("minimumDate"));
        }
        if (readableMap.hasKey("maximumDate") && !readableMap.isNull("maximumDate")) {
            bundle.putLong("maximumDate", (long) readableMap.getDouble("maximumDate"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundle.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey(RNConstants.ARG_NEUTRAL_BUTTON_LABEL) && !readableMap.isNull(RNConstants.ARG_NEUTRAL_BUTTON_LABEL)) {
            bundle.putString(RNConstants.ARG_NEUTRAL_BUTTON_LABEL, readableMap.getString(RNConstants.ARG_NEUTRAL_BUTTON_LABEL));
        }
        return bundle;
    }
}
