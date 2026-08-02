package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [TAnnotation] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1<TAnnotation> extends xka implements Function1<TAnnotation, Boolean> {
    public static final AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1 INSTANCE = new AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1();

    public AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull TAnnotation tannotation) {
        tannotation.getClass();
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1<TAnnotation>) obj);
    }
}
