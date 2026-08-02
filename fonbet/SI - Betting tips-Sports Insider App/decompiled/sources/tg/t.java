package tg;

import androidx.core.view.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.e0;
import sg.n1;
import sg.y0;
import sg.z0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class t implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f23959a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23960b;

    static {
        qg.e kind = qg.e.f22164m;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.H("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        hf.i iVar = z0.f23721a;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Object it = ((hf.l) z0.f23721a.values()).iterator();
        while (((n0) it).hasNext()) {
            og.a aVar = (og.a) ((hf.g) it).next();
            if (Intrinsics.areEqual("kotlinx.serialization.json.JsonLiteral", aVar.d().a())) {
                throw new IllegalArgumentException(kotlin.text.t.c("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + Reflection.getOrCreateKotlinClass(aVar.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f23960b = new y0("kotlinx.serialization.json.JsonLiteral", kind);
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m j = y4.a.c(decoder).j();
        if (j instanceof s) {
            return (s) j;
        }
        throw ug.j.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(j.getClass()), j.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    @Override // og.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ug.s encoder, Object obj) {
        Double d10;
        s value = (s) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y4.a.b(encoder);
        boolean z5 = value.f23957a;
        String str = value.f23958b;
        if (z5) {
            encoder.r(str);
            return;
        }
        Long Y = StringsKt.Y(str);
        if (Y != null) {
            encoder.l(Y.longValue());
            return;
        }
        gf.d0 g10 = e0.g(str);
        if (g10 != null) {
            long j = g10.f10018a;
            Intrinsics.checkNotNullParameter(gf.d0.f10017b, "<this>");
            encoder.h(n1.f23663b).l(j);
            return;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Boolean bool = null;
        if (kotlin.text.y.e(str)) {
            d10 = Double.valueOf(Double.parseDouble(str));
            if (d10 == null) {
                encoder.e(d10.doubleValue());
                return;
            }
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (Intrinsics.areEqual(str, "true")) {
                bool = Boolean.TRUE;
            } else if (Intrinsics.areEqual(str, "false")) {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                encoder.b(bool.booleanValue());
                return;
            } else {
                encoder.r(str);
                return;
            }
        }
        d10 = null;
        if (d10 == null) {
        }
    }

    @Override // og.a
    public final qg.g d() {
        return f23960b;
    }
}
