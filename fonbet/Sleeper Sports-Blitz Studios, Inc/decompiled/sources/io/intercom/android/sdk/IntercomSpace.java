package io.intercom.android.sdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intercom.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/IntercomSpace;", "", "<init>", "(Ljava/lang/String;I)V", "Home", "Messages", "HelpCenter", "Tickets", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomSpace {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IntercomSpace[] $VALUES;
    public static final IntercomSpace Home = new IntercomSpace("Home", 0);
    public static final IntercomSpace Messages = new IntercomSpace("Messages", 1);
    public static final IntercomSpace HelpCenter = new IntercomSpace("HelpCenter", 2);
    public static final IntercomSpace Tickets = new IntercomSpace("Tickets", 3);

    private static final /* synthetic */ IntercomSpace[] $values() {
        return new IntercomSpace[]{Home, Messages, HelpCenter, Tickets};
    }

    public static EnumEntries<IntercomSpace> getEntries() {
        return $ENTRIES;
    }

    private IntercomSpace(String str, int i) {
    }

    static {
        IntercomSpace[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static IntercomSpace valueOf(String str) {
        return (IntercomSpace) Enum.valueOf(IntercomSpace.class, str);
    }

    public static IntercomSpace[] values() {
        return (IntercomSpace[]) $VALUES.clone();
    }
}
