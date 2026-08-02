package B7;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final a f848e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f849a;

    /* renamed from: b, reason: collision with root package name */
    public final int f850b;

    /* renamed from: c, reason: collision with root package name */
    public final float f851c;

    /* renamed from: d, reason: collision with root package name */
    public final float f852d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public g(int i10, int i11, float f10, float f11) {
        this.f849a = i10;
        this.f850b = i11;
        this.f851c = f10;
        this.f852d = f11;
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f849a == gVar.f849a && this.f850b == gVar.f850b;
    }

    public int hashCode() {
        return com.facebook.common.util.b.a(this.f849a, this.f850b);
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f849a), Integer.valueOf(this.f850b)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public /* synthetic */ g(int i10, int i11, float f10, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? 2048.0f : f10, (i12 & 8) != 0 ? 0.6666667f : f11);
    }
}
