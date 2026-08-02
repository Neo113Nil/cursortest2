package defpackage;

import com.sofascore.model.TeamSelection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class zt5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TeamSelection.values().length];
        try {
            iArr[TeamSelection.First.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TeamSelection.Second.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TeamSelection.Combined.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TeamSelection.H2H.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
