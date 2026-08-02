package ru.ozon.app.android.storefront.widgets.videoTile.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/videoTile/data/DesignType;", "", "<init>", "(Ljava/lang/String;I)V", "GRID1", "PROMO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DesignType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DesignType[] $VALUES;

    @i(name = "DESIGN_TYPE_GRID1")
    public static final DesignType GRID1 = new DesignType("GRID1", 0);

    @i(name = "DESIGN_TYPE_PROMO")
    public static final DesignType PROMO = new DesignType("PROMO", 1);

    private static final /* synthetic */ DesignType[] $values() {
        return new DesignType[]{GRID1, PROMO};
    }

    static {
        DesignType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DesignType(String str, int i11) {
    }

    public static DesignType valueOf(String str) {
        return (DesignType) Enum.valueOf(DesignType.class, str);
    }

    public static DesignType[] values() {
        return (DesignType[]) $VALUES.clone();
    }
}
