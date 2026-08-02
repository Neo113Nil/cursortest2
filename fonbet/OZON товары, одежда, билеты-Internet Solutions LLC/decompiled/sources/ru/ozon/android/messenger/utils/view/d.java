package ru.ozon.android.messenger.utils.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d LEFT;
    public static final d RIGHT;

    static {
        d dVar = new d("LEFT", 0);
        LEFT = dVar;
        d dVar2 = new d("RIGHT", 1);
        RIGHT = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
    }

    private d() {
        throw null;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
