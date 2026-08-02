package com.sofascore.model.mvvm.model;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/mvvm/model/EventType;", "", "<init>", "(Ljava/lang/String;I)V", "MY_GAMES", "MY_FIRST_TEAM", "MY_SECOND_TEAM", "MY_LEAGUES", "MUTED", "MY_FIRST_SUB_TEAM_1", "MY_FIRST_SUB_TEAM_2", "MY_SECOND_SUB_TEAM_1", "MY_SECOND_SUB_TEAM_2", "NOTIFICATION_EDITED_ENABLED", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;
    public static final EventType MY_GAMES = new EventType("MY_GAMES", 0);
    public static final EventType MY_FIRST_TEAM = new EventType("MY_FIRST_TEAM", 1);
    public static final EventType MY_SECOND_TEAM = new EventType("MY_SECOND_TEAM", 2);
    public static final EventType MY_LEAGUES = new EventType("MY_LEAGUES", 3);
    public static final EventType MUTED = new EventType("MUTED", 4);
    public static final EventType MY_FIRST_SUB_TEAM_1 = new EventType("MY_FIRST_SUB_TEAM_1", 5);
    public static final EventType MY_FIRST_SUB_TEAM_2 = new EventType("MY_FIRST_SUB_TEAM_2", 6);
    public static final EventType MY_SECOND_SUB_TEAM_1 = new EventType("MY_SECOND_SUB_TEAM_1", 7);
    public static final EventType MY_SECOND_SUB_TEAM_2 = new EventType("MY_SECOND_SUB_TEAM_2", 8);
    public static final EventType NOTIFICATION_EDITED_ENABLED = new EventType("NOTIFICATION_EDITED_ENABLED", 9);

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{MY_GAMES, MY_FIRST_TEAM, MY_SECOND_TEAM, MY_LEAGUES, MUTED, MY_FIRST_SUB_TEAM_1, MY_FIRST_SUB_TEAM_2, MY_SECOND_SUB_TEAM_1, MY_SECOND_SUB_TEAM_2, NOTIFICATION_EDITED_ENABLED};
    }

    static {
        EventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private EventType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }
}
