package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class BuiltInAnnotationDescriptor$type$2 extends xka implements Function0<SimpleType> {
    final /* synthetic */ BuiltInAnnotationDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInAnnotationDescriptor$type$2(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        super(0);
        this.this$0 = builtInAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final SimpleType invoke() {
        KotlinBuiltIns kotlinBuiltIns;
        kotlinBuiltIns = this.this$0.builtIns;
        return kotlinBuiltIns.getBuiltInClassByFqName(this.this$0.getFqName()).getDefaultType();
    }
}
