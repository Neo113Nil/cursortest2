package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeUtilsKt$shouldBeUpdated$1 extends xka implements Function1<UnwrappedType, Boolean> {
    public static final TypeUtilsKt$shouldBeUpdated$1 INSTANCE = new TypeUtilsKt$shouldBeUpdated$1();

    public TypeUtilsKt$shouldBeUpdated$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        return Boolean.valueOf((unwrappedType instanceof StubTypeForBuilderInference) || (unwrappedType.getConstructor() instanceof TypeVariableTypeConstructorMarker) || KotlinTypeKt.isError(unwrappedType));
    }
}
