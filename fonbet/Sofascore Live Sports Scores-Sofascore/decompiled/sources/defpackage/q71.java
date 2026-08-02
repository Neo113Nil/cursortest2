package defpackage;

import com.sofascore.model.mvvm.model.BaseballRole;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class q71 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BaseballRole.values().length];
        try {
            iArr[BaseballRole.HomePlate.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BaseballRole.FirstBase.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BaseballRole.SecondBase.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BaseballRole.ThirdBase.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BaseballRole.LeftField.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BaseballRole.RightField.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
