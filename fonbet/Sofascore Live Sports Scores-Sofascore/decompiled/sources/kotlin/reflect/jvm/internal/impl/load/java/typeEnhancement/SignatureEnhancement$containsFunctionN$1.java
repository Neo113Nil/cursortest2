package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SignatureEnhancement$containsFunctionN$1 extends xka implements Function1<UnwrappedType, Boolean> {
    public static final SignatureEnhancement$containsFunctionN$1 INSTANCE = new SignatureEnhancement$containsFunctionN$1();

    public SignatureEnhancement$containsFunctionN$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UnwrappedType unwrappedType) {
        ClassifierDescriptor mo893getDeclarationDescriptor = unwrappedType.getConstructor().mo893getDeclarationDescriptor();
        if (mo893getDeclarationDescriptor == null) {
            return Boolean.FALSE;
        }
        Name name = mo893getDeclarationDescriptor.getName();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        return Boolean.valueOf(Intrinsics.c(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.c(DescriptorUtilsKt.fqNameOrNull(mo893getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
    }
}
