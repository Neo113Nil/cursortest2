package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaScope$declaredFunctions$1 extends xka implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ LazyJavaScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredFunctions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
        MemoizedFunctionToNotNull memoizedFunctionToNotNull;
        name.getClass();
        if (this.this$0.getMainScope() != null) {
            memoizedFunctionToNotNull = this.this$0.getMainScope().declaredFunctions;
            return (Collection) memoizedFunctionToNotNull.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (JavaMethod javaMethod : ((DeclaredMemberIndex) this.this$0.getDeclaredMemberIndex().invoke()).findMethodsByName(name)) {
            JavaMethodDescriptor resolveMethodToFunctionDescriptor = this.this$0.resolveMethodToFunctionDescriptor(javaMethod);
            if (this.this$0.isVisibleAsFunction(resolveMethodToFunctionDescriptor)) {
                this.this$0.getC().getComponents().getJavaResolverCache().recordMethod(javaMethod, resolveMethodToFunctionDescriptor);
                arrayList.add(resolveMethodToFunctionDescriptor);
            }
        }
        this.this$0.computeImplicitlyDeclaredFunctions(arrayList, name);
        return arrayList;
    }
}
