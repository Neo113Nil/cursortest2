package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.view.follownotification.FollowButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ts7 extends p8 {
    public final /* synthetic */ int c;
    public final z82 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ts7(z82 z82Var, int i) {
        super(r2);
        this.c = i;
        switch (i) {
            case 1:
                MaterialCardView materialCardView = (MaterialCardView) z82Var.b;
                materialCardView.getClass();
                super(materialCardView);
                this.d = z82Var;
                break;
            default:
                MaterialCardView materialCardView2 = (MaterialCardView) z82Var.b;
                materialCardView2.getClass();
                this.d = z82Var;
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3 = this.c;
        z82 z82Var = this.d;
        switch (i3) {
            case 0:
                Player player = (Player) obj;
                player.getClass();
                as9.l((AppCompatImageView) z82Var.e, player.getId(), null);
                ((TextView) z82Var.g).setText(tba.t(player));
                FollowButton followButton = (FollowButton) z82Var.f;
                int i4 = FollowButton.i;
                followButton.e(player, null, null);
                break;
            default:
                UniqueTournament uniqueTournament = (UniqueTournament) obj;
                uniqueTournament.getClass();
                as9.q((AppCompatImageView) z82Var.e, Integer.valueOf(uniqueTournament.getId()), 0, null);
                ((TextView) z82Var.g).setText(tba.x(uniqueTournament));
                FollowButton followButton2 = (FollowButton) z82Var.f;
                int i5 = FollowButton.i;
                followButton2.e(uniqueTournament, null, null);
                break;
        }
    }
}
