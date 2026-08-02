package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
class m extends u2 {
    private final n e;
    private final o f;
    private final k8 g;
    private final String h;
    private final List i;
    private final List j;
    private final List k;

    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    class b extends b4 {
        private final k8 p;

        b(k8 k8Var, String str, boolean z) {
            super(k8Var.b().d(), m.this.a);
            this.p = k8Var;
            this.c = StringUtils.createSpannedString(k8Var.b().a(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.b = z;
        }

        @Override // com.applovin.impl.t2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public boolean o() {
            return this.b;
        }

        public k8 v() {
            return this.p;
        }
    }

    m(n nVar, o oVar, k8 k8Var, Context context) {
        super(context);
        this.e = nVar;
        this.g = k8Var;
        this.f = oVar != null ? oVar : nVar.f();
        this.h = oVar != null ? oVar.c() : nVar.d();
        this.i = h();
        this.j = e();
        this.k = l();
        notifyDataSetChanged();
    }

    private t2 f() {
        return t2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private t2 g() {
        return t2.a().d("ID").c(this.e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f.b() != null) {
            arrayList.add(f());
        }
        if (this.g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private t2 i() {
        return t2.a().d("Selected Network").c(this.g.b().a()).a();
    }

    private List l() {
        k8 k8Var = this.g;
        if (k8Var != null && k8Var.d()) {
            return new ArrayList();
        }
        List<k8> e = this.f.e();
        ArrayList arrayList = new ArrayList(e.size());
        for (k8 k8Var2 : e) {
            k8 k8Var3 = this.g;
            if (k8Var3 == null || k8Var3.b().c().equals(k8Var2.b().c())) {
                arrayList.add(new b(k8Var2, null, this.g == null));
                for (c4 c4Var : k8Var2.c()) {
                    arrayList.add(t2.a().d(c4Var.a()).c(c4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.u2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.u2
    protected List c(int i) {
        return i == a.INFO.ordinal() ? this.i : i == a.BIDDERS.ordinal() ? this.j : this.k;
    }

    @Override // com.applovin.impl.u2
    protected int d(int i) {
        return i == a.INFO.ordinal() ? this.i.size() : i == a.BIDDERS.ordinal() ? this.j.size() : this.k.size();
    }

    @Override // com.applovin.impl.u2
    protected t2 e(int i) {
        return i == a.INFO.ordinal() ? new x4("INFO") : i == a.BIDDERS.ordinal() ? new x4("BIDDERS") : new x4("WATERFALL");
    }

    public o j() {
        return this.f;
    }

    public String k() {
        return this.h;
    }

    private t2 d() {
        return t2.a().d("Ad Format").c(this.e.b()).a();
    }

    private List e() {
        k8 k8Var = this.g;
        if (k8Var != null && !k8Var.d()) {
            return new ArrayList();
        }
        List<k8> a2 = this.f.a();
        ArrayList arrayList = new ArrayList(a2.size());
        for (k8 k8Var2 : a2) {
            k8 k8Var3 = this.g;
            if (k8Var3 == null || k8Var3.b().c().equals(k8Var2.b().c())) {
                arrayList.add(new b(k8Var2, k8Var2.a() != null ? k8Var2.a().a() : "", this.g == null));
            }
        }
        return arrayList;
    }
}
