package com.vk.im.engine.models.users;

import android.util.SparseArray;
import xsna.asp;
import xsna.vu5;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserNameCase.kt */
/* loaded from: classes2.dex */
public final class UserNameCase {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserNameCase[] $VALUES;
    public static final UserNameCase ACC;
    public static final a Companion;
    public static final UserNameCase DAT;
    public static final UserNameCase GEN;
    public static final UserNameCase NOM;
    private static final SparseArray<UserNameCase> cache;
    private final int id;

    /* compiled from: UserNameCase.kt */
    public static final class a {
    }

    static {
        UserNameCase userNameCase = new UserNameCase("NOM", 0, 1);
        NOM = userNameCase;
        UserNameCase userNameCase2 = new UserNameCase("GEN", 1, 2);
        GEN = userNameCase2;
        UserNameCase userNameCase3 = new UserNameCase("ACC", 2, 3);
        ACC = userNameCase3;
        UserNameCase userNameCase4 = new UserNameCase("DAT", 3, 4);
        DAT = userNameCase4;
        UserNameCase[] userNameCaseArr = {userNameCase, userNameCase2, userNameCase3, userNameCase4};
        $VALUES = userNameCaseArr;
        $ENTRIES = new asp(userNameCaseArr);
        Companion = new a();
        cache = new SparseArray<>(values().length);
    }

    public UserNameCase(String str, int i, int i2) {
        this.id = i2;
    }

    public static UserNameCase valueOf(String str) {
        return (UserNameCase) Enum.valueOf(UserNameCase.class, str);
    }

    public static UserNameCase[] values() {
        return (UserNameCase[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return vu5.b(new StringBuilder("UserNameCase(id="), this.id, ')');
    }
}
