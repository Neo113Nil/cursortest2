package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeParameterUpperBoundEraser$erroneousErasedBound$2 extends xka implements Function0<ErrorType> {
    final /* synthetic */ TypeParameterUpperBoundEraser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeParameterUpperBoundEraser$erroneousErasedBound$2(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        super(0);
        this.this$0 = typeParameterUpperBoundEraser;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ErrorType invoke() {
        return ErrorUtils.createErrorType(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, this.this$0.toString());
    }
}
