package com.vk.storycamera.picker.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.movika.sdk.android.defaultplayer.control.n;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.preview.di.GalleryPickerPreviewComponent;
import com.vk.preview.presentation.view.GalleryPickerPreview;
import com.vk.stories.design.view.camera.StoryMediaPickerTabView;
import com.vk.stories.design.view.camera.StoryTabType;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.picker.feature.StoryMediaPickerState;
import com.vk.storycamera.picker.feature.e;
import com.vk.storycamera.picker.ui.a;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.x;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.ao50;
import xsna.b47;
import xsna.bbb0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cqm0;
import xsna.d6m0;
import xsna.dei0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e6m0;
import xsna.f6m0;
import xsna.fnj;
import xsna.fpf0;
import xsna.g6m0;
import xsna.gm50;
import xsna.i6m0;
import xsna.iah0;
import xsna.izs;
import xsna.jcf0;
import xsna.jcm0;
import xsna.k15;
import xsna.kcj0;
import xsna.km50;
import xsna.l7s;
import xsna.m3t;
import xsna.m7m;
import xsna.mcj0;
import xsna.mk50;
import xsna.msy;
import xsna.nds;
import xsna.nf9;
import xsna.nid0;
import xsna.nxi0;
import xsna.oek0;
import xsna.oqx0;
import xsna.ov;
import xsna.oz50;
import xsna.p3t;
import xsna.qjg0;
import xsna.qo4;
import xsna.rvl0;
import xsna.s3q0;
import xsna.s3t;
import xsna.uds;
import xsna.uh40;
import xsna.uvq;
import xsna.vds;
import xsna.vk50;
import xsna.vv20;
import xsna.w9l0;
import xsna.wp40;
import xsna.wvw;
import xsna.x1e0;
import xsna.xn50;
import xsna.xrn0;
import xsna.ye80;
import xsna.yyl0;
import xsna.z4d0;
import xsna.zb60;

/* compiled from: StoryMediaPickerFragment.kt */
/* loaded from: classes6.dex */
public final class StoryMediaPickerFragment extends MviImplFragment<com.vk.storycamera.picker.feature.a, com.vk.storycamera.picker.ui.c, com.vk.storycamera.picker.ui.a> implements nds, uds, vds, e6m0 {
    public static final int d0;
    public final Object Q;
    public final bpn0 R;
    public final bpn0 S;
    public final Object T;
    public final Object U;
    public final Object V;
    public boolean W;
    public boolean X;
    public final Object Y;
    public GalleryPickerPreview Z;
    public final Object a0;
    public final Object b0;
    public final jcm0 c0;

    /* compiled from: StoryMediaPickerFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: StoryMediaPickerFragment.kt */
    public static final class b {
        public final ViewPager2 a;
        public final StoryMediaPickerTabView b;
        public final FrameLayout c;
        public final View d;
        public final RecyclerView e;
        public final VkButton f;
        public final VkButton g;

        public b(View view) {
            this.a = (ViewPager2) view.findViewById(R.id.story_media_pager);
            this.b = (StoryMediaPickerTabView) view.findViewById(R.id.story_tabs);
            this.c = (FrameLayout) view.findViewById(R.id.story_media_picker_toolbar_container);
            this.d = view.findViewById(R.id.story_selected_items_view);
            this.e = (RecyclerView) view.findViewById(R.id.story_selected_items_recycler);
            this.f = (VkButton) view.findViewById(R.id.button_editor);
            this.g = (VkButton) view.findViewById(R.id.button_collage);
        }
    }

    /* compiled from: StoryMediaPickerFragment.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StoryMediaPickerState.ScreenMode.values().length];
            try {
                iArr[StoryMediaPickerState.ScreenMode.PHOTO_PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryMediaPickerState.ScreenMode.STORY_TEMPLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StoryTabType.values().length];
            try {
                iArr2[StoryTabType.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StoryTabType.TEMPLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: StoryMediaPickerFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Bundle, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Bundle bundle) {
            StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) this.receiver;
            int i = StoryMediaPickerFragment.d0;
            storyMediaPickerFragment.ko(bundle);
            return s3q0.a;
        }
    }

    static {
        StoriesFeatures storiesFeatures = StoriesFeatures.COLLAGES_UPDATE;
        storiesFeatures.getClass();
        d0 = com.vk.toggle.b.A.a(storiesFeatures) ? iah0.a(92) : iah0.a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
    }

    public StoryMediaPickerFragment() {
        bbb0 bbb0Var = new bbb0(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, bbb0Var);
        this.R = new bpn0(new i6m0(this, 0));
        this.S = new bpn0(new nid0(this, 10));
        this.T = msy.a(lazyThreadSafetyMode, new x1e0(this, 11));
        this.U = msy.a(lazyThreadSafetyMode, new jcf0(this, 8));
        this.V = msy.a(lazyThreadSafetyMode, new z4d0(this, 14));
        this.Y = msy.a(lazyThreadSafetyMode, new wp40(this, 29));
        this.a0 = msy.a(lazyThreadSafetyMode, new ye80(this, 24));
        this.b0 = msy.a(lazyThreadSafetyMode, new dei0(this, 11));
        this.c0 = new jcm0(new f6m0(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final mk50 Fl() {
        StoriesFeatures storiesFeatures = StoriesFeatures.COLLAGES_UPDATE;
        storiesFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        View inflate = bVar.a(storiesFeatures) ? LayoutInflater.from(ho()).inflate(R.layout.fragment_story_media_picker_with_collage_update, (ViewGroup) null) : LayoutInflater.from(ho()).inflate(R.layout.fragment_story_media_picker_with_collage, (ViewGroup) null);
        if (bVar.a(storiesFeatures)) {
            View a2 = ((GalleryPickerPreviewComponent) m7m.d(this).mo408a(fpf0.a(GalleryPickerPreviewComponent.class))).w6().a(bwt0.u(requireContext()), new kcj0(this, 2), new vv20(this, 27), false, new n(this, 8));
            bwt0.R(a2, new uvq(this, 1));
            ((ViewGroup) inflate.findViewById(R.id.story_selected_items_view)).addView(a2);
            this.Z = (GalleryPickerPreview) a2;
        }
        p3t go = go();
        if (go != null) {
            go.V8(0);
            go.D3(d0);
            go.E7();
        }
        return new mk50.c(inflate);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        com.vk.storycamera.picker.ui.c cVar = (com.vk.storycamera.picker.ui.c) ao50Var;
        b bVar = new b(view);
        s3t s3tVar = (s3t) this.b0.getValue();
        StoryCameraParams fo = fo();
        Boolean bool = (Boolean) this.V.getValue();
        bool.getClass();
        ViewPager2 viewPager2 = bVar.a;
        xrn0 xrn0Var = new xrn0(this, viewPager2, this.D, s3tVar, fo, bool);
        wvw wvwVar = (wvw) this.T.getValue();
        StoryMediaPickerTabView storyMediaPickerTabView = bVar.b;
        storyMediaPickerTabView.getClass();
        Hint p = wvwVar.b().p(HintId.STORIES_TEMPLATE_MEDIA_PICKER.getId());
        if (p != null) {
            storyMediaPickerTabView.f.post(new qo4(storyMediaPickerTabView, 13));
            wvwVar.b().b(p.b);
        }
        viewPager2.setAdapter(xrn0Var);
        viewPager2.setOffscreenPageLimit(2);
        storyMediaPickerTabView.setOnClick(new yyl0(bVar, 1));
        StoriesFeatures storiesFeatures = StoriesFeatures.COLLAGES_UPDATE;
        storiesFeatures.getClass();
        if (!com.vk.toggle.b.A.a(storiesFeatures)) {
            RecyclerView recyclerView = bVar.e;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.c0);
            }
            if (recyclerView != null) {
                ho();
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            }
            bwt0.i0(bVar.f, new zb60(this, 28));
            VkButton vkButton = bVar.g;
            if (vkButton != null) {
                bwt0.i0(vkButton, new qjg0(this, 6));
            }
        }
        gm50.a.b(this, cVar.a, new w9l0(1));
        gm50.a.b(this, cVar.b, new g6m0(0, this, bVar));
    }

    @Override // xsna.vds
    public final int Q0() {
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        return fnj.b(requireContext) ? 2 : 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.storycamera.picker.feature.a aVar = (com.vk.storycamera.picker.feature.a) vk50Var;
        aVar.j.a(new uh40(this, 29), this);
        aVar.k.a(new mcj0(this, 4), this);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, a.b.b);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final StoryCameraParams fo() {
        return (StoryCameraParams) this.U.getValue();
    }

    public final p3t go() {
        Object obj;
        Iterator<T> it = getChildFragmentManager().c.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Fragment) obj) instanceof p3t) {
                break;
            }
        }
        if (obj instanceof p3t) {
            return (p3t) obj;
        }
        return null;
    }

    public final l7s ho() {
        return bwt0.u(requireContext());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void io(b bVar, boolean z) {
        FrameLayout frameLayout = bVar.c;
        p3t go = go();
        if (go != null) {
            k15.u(go, (s3t) this.b0.getValue());
        } else {
            go = null;
        }
        if (go == null) {
            return;
        }
        go.k8(true);
        LinearLayout t9 = go.t9();
        if (t9 == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(t9);
        if (z) {
            return;
        }
        xn50.a.c(this, a.e.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void jo(b bVar, boolean z) {
        FrameLayout frameLayout = bVar.c;
        p3t go = go();
        if (go != null) {
            go.k8(false);
        }
        frameLayout.removeAllViews();
        frameLayout.addView((VkTopBar) this.a0.getValue());
        if (z) {
            return;
        }
        xn50.a.c(this, a.h.b);
    }

    public final void ko(Bundle bundle) {
        p3t go = go();
        if (go == null) {
            return;
        }
        go.ij(this.c0.getCurrentList(), bundle, new b47(this, 8));
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return e3m.f(R.attr.vk_ui_background_content, ho());
    }

    public final void lo() {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(e3m.f(R.attr.vk_ui_background_content, ho()));
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var)).f(false);
        dhr0.u0(window, NavigationBarStyle.DARK);
    }

    @Override // xsna.woo0
    public final int o7() {
        return e3m.f(R.attr.vk_ui_background_content, ho());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        com.vk.storycamera.picker.feature.c cVar = (com.vk.storycamera.picker.feature.c) this.Y.getValue();
        cVar.getClass();
        if (i2 != -1) {
            if (i == 2241 && intent != null && intent.getBooleanExtra("FROM_COLLAGE", false)) {
                cVar.c.invoke(intent.getBundleExtra("COLLAGE_PARAMS"));
                return;
            }
            return;
        }
        if (i != 2241) {
            if (i == 7321) {
                cVar.b(intent);
                return;
            } else if (i != 18941) {
                return;
            }
        }
        cVar.a.finish();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        nf9 nf9Var = nf9.b;
        nf9.e().c(false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var)).f(!dhr0.M());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.post(new ov(this, 16));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Bundle arguments;
        super.onViewCreated(view, bundle);
        lo();
        Bundle arguments2 = getArguments();
        Long valueOf = (arguments2 == null || !arguments2.containsKey("session_id") || (arguments = getArguments()) == null) ? null : Long.valueOf(arguments.getLong("session_id"));
        nf9 nf9Var = nf9.b;
        nxi0 e = nf9.e();
        Context context = view.getContext();
        x<JSONObject> a2 = ((m3t) this.R.getValue()).a(view.getContext());
        StoryCameraParams fo = fo();
        String m = (fo == null || (str = fo.c) == null) ? null : cqm0.m(str);
        String str2 = m == null ? "" : m;
        StoryCameraParams fo2 = fo();
        String str3 = fo2 != null ? fo2.b : null;
        e.a(context, valueOf, a2, str2, str3 == null ? "" : str3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new com.vk.storycamera.picker.feature.a(new e(new StoryMediaPickerState.b(((Boolean) this.V.getValue()).booleanValue())), new d6m0(fo()), (rvl0) this.S.getValue());
    }
}
