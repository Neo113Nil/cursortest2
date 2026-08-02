package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gl4 {
    public Integer a;

    public final Integer a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.a;
        if (num == null) {
            return Integer.valueOf(unicodeChar);
        }
        this.a = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
        Integer num2 = valueOf.intValue() != 0 ? valueOf : null;
        if (num2 != null) {
            unicodeChar = num2.intValue();
        }
        return Integer.valueOf(unicodeChar);
    }
}
