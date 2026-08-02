package defpackage;

import com.sofascore.model.crowdsourcing.TeamSide;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class w44 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TeamSide.values().length];
        try {
            iArr[TeamSide.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TeamSide.AWAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
