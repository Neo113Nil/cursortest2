package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.analytics.enums.EventNavigationDirection;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iul extends ouk {
    public bk7 a;
    public final /* synthetic */ syl b;

    public iul(syl sylVar) {
        this.b = sylVar;
    }

    @Override // defpackage.ouk
    public final void a(int i) {
        syl sylVar = this.b;
        if (i == 0) {
            sylVar.q.j.setUserInputEnabled(true);
            bk7 bk7Var = this.a;
            if (bk7Var != null) {
                bk7Var.invoke();
            }
            ((sqm) sylVar.getViewModel()).getClass();
            return;
        }
        if (i == 1) {
            int i2 = syl.C;
            ((sqm) sylVar.getViewModel()).getClass();
        } else {
            if (i != 2) {
                return;
            }
            sylVar.q.j.setUserInputEnabled(false);
            ((sqm) sylVar.getViewModel()).getClass();
        }
    }

    @Override // defpackage.ouk
    public final void b(int i, float f, int i2) {
        if (i2 > 0) {
            int i3 = syl.C;
            sqm sqmVar = (sqm) this.b.getViewModel();
            sqmVar.C0 = Integer.max(sqmVar.C0, i + 1);
        }
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        int i2 = syl.C;
        syl sylVar = this.b;
        sqm sqmVar = (sqm) sylVar.getViewModel();
        sqmVar.C0 = Integer.max(sqmVar.C0, i);
        ViewPager2 viewPager2 = sylVar.q.j;
        viewPager2.getClass();
        if (evl.n(viewPager2)) {
            d(i);
        } else {
            this.a = new bk7(this, i, 7);
        }
    }

    public final void d(int i) {
        int i2 = syl.C;
        sqm sqmVar = (sqm) this.b.getViewModel();
        sqmVar.getClass();
        try {
            sqmVar.i0();
            Integer t = tz9.t(sqmVar.t, sqmVar.D());
            EventNavigationDirection eventNavigationDirection = i < (t != null ? t.intValue() : -1) ? EventNavigationDirection.BACKWARD : EventNavigationDirection.FORWARD;
            sqmVar.Z(i);
            sqmVar.e0(i);
            n4m n4mVar = (n4m) CollectionsKt.a0(i, sqmVar.t);
            if (n4mVar == null) {
                return;
            }
            sqmVar.b0(n4mVar, eventNavigationDirection);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
