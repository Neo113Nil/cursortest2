package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface PlatformDependentTypeTransformer {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class None implements PlatformDependentTypeTransformer {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer
        @NotNull
        public SimpleType transformPlatformType(@NotNull ClassId classId, @NotNull SimpleType simpleType) {
            classId.getClass();
            simpleType.getClass();
            return simpleType;
        }
    }

    @NotNull
    SimpleType transformPlatformType(@NotNull ClassId classId, @NotNull SimpleType simpleType);
}
