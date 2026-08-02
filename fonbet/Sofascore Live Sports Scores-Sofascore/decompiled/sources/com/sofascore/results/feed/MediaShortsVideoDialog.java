package com.sofascore.results.feed;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseFullScreenDialog;
import com.sofascore.results.feed.MediaShortsVideoDialog;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import defpackage.cp;
import defpackage.k13;
import defpackage.krk;
import defpackage.mqi;
import defpackage.ncc;
import defpackage.nq8;
import defpackage.occ;
import defpackage.qfh;
import defpackage.wrf;
import defpackage.yhk;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/feed/MediaShortsVideoDialog;", "Lcom/sofascore/results/dialog/BaseFullScreenDialog;", "Locc;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaShortsVideoDialog extends BaseFullScreenDialog<occ> {
    public boolean A;
    public final mqi v;
    public final mqi w;
    public final mqi x;
    public long y = System.currentTimeMillis();
    public int z;

    public MediaShortsVideoDialog() {
        final int i = 0;
        this.v = ypa.b(new Function0(this) { // from class: mcc
            public final /* synthetic */ MediaShortsVideoDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MediaShortsVideoDialog mediaShortsVideoDialog = this.b;
                switch (i2) {
                    case 0:
                        return gz8.L(mediaShortsVideoDialog.requireArguments(), "YT_SHORT_VIDEOS", ShortVideoFeedCardModel.class);
                    case 1:
                        return mediaShortsVideoDialog.requireArguments().getString("CLICKED_SHORT_URL");
                    default:
                        Context requireContext = mediaShortsVideoDialog.requireContext();
                        requireContext.getClass();
                        g6b lifecycle = mediaShortsVideoDialog.getLifecycle();
                        lifecycle.getClass();
                        return new qfh(requireContext, lifecycle);
                }
            }
        });
        final int i2 = 1;
        this.w = ypa.b(new Function0(this) { // from class: mcc
            public final /* synthetic */ MediaShortsVideoDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MediaShortsVideoDialog mediaShortsVideoDialog = this.b;
                switch (i22) {
                    case 0:
                        return gz8.L(mediaShortsVideoDialog.requireArguments(), "YT_SHORT_VIDEOS", ShortVideoFeedCardModel.class);
                    case 1:
                        return mediaShortsVideoDialog.requireArguments().getString("CLICKED_SHORT_URL");
                    default:
                        Context requireContext = mediaShortsVideoDialog.requireContext();
                        requireContext.getClass();
                        g6b lifecycle = mediaShortsVideoDialog.getLifecycle();
                        lifecycle.getClass();
                        return new qfh(requireContext, lifecycle);
                }
            }
        });
        final int i3 = 2;
        this.x = ypa.b(new Function0(this) { // from class: mcc
            public final /* synthetic */ MediaShortsVideoDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MediaShortsVideoDialog mediaShortsVideoDialog = this.b;
                switch (i22) {
                    case 0:
                        return gz8.L(mediaShortsVideoDialog.requireArguments(), "YT_SHORT_VIDEOS", ShortVideoFeedCardModel.class);
                    case 1:
                        return mediaShortsVideoDialog.requireArguments().getString("CLICKED_SHORT_URL");
                    default:
                        Context requireContext = mediaShortsVideoDialog.requireContext();
                        requireContext.getClass();
                        g6b lifecycle = mediaShortsVideoDialog.getLifecycle();
                        lifecycle.getClass();
                        return new qfh(requireContext, lifecycle);
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ArrayList arrayList = (ArrayList) this.v.getValue();
        List H0 = arrayList != null ? CollectionsKt.H0(arrayList, new cp(this, 23)) : null;
        ncc nccVar = new ncc(this, H0);
        occ occVar = (occ) this.s;
        mqi mqiVar = this.x;
        if (occVar != null) {
            ViewPager2 viewPager2 = occVar.b;
            viewPager2.a(nccVar);
            viewPager2.setAdapter((qfh) mqiVar.getValue());
            viewPager2.setOffscreenPageLimit(2);
            RecyclerView c = wrf.c(viewPager2);
            if (c != null) {
                RecyclerView c2 = wrf.c(viewPager2);
                if (c2 != null) {
                    c2.setItemAnimator(null);
                }
                RecyclerView c3 = wrf.c(viewPager2);
                if (c3 != null) {
                    c3.setNestedScrollingEnabled(false);
                }
                RecyclerView c4 = wrf.c(viewPager2);
                if (c4 != null) {
                    c4.setOverScrollMode(2);
                }
                c.setClipToPadding(false);
                c.setClipChildren(false);
            }
        }
        if (H0 != null) {
            qfh qfhVar = (qfh) mqiVar.getValue();
            ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                String str = ((ShortVideoFeedCardModel) it.next()).l;
                if (str == null) {
                    str = "";
                }
                arrayList2.add(str);
            }
            qfhVar.F(arrayList2);
        }
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "YoutubeShortsModal";
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final krk s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.media_shorts_video_dialog, viewGroup, false);
        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.shorts_view_pager, inflate);
        if (viewPager2 != null) {
            return new occ((FrameLayout) inflate, viewPager2);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.shorts_view_pager)));
        return null;
    }
}
