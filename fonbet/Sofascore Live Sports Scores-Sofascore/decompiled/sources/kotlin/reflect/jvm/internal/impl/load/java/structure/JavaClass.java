package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    @NotNull
    Collection<JavaConstructor> getConstructors();

    @NotNull
    Collection<JavaField> getFields();

    @Nullable
    FqName getFqName();

    @NotNull
    Collection<Name> getInnerClassNames();

    @Nullable
    LightClassOriginKind getLightClassOriginKind();

    @NotNull
    Collection<JavaMethod> getMethods();

    @Nullable
    JavaClass getOuterClass();

    @NotNull
    Collection<JavaClassifierType> getPermittedTypes();

    @NotNull
    Collection<JavaRecordComponent> getRecordComponents();

    @NotNull
    Collection<JavaClassifierType> getSupertypes();

    boolean hasDefaultConstructor();

    boolean isAnnotationType();

    boolean isEnum();

    boolean isInterface();

    boolean isRecord();

    boolean isSealed();
}
