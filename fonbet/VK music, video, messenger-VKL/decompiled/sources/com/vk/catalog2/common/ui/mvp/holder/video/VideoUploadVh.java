package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoUpload;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.progress.VideoProgressView;
import com.vk.libvideo.upload.api.VideoUpload;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.Collections;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.asu0;
import xsna.at;
import xsna.b5a;
import xsna.brj0;
import xsna.bwt0;
import xsna.dw20;
import xsna.e3m;
import xsna.evh0;
import xsna.f4m;
import xsna.fpf0;
import xsna.fxc0;
import xsna.g2u0;
import xsna.h03;
import xsna.lar;
import xsna.mwm0;
import xsna.pgn;
import xsna.pw40;
import xsna.qcy;
import xsna.s19;
import xsna.s9t0;
import xsna.vhs0;
import xsna.yei0;
import xsna.zyl0;

/* compiled from: VideoUploadVh.kt */
/* loaded from: classes16.dex */
public final class VideoUploadVh extends VideoItemVh {
    public static final /* synthetic */ qcy<Object>[] w;
    public View m;
    public TextView n;
    public TextView o;
    public TextView p;
    public VKImageView q;
    public View r;
    public VideoProgressView s;
    public TextView t;
    public final pgn u;
    public int v;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(VideoUploadVh.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        w = new qcy[]{mutablePropertyReference1Impl};
    }

    public VideoUploadVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(b5aVar, searchStatInfoProvider, fxc0.B(), null, null, null, null, null, 248);
        this.u = new pgn();
        this.v = -1;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        UIBlockVideoUpload uIBlockVideoUpload = uIBlock instanceof UIBlockVideoUpload ? (UIBlockVideoUpload) uIBlock : null;
        if (uIBlockVideoUpload == null) {
            return;
        }
        VideoUploadEvent videoUploadEvent = uIBlockVideoUpload.y;
        int i = this.v;
        VideoUpload videoUpload = videoUploadEvent.b;
        VideoUpload videoUpload2 = videoUploadEvent.b;
        if (i != videoUpload.b) {
            String str = videoUpload.c;
            TextView textView = this.t;
            if (textView == null) {
                textView = null;
            }
            f4m.j(textView);
            VKImageView vKImageView = this.q;
            if (vKImageView == null) {
                vKImageView = null;
            }
            vKImageView.clear();
            qcy<Object>[] qcyVarArr = w;
            qcy<Object> qcyVar = qcyVarArr[0];
            pgn pgnVar = this.u;
            io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
            if (cVar != null) {
                cVar.dispose();
            }
            s0 s0Var = new s0(new s19(str, 2));
            asu0 asu0Var = asu0.a;
            io.reactivex.rxjava3.disposables.c subscribe = s0Var.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new pw40(new vhs0(this, 4), 17));
            qcy<Object> qcyVar2 = qcyVarArr[0];
            pgnVar.b(subscribe);
        }
        this.v = videoUpload2.b;
        VideoProgressView videoProgressView = this.s;
        if (videoProgressView == null) {
            videoProgressView = null;
        }
        boolean z = videoUploadEvent instanceof VideoUploadEvent.Fail;
        videoProgressView.a(z ? s9t0.b.a : videoUploadEvent instanceof VideoUploadEvent.Progress ? new s9t0.d((int) (((VideoUploadEvent.Progress) videoUploadEvent).c * 100), true, true) : videoUploadEvent instanceof VideoUploadEvent.Start ? s9t0.e.a : s9t0.c.a);
        TextView textView2 = this.n;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(videoUpload2.f);
        if (videoUploadEvent instanceof VideoUploadEvent.Progress) {
            e(false);
            int i2 = (int) (((VideoUploadEvent.Progress) videoUploadEvent).c * 100);
            lar larVar = lar.a;
            long j = (i2 * videoUpload2.e) / 100;
            larVar.getClass();
            String a = lar.a(j);
            TextView textView3 = this.o;
            if (textView3 == null) {
                textView3 = null;
            }
            View view = this.m;
            Context context = (view != null ? view : null).getContext();
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append('%');
            textView3.setText(context.getString(R.string.video_upload_progress_item, sb.toString(), a));
            return;
        }
        if (videoUploadEvent instanceof VideoUploadEvent.Start) {
            e(false);
            TextView textView4 = this.o;
            if (textView4 == null) {
                textView4 = null;
            }
            View view2 = this.m;
            at.d(view2 != null ? view2 : null, R.string.video_upload_wait, textView4);
            return;
        }
        if (z) {
            TextView textView5 = this.p;
            if (textView5 == null) {
                textView5 = null;
            }
            View view3 = this.m;
            textView5.setText((view3 != null ? view3 : null).getContext().getString(h03.a(((VideoUploadEvent.Fail) videoUploadEvent).c) ? R.string.share_waiting_for_network : R.string.exo_upload_failed));
            e(true);
        }
    }

    public final void e(boolean z) {
        TextView textView = this.o;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, !z);
        TextView textView2 = this.p;
        bwt0.p0(textView2 != null ? textView2 : null, z);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [T, xsna.dw20] */
    public final void g() {
        View view = this.m;
        if (view == null) {
            view = null;
        }
        Activity h = e3m.h(view.getContext());
        if (h == null) {
            View view2 = this.m;
            if (view2 == null) {
                view2 = null;
            }
            h = g2u0.c(view2);
            if (h == null) {
                return;
            }
        }
        brj0 brj0Var = new brj0(0, R.drawable.vk_icon_cancel_outline_28, null, R.string.clips_accessibility_cancel_upload, null, true, false, null, 0, null, null, null, null, null, 130996);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new dw20.b(h, null).P(Collections.singletonList(brj0Var), new evh0(9, this, ref$ObjectRef)).I0(null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_video_upload_small_item, viewGroup, false);
        this.m = inflate;
        this.n = (TextView) inflate.findViewById(R.id.title);
        this.o = (TextView) inflate.findViewById(R.id.subtitle);
        this.p = (TextView) inflate.findViewById(R.id.error);
        this.q = (VKImageView) inflate.findViewById(R.id.photo);
        View findViewById = inflate.findViewById(R.id.options);
        this.r = findViewById;
        bwt0.i0(findViewById, new zyl0(this, 19));
        VideoProgressView videoProgressView = (VideoProgressView) inflate.findViewById(R.id.download_view);
        this.s = videoProgressView;
        videoProgressView.setOnRetryClickListener(new yei0(this, 25));
        VideoProgressView videoProgressView2 = this.s;
        if (videoProgressView2 == null) {
            videoProgressView2 = null;
        }
        videoProgressView2.setOnCancelClickListener(new mwm0(this, 16));
        this.t = (TextView) inflate.findViewById(R.id.video_preview_ts);
        float a = e3m.a(R.dimen.small_video_corner_radius, layoutInflater.getContext());
        this.k = a;
        VKImageView vKImageView = this.q;
        bwt0.d(vKImageView != null ? vKImageView : null, a, (r4 & 2) != 0, (r4 & 4) != 0);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
