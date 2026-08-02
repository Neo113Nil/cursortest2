package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NameResolverUtilKt {
    @NotNull
    public static final ClassId getClassId(@NotNull NameResolver nameResolver, int i) {
        nameResolver.getClass();
        ClassId fromString = ClassId.fromString(nameResolver.getQualifiedClassName(i), nameResolver.isLocalClassName(i));
        fromString.getClass();
        return fromString;
    }

    @NotNull
    public static final Name getName(@NotNull NameResolver nameResolver, int i) {
        nameResolver.getClass();
        Name guessByFirstCharacter = Name.guessByFirstCharacter(nameResolver.getString(i));
        guessByFirstCharacter.getClass();
        return guessByFirstCharacter;
    }
}
