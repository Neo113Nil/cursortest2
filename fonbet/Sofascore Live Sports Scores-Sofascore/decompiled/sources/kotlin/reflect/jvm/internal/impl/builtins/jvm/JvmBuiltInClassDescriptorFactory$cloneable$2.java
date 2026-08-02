package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.rm5;
import defpackage.xka;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltInClassDescriptorFactory$cloneable$2 extends xka implements Function0<ClassDescriptorImpl> {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltInClassDescriptorFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInClassDescriptorFactory$cloneable$2(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        super(0);
        this.this$0 = jvmBuiltInClassDescriptorFactory;
        this.$storageManager = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ClassDescriptorImpl invoke() {
        Function1 function1;
        ModuleDescriptor moduleDescriptor;
        Name name;
        ModuleDescriptor moduleDescriptor2;
        function1 = this.this$0.computeContainingDeclaration;
        moduleDescriptor = this.this$0.moduleDescriptor;
        DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) function1.invoke(moduleDescriptor);
        name = JvmBuiltInClassDescriptorFactory.CLONEABLE_NAME;
        Modality modality = Modality.ABSTRACT;
        ClassKind classKind = ClassKind.INTERFACE;
        moduleDescriptor2 = this.this$0.moduleDescriptor;
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(declarationDescriptor, name, modality, classKind, a.c(moduleDescriptor2.getBuiltIns().getAnyType()), SourceElement.NO_SOURCE, false, this.$storageManager);
        classDescriptorImpl.initialize(new CloneableClassScope(this.$storageManager, classDescriptorImpl), rm5.a, null);
        return classDescriptorImpl;
    }
}
