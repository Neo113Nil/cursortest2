package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import com.unity3d.services.UnityAdsConstants;
import defpackage.d6b;
import defpackage.e1d;
import defpackage.p6b;
import defpackage.q50;
import defpackage.u6b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p6b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                q50 q50Var = (q50) obj2;
                e1d e1dVar = (e1d) obj;
                int i2 = h.a[d6bVar.ordinal()];
                if (i2 == 1) {
                    e1dVar.setValue(Boolean.FALSE);
                    break;
                } else if (i2 == 2 && ((Number) q50Var.d()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    e1dVar.setValue(Boolean.TRUE);
                    break;
                }
                break;
            case 1:
                q50 q50Var2 = (q50) obj2;
                e1d e1dVar2 = (e1d) obj;
                int i3 = k.a[d6bVar.ordinal()];
                if (i3 == 1) {
                    e1dVar2.setValue(Boolean.FALSE);
                    break;
                } else if (i3 == 2 && ((Number) q50Var2.d()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    e1dVar2.setValue(Boolean.TRUE);
                    break;
                }
                break;
            default:
                com.facebook.login.i iVar = (com.facebook.login.i) obj2;
                com.moloco.sdk.internal.publisher.nativead.b bVar = (com.moloco.sdk.internal.publisher.nativead.b) obj;
                int i4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.i.a[d6bVar.ordinal()];
                if (i4 == 1) {
                    ((com.moloco.sdk.internal.publisher.nativead.b) iVar.c).invoke();
                    break;
                } else if (i4 == 4) {
                    bVar.invoke();
                    break;
                }
                break;
        }
    }
}
