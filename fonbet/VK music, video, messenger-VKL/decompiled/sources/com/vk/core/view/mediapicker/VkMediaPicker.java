package com.vk.core.view.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.mediapicker.views.FastScrollerView;
import com.vk.core.view.mediapicker.views.MediaPickerRecyclerView;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.adg;
import xsna.asp;
import xsna.awt0;
import xsna.br;
import xsna.dhw;
import xsna.epx;
import xsna.f4m;
import xsna.fw3;
import xsna.gh1;
import xsna.gkf0;
import xsna.gt10;
import xsna.gzs;
import xsna.iah0;
import xsna.ic3;
import xsna.iu10;
import xsna.izs;
import xsna.jgu;
import xsna.k6s;
import xsna.mnm;
import xsna.nyu;
import xsna.pvo0;
import xsna.qoy;
import xsna.s3q0;
import xsna.s48;
import xsna.te9;
import xsna.tlo0;
import xsna.tq;
import xsna.uai0;
import xsna.uf3;
import xsna.v3v0;
import xsna.vu5;
import xsna.w6s;
import xsna.wai0;
import xsna.x3v0;
import xsna.xp10;
import xsna.zif0;
import xsna.zlm0;
import xsna.zrp;

/* compiled from: VkMediaPicker.kt */
/* loaded from: classes17.dex */
public final class VkMediaPicker extends FrameLayout implements gt10.a {
    public static final int o = iah0.a(2);
    public final MediaPickerRecyclerView b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final FastScrollerView g;
    public gt10 h;
    public s48 i;
    public com.vk.core.view.mediapicker.a j;
    public iu10 k;
    public c l;
    public int m;
    public boolean n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkMediaPicker.kt */
    public static final class CellAspectRation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CellAspectRation[] $VALUES;
        public static final CellAspectRation Square;
        public static final CellAspectRation Vertical;
        private final float value;

        static {
            CellAspectRation cellAspectRation = new CellAspectRation("Square", 0, 1.0f);
            Square = cellAspectRation;
            CellAspectRation cellAspectRation2 = new CellAspectRation("Vertical", 1, 0.5625f);
            Vertical = cellAspectRation2;
            CellAspectRation[] cellAspectRationArr = {cellAspectRation, cellAspectRation2};
            $VALUES = cellAspectRationArr;
            $ENTRIES = new asp(cellAspectRationArr);
        }

        public CellAspectRation(String str, int i, float f) {
            this.value = f;
        }

        public static zrp<CellAspectRation> h() {
            return $ENTRIES;
        }

        public static CellAspectRation valueOf(String str) {
            return (CellAspectRation) Enum.valueOf(CellAspectRation.class, str);
        }

        public static CellAspectRation[] values() {
            return (CellAspectRation[]) $VALUES.clone();
        }

        public final float i() {
            return this.value;
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public static final class a {
        public final List<String> a;
        public final int b;

        public a(List<String> list, int i) {
            this.a = list;
            this.b = i;
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public static abstract class b {

        /* compiled from: VkMediaPicker.kt */
        public static final class a extends b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Custom(view=null)";
            }
        }

        /* compiled from: VkMediaPicker.kt */
        /* renamed from: com.vk.core.view.mediapicker.VkMediaPicker$b$b, reason: collision with other inner class name */
        public static final class C0889b extends b {
            public final gzs<s3q0> a;

            public C0889b(gzs<s3q0> gzsVar) {
                this.a = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0889b) && epx.f(this.a, ((C0889b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return uf3.d(new StringBuilder("DefaultPreview(onBottomActionClick="), this.a, ')');
            }
        }

        /* compiled from: VkMediaPicker.kt */
        public static final class c extends b {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Empty(additionalPadding="), this.a, ')');
            }

            public c() {
                this(0);
            }
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public final class d implements nyu.a {
        public final e.b a;

        public d(e.b bVar) {
            this.a = bVar;
        }

        @Override // xsna.nyu.a
        public final void a() {
            this.a.b.invoke();
        }

        @Override // xsna.nyu.a
        public final void b(int i) {
            VkMediaPicker.this.b.scrollToPosition(0);
            this.a.a.invoke(Integer.valueOf(i));
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public static abstract class e {

        /* compiled from: VkMediaPicker.kt */
        public static final class a extends e {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Custom(view=null)";
            }
        }

        /* compiled from: VkMediaPicker.kt */
        public static final class b extends e {
            public final izs<Integer, s3q0> a;
            public final gzs<s3q0> b;

            public b(gzs gzsVar, izs izsVar) {
                this.a = izsVar;
                this.b = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Default(onAlbumSelected=");
                sb.append(this.a);
                sb.append(", onCloseClick=");
                return uf3.d(sb, this.b, ')');
            }
        }

        /* compiled from: VkMediaPicker.kt */
        public static final class c extends e {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1936150568;
            }

            public final String toString() {
                return "Empty";
            }
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public final class f {
        public WeakReference<View> a;

        public f() {
        }

        public final void a(Pair<Float, Float> pair) {
            WeakReference<View> weakReference = null;
            if (pair == null) {
                WeakReference<View> weakReference2 = this.a;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
            } else {
                View findChildViewUnder = VkMediaPicker.this.b.findChildViewUnder(pair.i().floatValue(), pair.j().floatValue());
                if (findChildViewUnder != null) {
                    weakReference = new WeakReference<>(findChildViewUnder);
                }
            }
            this.a = weakReference;
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public final class g implements wai0.a {
        public final b.C0889b a;

        public g(b.C0889b c0889b) {
            this.a = c0889b;
        }

        @Override // xsna.wai0.a
        public final void a() {
            this.a.a.invoke();
        }

        @Override // xsna.wai0.a
        public final void b(uai0 uai0Var) {
            gt10 gt10Var = VkMediaPicker.this.h;
            if (gt10Var != null) {
                int w = ((ListDataSet) gt10Var.c).w(new adg(new mnm(uai0Var.a, 3), 1));
                if (w >= 0) {
                    RecyclerView recyclerView = gt10Var.d;
                    RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                    GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                    if (gridLayoutManager == null) {
                        return;
                    }
                    if (Math.abs(gridLayoutManager.v() - w) / gridLayoutManager.s < 20) {
                        RecyclerView recyclerView2 = gt10Var.d;
                        if (recyclerView2 != null) {
                            recyclerView2.smoothScrollToPosition(w);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView3 = gt10Var.d;
                    if (recyclerView3 != null) {
                        recyclerView3.scrollToPosition(w);
                    }
                }
            }
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public static abstract class h {

        /* compiled from: VkMediaPicker.kt */
        public static final class a extends h {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Custom(view=null)";
            }
        }

        /* compiled from: VkMediaPicker.kt */
        public static final class b extends h {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1929046358;
            }

            public final String toString() {
                return "Empty";
            }
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public static final /* synthetic */ class i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.Footer.values().length];
            try {
                iArr[State.Footer.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.Footer.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.Footer.Invisible.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public static final class j implements FastScrollerView.a {
        public j() {
        }

        @Override // com.vk.core.view.mediapicker.views.FastScrollerView.a
        public final String f(int i) {
            int i2;
            VkMediaPicker vkMediaPicker = VkMediaPicker.this;
            gt10 gt10Var = vkMediaPicker.h;
            if (gt10Var != null) {
                final zlm0 zlm0Var = new zlm0(13);
                i2 = ((ListDataSet) gt10Var.c).w(new Predicate() { // from class: xsna.w3v0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) zlm0.this.invoke(obj)).booleanValue();
                    }
                });
            } else {
                i2 = 0;
            }
            int max = Math.max(i - (i % vkMediaPicker.m), i2);
            gt10 gt10Var2 = vkMediaPicker.h;
            zif0 zif0Var = gt10Var2 != null ? (xp10) gt10Var2.c.c(max) : null;
            dhw dhwVar = zif0Var instanceof dhw ? (dhw) zif0Var : null;
            return dhwVar == null ? "" : pvo0.j(dhwVar.a.c, false, false);
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public static final class k extends RecyclerView.t {
        public final /* synthetic */ gt10 b;
        public final /* synthetic */ VkMediaPicker c;
        public final /* synthetic */ c d;

        public k(gt10 gt10Var, VkMediaPicker vkMediaPicker, c cVar) {
            this.b = gt10Var;
            this.c = vkMediaPicker;
            this.d = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            xp10 xp10Var = (xp10) this.b.c.c(itemCount - 1);
            if (xp10Var == null || (xp10Var instanceof w6s) || (xp10Var instanceof k6s) || gkf0.b(recyclerView) < itemCount - (this.c.m * 5)) {
                return;
            }
            this.d.a.N0();
        }
    }

    public VkMediaPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void c(View view, ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        viewGroup.setVisibility(0);
    }

    private final VkPlaceholder getEmptyStateView() {
        VkPlaceholder vkPlaceholder = new VkPlaceholder(getContext(), null, 6, 0);
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.ds_empty_view_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.ds_empty_view_subtitle))));
        return vkPlaceholder;
    }

    private final void setBottomContent(s48 s48Var) {
        this.i = s48Var;
        c(s48Var.getView(), this.e);
    }

    private final void setHeaderContent(com.vk.core.view.mediapicker.a aVar) {
        this.j = aVar;
        c(aVar.getView(), this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setState$lambda$0(VkMediaPicker vkMediaPicker) {
        gt10 gt10Var = vkMediaPicker.h;
        if (gt10Var != null) {
            gt10Var.setItems(EmptyList.b);
        }
    }

    private final void setupBottomContainer(c cVar) {
        b bVar = cVar.g;
        if (bVar instanceof b.C0889b) {
            CellAspectRation cellAspectRation = cVar.d;
            wai0 wai0Var = new wai0(getContext());
            wai0Var.setPreviewCallback(new g((b.C0889b) bVar));
            wai0Var.setAspectRatio(cellAspectRation);
            setBottomContent(wai0Var);
        } else if (bVar instanceof b.a) {
            ((b.a) bVar).getClass();
            setBottomContent(null);
        } else {
            if (!(bVar instanceof b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(this.e);
        }
        e();
    }

    private final void setupFastScroller(c cVar) {
        if (cVar.b) {
            MediaPickerRecyclerView mediaPickerRecyclerView = this.b;
            mediaPickerRecyclerView.setVerticalScrollBarEnabled(false);
            FastScrollerView fastScrollerView = this.g;
            fastScrollerView.setVisibility(0);
            fastScrollerView.setupRecycler(mediaPickerRecyclerView);
            fastScrollerView.setPopupTextProvider(new j());
        }
    }

    private final void setupHeaderContainer(c cVar) {
        e eVar = cVar.e;
        if (eVar instanceof e.b) {
            nyu nyuVar = new nyu(getContext());
            nyuVar.setCallback(new d((e.b) eVar));
            setHeaderContent(nyuVar);
        } else if (eVar instanceof e.a) {
            ((e.a) eVar).getClass();
            setHeaderContent(null);
        } else {
            if (!epx.f(eVar, e.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(this.c);
        }
    }

    private final void setupPinchGestureListener(c cVar) {
        if (cVar.c) {
            iu10 iu10Var = new iu10(new f());
            this.b.setOnInterceptTouchEventListener(iu10Var.e);
            this.k = iu10Var;
        }
    }

    private final void setupRecycler(c cVar) {
        gt10 gt10Var = new gt10(cVar.d, this);
        this.h = gt10Var;
        getContext();
        final int i2 = this.m;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i2) { // from class: com.vk.core.view.mediapicker.VkMediaPicker$createLayoutManager$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public final boolean canScrollVertically() {
                return VkMediaPicker.this.n;
            }
        };
        gridLayoutManager.x = new v3v0(this);
        MediaPickerRecyclerView mediaPickerRecyclerView = this.b;
        mediaPickerRecyclerView.setLayoutManager(gridLayoutManager);
        mediaPickerRecyclerView.setAdapter(gt10Var);
        gt10Var.O0();
        mediaPickerRecyclerView.setItemAnimator(null);
        mediaPickerRecyclerView.addOnScrollListener(new k(gt10Var, this, cVar));
        f();
    }

    private final void setupTopContainer(c cVar) {
        h hVar = cVar.f;
        boolean z = hVar instanceof h.a;
        FrameLayout frameLayout = this.d;
        if (z) {
            ((h.a) hVar).getClass();
            c(null, frameLayout);
        } else {
            if (!epx.f(hVar, h.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(frameLayout);
        }
    }

    @Override // xsna.gt10.a
    public final void C() {
        x3v0 x3v0Var;
        c cVar = this.l;
        if (cVar == null || (x3v0Var = cVar.a) == null) {
            return;
        }
        x3v0Var.C();
    }

    @Override // xsna.gt10.a
    public final void C0() {
        x3v0 x3v0Var;
        c cVar = this.l;
        if (cVar == null || (x3v0Var = cVar.a) == null) {
            return;
        }
        x3v0Var.C0();
    }

    @Override // xsna.gt10.a
    public final void D() {
        x3v0 x3v0Var;
        c cVar = this.l;
        if (cVar == null || (x3v0Var = cVar.a) == null) {
            return;
        }
        x3v0Var.Gj();
    }

    @Override // xsna.gt10.a
    public final void G0(uai0 uai0Var) {
        x3v0 x3v0Var;
        c cVar = this.l;
        if (cVar == null || (x3v0Var = cVar.a) == null) {
            return;
        }
        x3v0Var.G0(uai0Var);
    }

    @Override // xsna.gt10.a
    public final void P0() {
        x3v0 x3v0Var;
        c cVar = this.l;
        if (cVar == null || (x3v0Var = cVar.a) == null) {
            return;
        }
        x3v0Var.P0();
    }

    @Override // xsna.gt10.a
    public final void Z1(uai0 uai0Var) {
        x3v0 x3v0Var;
        c cVar = this.l;
        if (cVar == null || (x3v0Var = cVar.a) == null) {
            return;
        }
        x3v0Var.Z1(uai0Var);
    }

    public final void d(c cVar) {
        this.l = cVar;
        setupRecycler(cVar);
        setupHeaderContainer(cVar);
        setupTopContainer(cVar);
        setupBottomContainer(cVar);
        setupFastScroller(cVar);
        setupPinchGestureListener(cVar);
    }

    public final void e() {
        c cVar = this.l;
        b bVar = cVar != null ? cVar.g : null;
        int height = bVar instanceof b.c ? ((b.c) bVar).a : this.e.getHeight();
        if (this.b.getPaddingBottom() != height) {
            awt0.x(this.b, 0, 0, 0, height, 7);
            f4m.q(height, this.g);
        }
    }

    public final void f() {
        int i2;
        gt10 gt10Var = this.h;
        if (gt10Var != null) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            AbstractList abstractList = ((ListDataSet) gt10Var.c).d;
            for (int i3 = 0; i3 < abstractList.size(); i3++) {
                if (((xp10) abstractList.get(i3)).c()) {
                    ref$IntRef.element++;
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    s3q0 s3q0Var2 = s3q0.a;
                }
            }
            i2 = ref$IntRef.element;
        } else {
            i2 = 0;
        }
        this.b.setItemDecoration(new jgu(this.m, o, false, i2));
    }

    public final void setAlbums(a aVar) {
        com.vk.core.view.mediapicker.a aVar2 = this.j;
        if (aVar2 != null) {
            aVar2.setAlbums(aVar);
        }
    }

    public final void setState(State state) {
        boolean equals = state.equals(State.c.a);
        MediaPickerRecyclerView mediaPickerRecyclerView = this.b;
        FrameLayout frameLayout = this.f;
        if (equals) {
            f4m.j(frameLayout);
            iu10 iu10Var = this.k;
            if (iu10Var != null) {
                iu10Var.d = false;
            }
            mediaPickerRecyclerView.post(new ic3(this, 14));
            s48 s48Var = this.i;
            if (s48Var != null) {
                s48Var.setSelectedItems(EmptyList.b);
                return;
            }
            return;
        }
        if (state instanceof State.a) {
            f4m.j(mediaPickerRecyclerView);
            c(((State.a) state).a, frameLayout);
            return;
        }
        if (!(state instanceof State.b)) {
            throw new NoWhenBranchMatchedException();
        }
        f4m.j(frameLayout);
        State.b bVar = (State.b) state;
        boolean isEmpty = bVar.a.isEmpty();
        if (isEmpty) {
            c(getEmptyStateView(), frameLayout);
        }
        boolean z = !isEmpty;
        awt0.v(mediaPickerRecyclerView, z);
        mediaPickerRecyclerView.post(new te9(8, this, state));
        iu10 iu10Var2 = this.k;
        if (iu10Var2 != null) {
            iu10Var2.d = z;
        }
        s48 s48Var2 = this.i;
        if (s48Var2 != null) {
            s48Var2.setSelectedItems(bVar.b);
        }
        this.e.post(new gh1(this, 11));
        f();
    }

    @Override // xsna.gt10.a
    public final void u2(uai0 uai0Var) {
        x3v0 x3v0Var;
        c cVar = this.l;
        if (cVar == null || (x3v0Var = cVar.a) == null) {
            return;
        }
        x3v0Var.u2(uai0Var);
    }

    @Override // xsna.gt10.a
    public final void v2() {
        x3v0 x3v0Var;
        c cVar = this.l;
        if (cVar == null || (x3v0Var = cVar.a) == null) {
            return;
        }
        x3v0Var.N0();
    }

    public VkMediaPicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, (i2 & 2) != 0 ? null : attributeSet, 0);
        this.m = 3;
        this.n = true;
        LayoutInflater.from(context).inflate(R.layout.ds_media_picker_view, (ViewGroup) this, true);
        this.b = (MediaPickerRecyclerView) findViewById(R.id.media_picker_recycler_view);
        this.c = (FrameLayout) findViewById(R.id.header_container);
        this.d = (FrameLayout) findViewById(R.id.top_container);
        this.e = (FrameLayout) findViewById(R.id.bottom_container);
        this.f = (FrameLayout) findViewById(R.id.stub_container);
        this.g = (FastScrollerView) findViewById(R.id.fast_scroller);
    }

    /* compiled from: VkMediaPicker.kt */
    public interface State {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkMediaPicker.kt */
        public static final class Footer {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Footer[] $VALUES;
            public static final Footer Error;
            public static final Footer Invisible;
            public static final Footer Loading;

            static {
                Footer footer = new Footer("Loading", 0);
                Loading = footer;
                Footer footer2 = new Footer("Error", 1);
                Error = footer2;
                Footer footer3 = new Footer("Invisible", 2);
                Invisible = footer3;
                Footer[] footerArr = {footer, footer2, footer3};
                $VALUES = footerArr;
                $ENTRIES = new asp(footerArr);
            }

            public Footer() {
                throw null;
            }

            public static Footer valueOf(String str) {
                return (Footer) Enum.valueOf(Footer.class, str);
            }

            public static Footer[] values() {
                return (Footer[]) $VALUES.clone();
            }
        }

        /* compiled from: VkMediaPicker.kt */
        public static final class a implements State {
            public final View a;

            public a(View view) {
                this.a = view;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return br.b(new StringBuilder("Error(view="), this.a, ')');
            }
        }

        /* compiled from: VkMediaPicker.kt */
        public static final class c implements State {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1738784876;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: VkMediaPicker.kt */
        public static final class b implements State {
            public final ArrayList a;
            public final List<uai0> b;
            public final Footer c;

            public b(ArrayList arrayList, ArrayList arrayList2, Footer footer) {
                this.a = arrayList;
                this.b = arrayList2;
                this.c = footer;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return "Loaded(items=" + this.a + ", selectedItems=" + this.b + ", footerState=" + this.c + ')';
            }

            public /* synthetic */ b(ArrayList arrayList, ArrayList arrayList2) {
                this(arrayList, arrayList2, Footer.Invisible);
            }
        }
    }

    /* compiled from: VkMediaPicker.kt */
    public static final class c {
        public final x3v0 a;
        public final boolean b;
        public final boolean c;
        public final CellAspectRation d;
        public final e e;
        public final h f;
        public final b g;

        public c(x3v0 x3v0Var, boolean z, boolean z2, CellAspectRation cellAspectRation, e eVar, h hVar, b bVar) {
            this.a = x3v0Var;
            this.b = z;
            this.c = z2;
            this.d = cellAspectRation;
            this.e = eVar;
            this.f = hVar;
            this.g = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Configuration(mediaPickerCallback=" + this.a + ", isShowScrollbarWithDates=" + this.b + ", isPinchToZoomEnabled=" + this.c + ", aspectRatio=" + this.d + ", headerContent=" + this.e + ", topContent=" + this.f + ", bottomContent=" + this.g + ')';
        }

        public /* synthetic */ c(x3v0 x3v0Var, boolean z, boolean z2, CellAspectRation cellAspectRation, e eVar, b bVar) {
            this(x3v0Var, z, z2, cellAspectRation, eVar, h.b.a, bVar);
        }
    }
}
