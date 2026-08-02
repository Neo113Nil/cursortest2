package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaScope$declaredField$1 extends xka implements Function1<Name, PropertyDescriptor> {
    final /* synthetic */ LazyJavaScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredField$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final PropertyDescriptor invoke(@NotNull Name name) {
        PropertyDescriptor resolveProperty;
        MemoizedFunctionToNullable memoizedFunctionToNullable;
        name.getClass();
        LazyJavaScope mainScope = this.this$0.getMainScope();
        LazyJavaScope lazyJavaScope = this.this$0;
        if (mainScope != null) {
            memoizedFunctionToNullable = lazyJavaScope.getMainScope().declaredField;
            return (PropertyDescriptor) memoizedFunctionToNullable.invoke(name);
        }
        JavaField findFieldByName = ((DeclaredMemberIndex) lazyJavaScope.getDeclaredMemberIndex().invoke()).findFieldByName(name);
        if (findFieldByName == null || findFieldByName.isEnumEntry()) {
            return null;
        }
        resolveProperty = this.this$0.resolveProperty(findFieldByName);
        return resolveProperty;
    }
}
