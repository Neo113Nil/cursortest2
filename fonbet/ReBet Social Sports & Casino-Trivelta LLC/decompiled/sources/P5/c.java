package P5;

import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class c {
    public static final String a(String str, int i10) {
        String take;
        return (str == null || (take = StringsKt.take(str, i10)) == null) ? "Unknown" : take;
    }
}
