package kotlin.reflect.jvm.internal.impl.load.kotlin;

import defpackage.xka;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [A, C] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1<A, C> extends xka implements Function2<AbstractBinaryClassAnnotationAndConstantLoader.AnnotationsContainerWithConstants<? extends A, ? extends C>, MemberSignature, C> {
    public static final AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1 INSTANCE = new AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1();

    public AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final C invoke(@NotNull AbstractBinaryClassAnnotationAndConstantLoader.AnnotationsContainerWithConstants<? extends A, ? extends C> annotationsContainerWithConstants, @NotNull MemberSignature memberSignature) {
        annotationsContainerWithConstants.getClass();
        memberSignature.getClass();
        return annotationsContainerWithConstants.getPropertyConstants().get(memberSignature);
    }
}
