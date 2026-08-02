package ru.ozon.app.android.travel.molecules.view.copyInput;

import B6.b;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/copyInput/CopyInputVO;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "iconName", "Lru/ozon/uni/atoms/af/AtomAction;", "copyAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getIconName", "Lru/ozon/uni/atoms/af/AtomAction;", "getCopyAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CopyInputVO {
    public static final int $stable = AtomAction.$stable;
    private final AtomAction copyAction;
    private final String iconName;

    @NotNull
    private final String value;

    public CopyInputVO(@NotNull String value, String str, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.iconName = str;
        this.copyAction = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyInputVO)) {
            return false;
        }
        CopyInputVO copyInputVO = (CopyInputVO) other;
        return Intrinsics.d(this.value, copyInputVO.value) && Intrinsics.d(this.iconName, copyInputVO.iconName) && Intrinsics.d(this.copyAction, copyInputVO.copyAction);
    }

    public final AtomAction getCopyAction() {
        return this.copyAction;
    }

    public final String getIconName() {
        return this.iconName;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        String str = this.iconName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.copyAction;
        return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.iconName;
        return b.b(C3660k.d("CopyInputVO(value=", str, ", iconName=", str2, ", copyAction="), this.copyAction, ")");
    }
}
