package io.intercom.android.sdk.tickets;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TicketDetailContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/tickets/CardState;", "", "<init>", "(Ljava/lang/String;I)V", "TimelineCard", "SubmissionCard", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class CardState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardState[] $VALUES;
    public static final CardState TimelineCard = new CardState("TimelineCard", 0);
    public static final CardState SubmissionCard = new CardState("SubmissionCard", 1);

    private static final /* synthetic */ CardState[] $values() {
        return new CardState[]{TimelineCard, SubmissionCard};
    }

    public static EnumEntries<CardState> getEntries() {
        return $ENTRIES;
    }

    private CardState(String str, int i) {
    }

    static {
        CardState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static CardState valueOf(String str) {
        return (CardState) Enum.valueOf(CardState.class, str);
    }

    public static CardState[] values() {
        return (CardState[]) $VALUES.clone();
    }
}
