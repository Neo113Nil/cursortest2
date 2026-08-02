package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.ironsource.C4227o2;
import defpackage.k13;
import defpackage.km5;
import defpackage.nh0;
import defpackage.sc5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {

    @NotNull
    public static final Factory Factory = new Factory(null);

    private FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.getEMPTY(), OperatorNameConventions.INVOKE, kind, SourceElement.NO_SOURCE);
        setOperator(true);
        setSuspend(z);
        setHasStableParameterNames(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$CopyConfiguration] */
    private final FunctionDescriptor replaceParameterNames(List<Name> list) {
        Name name;
        int size = getValueParameters().size() - list.size();
        boolean z = true;
        if (size == 0) {
            List<ValueParameterDescriptor> valueParameters = getValueParameters();
            valueParameters.getClass();
            ArrayList Y0 = CollectionsKt.Y0(list, valueParameters);
            if (!Y0.isEmpty()) {
                Iterator it = Y0.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    if (!Intrinsics.c((Name) pair.a, ((ValueParameterDescriptor) pair.b).getName())) {
                    }
                }
            }
            return this;
        }
        List<ValueParameterDescriptor> valueParameters2 = getValueParameters();
        valueParameters2.getClass();
        ArrayList arrayList = new ArrayList(k13.r(valueParameters2, 10));
        for (ValueParameterDescriptor valueParameterDescriptor : valueParameters2) {
            Name name2 = valueParameterDescriptor.getName();
            name2.getClass();
            int index = valueParameterDescriptor.getIndex();
            int i = index - size;
            if (i >= 0 && (name = list.get(i)) != null) {
                name2 = name;
            }
            arrayList.add(valueParameterDescriptor.copy(this, name2, index));
        }
        FunctionDescriptorImpl.CopyConfiguration newCopyBuilder = newCopyBuilder(TypeSubstitutor.EMPTY);
        if (!list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Name) it2.next()) == null) {
                    break;
                }
            }
        }
        z = false;
        ?? original = newCopyBuilder.setHasSynthesizedParameterNames(z).setValueParameters2((List<ValueParameterDescriptor>) arrayList).setOriginal((CallableMemberDescriptor) getOriginal());
        original.getClass();
        FunctionDescriptor doSubstitute = super.doSubstitute(original);
        doSubstitute.getClass();
        return doSubstitute;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        declarationDescriptor.getClass();
        kind.getClass();
        annotations.getClass();
        sourceElement.getClass();
        return new FunctionInvokeDescriptor(declarationDescriptor, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @Nullable
    public FunctionDescriptor doSubstitute(@NotNull FunctionDescriptorImpl.CopyConfiguration copyConfiguration) {
        copyConfiguration.getClass();
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.doSubstitute(copyConfiguration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List<ValueParameterDescriptor> valueParameters = functionInvokeDescriptor.getValueParameters();
        valueParameters.getClass();
        if (valueParameters != null && valueParameters.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator<T> it = valueParameters.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            type.getClass();
            if (FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type) != null) {
                List<ValueParameterDescriptor> valueParameters2 = functionInvokeDescriptor.getValueParameters();
                valueParameters2.getClass();
                ArrayList arrayList = new ArrayList(k13.r(valueParameters2, 10));
                Iterator<T> it2 = valueParameters2.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    type2.getClass();
                    arrayList.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2));
                }
                return functionInvokeDescriptor.replaceParameterNames(arrayList);
            }
        }
        return functionInvokeDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ValueParameterDescriptor createValueParameter(FunctionInvokeDescriptor functionInvokeDescriptor, int i, TypeParameterDescriptor typeParameterDescriptor) {
            String lowerCase;
            String asString = typeParameterDescriptor.getName().asString();
            asString.getClass();
            if (Intrinsics.c(asString, "T")) {
                lowerCase = C4227o2.p;
            } else if (Intrinsics.c(asString, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = asString.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            Annotations empty = Annotations.Companion.getEMPTY();
            Name identifier = Name.identifier(lowerCase);
            identifier.getClass();
            SimpleType defaultType = typeParameterDescriptor.getDefaultType();
            defaultType.getClass();
            SourceElement sourceElement = SourceElement.NO_SOURCE;
            sourceElement.getClass();
            return new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i, empty, identifier, defaultType, false, false, false, null, sourceElement);
        }

        @NotNull
        public final FunctionInvokeDescriptor create(@NotNull FunctionClassDescriptor functionClassDescriptor, boolean z) {
            functionClassDescriptor.getClass();
            List<TypeParameterDescriptor> declaredTypeParameters = functionClassDescriptor.getDeclaredTypeParameters();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClassDescriptor, null, CallableMemberDescriptor.Kind.DECLARATION, z, null);
            ReceiverParameterDescriptor thisAsReceiverParameter = functionClassDescriptor.getThisAsReceiverParameter();
            km5 km5Var = km5.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : declaredTypeParameters) {
                if (((TypeParameterDescriptor) obj).getVariance() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            nh0 X0 = CollectionsKt.X0(arrayList);
            ArrayList arrayList2 = new ArrayList(k13.r(X0, 10));
            Iterator it = X0.iterator();
            while (true) {
                sc5 sc5Var = (sc5) it;
                if (!sc5Var.b.hasNext()) {
                    functionInvokeDescriptor.initialize((ReceiverParameterDescriptor) null, thisAsReceiverParameter, (List<ReceiverParameterDescriptor>) km5Var, (List<? extends TypeParameterDescriptor>) km5Var, (List<ValueParameterDescriptor>) arrayList2, (KotlinType) ((TypeParameterDescriptor) CollectionsKt.h0(declaredTypeParameters)).getDefaultType(), Modality.ABSTRACT, DescriptorVisibilities.PUBLIC);
                    functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
                    return functionInvokeDescriptor;
                }
                IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                arrayList2.add(FunctionInvokeDescriptor.Factory.createValueParameter(functionInvokeDescriptor, indexedValue.a, (TypeParameterDescriptor) indexedValue.b));
            }
        }

        private Factory() {
        }
    }

    public /* synthetic */ FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z);
    }
}
