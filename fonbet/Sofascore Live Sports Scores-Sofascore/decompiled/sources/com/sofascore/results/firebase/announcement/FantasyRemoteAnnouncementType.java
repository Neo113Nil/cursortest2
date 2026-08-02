package com.sofascore.results.firebase.announcement;

import androidx.annotation.Keep;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.rf7;
import defpackage.sf7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = sf7.class)
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "rf7", "POINTS_PROBLEM", "TEAM_CREATE_PROBLEM", NativeAdContent.ViewTag.OTHER, "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyRemoteAnnouncementType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FantasyRemoteAnnouncementType[] $VALUES;

    @NotNull
    public static final rf7 Companion;

    @q5h("points_problem")
    public static final FantasyRemoteAnnouncementType POINTS_PROBLEM = new FantasyRemoteAnnouncementType("POINTS_PROBLEM", 0);

    @q5h("team_create_problem")
    public static final FantasyRemoteAnnouncementType TEAM_CREATE_PROBLEM = new FantasyRemoteAnnouncementType("TEAM_CREATE_PROBLEM", 1);

    @q5h("other")
    public static final FantasyRemoteAnnouncementType OTHER = new FantasyRemoteAnnouncementType(NativeAdContent.ViewTag.OTHER, 2);

    private static final /* synthetic */ FantasyRemoteAnnouncementType[] $values() {
        return new FantasyRemoteAnnouncementType[]{POINTS_PROBLEM, TEAM_CREATE_PROBLEM, OTHER};
    }

    static {
        FantasyRemoteAnnouncementType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        Companion = new rf7();
    }

    private FantasyRemoteAnnouncementType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FantasyRemoteAnnouncementType valueOf(String str) {
        return (FantasyRemoteAnnouncementType) Enum.valueOf(FantasyRemoteAnnouncementType.class, str);
    }

    public static FantasyRemoteAnnouncementType[] values() {
        return (FantasyRemoteAnnouncementType[]) $VALUES.clone();
    }
}
