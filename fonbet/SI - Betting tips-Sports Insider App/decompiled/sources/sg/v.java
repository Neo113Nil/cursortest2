package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class v implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f23710a;

    /* renamed from: b, reason: collision with root package name */
    public final gf.t f23711b;

    public v(String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f23710a = values;
        this.f23711b = gf.k.b(new a2.l(13, this, serialName));
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int r5 = decoder.r(d());
        Enum[] enumArr = this.f23710a;
        if (r5 >= 0 && r5 < enumArr.length) {
            return enumArr[r5];
        }
        throw new og.f(r5 + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        Enum value = (Enum) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Enum[] enumArr = this.f23710a;
        int s8 = kotlin.collections.p.s(enumArr, value);
        if (s8 != -1) {
            qg.g enumDescriptor = d();
            encoder.getClass();
            Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
            encoder.r(enumDescriptor.g(s8));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(d().a());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(enumArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        sb2.append(arrays);
        throw new og.f(sb2.toString());
    }

    @Override // og.a
    public final qg.g d() {
        return (qg.g) this.f23711b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + '>';
    }
}
