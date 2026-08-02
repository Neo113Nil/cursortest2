package ru.ozon.mapsdk.common.geoproxy.model;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/ReverseGeocodeResultType;", "", "rawType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawType", "()Ljava/lang/String;", "HOUSE", "ANY", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReverseGeocodeResultType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ReverseGeocodeResultType[] $VALUES;

    @NotNull
    private final String rawType;
    public static final ReverseGeocodeResultType HOUSE = new ReverseGeocodeResultType("HOUSE", 0, "house");
    public static final ReverseGeocodeResultType ANY = new ReverseGeocodeResultType("ANY", 1, "any");

    private static final /* synthetic */ ReverseGeocodeResultType[] $values() {
        return new ReverseGeocodeResultType[]{HOUSE, ANY};
    }

    static {
        ReverseGeocodeResultType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ReverseGeocodeResultType(String str, int i11, String str2) {
        this.rawType = str2;
    }

    @NotNull
    public static a<ReverseGeocodeResultType> getEntries() {
        return $ENTRIES;
    }

    public static ReverseGeocodeResultType valueOf(String str) {
        return (ReverseGeocodeResultType) Enum.valueOf(ReverseGeocodeResultType.class, str);
    }

    public static ReverseGeocodeResultType[] values() {
        return (ReverseGeocodeResultType[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawType() {
        return this.rawType;
    }
}
