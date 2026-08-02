package com.vk.superapp.api.dto.auth.validatephoneconfirm;

import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthResponseEnums.kt */
/* loaded from: classes6.dex */
public final class PasswordScreen {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PasswordScreen[] $VALUES;
    public static final a Companion;
    public static final PasswordScreen HIDE;
    public static final PasswordScreen SHOW;
    public static final PasswordScreen SKIP;
    private final int code;

    /* compiled from: AuthResponseEnums.kt */
    public static final class a {
        public static PasswordScreen a(int i) {
            PasswordScreen passwordScreen;
            PasswordScreen[] values = PasswordScreen.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    passwordScreen = null;
                    break;
                }
                passwordScreen = values[i2];
                if (i == passwordScreen.h()) {
                    break;
                }
                i2++;
            }
            if (passwordScreen != null) {
                return passwordScreen;
            }
            throw new IllegalArgumentException("Unknown value for hide_password field");
        }
    }

    static {
        PasswordScreen passwordScreen = new PasswordScreen("SHOW", 0, 0);
        SHOW = passwordScreen;
        PasswordScreen passwordScreen2 = new PasswordScreen("HIDE", 1, 1);
        HIDE = passwordScreen2;
        PasswordScreen passwordScreen3 = new PasswordScreen(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 2, 2);
        SKIP = passwordScreen3;
        PasswordScreen[] passwordScreenArr = {passwordScreen, passwordScreen2, passwordScreen3};
        $VALUES = passwordScreenArr;
        $ENTRIES = new asp(passwordScreenArr);
        Companion = new a();
    }

    public PasswordScreen(String str, int i, int i2) {
        this.code = i2;
    }

    public static PasswordScreen valueOf(String str) {
        return (PasswordScreen) Enum.valueOf(PasswordScreen.class, str);
    }

    public static PasswordScreen[] values() {
        return (PasswordScreen[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
