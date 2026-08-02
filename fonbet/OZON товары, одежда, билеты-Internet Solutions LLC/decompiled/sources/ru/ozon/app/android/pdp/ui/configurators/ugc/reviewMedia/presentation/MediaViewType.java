package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaViewType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE_VIDEO", "MEDIA_LIST", "PHOTO_LIST", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MediaViewType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MediaViewType[] $VALUES;
    public static final MediaViewType SINGLE_VIDEO = new MediaViewType("SINGLE_VIDEO", 0);
    public static final MediaViewType MEDIA_LIST = new MediaViewType("MEDIA_LIST", 1);
    public static final MediaViewType PHOTO_LIST = new MediaViewType("PHOTO_LIST", 2);

    private static final /* synthetic */ MediaViewType[] $values() {
        return new MediaViewType[]{SINGLE_VIDEO, MEDIA_LIST, PHOTO_LIST};
    }

    static {
        MediaViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private MediaViewType(String str, int i11) {
    }

    public static MediaViewType valueOf(String str) {
        return (MediaViewType) Enum.valueOf(MediaViewType.class, str);
    }

    public static MediaViewType[] values() {
        return (MediaViewType[]) $VALUES.clone();
    }
}
