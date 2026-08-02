package ru.ozon.app.android.mapcommon.map.model;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/mapcommon/map/model/SuggestionType;", "", "<init>", "(Ljava/lang/String;I)V", "ANY", "GEOGRAPHICAL_OBJECTS", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuggestionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SuggestionType[] $VALUES;
    public static final SuggestionType ANY = new SuggestionType("ANY", 0);
    public static final SuggestionType GEOGRAPHICAL_OBJECTS = new SuggestionType("GEOGRAPHICAL_OBJECTS", 1);

    private static final /* synthetic */ SuggestionType[] $values() {
        return new SuggestionType[]{ANY, GEOGRAPHICAL_OBJECTS};
    }

    static {
        SuggestionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SuggestionType(String str, int i11) {
    }

    public static SuggestionType valueOf(String str) {
        return (SuggestionType) Enum.valueOf(SuggestionType.class, str);
    }

    public static SuggestionType[] values() {
        return (SuggestionType[]) $VALUES.clone();
    }
}
