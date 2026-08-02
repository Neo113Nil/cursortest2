package ru.ozon.android.messenger.framework.presentation.models.responses;

import B0.C2454a;
import B90.C2618u;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final q f91483a;

    /* renamed from: b, reason: collision with root package name */
    private final q f91484b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f91485c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final K f91486d;

    /* renamed from: e, reason: collision with root package name */
    private final int f91487e;

    /* renamed from: f, reason: collision with root package name */
    private final q f91488f;

    /* renamed from: g, reason: collision with root package name */
    private final q f91489g;

    /* renamed from: h, reason: collision with root package name */
    private final List<q> f91490h;

    /* renamed from: i, reason: collision with root package name */
    private final List<q> f91491i;

    public f(q qVar, q qVar2, List list, @NotNull K pinned, int i11, q qVar3, q qVar4, List list2, List list3) {
        Intrinsics.checkNotNullParameter(pinned, "pinned");
        this.f91483a = qVar;
        this.f91484b = qVar2;
        this.f91485c = list;
        this.f91486d = pinned;
        this.f91487e = i11;
        this.f91488f = qVar3;
        this.f91489g = qVar4;
        this.f91490h = list2;
        this.f91491i = list3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<ru.ozon.android.messenger.framework.presentation.models.q>] */
    public final List<q> a() {
        return this.f91485c;
    }

    public final q b() {
        return this.f91488f;
    }

    public final q c() {
        return this.f91484b;
    }

    public final q d() {
        return this.f91483a;
    }

    public final List<q> e() {
        return this.f91491i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f91483a, fVar.f91483a) && Intrinsics.d(this.f91484b, fVar.f91484b) && Intrinsics.d(this.f91485c, fVar.f91485c) && Intrinsics.d(this.f91486d, fVar.f91486d) && this.f91487e == fVar.f91487e && Intrinsics.d(this.f91488f, fVar.f91488f) && Intrinsics.d(this.f91489g, fVar.f91489g) && Intrinsics.d(this.f91490h, fVar.f91490h) && Intrinsics.d(this.f91491i, fVar.f91491i);
    }

    public final List<q> f() {
        return this.f91490h;
    }

    public final q g() {
        return this.f91489g;
    }

    public final int h() {
        return this.f91487e;
    }

    public final int hashCode() {
        q qVar = this.f91483a;
        int hashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        q qVar2 = this.f91484b;
        int hashCode2 = (hashCode + (qVar2 == null ? 0 : qVar2.hashCode())) * 31;
        Object obj = this.f91485c;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        this.f91486d.getClass();
        int a11 = C2454a.a(this.f91487e, (1 + hashCode3) * 31, 31);
        q qVar3 = this.f91488f;
        int hashCode4 = (a11 + (qVar3 == null ? 0 : qVar3.hashCode())) * 31;
        q qVar4 = this.f91489g;
        int hashCode5 = (hashCode4 + (qVar4 == null ? 0 : qVar4.hashCode())) * 31;
        List<q> list = this.f91490h;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<q> list2 = this.f91491i;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirstPageInfoVO(header=");
        sb2.append(this.f91483a);
        sb2.append(", footer=");
        sb2.append(this.f91484b);
        sb2.append(", chatRoomActions=");
        sb2.append(this.f91485c);
        sb2.append(", pinned=");
        sb2.append(this.f91486d);
        sb2.append(", unreadCount=");
        sb2.append(this.f91487e);
        sb2.append(", emptyState=");
        sb2.append(this.f91488f);
        sb2.append(", snackbar=");
        sb2.append(this.f91489g);
        sb2.append(", itemsBefore=");
        sb2.append(this.f91490h);
        sb2.append(", itemsAfter=");
        return C2618u.h(sb2, this.f91491i, ")");
    }
}
