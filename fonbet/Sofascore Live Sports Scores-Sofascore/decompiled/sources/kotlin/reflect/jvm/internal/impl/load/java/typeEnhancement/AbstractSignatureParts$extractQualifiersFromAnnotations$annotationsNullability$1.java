package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [TAnnotation] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1<TAnnotation> extends xka implements Function1<TAnnotation, Boolean> {
    final /* synthetic */ AbstractSignatureParts.TypeAndDefaultQualifiers $this_extractQualifiersFromAnnotations;
    final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1(AbstractSignatureParts<TAnnotation> abstractSignatureParts, AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers) {
        super(1);
        this.this$0 = abstractSignatureParts;
        this.$this_extractQualifiersFromAnnotations = typeAndDefaultQualifiers;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull TAnnotation tannotation) {
        tannotation.getClass();
        return Boolean.valueOf(this.this$0.forceWarning(tannotation, this.$this_extractQualifiersFromAnnotations.getType()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1<TAnnotation>) obj);
    }
}
