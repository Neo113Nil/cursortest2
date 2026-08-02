package defpackage;

import com.sofascore.model.mvvm.model.ServerType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class iwc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ServerType.values().length];
        try {
            iArr[ServerType.PRACTICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServerType.PRACTICE_PART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ServerType.QUALIFYING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ServerType.QUALIFYING_PART.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ServerType.SPRINT_QUALIFYING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ServerType.SPRINT_QUALIFYING_PART.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
