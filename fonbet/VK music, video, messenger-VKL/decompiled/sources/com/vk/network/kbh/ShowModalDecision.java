package com.vk.network.kbh;

import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShowModalDecision.kt */
/* loaded from: classes3.dex */
public final class ShowModalDecision {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShowModalDecision[] $VALUES;
    public static final ShowModalDecision SHOW_BLOCKING;
    public static final ShowModalDecision SHOW_DISMISSABLE;
    public static final ShowModalDecision SHOW_OR_RECREATE_BLOCKING;
    public static final ShowModalDecision SKIP;

    static {
        ShowModalDecision showModalDecision = new ShowModalDecision(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 0);
        SKIP = showModalDecision;
        ShowModalDecision showModalDecision2 = new ShowModalDecision("SHOW_DISMISSABLE", 1);
        SHOW_DISMISSABLE = showModalDecision2;
        ShowModalDecision showModalDecision3 = new ShowModalDecision("SHOW_BLOCKING", 2);
        SHOW_BLOCKING = showModalDecision3;
        ShowModalDecision showModalDecision4 = new ShowModalDecision("SHOW_OR_RECREATE_BLOCKING", 3);
        SHOW_OR_RECREATE_BLOCKING = showModalDecision4;
        ShowModalDecision[] showModalDecisionArr = {showModalDecision, showModalDecision2, showModalDecision3, showModalDecision4};
        $VALUES = showModalDecisionArr;
        $ENTRIES = new asp(showModalDecisionArr);
    }

    public ShowModalDecision() {
        throw null;
    }

    public static ShowModalDecision valueOf(String str) {
        return (ShowModalDecision) Enum.valueOf(ShowModalDecision.class, str);
    }

    public static ShowModalDecision[] values() {
        return (ShowModalDecision[]) $VALUES.clone();
    }
}
