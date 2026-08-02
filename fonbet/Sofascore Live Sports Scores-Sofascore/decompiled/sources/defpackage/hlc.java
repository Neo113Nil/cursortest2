package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hlc extends g7 {
    public final kr1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlc(Context context, kr1 kr1Var) {
        super(context);
        context.getClass();
        this.l = kr1Var;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 23);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((qlc) obj).getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.mma_post_match_voting_chat_view, viewGroup, false);
        int i2 = R.id.background;
        View B = nq8.B(R.id.background, inflate);
        if (B != null) {
            i2 = R.id.draw_label;
            View B2 = nq8.B(R.id.draw_label, inflate);
            if (B2 != null) {
                jlc a = jlc.a(B2);
                i2 = R.id.logo_fighter_first;
                ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.logo_fighter_first, inflate);
                if (shapeableImageView != null) {
                    i2 = R.id.logo_fighter_second;
                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) nq8.B(R.id.logo_fighter_second, inflate);
                    if (shapeableImageView2 != null) {
                        i2 = R.id.progress_view_first;
                        View B3 = nq8.B(R.id.progress_view_first, inflate);
                        if (B3 != null) {
                            i2 = R.id.progress_view_second;
                            View B4 = nq8.B(R.id.progress_view_second, inflate);
                            if (B4 != null) {
                                i2 = R.id.text_fighter_name_first;
                                TextView textView = (TextView) nq8.B(R.id.text_fighter_name_first, inflate);
                                if (textView != null) {
                                    i2 = R.id.text_fighter_name_second;
                                    TextView textView2 = (TextView) nq8.B(R.id.text_fighter_name_second, inflate);
                                    if (textView2 != null) {
                                        i2 = R.id.text_vote;
                                        TextView textView3 = (TextView) nq8.B(R.id.text_vote, inflate);
                                        if (textView3 != null) {
                                            i2 = R.id.text_vote_result_first;
                                            TextView textView4 = (TextView) nq8.B(R.id.text_vote_result_first, inflate);
                                            if (textView4 != null) {
                                                i2 = R.id.text_vote_result_second;
                                                TextView textView5 = (TextView) nq8.B(R.id.text_vote_result_second, inflate);
                                                if (textView5 != null) {
                                                    i2 = R.id.text_vs;
                                                    if (((TextView) nq8.B(R.id.text_vs, inflate)) != null) {
                                                        i2 = R.id.title;
                                                        TextView textView6 = (TextView) nq8.B(R.id.title, inflate);
                                                        if (textView6 != null) {
                                                            i2 = R.id.win_marker_away;
                                                            View B5 = nq8.B(R.id.win_marker_away, inflate);
                                                            if (B5 != null) {
                                                                lsc a2 = lsc.a(B5);
                                                                i2 = R.id.win_marker_home;
                                                                View B6 = nq8.B(R.id.win_marker_home, inflate);
                                                                if (B6 != null) {
                                                                    return new vh(this, new sc((ConstraintLayout) inflate, B, a, shapeableImageView, shapeableImageView2, B3, B4, textView, textView2, textView3, textView4, textView5, textView6, a2, lsc.a(B6)));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
