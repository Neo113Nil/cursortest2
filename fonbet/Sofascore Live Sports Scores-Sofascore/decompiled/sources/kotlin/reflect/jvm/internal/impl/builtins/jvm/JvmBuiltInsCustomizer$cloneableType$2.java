package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltInsCustomizer$cloneableType$2 extends xka implements Function0<SimpleType> {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$cloneableType$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
        this.$storageManager = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final SimpleType invoke() {
        JvmBuiltIns.Settings settings;
        JvmBuiltIns.Settings settings2;
        settings = this.this$0.getSettings();
        ModuleDescriptor ownerModuleDescriptor = settings.getOwnerModuleDescriptor();
        ClassId cloneable_class_id = JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID();
        StorageManager storageManager = this.$storageManager;
        settings2 = this.this$0.getSettings();
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(ownerModuleDescriptor, cloneable_class_id, new NotFoundClasses(storageManager, settings2.getOwnerModuleDescriptor())).getDefaultType();
    }
}
