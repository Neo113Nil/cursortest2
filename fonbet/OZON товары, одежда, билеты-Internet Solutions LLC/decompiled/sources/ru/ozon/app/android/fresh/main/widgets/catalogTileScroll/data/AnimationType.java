package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "SCALING", "BORDER", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AnimationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnimationType[] $VALUES;
    public static final AnimationType NONE = new AnimationType("NONE", 0);
    public static final AnimationType SCALING = new AnimationType("SCALING", 1);
    public static final AnimationType BORDER = new AnimationType("BORDER", 2);

    private static final /* synthetic */ AnimationType[] $values() {
        return new AnimationType[]{NONE, SCALING, BORDER};
    }

    static {
        AnimationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AnimationType(String str, int i11) {
    }

    public static AnimationType valueOf(String str) {
        return (AnimationType) Enum.valueOf(AnimationType.class, str);
    }

    public static AnimationType[] values() {
        return (AnimationType[]) $VALUES.clone();
    }
}
