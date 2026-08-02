package defpackage;

import com.sofascore.model.profile.UserBadge;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class ifk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserBadge.values().length];
        try {
            iArr[UserBadge.NO_BADGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserBadge.MODERATOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
