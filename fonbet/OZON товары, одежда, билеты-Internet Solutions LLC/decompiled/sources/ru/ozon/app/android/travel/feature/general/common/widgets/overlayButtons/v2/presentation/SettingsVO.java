package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/SettingsVO;", "", "", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTopPadding", "getBottomPadding", "getLeftPadding", "getRightPadding", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SettingsVO {
    private final int bottomPadding;
    private final int leftPadding;
    private final int rightPadding;
    private final int topPadding;

    public SettingsVO(int i11, int i12, int i13, int i14) {
        this.topPadding = i11;
        this.bottomPadding = i12;
        this.leftPadding = i13;
        this.rightPadding = i14;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsVO)) {
            return false;
        }
        SettingsVO settingsVO = (SettingsVO) other;
        return this.topPadding == settingsVO.topPadding && this.bottomPadding == settingsVO.bottomPadding && this.leftPadding == settingsVO.leftPadding && this.rightPadding == settingsVO.rightPadding;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final int getLeftPadding() {
        return this.leftPadding;
    }

    public final int getRightPadding() {
        return this.rightPadding;
    }

    public final int getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        return Integer.hashCode(this.rightPadding) + C2454a.a(this.leftPadding, C2454a.a(this.bottomPadding, Integer.hashCode(this.topPadding) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return P.a(this.leftPadding, this.rightPadding, ", rightPadding=", ")", C2438a.a("SettingsVO(topPadding=", this.topPadding, ", bottomPadding=", ", leftPadding=", this.bottomPadding));
    }
}
