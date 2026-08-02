package fi;

import ei.AbstractC4212b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes5.dex */
public final class P extends L {

    /* renamed from: l, reason: collision with root package name */
    public final JsonObject f46703l;

    /* renamed from: m, reason: collision with root package name */
    public final List f46704m;

    /* renamed from: n, reason: collision with root package name */
    public final int f46705n;

    /* renamed from: o, reason: collision with root package name */
    public int f46706o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(AbstractC4212b json, JsonObject value) {
        super(json, value, null, null, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f46703l = value;
        List list = CollectionsKt.toList(A0().keySet());
        this.f46704m = list;
        this.f46705n = list.size() * 2;
        this.f46706o = -1;
    }

    @Override // fi.L, fi.AbstractC4287c
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public JsonObject A0() {
        return this.f46703l;
    }

    @Override // fi.L, fi.AbstractC4287c, ci.c
    public void b(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // fi.L, ci.c
    public int e(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = this.f46706o;
        if (i10 >= this.f46705n - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f46706o = i11;
        return i11;
    }

    @Override // fi.L, di.AbstractC4110q0
    public String g0(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.f46704m.get(i10 / 2);
    }

    @Override // fi.L, fi.AbstractC4287c
    public JsonElement m0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.f46706o % 2 == 0 ? ei.j.c(tag) : (JsonElement) MapsKt.getValue(A0(), tag);
    }
}
