package defpackage;

import com.sofascore.model.mvvm.model.ServerType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class f4i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ServerType.values().length];
        try {
            iArr[ServerType.SPRINT_QUALIFYING_PART.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServerType.SPRINT_QUALIFYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ServerType.SPRINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ServerType.RACE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
