package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "LIKE", "DISLIKE", "VOTE_QUESTION", "REFRESH", "REPORT", FraudMonInfo.UNKNOWN, "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    public static final ActionType LIKE = new ActionType("LIKE", 0);
    public static final ActionType DISLIKE = new ActionType("DISLIKE", 1);
    public static final ActionType VOTE_QUESTION = new ActionType("VOTE_QUESTION", 2);
    public static final ActionType REFRESH = new ActionType("REFRESH", 3);
    public static final ActionType REPORT = new ActionType("REPORT", 4);
    public static final ActionType UNKNOWN = new ActionType(FraudMonInfo.UNKNOWN, 5);

    private static final /* synthetic */ ActionType[] $values() {
        return new ActionType[]{LIKE, DISLIKE, VOTE_QUESTION, REFRESH, REPORT, UNKNOWN};
    }

    static {
        ActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ActionType(String str, int i11) {
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
