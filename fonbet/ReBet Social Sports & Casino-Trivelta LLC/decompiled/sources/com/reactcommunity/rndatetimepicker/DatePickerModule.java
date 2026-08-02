package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.annotation.NonNull;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.reactcommunity.rndatetimepicker.DatePickerModule;
import com.twilio.voice.EventKeys;
import java.util.Calendar;
import jc.AbstractC5118d;
import jc.C5124j;
import jc.C5127m;

@ReactModule(name = "RNCDatePicker")
/* loaded from: classes4.dex */
public class DatePickerModule extends NativeModuleDatePickerSpec {

    @VisibleForTesting
    public static final String NAME = "RNCDatePicker";

    public class a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final Promise f41254a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f41255b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f41256c = false;

        public a(Promise promise, Bundle bundle) {
            this.f41254a = promise;
            this.f41255b = bundle;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f41256c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "neutralButtonAction");
            this.f41254a.resolve(writableNativeMap);
            this.f41256c = true;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            if (this.f41256c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            C5124j c5124j = new C5124j(this.f41255b);
            Calendar calendar = Calendar.getInstance(AbstractC5118d.m(this.f41255b));
            calendar.set(i10, i11, i12, c5124j.b(), c5124j.c(), 0);
            calendar.set(14, 0);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dateSetAction");
            writableNativeMap.putDouble(EventKeys.TIMESTAMP, calendar.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 1000) / 60);
            this.f41254a.resolve(writableNativeMap);
            this.f41256c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f41256c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            this.f41254a.resolve(writableNativeMap);
            this.f41256c = true;
        }
    }

    public DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0(FragmentManager fragmentManager, ReadableMap readableMap, Promise promise) {
        C5127m c5127m = (C5127m) fragmentManager.p0("RNCDatePicker");
        Bundle e10 = AbstractC5118d.e(readableMap);
        if (c5127m != null) {
            c5127m.m0(e10);
            return;
        }
        C5127m c5127m2 = new C5127m();
        c5127m2.setArguments(e10);
        a aVar = new a(promise, e10);
        c5127m2.k0(aVar);
        c5127m2.j0(aVar);
        c5127m2.l0(aVar);
        c5127m2.show(fragmentManager, "RNCDatePicker");
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec
    @ReactMethod
    public void dismiss(Promise promise) {
        AbstractC5118d.h((AbstractActivityC2168s) getCurrentActivity(), "RNCDatePicker", promise);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNCDatePicker";
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec
    @ReactMethod
    public void open(final ReadableMap readableMap, final Promise promise) {
        AbstractActivityC2168s abstractActivityC2168s = (AbstractActivityC2168s) getCurrentActivity();
        if (abstractActivityC2168s == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to an Activity");
        } else {
            final FragmentManager supportFragmentManager = abstractActivityC2168s.getSupportFragmentManager();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: jc.e
                @Override // java.lang.Runnable
                public final void run() {
                    DatePickerModule.this.lambda$open$0(supportFragmentManager, readableMap, promise);
                }
            });
        }
    }
}
