package com.vk.toggle.debug;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.observable.k;
import com.vk.movika.sdk.base.observable.m;
import com.vk.movika.sdk.base.observable.o;
import com.vk.movika.sdk.base.observable.q;
import com.vk.toggle.b;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vk.toggle.internal.ToggleManager;
import com.vkontakte.android.R;
import defpackage.d;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.subjects.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import xsna.ai0;
import xsna.asu0;
import xsna.b0r0;
import xsna.blk;
import xsna.bvq;
import xsna.c5g;
import xsna.d02;
import xsna.d0r0;
import xsna.drm0;
import xsna.enj;
import xsna.f1p0;
import xsna.f4m;
import xsna.fnj;
import xsna.fpf0;
import xsna.g1p0;
import xsna.g5g;
import xsna.h1p0;
import xsna.hfz;
import xsna.hkb;
import xsna.iah0;
import xsna.itg0;
import xsna.j5g;
import xsna.jv;
import xsna.jw5;
import xsna.k22;
import xsna.kc6;
import xsna.kf3;
import xsna.nc6;
import xsna.oa6;
import xsna.orl;
import xsna.qhh0;
import xsna.qs2;

/* compiled from: BaseDebugTogglesFragment.kt */
/* loaded from: classes6.dex */
public abstract class BaseDebugTogglesFragment extends FragmentImpl implements qhh0 {
    public static final /* synthetic */ int X = 0;
    public RecyclerView N;
    public VkSearchView O;
    public LinearLayoutManager P;
    public String Q;
    public h1p0 R;
    public ProgressBar S;
    public VkButton T;
    public VkButton U;
    public final g V = g.N0();
    public final kc6 W = new ToggleManager.Sync.a() { // from class: xsna.kc6
        @Override // com.vk.toggle.internal.ToggleManager.Sync.a
        public final void a(ToggleManager.Sync sync) {
            BaseDebugTogglesFragment baseDebugTogglesFragment = BaseDebugTogglesFragment.this;
            baseDebugTogglesFragment.V.onNext(sync);
            if (BaseDebugTogglesFragment.a.$EnumSwitchMapping$0[sync.ordinal()] == 1) {
                baseDebugTogglesFragment.V.onComplete();
            }
        }
    };

    /* compiled from: BaseDebugTogglesFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleManager.Sync.values().length];
            try {
                iArr[ToggleManager.Sync.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleManager.Sync.Empty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleManager.Sync.NotSynced.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ToggleManager.Sync.InProgress.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Boolean.valueOf(((h1p0.e) t2).c), Boolean.valueOf(((h1p0.e) t).c));
        }
    }

    public abstract d0r0 eo();

    public abstract boolean fo();

    public final Pair<String, List<hfz>> go(String str) {
        ArrayList<b.d> arrayList;
        int i;
        d0r0 eo = eo();
        synchronized (eo) {
            try {
                arrayList = new ArrayList();
                bvq bvqVar = eo.a.n;
                if (bvqVar == null) {
                    bvqVar = null;
                }
                Iterator it = bvqVar.getSupportedFeatures().iterator();
                while (it.hasNext()) {
                    b.d j = eo.a.j((String) it.next(), true);
                    if (j != null) {
                        arrayList.add(new b0r0(j));
                    }
                }
                final hkb hkbVar = new hkb(12);
                g5g.L(arrayList, new Comparator() { // from class: xsna.c0r0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((Number) hkb.this.invoke(obj, obj2)).intValue();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = 0;
        if (str.length() != 0) {
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            Locale locale2 = Locale.ROOT;
            String M = blk.M(lowerCase.toLowerCase(locale2));
            String N = blk.N(str.toLowerCase(locale).toLowerCase(locale2));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                String lowerCase2 = ((b.d) next).b.toString().toLowerCase(Locale.ENGLISH);
                if (drm0.D(lowerCase2, M, false) || drm0.D(lowerCase2, N, false)) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
        for (b.d dVar : arrayList) {
            d0r0 eo2 = eo();
            String obj = dVar.b.toString();
            Pair pair = new Pair(eo2.a.h.b(obj, false), eo2.a.h.b(obj, true));
            b.d dVar2 = (b.d) pair.d();
            b.d dVar3 = (b.d) pair.g();
            eo().getClass();
            boolean b2 = d0r0.b(dVar2, dVar3);
            String obj2 = dVar2 != null ? dVar2.c.toString() : null;
            if (obj2 == null) {
                obj2 = "";
            }
            String obj3 = dVar3 != null ? dVar3.c.toString() : null;
            if (obj3 == null) {
                obj3 = "";
            }
            arrayList3.add(new h1p0.e(dVar, b2, obj2, obj3));
        }
        ArrayList arrayList4 = new ArrayList(j5g.D0(new b(), arrayList3));
        if (fo()) {
            long j2 = eo().a().getLong("another_user_id", 0L);
            UserId userId = j2 > 0 ? new UserId(j2) : null;
            if (userId != null) {
                arrayList4.add(0, new h1p0.a(userId, true));
            } else {
                arrayList4.add(0, new h1p0.a(null, false));
            }
        }
        Iterator it3 = arrayList4.iterator();
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it3.hasNext()) {
                i3 = -1;
                break;
            }
            hfz hfzVar = (hfz) it3.next();
            if ((hfzVar instanceof h1p0.e) && ((h1p0.e) hfzVar).c) {
                break;
            }
            i3++;
        }
        Iterator it4 = arrayList4.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            hfz hfzVar2 = (hfz) it4.next();
            if ((hfzVar2 instanceof h1p0.e) && !((h1p0.e) hfzVar2).c) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            arrayList4.add(i, new h1p0.c(R.string.debug_remote_toggles));
        }
        if (i3 >= 0) {
            arrayList4.add(i3, new h1p0.c(R.string.debug_local_toggles));
        }
        return new Pair<>(str, arrayList4);
    }

    public final void ho() {
        enj.q(R.string.debug_no_toggles, 0, requireContext());
        RecyclerView recyclerView = this.N;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        VkSearchView vkSearchView = this.O;
        if (vkSearchView == null) {
            vkSearchView = null;
        }
        vkSearchView.setVisibility(0);
        ProgressBar progressBar = this.S;
        if (progressBar == null) {
            progressBar = null;
        }
        f4m.j(progressBar);
        VkButton vkButton = this.T;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setVisibility(0);
        VkButton vkButton2 = this.U;
        (vkButton2 != null ? vkButton2 : null).setVisibility(0);
    }

    public final void io() {
        RecyclerView recyclerView = this.N;
        if (recyclerView == null) {
            recyclerView = null;
        }
        f4m.j(recyclerView);
        VkSearchView vkSearchView = this.O;
        if (vkSearchView == null) {
            vkSearchView = null;
        }
        f4m.j(vkSearchView);
        ProgressBar progressBar = this.S;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(0);
        VkButton vkButton = this.T;
        if (vkButton == null) {
            vkButton = null;
        }
        f4m.j(vkButton);
        VkButton vkButton2 = this.U;
        f4m.j(vkButton2 != null ? vkButton2 : null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.V.onNext(eo().a.d);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.debug_toggles_fragment, viewGroup, false);
        this.N = (RecyclerView) inflate.findViewById(R.id.list);
        this.O = (VkSearchView) inflate.findViewById(R.id.toggle_search_view);
        layoutInflater.getContext();
        this.P = new LinearLayoutManager();
        this.S = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.T = (VkButton) inflate.findViewById(R.id.load_toggles_button);
        this.U = (VkButton) inflate.findViewById(R.id.restart_app_button);
        d0r0 eo = eo();
        nc6 nc6Var = new nc6(this);
        h1p0 h1p0Var = new h1p0();
        h1p0Var.H0(new Pair(fpf0.a(h1p0.e.class), new f1p0(0, eo, nc6Var)));
        h1p0Var.H0(new Pair(fpf0.a(h1p0.c.class), g1p0.b));
        h1p0Var.H0(new Pair(fpf0.a(h1p0.a.class), new k22(27, eo, nc6Var)));
        this.R = h1p0Var;
        RecyclerView recyclerView = this.N;
        if (recyclerView == null) {
            recyclerView = null;
        }
        LinearLayoutManager linearLayoutManager = this.P;
        if (linearLayoutManager == null) {
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        h1p0 h1p0Var2 = this.R;
        if (h1p0Var2 == null) {
            h1p0Var2 = null;
        }
        recyclerView.setAdapter(h1p0Var2);
        int i = requireContext().getResources().getConfiguration().screenWidthDp;
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        int a2 = fnj.d(requireContext) ? iah0.a(Math.max(16, (i - 984) / 2)) : 0;
        RecyclerView recyclerView2 = this.N;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setScrollBarStyle(33554432);
        RecyclerView recyclerView3 = this.N;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setClipToPadding(false);
        RecyclerView recyclerView4 = this.N;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.setPadding(a2, 0, a2, 0);
        Pair<String, List<hfz>> go = go("");
        String d = go.d();
        List<hfz> g = go.g();
        this.Q = d;
        h1p0 h1p0Var3 = this.R;
        if (h1p0Var3 == null) {
            h1p0Var3 = null;
        }
        h1p0Var3.setItems(g);
        LinearLayoutManager linearLayoutManager2 = this.P;
        if (linearLayoutManager2 == null) {
            linearLayoutManager2 = null;
        }
        linearLayoutManager2.K(0, 0);
        RecyclerView recyclerView5 = this.N;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        recyclerView5.getPaddingBottom();
        VkSearchView vkSearchView = this.O;
        if (vkSearchView == null) {
            vkSearchView = null;
        }
        int i2 = 1;
        vkSearchView.setVoiceInputEnabled(true);
        VkSearchView vkSearchView2 = this.O;
        if (vkSearchView2 == null) {
            vkSearchView2 = null;
        }
        orl.a(vkSearchView2);
        VkSearchView vkSearchView3 = this.O;
        if (vkSearchView3 == null) {
            vkSearchView3 = null;
        }
        vkSearchView3.X4(false);
        VkSearchView vkSearchView4 = this.O;
        if (vkSearchView4 == null) {
            vkSearchView4 = null;
        }
        j1 U = d02.y(vkSearchView4, 200L, 2).U(new kf3(new o(this, 7), 3));
        asu0 asu0Var = asu0.a;
        itg0.c(U.a0(asu0Var.d()).subscribe(new jv(new q(this, 8), 6)), this);
        VkButton vkButton = this.T;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setOnClickListener(new ai0(this, i2));
        VkButton vkButton2 = this.U;
        (vkButton2 != null ? vkButton2 : null).setOnClickListener(new oa6(this, i2));
        io();
        eo().a.e.add(this.W);
        m1 a0 = this.V.r0(asu0Var.c()).a0(asu0Var.d());
        int i3 = 11;
        itg0.c(a0.subscribe(new qs2(new k(this, i3), 4), new d(new m(this, i3), 9)), this);
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ToggleManager toggleManager = eo().a;
        toggleManager.e.remove(this.W);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView = this.N;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }
}
