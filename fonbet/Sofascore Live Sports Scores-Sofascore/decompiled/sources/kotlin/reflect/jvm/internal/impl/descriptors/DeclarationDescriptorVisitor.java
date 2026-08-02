package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface DeclarationDescriptorVisitor<R, D> {
    R visitClassDescriptor(ClassDescriptor classDescriptor, D d);

    R visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, D d);

    R visitFunctionDescriptor(FunctionDescriptor functionDescriptor, D d);

    R visitModuleDeclaration(ModuleDescriptor moduleDescriptor, D d);

    R visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, D d);

    R visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, D d);

    R visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, D d);

    R visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, D d);

    R visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, D d);

    R visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, D d);

    R visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, D d);

    R visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, D d);

    R visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, D d);
}
