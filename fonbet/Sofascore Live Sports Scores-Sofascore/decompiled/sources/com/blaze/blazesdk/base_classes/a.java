package com.blaze.blazesdk.base_classes;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.cnb;
import defpackage.krk;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a extends AppCompatActivity {
    public final Function1 i;
    public krk j;

    public a(@NotNull Function1<? super LayoutInflater, krk> function1) {
        function1.getClass();
        this.i = function1;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        super.attachBaseContext(cnb.a(context, BlazeSDK.INSTANCE.getForceLayoutDirection$blazesdk_release()));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            Function1 function1 = this.i;
            LayoutInflater layoutInflater = getLayoutInflater();
            layoutInflater.getClass();
            krk krkVar = (krk) function1.invoke(layoutInflater);
            krkVar.getClass();
            this.j = krkVar;
            setContentView(p().getRoot());
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final krk p() {
        krk krkVar = this.j;
        if (krkVar != null) {
            return krkVar;
        }
        Intrinsics.i("binding");
        throw null;
    }
}
