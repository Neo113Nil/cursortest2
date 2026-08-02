package ru.ozon.app.android.storefront.data.tiles.common;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "", "<init>", "(Ljava/lang/String;I)V", FraudMonInfo.UNKNOWN, "SCALE_ASPECT_FIT", "SCALE_ASPECT_FILL", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ContentMode[] $VALUES;
    public static final ContentMode UNKNOWN = new ContentMode(FraudMonInfo.UNKNOWN, 0);
    public static final ContentMode SCALE_ASPECT_FIT = new ContentMode("SCALE_ASPECT_FIT", 1);
    public static final ContentMode SCALE_ASPECT_FILL = new ContentMode("SCALE_ASPECT_FILL", 2);

    private static final /* synthetic */ ContentMode[] $values() {
        return new ContentMode[]{UNKNOWN, SCALE_ASPECT_FIT, SCALE_ASPECT_FILL};
    }

    static {
        ContentMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ContentMode(String str, int i11) {
    }

    public static ContentMode valueOf(String str) {
        return (ContentMode) Enum.valueOf(ContentMode.class, str);
    }

    public static ContentMode[] values() {
        return (ContentMode[]) $VALUES.clone();
    }
}
