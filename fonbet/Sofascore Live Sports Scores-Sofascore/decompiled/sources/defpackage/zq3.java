package defpackage;

import com.sofascore.model.crowdsourcing.TeamSide;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class zq3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[l64.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            l64 l64Var = l64.a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            l64 l64Var2 = l64.a;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[TeamSide.values().length];
        try {
            iArr2[TeamSide.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TeamSide.AWAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}
