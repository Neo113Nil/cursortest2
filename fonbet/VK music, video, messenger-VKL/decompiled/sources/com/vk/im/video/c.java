package com.vk.im.video;

import android.app.Activity;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.attachments.impl.views.video.a;
import com.vk.clips.design.view.component.user.ClipUserView;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.network.kbh.state.NetworkState;
import com.vk.superapp.api.dto.story.actions.WebActionEmoji;
import com.vk.voip.ui.scheduled.creation.ui.settings.ui.state.VoipScheduledCallSettingsContentViewState$ScreenState$Item;
import xsna.as30;
import xsna.cvk;
import xsna.d6q0;
import xsna.enj;
import xsna.fh5;
import xsna.go9;
import xsna.h3t0;
import xsna.izs;
import xsna.j4w;
import xsna.l4w;
import xsna.ldp;
import xsna.n2t0;
import xsna.pl1;
import xsna.s3q0;
import xsna.uc;
import xsna.uei0;
import xsna.yg5;
import xsna.yxw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                l4w l4wVar = (l4w) this.c;
                as30.a aVar = (as30.a) this.d;
                fh5 fh5Var = l4wVar.A;
                if (fh5Var == null) {
                    fh5Var = null;
                }
                yg5 yg5Var = fh5Var.j;
                if (yg5Var == null) {
                    yg5Var = null;
                }
                if (!yg5Var.R0().h()) {
                    AttachVideo attachVideo = l4wVar.J;
                    if (attachVideo == null) {
                        attachVideo = null;
                    }
                    if (!attachVideo.M()) {
                        j4w j4wVar = l4wVar.K;
                        if (j4wVar == null) {
                            j4wVar = null;
                        }
                        if (!j4wVar.s()) {
                            ConstraintLayout constraintLayout = l4wVar.c;
                            if (constraintLayout == null) {
                                constraintLayout = null;
                            }
                            Activity b = enj.b(constraintLayout);
                            if (b != null) {
                                if (d6q0.t != NetworkState.UNSTABLE) {
                                    fh5 fh5Var2 = l4wVar.A;
                                    uc.o(fh5Var2 == null ? null : fh5Var2, b, false, null, null, null, 60);
                                    s3q0 s3q0Var = s3q0.a;
                                    break;
                                } else {
                                    cvk.t();
                                    break;
                                }
                            }
                        }
                    }
                    aVar.b();
                    break;
                }
                break;
            case 1:
                ((izs) this.c).invoke(((pl1) this.d).m);
                break;
            case 2:
                ClipUserView clipUserView = (ClipUserView) this.c;
                View.OnClickListener onClickListener = (View.OnClickListener) this.d;
                ClipUserView.d dVar = clipUserView.F;
                if (!dVar.a) {
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    }
                } else {
                    dVar.a = false;
                    break;
                }
                break;
            case 3:
                ldp ldpVar = (ldp) this.c;
                uei0 uei0Var = (uei0) this.d;
                String str = WebActionEmoji.d[ldpVar.getAbsoluteAdapterPosition()];
                uei0Var.l(go9.b("asset:///emoji/", str) + ".png", str);
                break;
            case 4:
                n2t0 n2t0Var = (n2t0) this.c;
                h3t0 h3t0Var = (h3t0) this.d;
                if (!n2t0Var.b) {
                    izs<com.vk.clips.attachments.impl.views.video.a, s3q0> izsVar = h3t0Var.l;
                    if (!n2t0Var.c) {
                        izsVar.invoke(a.f.b);
                        break;
                    } else {
                        izsVar.invoke(new a.C0549a(n2t0Var.a.a1()));
                        break;
                    }
                }
                break;
            default:
                ((yxw0) this.c).h6(((VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting) this.d).b);
                break;
        }
    }
}
