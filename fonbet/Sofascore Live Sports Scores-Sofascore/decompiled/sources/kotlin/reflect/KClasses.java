package kotlin.reflect;

import com.ironsource.U3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0087\u0080\u0004b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bb\u0002\b\t¢\u0006\u0002\u0010\u0005\u001aA\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0087\u0080\u0004b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bb\u0002\b\t¢\u0006\u0002\u0010\u0005¨\u0006\u000b"}, d2 = {"cast", "T", "", "Lkotlin/reflect/KClass;", U3.i.X, "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/SinceKotlin;", "version", "1.4", "Lkotlin/internal/LowPriorityInOverloadResolution;", "safeCast", "kotlin-stdlib"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KClasses {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> T cast(@NotNull KClass<T> kClass, @Nullable Object obj) {
        kClass.getClass();
        if (kClass.isInstance(obj)) {
            obj.getClass();
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + kClass.getQualifiedName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> T safeCast(@NotNull KClass<T> kClass, @Nullable Object obj) {
        kClass.getClass();
        if (!kClass.isInstance(obj)) {
            return null;
        }
        obj.getClass();
        return obj;
    }
}
