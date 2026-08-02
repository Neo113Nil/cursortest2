package zd;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11109k extends AbstractC11106h implements Jd.e {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object[] f108835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11109k(Sd.f fVar, @NotNull Object[] values) {
        super(fVar);
        Intrinsics.checkNotNullParameter(values, "values");
        this.f108835b = values;
    }

    @Override // Jd.e
    @NotNull
    public final ArrayList b() {
        Object[] objArr = this.f108835b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object value : objArr) {
            Intrinsics.f(value);
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(C11104f.h(value.getClass()) ? new z(null, (Enum) value) : value instanceof Annotation ? new C11107i(null, (Annotation) value) : value instanceof Object[] ? new C11109k(null, (Object[]) value) : value instanceof Class ? new v(null, (Class) value) : new C11094B(null, value));
        }
        return arrayList;
    }
}
