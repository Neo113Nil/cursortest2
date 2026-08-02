package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeParameterUpperBoundEraser$getErasedUpperBound$1 extends xka implements Function1<TypeParameterUpperBoundEraser.DataToEraseUpperBound, KotlinType> {
    final /* synthetic */ TypeParameterUpperBoundEraser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeParameterUpperBoundEraser$getErasedUpperBound$1(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        super(1);
        this.this$0 = typeParameterUpperBoundEraser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final KotlinType invoke(TypeParameterUpperBoundEraser.DataToEraseUpperBound dataToEraseUpperBound) {
        KotlinType erasedUpperBoundInternal;
        erasedUpperBoundInternal = this.this$0.getErasedUpperBoundInternal(dataToEraseUpperBound.getTypeParameter(), dataToEraseUpperBound.getTypeAttr());
        return erasedUpperBoundInternal;
    }
}
