package kotlin.reflect.full;

import com.ironsource.U3;
import defpackage.km5;
import defpackage.sha;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0007\u001a\u0019\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¨\u0006\u000b"}, d2 = {"findAnnotation", "T", "", "Lkotlin/reflect/KAnnotatedElement;", "(Lkotlin/reflect/KAnnotatedElement;)Ljava/lang/annotation/Annotation;", "findAnnotations", "", "klass", "Lkotlin/reflect/KClass;", "hasAnnotation", "", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KAnnotatedElements {
    public static final <T extends Annotation> T findAnnotation(KAnnotatedElement kAnnotatedElement) {
        kAnnotatedElement.getClass();
        Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        if (!it.hasNext()) {
            Intrinsics.h();
            throw null;
        }
        Intrinsics.h();
        throw null;
    }

    @NotNull
    public static final <T extends Annotation> List<T> findAnnotations(@NotNull KAnnotatedElement kAnnotatedElement, @NotNull KClass<T> kClass) {
        Object obj;
        kAnnotatedElement.getClass();
        kClass.getClass();
        ArrayList I = c.I(kAnnotatedElement.getAnnotations(), sha.x(kClass));
        if (!I.isEmpty()) {
            return I;
        }
        Class<? extends Annotation> loadRepeatableContainer = Java8RepeatableContainerLoader.INSTANCE.loadRepeatableContainer(sha.x(kClass));
        if (loadRepeatableContainer != null) {
            Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (sha.x(sha.v((Annotation) obj)).equals(loadRepeatableContainer)) {
                    break;
                }
            }
            Annotation annotation = (Annotation) obj;
            if (annotation != null) {
                Object invoke = annotation.getClass().getMethod(U3.i.X, null).invoke(annotation, null);
                invoke.getClass();
                List<T> asList = Arrays.asList((Annotation[]) invoke);
                asList.getClass();
                return asList;
            }
        }
        return km5.a;
    }

    public static final <T extends Annotation> boolean hasAnnotation(KAnnotatedElement kAnnotatedElement) {
        kAnnotatedElement.getClass();
        Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        if (!it.hasNext()) {
            Intrinsics.h();
            throw null;
        }
        Intrinsics.h();
        throw null;
    }

    public static final <T extends Annotation> List<T> findAnnotations(KAnnotatedElement kAnnotatedElement) {
        kAnnotatedElement.getClass();
        Intrinsics.h();
        throw null;
    }
}
