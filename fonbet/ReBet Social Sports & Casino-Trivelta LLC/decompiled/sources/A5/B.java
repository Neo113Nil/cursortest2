package A5;

import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class B {
    public static final Regex b(String str) {
        try {
            return new Regex(str);
        } catch (Exception unused) {
            return new Regex(Regex.INSTANCE.escape(str));
        }
    }
}
