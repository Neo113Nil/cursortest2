package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface JavaAnnotationOwner extends JavaElement {
    @Nullable
    JavaAnnotation findAnnotation(@NotNull FqName fqName);

    @NotNull
    Collection<JavaAnnotation> getAnnotations();

    boolean isDeprecatedInJavaDoc();
}
