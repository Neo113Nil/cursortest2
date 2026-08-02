package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeUtilsKt$containsTypeParameter$1 extends xka implements Function1<UnwrappedType, Boolean> {
    public static final TypeUtilsKt$containsTypeParameter$1 INSTANCE = new TypeUtilsKt$containsTypeParameter$1();

    public TypeUtilsKt$containsTypeParameter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UnwrappedType unwrappedType) {
        return Boolean.valueOf(TypeUtils.isTypeParameter(unwrappedType));
    }
}
