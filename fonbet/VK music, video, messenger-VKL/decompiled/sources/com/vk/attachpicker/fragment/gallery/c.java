package com.vk.attachpicker.fragment.gallery;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.b;
import com.vk.attachpicker.fragment.gallery.FastScroller;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.imageloader.ImageScreenSize;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.am9;
import xsna.b4t;
import xsna.bpn0;
import xsna.c5g;
import xsna.cqm0;
import xsna.dkg;
import xsna.e3m;
import xsna.ey50;
import xsna.gv3;
import xsna.iah0;
import xsna.itg0;
import xsna.izs;
import xsna.j6e;
import xsna.mcr0;
import xsna.n44;
import xsna.ny10;
import xsna.pbk;
import xsna.pvo0;
import xsna.qlq;
import xsna.r3t;
import xsna.r3u0;
import xsna.s3q0;
import xsna.t4t;
import xsna.t5m;
import xsna.u3p0;
import xsna.vam;
import xsna.ww50;
import xsna.xne0;
import xsna.z4f;

/* compiled from: GalleryFragmentSelectionConfigurator.kt */
/* loaded from: classes15.dex */
public final class c {
    public final GalleryFragmentImpl a;
    public final t4t b;
    public final z4f c;
    public final b4t d;
    public Pair<Integer, Boolean> e;
    public final u3p0 f;
    public final List<? extends r3u0> g;
    public final StoryCameraParams h;
    public final izs<List<? extends MediaStoreEntry>, s3q0> i;
    public FastScroller j;
    public boolean k;
    public final am9 l;
    public boolean m;
    public final Handler n;

    /* compiled from: GalleryFragmentSelectionConfigurator.kt */
    public static final class a implements FastScroller.a {
        public final /* synthetic */ GalleryRecyclerView a;
        public final /* synthetic */ PhotoSmallAdapter b;

        public a(GalleryRecyclerView galleryRecyclerView, PhotoSmallAdapter photoSmallAdapter) {
            this.a = galleryRecyclerView;
            this.b = photoSmallAdapter;
        }

        @Override // com.vk.attachpicker.fragment.gallery.FastScroller.a
        public final String f(int i) {
            int spanCount = i - (i % this.a.getSpanCount());
            PhotoSmallAdapter photoSmallAdapter = this.b;
            if (spanCount < photoSmallAdapter.K0()) {
                spanCount = photoSmallAdapter.K0();
            }
            if (spanCount > photoSmallAdapter.E0() - 1) {
                return "";
            }
            Object c = photoSmallAdapter.c.c(spanCount);
            MediaStoreEntry mediaStoreEntry = c instanceof MediaStoreEntry ? (MediaStoreEntry) c : null;
            return mediaStoreEntry == null ? "" : pvo0.j(mediaStoreEntry.d() * 1000, false, false);
        }
    }

    /* compiled from: GalleryFragmentSelectionConfigurator.kt */
    public static final class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    int x = linearLayoutManager.x();
                    c cVar = c.this;
                    if (x > cVar.e.i().intValue()) {
                        cVar.e = new Pair<>(Integer.valueOf(x), Boolean.valueOf(cVar.k));
                    }
                }
            }
        }
    }

    public c(GalleryFragmentImpl galleryFragmentImpl, t4t t4tVar, z4f z4fVar, b4t b4tVar, Pair pair, u3p0 u3p0Var, xne0 xne0Var, r3t r3tVar, List list, StoryCameraParams storyCameraParams, izs izsVar) {
        String str;
        this.a = galleryFragmentImpl;
        this.b = t4tVar;
        this.c = z4fVar;
        this.d = b4tVar;
        this.e = pair;
        this.f = u3p0Var;
        this.g = list;
        this.h = storyCameraParams;
        this.i = izsVar;
        am9 am9Var = new am9();
        am9Var.a.a = (storyCameraParams == null || (str = storyCameraParams.c) == null) ? null : cqm0.m(str);
        this.l = am9Var;
        this.m = true;
        this.n = new Handler(Looper.getMainLooper());
    }

    public final void a(View view, GalleryRecyclerView galleryRecyclerView, PhotoSmallAdapter photoSmallAdapter) {
        FastScroller fastScroller = (FastScroller) view.findViewById(R.id.fast_scroller);
        galleryRecyclerView.getRecyclerView().setVerticalScrollBarEnabled(false);
        TextView textView = (TextView) view.findViewById(R.id.section_title_popup);
        textView.setVisibility(0);
        fastScroller.setVisibility(0);
        RecyclerView recyclerView = galleryRecyclerView.getRecyclerView();
        fastScroller.f = recyclerView;
        textView.setVisibility(8);
        fastScroller.g = textView;
        recyclerView.addOnScrollListener(fastScroller.u);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new qlq(fastScroller));
        }
        fastScroller.setShowPopupAnimator(new j6e(this, 29));
        fastScroller.setShowPopupShortAnimator(new dkg(this, 18));
        fastScroller.setExternalProvider(new a(galleryRecyclerView, photoSmallAdapter));
        this.j = fastScroller;
        galleryRecyclerView.getRecyclerView().addOnScrollListener(new b());
    }

    public final void b(Intent intent) {
        String str;
        MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint;
        String str2;
        String str3;
        this.l.c(StoryPublishEvent.CLOSE_GALLERY, new vam(this, 12));
        Bundle bundleExtra = intent.getBundleExtra("result_attachments");
        if (bundleExtra == null) {
            return;
        }
        Iterable parcelableArrayList = bundleExtra.getParcelableArrayList("result_files");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        Iterable<Uri> iterable = parcelableArrayList;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (Uri uri : iterable) {
            arrayList.add(com.vk.core.files.a.G(uri) == 3 ? new StoryCameraGalleryData(uri, false, false, false, 12, null) : new StoryCameraGalleryData(uri, true, false, false, 12, null));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Bundle bundleExtra2 = intent.getBundleExtra("TRANSITION_BUNDLE");
        StoryCameraParams storyCameraParams = this.h;
        if (storyCameraParams == null || (str = storyCameraParams.b) == null) {
            str = "PHOTO_VIDEO_PICKER";
        }
        if (storyCameraParams == null || (str3 = storyCameraParams.c) == null || (creationEntryPoint = pbk.a(str3)) == null) {
            creationEntryPoint = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.NEW_STORY_AVATAR;
        }
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(str, creationEntryPoint);
        if (storyCameraParams != null) {
            aVar.b(storyCameraParams);
        }
        aVar.m0 = true;
        aVar.s0 = true;
        aVar.G = arrayList;
        GalleryFragmentImpl galleryFragmentImpl = this.a;
        Intent B = aVar.B(galleryFragmentImpl.kn(), true);
        LayoutInflater.Factory activity = galleryFragmentImpl.getActivity();
        String str4 = null;
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (Y == null || !Y.q(2241, B, galleryFragmentImpl)) {
            galleryFragmentImpl.startActivityForResult(B, 2241, bundleExtra2);
        }
        if (storyCameraParams != null && (str2 = storyCameraParams.c) != null) {
            str4 = cqm0.m(str2);
        }
        ny10.a(str4, arrayList);
    }

    public final void c(GalleryRecyclerView galleryRecyclerView, View view, int i, MediaStoreEntry mediaStoreEntry) {
        RecyclerView.o layoutManager = galleryRecyclerView.getRecyclerView().getLayoutManager();
        View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i) : null;
        Activity h = e3m.h(view.getContext());
        Integer valueOf = h != null ? Integer.valueOf(iah0.h(h, false)) : null;
        bpn0 bpn0Var = t5m.a;
        String str = Build.MANUFACTURER;
        boolean equalsIgnoreCase = "huawei".equalsIgnoreCase(str);
        t4t t4tVar = this.b;
        Bundle bundle = (equalsIgnoreCase || ("Honor".equalsIgnoreCase(str) && (valueOf == null || valueOf.intValue() == 0)) || findViewByPosition == null || !t4tVar.E.e || h == null) ? null : ActivityOptions.makeSceneTransitionAnimation(h, findViewByPosition, "gridItem").toBundle();
        this.m = false;
        this.n.postDelayed(new n44(this, 3), 1000L);
        Intent b2 = b.a.b(mediaStoreEntry);
        if (!t4tVar.E.e || h == null) {
            this.a.Mf(-1, b2);
            return;
        }
        WeakReference<View> weakReference = StoryGalleryActivity.F;
        StoryGalleryActivity.F = new WeakReference<>(findViewByPosition);
        b2.putExtra("TRANSITION_BUNDLE", bundle);
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_ANIM_OPTIMIZATION;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            itg0.j(mcr0.r(mediaStoreEntry.f(), ImageScreenSize.VERY_BIG, null), new gv3(26), 1);
        }
        b(b2);
    }
}
