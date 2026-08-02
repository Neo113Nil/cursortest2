package defpackage;

import com.sofascore.model.mvvm.model.Gender;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class grj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Gender.values().length];
        try {
            iArr[Gender.Male.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Gender.Female.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
