package ru.ozon.app.android.bank.widgets.adBanner.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/data/SetBannerActionType;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_TYPE_VIEW", "ACTION_TYPE_CLICK", "ACTION_TYPE_CLOSE", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SetBannerActionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SetBannerActionType[] $VALUES;
    public static final SetBannerActionType ACTION_TYPE_VIEW = new SetBannerActionType("ACTION_TYPE_VIEW", 0);
    public static final SetBannerActionType ACTION_TYPE_CLICK = new SetBannerActionType("ACTION_TYPE_CLICK", 1);
    public static final SetBannerActionType ACTION_TYPE_CLOSE = new SetBannerActionType("ACTION_TYPE_CLOSE", 2);

    private static final /* synthetic */ SetBannerActionType[] $values() {
        return new SetBannerActionType[]{ACTION_TYPE_VIEW, ACTION_TYPE_CLICK, ACTION_TYPE_CLOSE};
    }

    static {
        SetBannerActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SetBannerActionType(String str, int i11) {
    }

    public static SetBannerActionType valueOf(String str) {
        return (SetBannerActionType) Enum.valueOf(SetBannerActionType.class, str);
    }

    public static SetBannerActionType[] values() {
        return (SetBannerActionType[]) $VALUES.clone();
    }
}
