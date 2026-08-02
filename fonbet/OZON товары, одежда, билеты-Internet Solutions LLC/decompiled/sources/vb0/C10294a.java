package vb0;

import Kk.C3532b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: vb0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10294a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f102732a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f102733b;

    /* renamed from: c, reason: collision with root package name */
    private final String f102734c;

    /* renamed from: d, reason: collision with root package name */
    private final String f102735d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f102736e;

    /* renamed from: f, reason: collision with root package name */
    private final String f102737f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f102738g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f102739h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f102740i;

    /* JADX WARN: Multi-variable type inference failed */
    public C10294a(@NotNull String incidentId, boolean z11, String str, String str2, boolean z12, String str3, @NotNull Function0<Unit> onRefreshAction, @NotNull Function1<? super String, Unit> onSupportAction, @NotNull Function0<Unit> onCloseAction) {
        Intrinsics.checkNotNullParameter(incidentId, "incidentId");
        Intrinsics.checkNotNullParameter(onRefreshAction, "onRefreshAction");
        Intrinsics.checkNotNullParameter(onSupportAction, "onSupportAction");
        Intrinsics.checkNotNullParameter(onCloseAction, "onCloseAction");
        this.f102732a = incidentId;
        this.f102733b = z11;
        this.f102734c = str;
        this.f102735d = str2;
        this.f102736e = z12;
        this.f102737f = str3;
        this.f102738g = onRefreshAction;
        this.f102739h = onSupportAction;
        this.f102740i = onCloseAction;
    }

    public final String a() {
        return this.f102737f;
    }

    public final String b() {
        return this.f102735d;
    }

    @NotNull
    public final String c() {
        return this.f102732a;
    }

    @NotNull
    public final Function0<Unit> d() {
        return this.f102740i;
    }

    @NotNull
    public final Function0<Unit> e() {
        return this.f102738g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10294a)) {
            return false;
        }
        C10294a c10294a = (C10294a) obj;
        return Intrinsics.d(this.f102732a, c10294a.f102732a) && this.f102733b == c10294a.f102733b && Intrinsics.d(this.f102734c, c10294a.f102734c) && Intrinsics.d(this.f102735d, c10294a.f102735d) && this.f102736e == c10294a.f102736e && Intrinsics.d(this.f102737f, c10294a.f102737f) && Intrinsics.d(this.f102738g, c10294a.f102738g) && Intrinsics.d(this.f102739h, c10294a.f102739h) && Intrinsics.d(this.f102740i, c10294a.f102740i);
    }

    @NotNull
    public final Function1<String, Unit> f() {
        return this.f102739h;
    }

    public final boolean g() {
        return this.f102736e;
    }

    public final String h() {
        return this.f102734c;
    }

    public final int hashCode() {
        int a11 = C3532b.a(this.f102732a.hashCode() * 31, 31, this.f102733b);
        String str = this.f102734c;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f102735d;
        int a12 = C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f102736e);
        String str3 = this.f102737f;
        return this.f102740i.hashCode() + ((this.f102739h.hashCode() + ((this.f102738g.hashCode() + ((a12 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final boolean i() {
        return this.f102733b;
    }

    @NotNull
    public final String toString() {
        return "AntibotErrorModel(incidentId=" + this.f102732a + ", useSelectTheme=" + this.f102733b + ", supportUrl=" + this.f102734c + ", errorText=" + this.f102735d + ", showCloseButton=" + this.f102736e + ", antibotFlowResultCode=" + this.f102737f + ", onRefreshAction=" + this.f102738g + ", onSupportAction=" + this.f102739h + ", onCloseAction=" + this.f102740i + ")";
    }
}
