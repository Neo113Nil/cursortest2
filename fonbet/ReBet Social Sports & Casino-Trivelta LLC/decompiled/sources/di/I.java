package di;

import Zh.InterfaceC1901b;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class I implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public bi.f f45300a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f45301b;

    @NotNull
    private final Enum<Object>[] values;

    public I(final String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
        this.f45301b = LazyKt.lazy(new Function0() { // from class: di.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f d10;
                d10 = I.d(I.this, serialName);
                return d10;
            }
        });
    }

    public static final bi.f d(I i10, String str) {
        bi.f fVar = i10.f45300a;
        return fVar == null ? i10.c(str) : fVar;
    }

    public final bi.f c(String str) {
        G g10 = new G(str, this.values.length);
        for (Enum<Object> r02 : this.values) {
            J0.o(g10, r02.name(), false, 2, null);
        }
        return g10;
    }

    @Override // Zh.InterfaceC1900a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int f10 = decoder.f(getDescriptor());
        if (f10 >= 0) {
            Enum<Object>[] enumArr = this.values;
            if (f10 < enumArr.length) {
                return enumArr[f10];
            }
        }
        throw new Zh.o(f10 + " is not among valid " + getDescriptor().h() + " enum values, values size is " + this.values.length);
    }

    @Override // Zh.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void serialize(ci.f encoder, Enum value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int indexOf = ArraysKt.indexOf(this.values, value);
        if (indexOf != -1) {
            encoder.o(getDescriptor(), indexOf);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().h());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(this.values);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        sb2.append(arrays);
        throw new Zh.o(sb2.toString());
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return (bi.f) this.f45301b.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + Typography.greater;
    }
}
