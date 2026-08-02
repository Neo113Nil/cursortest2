package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeUtilsKt$containsTypeAliasParameters$1 extends xka implements Function1<UnwrappedType, Boolean> {
    public static final TypeUtilsKt$containsTypeAliasParameters$1 INSTANCE = new TypeUtilsKt$containsTypeAliasParameters$1();

    public TypeUtilsKt$containsTypeAliasParameters$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        ClassifierDescriptor mo893getDeclarationDescriptor = unwrappedType.getConstructor().mo893getDeclarationDescriptor();
        return Boolean.valueOf(mo893getDeclarationDescriptor != null ? TypeUtilsKt.isTypeAliasParameter(mo893getDeclarationDescriptor) : false);
    }
}
