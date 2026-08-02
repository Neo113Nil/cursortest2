package ru.ozon.android.messenger.framework.data.modules.atoms;

import Xc.b;
import com.squareup.moshi.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a implements AtomType {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @i(name = "timerBadge")
    public static final a TIMER_BADGE;

    @NotNull
    private final String value = "timerBadge";

    static {
        a aVar = new a();
        TIMER_BADGE = aVar;
        a[] aVarArr = {aVar};
        $VALUES = aVarArr;
        $ENTRIES = b.a(aVarArr);
    }

    private a() {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @Override // ru.ozon.uni.atoms.data.AtomType
    @NotNull
    public final String getValue() {
        return this.value;
    }
}
