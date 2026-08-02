package com.vk.voip.ui.settings.participants_view;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.voip.ui.VoipHintsLauncher;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.bod;
import xsna.bwt0;
import xsna.bzb0;
import xsna.cn70;
import xsna.d02;
import xsna.e5;
import xsna.ec;
import xsna.f4m;
import xsna.fpf0;
import xsna.go1;
import xsna.gqg;
import xsna.h5;
import xsna.hb;
import xsna.hh1;
import xsna.i330;
import xsna.iah0;
import xsna.iz;
import xsna.j5g;
import xsna.ju1;
import xsna.kxa;
import xsna.l7s;
import xsna.l89;
import xsna.nz;
import xsna.o89;
import xsna.ou5;
import xsna.oz;
import xsna.p60;
import xsna.p89;
import xsna.pn8;
import xsna.pv7;
import xsna.rru;
import xsna.ujq;
import xsna.ul1;
import xsna.vl1;

/* compiled from: CallParticipantsView.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes7.dex */
public final class c {
    public final l7s a;
    public final VoipHintsLauncher b;
    public final LinearLayoutManager c;
    public final com.vk.voip.ui.settings.participants_view.a d;
    public final View e;
    public final View f;
    public final VkButton g;
    public final ViewGroup h;
    public final Toolbar i;
    public final VkSearchView j;
    public final ViewGroup k;
    public final RecyclerView l;
    public final View m;
    public final View n;
    public final TextView o;
    public final bzb0 p;
    public final i330<CallParticipantsViewModel> q;
    public final io.reactivex.rxjava3.subjects.f<j> r;
    public final io.reactivex.rxjava3.disposables.b s;
    public boolean t;
    public final Handler u;
    public final a v;
    public boolean w;
    public boolean x;

    /* compiled from: CallParticipantsView.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.w) {
                RecyclerView recyclerView = cVar.l;
                LinearLayoutManager linearLayoutManager = cVar.c;
                if (!cVar.x) {
                    int v = linearLayoutManager.v();
                    int x = linearLayoutManager.x();
                    boolean z = recyclerView.getScrollState() == 0;
                    if (v >= 0 && x >= 0 && z) {
                        View view = null;
                        if (v <= x) {
                            View view2 = null;
                            while (true) {
                                RecyclerView.e0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(v);
                                CallSettingsItem callSettingsItem = (CallSettingsItem) j5g.b0(findViewHolderForLayoutPosition != null ? findViewHolderForLayoutPosition.getAdapterPosition() : -1, cVar.d.e.d);
                                boolean z2 = (callSettingsItem instanceof CallSettingsItem.CallParticipant) && !((CallSettingsItem.CallParticipant) callSettingsItem).e;
                                if (cVar.w && z2) {
                                    View findViewByPosition = linearLayoutManager.findViewByPosition(v);
                                    view2 = findViewByPosition != null ? findViewByPosition.findViewById(R.id.name) : null;
                                }
                                if (v == x) {
                                    break;
                                } else {
                                    v++;
                                }
                            }
                            view = view2;
                        }
                        if (view != null) {
                            boolean z3 = view.getMeasuredWidth() > 0 || view.getMeasuredHeight() > 0;
                            boolean isLaidOut = view.isLaidOut();
                            boolean hasTransientState = view.hasTransientState();
                            if (z3 && isLaidOut && !hasTransientState) {
                                cVar.w = false;
                                cVar.x = true;
                                cVar.b.a(view, VoipHintsLauncher.Hint.MEMBERS_ACTIONS, new hh1(cVar, 8));
                            }
                        }
                    }
                }
                if (cVar.w) {
                    cVar.h.postDelayed(this, 250L);
                }
            }
        }
    }

    /* compiled from: CallParticipantsView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallParticipantsViewModel.BottomControlState.values().length];
            try {
                iArr[CallParticipantsViewModel.BottomControlState.ADD_BUTTON_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallParticipantsViewModel.BottomControlState.ADD_BUTTON_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallParticipantsViewModel.BottomControlState.ADD_BUTTON_ENABLED_SINGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallParticipantsViewModel.BottomControlState.SHARE_BUTTON_SINGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CallParticipantsViewModel.BottomControlState.HIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(ViewGroup viewGroup, l7s l7sVar, VoipHintsLauncher voipHintsLauncher) {
        this.a = l7sVar;
        this.b = voipHintsLauncher;
        LayoutInflater from = LayoutInflater.from(l7sVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.c = linearLayoutManager;
        com.vk.voip.ui.settings.participants_view.a aVar = new com.vk.voip.ui.settings.participants_view.a(from, new com.vk.movika.sdk.base.observable.a(this, 11));
        this.d = aVar;
        this.e = viewGroup.findViewById(R.id.bottom_control_container);
        View findViewById = viewGroup.findViewById(R.id.invite_btn_new);
        this.f = findViewById;
        VkButton vkButton = (VkButton) viewGroup.findViewById(R.id.share_link_btn);
        this.g = vkButton;
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(R.layout.voip_participants_view, (ViewGroup) null, false);
        this.h = viewGroup2;
        Toolbar toolbar = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
        this.i = toolbar;
        VkSearchView vkSearchView = (VkSearchView) viewGroup2.findViewById(R.id.search);
        this.j = vkSearchView;
        this.k = (ViewGroup) viewGroup2.findViewById(R.id.content);
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.list);
        this.l = recyclerView;
        this.m = viewGroup2.findViewById(R.id.progress);
        this.n = viewGroup2.findViewById(R.id.error);
        this.o = (TextView) viewGroup2.findViewById(R.id.error_text);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.error_retry);
        this.p = new bzb0(l7sVar);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(new bod(2), new com.vk.movika.sdk.base.observable.k(this, 12), new kxa((byte) 0, 5)));
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        arrayList2.add(new i330.b(d.b, new com.vk.movika.sdk.base.observable.m(this, 15), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(CallParticipantsViewModel.b.a.class), new i330(arrayList2, hashMap2));
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        arrayList3.add(new i330.b(e.b, new iz(this, 4), new gqg((byte) 0, 1)));
        hashMap.put(fpf0.a(CallParticipantsViewModel.b.C2084b.class), new i330(arrayList3, hashMap3));
        i330 i330Var = new i330(arrayList, hashMap);
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        arrayList4.add(new i330.b(new bod(2), new com.vk.movika.sdk.base.observable.o(this, 11), new kxa((byte) 0, 5)));
        i330 i330Var2 = new i330(arrayList4, hashMap4);
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap5 = new HashMap();
        arrayList5.add(new i330.b(new bod(2), new vl1(this, 12), new kxa((byte) 0, 5)));
        i330 i330Var3 = new i330(arrayList5, hashMap5);
        i330.a aVar2 = new i330.a();
        int i = 13;
        pn8.a(aVar2, p89.b, new h5(this, i));
        pn8.a(aVar2, f.b, new hb(i330Var, i));
        pn8.a(aVar2, g.b, new com.vk.movika.sdk.base.observable.c(this, 14));
        pn8.a(aVar2, h.b, new go1(i330Var2, 15));
        pn8.a(aVar2, i.b, new com.vk.movika.sdk.base.observable.e(i330Var3, 14));
        this.q = aVar2.b();
        this.r = new io.reactivex.rxjava3.subjects.f<>();
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.s = bVar;
        this.t = true;
        Handler handler = new Handler(Looper.getMainLooper());
        this.u = handler;
        a aVar3 = new a();
        this.v = aVar3;
        this.w = true;
        toolbar.l(R.menu.voip_menu_participants);
        toolbar.setOnMenuItemClickListener(new ju1(this, 5));
        toolbar.setVisibility(0);
        f4m.j(vkSearchView);
        vkSearchView.setVoiceInputEnabled(false);
        vkSearchView.setOnBackClickListener(new defpackage.i(this, 10));
        bVar.b(new y(d02.y(vkSearchView, 200L, 2).U(new nz(new p60(6), 6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new oz(new e5(this, 14), 5)));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(aVar);
        androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g();
        gVar.g = false;
        recyclerView.setItemAnimator(gVar);
        recyclerView.addItemDecoration(new l89());
        recyclerView.addItemDecoration(new ujq(0, iah0.a(16), 7));
        recyclerView.setRecycledViewPool(new rru());
        recyclerView.setHasFixedSize(true);
        recyclerView.setOnTouchListener(new o89(this, 0));
        bwt0.i0(findViewById, new ul1(this, 12));
        bwt0.i0(vkButton, new com.vk.movika.sdk.base.observable.g(this, 11));
        bwt0.i0(textView, new ec(this, 14));
        this.t = true;
        handler.postDelayed(aVar3, 250L);
    }

    public final void a(j jVar) {
        this.r.onNext(jVar);
    }

    public final void b(boolean z) {
        if (!z) {
            f4m.v(cn70.b(0), this.l);
        } else {
            this.e.post(new ou5(this, 1));
        }
    }
}
