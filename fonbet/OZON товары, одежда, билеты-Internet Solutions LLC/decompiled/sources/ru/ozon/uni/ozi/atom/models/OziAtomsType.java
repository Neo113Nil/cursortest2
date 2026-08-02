package ru.ozon.uni.ozi.atom.models;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/atom/models/OziAtomsType;", "Lru/ozon/uni/atoms/data/AtomType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OziButton", "OziText", "OziImage", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziAtomsType implements AtomType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziAtomsType[] $VALUES;

    @NotNull
    private final String value;

    @i(name = "oziButton")
    public static final OziAtomsType OziButton = new OziAtomsType("OziButton", 0, "oziButton");

    @i(name = "text")
    public static final OziAtomsType OziText = new OziAtomsType("OziText", 1, "oziText");

    @i(name = "image")
    public static final OziAtomsType OziImage = new OziAtomsType("OziImage", 2, "oziImage");

    private static final /* synthetic */ OziAtomsType[] $values() {
        return new OziAtomsType[]{OziButton, OziText, OziImage};
    }

    static {
        OziAtomsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziAtomsType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static OziAtomsType valueOf(String str) {
        return (OziAtomsType) Enum.valueOf(OziAtomsType.class, str);
    }

    public static OziAtomsType[] values() {
        return (OziAtomsType[]) $VALUES.clone();
    }

    @Override // ru.ozon.uni.atoms.data.AtomType
    @NotNull
    public String getValue() {
        return this.value;
    }
}
