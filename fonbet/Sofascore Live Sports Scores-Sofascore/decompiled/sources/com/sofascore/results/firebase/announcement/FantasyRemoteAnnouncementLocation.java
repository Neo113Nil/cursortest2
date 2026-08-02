package com.sofascore.results.firebase.announcement;

import androidx.annotation.Keep;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.mf7;
import defpackage.of7;
import defpackage.q5h;
import defpackage.r5h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = of7.class)
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sofascore/results/firebase/announcement/FantasyRemoteAnnouncementLocation;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "mf7", "CENTER", "ONBOARDING", "MY_TEAM", "EVERYWHERE", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyRemoteAnnouncementLocation {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FantasyRemoteAnnouncementLocation[] $VALUES;

    @NotNull
    public static final mf7 Companion;

    @q5h(TtmlNode.CENTER)
    public static final FantasyRemoteAnnouncementLocation CENTER = new FantasyRemoteAnnouncementLocation("CENTER", 0);

    @q5h("onboarding")
    public static final FantasyRemoteAnnouncementLocation ONBOARDING = new FantasyRemoteAnnouncementLocation("ONBOARDING", 1);

    @q5h("my_team")
    public static final FantasyRemoteAnnouncementLocation MY_TEAM = new FantasyRemoteAnnouncementLocation("MY_TEAM", 2);

    @q5h("everywhere")
    public static final FantasyRemoteAnnouncementLocation EVERYWHERE = new FantasyRemoteAnnouncementLocation("EVERYWHERE", 3);

    private static final /* synthetic */ FantasyRemoteAnnouncementLocation[] $values() {
        return new FantasyRemoteAnnouncementLocation[]{CENTER, ONBOARDING, MY_TEAM, EVERYWHERE};
    }

    static {
        FantasyRemoteAnnouncementLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        Companion = new mf7();
    }

    private FantasyRemoteAnnouncementLocation(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FantasyRemoteAnnouncementLocation valueOf(String str) {
        return (FantasyRemoteAnnouncementLocation) Enum.valueOf(FantasyRemoteAnnouncementLocation.class, str);
    }

    public static FantasyRemoteAnnouncementLocation[] values() {
        return (FantasyRemoteAnnouncementLocation[]) $VALUES.clone();
    }
}
