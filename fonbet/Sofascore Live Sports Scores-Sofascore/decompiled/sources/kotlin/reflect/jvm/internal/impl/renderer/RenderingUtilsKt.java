package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class RenderingUtilsKt {
    @NotNull
    public static final String render(@NotNull Name name) {
        name.getClass();
        boolean shouldBeEscaped = shouldBeEscaped(name);
        String asString = name.asString();
        asString.getClass();
        if (!shouldBeEscaped) {
            return asString;
        }
        return ("`" + asString).concat("`");
    }

    @NotNull
    public static final String renderFqName(@NotNull List<Name> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        for (Name name : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render(name));
        }
        return sb.toString();
    }

    @Nullable
    public static final String replacePrefixesInTypeRepresentations(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        if (!c.v(str, str2, false) || !c.v(str3, str4, false)) {
            return null;
        }
        String substring = str.substring(str2.length());
        String substring2 = str3.substring(str4.length());
        String concat = str5.concat(substring);
        if (substring.equals(substring2)) {
            return concat;
        }
        if (typeStringsDifferOnlyInNullability(substring, substring2)) {
            return concat.concat("!");
        }
        return null;
    }

    private static final boolean shouldBeEscaped(Name name) {
        String asString = name.asString();
        asString.getClass();
        if (KeywordStringsGenerated.KEYWORDS.contains(asString)) {
            return true;
        }
        for (int i = 0; i < asString.length(); i++) {
            char charAt = asString.charAt(i);
            if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                return true;
            }
        }
        return false;
    }

    public static final boolean typeStringsDifferOnlyInNullability(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(c.r(str2, "?", "", false))) {
            return true;
        }
        if (c.n(str2, "?", false) && str.concat("?").equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    @NotNull
    public static final String render(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        List<Name> pathSegments = fqNameUnsafe.pathSegments();
        pathSegments.getClass();
        return renderFqName(pathSegments);
    }
}
