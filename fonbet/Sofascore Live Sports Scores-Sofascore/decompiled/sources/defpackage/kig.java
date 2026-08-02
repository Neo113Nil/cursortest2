package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 kig, still in use, count: 1, list:
  (r2v1 kig) from 0x0184: FILLED_NEW_ARRAY (r2v1 kig), (r5v1 kig), (r4v2 kig), (r1v16 kig), (r8v0 kig), (r6v3 kig), (r7v3 kig), (r11v0 kig), (r0v5 kig) A[WRAPPED] (LINE:389) elemType: kig
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kig {
    CLICK("click"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATIVE_VIEW("creativeView"),
    LOADED(U3.i.r),
    START("start"),
    FIRST_QUARTILE("firstQuartile"),
    MIDPOINT(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT),
    THIRD_QUARTILE("thirdQuartile"),
    COMPLETE(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE),
    MUTE(CampaignEx.JSON_NATIVE_VIDEO_MUTE),
    UNMUTE(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE),
    PAUSE(CampaignEx.JSON_NATIVE_VIDEO_PAUSE),
    REWIND("rewind"),
    RESUME(CampaignEx.JSON_NATIVE_VIDEO_RESUME),
    FULLSCREEN("fullscreen"),
    EXIT_FULLSCREEN("exitFullscreen"),
    PLAYER_EXPAND("playerExpand"),
    PLAYER_COLLAPSE("playerCollapse"),
    /* JADX INFO: Fake field, exist only in values array */
    AD_INTERACTION(NotificationCompat.CATEGORY_PROGRESS),
    TIME_TO_CLICK("timeToClick"),
    SKIP("skip"),
    /* JADX INFO: Fake field, exist only in values array */
    AD_INTERACTION("vpaidAdInteraction"),
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_SECOND("firstSecond");

    public static final List t;
    public static final List u;
    public static final List v;
    public final String a;

    static {
        kig kigVar = CLICK;
        kig kigVar2 = LOADED;
        kig kigVar3 = START;
        kig kigVar4 = FIRST_QUARTILE;
        kig kigVar5 = MIDPOINT;
        kig kigVar6 = THIRD_QUARTILE;
        kig kigVar7 = COMPLETE;
        kig kigVar8 = MUTE;
        kig kigVar9 = UNMUTE;
        kig kigVar10 = PAUSE;
        kig kigVar11 = REWIND;
        kig kigVar12 = RESUME;
        kig kigVar13 = FULLSCREEN;
        kig kigVar14 = EXIT_FULLSCREEN;
        kig kigVar15 = PLAYER_EXPAND;
        kig kigVar16 = PLAYER_COLLAPSE;
        kig kigVar17 = TIME_TO_CLICK;
        kig kigVar18 = SKIP;
        t = Arrays.asList(kigVar, kigVar8, kigVar9, kigVar10, kigVar11, kigVar12, kigVar13, kigVar14, kigVar17, kigVar18, r0, kigVar15, kigVar16);
        u = Arrays.asList(r2, kigVar2, kigVar3, r1, kigVar4, kigVar5, kigVar6, kigVar7, r0);
        v = Arrays.asList(new kig[0]);
    }

    public kig(String str) {
        this.a = str;
    }

    public static kig valueOf(String str) {
        return (kig) Enum.valueOf(kig.class, str);
    }

    public static kig[] values() {
        return (kig[]) w.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
