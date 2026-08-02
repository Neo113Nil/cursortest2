package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ConstUtil {

    @NotNull
    public static final ConstUtil INSTANCE = new ConstUtil();

    private ConstUtil() {
    }

    public static final boolean canBeUsedForConstVal(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return ConstUtilKt.canBeUsedForConstVal(kotlinType);
    }
}
