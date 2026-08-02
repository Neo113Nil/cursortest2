package defpackage;

import com.blaze.blazesdk.features.shared.models.shared_models.FollowEntityTypeDto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m3m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FollowEntityTypeDto.values().length];
        try {
            iArr[FollowEntityTypeDto.TEAM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FollowEntityTypeDto.PLAYER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FollowEntityTypeDto.PROPERTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
