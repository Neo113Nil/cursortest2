package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1 extends xka implements Function1<UnwrappedType, Boolean> {
    public static final CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1 INSTANCE = new CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1();

    public CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        return Boolean.valueOf(CapturedTypeConstructorKt.isCaptured(unwrappedType));
    }
}
