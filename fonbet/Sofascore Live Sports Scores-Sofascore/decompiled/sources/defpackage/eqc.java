package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.results.R;
import com.sofascore.results.mma.postMatchVoting.MmaPostMatchVotingMotionViewDetails;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eqc extends h6b {
    public final ez0 d;
    public int e;
    public int f;
    public MmaPostMatchVotingOptions g;
    public yda h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqc(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.motion_view;
        MmaPostMatchVotingMotionViewDetails mmaPostMatchVotingMotionViewDetails = (MmaPostMatchVotingMotionViewDetails) nq8.B(R.id.motion_view, root);
        if (mmaPostMatchVotingMotionViewDetails != null) {
            i = R.id.text_discuss;
            TextView textView = (TextView) nq8.B(R.id.text_discuss, root);
            if (textView != null) {
                i = R.id.text_title;
                if (((TextView) nq8.B(R.id.text_title, root)) != null) {
                    i = R.id.text_voting_ended;
                    TextView textView2 = (TextView) nq8.B(R.id.text_voting_ended, root);
                    if (textView2 != null) {
                        this.d = new ez0((ConstraintLayout) root, mmaPostMatchVotingMotionViewDetails, textView, textView2, 26);
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        this.h = xw3.L(wca.x(u6bVar.getLifecycle()), z45.a, null, new gjb(u6bVar, this, null, 11), 2);
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        this.e = 0;
        yda ydaVar = this.h;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_post_match_voting_view;
    }
}
