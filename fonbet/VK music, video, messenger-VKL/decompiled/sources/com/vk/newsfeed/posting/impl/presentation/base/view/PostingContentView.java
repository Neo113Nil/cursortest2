package com.vk.newsfeed.posting.impl.presentation.base.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerSize;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$MediaPicker$Album$SelectAlbum;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.a1u0;
import xsna.a4d0;
import xsna.ahc0;
import xsna.asp;
import xsna.bpr;
import xsna.bv9;
import xsna.bwt0;
import xsna.ce6;
import xsna.cpc0;
import xsna.enc0;
import xsna.ezw;
import xsna.f5z;
import xsna.fmc0;
import xsna.fsk;
import xsna.gm50;
import xsna.gzs;
import xsna.h0c0;
import xsna.hg10;
import xsna.hvz;
import xsna.j5g;
import xsna.kdg0;
import xsna.l0l0;
import xsna.mgu;
import xsna.mps0;
import xsna.msy;
import xsna.nv9;
import xsna.odc0;
import xsna.pba;
import xsna.pbq;
import xsna.pcc0;
import xsna.qhh0;
import xsna.qor;
import xsna.s3d0;
import xsna.smc0;
import xsna.vdc0;
import xsna.wpc0;
import xsna.xai0;
import xsna.xd40;
import xsna.y1q0;
import xsna.ykw;
import xsna.z1h0;
import xsna.zai0;
import xsna.zjc0;
import xsna.zrp;

/* compiled from: PostingContentView.kt */
/* loaded from: classes4.dex */
public final class PostingContentView implements gm50, smc0 {
    public final Context b;
    public final PostingFragment c;
    public final PostingFragment.e d;
    public final xd40 e;
    public final kdg0 f;
    public final cpc0 g;
    public final PostingFragment h;
    public final FrameLayout i;
    public final View j;
    public final ComposeView k;
    public final l0l0 l;
    public final enc0 m;
    public final Object n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostingContentView.kt */
    public static final class PostingStep {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostingStep[] $VALUES;
        public static final PostingStep One;
        public static final PostingStep Other;

        static {
            PostingStep postingStep = new PostingStep("One", 0);
            One = postingStep;
            PostingStep postingStep2 = new PostingStep("Other", 1);
            Other = postingStep2;
            PostingStep[] postingStepArr = {postingStep, postingStep2};
            $VALUES = postingStepArr;
            $ENTRIES = new asp(postingStepArr);
        }

        public PostingStep() {
            throw null;
        }

        public static PostingStep valueOf(String str) {
            return (PostingStep) Enum.valueOf(PostingStep.class, str);
        }

        public static PostingStep[] values() {
            return (PostingStep[]) $VALUES.clone();
        }
    }

    public PostingContentView(Context context, Bundle bundle, ezw ezwVar, PostingFragment postingFragment, PostingFragment.e eVar, PostingFragment.f fVar, xd40 xd40Var, kdg0 kdg0Var, y1q0 y1q0Var, hvz hvzVar, cpc0 cpc0Var) {
        this.b = context;
        this.c = postingFragment;
        this.d = eVar;
        this.e = xd40Var;
        this.f = kdg0Var;
        this.g = cpc0Var;
        this.h = postingFragment;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.posting_content_fragment_drafts, (ViewGroup) null);
        this.i = frameLayout;
        View findViewById = frameLayout.findViewById(R.id.posting_step_1_content);
        this.j = findViewById;
        this.k = (ComposeView) frameLayout.findViewById(R.id.posting_other_steps_compose_view);
        this.l = new l0l0(postingFragment, new pba(1, this, PostingContentView.class, "onRenderUpdated", "onRenderUpdated(Lcom/vk/newsfeed/posting/impl/presentation/model/PostingViewStateRender;)V", 0, 8));
        this.m = new enc0(postingFragment, findViewById, ezwVar, bundle, eVar, fVar, kdg0Var, y1q0Var, hvzVar, cpc0Var);
        this.n = msy.a(LazyThreadSafetyMode.NONE, new odc0(this, 0));
    }

    public static final void a(PostingContentView postingContentView, wpc0 wpc0Var) {
        ComposeView composeView = postingContentView.k;
        View view = postingContentView.j;
        if ((wpc0Var instanceof wpc0.c) || (wpc0Var instanceof wpc0.a.b)) {
            bwt0.p0(view, true);
            bwt0.p0(composeView, false);
        } else {
            bwt0.p0(view, false);
            bwt0.p0(composeView, true);
        }
    }

    public final void b() {
        enc0 enc0Var = this.m;
        LocalAlbum localAlbum = (LocalAlbum) j5g.a0(enc0Var.X);
        if (localAlbum == null) {
            return;
        }
        enc0Var.g(MediaPickerState.Tab.LocalAlbum);
        ahc0 ahc0Var = enc0Var.V;
        if (ahc0Var != null) {
            int size = ahc0Var.s.size();
            for (int i = 0; i < size; i++) {
                z1h0 F0 = ahc0Var.F0(i);
                qhh0 qhh0Var = F0 instanceof qhh0 ? (qhh0) F0 : null;
                if (qhh0Var != null) {
                    qhh0Var.s();
                }
            }
        }
        enc0Var.U.invoke(new PostingAction$MediaPicker$Album$SelectAlbum(localAlbum.b, 0, 2, null));
    }

    public final void c(vdc0 vdc0Var) {
        h0c0 h0c0Var = this.m.p;
        pcc0 pcc0Var = h0c0Var.g;
        if (pcc0Var != null) {
            pcc0Var.P0(vdc0Var);
        }
        if (pcc0Var != null) {
            PhotoVideoDisplayMode photoVideoDisplayMode = h0c0Var.f.b;
            a4d0 a4d0Var = pcc0Var.n.g;
            if (a4d0Var != null) {
                qor qorVar = a4d0Var.J;
                boolean z = photoVideoDisplayMode == PhotoVideoDisplayMode.Grid;
                a4d0Var.N.c = !z;
                boolean z2 = qorVar.g != z;
                qorVar.g = z;
                fsk fskVar = qorVar.k;
                gzs<s3d0> gzsVar = qorVar.f;
                fskVar.getClass();
                qorVar.l = !z ? new nv9(gzsVar) : new mgu(gzsVar);
                if (z2) {
                    qorVar.removeAllViews();
                    bpr bprVar = qorVar.n;
                    qorVar.d(bprVar != null ? bprVar.b(qorVar) : EmptyList.b);
                }
                qorVar.requestLayout();
                qorVar.invalidate();
                bwt0.Q(qorVar, R.id.posting_ui_test_photo_video_display_mode_tag, photoVideoDisplayMode);
            }
        }
        if (pcc0Var != null) {
            boolean l = hg10.l(h0c0Var.f);
            a1u0.a aVar = new a1u0.a(l);
            pcc0Var.p = aVar;
            a4d0 a4d0Var2 = pcc0Var.n.g;
            if (a4d0Var2 != null) {
                pbq pbqVar = a4d0Var2.G;
                pbqVar.q = aVar;
                Iterator it = pbqVar.o.iterator();
                while (it.hasNext()) {
                    ce6 ce6Var = (ce6) it.next();
                    if (ce6Var instanceof ykw) {
                        ykw ykwVar = (ykw) ce6Var;
                        ykwVar.u = aVar;
                        zjc0 zjc0Var = ykwVar.t;
                        zjc0Var.b = aVar;
                        PreviewAttachmentWrapper previewAttachmentWrapper = zjc0Var.a;
                        previewAttachmentWrapper.setSpinnerSize(l ? PostingSpinnerSize.Regular : PostingSpinnerSize.Large);
                        previewAttachmentWrapper.setSpinnerScreen(!zjc0Var.b.a);
                    } else if (ce6Var instanceof mps0) {
                        mps0 mps0Var = (mps0) ce6Var;
                        mps0Var.f = aVar;
                        zjc0 zjc0Var2 = mps0Var.h;
                        zjc0Var2.b = aVar;
                        PreviewAttachmentWrapper previewAttachmentWrapper2 = zjc0Var2.a;
                        previewAttachmentWrapper2.setSpinnerSize(l ? PostingSpinnerSize.Regular : PostingSpinnerSize.Large);
                        previewAttachmentWrapper2.setSpinnerScreen(!zjc0Var2.b.a);
                    }
                }
            }
        }
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.h;
    }

    @Override // xsna.smc0
    public final void o6(fmc0 fmc0Var) {
        boolean z = fmc0Var instanceof fmc0.y.a;
        enc0 enc0Var = this.m;
        if (z) {
            enc0Var.c.post(new bv9(enc0Var, 10));
            return;
        }
        boolean z2 = fmc0Var instanceof fmc0.i.d;
        if (z2) {
            h0c0 h0c0Var = enc0Var.p;
            if (z2) {
                h0c0Var.c.invoke(new fmc0.i.b(h0c0Var.b(((fmc0.i.d) fmc0Var).a)));
                return;
            } else {
                h0c0Var.getClass();
                return;
            }
        }
        Integer num = null;
        int i = 0;
        if (!(fmc0Var instanceof fmc0.i.c)) {
            ahc0 ahc0Var = enc0Var.V;
            if (ahc0Var != null) {
                z1h0 H = ahc0Var.u.H("current_media_picker_fragment");
                smc0 smc0Var = H instanceof smc0 ? (smc0) H : null;
                if (smc0Var != null) {
                    smc0Var.o6(fmc0Var);
                }
                int size = ahc0Var.s.size();
                while (i < size) {
                    z1h0 F0 = ahc0Var.F0(i);
                    smc0 smc0Var2 = F0 instanceof smc0 ? (smc0) F0 : null;
                    if (smc0Var2 != null) {
                        smc0Var2.o6(fmc0Var);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        xai0 xai0Var = enc0Var.W;
        if (xai0Var != null) {
            int i2 = ((fmc0.i.c) fmc0Var).a;
            Iterator<T> it = xai0Var.getCurrentList().iterator();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i5 = i3 + 1;
                if (!(((zai0) it.next()).a instanceof MediaPickerSelectedItem.VkVideo)) {
                    if (i4 == i2) {
                        i = i3;
                        break;
                    }
                    i4++;
                }
                i3 = i5;
            }
            num = Integer.valueOf(i);
        }
        enc0Var.e.invoke(new fmc0.i.b(enc0Var.d(num)));
    }
}
