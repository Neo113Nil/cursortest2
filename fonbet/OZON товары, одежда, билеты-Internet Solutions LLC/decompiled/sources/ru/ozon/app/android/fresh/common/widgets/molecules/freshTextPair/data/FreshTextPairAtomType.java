package ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairAtomType;", "Lru/ozon/uni/atoms/data/AtomType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TEXT_PAIR", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTextPairAtomType implements AtomType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FreshTextPairAtomType[] $VALUES;
    public static final FreshTextPairAtomType TEXT_PAIR = new FreshTextPairAtomType("TEXT_PAIR", 0, "textPair");

    @NotNull
    private final String value;

    private static final /* synthetic */ FreshTextPairAtomType[] $values() {
        return new FreshTextPairAtomType[]{TEXT_PAIR};
    }

    static {
        FreshTextPairAtomType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private FreshTextPairAtomType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static FreshTextPairAtomType valueOf(String str) {
        return (FreshTextPairAtomType) Enum.valueOf(FreshTextPairAtomType.class, str);
    }

    public static FreshTextPairAtomType[] values() {
        return (FreshTextPairAtomType[]) $VALUES.clone();
    }

    @Override // ru.ozon.uni.atoms.data.AtomType
    @NotNull
    public String getValue() {
        return this.value;
    }
}
