package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.g3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class i3 extends u2 {
    private final g3 e;
    private List f;
    private final List g;
    private final List h;
    private final List i;
    private final List j;
    private SpannedString k;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    i3(g3 g3Var, Context context) {
        super(context);
        this.e = g3Var;
        if (g3Var.q() == g3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.k = new SpannedString(spannableString);
        } else {
            this.k = new SpannedString("");
        }
        this.f = g();
        this.g = b(g3Var.n());
        this.h = e();
        this.i = a(g3Var.f());
        this.j = j();
        notifyDataSetChanged();
    }

    private t2 f() {
        if (this.e.H()) {
            return null;
        }
        return t2.a().d("Initialization Status").c(f(this.e.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private t2 i() {
        t2.b c = t2.a().d("SDK").c(this.e.p());
        if (TextUtils.isEmpty(this.e.p())) {
            c.a(a(this.e.F())).b(b(this.e.F()));
        }
        return c.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.e.v())) {
            arrayList.add(t2.a(t2.c.DETAIL).d(this.e.v()).a());
        }
        if (this.e.y() == g3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.e.s() != null) {
            arrayList.add(c(this.e.s()));
        }
        arrayList.add(a(this.e.y()));
        return arrayList;
    }

    public boolean a(l2 l2Var) {
        return l2Var.b() == a.TEST_ADS.ordinal() && l2Var.a() == this.j.size() - 1;
    }

    @Override // com.applovin.impl.u2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.u2
    protected List c(int i) {
        return i == a.INTEGRATIONS.ordinal() ? this.f : i == a.PERMISSIONS.ordinal() ? this.g : i == a.CONFIGURATION.ordinal() ? this.h : i == a.DEPENDENCIES.ordinal() ? this.i : this.j;
    }

    @Override // com.applovin.impl.u2
    protected int d(int i) {
        return i == a.INTEGRATIONS.ordinal() ? this.f.size() : i == a.PERMISSIONS.ordinal() ? this.g.size() : i == a.CONFIGURATION.ordinal() ? this.h.size() : i == a.DEPENDENCIES.ordinal() ? this.i.size() : this.j.size();
    }

    @Override // com.applovin.impl.u2
    protected t2 e(int i) {
        return i == a.INTEGRATIONS.ordinal() ? new x4("INTEGRATIONS") : i == a.PERMISSIONS.ordinal() ? new x4("PERMISSIONS") : i == a.CONFIGURATION.ordinal() ? new x4("CONFIGURATION") : i == a.DEPENDENCIES.ordinal() ? new x4("DEPENDENCIES") : new x4("TEST ADS");
    }

    public g3 h() {
        return this.e;
    }

    public void k() {
        this.f = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l1 l1Var = (l1) it.next();
                arrayList.add(a(l1Var.b(), l1Var.a(), l1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r4 r4Var = (r4) it.next();
                arrayList.add(a(r4Var.b(), r4Var.a(), r4Var.c(), true));
            }
        }
        return arrayList;
    }

    private String f(int i) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    private t2 a(g3.b bVar) {
        t2.b a2 = t2.a();
        if (bVar == g3.b.READY) {
            a2.a(this.a);
        }
        return a2.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z) {
        Context context;
        int i;
        if (z) {
            context = this.a;
            i = R.color.applovin_sdk_checkmarkColor;
        } else {
            context = this.a;
            i = R.color.applovin_sdk_xmarkColor;
        }
        return context.getColor(i);
    }

    private t2 c(List list) {
        return t2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private t2 d() {
        t2.b c = t2.a().d("Adapter").c(this.e.c());
        if (TextUtils.isEmpty(this.e.c())) {
            c.a(a(this.e.z())).b(b(this.e.z()));
        }
        return c.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.e.D()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://support.axon.ai/en/max/android/overview/integration", com.applovin.impl.sdk.l.H0(), true));
        }
        return arrayList;
    }

    private t2 a(String str, String str2, boolean z, boolean z2) {
        return t2.a(z ? t2.c.RIGHT_DETAIL : t2.c.DETAIL).d(str).a(z ? null : this.k).b("Instructions").a(str2).a(z ? R.drawable.applovin_ic_check_mark_bordered : c(z2)).b(z ? this.a.getColor(R.color.applovin_sdk_checkmarkColor) : d(z2)).a(!z).a();
    }

    private int c(boolean z) {
        return z ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z) {
        Context context;
        int i;
        if (z) {
            context = this.a;
            i = R.color.applovin_sdk_xmarkColor;
        } else {
            context = this.a;
            i = R.color.applovin_sdk_warningColor;
        }
        return context.getColor(i);
    }

    private int a(boolean z) {
        return z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
