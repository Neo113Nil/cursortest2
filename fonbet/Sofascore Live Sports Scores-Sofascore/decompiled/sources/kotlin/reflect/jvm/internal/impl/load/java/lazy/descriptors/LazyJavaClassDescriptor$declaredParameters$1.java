package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.k13;
import defpackage.xka;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaClassDescriptor$declaredParameters$1 extends xka implements Function0<List<? extends TypeParameterDescriptor>> {
    final /* synthetic */ LazyJavaClassDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$declaredParameters$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(0);
        this.this$0 = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<TypeParameterDescriptor> invoke() {
        List<JavaTypeParameter> typeParameters = this.this$0.getJClass().getTypeParameters();
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.this$0;
        ArrayList arrayList = new ArrayList(k13.r(typeParameters, 10));
        for (JavaTypeParameter javaTypeParameter : typeParameters) {
            TypeParameterDescriptor resolveTypeParameter = lazyJavaClassDescriptor.c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
            if (resolveTypeParameter == null) {
                StringBuilder sb = new StringBuilder("Parameter ");
                sb.append(javaTypeParameter);
                JavaClass jClass = lazyJavaClassDescriptor.getJClass();
                sb.append(" surely belongs to class ");
                sb.append(jClass);
                sb.append(", so it must be resolved");
                throw new AssertionError(sb.toString());
            }
            arrayList.add(resolveTypeParameter);
        }
        return arrayList;
    }
}
