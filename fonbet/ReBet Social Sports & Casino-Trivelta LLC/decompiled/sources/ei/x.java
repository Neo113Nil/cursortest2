package ei;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import bi.e;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public final class x implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public static final x f46130a = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.f f46131b = bi.l.c("kotlinx.serialization.json.JsonLiteral", e.i.f25213a);

    @Override // Zh.InterfaceC1900a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement j10 = r.d(decoder).j();
        if (j10 instanceof w) {
            return (w) j10;
        }
        throw fi.C.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(j10.getClass()), j10.toString());
    }

    @Override // Zh.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, w value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        if (value.b()) {
            encoder.H(value.a());
            return;
        }
        if (value.c() != null) {
            encoder.t(value.c()).H(value.a());
            return;
        }
        Long longOrNull = StringsKt.toLongOrNull(value.a());
        if (longOrNull != null) {
            encoder.s(longOrNull.longValue());
            return;
        }
        ULong uLongOrNull = UStringsKt.toULongOrNull(value.a());
        if (uLongOrNull != null) {
            encoder.t(AbstractC2028a.w(ULong.INSTANCE).getDescriptor()).s(uLongOrNull.getData());
            return;
        }
        Double doubleOrNull = StringsKt.toDoubleOrNull(value.a());
        if (doubleOrNull != null) {
            encoder.g(doubleOrNull.doubleValue());
            return;
        }
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(value.a());
        if (booleanStrictOrNull != null) {
            encoder.w(booleanStrictOrNull.booleanValue());
        } else {
            encoder.H(value.a());
        }
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return f46131b;
    }
}
