package ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Alignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Alignment[] $VALUES;

    @i(name = "ALIGN_TOP")
    public static final Alignment TOP = new Alignment("TOP", 0);

    @i(name = "ALIGN_BOTTOM")
    public static final Alignment BOTTOM = new Alignment("BOTTOM", 1);

    private static final /* synthetic */ Alignment[] $values() {
        return new Alignment[]{TOP, BOTTOM};
    }

    static {
        Alignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Alignment(String str, int i11) {
    }

    public static Alignment valueOf(String str) {
        return (Alignment) Enum.valueOf(Alignment.class, str);
    }

    public static Alignment[] values() {
        return (Alignment[]) $VALUES.clone();
    }
}
