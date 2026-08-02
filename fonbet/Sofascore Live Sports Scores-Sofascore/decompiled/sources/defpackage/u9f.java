package defpackage;

import com.sofascore.model.profile.UserBadge;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class u9f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserBadge.values().length];
        try {
            iArr[UserBadge.MODERATOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserBadge.EDITOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserBadge.CROWDSOURCER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserBadge.PREDICTOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
