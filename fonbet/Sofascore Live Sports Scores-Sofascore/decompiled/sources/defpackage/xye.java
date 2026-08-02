package defpackage;

import com.sofascore.model.newNetwork.PointType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class xye {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PointType.values().length];
        try {
            iArr[PointType.Normal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PointType.Set.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PointType.Match.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PointType.Break.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PointType.MiniBreak.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
