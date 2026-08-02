package ru.ozon.app.android.pdp.widgets.characteristics.presentation;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", CommentV3DTO.HEADER_NAME, "VALUE", "SIMPLE_VALUE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CharacteristicsType[] $VALUES;
    private final int value;
    public static final CharacteristicsType HEADER = new CharacteristicsType(CommentV3DTO.HEADER_NAME, 0, 1);
    public static final CharacteristicsType VALUE = new CharacteristicsType("VALUE", 1, 2);
    public static final CharacteristicsType SIMPLE_VALUE = new CharacteristicsType("SIMPLE_VALUE", 2, 3);

    private static final /* synthetic */ CharacteristicsType[] $values() {
        return new CharacteristicsType[]{HEADER, VALUE, SIMPLE_VALUE};
    }

    static {
        CharacteristicsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CharacteristicsType(String str, int i11, int i12) {
        this.value = i12;
    }

    public static CharacteristicsType valueOf(String str) {
        return (CharacteristicsType) Enum.valueOf(CharacteristicsType.class, str);
    }

    public static CharacteristicsType[] values() {
        return (CharacteristicsType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
