package defpackage;

import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.crowdsourcing.TeamSide;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class z24 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SuggestStatus.values().length];
        try {
            iArr[SuggestStatus.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuggestStatus.DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuggestStatus.SUBMITTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SuggestStatus.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SuggestStatus.IGNORED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[TeamSide.values().length];
        try {
            iArr2[TeamSide.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TeamSide.AWAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
