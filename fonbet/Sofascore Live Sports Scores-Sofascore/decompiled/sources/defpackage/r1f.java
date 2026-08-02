package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.results.R;
import com.sofascore.results.view.follownotification.FollowButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r1f implements krk {
    public final ConstraintLayout a;
    public final FollowButton b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;

    public r1f(ConstraintLayout constraintLayout, FollowButton followButton, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = followButton;
        this.c = textView;
        this.d = imageView;
        this.e = textView2;
        this.f = textView3;
    }

    public static r1f a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.popular_player_row, viewGroup, false);
        int i = R.id.guideline;
        if (((Guideline) nq8.B(R.id.guideline, inflate)) != null) {
            i = R.id.notification_button;
            FollowButton followButton = (FollowButton) nq8.B(R.id.notification_button, inflate);
            if (followButton != null) {
                i = R.id.player_followers_text;
                TextView textView = (TextView) nq8.B(R.id.player_followers_text, inflate);
                if (textView != null) {
                    i = R.id.player_image;
                    ImageView imageView = (ImageView) nq8.B(R.id.player_image, inflate);
                    if (imageView != null) {
                        i = R.id.player_name_text;
                        TextView textView2 = (TextView) nq8.B(R.id.player_name_text, inflate);
                        if (textView2 != null) {
                            i = R.id.rank_text;
                            TextView textView3 = (TextView) nq8.B(R.id.rank_text, inflate);
                            if (textView3 != null) {
                                return new r1f((ConstraintLayout) inflate, followButton, textView, imageView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
