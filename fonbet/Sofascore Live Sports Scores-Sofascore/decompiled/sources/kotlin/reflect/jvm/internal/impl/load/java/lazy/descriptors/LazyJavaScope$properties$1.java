package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaScope$properties$1 extends xka implements Function1<Name, List<? extends PropertyDescriptor>> {
    final /* synthetic */ LazyJavaScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$properties$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final List<PropertyDescriptor> invoke(@NotNull Name name) {
        MemoizedFunctionToNullable memoizedFunctionToNullable;
        name.getClass();
        ArrayList arrayList = new ArrayList();
        memoizedFunctionToNullable = this.this$0.declaredField;
        CollectionsKt.addIfNotNull(arrayList, memoizedFunctionToNullable.invoke(name));
        this.this$0.computeNonDeclaredProperties(name, arrayList);
        return DescriptorUtils.isAnnotationClass(this.this$0.getOwnerDescriptor()) ? kotlin.collections.CollectionsKt.S0(arrayList) : kotlin.collections.CollectionsKt.S0(this.this$0.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.this$0.getC(), arrayList));
    }
}
