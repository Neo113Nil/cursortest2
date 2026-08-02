package kotlin.reflect.jvm.internal.impl.name;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NameUtils {

    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    @NotNull
    private static final Regex SANITIZE_AS_JAVA_INVALID_CHARACTERS = new Regex("[^\\p{L}\\p{Digit}]");

    @NotNull
    private static final String CONTEXT_RECEIVER_PREFIX = "$context_receiver";

    private NameUtils() {
    }

    @NotNull
    public static final Name contextReceiverName(int i) {
        Name identifier = Name.identifier(CONTEXT_RECEIVER_PREFIX + '_' + i);
        identifier.getClass();
        return identifier;
    }

    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String str) {
        str.getClass();
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.replace(str, "_");
    }
}
