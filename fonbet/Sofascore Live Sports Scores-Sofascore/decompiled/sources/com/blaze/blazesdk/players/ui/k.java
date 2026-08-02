package com.blaze.blazesdk.players.ui;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import com.blaze.blazesdk.base_classes.a;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.cnb;
import defpackage.iim;
import defpackage.krk;
import defpackage.wca;
import defpackage.xw3;
import defpackage.y0m;
import defpackage.zjm;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class k extends a {
    public Function1 k;
    public final zjm l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Function1<? super LayoutInflater, krk> function1) {
        super(function1);
        function1.getClass();
        this.l = new zjm();
    }

    @Override // com.blaze.blazesdk.base_classes.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Object systemService = getSystemService("media_router");
            MediaRouter mediaRouter = systemService instanceof MediaRouter ? (MediaRouter) systemService : null;
            if (mediaRouter != null) {
                mediaRouter.addCallback(8388608, this.l, 2);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new iim(this, null), 3);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            if (i != 24 && i != 25) {
                return super.onKeyUp(i, keyEvent);
            }
            Function1 function1 = this.k;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(cnb.f(this) == 0));
            }
            return true;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return false;
        }
    }

    public abstract boolean q(y0m y0mVar);
}
