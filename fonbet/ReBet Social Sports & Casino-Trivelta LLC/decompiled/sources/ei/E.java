package ei;

import Zh.InterfaceC1901b;
import bi.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class E implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final E f46073a = new E();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f46074b = bi.l.h("kotlinx.serialization.json.JsonPrimitive", e.i.f25213a, new bi.f[0], null, 8, null);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonPrimitive deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement j10 = r.d(decoder).j();
        if (j10 instanceof JsonPrimitive) {
            return (JsonPrimitive) j10;
        }
        throw fi.C.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(j10.getClass()), j10.toString());
    }

    @Override // Zh.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, JsonPrimitive value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        if (value instanceof JsonNull) {
            encoder.i(C4210A.f46065a, JsonNull.INSTANCE);
        } else {
            encoder.i(x.f46130a, (w) value);
        }
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f46074b;
    }
}
