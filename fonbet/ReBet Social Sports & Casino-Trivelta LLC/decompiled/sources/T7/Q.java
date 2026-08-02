package T7;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public enum Q {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* renamed from: b, reason: collision with root package name */
    public static final a f11034b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f11035c;

    /* renamed from: a, reason: collision with root package name */
    public final long f11039a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumSet a(long j10) {
            EnumSet result = EnumSet.noneOf(Q.class);
            Iterator it = Q.f11035c.iterator();
            while (it.hasNext()) {
                Q q10 = (Q) it.next();
                if ((q10.c() & j10) != 0) {
                    result.add(q10);
                }
            }
            Intrinsics.checkNotNullExpressionValue(result, "result");
            return result;
        }

        public a() {
        }
    }

    static {
        EnumSet allOf = EnumSet.allOf(Q.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "allOf(SmartLoginOption::class.java)");
        f11035c = allOf;
    }

    Q(long j10) {
        this.f11039a = j10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Q[] valuesCustom() {
        Q[] valuesCustom = values();
        return (Q[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final long c() {
        return this.f11039a;
    }
}
