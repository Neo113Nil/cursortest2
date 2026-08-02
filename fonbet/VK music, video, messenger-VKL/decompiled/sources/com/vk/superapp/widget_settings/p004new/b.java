package com.vk.superapp.widget_settings.p004new;

import android.os.Handler;
import android.os.Looper;
import com.vk.api.generated.superApp.dto.SuperAppActiveFeatureDto;
import com.vk.api.generated.superApp.dto.SuperAppEditWidgetSettingsSourceDto;
import com.vk.api.generated.superApp.dto.SuperAppGetAllWidgetSettingsSourceDto;
import com.vk.superapp.SuperAppFeatures;
import com.vk.superapp.dto.WidgetSettingsModalOpenSource;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.z0;
import io.reactivex.rxjava3.subjects.d;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.EmptyList;
import xsna.aox0;
import xsna.asu0;
import xsna.b2x0;
import xsna.b630;
import xsna.bi5;
import xsna.box0;
import xsna.brm0;
import xsna.c3k0;
import xsna.c5g;
import xsna.c7q0;
import xsna.drm0;
import xsna.dz2;
import xsna.epq0;
import xsna.epx;
import xsna.f870;
import xsna.fo1;
import xsna.ful0;
import xsna.gqq0;
import xsna.itg0;
import xsna.j5g;
import xsna.jw5;
import xsna.mlu0;
import xsna.mmk0;
import xsna.n0m0;
import xsna.nkh;
import xsna.nox0;
import xsna.olt0;
import xsna.prd0;
import xsna.psb;
import xsna.q7n0;
import xsna.qnx0;
import xsna.qw80;
import xsna.rsg0;
import xsna.tfx;
import xsna.tuw0;
import xsna.u5u0;
import xsna.uf3;
import xsna.ufx;
import xsna.uu1;
import xsna.v5u0;
import xsna.vks0;
import xsna.vul0;
import xsna.w6w;
import xsna.wnx0;
import xsna.xhb0;
import xsna.y730;
import xsna.yfb;
import xsna.yiz;
import xsna.yjs0;
import xsna.ynx0;
import xsna.yul0;
import xsna.z27;
import xsna.z4t0;
import xsna.znx0;

/* compiled from: WidgetSettingsInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class b implements ynx0 {
    public uu1.b f;
    public c k;
    public boolean n;
    public boolean o;
    public final f<uu1.b> a = new f<>();
    public final f<List<MiniWidgetItem>> b = new f<>();
    public final d<List<qnx0>> c = d.N0();
    public final f<nox0> d = new f<>();
    public final f<Boolean> e = new f<>();
    public final ArrayList g = new ArrayList();
    public boolean h = true;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final bi5 j = new bi5(this, 13);
    public final io.reactivex.rxjava3.disposables.b l = new io.reactivex.rxjava3.disposables.b();
    public final AtomicInteger m = new AtomicInteger(0);

    /* compiled from: WidgetSettingsInteractorImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WidgetSettingsModalOpenSource.values().length];
            try {
                iArr[WidgetSettingsModalOpenSource.MINI_WIDGET_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetSettingsModalOpenSource.MINI_WIDGET_LONG_TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetSettingsModalOpenSource.WIDGET_RIGHT_MENU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetSettingsModalOpenSource.SETTINGS_BUTTON_WIDGET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetSettingsModalOpenSource.ONBOARDING_MODAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WidgetSettingsModalOpenSource.RETURN_WIDGETS_ONBOARDING_MODAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WidgetSettingsModalOpenSource.ERROR_DIALOG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: com.vk.superapp.widget_settings.new.b$b, reason: collision with other inner class name */
    public static final class C1924b<T> implements Comparator {
        public final /* synthetic */ List b;

        public C1924b(List list) {
            this.b = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String g = ((uu1.a) t).c.g();
            List list = this.b;
            return jw5.b(Integer.valueOf(list.indexOf(g)), Integer.valueOf(list.indexOf(((uu1.a) t2).c.g())));
        }
    }

    public b(wnx0 wnx0Var) {
    }

    @Override // xsna.ynx0
    public final uu1.b a(boolean z) {
        this.h = z;
        bi5 bi5Var = this.j;
        Handler handler = this.i;
        handler.removeCallbacks(bi5Var);
        this.n = false;
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            this.o = true;
            q();
        } else {
            handler.postDelayed(new z27(this, 19), 300L);
        }
        return l(this.g, z);
    }

    @Override // xsna.ynx0
    public final z0 b() {
        f<Boolean> fVar = this.e;
        fVar.getClass();
        return new z0(fVar);
    }

    @Override // xsna.ynx0
    public final void c(String str, boolean z) {
        ArrayList arrayList;
        SuperAppActiveFeatureDto superAppActiveFeatureDto;
        r(str, z);
        yiz yizVar = new yiz();
        SuperAppEditWidgetSettingsSourceDto superAppEditWidgetSettingsSourceDto = SuperAppEditWidgetSettingsSourceDto.MENU;
        String a2 = q7n0.a().R().a(SuperAppFeatures.RequestName.GET_ALL_WIDGET_SETTINGS);
        if (a2 != null) {
            List<String> c0 = drm0.c0(a2, new String[]{StringUtils.COMMA}, 0, 6);
            arrayList = new ArrayList();
            for (String str2 : c0) {
                SuperAppActiveFeatureDto[] values = SuperAppActiveFeatureDto.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        superAppActiveFeatureDto = null;
                        break;
                    }
                    superAppActiveFeatureDto = values[i];
                    if (brm0.s(str2, superAppActiveFeatureDto.i())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (superAppActiveFeatureDto != null) {
                    arrayList.add(superAppActiveFeatureDto);
                }
            }
        } else {
            arrayList = null;
        }
        dz2 x = yfb.x(yizVar.l(z, arrayList, str, superAppEditWidgetSettingsSourceDto));
        x.q = 1;
        this.l.b(itg0.m(new a0(new c0(rsg0.y0(x, null, null, 3).y0(10L, TimeUnit.SECONDS), new v5u0(new tuw0(this, 2), 6), io.reactivex.rxjava3.internal.functions.a.c), new fo1(this, 8)).U(new qw80(new nkh(this, str, z, 2), 21)).F(new b2x0(new box0(this, str, z), 1))));
    }

    @Override // xsna.ynx0
    public final z0 d() {
        d<List<qnx0>> dVar = this.c;
        dVar.getClass();
        return new z0(dVar);
    }

    @Override // xsna.ynx0
    public final uu1.b e(List<String> list) {
        ArrayList arrayList = this.g;
        arrayList.clear();
        arrayList.addAll(list);
        o();
        uu1.b bVar = this.f;
        return l(list, bVar != null ? bVar.a : false);
    }

    @Override // xsna.ynx0
    public final z0 f() {
        f<nox0> fVar = this.d;
        fVar.getClass();
        return new z0(fVar);
    }

    @Override // xsna.ynx0
    public final void g(boolean z) {
        bi5 bi5Var = this.j;
        Handler handler = this.i;
        if (z) {
            handler.removeCallbacks(bi5Var);
            this.n = false;
            return;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            handler.postDelayed(bi5Var, this.f != null ? r5.b : 1000L);
        } else if (n()) {
            handler.postDelayed(new z27(this, 19), 300L);
        }
    }

    @Override // xsna.ynx0
    public final z0 h() {
        f<List<MiniWidgetItem>> fVar = this.b;
        fVar.getClass();
        return new z0(fVar);
    }

    @Override // xsna.ynx0
    public final void i() {
        this.i.removeCallbacks(this.j);
        this.n = false;
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    @Override // xsna.ynx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q<uu1> j(WidgetSettingsModalOpenSource widgetSettingsModalOpenSource) {
        ArrayList arrayList;
        SuperAppGetAllWidgetSettingsSourceDto superAppGetAllWidgetSettingsSourceDto;
        SuperAppActiveFeatureDto superAppActiveFeatureDto;
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            return q.B0(1L, TimeUnit.SECONDS).s0(new xhb0(new n0m0(21), 20));
        }
        String a2 = q7n0.a().R().a(SuperAppFeatures.RequestName.GET_ALL_WIDGET_SETTINGS);
        ArrayList arrayList2 = null;
        if (a2 != null) {
            List<String> c0 = drm0.c0(a2, new String[]{StringUtils.COMMA}, 0, 6);
            arrayList = new ArrayList();
            for (String str : c0) {
                SuperAppActiveFeatureDto[] values = SuperAppActiveFeatureDto.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        superAppActiveFeatureDto = null;
                        break;
                    }
                    superAppActiveFeatureDto = values[i];
                    if (brm0.s(str, superAppActiveFeatureDto.i())) {
                        break;
                    }
                    i++;
                }
                if (superAppActiveFeatureDto != null) {
                    arrayList.add(superAppActiveFeatureDto);
                }
            }
        } else {
            arrayList = null;
        }
        if (widgetSettingsModalOpenSource != null) {
            switch (a.$EnumSwitchMapping$0[widgetSettingsModalOpenSource.ordinal()]) {
                case 1:
                    superAppGetAllWidgetSettingsSourceDto = SuperAppGetAllWidgetSettingsSourceDto.GEAR_BUTTON_IN_MINI_WIDGETS_BLOCK;
                    break;
                case 2:
                    superAppGetAllWidgetSettingsSourceDto = SuperAppGetAllWidgetSettingsSourceDto.LONG_TAP_ON_MINI_WIDGET;
                    break;
                case 3:
                    superAppGetAllWidgetSettingsSourceDto = SuperAppGetAllWidgetSettingsSourceDto.CONTEXT_MENU_IN_THREE_DOTS;
                    break;
                case 4:
                    superAppGetAllWidgetSettingsSourceDto = SuperAppGetAllWidgetSettingsSourceDto.SETTINGS_BUTTON_AT_THE_BOTTOM_OF_THE_SERVICES_SCREEN;
                    break;
                case 5:
                    superAppGetAllWidgetSettingsSourceDto = SuperAppGetAllWidgetSettingsSourceDto.FROM_ONBOARDING_POPUP;
                    break;
                case 6:
                    superAppGetAllWidgetSettingsSourceDto = SuperAppGetAllWidgetSettingsSourceDto.FROM_RETENTION_WIDGET_POPUP;
                    break;
                case 7:
                    superAppGetAllWidgetSettingsSourceDto = SuperAppGetAllWidgetSettingsSourceDto.RETRY_BUTTON_FROM_NACKBAR;
                    break;
            }
            tfx tfxVar = new tfx("superApp.getAllWidgetSettings", new vul0(1), new uf3(29));
            if (arrayList != null) {
                arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((SuperAppActiveFeatureDto) it.next()).i());
                }
            }
            if (arrayList2 != null) {
                tfxVar.i("active_features", arrayList2);
            }
            if (superAppGetAllWidgetSettingsSourceDto != null) {
                tfx.l(tfxVar, "source", superAppGetAllWidgetSettingsSourceDto.i(), 0, 0, 12);
            }
            m1 a0 = rsg0.T(yfb.x(tfxVar)).y0(10L, TimeUnit.SECONDS).U(new aox0(new u5u0(this), 0)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            epq0 epq0Var = new epq0(new z4t0(this, 16), 10);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            return new a0(new c0(a0.E(epq0Var, lVar, kVar, kVar), new mlu0(new prd0(11, widgetSettingsModalOpenSource, this), 5), kVar), new w6w(this, 4)).E(new znx0(new gqq0(this, 16), 0), lVar, kVar, kVar);
        }
        superAppGetAllWidgetSettingsSourceDto = null;
        tfx tfxVar2 = new tfx("superApp.getAllWidgetSettings", new vul0(1), new uf3(29));
        if (arrayList != null) {
        }
        if (arrayList2 != null) {
        }
        if (superAppGetAllWidgetSettingsSourceDto != null) {
        }
        m1 a02 = rsg0.T(yfb.x(tfxVar2)).y0(10L, TimeUnit.SECONDS).U(new aox0(new u5u0(this), 0)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        epq0 epq0Var2 = new epq0(new z4t0(this, 16), 10);
        a.l lVar2 = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar2 = io.reactivex.rxjava3.internal.functions.a.c;
        return new a0(new c0(a02.E(epq0Var2, lVar2, kVar2, kVar2), new mlu0(new prd0(11, widgetSettingsModalOpenSource, this), 5), kVar2), new w6w(this, 4)).E(new znx0(new gqq0(this, 16), 0), lVar2, kVar2, kVar2);
    }

    @Override // xsna.ynx0
    public final z0 k() {
        f<uu1.b> fVar = this.a;
        fVar.getClass();
        return new z0(fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r4 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uu1.b l(List list, boolean z) {
        List list2;
        uu1.b bVar = this.f;
        if (bVar == null) {
            return null;
        }
        List<uu1.a> list3 = bVar.c;
        if (list3 != null) {
            list2 = j5g.D0(new C1924b(list), list3);
        }
        list2 = EmptyList.b;
        return new uu1.b(z, bVar.b, list2);
    }

    public final List<String> m() {
        List<uu1.a> list;
        uu1.b bVar = this.f;
        if (bVar == null || (list = bVar.c) == null) {
            return EmptyList.b;
        }
        List<uu1.a> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((uu1.a) it.next()).c.g());
        }
        return arrayList;
    }

    public final boolean n() {
        uu1.b bVar = this.f;
        if (bVar == null || this.h != bVar.a) {
            return true;
        }
        ArrayList arrayList = this.g;
        List subList = arrayList.subList(0, Integer.min(3, arrayList.size()));
        List<String> m = m();
        return !f870.k(subList, m.subList(0, Integer.min(3, m.size())));
    }

    public final void o() {
        uu1.b l = l(this.g, this.h);
        if (l == null) {
            return;
        }
        boolean z = l.a;
        f<List<MiniWidgetItem>> fVar = this.b;
        if (!z) {
            fVar.onNext(EmptyList.b);
            return;
        }
        List<uu1.a> list = l.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((uu1.a) it.next()).c);
        }
        fVar.onNext(arrayList.subList(0, Integer.min(3, arrayList.size())));
    }

    public final void p() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        arrayList.addAll(m());
        uu1.b bVar = this.f;
        if (bVar != null) {
            this.h = bVar.a;
            this.a.onNext(bVar);
            o();
        }
        com.vk.core.utils.newtork.b.a.getClass();
        this.d.onNext(com.vk.core.utils.newtork.b.d() ? nox0.c.a : nox0.b.a);
        this.e.onNext(Boolean.FALSE);
    }

    public final void q() {
        c cVar = this.k;
        if (cVar != null && !cVar.h()) {
            this.n = true;
            return;
        }
        if (this.f == null || !n()) {
            this.e.onNext(Boolean.FALSE);
            return;
        }
        ArrayList arrayList = new ArrayList(this.g);
        boolean z = this.h;
        ufx ufxVar = new ufx("superApp.setMiniWidgetSettings", new yul0(1), new ful0(2));
        ufxVar.h("widgets", arrayList);
        ufxVar.i("is_mini_widgets_available", z);
        this.k = new a0(new c0(rsg0.y0(yfb.x(ufxVar), null, null, 3).y0(10L, TimeUnit.SECONDS).r0(asu0.a.c()), new vks0(new olt0(this, 10), 5), io.reactivex.rxjava3.internal.functions.a.c), new psb(this, 5)).U(new b630(new yjs0(9), 26)).subscribe(new y730(new mmk0(this, z, arrayList), 27), new c7q0(new c3k0(this, 26), 8));
    }

    public final void r(String str, boolean z) {
        boolean z2;
        d<List<qnx0>> dVar = this.c;
        List<qnx0> P0 = dVar.P0();
        if (P0 == null) {
            P0 = EmptyList.b;
        }
        List<qnx0> list = P0;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (qnx0 qnx0Var : list) {
            if (epx.f(qnx0Var.b, str)) {
                z2 = z;
                qnx0Var = new qnx0(qnx0Var.a, qnx0Var.b, qnx0Var.c, qnx0Var.d, qnx0Var.e, z2, qnx0Var.g);
            } else {
                z2 = z;
            }
            arrayList.add(qnx0Var);
            z = z2;
        }
        dVar.onNext(arrayList);
    }
}
