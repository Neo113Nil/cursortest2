package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.ogj;
import defpackage.xka;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NotFoundClasses$classes$1 extends xka implements Function1<NotFoundClasses.ClassRequest, ClassDescriptor> {
    final /* synthetic */ NotFoundClasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.this$0 = notFoundClasses;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final ClassDescriptor invoke(@NotNull NotFoundClasses.ClassRequest classRequest) {
        MemoizedFunctionToNotNull memoizedFunctionToNotNull;
        DeclarationDescriptor declarationDescriptor;
        StorageManager storageManager;
        classRequest.getClass();
        ClassId component1 = classRequest.component1();
        List<Integer> component2 = classRequest.component2();
        if (component1.isLocal()) {
            ogj.i(component1, "Unresolved local class: ");
            return null;
        }
        ClassId outerClassId = component1.getOuterClassId();
        if (outerClassId == null || (declarationDescriptor = this.this$0.getClass(outerClassId, CollectionsKt.S(component2, 1))) == null) {
            memoizedFunctionToNotNull = this.this$0.packageFragments;
            FqName packageFqName = component1.getPackageFqName();
            packageFqName.getClass();
            declarationDescriptor = (ClassOrPackageFragmentDescriptor) memoizedFunctionToNotNull.invoke(packageFqName);
        }
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        boolean isNestedClass = component1.isNestedClass();
        storageManager = this.this$0.storageManager;
        Name shortClassName = component1.getShortClassName();
        shortClassName.getClass();
        Integer num = (Integer) CollectionsKt.firstOrNull(component2);
        return new NotFoundClasses.MockClassDescriptor(storageManager, declarationDescriptor2, shortClassName, isNestedClass, num != null ? num.intValue() : 0);
    }
}
