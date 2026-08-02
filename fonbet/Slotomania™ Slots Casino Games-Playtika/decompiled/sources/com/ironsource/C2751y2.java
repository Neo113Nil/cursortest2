package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C2578o8;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2751y2 {
    public static C2751y2 a;

    /* renamed from: com.ironsource.y2$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C2578o8.a.values().length];
            a = iArr;
            try {
                iArr[C2578o8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C2578o8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C2578o8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static C2751y2 a() {
        C2751y2 c2751y2 = a;
        return c2751y2 == null ? new C2751y2() : c2751y2;
    }

    public boolean a(Activity activity) {
        if (a.a[C2365ca.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) O9.b((Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.l("back");
            return true;
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
