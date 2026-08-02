package ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTilePayload;", "", "<init>", "(Ljava/lang/String;I)V", "BACKGROUND", "FIRST_BLOCK", "SECOND_BLOCK", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StarsTilePayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StarsTilePayload[] $VALUES;
    public static final StarsTilePayload BACKGROUND = new StarsTilePayload("BACKGROUND", 0);
    public static final StarsTilePayload FIRST_BLOCK = new StarsTilePayload("FIRST_BLOCK", 1);
    public static final StarsTilePayload SECOND_BLOCK = new StarsTilePayload("SECOND_BLOCK", 2);

    private static final /* synthetic */ StarsTilePayload[] $values() {
        return new StarsTilePayload[]{BACKGROUND, FIRST_BLOCK, SECOND_BLOCK};
    }

    static {
        StarsTilePayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private StarsTilePayload(String str, int i11) {
    }

    public static StarsTilePayload valueOf(String str) {
        return (StarsTilePayload) Enum.valueOf(StarsTilePayload.class, str);
    }

    public static StarsTilePayload[] values() {
        return (StarsTilePayload[]) $VALUES.clone();
    }
}
