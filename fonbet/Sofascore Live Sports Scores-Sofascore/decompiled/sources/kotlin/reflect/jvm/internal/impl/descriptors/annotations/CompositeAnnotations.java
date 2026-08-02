package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import defpackage.c38;
import defpackage.i5h;
import defpackage.ph0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CompositeAnnotations implements Annotations {

    @NotNull
    private final List<Annotations> delegates;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(@NotNull Annotations... annotationsArr) {
        this((List<? extends Annotations>) ph0.X(annotationsArr));
        annotationsArr.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* renamed from: findAnnotation */
    public AnnotationDescriptor mo887findAnnotation(@NotNull FqName fqName) {
        fqName.getClass();
        return (AnnotationDescriptor) i5h.j(i5h.o(CollectionsKt.N(this.delegates), new CompositeAnnotations$findAnnotation$1(fqName)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        fqName.getClass();
        Iterator it = ((Iterable) CollectionsKt.N(this.delegates).b).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.delegates;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return new c38(i5h.k(CollectionsKt.N(this.delegates), CompositeAnnotations$iterator$1.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(@NotNull List<? extends Annotations> list) {
        list.getClass();
        this.delegates = list;
    }
}
