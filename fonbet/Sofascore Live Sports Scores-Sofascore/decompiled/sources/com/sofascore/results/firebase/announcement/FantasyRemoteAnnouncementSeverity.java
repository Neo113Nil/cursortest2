package com.sofascore.results.firebase.announcement;

import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.pf7;
import defpackage.q5h;
import defpackage.qf7;
import defpackage.r5h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = qf7.class)
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementSeverity;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "pf7", "INFO", "WARNING", "ERROR", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyRemoteAnnouncementSeverity {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FantasyRemoteAnnouncementSeverity[] $VALUES;

    @NotNull
    public static final pf7 Companion;

    @q5h("info")
    public static final FantasyRemoteAnnouncementSeverity INFO = new FantasyRemoteAnnouncementSeverity("INFO", 0);

    @q5h("warning")
    public static final FantasyRemoteAnnouncementSeverity WARNING = new FantasyRemoteAnnouncementSeverity("WARNING", 1);

    @q5h("error")
    public static final FantasyRemoteAnnouncementSeverity ERROR = new FantasyRemoteAnnouncementSeverity("ERROR", 2);

    private static final /* synthetic */ FantasyRemoteAnnouncementSeverity[] $values() {
        return new FantasyRemoteAnnouncementSeverity[]{INFO, WARNING, ERROR};
    }

    static {
        FantasyRemoteAnnouncementSeverity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        Companion = new pf7();
    }

    private FantasyRemoteAnnouncementSeverity(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FantasyRemoteAnnouncementSeverity valueOf(String str) {
        return (FantasyRemoteAnnouncementSeverity) Enum.valueOf(FantasyRemoteAnnouncementSeverity.class, str);
    }

    public static FantasyRemoteAnnouncementSeverity[] values() {
        return (FantasyRemoteAnnouncementSeverity[]) $VALUES.clone();
    }
}
