package fi;

import bi.m;
import ei.AbstractC4212b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public class L extends AbstractC4287c {

    /* renamed from: h, reason: collision with root package name */
    public final JsonObject f46694h;

    /* renamed from: i, reason: collision with root package name */
    public final bi.f f46695i;

    /* renamed from: j, reason: collision with root package name */
    public int f46696j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f46697k;

    public /* synthetic */ L(AbstractC4212b abstractC4212b, JsonObject jsonObject, String str, bi.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4212b, jsonObject, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : fVar);
    }

    public final JsonElement D0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) A0().get(tag);
    }

    @Override // fi.AbstractC4287c
    /* renamed from: E0 */
    public JsonObject A0() {
        return this.f46694h;
    }

    public final boolean F0(bi.f fVar, int i10) {
        boolean z10 = (d().f().j() || fVar.i(i10) || !fVar.g(i10).b()) ? false : true;
        this.f46697k = z10;
        return z10;
    }

    @Override // fi.AbstractC4287c, ci.e
    public boolean G() {
        return !this.f46697k && super.G();
    }

    @Override // fi.AbstractC4287c, ci.c
    public void b(bi.f descriptor) {
        Set plus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (E.m(descriptor, d()) || (descriptor.getKind() instanceof bi.d)) {
            return;
        }
        E.n(descriptor, d());
        if (this.f46752g.o()) {
            Set a10 = di.Z.a(descriptor);
            Map map = (Map) ei.F.a(d()).a(descriptor, E.g());
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = SetsKt.emptySet();
            }
            plus = SetsKt.plus(a10, (Iterable) keySet);
        } else {
            plus = di.Z.a(descriptor);
        }
        for (String str : A0().keySet()) {
            if (!plus.contains(str) && !Intrinsics.areEqual(str, z0())) {
                throw C.e(-1, "Encountered an unknown key '" + str + "' at element: " + j0() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) C.j(A0().toString(), 0, 1, null)));
            }
        }
    }

    @Override // fi.AbstractC4287c, ci.e
    public ci.c c(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor != this.f46695i) {
            return super.c(descriptor);
        }
        AbstractC4212b d10 = d();
        JsonElement n02 = n0();
        String h10 = this.f46695i.h();
        if (n02 instanceof JsonObject) {
            return new L(d10, (JsonObject) n02, z0(), this.f46695i);
        }
        throw C.f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(n02.getClass()).getSimpleName() + " as the serialized body of " + h10 + " at element: " + j0(), n02.toString());
    }

    @Override // ci.c
    public int e(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.f46696j < descriptor.d()) {
            int i10 = this.f46696j;
            this.f46696j = i10 + 1;
            String a02 = a0(descriptor, i10);
            int i11 = this.f46696j - 1;
            this.f46697k = false;
            if (A0().containsKey(a02) || F0(descriptor, i11)) {
                if (this.f46752g.g()) {
                    AbstractC4212b d10 = d();
                    boolean i12 = descriptor.i(i11);
                    bi.f g10 = descriptor.g(i11);
                    if (!i12 || g10.b() || !(D0(a02) instanceof JsonNull)) {
                        if (Intrinsics.areEqual(g10.getKind(), m.b.f25229a)) {
                            if (g10.b() && (D0(a02) instanceof JsonNull)) {
                                return i11;
                            }
                            JsonElement D02 = D0(a02);
                            JsonPrimitive jsonPrimitive = D02 instanceof JsonPrimitive ? (JsonPrimitive) D02 : null;
                            String g11 = jsonPrimitive != null ? ei.j.g(jsonPrimitive) : null;
                            if (g11 == null) {
                                return i11;
                            }
                            int i13 = E.i(g10, d10, g11);
                            boolean z10 = !d10.f().j() && g10.b();
                            if (i13 == -3 && ((i12 || z10) && !F0(descriptor, i11))) {
                            }
                        }
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    @Override // di.AbstractC4110q0
    public String g0(bi.f descriptor, int i10) {
        Object obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        E.n(descriptor, d());
        String e10 = descriptor.e(i10);
        if (!this.f46752g.o() || A0().keySet().contains(e10)) {
            return e10;
        }
        Map e11 = E.e(d(), descriptor);
        Iterator<T> it = A0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) e11.get((String) obj);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) obj;
        return str != null ? str : e10;
    }

    @Override // fi.AbstractC4287c
    public JsonElement m0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) MapsKt.getValue(A0(), tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(AbstractC4212b json, JsonObject value, String str, bi.f fVar) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f46694h = value;
        this.f46695i = fVar;
    }
}
