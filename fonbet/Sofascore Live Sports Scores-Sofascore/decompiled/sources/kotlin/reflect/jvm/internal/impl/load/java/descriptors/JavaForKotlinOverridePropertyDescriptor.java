package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {

    @NotNull
    private final SimpleFunctionDescriptor getterMethod;

    @NotNull
    private final PropertyDescriptor overriddenProperty;

    @Nullable
    private final SimpleFunctionDescriptor setterMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaForKotlinOverridePropertyDescriptor(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor2, @NotNull PropertyDescriptor propertyDescriptor) {
        super(classDescriptor, Annotations.Companion.getEMPTY(), simpleFunctionDescriptor.getModality(), simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor2 != null, propertyDescriptor.getName(), simpleFunctionDescriptor.getSource(), null, CallableMemberDescriptor.Kind.DECLARATION, false, null);
        classDescriptor.getClass();
        simpleFunctionDescriptor.getClass();
        propertyDescriptor.getClass();
        this.getterMethod = simpleFunctionDescriptor;
        this.setterMethod = simpleFunctionDescriptor2;
        this.overriddenProperty = propertyDescriptor;
    }
}
