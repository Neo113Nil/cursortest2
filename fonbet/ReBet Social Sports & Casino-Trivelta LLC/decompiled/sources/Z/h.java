package Z;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final int f14420c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f14421a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f14422b;

    public static final class a extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f14423d = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public h(String name, Function2 mergePolicy) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mergePolicy, "mergePolicy");
        this.f14421a = name;
        this.f14422b = mergePolicy;
    }

    public final String a() {
        return this.f14421a;
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.f14421a;
    }

    public /* synthetic */ h(String str, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? a.f14423d : function2);
    }
}
