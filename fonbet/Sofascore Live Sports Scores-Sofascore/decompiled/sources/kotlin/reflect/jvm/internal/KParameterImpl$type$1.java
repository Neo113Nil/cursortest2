package kotlin.reflect.jvm.internal;

import defpackage.km5;
import defpackage.sw9;
import defpackage.xka;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KParameterImpl$type$1 extends xka implements Function0<Type> {
    final /* synthetic */ KParameterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KParameterImpl$type$1(KParameterImpl kParameterImpl) {
        super(0);
        this.this$0 = kParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Type invoke() {
        ParameterDescriptor descriptor;
        Type compoundType;
        Type compoundType2;
        descriptor = this.this$0.getDescriptor();
        if ((descriptor instanceof ReceiverParameterDescriptor) && Intrinsics.c(UtilKt.getInstanceReceiverParameter(this.this$0.getCallable().getDescriptor()), descriptor) && this.this$0.getCallable().getDescriptor().getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            DeclarationDescriptor containingDeclaration = this.this$0.getCallable().getDescriptor().getContainingDeclaration();
            containingDeclaration.getClass();
            Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) containingDeclaration);
            if (javaClass != null) {
                return javaClass;
            }
            sw9.u(descriptor, "Cannot determine receiver Java type of inherited declaration: ");
            return null;
        }
        Caller<?> caller = this.this$0.getCallable().getCaller();
        if (!(caller instanceof ValueClassAwareCaller)) {
            if (!(caller instanceof ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller)) {
                return caller.getParameterTypes().get(this.this$0.getIndex());
            }
            KParameterImpl kParameterImpl = this.this$0;
            Class[] clsArr = (Class[]) ((ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller) caller).getOriginalParametersGroups().get(this.this$0.getIndex()).toArray(new Class[0]);
            compoundType = kParameterImpl.compoundType((Type[]) Arrays.copyOf(clsArr, clsArr.length));
            return compoundType;
        }
        IntRange realSlicesOfParameters = ((ValueClassAwareCaller) caller).getRealSlicesOfParameters(this.this$0.getIndex());
        List<Type> parameterTypes = caller.getParameterTypes();
        parameterTypes.getClass();
        realSlicesOfParameters.getClass();
        Collection S0 = realSlicesOfParameters.isEmpty() ? km5.a : CollectionsKt.S0(parameterTypes.subList(realSlicesOfParameters.a, realSlicesOfParameters.b + 1));
        KParameterImpl kParameterImpl2 = this.this$0;
        Type[] typeArr = (Type[]) S0.toArray(new Type[0]);
        compoundType2 = kParameterImpl2.compoundType((Type[]) Arrays.copyOf(typeArr, typeArr.length));
        return compoundType2;
    }
}
