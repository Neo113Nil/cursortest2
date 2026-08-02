package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.hfz;
import xsna.j4r0;
import xsna.j5g;
import xsna.j79;
import xsna.p1u0;
import xsna.q8i0;
import xsna.qrp;
import xsna.tw4;
import xsna.ujm0;
import xsna.vfz;
import xsna.vh8;
import xsna.y4r0;
import xsna.ype0;
import xsna.zpe0;

/* compiled from: UxPollEntryPointDelegate.kt */
/* loaded from: classes2.dex */
public final class e0 extends p1u0<AboutVideoItem.b0> {
    public static final int d = cn70.b(16);
    public static final int e = cn70.b(24);
    public static final int f = cn70.b(16);
    public static final float g = cn70.c(16);
    public static final int h = cn70.b(52);
    public final y4r0 a;
    public UxPollEntryPoint b;
    public FrameLayout c;

    /* compiled from: UxPollEntryPointDelegate.kt */
    public final class a extends vfz<AboutVideoItem.b0> {
        public final ViewGroup l;
        public View m;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r0);
            Context context = viewGroup.getContext();
            FrameLayout frameLayout = new FrameLayout(context);
            int i = e0.h;
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i, i));
            f4m.m(8388661, frameLayout);
            bwt0.i0(frameLayout, new q8i0(e0.this, 17));
            frameLayout.setContentDescription(frameLayout.getResources().getString(R.string.accessibility_close));
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            imageView.setImageDrawable(dhr0.t.b(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary));
            f4m.m(17, imageView);
            frameLayout.addView(imageView);
            bwt0.p0(frameLayout, false);
            e0.this.c = frameLayout;
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            frameLayout2.setBackgroundColor(e3m.f(R.attr.vk_ui_background_modal, context));
            int i2 = e0.f;
            bwt0.e0(frameLayout2, i2, i2, i2, i2);
            bwt0.d(frameLayout2, e0.g, (r4 & 2) != 0, (r4 & 4) != 0);
            frameLayout2.addView(e0.this.c);
            bwt0.p0(frameLayout2, false);
            View view = this.itemView;
            this.l = view instanceof ViewGroup ? (ViewGroup) view : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.b0 b0Var) {
            j79 a;
            ViewGroup viewGroup;
            View view;
            UxPollEntryPoint uxPollEntryPoint = b0Var.b;
            e0 e0Var = e0.this;
            y4r0 y4r0Var = e0Var.a;
            if (y4r0Var == null || (a = y4r0Var.a()) == null || (viewGroup = this.l) == null) {
                return;
            }
            e0Var.b = uxPollEntryPoint;
            Context context = this.itemView.getContext();
            qrp qrpVar = new qrp(context, uxPollEntryPoint, (ujm0) ((vh8) a.b).b);
            PollQuestion pollQuestion = (PollQuestion) j5g.a0(uxPollEntryPoint.b.d);
            if (pollQuestion == null) {
                pollQuestion = qrp.e;
            }
            j4r0 j4r0Var = new j4r0(pollQuestion);
            j4r0Var.b = context;
            j4r0Var.c = new tw4(1, qrpVar, qrp.class, "onEntryPointPollAction", "onEntryPointPollAction(Lcom/vk/video/polls/ui/questions/PollUiAction;)V", 0, 8);
            zpe0.a.C4194a c4194a = zpe0.a.C4194a.a;
            UxPollEntryPointLocation.a aVar = UxPollEntryPointLocation.Companion;
            UxPollEntryPointLocation uxPollEntryPointLocation = uxPollEntryPoint.c;
            aVar.getClass();
            ype0 d = j4r0Var.d(new zpe0(c4194a, UxPollEntryPointLocation.a.a(uxPollEntryPointLocation)));
            qrpVar.d = (ViewGroup) d;
            if (pollQuestion instanceof PollQuestion.Grade) {
                ConstraintLayout constraintLayout = new ConstraintLayout(context);
                constraintLayout.setLayoutParams(new ConstraintLayout.b(-1, -1));
                constraintLayout.addView(d.getUiView());
                view = constraintLayout;
            } else {
                view = d.getUiView();
            }
            if (view != null) {
                viewGroup.removeView(this.m);
                bwt0.p0(viewGroup, false);
                FrameLayout frameLayout = e0Var.c;
                if (frameLayout != null) {
                    bwt0.p0(frameLayout, false);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.topMargin = e0.d;
                layoutParams.bottomMargin = e0.e;
                view.setLayoutParams(layoutParams);
                bwt0.p0(viewGroup, true);
                FrameLayout frameLayout2 = e0Var.c;
                if (frameLayout2 != null) {
                    bwt0.p0(frameLayout2, true);
                }
                viewGroup.addView(view);
                this.m = view;
            }
            y4r0Var.b().a(uxPollEntryPoint, true, false);
        }
    }

    public e0(y4r0 y4r0Var) {
        this.a = y4r0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.b0> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.b0;
    }
}
