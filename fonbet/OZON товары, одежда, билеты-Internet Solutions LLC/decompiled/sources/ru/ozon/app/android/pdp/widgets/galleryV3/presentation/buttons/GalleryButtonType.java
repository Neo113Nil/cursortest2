package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "FULL_VIEW", "SOUND", "BUTTON", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryButtonType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GalleryButtonType[] $VALUES;
    public static final GalleryButtonType FULL_VIEW = new GalleryButtonType("FULL_VIEW", 0);
    public static final GalleryButtonType SOUND = new GalleryButtonType("SOUND", 1);
    public static final GalleryButtonType BUTTON = new GalleryButtonType("BUTTON", 2);

    private static final /* synthetic */ GalleryButtonType[] $values() {
        return new GalleryButtonType[]{FULL_VIEW, SOUND, BUTTON};
    }

    static {
        GalleryButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private GalleryButtonType(String str, int i11) {
    }

    public static GalleryButtonType valueOf(String str) {
        return (GalleryButtonType) Enum.valueOf(GalleryButtonType.class, str);
    }

    public static GalleryButtonType[] values() {
        return (GalleryButtonType[]) $VALUES.clone();
    }
}
