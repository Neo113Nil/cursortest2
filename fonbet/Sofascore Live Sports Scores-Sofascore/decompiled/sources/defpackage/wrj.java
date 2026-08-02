package defpackage;

import android.widget.LinearLayout;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.view.follownotification.FollowButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class wrj extends p8 {
    public final zl c;
    public final boolean d;
    public final int e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wrj(zl zlVar, boolean z, int i, boolean z2, int i2) {
        super(r6);
        z = (i2 & 2) != 0 ? true : z;
        i = (i2 & 4) != 0 ? 16 : i;
        z2 = (i2 & 8) != 0 ? false : z2;
        LinearLayout linearLayout = (LinearLayout) zlVar.f;
        linearLayout.getClass();
        this.c = zlVar;
        this.d = z;
        this.e = i;
        this.f = z2;
    }

    @Override // defpackage.p8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(int i, int i2, lrj lrjVar) {
        lrjVar.getClass();
        zl zlVar = this.c;
        FollowButton followButton = (FollowButton) zlVar.n;
        r4a.r(zlVar, lrjVar);
        UniqueTournament uniqueTournament = lrjVar.a.getUniqueTournament();
        boolean z = this.f && uniqueTournament != null;
        followButton.setVisibility(z ? 0 : 8);
        if (z) {
            wu wuVar = lrjVar.g;
            if (wuVar == null) {
                wuVar = wu.MAIN_MATCHES;
            }
            FollowButton.f(followButton, uniqueTournament, wuVar, 4);
        }
        if (this.d) {
            LinearLayout linearLayout = (LinearLayout) zlVar.f;
            linearLayout.getClass();
            sea.v(linearLayout, lrjVar.k, lrjVar.l || i == i2 + (-1), this.e, 6, 0, lrjVar.i, 48);
        }
    }
}
