package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.results.R;
import com.sofascore.results.event.commentary.CommentaryGoalModal;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b43 extends g7 {
    public final /* synthetic */ CommentaryGoalModal l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b43(CommentaryGoalModal commentaryGoalModal) {
        super(r1);
        this.l = commentaryGoalModal;
        Context requireContext = commentaryGoalModal.requireContext();
        requireContext.getClass();
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return ((f43) obj) instanceof e43;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        f43 f43Var = (f43) obj;
        f43Var.getClass();
        if (f43Var instanceof d43) {
            return 0;
        }
        if (f43Var instanceof e43) {
            return 1;
        }
        if (f43Var instanceof c43) {
            return 2;
        }
        zzl.b();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        CommentaryGoalModal commentaryGoalModal = this.l;
        if (i == 0) {
            View inflate = commentaryGoalModal.getLayoutInflater().inflate(R.layout.commentary_goal_modal_header, viewGroup, false);
            if (inflate != null) {
                return new wh(new u22((TextView) inflate, 1), (char) 0);
            }
            yhk.s("rootView");
            return null;
        }
        if (i == 2) {
            View inflate2 = commentaryGoalModal.getLayoutInflater().inflate(R.layout.commentary_goal_modal_icon_info, viewGroup, false);
            if (inflate2 != null) {
                return new wh(new u22((TextView) inflate2, 2), 0);
            }
            yhk.s("rootView");
            return null;
        }
        View inflate3 = commentaryGoalModal.getLayoutInflater().inflate(R.layout.commentary_goal_modal_item, viewGroup, false);
        int i2 = R.id.divider;
        MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate3);
        if (materialDivider != null) {
            i2 = R.id.goal_info;
            TextView textView = (TextView) nq8.B(R.id.goal_info, inflate3);
            if (textView != null) {
                i2 = R.id.guideline;
                if (((Guideline) nq8.B(R.id.guideline, inflate3)) != null) {
                    i2 = R.id.player_image;
                    ImageView imageView = (ImageView) nq8.B(R.id.player_image, inflate3);
                    if (imageView != null) {
                        i2 = R.id.player_name;
                        TextView textView2 = (TextView) nq8.B(R.id.player_name, inflate3);
                        if (textView2 != null) {
                            i2 = R.id.scorer_assist_label;
                            TextView textView3 = (TextView) nq8.B(R.id.scorer_assist_label, inflate3);
                            if (textView3 != null) {
                                i2 = R.id.team_image;
                                ImageView imageView2 = (ImageView) nq8.B(R.id.team_image, inflate3);
                                if (imageView2 != null) {
                                    return new vh(commentaryGoalModal, new v82((ViewGroup) inflate3, (View) materialDivider, textView, imageView, textView2, (View) textView3, (View) imageView2, 3));
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i2)));
        return null;
    }
}
