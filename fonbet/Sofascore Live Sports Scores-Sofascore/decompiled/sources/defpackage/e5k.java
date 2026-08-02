package defpackage;

import com.sofascore.model.team.TennisSurfaceType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class e5k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TennisSurfaceType.values().length];
        try {
            iArr[TennisSurfaceType.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TennisSurfaceType.GRASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TennisSurfaceType.CLAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TennisSurfaceType.HARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TennisSurfaceType.INDOOR_HARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TennisSurfaceType.OUTDOOR_HARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
