package ru.ozon.app.android.storefront.stories.setContainer.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;", "", "<init>", "(Ljava/lang/String;I)V", "SET_OF_PREVIEWS", "SET_OF_FINANCES", "DEFAULT", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SetType[] $VALUES;
    public static final SetType SET_OF_PREVIEWS = new SetType("SET_OF_PREVIEWS", 0);
    public static final SetType SET_OF_FINANCES = new SetType("SET_OF_FINANCES", 1);
    public static final SetType DEFAULT = new SetType("DEFAULT", 2);

    private static final /* synthetic */ SetType[] $values() {
        return new SetType[]{SET_OF_PREVIEWS, SET_OF_FINANCES, DEFAULT};
    }

    static {
        SetType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SetType(String str, int i11) {
    }

    public static SetType valueOf(String str) {
        return (SetType) Enum.valueOf(SetType.class, str);
    }

    public static SetType[] values() {
        return (SetType[]) $VALUES.clone();
    }
}
