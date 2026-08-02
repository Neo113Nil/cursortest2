package Ph;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class S {
    private static final /* synthetic */ S[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final S f9047a = new S("DEFAULT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final S f9048b = new S("LAZY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final S f9049c = new S("ATOMIC", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final S f9050d = new S("UNDISPATCHED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f9051e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[S.values().length];
            try {
                iArr[S.f9047a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S.f9049c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S.f9050d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[S.f9048b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        S[] a10 = a();
        $VALUES = a10;
        f9051e = EnumEntriesKt.enumEntries(a10);
    }

    public S(String str, int i10) {
    }

    public static final /* synthetic */ S[] a() {
        return new S[]{f9047a, f9048b, f9049c, f9050d};
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) $VALUES.clone();
    }

    public final void b(Function2 function2, Object obj, Continuation continuation) {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            Th.a.c(function2, obj, continuation);
            return;
        }
        if (i10 == 2) {
            ContinuationKt.startCoroutine(function2, obj, continuation);
        } else if (i10 == 3) {
            Th.b.c(function2, obj, continuation);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean c() {
        return this == f9048b;
    }
}
