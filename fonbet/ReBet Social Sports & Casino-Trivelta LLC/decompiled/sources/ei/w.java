package ei;

import fi.a0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class w extends JsonPrimitive {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46127a;

    /* renamed from: b, reason: collision with root package name */
    public final bi.f f46128b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46129c;

    public /* synthetic */ w(Object obj, boolean z10, bi.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z10, (i10 & 4) != 0 ? null : fVar);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String a() {
        return this.f46129c;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean b() {
        return this.f46127a;
    }

    public final bi.f c() {
        return this.f46128b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return b() == wVar.b() && Intrinsics.areEqual(a(), wVar.a());
    }

    public int hashCode() {
        return (Boolean.hashCode(b()) * 31) + a().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (!b()) {
            return a();
        }
        StringBuilder sb2 = new StringBuilder();
        a0.c(sb2, a());
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Object body, boolean z10, bi.f fVar) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.f46127a = z10;
        this.f46128b = fVar;
        this.f46129c = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
