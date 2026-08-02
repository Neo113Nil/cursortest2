package B7;

import D6.k;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f814c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f815d = LazyKt.lazy(new Function0() { // from class: B7.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Pattern e10;
            e10 = b.e();
            return e10;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public final int f816a;

    /* renamed from: b, reason: collision with root package name */
    public final int f817b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b b(int i10) {
            k.b(Boolean.valueOf(i10 >= 0));
            return new b(i10, Integer.MAX_VALUE);
        }

        public final b c(String str) {
            if (str == null) {
                return null;
            }
            try {
                String[] split = d().split(str);
                k.b(Boolean.valueOf(split.length == 4));
                k.b(Boolean.valueOf(Intrinsics.areEqual(split[0], "bytes")));
                String str2 = split[1];
                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                int parseInt = Integer.parseInt(str2);
                String str3 = split[2];
                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                int parseInt2 = Integer.parseInt(str3);
                String str4 = split[3];
                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                int parseInt3 = Integer.parseInt(str4);
                k.b(Boolean.valueOf(parseInt2 > parseInt));
                k.b(Boolean.valueOf(parseInt3 > parseInt2));
                return parseInt2 < parseInt3 - 1 ? new b(parseInt, parseInt2) : new b(parseInt, Integer.MAX_VALUE);
            } catch (IllegalArgumentException e10) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                throw new IllegalArgumentException(format, e10);
            }
        }

        public final Pattern d() {
            Object value = b.f815d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Pattern) value;
        }

        public final b e(int i10) {
            k.b(Boolean.valueOf(i10 > 0));
            return new b(0, i10);
        }

        public final String f(int i10) {
            return i10 == Integer.MAX_VALUE ? "" : String.valueOf(i10);
        }

        public a() {
        }
    }

    public b(int i10, int i11) {
        this.f816a = i10;
        this.f817b = i11;
    }

    public static final b d(int i10) {
        return f814c.b(i10);
    }

    public static final Pattern e() {
        return Pattern.compile("[-/ ]");
    }

    public static final b g(int i10) {
        return f814c.e(i10);
    }

    public final boolean c(b bVar) {
        return bVar != null && this.f816a <= bVar.f816a && bVar.f817b <= this.f817b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        b bVar = (b) obj;
        return this.f816a == bVar.f816a && this.f817b == bVar.f817b;
    }

    public final String f() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        a aVar = f814c;
        String format = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f816a), aVar.f(this.f817b)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public int hashCode() {
        return (this.f816a * 31) + this.f817b;
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        a aVar = f814c;
        String format = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f816a), aVar.f(this.f817b)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
