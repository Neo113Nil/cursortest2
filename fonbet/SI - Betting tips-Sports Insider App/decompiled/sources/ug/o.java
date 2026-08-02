package ug;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import sg.a0;
import tg.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o extends m {
    public final y j;

    /* renamed from: k, reason: collision with root package name */
    public final List f24285k;

    /* renamed from: l, reason: collision with root package name */
    public final int f24286l;

    /* renamed from: m, reason: collision with root package name */
    public int f24287m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tg.c json, y value) {
        super(json, value, (String) null, 12);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.j = value;
        List W = CollectionsKt.W(value.f23963a.keySet());
        this.f24285k = W;
        this.f24286l = W.size() * 2;
        this.f24287m = -1;
    }

    @Override // ug.m, ug.a
    public final tg.m F(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (this.f24287m % 2 != 0) {
            return (tg.m) n0.d(this.j, tag);
        }
        a0 a0Var = tg.n.f23953a;
        return tag == null ? tg.v.INSTANCE : new tg.s(tag, true);
    }

    @Override // ug.m, ug.a
    public final String R(qg.g descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.f24285k.get(i5 / 2);
    }

    @Override // ug.m, ug.a
    public final tg.m T() {
        return this.j;
    }

    @Override // ug.m
    /* renamed from: Y */
    public final y T() {
        return this.j;
    }

    @Override // ug.m, ug.a, rg.a
    public final void g(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // ug.m, rg.a
    public final int z(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i5 = this.f24287m;
        if (i5 >= this.f24286l - 1) {
            return -1;
        }
        int i10 = i5 + 1;
        this.f24287m = i10;
        return i10;
    }
}
