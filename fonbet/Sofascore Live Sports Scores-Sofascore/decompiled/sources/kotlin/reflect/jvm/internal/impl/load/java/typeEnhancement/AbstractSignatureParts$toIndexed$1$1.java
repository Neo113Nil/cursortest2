package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.k13;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractSignatureParts$toIndexed$1$1 extends xka implements Function1<AbstractSignatureParts.TypeAndDefaultQualifiers, Iterable<? extends AbstractSignatureParts.TypeAndDefaultQualifiers>> {
    final /* synthetic */ TypeSystemContext $this_with;
    final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$toIndexed$1$1(AbstractSignatureParts<TAnnotation> abstractSignatureParts, TypeSystemContext typeSystemContext) {
        super(1);
        this.this$0 = abstractSignatureParts;
        this.$this_with = typeSystemContext;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Iterable<AbstractSignatureParts.TypeAndDefaultQualifiers> invoke(@NotNull AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers) {
        KotlinTypeMarker type;
        TypeConstructorMarker typeConstructor;
        List<TypeParameterMarker> parameters;
        JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers;
        AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers2;
        KotlinTypeMarker type2;
        typeAndDefaultQualifiers.getClass();
        if ((this.this$0.getSkipRawTypeArguments() && (type2 = typeAndDefaultQualifiers.getType()) != null && this.$this_with.isRawType(type2)) || (type = typeAndDefaultQualifiers.getType()) == null || (typeConstructor = this.$this_with.typeConstructor(type)) == null || (parameters = this.$this_with.getParameters(typeConstructor)) == null) {
            return null;
        }
        List<TypeArgumentMarker> arguments = this.$this_with.getArguments(typeAndDefaultQualifiers.getType());
        TypeSystemContext typeSystemContext = this.$this_with;
        AbstractSignatureParts<TAnnotation> abstractSignatureParts = this.this$0;
        Iterator<T> it = parameters.iterator();
        Iterator<T> it2 = arguments.iterator();
        ArrayList arrayList = new ArrayList(Math.min(k13.r(parameters, 10), k13.r(arguments, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) it2.next();
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) next;
            if (typeSystemContext.isStarProjection(typeArgumentMarker)) {
                typeAndDefaultQualifiers2 = new AbstractSignatureParts.TypeAndDefaultQualifiers(null, typeAndDefaultQualifiers.getDefaultQualifiers(), typeParameterMarker);
            } else {
                KotlinTypeMarker type3 = typeSystemContext.getType(typeArgumentMarker);
                extractAndMergeDefaultQualifiers = abstractSignatureParts.extractAndMergeDefaultQualifiers(type3, typeAndDefaultQualifiers.getDefaultQualifiers());
                typeAndDefaultQualifiers2 = new AbstractSignatureParts.TypeAndDefaultQualifiers(type3, extractAndMergeDefaultQualifiers, typeParameterMarker);
            }
            arrayList.add(typeAndDefaultQualifiers2);
        }
        return arrayList;
    }
}
