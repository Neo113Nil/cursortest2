package ru.ozon.app.android.pdp.widgets.richContent.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "", "<init>", "(Ljava/lang/String;I)V", "FILL", "FIT", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImagePositionVO {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImagePositionVO[] $VALUES;
    public static final ImagePositionVO FILL = new ImagePositionVO("FILL", 0);
    public static final ImagePositionVO FIT = new ImagePositionVO("FIT", 1);

    private static final /* synthetic */ ImagePositionVO[] $values() {
        return new ImagePositionVO[]{FILL, FIT};
    }

    static {
        ImagePositionVO[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ImagePositionVO(String str, int i11) {
    }

    public static ImagePositionVO valueOf(String str) {
        return (ImagePositionVO) Enum.valueOf(ImagePositionVO.class, str);
    }

    public static ImagePositionVO[] values() {
        return (ImagePositionVO[]) $VALUES.clone();
    }
}
