package defpackage;

import com.sofascore.model.mvvm.model.StadiumType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class wvb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StadiumType.values().length];
        try {
            iArr[StadiumType.Indoor.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StadiumType.RetractableRoof.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StadiumType.Outdoor.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
