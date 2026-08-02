package com.vk.stickers.keyboard;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.stickers.RecommendationsScrollMode;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerPackPreviewModel;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.keyboard.b;
import com.vk.stickers.keyboard.navigation.KeyboardNavigationButton;
import com.vk.stickers.keyboard.navigation.KeyboardNavigationVmojiPackItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.a3y0;
import xsna.a960;
import xsna.aeg0;
import xsna.anj;
import xsna.asu0;
import xsna.az1;
import xsna.b810;
import xsna.b8j0;
import xsna.bi80;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c5g;
import xsna.cck0;
import xsna.cn70;
import xsna.cvk;
import xsna.dbl0;
import xsna.dhr0;
import xsna.dj60;
import xsna.e3m;
import xsna.e4l0;
import xsna.enj;
import xsna.eos;
import xsna.ewp0;
import xsna.f4m;
import xsna.f5y;
import xsna.g2v;
import xsna.h4l0;
import xsna.hf8;
import xsna.hfz;
import xsna.i73;
import xsna.iah0;
import xsna.igy;
import xsna.iyd0;
import xsna.j5g;
import xsna.jge0;
import xsna.jgy;
import xsna.k6n0;
import xsna.k7l0;
import xsna.kbl0;
import xsna.kcl0;
import xsna.kgy;
import xsna.kr50;
import xsna.kwg0;
import xsna.l6g;
import xsna.l7s;
import xsna.mal0;
import xsna.mgy;
import xsna.nex;
import xsna.o060;
import xsna.o25;
import xsna.o860;
import xsna.obl0;
import xsna.ogy;
import xsna.pla;
import xsna.qdl0;
import xsna.r770;
import xsna.r9c0;
import xsna.ral0;
import xsna.rdl0;
import xsna.rf6;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sal0;
import xsna.sdl0;
import xsna.sdp;
import xsna.sqf0;
import xsna.t6g0;
import xsna.tb0;
import xsna.tg;
import xsna.tgy;
import xsna.vbf0;
import xsna.w110;
import xsna.w250;
import xsna.w7l0;
import xsna.wdl0;
import xsna.wfy;
import xsna.wmd0;
import xsna.wx00;
import xsna.xdl0;
import xsna.xvg0;
import xsna.xzn0;
import xsna.zal0;
import xsna.zgy;

/* compiled from: StickersView.kt */
/* loaded from: classes6.dex */
public final class StickersView extends FrameLayout implements tb0 {
    public static final AccelerateDecelerateInterpolator O = new AccelerateDecelerateInterpolator();
    public int A;
    public UserId B;
    public long C;
    public c D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ContextUser I;
    public final sqf0 J;
    public final ArrayList K;
    public com.vk.stickers.keyboard.b L;
    public final io.reactivex.rxjava3.disposables.b M;
    public final StickersView$broadcastReceiver$1 N;
    public final int b;
    public final int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final kcl0 g;
    public final kcl0.d h;
    public final Activity i;
    public final obl0 j;
    public final aeg0 k;
    public final a l;
    public final dbl0 m;
    public final xzn0 n;
    public final FrameLayout o;
    public View p;
    public final View q;
    public final TextView r;
    public final ImageView s;
    public final ImageView t;
    public final RecyclerView u;
    public final com.vk.stickers.keyboard.navigation.a v;
    public final e4l0 w;
    public final w7l0 x;
    public final xdl0 y;
    public final ral0 z;

    /* compiled from: StickersView.kt */
    public static final class a extends ViewPager {
        @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    /* compiled from: StickersView.kt */
    public static final class b extends RecyclerView.t {
        public int b;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int i3 = this.b + i;
            this.b = i3;
            StickersView stickersView = StickersView.this;
            if (Integer.MIN_VALUE > i3 || i3 > stickersView.b * 10) {
                ImageView imageView = stickersView.t;
                if (imageView != null) {
                    bwt0.p0(imageView, true);
                    return;
                }
                return;
            }
            ImageView imageView2 = stickersView.t;
            if (imageView2 != null) {
                bwt0.p0(imageView2, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.vk.stickers.keyboard.StickersView$broadcastReceiver$1] */
    public StickersView(Context context, c cVar, Window window) {
        super(context);
        this.b = cn70.b(48);
        int a2 = iah0.a(46);
        this.c = a2;
        this.d = true;
        this.e = true;
        t6g0 t6g0Var = t6g0.b;
        kcl0 d = t6g0.d();
        this.g = d;
        this.h = t6g0.d().k0();
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(context);
        this.i = h;
        this.j = g2v.d().e(h);
        this.k = (aeg0) h;
        int i = 27;
        this.w = new e4l0(new dj60(this, i));
        w7l0 w7l0Var = new w7l0(new bi80(this, 22));
        this.x = w7l0Var;
        xdl0 xdl0Var = new xdl0(new wmd0(this, 9));
        this.y = xdl0Var;
        ral0 ral0Var = new ral0(window, new kr50(this, i));
        this.z = ral0Var;
        this.A = -1;
        this.B = UserId.d;
        this.C = -1L;
        this.D = c.b;
        this.E = true;
        this.G = true;
        sqf0 sqf0Var = new sqf0(3);
        this.J = sqf0Var;
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        this.L = b.C1795b.a;
        this.M = new io.reactivex.rxjava3.disposables.b();
        this.N = new BroadcastReceiver() { // from class: com.vk.stickers.keyboard.StickersView$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    StickersView stickersView = StickersView.this;
                    if (hashCode == -1148613218) {
                        if (action.equals("com.vkontakte.android.STICKERS_NUM_NEW_ITEMS")) {
                            stickersView.k();
                        }
                    } else if (hashCode == 1791721521) {
                        if (action.equals("com.vkontakte.android.STICKERS_UPDATED")) {
                            stickersView.m(true);
                        }
                    } else if (hashCode == 2139085602 && action.equals("com.vkontakte.android.STICKERS_RELOADED")) {
                        stickersView.m(false);
                    }
                }
            }
        };
        ral0Var.l = sqf0Var;
        d dVar = new d(this);
        ral0Var.m = dVar;
        xdl0Var.c = dVar;
        w7l0Var.c = dVar;
        a aVar = new a(context);
        this.l = aVar;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.stickers_keyboard_navigation, (ViewGroup) null);
        this.o = frameLayout;
        View findViewById = frameLayout.findViewById(R.id.backspace_btn);
        this.q = findViewById;
        this.r = (TextView) frameLayout.findViewById(R.id.store_counter);
        this.s = (ImageView) frameLayout.findViewById(R.id.store_new_packs_dot);
        bwt0.i0(frameLayout.findViewById(R.id.gift_store_left_button), new iyd0(this, 5));
        int i2 = 4;
        bwt0.i0(frameLayout.findViewById(R.id.store_button), new b8j0(this, i2));
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.fast_scroll_button);
        this.t = imageView;
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.stickers_navigation);
        this.u = recyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        jge0 jge0Var = new jge0();
        jge0Var.b = d;
        jge0Var.c = new com.vk.channels.impl.channel_screen.send_msg.c(d);
        com.vk.stickers.keyboard.navigation.a aVar2 = new com.vk.stickers.keyboard.navigation.a(context, recyclerView, jge0Var, new com.vk.stickers.keyboard.c(this));
        this.v = aVar2;
        recyclerView.setAdapter(aVar2);
        xzn0 xzn0Var = new xzn0(aVar, frameLayout, findViewById, recyclerView, ral0Var, aVar2, arrayList, new cck0(this, i2));
        this.n = xzn0Var;
        dbl0 dbl0Var = new dbl0(xzn0Var, arrayList);
        this.m = dbl0Var;
        aVar.setAdapter(dbl0Var);
        aVar.addOnPageChangeListener(xzn0Var);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a2);
        layoutParams.gravity = getGravityForTabs();
        addView(frameLayout, layoutParams);
        l();
        setListener(cVar);
        g2v.d().getClass();
        imageView.setOnClickListener(new tg(this, 7));
        recyclerView.addOnScrollListener(new b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ee, code lost:
    
        if (r7 == null) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s3q0 a(StickersView stickersView, boolean z, UGCChatSettingsModel uGCChatSettingsModel, boolean z2, boolean z3) {
        boolean z4;
        ?? r8;
        List<ewp0> list;
        VmojiAvatar vmojiAvatar;
        dbl0 dbl0Var = stickersView.m;
        ArrayList arrayList = stickersView.K;
        a aVar = stickersView.l;
        com.vk.stickers.keyboard.navigation.a aVar2 = stickersView.v;
        ral0 ral0Var = stickersView.z;
        kcl0 kcl0Var = stickersView.g;
        xdl0 xdl0Var = stickersView.y;
        xzn0 xzn0Var = stickersView.n;
        w7l0 w7l0Var = stickersView.x;
        e4l0 e4l0Var = stickersView.w;
        if (!arrayList.contains(e4l0Var)) {
            e4l0Var.e = xzn0Var;
            arrayList.add(e4l0Var);
        }
        if (kcl0Var.p() == null && !BuildInfo.r() && kcl0Var.Y0() && !arrayList.contains(xdl0Var)) {
            xdl0Var.getClass();
            arrayList.add(xdl0Var);
        }
        if (!(stickersView.getContext() instanceof l7s)) {
            dhr0.W(stickersView);
        }
        if (z3 && !arrayList.contains(w7l0Var)) {
            w7l0Var.getClass();
            arrayList.add(w7l0Var);
        }
        if (stickersView.G) {
            if (!arrayList.contains(ral0Var)) {
                ral0Var.n = xzn0Var;
                arrayList.add(ral0Var);
            }
            ArrayList arrayList2 = new ArrayList(kcl0Var.f0());
            for (StickerStockItem stickerStockItem : kcl0Var.i0()) {
                if (stickerStockItem.l && !stickerStockItem.k) {
                    arrayList2.add(stickerStockItem);
                }
            }
            VmojiAvatarModel p = kcl0Var.p();
            if (p == null || (vmojiAvatar = p.b) == null || !vmojiAvatar.Cb()) {
                r8 = EmptyList.b;
            } else {
                ArrayList U = kcl0Var.U();
                r8 = new ArrayList();
                for (Object obj : U) {
                    StickerStockItem stickerStockItem2 = (StickerStockItem) obj;
                    VmojiAvatar vmojiAvatar2 = stickerStockItem2.H;
                    if (vmojiAvatar2 != null && vmojiAvatar2.Cb() && stickerStockItem2.k) {
                        r8.add(obj);
                    }
                }
            }
            List<StickerStockItem> list2 = r8;
            List<StickerItem> i = kcl0Var.i();
            List<StickerItem> c0 = kcl0Var.c0();
            if (z2) {
                Long c2 = stickersView.D.c();
                if (c2 != null) {
                    list = stickersView.h.b(c2.longValue());
                }
                list = EmptyList.b;
            } else {
                list = EmptyList.b;
            }
            List<ewp0> list3 = list;
            List<StickerPackPreviewModel> a2 = kcl0Var.X0().a();
            hfz hfzVar = null;
            vbf0 vbf0Var = (stickersView.getTabPosition() != arrayList.indexOf(ral0Var) || a2.isEmpty()) ? null : new vbf0(a2, stickersView.A);
            ContextUser contextUser = stickersView.I;
            tgy tgyVar = new tgy(arrayList2, list2, list3, i, c0, contextUser, uGCChatSettingsModel, vbf0Var);
            z4 = true;
            vbf0 vbf0Var2 = vbf0Var;
            sal0 sal0Var = ral0Var.c;
            if (sal0Var != null) {
                sal0Var.setData(tgyVar);
            }
            ral0Var.d = new ArrayList(arrayList2);
            ral0Var.e = list2;
            ral0Var.f = list3;
            ral0Var.g = i;
            ral0Var.h = c0;
            ral0Var.j = contextUser;
            ral0Var.k = uGCChatSettingsModel;
            ral0Var.i = vbf0Var2;
            stickersView.setStickersContentNavigation(new mal0(arrayList2, list2, list3, !i.isEmpty(), !c0.isEmpty(), z2, kcl0Var.p() == null && !BuildInfo.r() && kcl0Var.Y0(), z3, z));
            if (pla.e().b().a(HintId.STICKERS_UGC_ONBOARDING_TOOLTIP.getId())) {
                List<? extends hfz> list4 = aVar2.h;
                Iterator it = list4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ?? next = it.next();
                    hfz hfzVar2 = (hfz) next;
                    if ((hfzVar2 instanceof igy) && ((igy) hfzVar2).b.h() == -6) {
                        hfzVar = next;
                        break;
                    }
                }
                hfz hfzVar3 = hfzVar;
                int indexOf = list4.indexOf(hfzVar3);
                if (hfzVar3 != null) {
                    stickersView.u.getViewTreeObserver().addOnGlobalLayoutListener(new sdl0(stickersView, indexOf));
                }
            }
        } else {
            z4 = true;
        }
        PagerAdapter adapter = aVar.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        stickersView.setCurrentPage(stickersView.getTabPosition());
        int i2 = stickersView.A;
        boolean z5 = (i2 >= 0 || i2 == -7) ? z4 : false;
        if (i2 >= 0) {
            stickersView.setCurrentPage(dbl0Var.getItemPosition(ral0Var));
            sal0 sal0Var2 = ral0Var.c;
            if (sal0Var2 != null) {
                sal0Var2.b(i2);
            }
            ral0Var.r = i2;
            com.vk.stickers.keyboard.navigation.a.O0(aVar2, i2);
            stickersView.A = -1;
        } else if (i2 == -7) {
            stickersView.f(stickersView.C, stickersView.B);
            stickersView.A = -1;
            stickersView.B = UserId.d;
            stickersView.C = -1L;
        }
        if (z5) {
            aVar.getCurrentItem();
            dbl0Var.getItemPosition(w7l0Var);
        } else {
            int i3 = aVar.getCurrentItem() == 0 ? -5 : aVar2.l;
            com.vk.stickers.keyboard.navigation.a.O0(aVar2, i3);
            sal0 sal0Var3 = ral0Var.c;
            if (sal0Var3 != null) {
                sal0Var3.b(i3);
            }
            ral0Var.r = i3;
            sal0 sal0Var4 = ral0Var.c;
            if (sal0Var4 != null) {
                sal0Var4.a();
            }
        }
        if (stickersView.E) {
            boolean isEmpty = kcl0Var.X0().a().isEmpty();
            kcl0Var.X0().getClass();
            HashMap<UserId, kbl0> hashMap = kbl0.b;
            kbl0 b2 = kbl0.a.b();
            b2.getClass();
            RecommendationsScrollMode.a aVar3 = RecommendationsScrollMode.Companion;
            String s = Preference.s(b2.a, "stickers_keyboard_recommendation_scroll_mode", "");
            aVar3.getClass();
            RecommendationsScrollMode a3 = RecommendationsScrollMode.a.a(s);
            if (!isEmpty && a3 != RecommendationsScrollMode.NO_SCROLL) {
                stickersView.postDelayed(new i73(7, stickersView, a3), 400L);
            }
        }
        stickersView.E = false;
        return s3q0.a;
    }

    public static int b(StickersView stickersView) {
        return stickersView.getGravityForTabs();
    }

    public static final void c(StickersView stickersView, int i, String str) {
        if (!stickersView.d) {
            cvk.u(R.string.not_allowed_to_open_stickers_store, false);
            return;
        }
        zal0.H(g2v.d().a(), stickersView.getContext(), i, stickersView.i(), stickersView.I, str, null, 96);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r9 = (xsna.wfy) r8.h.get(r1);
        r2 = new xsna.wfy(r9.b, r9.c, r9.d, r10, r9.f);
        r10 = new java.util.ArrayList(r8.h);
        r10.set(r1, r2);
        r8.setItems(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(StickersView stickersView, int i, boolean z) {
        sal0 sal0Var = stickersView.z.c;
        if (sal0Var == null) {
            return;
        }
        com.vk.stickers.keyboard.page.a aVar = sal0Var.c;
        Iterator<? extends hfz> it = aVar.h.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            hfz next = it.next();
            if (next == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.vk.stickers.keyboard.page.BaseKeyboardItem");
            }
            rf6 rf6Var = (rf6) next;
            if (rf6Var.a() == i && (rf6Var instanceof wfy)) {
                break;
            } else {
                i2++;
            }
        }
    }

    private final int getGravityForTabs() {
        return this.D.a() ? 48 : 80;
    }

    private final int getTabPosition() {
        if (!this.D.i()) {
            return 0;
        }
        if (!this.E) {
            return this.l.getCurrentItem();
        }
        ArrayList arrayList = this.K;
        if (arrayList != null && arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((wdl0) it.next()) instanceof ral0) {
                if (this.g.w0()) {
                    return 0;
                }
                return arrayList.indexOf(this.z);
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentPage(int i) {
        this.l.setCurrentItem(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List, java.util.List<com.vk.dto.stickers.StickerStockItem>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setStickersContentNavigation(mal0 mal0Var) {
        boolean z;
        Iterator<T> it;
        Object obj;
        StickerStockItem stickerStockItem;
        Object obj2;
        com.vk.stickers.keyboard.navigation.a aVar = this.v;
        jge0 jge0Var = aVar.j;
        boolean z2 = mal0Var.d;
        boolean z3 = mal0Var.e;
        ArrayList arrayList = mal0Var.a;
        ?? r7 = mal0Var.b;
        ArrayList arrayList2 = new ArrayList();
        boolean z4 = mal0Var.i;
        if (z4) {
            aVar.l = -3;
        }
        arrayList2.add(new igy(KeyboardNavigationButton.EMOJI, false));
        if (mal0Var.g) {
            arrayList2.add(new igy(KeyboardNavigationButton.VMOJI_CREATE, false));
            if (!z3 && !z2 && z4) {
                aVar.l = -4;
            }
        }
        if (z3) {
            arrayList2.add(new igy(KeyboardNavigationButton.FAVORITES, false));
            if (z4) {
                aVar.l = -3;
            }
            aVar.m = true;
        }
        if (z2) {
            arrayList2.add(new igy(KeyboardNavigationButton.RECENT, false));
            if (!aVar.m && z4) {
                aVar.l = -1;
            }
            aVar.n = true;
        }
        if (mal0Var.h) {
            arrayList2.add(new igy(KeyboardNavigationButton.UGC_CREATE, false));
        } else if (mal0Var.f) {
            Iterator<ewp0> it2 = mal0Var.c.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new ogy(it2.next(), false, false));
            }
        }
        if (!aVar.n && !aVar.m && !((Collection) r7).isEmpty()) {
            aVar.l = ((StickerStockItem) r7.get(0)).b;
        } else if (!aVar.n && !aVar.m && !arrayList.isEmpty()) {
            aVar.l = ((StickerStockItem) arrayList.get(0)).b;
        }
        aVar.o = r7;
        if (aVar.p && r7.size() > 1) {
            StickerStockItem stickerStockItem2 = (StickerStockItem) j5g.Y(aVar.o);
            List<StickerStockItem> list = aVar.o;
            arrayList2.add(new mgy(stickerStockItem2, false, false, list, (StickerStockItem) j5g.Y(list)));
        } else if (!aVar.o.isEmpty()) {
            List<StickerStockItem> list2 = aVar.o;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (((kcl0) jge0Var.b).T0((StickerStockItem) it3.next())) {
                        break;
                    }
                }
            }
            t6g0 t6g0Var = t6g0.b;
            if (t6g0.d().j0() == null) {
                z = false;
                it = aVar.o.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((StickerStockItem) obj).k) {
                            break;
                        }
                    }
                }
                stickerStockItem = (StickerStockItem) obj;
                if (stickerStockItem != null) {
                    NotificationImage notificationImage = stickerStockItem.v;
                    t6g0 t6g0Var2 = t6g0.b;
                    arrayList2.add(new KeyboardNavigationVmojiPackItem(stickerStockItem, notificationImage, z, t6g0.d().j0()));
                }
            }
            z = true;
            it = aVar.o.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            stickerStockItem = (StickerStockItem) obj;
            if (stickerStockItem != null) {
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            StickerStockItem stickerStockItem3 = (StickerStockItem) it4.next();
            if (!stickerStockItem3.Q) {
                arrayList2.add(new kgy(stickerStockItem3, ((kcl0) jge0Var.b).T0(stickerStockItem3), false));
            }
        }
        t6g0 t6g0Var3 = t6g0.b;
        if (!t6g0.d().q0()) {
            arrayList2.add(new zgy(t6g0.d().d(), false));
        }
        g2v.d().getClass();
        arrayList2.add(new igy(KeyboardNavigationButton.SETTINGS, false));
        aVar.setItems(arrayList2);
        Iterator<T> it5 = aVar.h.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            hfz hfzVar = (hfz) obj2;
            if ((hfzVar instanceof jgy) && ((jgy) hfzVar).getId() == aVar.l) {
                break;
            }
        }
        if (((jgy) (obj2 instanceof jgy ? obj2 : null)) == null) {
            aVar.l = aVar.m ? -3 : -1;
        }
        int i = this.A;
        e4l0 e4l0Var = this.w;
        dbl0 dbl0Var = this.m;
        a aVar2 = this.l;
        ral0 ral0Var = this.z;
        if (i >= 0 || i == -7) {
            if (i == -7) {
                aVar.L0(-7, true);
                aVar.P0(-7);
                ral0Var.c(this.C, this.B);
                if (aVar2.getCurrentItem() == dbl0Var.getItemPosition(e4l0Var)) {
                    aVar.N0();
                    return;
                }
                return;
            }
            return;
        }
        int i2 = aVar.l;
        aVar.L0(i2, true);
        aVar.P0(i2);
        sal0 sal0Var = ral0Var.c;
        if (sal0Var != null) {
            sal0Var.b(i2);
        }
        ral0Var.r = i2;
        if (aVar2.getCurrentItem() == dbl0Var.getItemPosition(e4l0Var)) {
            aVar.N0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        a aVar = this.l;
        int currentItem = aVar.getCurrentItem();
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((wdl0) it.next()).onConfigurationChanged(configuration);
        }
        aVar.setAdapter(aVar.getAdapter());
        setCurrentPage(currentItem);
    }

    public final void f(long j, UserId userId) {
        dbl0 dbl0Var = this.m;
        ral0 ral0Var = this.z;
        setCurrentPage(dbl0Var.getItemPosition(ral0Var));
        ral0Var.c(j, userId);
        com.vk.stickers.keyboard.navigation.a aVar = this.v;
        aVar.L0(-7, false);
        aVar.P0(-7);
    }

    public final void g(int i) {
        if (!this.F) {
            this.A = i;
            return;
        }
        dbl0 dbl0Var = this.m;
        ral0 ral0Var = this.z;
        setCurrentPage(dbl0Var.getItemPosition(ral0Var));
        sal0 sal0Var = ral0Var.c;
        if (sal0Var != null) {
            sal0Var.b(i);
        }
        ral0Var.r = i;
        com.vk.stickers.keyboard.navigation.a.O0(this.v, i);
    }

    public final boolean getOpenStickersMarketWithoutNavigation() {
        return this.f;
    }

    public final void h(String str) {
        if (str == null) {
            UiTracker uiTracker = UiTracker.a;
            str = UiTracker.d().equals(t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY)) ? "story_answer_keyboard" : null;
        }
        String str2 = str;
        if (!this.d) {
            cvk.u(R.string.not_allowed_to_open_stickers_store, false);
            return;
        }
        List<UserId> h = this.D.h();
        ArrayList arrayList = new ArrayList(c5g.u(h, 10));
        Iterator<T> it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((UserId) it.next()).b));
        }
        int size = arrayList.size();
        List list = arrayList;
        if (size == 1) {
            boolean a2 = o25.a().a(new UserId(((Number) j5g.Y(arrayList)).longValue()));
            list = arrayList;
            if (a2) {
                list = EmptyList.b;
            }
        }
        g2v.d().a().u(getContext(), this.f, list, this.I, str2);
        this.D.m();
    }

    public final GiftData i() {
        List<UserId> h = this.D.h();
        return h.isEmpty() ? GiftData.d : new GiftData(h, true);
    }

    public final void j(UGCChatSettingsModel uGCChatSettingsModel, rdl0 rdl0Var) {
        long j = uGCChatSettingsModel.b;
        boolean z = uGCChatSettingsModel.d;
        boolean c2 = this.h.c(j);
        boolean z2 = false;
        boolean z3 = (uGCChatSettingsModel.c || z || !c2) ? false : true;
        if (this.D.f() && !c2 && uGCChatSettingsModel.e && !z) {
            z2 = true;
        }
        rdl0Var.invoke(uGCChatSettingsModel, Boolean.valueOf(z3), Boolean.valueOf(z2));
    }

    public final void k() {
        int N = this.g.N();
        String a2 = N < 10 ? l6g.a(N, "") : "9+";
        TextView textView = this.r;
        textView.setText(a2);
        ImageView imageView = this.s;
        if (N > 0) {
            textView.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            textView.setVisibility(8);
            t6g0 t6g0Var = t6g0.b;
            imageView.setVisibility(t6g0.d().O0() <= 0 ? 8 : 0);
        }
    }

    public final void l() {
        FrameLayout frameLayout = this.o;
        if (frameLayout.getLayoutParams() == null) {
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, this.c));
        }
        boolean a2 = this.D.a();
        a aVar = this.l;
        if (a2) {
            frameLayout.setElevation(aVar.getElevation() + cn70.b(2));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, cn70.b(1));
            if (this.p == null) {
                View view = new View(getContext());
                view.setBackgroundColor(e3m.f(R.attr.vk_ui_write_bar_input_border, view.getContext()));
                this.p = view;
            }
            View view2 = this.p;
            if (view2 != null) {
                view2.setTranslationZ(frameLayout.getElevation() + 1);
                view2.setOutlineProvider(null);
                if (view2.getParent() == null) {
                    addView(view2, layoutParams);
                }
            }
        } else {
            View view3 = this.p;
            if (view3 != null) {
                removeView(view3);
            }
            f4m.t(0, aVar);
        }
        bwt0.b0(getGravityForTabs(), frameLayout);
    }

    public final void m(boolean z) {
        rdl0 rdl0Var = new rdl0(this, z);
        Long c2 = this.D.c();
        if (c2 != null) {
            long longValue = c2.longValue();
            this.M.b(this.h.a(longValue).m(asu0.a.d()).subscribe(new o060(new r770(7, this, rdl0Var), 14), new w250(new qdl0(longValue, this, rdl0Var, 0), 19)));
        } else {
            UGCChatSettingsModel uGCChatSettingsModel = new UGCChatSettingsModel(0L, false, false, false, false, false, false, 127, null);
            Boolean bool = Boolean.FALSE;
            rdl0Var.invoke(uGCChatSettingsModel, bool, bool);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.j.onActivityResult(i, i2, intent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.F) {
            m(false);
            this.F = true;
        }
        k();
        aeg0 aeg0Var = this.k;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.STICKERS_UPDATED");
        intentFilter.addAction("com.vkontakte.android.STICKERS_RELOADED");
        intentFilter.addAction("com.vkontakte.android.STICKERS_NUM_NEW_ITEMS");
        anj.d(getContext(), this.N, intentFilter, hf8.a, 4);
        kcl0 kcl0Var = this.g;
        io.reactivex.rxjava3.disposables.c subscribe = kcl0Var.x0().subscribe(new a960(new b810(this, 28), 18));
        io.reactivex.rxjava3.disposables.b bVar = this.M;
        bVar.b(subscribe);
        bVar.b(kcl0Var.G().subscribe(new nex(new r9c0(this, 12), 24)));
        if (this.H) {
            kcl0Var.A();
            this.H = false;
        }
        List<UserId> h = this.D.h();
        if (h.size() == 1) {
            UserId next = h.iterator().next();
            if (next.b > 0) {
                bVar.b(rsg0.y0(new eos(next, 3), null, null, 3).subscribe(new wx00(new k7l0(this, 1), 19), kwg0.b()));
            }
        }
        kcl0Var.Z0();
        f<xvg0> fVar = h4l0.a.a;
        o860 o860Var = new o860(new w110(this, 29), 7);
        fVar.getClass();
        bVar.b(new i0(fVar, o860Var).a0(asu0.a.d()).subscribe(new f5y(this, 22)));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((wdl0) it.next()).onConfigurationChanged(configuration);
        }
        if (this.p == null) {
            this.p = new View(getContext());
        }
        View view = this.p;
        if (view != null) {
            view.setBackgroundColor(e3m.f(R.attr.vk_ui_write_bar_input_border, getContext()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aeg0 aeg0Var = this.k;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
        try {
            getContext().unregisterReceiver(this.N);
        } catch (IllegalArgumentException unused) {
        }
        this.M.e();
        this.F = false;
    }

    public final void setAllowOpenSettings(boolean z) {
        this.e = z;
    }

    public final void setAllowOpenStore(boolean z) {
        this.d = z;
    }

    public final void setAnchorViewProvider(az1 az1Var) {
        this.z.o = az1Var;
    }

    public final void setListener(c cVar) {
        this.D = cVar;
        this.q.setOnTouchListener(new com.vk.stickers.keyboard.a(cVar));
        this.w.b = cVar;
        l();
    }

    public final void setOpenStickersMarketWithoutNavigation(boolean z) {
        this.f = z;
    }

    public final void setStickersEnabled(boolean z) {
        if (this.G == z) {
            return;
        }
        this.o.setVisibility(z ? 0 : 4);
        this.G = z;
        m(false);
    }

    public final void setStickersKeyboardContext(com.vk.stickers.keyboard.b bVar) {
        this.L = bVar;
    }

    /* compiled from: StickersView.kt */
    public static abstract class c implements sdp {
        public static final a b = new a();

        /* compiled from: StickersView.kt */
        public static final class a extends c {
        }

        public boolean a() {
            return !(this instanceof a3y0);
        }

        public Long c() {
            return null;
        }

        public Long d() {
            return null;
        }

        public ContextUser e() {
            return null;
        }

        public boolean f() {
            return false;
        }

        public k6n0 g() {
            return new k6n0(false, false, false);
        }

        public List<UserId> h() {
            return Collections.EMPTY_LIST;
        }

        public boolean i() {
            return true;
        }

        public void j() {
        }

        public void k() {
        }

        public void l() {
        }

        public void m() {
        }

        public void r() {
        }

        @Override // xsna.sdp
        public void b(String str) {
        }

        public void n(int i) {
        }

        public void q(UGCStickerModel uGCStickerModel) {
        }

        public void o(int i, String str, ContextUser contextUser) {
        }

        public void p(StickerItem stickerItem, int i, String str) {
        }
    }

    public StickersView(Context context, c cVar, int i) {
        this(context, (i & 2) != 0 ? c.b : cVar, (Window) null);
    }
}
