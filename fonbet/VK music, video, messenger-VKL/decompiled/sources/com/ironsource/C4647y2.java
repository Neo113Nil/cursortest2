package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4492p8;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4647y2 {
    public static C4647y2 a;

    /* renamed from: com.ironsource.y2$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C4492p8.a.values().length];
            a = iArr;
            try {
                iArr[C4492p8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C4492p8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C4492p8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static C4647y2 a() {
        C4647y2 c4647y2 = a;
        return c4647y2 == null ? new C4647y2() : c4647y2;
    }

    public boolean a(Activity activity) {
        if (a.a[C4279da.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) P9.b((Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.l("back");
            return true;
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
