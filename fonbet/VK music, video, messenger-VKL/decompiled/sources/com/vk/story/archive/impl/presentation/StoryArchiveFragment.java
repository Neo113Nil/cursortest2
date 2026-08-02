package com.vk.story.archive.impl.presentation;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.i;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.archive.api.di.StoryArchiveComponent;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.archive.StoryArchiveFastScrollView;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.archive.impl.presentation.list.StoryArchiveRecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.bwt0;
import xsna.bx80;
import xsna.bxl0;
import xsna.cvk;
import xsna.cxl0;
import xsna.dhr0;
import xsna.e43;
import xsna.f4m;
import xsna.fj3;
import xsna.fpf0;
import xsna.gd1;
import xsna.gzs;
import xsna.hbj0;
import xsna.hj60;
import xsna.hxl0;
import xsna.iah0;
import xsna.ikv0;
import xsna.izi0;
import xsna.j5g;
import xsna.j6v;
import xsna.jai;
import xsna.jbs;
import xsna.k7m;
import xsna.lxl0;
import xsna.m33;
import xsna.m7m;
import xsna.msy;
import xsna.myd0;
import xsna.o25;
import xsna.oxl0;
import xsna.oz50;
import xsna.pwh0;
import xsna.qq2;
import xsna.rg50;
import xsna.s9p;
import xsna.spl0;
import xsna.too0;
import xsna.tsk0;
import xsna.vds;
import xsna.w8i;
import xsna.wh50;
import xsna.wzb0;
import xsna.zak0;
import xsna.zif0;

/* compiled from: StoryArchiveFragment.kt */
/* loaded from: classes6.dex */
public final class StoryArchiveFragment extends BaseMvpFragment<cxl0> implements too0, vds, w8i {
    public static final int h0 = iah0.a(3);
    public final bpn0 T = new bpn0(new hbj0(this, 6));
    public final bpn0 U = new bpn0(new pwh0(this, 9));
    public final bpn0 V = new bpn0(new hj60(this, 29));
    public final Object W;
    public final Object X;
    public StoryArchiveRecyclerPaginatedView Y;
    public StoryArchiveFastScrollView Z;
    public TextView a0;
    public boolean b0;
    public final Handler c0;
    public final rg50 d0;
    public final wh50 e0;
    public bxl0 f0;
    public final e g0;

    /* compiled from: StoryArchiveFragment.kt */
    public final class b {
        public b() {
        }
    }

    /* compiled from: StoryArchiveFragment.kt */
    public static final class c extends GridLayoutManager.c {
        public c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            bxl0 bxl0Var = StoryArchiveFragment.this.f0;
            if (bxl0Var == null) {
                bxl0Var = null;
            }
            return bxl0Var.c.c(i) instanceof lxl0 ? 1 : 3;
        }
    }

    /* compiled from: Handler.kt */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = StoryArchiveFragment.h0;
            StoryArchiveFragment.this.jo(true);
        }
    }

    /* compiled from: StoryArchiveFragment.kt */
    public static final class e extends RecyclerView.t {
        public int b;

        /* compiled from: Handler.kt */
        public static final class a implements Runnable {
            public final /* synthetic */ StoryArchiveFragment b;

            public a(StoryArchiveFragment storyArchiveFragment) {
                this.b = storyArchiveFragment;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i = StoryArchiveFragment.h0;
                this.b.jo(true);
            }
        }

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            StoryArchiveFragment storyArchiveFragment;
            StoryArchiveFastScrollView storyArchiveFastScrollView;
            if (i != 0 || (storyArchiveFastScrollView = (storyArchiveFragment = StoryArchiveFragment.this).Z) == null || storyArchiveFastScrollView.d) {
                return;
            }
            this.b = 0;
            storyArchiveFragment.c0.postDelayed(new a(storyArchiveFragment), 1000L);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            zif0 zif0Var;
            boolean z;
            TextView textView;
            StoryArchiveFragment storyArchiveFragment = StoryArchiveFragment.this;
            storyArchiveFragment.c0.removeCallbacksAndMessages(null);
            this.b = Math.abs(i2) + this.b;
            int s = ((GridLayoutManager) recyclerView.getLayoutManager()).s();
            bxl0 bxl0Var = storyArchiveFragment.f0;
            if (bxl0Var == null) {
                bxl0Var = null;
            }
            Object c = bxl0Var.c.c(s);
            while (true) {
                zif0Var = (zif0) c;
                z = zif0Var instanceof lxl0;
                if (!z) {
                    bxl0 bxl0Var2 = storyArchiveFragment.f0;
                    if (bxl0Var2 == null) {
                        bxl0Var2 = null;
                    }
                    if (s >= bxl0Var2.E0()) {
                        break;
                    }
                    bxl0 bxl0Var3 = storyArchiveFragment.f0;
                    if (bxl0Var3 == null) {
                        bxl0Var3 = null;
                    }
                    s++;
                    c = bxl0Var3.c.c(s);
                } else {
                    break;
                }
            }
            if (z && (textView = storyArchiveFragment.a0) != null) {
                textView.setText(((lxl0) zif0Var).b);
            }
            if (this.b > iah0.f().heightPixels / 2.0f) {
                if (!storyArchiveFragment.b0) {
                    TextView textView2 = storyArchiveFragment.a0;
                    if (textView2 == null) {
                        return;
                    } else {
                        textView2.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).setInterpolator(qq2.f).start();
                    }
                }
                storyArchiveFragment.b0 = true;
            }
        }
    }

    public StoryArchiveFragment() {
        tsk0 tsk0Var = new tsk0(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.W = msy.a(lazyThreadSafetyMode, tsk0Var);
        this.X = msy.a(lazyThreadSafetyMode, new wzb0(this, 13));
        this.c0 = new Handler(Looper.getMainLooper());
        this.d0 = i.a(0);
        this.e0 = k.b(new fj3(false, false));
        this.g0 = new e();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        Drawable background;
        TextView textView = this.a0;
        if (textView == null || (background = textView.getBackground()) == null) {
            return;
        }
        background.setTint(dhr0.t.c(R.attr.vk_ui_background_modal));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 7;
    }

    public final void jo(boolean z) {
        TextView textView = this.a0;
        if (textView == null) {
            return;
        }
        if (textView.getHeight() == 0) {
            textView.post(new s9p(this, z, 2));
            return;
        }
        float P = (-textView.getHeight()) - bwt0.P(textView);
        if (z && this.b0) {
            textView.animate().translationY(P).setDuration(300L).setInterpolator(qq2.g).start();
        } else {
            textView.setTranslationY(P);
        }
        this.b0 = false;
    }

    public final void ko() {
        wh50 wh50Var = this.e0;
        ((zak0) wh50Var).setValue(fj3.a((fj3) ((zak0) wh50Var).getValue(), false, false, 1));
    }

    public final void lo(HashSet hashSet) {
        bxl0 bxl0Var = this.f0;
        if (bxl0Var == null) {
            bxl0Var = null;
        }
        Set<? extends StoryEntry> set = bxl0Var.g;
        bxl0Var.g = hashSet;
        if ((!set.isEmpty()) != (!hashSet.isEmpty())) {
            bxl0Var.notifyItemRangeChanged(0, bxl0Var.getItemCount(), Boolean.TRUE);
            return;
        }
        Set<? extends StoryEntry> set2 = set;
        Iterator it = izi0.g(j5g.T0(set2, hashSet), j5g.d0(set2, hashSet)).iterator();
        while (it.hasNext()) {
            int P0 = bxl0Var.P0(((StoryEntry) it.next()).c);
            if (P0 >= 0) {
                bxl0Var.notifyItemChanged(P0, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void mo(String str) {
        UserId c2;
        String string = requireArguments().getString("photo");
        String string2 = requireArguments().getString("username");
        spl0 spl0Var = (spl0) this.X.getValue();
        cxl0 cxl0Var = (cxl0) this.S;
        if (cxl0Var == null || (c2 = cxl0Var.q()) == null) {
            c2 = o25.a().c();
        }
        spl0Var.g(str, c2, string, string2, new jbs(this));
    }

    public final void no(final boolean z) {
        RecyclerView recyclerView;
        StoryArchiveRecyclerPaginatedView storyArchiveRecyclerPaginatedView = this.Y;
        if (storyArchiveRecyclerPaginatedView == null || (recyclerView = storyArchiveRecyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        bwt0.V(recyclerView, new gzs() { // from class: xsna.dxl0
            @Override // xsna.gzs
            public final Object invoke() {
                RecyclerView recyclerView2;
                StoryArchiveFragment storyArchiveFragment = StoryArchiveFragment.this;
                StoryArchiveRecyclerPaginatedView storyArchiveRecyclerPaginatedView2 = storyArchiveFragment.Y;
                RecyclerView.o layoutManager = (storyArchiveRecyclerPaginatedView2 == null || (recyclerView2 = storyArchiveRecyclerPaginatedView2.getRecyclerView()) == null) ? null : recyclerView2.getLayoutManager();
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                boolean z2 = false;
                if (gridLayoutManager != null) {
                    int w = gridLayoutManager.w();
                    bxl0 bxl0Var = storyArchiveFragment.f0;
                    if (w == (bxl0Var != null ? bxl0Var : null).E0() - 1) {
                        z2 = true;
                    }
                }
                if (!z || z2) {
                    StoryArchiveFastScrollView storyArchiveFastScrollView = storyArchiveFragment.Z;
                    if (storyArchiveFastScrollView != null) {
                        storyArchiveFastScrollView.b(true);
                    }
                } else {
                    StoryArchiveFastScrollView storyArchiveFastScrollView2 = storyArchiveFragment.Z;
                    if (storyArchiveFastScrollView2 != null) {
                        storyArchiveFastScrollView2.c();
                    }
                }
                return s3q0.a;
            }
        });
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 228 && i2 == -1) {
            cvk.u(R.string.story_archive_loading, false);
            return;
        }
        if (i == 229 && i2 == -1 && intent != null) {
            cxl0 cxl0Var = (cxl0) this.S;
            if (cxl0Var != null) {
                cxl0Var.V0();
            }
            Narrative narrative = (Narrative) intent.getParcelableExtra("RESULT_EXTRA_HIGHLIGHT");
            ((j6v) this.T.getValue()).c(NarrativePublishEventType.CLICK_TO_ADD_TO_NARRATIVE, MobileOfficialAppsCoreNavStat$EventScreen.STORY_ARCHIVE, narrative);
            List<StoryEntry> list = narrative.g;
            ikv0.a aVar = new ikv0.a(requireContext());
            aVar.u = new ikv0.d(getResources().getQuantityString(R.plurals.highlight_multiple_stories_added_in_one_highlight, list.size(), Integer.valueOf(list.size()), narrative.d), (String) null, (ikv0.d.a) null, 6);
            Serializer.c<Narrative> cVar = Narrative.CREATOR;
            int a2 = iah0.a(24);
            HighlightCover highlightCover = narrative.e;
            String e2 = highlightCover != null ? highlightCover.e(a2) : null;
            if (e2 != null) {
                aVar.t = new ikv0.c.e(new c.d(e2, null), null, null, 14);
            }
            aVar.n();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserId userId = (UserId) requireArguments().getParcelable("owner_id");
        if (userId == null) {
            userId = o25.a().c();
        }
        this.S = new oxl0(this, userId, ((StoriesComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class))).b(), ((StoryArchiveComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoryArchiveComponent.class))).l1(), ((StoriesComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class))).w());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.story_archive_fragment, viewGroup, false);
        b bVar = new b();
        ComposeView composeView = (ComposeView) inflate.findViewById(R.id.compose_toolbar);
        if (composeView != null) {
            composeView.setContent(new jai(-1408557424, new gd1(7, this, bVar), true));
        }
        this.Y = (StoryArchiveRecyclerPaginatedView) inflate.findViewById(R.id.list);
        this.a0 = (TextView) inflate.findViewById(R.id.current_date);
        this.Z = (StoryArchiveFastScrollView) inflate.findViewById(R.id.fast_scroller);
        ko();
        StoryArchiveRecyclerPaginatedView storyArchiveRecyclerPaginatedView = this.Y;
        if (storyArchiveRecyclerPaginatedView != null) {
            storyArchiveRecyclerPaginatedView.getContext();
            StoryArchiveLayoutManager storyArchiveLayoutManager = new StoryArchiveLayoutManager(3);
            storyArchiveLayoutManager.x = new c();
            storyArchiveRecyclerPaginatedView.getRecyclerView().setLayoutManager(storyArchiveLayoutManager);
            storyArchiveRecyclerPaginatedView.setOpenCamera(new myd0(this, 14));
            storyArchiveRecyclerPaginatedView.getRecyclerView().addOnScrollListener(this.g0);
            storyArchiveRecyclerPaginatedView.getRecyclerView().setVerticalScrollBarEnabled(false);
            StoryArchiveFastScrollView storyArchiveFastScrollView = this.Z;
            if (storyArchiveFastScrollView != null) {
                RecyclerView recyclerView = storyArchiveRecyclerPaginatedView.getRecyclerView();
                storyArchiveFastScrollView.e = recyclerView;
                recyclerView.addOnScrollListener(storyArchiveFastScrollView.f);
            }
            storyArchiveRecyclerPaginatedView.setItemDecoration(new hxl0(h0, 4));
        }
        StoryArchiveFastScrollView storyArchiveFastScrollView2 = this.Z;
        if (storyArchiveFastScrollView2 != null) {
            storyArchiveFastScrollView2.setCallback(new bx80(this, 7));
        }
        Drawable a2 = m33.a(R.drawable.vk_bg_onboarding, e43.a);
        a2.setTintMode(PorterDuff.Mode.MULTIPLY);
        a2.setTint(dhr0.t.c(R.attr.vk_ui_background_modal));
        TextView textView = this.a0;
        if (textView != null) {
            textView.setBackground(a2);
        }
        TextView textView2 = this.a0;
        if (textView2 != null) {
            f4m.y(iah0.a(6.0f), textView2);
        }
        jo(false);
        StoryArchiveFastScrollView storyArchiveFastScrollView3 = this.Z;
        if (storyArchiveFastScrollView3 != null) {
            storyArchiveFastScrollView3.b(false);
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        StoryArchiveFastScrollView storyArchiveFastScrollView = this.Z;
        if (storyArchiveFastScrollView != null) {
            RecyclerView recyclerView = storyArchiveFastScrollView.e;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.removeOnScrollListener(storyArchiveFastScrollView.f);
        }
        this.Y = null;
        this.a0 = null;
        this.Z = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(7);
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
        super.onStop();
    }

    /* compiled from: StoryArchiveFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, String str, String str2) {
            super(StoryArchiveFragment.class, null, null);
            this.j.putParcelable("owner_id", userId);
            this.j.putString("photo", str);
            this.j.putString("username", str2);
        }

        public a() {
            this(o25.a().c(), null, null);
        }
    }
}
