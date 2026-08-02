package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¨\u0006\u0007"}, d2 = {"isSubtypeOf", "", "Lkotlin/reflect/KType;", "other", "isSupertypeOf", "withNullability", "nullable", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KTypes {
    public static final boolean isSubtypeOf(@NotNull KType kType, @NotNull KType kType2) {
        kType.getClass();
        kType2.getClass();
        return TypeUtilsKt.isSubtypeOf(((KTypeImpl) kType).getType(), ((KTypeImpl) kType2).getType());
    }

    public static final boolean isSupertypeOf(@NotNull KType kType, @NotNull KType kType2) {
        kType.getClass();
        kType2.getClass();
        return isSubtypeOf(kType2, kType);
    }

    @NotNull
    public static final KType withNullability(@NotNull KType kType, boolean z) {
        kType.getClass();
        return ((KTypeImpl) kType).makeNullableAsSpecified$kotlin_reflection(z);
    }
}
