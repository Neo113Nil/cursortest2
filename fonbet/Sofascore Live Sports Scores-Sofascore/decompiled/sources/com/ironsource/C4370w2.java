package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4197m8;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4370w2 {
    public static C4370w2 a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.w2$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C4197m8.a.values().length];
            a = iArr;
            try {
                iArr[C4197m8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C4197m8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C4197m8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean a(Activity activity) {
        if (a.a[C4020ca.e().b().ordinal()] != 3) {
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
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    public static C4370w2 a() {
        C4370w2 c4370w2 = a;
        return c4370w2 == null ? new C4370w2() : c4370w2;
    }
}
