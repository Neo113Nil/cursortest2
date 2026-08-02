package kotlin.reflect.jvm.internal.impl.load.java.components;

import defpackage.lm5;
import defpackage.sub;
import defpackage.xka;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaTargetAnnotationDescriptor$allValueArguments$2 extends xka implements Function0<Map<Name, ? extends ConstantValue<? extends Object>>> {
    final /* synthetic */ JavaTargetAnnotationDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor$allValueArguments$2(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        super(0);
        this.this$0 = javaTargetAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<Name, ConstantValue<Object>> invoke() {
        JavaAnnotationArgument firstArgument = this.this$0.getFirstArgument();
        ConstantValue<?> mapJavaTargetArguments$descriptors_jvm = firstArgument instanceof JavaArrayAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((JavaArrayAnnotationArgument) this.this$0.getFirstArgument()).getElements()) : firstArgument instanceof JavaEnumValueAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(a.c(this.this$0.getFirstArgument())) : null;
        Map<Name, ConstantValue<Object>> d = mapJavaTargetArguments$descriptors_jvm != null ? sub.d(new Pair(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), mapJavaTargetArguments$descriptors_jvm)) : null;
        if (d != null) {
            return d;
        }
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }
}
