package com.vk.im.ui.components.theme_chooser;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.im.ui.components.theme_chooser.c;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a1w;
import xsna.asu0;
import xsna.bl30;
import xsna.bnc0;
import xsna.bpn0;
import xsna.cpo0;
import xsna.dhr0;
import xsna.dpo0;
import xsna.ece0;
import xsna.epx;
import xsna.fz5;
import xsna.h4f0;
import xsna.h57;
import xsna.hx5;
import xsna.i630;
import xsna.izs;
import xsna.j8i;
import xsna.jlm;
import xsna.k2y;
import xsna.kvm0;
import xsna.mdk0;
import xsna.mxv;
import xsna.n7b0;
import xsna.opo0;
import xsna.p9m;
import xsna.pdw;
import xsna.qi3;
import xsna.rt10;
import xsna.s3q0;
import xsna.u730;
import xsna.ut30;
import xsna.vu5;
import xsna.xdw;
import xsna.y3l0;
import xsna.yfb;
import xsna.zdw;

/* compiled from: ThemeChooserComponent.kt */
/* loaded from: classes2.dex */
public final class b extends j8i {
    public final a1w i;
    public final zdw j;
    public final mxv k;
    public final c l;
    public final w m;
    public final w n;
    public final com.vk.im.ui.components.theme_chooser.a o;
    public com.vk.im.ui.components.theme_chooser.c p;
    public final f<Object> q = new f<>();
    public final f<izs<ThemeChooserState, ThemeChooserState>> r;
    public final bpn0 s;
    public final io.reactivex.rxjava3.subjects.d<ThemeChooserState> t;
    public volatile c.AbstractC1159c u;

    /* compiled from: ThemeChooserComponent.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<List<? extends DialogTheme>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends DialogTheme> list) {
            b bVar = (b) this.receiver;
            bVar.getClass();
            bVar.b1(new cpo0(0, bVar, list));
            return s3q0.a;
        }
    }

    /* compiled from: ThemeChooserComponent.kt */
    /* renamed from: com.vk.im.ui.components.theme_chooser.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1156b extends FunctionReferenceImpl implements izs<List<? extends DialogBackground>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends DialogBackground> list) {
            b bVar = (b) this.receiver;
            bVar.getClass();
            bVar.b1(new h57(26, bVar, list));
            return s3q0.a;
        }
    }

    /* compiled from: ThemeChooserComponent.kt */
    public static final class c {
        public final String a;
        public final a b;

        /* compiled from: ThemeChooserComponent.kt */
        public static abstract class a {

            /* compiled from: ThemeChooserComponent.kt */
            /* renamed from: com.vk.im.ui.components.theme_chooser.b$c$a$a, reason: collision with other inner class name */
            public static final class C1157a extends a {
                public final long a;

                public C1157a(long j) {
                    this.a = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1157a) && this.a == ((C1157a) obj).a;
                }

                public final int hashCode() {
                    return Long.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.a(')', this.a, new StringBuilder("SaveForDialog(dialogId="));
                }
            }

            /* compiled from: ThemeChooserComponent.kt */
            /* renamed from: com.vk.im.ui.components.theme_chooser.b$c$a$b, reason: collision with other inner class name */
            public static final class C1158b extends a {
                public static final C1158b a = new C1158b();
            }
        }

        public c(String str, a aVar) {
            this.a = str;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Configuration(selectedThemeId=" + this.a + ", saveStrategy=" + this.b + ')';
        }
    }

    /* compiled from: ThemeChooserComponent.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeChooserState.ListKind.values().length];
            try {
                iArr[ThemeChooserState.ListKind.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeChooserState.ListKind.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeChooserState.ListKind.THEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(a1w a1wVar, zdw zdwVar, xdw xdwVar, mxv mxvVar, c cVar, w wVar, w wVar2) {
        this.i = a1wVar;
        this.j = zdwVar;
        this.k = mxvVar;
        this.l = cVar;
        this.m = wVar2;
        this.n = wVar;
        f<izs<ThemeChooserState, ThemeChooserState>> fVar = new f<>();
        this.r = fVar;
        this.s = new bpn0(new y3l0(this, 10));
        ThemeChooserState.ListKind listKind = ThemeChooserState.ListKind.THEME;
        String str = cVar.a;
        DialogBackground dialogBackground = DialogBackground.e;
        EmptyList emptyList = EmptyList.b;
        this.t = io.reactivex.rxjava3.subjects.d.O0(new ThemeChooserState(listKind, str, str, dialogBackground, true, emptyList, emptyList, emptyList));
        this.u = c.AbstractC1159c.C1160c.b;
        ThemeChooserState Z0 = Z0();
        com.vk.im.ui.components.theme_chooser.a aVar = new com.vk.im.ui.components.theme_chooser.a();
        aVar.a = Z0;
        aVar.b = Z0;
        this.o = aVar;
        j1 U = fVar.a0(wVar).U(new u730(new ece0(this, 13), 13));
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
        y yVar = new y(new y(U, qVar, aVar2).U(new i630(new n7b0(this, 16), 15)), qVar, aVar2);
        pdw pdwVar = new pdw(new bnc0(this, 15), 27);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        I0(yVar.E(pdwVar, lVar, kVar, kVar).a0(wVar2).subscribe(new k2y(new mdk0(this, 4), 20)));
        I0(io.reactivex.rxjava3.kotlin.c.h(a1wVar.C(this, new jlm(Source.ACTUAL)).q(wVar), null, new kvm0(this, 2), 1));
        opo0 opo0Var = new opo0(a1wVar, wVar);
        I0(opo0Var.c.r0(wVar).subscribe(new h4f0(new a(1, this, b.class, "processThemesChange", "processThemesChange(Ljava/util/List;)V", 0), 9)));
        I0(opo0Var);
        hx5 hx5Var = new hx5(a1wVar, wVar);
        I0(hx5Var.c.r0(wVar).subscribe(new dpo0(new C1156b(1, this, b.class, "processBackgroundsChange", "processBackgroundsChange(Ljava/util/List;)V", 0), 0)));
        I0(hx5Var);
    }

    public static DialogBackground X0(String str, List list, List list2) {
        Object obj;
        Object obj2;
        DialogBackground dialogBackground;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((DialogTheme) obj2).b.a, str)) {
                break;
            }
        }
        DialogTheme dialogTheme = (DialogTheme) obj2;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (epx.f(((DialogBackground) next).b, (dialogTheme == null || (dialogBackground = dialogTheme.c) == null) ? null : dialogBackground.b)) {
                obj = next;
                break;
            }
        }
        DialogBackground dialogBackground2 = (DialogBackground) obj;
        return dialogBackground2 == null ? DialogBackground.e : dialogBackground2;
    }

    public static String Y0(String str, List list) {
        Object obj;
        Object obj2;
        String str2;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((p9m) obj2).a, str)) {
                break;
            }
        }
        p9m p9mVar = (p9m) obj2;
        if (p9mVar != null && epx.f(p9mVar.a, c.h.c.a)) {
            int[] k = fz5.k(p9mVar, dhr0.C());
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                p9m p9mVar2 = (p9m) next;
                int[] k2 = fz5.k(p9mVar2, dhr0.C());
                if (!p9mVar2.equals(p9mVar) && Arrays.equals(k2, k)) {
                    obj = next;
                    break;
                }
            }
            p9m p9mVar3 = (p9m) obj;
            if (p9mVar3 != null && (str2 = p9mVar3.a) != null) {
                return str2;
            }
        }
        return str;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        com.vk.im.ui.components.theme_chooser.c cVar = new com.vk.im.ui.components.theme_chooser.c(layoutInflater, viewGroup, this.u);
        this.p = cVar;
        I0(cVar.b.a0(asu0.a.d()).subscribe(new rt10(new qi3(1, this, b.class, "processViewEvent", "processViewEvent(Lcom/vk/im/ui/components/theme_chooser/ThemeChooserViewEvent;)V", 0, 13), 18)));
        return cVar.a;
    }

    @Override // xsna.j8i
    public final void N0() {
        com.vk.im.ui.components.theme_chooser.c cVar = this.p;
        if (cVar != null) {
            cVar.j.setAdapter(null);
            cVar.b.onComplete();
        }
        this.p = null;
    }

    @Override // xsna.j8i
    public final void O0(Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("ThemeChooserComponent.State")) == null) {
            return;
        }
        b1(new ut30(bundle2, 27));
    }

    @Override // xsna.j8i
    public final void P0(Bundle bundle) {
        ThemeChooserState Z0 = Z0();
        bundle.putBundle("ThemeChooserComponent.State", yfb.b(new Pair("active_list", Z0.a.name()), new Pair("selected_theme", Z0.b), new Pair("selected_color", Z0.c), new Pair("selected_bg", Z0.d)));
    }

    public final ThemeChooserState Z0() {
        ThemeChooserState P0 = this.t.P0();
        if (P0 != null) {
            return P0;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void a1() {
        if (Z0().e) {
            return;
        }
        b1(new bl30(this, 26));
    }

    public final void b1(izs<? super ThemeChooserState, ThemeChooserState> izsVar) {
        this.r.onNext(izsVar);
    }
}
