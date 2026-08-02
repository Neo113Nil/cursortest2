package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {

    @NotNull
    private final ClassLoader classLoader;

    public ReflectJavaClassFinder(@NotNull ClassLoader classLoader) {
        classLoader.getClass();
        this.classLoader = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    public JavaClass findClass(@NotNull JavaClassFinder.Request request) {
        request.getClass();
        ClassId classId = request.getClassId();
        FqName packageFqName = classId.getPackageFqName();
        packageFqName.getClass();
        String asString = classId.getRelativeClassName().asString();
        asString.getClass();
        String replace = asString.replace('.', '$');
        replace.getClass();
        if (!packageFqName.isRoot()) {
            replace = packageFqName.asString() + '.' + replace;
        }
        Class<?> tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.classLoader, replace);
        if (tryLoadClass != null) {
            return new ReflectJavaClass(tryLoadClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    public JavaPackage findPackage(@NotNull FqName fqName, boolean z) {
        fqName.getClass();
        return new ReflectJavaPackage(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    public Set<String> knownClassNamesInPackage(@NotNull FqName fqName) {
        fqName.getClass();
        return null;
    }
}
