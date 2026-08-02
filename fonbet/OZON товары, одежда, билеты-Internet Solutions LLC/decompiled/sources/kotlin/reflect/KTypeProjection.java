package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "c", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class KTypeProjection {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final KTypeProjection f71852d = new KTypeProjection(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final s f71853a;

    /* renamed from: b, reason: collision with root package name */
    private final q f71854b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KTypeProjection$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.KTypeProjection$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes10.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71855a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71855a = iArr;
        }
    }

    public KTypeProjection(s sVar, q qVar) {
        String str;
        this.f71853a = sVar;
        this.f71854b = qVar;
        if ((sVar == null) == (qVar == null)) {
            return;
        }
        if (sVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + sVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* renamed from: a, reason: from getter */
    public final s getF71853a() {
        return this.f71853a;
    }

    /* renamed from: b, reason: from getter */
    public final q getF71854b() {
        return this.f71854b;
    }

    public final q c() {
        return this.f71854b;
    }

    public final s d() {
        return this.f71853a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f71853a == kTypeProjection.f71853a && Intrinsics.d(this.f71854b, kTypeProjection.f71854b);
    }

    public final int hashCode() {
        s sVar = this.f71853a;
        int hashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        q qVar = this.f71854b;
        return hashCode + (qVar != null ? qVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        s sVar = this.f71853a;
        int i11 = sVar == null ? -1 : b.f71855a[sVar.ordinal()];
        if (i11 == -1) {
            return "*";
        }
        q qVar = this.f71854b;
        if (i11 == 1) {
            return String.valueOf(qVar);
        }
        if (i11 == 2) {
            return "in " + qVar;
        }
        if (i11 != 3) {
            throw new Sc.o();
        }
        return "out " + qVar;
    }
}
