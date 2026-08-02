package ru.ozon.android.messenger.framework.presentation.models.responses;

import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class j {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j Error;
    public static final j OK;

    static {
        j jVar = new j(DiscountCodeResponse.RESULT_OK, 0);
        OK = jVar;
        j jVar2 = new j("Error", 1);
        Error = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = Xc.b.a(jVarArr);
    }

    private j() {
        throw null;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
