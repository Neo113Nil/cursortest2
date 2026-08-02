package com.vk.im.ui.components.theme_chooser;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.VKTabLayout;
import com.vk.im.ui.components.theme_chooser.e;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.f;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.asp;
import xsna.b990;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cs2;
import xsna.e9g;
import xsna.epx;
import xsna.fp6;
import xsna.i8n0;
import xsna.jaa0;
import xsna.jpo0;
import xsna.kv2;
import xsna.lb6;
import xsna.m5g;
import xsna.ms9;
import xsna.mw5;
import xsna.q6g;
import xsna.rx5;
import xsna.tu80;
import xsna.xv5;
import xsna.yh9;
import xsna.zoo0;
import xsna.zrp;

/* compiled from: ThemeChooserVc.kt */
/* loaded from: classes2.dex */
public final class c {
    public final View a;
    public final f<e> b;
    public final xv5 c;
    public final bpn0 d;
    public final m5g e;
    public final bpn0 f;
    public final zoo0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final RecyclerView j;
    public final VKTabLayout k;

    /* compiled from: ThemeChooserVc.kt */
    public static final class a implements rx5.a, e9g.a, fp6.a {
        public final f a;

        public a(f fVar) {
            this.a = fVar;
        }

        @Override // xsna.rx5.a
        public final void a(mw5 mw5Var) {
            this.a.onNext(new e.a(mw5Var));
        }

        @Override // xsna.e9g.a
        public final void b(q6g q6gVar) {
            this.a.onNext(new e.c(q6gVar));
        }

        @Override // xsna.fp6.a
        public final void c(jpo0 jpo0Var) {
            this.a.onNext(new e.C1161e(jpo0Var));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThemeChooserVc.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b BACKGROUND;
        public static final b COLOR;
        public static final b THEME;
        private final int nameRes;

        static {
            b bVar = new b("BACKGROUND", 0, R.string.vkim_settings_appearance_background);
            BACKGROUND = bVar;
            b bVar2 = new b("COLOR", 1, R.string.vkim_settings_appearance_color);
            COLOR = bVar2;
            b bVar3 = new b("THEME", 2, 0);
            THEME = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, int i2) {
            this.nameRes = i2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int h() {
            return this.nameRes;
        }
    }

    /* compiled from: ThemeChooserVc.kt */
    /* renamed from: com.vk.im.ui.components.theme_chooser.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC1159c {
        public final boolean a;

        /* compiled from: ThemeChooserVc.kt */
        /* renamed from: com.vk.im.ui.components.theme_chooser.c$c$a */
        public static final class a extends AbstractC1159c {
            public final List<mw5> b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends mw5> list) {
                super(true);
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Background(items="), this.b);
            }
        }

        /* compiled from: ThemeChooserVc.kt */
        /* renamed from: com.vk.im.ui.components.theme_chooser.c$c$b */
        public static final class b extends AbstractC1159c {
            public final List<q6g> b;

            public b(List<q6g> list) {
                super(true);
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Color(items="), this.b);
            }
        }

        /* compiled from: ThemeChooserVc.kt */
        /* renamed from: com.vk.im.ui.components.theme_chooser.c$c$c, reason: collision with other inner class name */
        public static final class C1160c extends AbstractC1159c {
            public static final C1160c b = new C1160c(false);
        }

        /* compiled from: ThemeChooserVc.kt */
        /* renamed from: com.vk.im.ui.components.theme_chooser.c$c$d */
        public static final class d extends AbstractC1159c {
            public final List<jpo0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public d(List<? extends jpo0> list) {
                super(false);
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Theme(items="), this.b);
            }
        }

        public AbstractC1159c(boolean z) {
            this.a = z;
        }
    }

    public c(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC1159c abstractC1159c) {
        View inflate = layoutInflater.inflate(R.layout.im_chat_theme_choose_view, viewGroup, false);
        this.a = inflate;
        f<e> fVar = new f<>();
        this.b = fVar;
        this.d = new bpn0(new jaa0(this, 22));
        this.f = new bpn0(new b990(this, 20));
        this.h = new bpn0(new tu80(this, 27));
        this.i = new bpn0(new i8n0(this, 1));
        a aVar = new a(fVar);
        this.c = new xv5(layoutInflater, aVar);
        this.e = new m5g(layoutInflater, aVar);
        zoo0 zoo0Var = new zoo0(layoutInflater, aVar);
        this.g = zoo0Var;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.vkim_theme_recycler_view);
        recyclerView.setAdapter(zoo0Var);
        recyclerView.setItemAnimator(null);
        this.j = recyclerView;
        VKTabLayout vKTabLayout = (VKTabLayout) inflate.findViewById(R.id.vkim_tabs);
        this.k = vKTabLayout;
        TabLayout.g p = vKTabLayout.p();
        b bVar = b.BACKGROUND;
        p.p(bVar.h());
        p.n(bVar.h());
        vKTabLayout.h(p);
        TabLayout.g p2 = vKTabLayout.p();
        b bVar2 = b.COLOR;
        p2.p(bVar2.h());
        p2.n(bVar2.h());
        vKTabLayout.h(p2);
        vKTabLayout.f(new d(this));
        a(abstractC1159c);
    }

    public final void a(AbstractC1159c abstractC1159c) {
        x xVar;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        lb6 lb6Var = new lb6(26, ref$BooleanRef, this);
        boolean z = abstractC1159c instanceof AbstractC1159c.a;
        RecyclerView recyclerView = this.j;
        if (z) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                c(adapter);
            }
            d(b.BACKGROUND);
            List<mw5> list = ((AbstractC1159c.a) abstractC1159c).b;
            Runnable cs2Var = new cs2(lb6Var, 19);
            xVar = this.c;
            xVar.submitList(list, cs2Var);
        } else if (abstractC1159c instanceof AbstractC1159c.b) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                c(adapter2);
            }
            d(b.COLOR);
            List<q6g> list2 = ((AbstractC1159c.b) abstractC1159c).b;
            Runnable yh9Var = new yh9(lb6Var, 12);
            xVar = this.e;
            xVar.submitList(list2, yh9Var);
        } else if (abstractC1159c instanceof AbstractC1159c.d) {
            List<jpo0> list3 = ((AbstractC1159c.d) abstractC1159c).b;
            Runnable kv2Var = new kv2(lb6Var, 13);
            xVar = this.g;
            xVar.submitList(list3, kv2Var);
        } else {
            if (!epx.f(abstractC1159c, AbstractC1159c.C1160c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            xVar = null;
        }
        if (recyclerView.getAdapter() != xVar) {
            recyclerView.setAdapter(xVar);
            RecyclerView.Adapter adapter3 = recyclerView.getAdapter();
            if (adapter3 != null) {
                b(adapter3);
            }
            ref$BooleanRef.element = true;
        }
        bwt0.p0(this.k, abstractC1159c.a);
    }

    public final void b(RecyclerView.Adapter<?> adapter) {
        boolean z = adapter instanceof xv5;
        RecyclerView recyclerView = this.j;
        if (z) {
            recyclerView.setLayoutManager((RecyclerView.o) this.d.getValue());
            return;
        }
        if (adapter instanceof m5g) {
            recyclerView.setLayoutManager((RecyclerView.o) this.f.getValue());
            return;
        }
        if (adapter instanceof zoo0) {
            recyclerView.setLayoutManager((RecyclerView.o) this.h.getValue());
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
    }

    public final void c(RecyclerView.Adapter<?> adapter) {
        RecyclerView recyclerView = this.j;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        boolean z = adapter instanceof xv5;
        bpn0 bpn0Var = this.d;
        if (z) {
            ((RecyclerView.o) bpn0Var.getValue()).onRestoreInstanceState(onSaveInstanceState);
            recyclerView.setLayoutManager((RecyclerView.o) bpn0Var.getValue());
            return;
        }
        boolean z2 = adapter instanceof m5g;
        bpn0 bpn0Var2 = this.f;
        if (z2) {
            ((RecyclerView.o) bpn0Var2.getValue()).onRestoreInstanceState(onSaveInstanceState);
            recyclerView.setLayoutManager((RecyclerView.o) bpn0Var2.getValue());
        } else if (adapter instanceof zoo0) {
            bpn0 bpn0Var3 = this.h;
            ((RecyclerView.o) bpn0Var3.getValue()).onRestoreInstanceState(onSaveInstanceState);
            RecyclerView.o oVar = (RecyclerView.o) bpn0Var2.getValue();
            bpn0 bpn0Var4 = this.i;
            oVar.onRestoreInstanceState((Parcelable) bpn0Var4.getValue());
            ((RecyclerView.o) bpn0Var.getValue()).onRestoreInstanceState((Parcelable) bpn0Var4.getValue());
            recyclerView.setLayoutManager((RecyclerView.o) bpn0Var3.getValue());
        }
    }

    public final void d(b bVar) {
        VKTabLayout vKTabLayout = this.k;
        int tabCount = vKTabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.g b2 = vKTabLayout.b(i);
            if (b2 != null && b2.i == bVar.h() && !b2.h()) {
                b2.j();
            }
        }
    }
}
