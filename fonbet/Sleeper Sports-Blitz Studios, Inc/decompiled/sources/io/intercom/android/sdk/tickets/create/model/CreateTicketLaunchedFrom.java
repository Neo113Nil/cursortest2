package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreateTicketViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;", "", "from", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "Conversation", "Home", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateTicketLaunchedFrom {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreateTicketLaunchedFrom[] $VALUES;
    public static final CreateTicketLaunchedFrom Conversation = new CreateTicketLaunchedFrom("Conversation", 0, "conversation");
    public static final CreateTicketLaunchedFrom Home = new CreateTicketLaunchedFrom("Home", 1, MetricTracker.Context.HOME_SCREEN);
    private final String from;

    private static final /* synthetic */ CreateTicketLaunchedFrom[] $values() {
        return new CreateTicketLaunchedFrom[]{Conversation, Home};
    }

    public static EnumEntries<CreateTicketLaunchedFrom> getEntries() {
        return $ENTRIES;
    }

    private CreateTicketLaunchedFrom(String str, int i, String str2) {
        this.from = str2;
    }

    public final String getFrom() {
        return this.from;
    }

    static {
        CreateTicketLaunchedFrom[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static CreateTicketLaunchedFrom valueOf(String str) {
        return (CreateTicketLaunchedFrom) Enum.valueOf(CreateTicketLaunchedFrom.class, str);
    }

    public static CreateTicketLaunchedFrom[] values() {
        return (CreateTicketLaunchedFrom[]) $VALUES.clone();
    }
}
