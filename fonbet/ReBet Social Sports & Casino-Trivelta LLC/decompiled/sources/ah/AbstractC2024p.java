package ah;

import kotlin.text.StringsKt;

/* renamed from: ah.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2024p {
    public static final boolean b(char c10) {
        return StringsKt.contains$default((CharSequence) "\"(),/:;<=>?@[\\]{}", c10, false, 2, (Object) null);
    }
}
