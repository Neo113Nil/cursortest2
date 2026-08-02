package com.vk.clips.attachments.impl.views.video;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.clips.attachments.impl.views.video.a;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.movika.sdk.base.logic.processor.h;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.bl;
import xsna.bpn0;
import xsna.bwt0;
import xsna.by5;
import xsna.cq;
import xsna.e2t0;
import xsna.e43;
import xsna.g2t0;
import xsna.gko;
import xsna.gm50;
import xsna.gmf;
import xsna.hg;
import xsna.im0;
import xsna.izs;
import xsna.j5g;
import xsna.km50;
import xsna.kmf;
import xsna.mk50;
import xsna.mmf;
import xsna.nmf;
import xsna.o1e;
import xsna.oz50;
import xsna.p4g;
import xsna.pmf;
import xsna.q2s0;
import xsna.qp3;
import xsna.rmf;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.vds;
import xsna.vk50;
import xsna.vqu0;
import xsna.xn50;
import xsna.xqu0;

/* compiled from: ClipsVideoAttachmentPickerFragment.kt */
/* loaded from: classes16.dex */
public final class ClipsVideoAttachmentPickerFragment extends MviImplFragment<kmf, com.vk.clips.attachments.impl.views.video.b, com.vk.clips.attachments.impl.views.video.a> implements vds {
    public static final /* synthetic */ int W = 0;
    public final bpn0 Q = new bpn0(new h(this, 20));
    public final io.reactivex.rxjava3.disposables.b R = new io.reactivex.rxjava3.disposables.b();
    public final e2t0 S;
    public com.vk.lists.c T;
    public gmf U;
    public final boolean V;

    /* compiled from: ClipsVideoAttachmentPickerFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipsVideoAttachmentPickerFragment.kt */
    public static final class b {
        public final VkTopBar a;
        public final VkRecyclerPaginatedView b;
        public final VkButton c;
        public final VkText d;

        public b(View view) {
            this.a = (VkTopBar) view.findViewById(R.id.clips_video_attachment_top_bar);
            this.b = (VkRecyclerPaginatedView) view.findViewById(R.id.clips_video_attachment_recycler);
            this.c = (VkButton) view.findViewById(R.id.clips_video_attachment_done);
            this.d = (VkText) view.findViewById(R.id.clips_video_attachment_description);
        }
    }

    /* compiled from: ClipsVideoAttachmentPickerFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<com.vk.clips.attachments.impl.views.video.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.clips.attachments.impl.views.video.a aVar) {
            ClipsVideoAttachmentPickerFragment clipsVideoAttachmentPickerFragment = (ClipsVideoAttachmentPickerFragment) this.receiver;
            clipsVideoAttachmentPickerFragment.getClass();
            xn50.a.c(clipsVideoAttachmentPickerFragment, aVar);
            return s3q0.a;
        }
    }

    public ClipsVideoAttachmentPickerFragment() {
        boolean z;
        c cVar = new c(1, this, ClipsVideoAttachmentPickerFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        e2t0 e2t0Var = new e2t0();
        e2t0Var.y0(new g2t0(cVar));
        this.S = e2t0Var;
        if (BuildInfo.q()) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_ATTACH_VIDEO_SCREEN_TITLE;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                z = true;
                this.V = z;
            }
        }
        z = false;
        this.V = z;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.clips_video_attachment_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        b bVar = new b(view);
        e2t0 e2t0Var = this.S;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = bVar.b;
        vkRecyclerPaginatedView.setAdapter(e2t0Var);
        vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, vkRecyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        VkButton vkButton = bVar.c;
        vkButton.setEnabled(false);
        bwt0.i0(vkButton, new o1e(this, 3));
        bVar.a.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), tq.h(tlo0.Companion, R.string.vk_accessibility_back), new hg(this, 25), null, null, 56));
        vqu0 vqu0Var = new vqu0(new cq(7));
        xqu0 xqu0Var = new xqu0(new bl(this, 14));
        c.h hVar = new c.h(this.U);
        hVar.i = 10;
        hVar.o = vqu0Var;
        hVar.n = xqu0Var;
        this.T = f.a(hVar, vkRecyclerPaginatedView);
        vkRecyclerPaginatedView.getRecyclerView().addItemDecoration(new nmf());
        gm50.a.b(this, ((com.vk.clips.attachments.impl.views.video.b) ao50Var).a, new by5(7, this, bVar));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        UserId userId;
        kmf kmfVar = (kmf) vk50Var;
        qp3 qp3Var = new qp3(1, this, ClipsVideoAttachmentPickerFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 1);
        ClipsVideoAttachmentData fo = fo();
        if (fo == null || (userId = fo.d) == null) {
            userId = UserId.d;
        }
        this.U = new gmf(qp3Var, this.R, userId, new im0(kmfVar, 23));
        kmfVar.h.a(new mmf(this, 0), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, a.e.b);
        return true;
    }

    public final ClipsVideoAttachmentData fo() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (ClipsVideoAttachmentData) arguments.getParcelable("clips_video_attachment_video_data");
        }
        return null;
    }

    public final ArrayList<q2s0> go() {
        ArrayList<q2s0> arrayList = new ArrayList<>();
        boolean z = this.V;
        int i = z ? R.string.clips_video_attachment_title_attached_video : R.string.clips_video_attachment_title_downloaded;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        arrayList.add(new q2s0(-1, context.getString(i)));
        Context context2 = e43.a;
        p4g.a(new q2s0(-4, (context2 != null ? context2 : null).getString(R.string.clips_video_attachment_title_wall)), arrayList, !z);
        return arrayList;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.R.dispose();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        q2s0 q2s0Var;
        String str;
        Iterator<q2s0> it = go().iterator();
        while (true) {
            if (!it.hasNext()) {
                q2s0Var = null;
                break;
            }
            q2s0Var = it.next();
            q2s0 q2s0Var2 = q2s0Var;
            ClipsVideoAttachmentData fo = fo();
            if (fo != null) {
                int i = q2s0Var2.a;
                Integer num = fo.h;
                if (num != null && i == num.intValue()) {
                    break;
                }
            }
        }
        q2s0 q2s0Var3 = q2s0Var;
        if (q2s0Var3 == null) {
            q2s0Var3 = (q2s0) j5g.Y(go());
        }
        com.vk.clips.attachments.api.di.f fVar = (com.vk.clips.attachments.api.di.f) this.Q.getValue();
        ClipsVideoAttachmentData fo2 = fo();
        if (fo2 == null || (str = fo2.b) == null) {
            str = "";
        }
        ClipsVideoAttachmentData fo3 = fo();
        Boolean valueOf = fo3 != null ? Boolean.valueOf(fo3.c) : null;
        EmptyList emptyList = EmptyList.b;
        ClipsVideoAttachmentData fo4 = fo();
        String str2 = fo4 != null ? fo4.e : null;
        ClipsVideoAttachmentData fo5 = fo();
        String str3 = fo5 != null ? fo5.e : null;
        int i2 = q2s0Var3.a;
        String str4 = q2s0Var3.b;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_ATTACH_VIDEO;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        return new kmf(fVar, new pmf(new rmf(str, valueOf, emptyList, 0, str2, str3, null, i2, str4, bVar.a(videoFeatures) ? getString(R.string.clips_video_attachment_button_add_v2) : getString(R.string.clips_video_attachment_button_add), bVar.a(videoFeatures) ? getString(R.string.clips_video_attachment_description_chose_v2) : getString(R.string.clips_video_attachment_description_chose))));
    }
}
