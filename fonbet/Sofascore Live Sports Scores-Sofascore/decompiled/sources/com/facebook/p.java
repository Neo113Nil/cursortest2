package com.facebook;

import androidx.activity.result.ActivityResult;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import defpackage.aeh;
import defpackage.cq5;
import defpackage.f6a;
import defpackage.nl4;
import defpackage.xd;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements com.facebook.internal.n, xd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.facebook.internal.n
    public void d(boolean z) {
        String str = (String) this.b;
        if (z) {
            try {
                cq5 cq5Var = new cq5(str);
                if ((cq5Var.b == null || cq5Var.c == null) ? false : true) {
                    f6a.O(cq5Var.a, cq5Var.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                nl4 nl4Var = ((MraidActivity) obj2).g;
                if (nl4Var == null) {
                    Intrinsics.i("storeInstallerImpl");
                    throw null;
                }
                int i2 = activityResult.a;
                nl4Var.a();
                return;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                aeh aehVar = VastActivity.e;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "VastActivity", "Activity result received: resultCode=" + activityResult2.a, null, false, 12, null);
                MolocoLogger.info$default(molocoLogger, "VastActivity", "Activity result received: resultData=" + activityResult2.b, null, false, 12, null);
                nl4 nl4Var2 = ((VastActivity) obj2).d;
                if (nl4Var2 != null) {
                    nl4Var2.a();
                    return;
                } else {
                    Intrinsics.i("storeInstallerImpl");
                    throw null;
                }
        }
    }
}
