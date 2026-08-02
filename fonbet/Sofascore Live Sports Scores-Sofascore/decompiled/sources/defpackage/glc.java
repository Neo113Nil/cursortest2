package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.blaze.blazesdk.analytics.enums.ThumbnailFormat;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.results.R;
import com.sofascore.results.mma.postMatchVoting.MmaPostMatchVotingMotionViewDialog;
import defpackage.jul;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class glc implements View.OnClickListener {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ glc(int i, jul julVar, jul.a aVar, ipm ipmVar) {
        this.b = i;
        this.c = julVar;
        this.d = aVar;
        this.e = ipmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                MmaEvent mmaEvent = (MmaEvent) obj2;
                Context context = ((vh) obj3).b;
                final y51 y51Var = new y51((hlc) obj, mmaEvent, i2, 7);
                context.getClass();
                mmaEvent.getClass();
                final AlertDialog h = lnb.h(R.style.RedesignDialog, context);
                final fsf fsfVar = new fsf();
                View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_mma_vote, (ViewGroup) null, false);
                MmaPostMatchVotingMotionViewDialog mmaPostMatchVotingMotionViewDialog = (MmaPostMatchVotingMotionViewDialog) nq8.B(R.id.motion_view, inflate);
                if (mmaPostMatchVotingMotionViewDialog == null) {
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.motion_view)));
                    break;
                } else {
                    s1 s1Var = new s1(6, h, fsfVar);
                    mmaPostMatchVotingMotionViewDialog.o = new j4(4, h, fsfVar);
                    mmaPostMatchVotingMotionViewDialog.o(mmaEvent, s1Var, true);
                    h.setView((LinearLayout) inflate);
                    h.setCanceledOnTouchOutside(false);
                    h.setButton(-2, context.getString(R.string.cancel), new i0(h, 8));
                    h.setButton(-1, context.getString(R.string.submit), new DialogInterface.OnClickListener() { // from class: yn
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            MmaPostMatchVotingOptions mmaPostMatchVotingOptions = (MmaPostMatchVotingOptions) fsf.this.a;
                            if (mmaPostMatchVotingOptions != null) {
                                y51Var.invoke(mmaPostMatchVotingOptions);
                            }
                            h.dismiss();
                        }
                    });
                    h.setOnShowListener(new dn(h, 1));
                    h.show();
                    break;
                }
            case 1:
                p8 p8Var = (p8) obj2;
                ct8 ct8Var = (ct8) ((ejg) obj3).d;
                if (ct8Var != null) {
                    View view2 = p8Var.itemView;
                    view2.getClass();
                    ct8Var.invoke(view2, Integer.valueOf(i2), obj);
                    break;
                }
                break;
            default:
                jul.a aVar = (jul.a) obj2;
                ipm ipmVar = (ipm) obj;
                int i3 = jul.a.g;
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.blaze_anim_click));
                aVar.d.invoke(ipmVar, i2 == ((jul) obj3).k ? ThumbnailFormat.ANIMATED : ThumbnailFormat.STATIC);
                break;
        }
    }

    public /* synthetic */ glc(vh vhVar, MmaEvent mmaEvent, hlc hlcVar, int i) {
        this.c = vhVar;
        this.d = mmaEvent;
        this.e = hlcVar;
        this.b = i;
    }

    public /* synthetic */ glc(ejg ejgVar, p8 p8Var, int i, Object obj) {
        this.c = ejgVar;
        this.d = p8Var;
        this.b = i;
        this.e = obj;
    }
}
