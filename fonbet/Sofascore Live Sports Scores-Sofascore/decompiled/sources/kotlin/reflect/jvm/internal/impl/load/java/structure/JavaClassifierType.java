package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface JavaClassifierType extends JavaType {
    @Nullable
    JavaClassifier getClassifier();

    @NotNull
    String getClassifierQualifiedName();

    @NotNull
    String getPresentableText();

    @NotNull
    List<JavaType> getTypeArguments();

    boolean isRaw();
}
