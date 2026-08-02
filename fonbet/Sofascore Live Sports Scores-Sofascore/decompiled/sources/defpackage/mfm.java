package defpackage;

import com.blaze.blazesdk.features.shared.models.shared_models.ThumbnailModelTypeDto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class mfm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ThumbnailModelTypeDto.values().length];
        try {
            iArr[ThumbnailModelTypeDto.VERTICAL_TWO_BY_THREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ThumbnailModelTypeDto.SQUARE_ICON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ThumbnailModelTypeDto.MAIN_THUMBNAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ThumbnailModelTypeDto.GIF.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ThumbnailModelTypeDto.ANIMATED_THUMBNAIL_POSTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
