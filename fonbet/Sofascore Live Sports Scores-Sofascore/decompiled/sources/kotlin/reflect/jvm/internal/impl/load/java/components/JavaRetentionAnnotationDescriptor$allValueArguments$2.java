package kotlin.reflect.jvm.internal.impl.load.java.components;

import defpackage.lm5;
import defpackage.sub;
import defpackage.xka;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaRetentionAnnotationDescriptor$allValueArguments$2 extends xka implements Function0<Map<Name, ? extends ConstantValue<?>>> {
    final /* synthetic */ JavaRetentionAnnotationDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor$allValueArguments$2(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        super(0);
        this.this$0 = javaRetentionAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<Name, ConstantValue<?>> invoke() {
        ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(this.this$0.getFirstArgument());
        Map<Name, ConstantValue<?>> d = mapJavaRetentionArgument$descriptors_jvm != null ? sub.d(new Pair(JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), mapJavaRetentionArgument$descriptors_jvm)) : null;
        if (d != null) {
            return d;
        }
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }
}
