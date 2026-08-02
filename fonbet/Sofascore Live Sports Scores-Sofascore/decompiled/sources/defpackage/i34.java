package defpackage;

import com.sofascore.model.crowdsourcing.SuggestStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class i34 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuggestStatus.values().length];
        try {
            iArr[SuggestStatus.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuggestStatus.APPROVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuggestStatus.IGNORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SuggestStatus.DECLINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SuggestStatus.SUBMITTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[l64.values().length];
        try {
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            l64 l64Var = l64.a;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
