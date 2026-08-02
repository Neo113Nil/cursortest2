package ru.ozon.app.android.csma.tips.core.rv.v2;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/csma/tips/core/rv/v2/TipsItemType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "TIP", "INPUT", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipsItemType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TipsItemType[] $VALUES;
    private final int type;
    public static final TipsItemType TIP = new TipsItemType("TIP", 0, 0);
    public static final TipsItemType INPUT = new TipsItemType("INPUT", 1, 1);

    private static final /* synthetic */ TipsItemType[] $values() {
        return new TipsItemType[]{TIP, INPUT};
    }

    static {
        TipsItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TipsItemType(String str, int i11, int i12) {
        this.type = i12;
    }

    public static TipsItemType valueOf(String str) {
        return (TipsItemType) Enum.valueOf(TipsItemType.class, str);
    }

    public static TipsItemType[] values() {
        return (TipsItemType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
