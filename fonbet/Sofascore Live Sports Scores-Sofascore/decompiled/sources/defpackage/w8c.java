package defpackage;

import com.sofascore.model.database.MediaReactionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class w8c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MediaReactionType.values().length];
        try {
            iArr[MediaReactionType.THUMBS_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MediaReactionType.REMOVE_THUMBS_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
