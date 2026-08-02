package com.vk.stickers.autosuggest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.GiftSuggestionConfig;
import com.vk.dto.stickers.PackPreviewItem;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.dto.stickers.StyleIcons;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStickersStat$TypeStickersClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stickers.ContextUser;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.completable.i;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.observable.b1;
import io.reactivex.rxjava3.internal.operators.observable.d2;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.amv;
import xsna.anj;
import xsna.asu0;
import xsna.bjc;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c5g;
import xsna.c5l0;
import xsna.cn70;
import xsna.cp0;
import xsna.dhr0;
import xsna.dk5;
import xsna.e3m;
import xsna.e43;
import xsna.ek5;
import xsna.eos;
import xsna.epx;
import xsna.fk5;
import xsna.fnj;
import xsna.g2v;
import xsna.g5g;
import xsna.h9l0;
import xsna.hf8;
import xsna.hg1;
import xsna.hk5;
import xsna.iah0;
import xsna.icl0;
import xsna.ify;
import xsna.ik5;
import xsna.izs;
import xsna.j22;
import xsna.j5g;
import xsna.jzb0;
import xsna.kbl0;
import xsna.kcl0;
import xsna.kd;
import xsna.kk5;
import xsna.lhg;
import xsna.lk5;
import xsna.md;
import xsna.mj0;
import xsna.ns1;
import xsna.ojf0;
import xsna.ox0;
import xsna.p40;
import xsna.pd;
import xsna.rr;
import xsna.rsg0;
import xsna.s3q0;
import xsna.s41;
import xsna.t6g0;
import xsna.u390;
import xsna.uj5;
import xsna.uzp0;
import xsna.ve0;
import xsna.y8l0;
import xsna.yc;
import xsna.z23;
import xsna.zal0;
import xsna.zhy0;

/* compiled from: AutoSuggestStickersPopupWindow.kt */
/* loaded from: classes5.dex */
public final class AutoSuggestStickersPopupWindow implements mj0, amv, ify.a {
    public static final int H = cn70.b(6);
    public static final int I = cn70.b(4);
    public static final List<Pair<Integer, Long>> J = e43.l(new Pair(2, 150L), new Pair(5, 100L), new Pair(8, 50L));
    public final IntentFilter A;
    public boolean B;
    public final io.reactivex.rxjava3.subjects.d<String> C;
    public String D;
    public int E;
    public final int F;
    public final int G;
    public final Context b;
    public final EditText c;
    public final kcl0 d;
    public final StickersView.c e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public ViewGroup g;
    public final CoordinatorLayout h;
    public final CardView i;
    public final BottomSheetBehavior<CardView> j;
    public io.reactivex.rxjava3.disposables.c k;
    public QuickStickerSuggestState l;
    public boolean m;
    public final LongtapRecyclerView n;
    public final uj5 o;
    public final bpn0 p;
    public ContextUser q;
    public StickersDictionaryItem r;
    public final kk5 s;
    public final io.reactivex.rxjava3.disposables.b t;
    public final dk5 u;
    public lk5 v;
    public final com.vk.stickers.autosuggest.a w;
    public ojf0 x;
    public View y;
    public final AutoSuggestStickersPopupWindow$broadcastReceiver$1 z;

    /* compiled from: AutoSuggestStickersPopupWindow.kt */
    public static abstract class b {

        /* compiled from: AutoSuggestStickersPopupWindow.kt */
        public static final class a extends b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1232819567;
            }

            public final String toString() {
                return "AddKeyword";
            }
        }

        /* compiled from: AutoSuggestStickersPopupWindow.kt */
        /* renamed from: com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow$b$b, reason: collision with other inner class name */
        public static final class C1792b extends b {
            public final GiftSuggestionConfig a;

            public C1792b(GiftSuggestionConfig giftSuggestionConfig) {
                this.a = giftSuggestionConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1792b) && epx.f(this.a, ((C1792b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "GiftPromo(config=" + this.a + ')';
            }
        }

        /* compiled from: AutoSuggestStickersPopupWindow.kt */
        public static final class c extends b {
            public final PackPreviewItem a;

            public c(PackPreviewItem packPreviewItem) {
                this.a = packPreviewItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Pack(pack=" + this.a + ')';
            }
        }

        /* compiled from: AutoSuggestStickersPopupWindow.kt */
        public static final class d extends b {
            public final StickerItem a;

            public d(StickerItem stickerItem) {
                this.a = stickerItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "StickerSuggest(item=" + this.a + ')';
            }
        }

        /* compiled from: AutoSuggestStickersPopupWindow.kt */
        public static final class e extends b {
            public final StickerItem a;

            public e(StickerItem stickerItem) {
                this.a = stickerItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "VmojiPromo(item=" + this.a + ')';
            }
        }
    }

    /* compiled from: AutoSuggestStickersPopupWindow.kt */
    public final class c implements LongtapRecyclerView.a {
        public c() {
        }

        @Override // com.vk.stickers.views.LongtapRecyclerView.a
        public final void a() {
            AutoSuggestStickersPopupWindow.this.C().getClass();
        }

        @Override // com.vk.stickers.views.LongtapRecyclerView.a
        public final void b() {
            AutoSuggestStickersPopupWindow.this.C().getClass();
        }

        @Override // com.vk.stickers.views.LongtapRecyclerView.a
        public final void c(View view) {
            io.reactivex.rxjava3.core.a b1Var;
            PackPreviewItem packPreviewItem;
            AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = AutoSuggestStickersPopupWindow.this;
            StickersView.c cVar = autoSuggestStickersPopupWindow.e;
            final int childAdapterPosition = autoSuggestStickersPopupWindow.n.getChildAdapterPosition(view);
            Object obj = null;
            if (view.getId() != R.id.pack_preview_container) {
                if (childAdapterPosition != -1) {
                    io.reactivex.rxjava3.disposables.b bVar = autoSuggestStickersPopupWindow.t;
                    List<UserId> h = cVar.h();
                    if (h.size() != 1) {
                        b1Var = i.b;
                    } else if (autoSuggestStickersPopupWindow.q != null) {
                        b1Var = i.b;
                    } else {
                        UserId next = h.iterator().next();
                        if (next.b <= 0) {
                            b1Var = i.b;
                        } else {
                            q m = hg1.m(rsg0.y0(new eos(next, 3), null, null, 3), autoSuggestStickersPopupWindow.b, 0L, false, 62);
                            cp0 cp0Var = new cp0(new p40(autoSuggestStickersPopupWindow, 8), 4);
                            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                            b1Var = new b1(m.E(cp0Var, lVar, kVar, kVar));
                        }
                    }
                    bVar.b(b1Var.subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.gk5
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow2 = AutoSuggestStickersPopupWindow.this;
                            ArrayList E = g5g.E(autoSuggestStickersPopupWindow2.o.h, AutoSuggestStickersPopupWindow.b.d.class);
                            ArrayList arrayList = new ArrayList(c5g.u(E, 10));
                            Iterator it = E.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((AutoSuggestStickersPopupWindow.b.d) it.next()).a);
                            }
                            ArrayList arrayList2 = autoSuggestStickersPopupWindow2.o.h;
                            int i = childAdapterPosition;
                            List H0 = j5g.H0(arrayList2, i + 1);
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : H0) {
                                if (!(((AutoSuggestStickersPopupWindow.b) obj2) instanceof AutoSuggestStickersPopupWindow.b.d)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            g2v.d().a().y(autoSuggestStickersPopupWindow2.C(), arrayList, i - arrayList3.size(), autoSuggestStickersPopupWindow2.c);
                        }
                    }));
                    return;
                }
                return;
            }
            Object obj2 = autoSuggestStickersPopupWindow.o.h.get(childAdapterPosition);
            b.c cVar2 = obj2 instanceof b.c ? (b.c) obj2 : null;
            if (cVar2 == null || (packPreviewItem = cVar2.a) == null) {
                return;
            }
            List<StyleIcons> list = packPreviewItem.e;
            int i = packPreviewItem.b;
            if (!list.isEmpty()) {
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsStickersStat$TypeStickersClickItem(MobileOfficialAppsStickersStat$TypeStickersClickItem.ClickType.KEYBOARD_SUGGEST, childAdapterPosition), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                StickerStockItem I = autoSuggestStickersPopupWindow.d.I(i);
                if (I == null) {
                    return;
                }
                zal0.z(g2v.d().a(), autoSuggestStickersPopupWindow.b, I, GiftData.d, null, "story_style_selector", null, new com.vk.movika.sdk.base.ui.g(autoSuggestStickersPopupWindow, 11), 32);
                return;
            }
            if (!packPreviewItem.d) {
                autoSuggestStickersPopupWindow.y(i, autoSuggestStickersPopupWindow.b);
                return;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (((StyleIcons) next2).d) {
                    obj = next2;
                    break;
                }
            }
            StyleIcons styleIcons = (StyleIcons) obj;
            if (styleIcons != null) {
                i = styleIcons.b;
            }
            cVar.n(i);
        }
    }

    /* compiled from: AutoSuggestStickersPopupWindow.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuickStickerSuggestState.values().length];
            try {
                iArr[QuickStickerSuggestState.CLIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuickStickerSuggestState.POSTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AutoSuggestStickersPopupWindow.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<StickersDictionaryItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(StickersDictionaryItem stickersDictionaryItem) {
            StickersDictionaryItem stickersDictionaryItem2 = stickersDictionaryItem;
            AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = (AutoSuggestStickersPopupWindow) this.receiver;
            int i = AutoSuggestStickersPopupWindow.H;
            autoSuggestStickersPopupWindow.getClass();
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"dictionaryItem=" + stickersDictionaryItem2});
            }
            if (stickersDictionaryItem2 != null && (!autoSuggestStickersPopupWindow.B || !stickersDictionaryItem2.isEmpty() || !stickersDictionaryItem2.e.isEmpty())) {
                autoSuggestStickersPopupWindow.B = false;
                if (AutoSuggestStickersPopupWindow.z(stickersDictionaryItem2)) {
                    autoSuggestStickersPopupWindow.w(stickersDictionaryItem2);
                } else {
                    autoSuggestStickersPopupWindow.w(null);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: AutoSuggestStickersPopupWindow.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).q(th);
            return s3q0.a;
        }
    }

    /* compiled from: AutoSuggestStickersPopupWindow.kt */
    public static final class g extends RecyclerView.t {
        public final /* synthetic */ AutoSuggestStickersPopupWindow b;
        public final /* synthetic */ View c;

        public g(View view, AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow) {
            this.b = autoSuggestStickersPopupWindow;
            this.c = view;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            boolean canScrollVertically = recyclerView.canScrollVertically(1);
            AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = this.b;
            boolean z = canScrollVertically || autoSuggestStickersPopupWindow.j.M != 3;
            View view = this.c;
            if ((view.getVisibility() == 0) != z) {
                view.setVisibility((!autoSuggestStickersPopupWindow.m || autoSuggestStickersPopupWindow.o.h.isEmpty() || autoSuggestStickersPopupWindow.j.M == 5) ? 8 : 0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow$broadcastReceiver$1] */
    public AutoSuggestStickersPopupWindow(Context context, EditText editText, kcl0 kcl0Var, StickersView.c cVar) {
        this.b = context;
        this.c = editText;
        this.d = kcl0Var;
        this.e = cVar;
        int i = 0;
        AttributeSet attributeSet = null;
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context, null);
        this.h = coordinatorLayout;
        this.l = QuickStickerSuggestState.DISABLED;
        this.p = new bpn0(new yc(this, 6));
        kk5 kk5Var = new kk5(this);
        this.s = kk5Var;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.t = bVar;
        this.u = new dk5(kcl0Var);
        this.z = new BroadcastReceiver() { // from class: com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                String action = intent.getAction();
                if (action != null && action.hashCode() == 141468419 && action.equals("com.vkontakte.android.STICKERS_STYLE_UPDATED")) {
                    EditText editText2 = AutoSuggestStickersPopupWindow.this.c;
                    editText2.setText(editText2.getText());
                }
            }
        };
        this.A = z23.a("com.vkontakte.android.STICKERS_STYLE_UPDATED");
        this.B = true;
        this.C = io.reactivex.rxjava3.subjects.d.N0();
        this.D = "";
        this.F = context.getResources().getDimensionPixelSize(R.dimen.sticker_suggest_min_size_new);
        this.G = context.getResources().getDimensionPixelSize(R.dimen.sticker_suggest_max_size_new);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"init"});
        }
        E();
        this.E = o();
        uj5 uj5Var = new uj5(cVar, new kd(this, 9), this);
        this.o = uj5Var;
        ik5 ik5Var = new ik5();
        LongtapRecyclerView longtapRecyclerView = new LongtapRecyclerView(context, attributeSet, 6, i);
        longtapRecyclerView.setAdapter(uj5Var);
        longtapRecyclerView.getContext();
        longtapRecyclerView.setLayoutManager(new GridLayoutManager(B(), 1));
        ojf0 ojf0Var = this.x;
        longtapRecyclerView.setClipToPadding(ojf0Var != null && ojf0Var.b);
        longtapRecyclerView.setItemAnimator(null);
        int i2 = I;
        longtapRecyclerView.setPadding(i2, H, i2, 0);
        longtapRecyclerView.addItemDecoration(ik5Var);
        longtapRecyclerView.setLongtapListener(new c());
        this.n = longtapRecyclerView;
        CardView cardView = new CardView(context, null);
        cardView.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, f()));
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -2);
        fVar.c(new BottomSheetBehavior());
        cardView.setLayoutParams(fVar);
        cardView.setElevation(cn70.a() * 6.0f);
        cardView.setTranslationZ(cn70.a() * 6.0f);
        bwt0.d(cardView, cn70.a() * 16.0f, (r4 & 2) != 0, (r4 & 4) != 0);
        cardView.setId(R.id.sticker_suggestion_card);
        this.i = cardView;
        BottomSheetBehavior<CardView> L = BottomSheetBehavior.L(cardView);
        L.V(true);
        float f2 = this.E;
        ojf0 ojf0Var2 = this.x;
        L.W((int) (f2 * (ojf0Var2 != null ? ojf0Var2.c : 1.7f)), false);
        L.D(new hk5(this));
        this.j = L;
        coordinatorLayout.addView(cardView);
        cardView.addView(longtapRecyclerView, new CoordinatorLayout.f(-1, -2));
        this.w = new com.vk.stickers.autosuggest.a();
        editText.addTextChangedListener(kk5Var);
        kcl0Var.h();
        editText.addOnAttachStateChangeListener(new a(bVar));
        io.reactivex.rxjava3.subjects.f<icl0> fVar2 = y8l0.a.a;
        rr rrVar = new rr(new ve0(2));
        fVar2.getClass();
        bVar.b(new i0(fVar2, rrVar).U(new s41(new md(6), 5)).a0(asu0.a.d()).subscribe(new j22(new pd(this, 8), 4)));
        ify.g(this);
        ify.a(this);
    }

    public static boolean z(StickersDictionaryItem stickersDictionaryItem) {
        List<PackPreviewItem> list;
        List<StickerItem> list2;
        List<StickerItem> list3;
        return !(stickersDictionaryItem == null || (list3 = stickersDictionaryItem.c) == null || !(list3.isEmpty() ^ true)) || !(stickersDictionaryItem == null || (list2 = stickersDictionaryItem.d) == null || !(list2.isEmpty() ^ true)) || (!(stickersDictionaryItem == null || (list = stickersDictionaryItem.e) == null || !(list.isEmpty() ^ true)) || (stickersDictionaryItem != null && stickersDictionaryItem.f));
    }

    public final void A(boolean z) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{zhy0.a("isVisible = ", z)});
        }
        this.h.setVisibility(z ? 0 : 8);
        BottomSheetBehavior<CardView> bottomSheetBehavior = this.j;
        if (z) {
            ViewGroup viewGroup = this.g;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            bottomSheetBehavior.X(4);
        } else {
            bottomSheetBehavior.X(5);
        }
        this.m = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (xsna.fnj.b(r0 != null ? r0 : null) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int B() {
        int i;
        int i2 = h9l0.a;
        Context context = this.b;
        int i3 = 4;
        if (context.getResources().getConfiguration().orientation == 2) {
            HashSet hashSet = iah0.a;
            if (!fnj.b(context)) {
                i = 6;
            }
            i = 12;
        } else {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            HashSet hashSet2 = iah0.a;
            if (!fnj.b(context2)) {
                i = 4;
            }
            i = 12;
        }
        if (fnj.b(context)) {
            int o = context.getResources().getDisplayMetrics().widthPixels / o();
            if (o >= i) {
                int z = iah0.z(context);
                if (context.getResources().getConfiguration().orientation == 2) {
                    if (!fnj.b(context)) {
                        i3 = 6;
                        if ((z / i3) - (I * 5) <= this.G) {
                        }
                    }
                    i3 = 12;
                    if ((z / i3) - (I * 5) <= this.G) {
                    }
                } else {
                    Context context3 = e43.a;
                }
            }
            return o;
        }
        return i;
    }

    public final c5l0 C() {
        return (c5l0) this.p.getValue();
    }

    public final int D() {
        HashSet hashSet = iah0.a;
        Context context = this.b;
        fnj.b(context);
        return fnj.b(context) ? cn70.b(6) : cn70.b(2);
    }

    public final void E() {
        d2 v0 = this.C.v0(400L, TimeUnit.MILLISECONDS);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c f2 = io.reactivex.rxjava3.kotlin.c.f(2, new a0(v0.r0(asu0Var.c()).s0(new ox0(new ns1(this, 5), 5)).a0(asu0Var.d()), new ek5(this, 0)), null, new f(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logOrFail", "logOrFail(Ljava/lang/Throwable;)V", 0), new e(1, this, AutoSuggestStickersPopupWindow.class, "onNextTextEntered", "onNextTextEntered(Lcom/vk/dto/stickers/StickersDictionaryItem;)V", 0));
        io.reactivex.rxjava3.disposables.c cVar = this.k;
        if (cVar != null) {
            cVar.dispose();
        }
        this.k = f2;
        this.t.b(f2);
    }

    public final void F(int i) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{lhg.a(i, "peekHeight=")});
        }
        this.j.W(i, false);
        this.h.setMinimumHeight(i);
    }

    @Override // xsna.ify.a
    public final void Y0() {
        if (this.j.M != 3) {
            A(false);
        }
    }

    @Override // xsna.mj0
    public final void a(int i) {
        this.e.n(i);
    }

    @Override // xsna.mj0
    public final String b() {
        return this.D;
    }

    @Override // xsna.amv
    public final boolean c() {
        return this.m;
    }

    @Override // xsna.amv
    public final void d() {
        try {
            this.b.unregisterReceiver(this.z);
        } catch (Exception unused) {
        }
    }

    @Override // xsna.amv
    public final void disable() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"disable"});
        }
        this.f.set(false);
        r();
        this.c.removeTextChangedListener(this.s);
        this.t.e();
        this.k = null;
        ify.g(this);
    }

    @Override // xsna.amv
    public final void e(QuickStickerSuggestState quickStickerSuggestState) {
        if (this.l != quickStickerSuggestState) {
            this.C.onNext(this.D);
        }
        this.l = quickStickerSuggestState;
    }

    @Override // xsna.amv
    public final void enable() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{com.ironsource.mediationsdk.metadata.a.j});
        }
        this.f.set(true);
        EditText editText = this.c;
        kk5 kk5Var = this.s;
        editText.removeTextChangedListener(kk5Var);
        editText.addTextChangedListener(kk5Var);
        ify.g(this);
        ify.a(this);
    }

    @Override // xsna.mj0
    public final Context f() {
        if (v()) {
            dhr0.a.getClass();
            return dhr0.s();
        }
        dhr0.a.getClass();
        return dhr0.y();
    }

    @Override // xsna.amv
    public final void g() {
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"hideInstantly"});
        }
        l.getClass();
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"isVisible = false"});
        }
        this.h.setVisibility(8);
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        w(null);
    }

    @Override // xsna.amv
    public final void h(boolean z) {
        u390 u390Var = C().c;
        u390Var.c = z;
        u390Var.f();
    }

    @Override // xsna.amv
    public final void i() {
        this.D = "";
    }

    @Override // xsna.amv
    public final AtomicBoolean isEnabled() {
        return this.f;
    }

    @Override // xsna.amv
    public final void j() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"onConfigurationChanged"});
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.requestLayout();
        }
        this.E = o();
        RecyclerView.o layoutManager = this.n.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int B = B();
            if (B < 1) {
                B = 1;
            }
            gridLayoutManager.setSpanCount(B);
        }
        float f2 = this.E;
        ojf0 ojf0Var = this.x;
        F((int) (f2 * (ojf0Var != null ? ojf0Var.c : 1.7f)));
        int f3 = e3m.f(R.attr.vk_ui_background_content, f());
        CardView cardView = this.i;
        cardView.setBackgroundColor(f3);
        ojf0 ojf0Var2 = this.x;
        cardView.setAlpha((ojf0Var2 == null || !ojf0Var2.f) ? 1.0f : 0.88f);
    }

    @Override // xsna.amv
    public final void k(ojf0 ojf0Var) {
        this.x = ojf0Var;
        boolean z = ojf0Var.b;
        LongtapRecyclerView longtapRecyclerView = this.n;
        longtapRecyclerView.setClipToPadding(z);
        int i = H;
        int i2 = ojf0Var.a;
        int i3 = I;
        longtapRecyclerView.setPadding(i3, i, i3, i2);
        int f2 = e3m.f(R.attr.vk_ui_background_content, f());
        CardView cardView = this.i;
        cardView.setBackgroundColor(f2);
        cardView.setAlpha(ojf0Var.f ? 0.88f : 1.0f);
    }

    @Override // xsna.amv
    public final void l(View view) {
        this.y = view;
        this.n.addOnScrollListener(new g(view, this));
    }

    @Override // xsna.amv
    public final void m(jzb0 jzb0Var) {
        u390 u390Var = C().c;
        u390Var.e = jzb0Var;
        u390Var.f();
    }

    @Override // xsna.amv
    public final int n() {
        return this.E;
    }

    @Override // xsna.mj0
    public final int o() {
        Context context = this.b;
        int z = iah0.z(context);
        int i = h9l0.a;
        int i2 = 12;
        if (context.getResources().getConfiguration().orientation != 2) {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            if (!fnj.b(context2)) {
                i2 = 4;
            }
        } else if (!fnj.b(context)) {
            i2 = 6;
        }
        int i3 = (z / i2) - (I * 5);
        if (fnj.b(context)) {
            int i4 = this.F;
            if (i3 >= 0 && i3 <= i4) {
                return i4;
            }
            int i5 = this.G;
            if (i3 > i5 || i4 > i3) {
                return i5;
            }
        }
        return i3;
    }

    @Override // xsna.mj0
    public final UserId p() {
        StickersView.c cVar = this.e;
        List<UserId> h = cVar.h();
        if (h.size() != 1) {
            return null;
        }
        ContextUser contextUser = this.q;
        if (contextUser != null) {
            return contextUser.b;
        }
        if (h.iterator().next().b <= 0) {
            return null;
        }
        ContextUser e2 = cVar.e();
        this.q = e2;
        if (e2 != null) {
            return e2.b;
        }
        return null;
    }

    @Override // xsna.amv
    public final void q() {
        anj.d(this.b, this.z, this.A, hf8.a, 4);
    }

    @Override // xsna.amv
    public final void r() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"hidePopup"});
        }
        w(null);
    }

    @Override // xsna.amv
    public final void s(boolean z) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{zhy0.a("hidePopup isOnlyForPopup=", z)});
        }
        if (!z || this.g == null) {
            w(null);
        }
    }

    @Override // xsna.amv
    public final void setAutoSuggestTextProvider(lk5 lk5Var) {
        this.v = lk5Var;
    }

    @Override // xsna.amv
    public final void setBottomSheetContainer(ViewGroup viewGroup) {
        this.g = viewGroup;
        CoordinatorLayout coordinatorLayout = this.h;
        if (viewGroup == null || viewGroup.indexOfChild(coordinatorLayout) < 0) {
            viewGroup.addView(coordinatorLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        float f2 = this.E;
        ojf0 ojf0Var = this.x;
        F((int) (f2 * (ojf0Var != null ? ojf0Var.c : 1.7f)));
        int i = 8;
        coordinatorLayout.setVisibility(8);
        View view = this.y;
        if (view != null) {
            if (this.m && !this.o.h.isEmpty() && this.j.M != 5) {
                i = 0;
            }
            view.setVisibility(i);
        }
        r();
    }

    @Override // xsna.amv
    public final void t(int i) {
        C().c.f = i;
    }

    @Override // xsna.amv
    public final void u() {
        this.t.e();
        E();
        this.C.onNext(this.D);
    }

    @Override // xsna.mj0
    public final boolean v() {
        ojf0 ojf0Var;
        return dhr0.a.c(this.b) || ((ojf0Var = this.x) != null && ojf0Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // xsna.amv
    public final void w(StickersDictionaryItem stickersDictionaryItem) {
        GiftSuggestionConfig giftSuggestionConfig;
        StickersDictionaryItem stickersDictionaryItem2 = stickersDictionaryItem;
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"autoSuggestStickers = " + stickersDictionaryItem2});
        }
        this.r = stickersDictionaryItem2;
        ?? r4 = 0;
        uj5 uj5Var = this.o;
        if (stickersDictionaryItem2 != null) {
            List<StickerItem> list = stickersDictionaryItem2.d;
            List<StickerItem> list2 = stickersDictionaryItem2.c;
            EditText editText = this.c;
            if (editText.getMeasuredHeight() != 0) {
                if (!z(stickersDictionaryItem2)) {
                    A(false);
                    uj5Var.z0(EmptyList.b, stickersDictionaryItem2);
                    return;
                }
                l.getClass();
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"userStickersSize = " + list2.size() + ", promotedStickersSize = " + list.size()});
                }
                List<StickerItem> list3 = list2;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new b.d((StickerItem) it.next()));
                }
                List<PackPreviewItem> list4 = stickersDictionaryItem2.e;
                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new b.c((PackPreviewItem) it2.next()));
                }
                int B = B();
                ArrayList arrayList3 = new ArrayList();
                if (stickersDictionaryItem2.f) {
                    t6g0 t6g0Var = t6g0.b;
                    t6g0.d().o().getClass();
                    HashMap<UserId, kbl0> hashMap = kbl0.b;
                    String s = Preference.s(kbl0.a.b().a, "stickers_gift_suggest_config", "");
                    if (s.length() == 0) {
                        giftSuggestionConfig = new GiftSuggestionConfig(null, null, null, null, 15, null);
                    } else {
                        try {
                            Serializer.c<GiftSuggestionConfig> cVar = GiftSuggestionConfig.CREATOR;
                            giftSuggestionConfig = GiftSuggestionConfig.a.a(new JSONObject(s));
                        } catch (Throwable unused) {
                            giftSuggestionConfig = new GiftSuggestionConfig(null, null, null, null, 15, null);
                        }
                    }
                    if (giftSuggestionConfig.zb() != null) {
                        arrayList3.add(new b.C1792b(giftSuggestionConfig));
                    }
                }
                StickerItem stickerItem = stickersDictionaryItem2.h;
                if (stickerItem != null) {
                    arrayList3.add(new b.e(stickerItem));
                }
                ArrayList u0 = j5g.u0(arrayList, arrayList2);
                this.w.getClass();
                ListBuilder e2 = e43.e();
                Iterator it3 = u0.iterator();
                Iterator<StickerItem> it4 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it3.hasNext() && !it4.hasNext()) {
                        break;
                    }
                    if (e2.size() > 0 && e2.size() % B == 0 && it4.hasNext()) {
                        if (u0.size() - i < B) {
                            int size = u0.size() - i;
                            ListBuilder e3 = e43.e();
                            int i2 = r4;
                            while (i2 < B && (it3.hasNext() || it4.hasNext())) {
                                if (size < B - i2 && it4.hasNext()) {
                                    e3.add(new b.d(it4.next()));
                                } else if (it3.hasNext()) {
                                    e3.add(it3.next());
                                } else {
                                    i2 = B;
                                }
                                i2++;
                            }
                            e2.addAll(e3.g());
                        } else {
                            e2.add(new b.d(it4.next()));
                        }
                    } else if (it3.hasNext()) {
                        i++;
                        e2.add(it3.next());
                    } else {
                        e2.add(new b.d(it4.next()));
                    }
                    r4 = 0;
                }
                g5g.y(e2.g(), arrayList3);
                if (arrayList3.isEmpty() || editText.getWindowToken() == null) {
                    A(r4);
                    uj5Var.z0(EmptyList.b, stickersDictionaryItem2);
                    return;
                } else {
                    uj5Var.z0(arrayList3, stickersDictionaryItem2);
                    this.n.scrollToPosition(r4);
                    A(true);
                    return;
                }
            }
        }
        A(false);
        EmptyList emptyList = EmptyList.b;
        if (stickersDictionaryItem2 == null) {
            stickersDictionaryItem2 = new StickersDictionaryItem(null, null, null, null, false, 31, null);
        }
        uj5Var.z0(emptyList, stickersDictionaryItem2);
    }

    @Override // xsna.mj0
    public final int x() {
        int i = h9l0.a;
        return this.g == null ? h9l0.d : h9l0.c;
    }

    @Override // xsna.mj0
    public final void y(int i, Context context) {
        List<StickerItem> list;
        StickerItem stickerItem;
        fk5 fk5Var = new fk5(this, i, 0);
        StickerStockItem I2 = this.d.I(i);
        if (I2 == null || (list = I2.g) == null || (stickerItem = (StickerItem) j5g.a0(list)) == null) {
            return;
        }
        this.o.y0(stickerItem.b, context, fk5Var);
    }

    /* compiled from: AutoSuggestStickersPopupWindow.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ io.reactivex.rxjava3.disposables.b b;

        public a(io.reactivex.rxjava3.disposables.b bVar) {
            this.b = bVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            this.b.e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
    }
}
