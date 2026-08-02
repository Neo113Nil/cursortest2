package ru.ozon.uni.android.uikit.view.atoms.badge;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/badge/ImagePosition;", "", "<init>", "(Ljava/lang/String;I)V", "RIGHT", "LEFT", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImagePosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImagePosition[] $VALUES;
    public static final ImagePosition RIGHT = new ImagePosition("RIGHT", 0);
    public static final ImagePosition LEFT = new ImagePosition("LEFT", 1);

    private static final /* synthetic */ ImagePosition[] $values() {
        return new ImagePosition[]{RIGHT, LEFT};
    }

    static {
        ImagePosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ImagePosition(String str, int i11) {
    }

    public static ImagePosition valueOf(String str) {
        return (ImagePosition) Enum.valueOf(ImagePosition.class, str);
    }

    public static ImagePosition[] values() {
        return (ImagePosition[]) $VALUES.clone();
    }
}
