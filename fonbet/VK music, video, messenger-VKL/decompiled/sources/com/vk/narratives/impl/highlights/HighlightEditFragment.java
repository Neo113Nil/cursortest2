package com.vk.narratives.impl.highlights;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.r;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.X3;
import com.vk.archive.api.di.StoryArchiveComponent;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.HighlightLocalCustomCover;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5v;
import xsna.c5v;
import xsna.cfl;
import xsna.ci7;
import xsna.cvs;
import xsna.dhr0;
import xsna.fpf0;
import xsna.gbh;
import xsna.gko;
import xsna.gvs;
import xsna.iah0;
import xsna.ihb;
import xsna.iu50;
import xsna.izs;
import xsna.j6v;
import xsna.jai;
import xsna.jjc;
import xsna.k6k;
import xsna.l9h;
import xsna.m33;
import xsna.m7m;
import xsna.msy;
import xsna.mut0;
import xsna.npl0;
import xsna.nx3;
import xsna.nyq;
import xsna.oa5;
import xsna.odm;
import xsna.ppl0;
import xsna.s3q0;
import xsna.tho0;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;
import xsna.u4v;
import xsna.upl0;
import xsna.w4v;
import xsna.wc2;
import xsna.wh50;
import xsna.wzs;
import xsna.x8m;

/* compiled from: HighlightEditFragment.kt */
/* loaded from: classes3.dex */
public final class HighlightEditFragment extends BaseMvpFragment<u4v> implements too0 {
    public static final /* synthetic */ int h0 = 0;
    public VkTopBar T;
    public VKCircleImageView U;
    public View V;
    public ImageView W;
    public VkTabs X;
    public ViewPager2 Y;
    public final VkTopBar.a.c.f Z = new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_done_outline_28), tq.h(tlo0.Companion, R.string.accessibility_done), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new x8m(11), 3), 28);
    public final wh50<tho0> a0 = k.b(new tho0((String) null, 0, 7));
    public final Handler b0 = new Handler(Looper.getMainLooper());
    public final r c0 = new r(new b());
    public final Object d0;
    public final Object e0;
    public final Object f0;
    public final Object g0;

    /* compiled from: HighlightEditFragment.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<StoryEntry, Boolean, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(StoryEntry storyEntry, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            ((u4v) this.receiver).s0(storyEntry, booleanValue);
            return s3q0.a;
        }
    }

    /* compiled from: HighlightEditFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<VkRecyclerPaginatedView, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(VkRecyclerPaginatedView vkRecyclerPaginatedView) {
            ((u4v) this.receiver).t5(vkRecyclerPaginatedView);
            return s3q0.a;
        }
    }

    /* compiled from: HighlightEditFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<StoryEntry, Boolean, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(StoryEntry storyEntry, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            ((u4v) this.receiver).s0(storyEntry, booleanValue);
            return s3q0.a;
        }
    }

    public HighlightEditFragment() {
        cvs cvsVar = new cvs(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d0 = msy.a(lazyThreadSafetyMode, cvsVar);
        this.e0 = msy.a(lazyThreadSafetyMode, new gbh(this, 24));
        this.f0 = msy.a(lazyThreadSafetyMode, new k6k(this, 19));
        this.g0 = msy.a(lazyThreadSafetyMode, new odm(this, 14));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        VKCircleImageView vKCircleImageView = this.U;
        if (vKCircleImageView == null) {
            vKCircleImageView = null;
        }
        vKCircleImageView.setPlaceholderImage(m33.a(R.drawable.bg_highlight_cover_placeholder, requireContext()));
    }

    public final void jo(boolean z) {
        cfl cflVar = z ? new cfl(this, 15) : null;
        VkTopBar vkTopBar = this.T;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(VkTopBar.a.c.f.a(this.Z, null, tq.h(tlo0.Companion, R.string.accessibility_done), cflVar, com.vk.core.compose.component.semantics.b.a(null, new ci7(28), 3), 25), null, 6));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void ko(UserId userId, ArrayList arrayList) {
        VKCircleImageView vKCircleImageView = this.U;
        if (vKCircleImageView == null) {
            vKCircleImageView = null;
        }
        jjc.g(vKCircleImageView, new ihb(this, userId, arrayList, 5));
        ppl0 ppl0Var = (ppl0) this.d0.getValue();
        ArrayList arrayList2 = ppl0Var.d;
        m.d a2 = m.a(new npl0(arrayList2, arrayList), true);
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        a2.b(ppl0Var);
        boolean isEmpty = arrayList.isEmpty();
        Handler handler = this.b0;
        if (isEmpty) {
            handler.post(new wc2(this, 6));
        } else {
            handler.post(new nx3(this, 6));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3120 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra(X3.i.b);
            int intExtra = intent.getIntExtra("RESULT_STORY_ID", 0);
            int intExtra2 = intent.getIntExtra("RESULT_PHOTO_ID", 0);
            RectF rectF = (RectF) intent.getParcelableExtra("rect");
            if (intExtra != 0) {
                ((u4v) this.S).R4(intExtra, rectF);
            } else if (intExtra2 != 0) {
                ((u4v) this.S).L0(new HighlightLocalCustomCover(stringExtra, Integer.valueOf(intExtra2), rectF));
            } else {
                ((u4v) this.S).O6(rectF, stringExtra);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        ArrayList<Integer> integerArrayList = requireArguments.getIntegerArrayList("EXTRA_STORY_IDS");
        upl0 l1 = ((StoryArchiveComponent) m7m.d(this).a(fpf0.a(StoryArchiveComponent.class))).l1();
        iu50 V7 = ((NarrativeComponent) m7m.d(this).a(fpf0.a(NarrativeComponent.class))).V7();
        UserId userId = (UserId) requireArguments.getParcelable("owner_id");
        if (userId == null) {
            userId = UserId.d;
        }
        this.S = new b5v(this, userId, integerArrayList, requireArguments.getInt("EXTRA_HIGHLIGHT_ID"), (String) this.f0.getValue(), l1, V7, (j6v) this.g0.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_highlight_edit, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ComposeView composeView = (ComposeView) view.findViewById(R.id.form_item);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setContent(new jai(-1049941551, new oa5(this, 6), true));
        this.W = (ImageView) view.findViewById(R.id.camera_icon);
        this.X = (VkTabs) view.findViewById(R.id.tabs);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.toolbar);
        this.T = vkTopBar;
        vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_cancel_outline_28), tq.h(tlo0.Companion, R.string.accessibility_cancel), new l9h(this, 22), null, com.vk.core.compose.component.semantics.b.a(null, new gvs(2), 3), 24));
        VkTopBar vkTopBar2 = this.T;
        if (vkTopBar2 == null) {
            vkTopBar2 = null;
        }
        vkTopBar2.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.highlights), null, null, null, null, 30), null, 0 == true ? 1 : 0, com.vk.core.compose.component.semantics.b.a(null, new nyq(5), 3), 6));
        VkTopBar vkTopBar3 = this.T;
        if (vkTopBar3 == null) {
            vkTopBar3 = null;
        }
        vkTopBar3.setAfter(VkTopBar.a.C0875a.a(this.Z, null, 6));
        VKCircleImageView vKCircleImageView = (VKCircleImageView) view.findViewById(R.id.cover);
        this.U = vKCircleImageView;
        vKCircleImageView.y0(iah0.b(0.5f), dhr0.Y(R.attr.vk_ui_image_border_alpha, requireContext()));
        this.V = view.findViewById(R.id.cover_overlay);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.view_pager);
        this.Y = viewPager2;
        viewPager2.setAdapter(new c5v((ppl0) this.d0.getValue(), (ppl0) this.e0.getValue(), this.c0, new c(1, this.S, u4v.class, "bindAllStoriesRecycler", "bindAllStoriesRecycler(Lcom/vk/core/view/components/paging/list/VkRecyclerPaginatedView;)V", 0)));
        VkTabs vkTabs = this.X;
        if (vkTabs == null) {
            vkTabs = null;
        }
        ViewPager2 viewPager22 = this.Y;
        new e(vkTabs, viewPager22 != null ? viewPager22 : null, true, new w4v()).a();
        super.onViewCreated(view, bundle);
    }

    /* compiled from: HighlightEditFragment.kt */
    public static final class b extends r.d {
        public b() {
        }

        @Override // androidx.recyclerview.widget.r.d
        public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return r.d.l(15, 0);
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            ((u4v) HighlightEditFragment.this.S).I5(e0Var.getAdapterPosition(), e0Var2.getAdapterPosition());
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void p(RecyclerView.e0 e0Var) {
        }
    }
}
