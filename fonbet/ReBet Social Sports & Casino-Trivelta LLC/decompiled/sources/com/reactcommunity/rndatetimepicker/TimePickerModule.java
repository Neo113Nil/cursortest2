package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
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
import com.reactcommunity.rndatetimepicker.TimePickerModule;
import com.twilio.voice.EventKeys;
import java.util.Calendar;
import jc.AbstractC5118d;
import jc.C5124j;
import jc.y;

@ReactModule(name = "RNCTimePicker")
/* loaded from: classes4.dex */
public class TimePickerModule extends NativeModuleTimePickerSpec {

    @VisibleForTesting
    public static final String NAME = "RNCTimePicker";

    public class a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final Promise f41258a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f41259b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f41260c = false;

        public a(Promise promise, Bundle bundle) {
            this.f41258a = promise;
            this.f41259b = bundle;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f41260c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "neutralButtonAction");
            this.f41258a.resolve(writableNativeMap);
            this.f41260c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f41260c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            this.f41258a.resolve(writableNativeMap);
            this.f41260c = true;
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i10, int i11) {
            if (this.f41260c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            C5124j c5124j = new C5124j(this.f41259b);
            Calendar calendar = Calendar.getInstance(AbstractC5118d.m(this.f41259b));
            calendar.set(c5124j.f(), c5124j.d(), c5124j.a(), i10, i11, 0);
            calendar.set(14, 0);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "timeSetAction");
            writableNativeMap.putDouble(EventKeys.TIMESTAMP, calendar.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 1000) / 60);
            this.f41258a.resolve(writableNativeMap);
            this.f41260c = true;
        }
    }

    public TimePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0(FragmentManager fragmentManager, ReadableMap readableMap, Promise promise) {
        y yVar = (y) fragmentManager.p0("RNCTimePicker");
        Bundle g10 = AbstractC5118d.g(readableMap);
        if (yVar != null) {
            yVar.l0(g10);
            return;
        }
        y yVar2 = new y();
        yVar2.setArguments(g10);
        a aVar = new a(promise, g10);
        yVar2.h0(aVar);
        yVar2.k0(aVar);
        yVar2.j0(aVar);
        yVar2.show(fragmentManager, "RNCTimePicker");
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec
    @ReactMethod
    public void dismiss(Promise promise) {
        AbstractC5118d.h((AbstractActivityC2168s) getCurrentActivity(), "RNCTimePicker", promise);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNCTimePicker";
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec
    @ReactMethod
    public void open(final ReadableMap readableMap, final Promise promise) {
        AbstractActivityC2168s abstractActivityC2168s = (AbstractActivityC2168s) getCurrentActivity();
        if (abstractActivityC2168s == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a TimePicker dialog while not attached to an Activity");
        } else {
            final FragmentManager supportFragmentManager = abstractActivityC2168s.getSupportFragmentManager();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: jc.A
                @Override // java.lang.Runnable
                public final void run() {
                    TimePickerModule.this.lambda$open$0(supportFragmentManager, readableMap, promise);
                }
            });
        }
    }
}
