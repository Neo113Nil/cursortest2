package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ipa {
    public final /* synthetic */ int a;
    public final znh b;
    public final znh c;
    public boolean d;
    public Object e;
    public final yqa f;

    public ipa(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = e.c(i);
                this.c = e.c(i2);
                this.f = new yqa(i, 30, 100);
                break;
            default:
                this.b = e.c(i);
                this.c = e.c(i2);
                this.f = new yqa(i, 90, 200);
                break;
        }
    }

    public final void a(int i, int i2) {
        int i3 = this.a;
        znh znhVar = this.c;
        yqa yqaVar = this.f;
        znh znhVar2 = this.b;
        switch (i3) {
            case 0:
                if (i < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    u3a.a("Index should be non-negative");
                }
                znhVar2.i(i);
                yqaVar.c(i);
                znhVar.i(i2);
                break;
            default:
                if (i < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    u3a.a("Index should be non-negative (" + i + ')');
                }
                znhVar2.i(i);
                yqaVar.c(i);
                znhVar.i(i2);
                break;
        }
    }
}
