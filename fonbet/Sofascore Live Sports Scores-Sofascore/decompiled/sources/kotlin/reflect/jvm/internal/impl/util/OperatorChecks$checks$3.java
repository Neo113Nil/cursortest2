package kotlin.reflect.jvm.internal.impl.util;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class OperatorChecks$checks$3 extends xka implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$3 INSTANCE = new OperatorChecks$checks$3();

    public OperatorChecks$checks$3() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r4 != false) goto L14;
     */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        boolean z;
        boolean incDecCheckForExpectClass;
        functionDescriptor.getClass();
        ReceiverParameterDescriptor dispatchReceiverParameter = functionDescriptor.getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null) {
            dispatchReceiverParameter = functionDescriptor.getExtensionReceiverParameter();
        }
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        boolean z2 = false;
        if (dispatchReceiverParameter != null) {
            KotlinType returnType = functionDescriptor.getReturnType();
            if (returnType != null) {
                KotlinType type = dispatchReceiverParameter.getType();
                type.getClass();
                z = TypeUtilsKt.isSubtypeOf(returnType, type);
            } else {
                z = false;
            }
            if (!z) {
                incDecCheckForExpectClass = operatorChecks.incDecCheckForExpectClass(functionDescriptor, dispatchReceiverParameter);
            }
            z2 = true;
        }
        if (z2) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }
}
