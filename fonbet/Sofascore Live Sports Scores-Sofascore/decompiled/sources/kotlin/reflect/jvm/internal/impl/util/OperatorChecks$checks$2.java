package kotlin.reflect.jvm.internal.impl.util;

import defpackage.xka;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class OperatorChecks$checks$2 extends xka implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$2 INSTANCE = new OperatorChecks$checks$2();

    public OperatorChecks$checks$2() {
        super(1);
    }

    private static final boolean invoke$isAny(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isAny((ClassDescriptor) declarationDescriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[RETURN] */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        boolean z;
        functionDescriptor.getClass();
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        if (!invoke$isAny(containingDeclaration)) {
            Collection<? extends FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
            overriddenDescriptors.getClass();
            Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    DeclarationDescriptor containingDeclaration2 = ((FunctionDescriptor) it.next()).getContainingDeclaration();
                    containingDeclaration2.getClass();
                    if (invoke$isAny(containingDeclaration2)) {
                        break;
                    }
                }
            }
            if (!DescriptorUtilKt.isTypedEqualsInValueClass(functionDescriptor)) {
                z = false;
                if (!z) {
                    return null;
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                DeclarationDescriptor containingDeclaration3 = functionDescriptor.getContainingDeclaration();
                containingDeclaration3.getClass();
                if (InlineClassesUtilsKt.isValueClass(containingDeclaration3)) {
                    DescriptorRenderer descriptorRenderer = DescriptorRenderer.SHORT_NAMES_IN_TYPES;
                    DeclarationDescriptor containingDeclaration4 = functionDescriptor.getContainingDeclaration();
                    containingDeclaration4.getClass();
                    SimpleType defaultType = ((ClassDescriptor) containingDeclaration4).getDefaultType();
                    defaultType.getClass();
                    sb.append(" or define ''equals(other: " + descriptorRenderer.renderType(TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) + "): Boolean''");
                }
                return sb.toString();
            }
        }
        z = true;
        if (!z) {
        }
    }
}
