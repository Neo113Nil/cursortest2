package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.tub;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaAnnotationDescriptor$allValueArguments$2 extends xka implements Function0<Map<Name, ? extends ConstantValue<?>>> {
    final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$allValueArguments$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.this$0 = lazyJavaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<Name, ConstantValue<?>> invoke() {
        JavaAnnotation javaAnnotation;
        ConstantValue resolveAnnotationArgument;
        javaAnnotation = this.this$0.javaAnnotation;
        Collection<JavaAnnotationArgument> arguments = javaAnnotation.getArguments();
        LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
            Name name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            resolveAnnotationArgument = lazyJavaAnnotationDescriptor.resolveAnnotationArgument(javaAnnotationArgument);
            Pair pair = resolveAnnotationArgument != null ? new Pair(name, resolveAnnotationArgument) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return tub.o(arrayList);
    }
}
