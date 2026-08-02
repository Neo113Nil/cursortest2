package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class suf implements Serializable {

    @NotNull
    public static final ruf c = new ruf(null);
    public final String a;
    public final int b;

    public suf(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.a, this.b);
        compile.getClass();
        return new Regex(compile);
    }
}
