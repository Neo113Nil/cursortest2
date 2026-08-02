package kotlin.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/jvm/internal/V;", "Lkotlin/reflect/r;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class V implements kotlin.reflect.r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/V$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.jvm.internal.V$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: kotlin.jvm.internal.V$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1189a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f71794a;

            static {
                int[] iArr = new int[kotlin.reflect.s.values().length];
                try {
                    iArr[kotlin.reflect.s.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlin.reflect.s.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlin.reflect.s.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f71794a = iArr;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
