package io.appmetrica.analytics.impl;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Be implements InterfaceC0270k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12056a = 10;

    /* renamed from: b, reason: collision with root package name */
    public final int f12057b = 13;

    /* renamed from: c, reason: collision with root package name */
    public final Regex f12058c = new Regex("^[0-9()\\-+\\s]+$");

    @Override // io.appmetrica.analytics.impl.InterfaceC0270k2
    @Nullable
    public final String a(@NotNull String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        int length2 = sb3.length();
        Character x10 = kotlin.text.d0.x(str);
        Character x11 = kotlin.text.d0.x(sb3);
        if (length2 < this.f12056a || length2 > this.f12057b || ((x11 != null && x11.charValue() == '0') || !this.f12058c.d(str))) {
            return null;
        }
        if (length2 == 10 && (x10 == null || x10.charValue() != '+')) {
            return "7".concat(sb3);
        }
        if (length2 == 11) {
            if (x10 != null && x10.charValue() == '+' && x11 != null && x11.charValue() == '8') {
                return null;
            }
            if (x11 != null && x11.charValue() == '8') {
                return "7" + sb3.substring(1);
            }
        }
        if (length2 < 12 || x10 == null || x10.charValue() != '+' || x11 == null || x11.charValue() != '7') {
            return sb3;
        }
        return null;
    }
}
