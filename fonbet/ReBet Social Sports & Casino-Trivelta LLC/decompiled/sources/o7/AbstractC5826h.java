package o7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: o7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5826h {

    /* renamed from: a, reason: collision with root package name */
    public final k f59423a;

    /* renamed from: b, reason: collision with root package name */
    public final List f59424b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f59425c;

    @Nullable
    private String[] contextChainArrayOnVisible;

    /* renamed from: d, reason: collision with root package name */
    public Long f59426d;

    /* renamed from: e, reason: collision with root package name */
    public Long f59427e;

    /* renamed from: f, reason: collision with root package name */
    public String f59428f;

    /* renamed from: g, reason: collision with root package name */
    public String f59429g;

    /* renamed from: h, reason: collision with root package name */
    public String f59430h;

    /* renamed from: i, reason: collision with root package name */
    public String f59431i;

    /* renamed from: j, reason: collision with root package name */
    public String f59432j;

    /* renamed from: k, reason: collision with root package name */
    public String f59433k;

    /* renamed from: l, reason: collision with root package name */
    public Long f59434l;

    /* renamed from: m, reason: collision with root package name */
    public String f59435m;

    /* renamed from: n, reason: collision with root package name */
    public String f59436n;

    /* renamed from: o, reason: collision with root package name */
    public String f59437o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f59438p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f59439q;

    public AbstractC5826h(k infra) {
        Intrinsics.checkNotNullParameter(infra, "infra");
        this.f59423a = infra;
        this.f59424b = new ArrayList();
    }

    public final String a() {
        return this.f59428f;
    }

    public final String b() {
        return this.f59431i;
    }

    public final String[] c() {
        return this.contextChainArrayOnVisible;
    }

    public final String d() {
        return this.f59430h;
    }

    public final Integer e() {
        return this.f59439q;
    }

    public final Long f() {
        return this.f59426d;
    }

    public final Integer g() {
        return this.f59438p;
    }

    public final String h() {
        return this.f59436n;
    }

    public final String i() {
        return this.f59437o;
    }

    public final k j() {
        return this.f59423a;
    }

    public final List k() {
        return this.f59424b;
    }

    public final Long l() {
        return this.f59434l;
    }

    public final boolean m() {
        return this.f59425c;
    }

    public final Long n() {
        return this.f59427e;
    }

    public final String o() {
        return this.f59429g;
    }

    public final String p() {
        return this.f59435m;
    }

    public final String q() {
        return this.f59433k;
    }

    public final String r() {
        return this.f59432j;
    }

    public final void s() {
        this.f59424b.clear();
        this.f59425c = false;
        this.f59426d = null;
        this.f59427e = null;
        this.f59428f = null;
        this.f59429g = null;
        this.contextChainArrayOnVisible = null;
        this.f59430h = null;
        this.f59431i = null;
        this.f59432j = null;
        this.f59433k = null;
        this.f59434l = null;
        this.f59435m = null;
        this.f59436n = null;
        this.f59437o = null;
        this.f59438p = null;
        this.f59439q = null;
    }

    public final void t(Long l10) {
        this.f59426d = l10;
    }

    public final void u(boolean z10) {
        this.f59425c = z10;
    }

    public final void v(Long l10) {
        this.f59427e = l10;
    }
}
