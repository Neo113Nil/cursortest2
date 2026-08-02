package defpackage;

import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class bbm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[nqm.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            nqm nqmVar = nqm.LIVE_UNREAD;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            nqm nqmVar2 = nqm.LIVE_UNREAD;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            nqm nqmVar3 = nqm.LIVE_UNREAD;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[BlazeLiveStreamStatus.values().length];
        try {
            iArr2[BlazeLiveStreamStatus.LIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[BlazeLiveStreamStatus.UPCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[BlazeLiveStreamStatus.ENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr2;
    }
}
