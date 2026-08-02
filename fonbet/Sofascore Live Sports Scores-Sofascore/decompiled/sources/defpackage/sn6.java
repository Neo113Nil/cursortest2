package defpackage;

import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementSeverity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class sn6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FantasyRemoteAnnouncementSeverity.values().length];
        try {
            iArr[FantasyRemoteAnnouncementSeverity.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FantasyRemoteAnnouncementSeverity.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FantasyRemoteAnnouncementSeverity.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
