package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaScope$functions$1 extends xka implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ LazyJavaScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$functions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
        MemoizedFunctionToNotNull memoizedFunctionToNotNull;
        name.getClass();
        memoizedFunctionToNotNull = this.this$0.declaredFunctions;
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) memoizedFunctionToNotNull.invoke(name));
        this.this$0.retainMostSpecificMethods(linkedHashSet);
        this.this$0.computeNonDeclaredFunctions(linkedHashSet, name);
        return CollectionsKt.S0(this.this$0.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.this$0.getC(), linkedHashSet));
    }
}
