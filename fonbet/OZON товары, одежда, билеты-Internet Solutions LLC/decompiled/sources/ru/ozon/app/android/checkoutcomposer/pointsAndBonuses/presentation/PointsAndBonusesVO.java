package ru.ozon.app.android.checkoutcomposer.pointsAndBonuses.presentation;

import Bi.b;
import D3.h;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/pointsAndBonuses/presentation/PointsAndBonusesVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "hasSeparator", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;LWZ/t;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getHasSeparator", "()Z", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PointsAndBonusesVO implements c {

    @NotNull
    private final CellDTO cell;
    private final boolean hasSeparator;
    private final long id;
    private final t tokenizedEvent;

    public PointsAndBonusesVO(long j11, @NotNull CellDTO cell, t tVar, boolean z11) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
        this.cell = cell;
        this.tokenizedEvent = tVar;
        this.hasSeparator = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointsAndBonusesVO)) {
            return false;
        }
        PointsAndBonusesVO pointsAndBonusesVO = (PointsAndBonusesVO) other;
        return this.id == pointsAndBonusesVO.id && Intrinsics.d(this.cell, pointsAndBonusesVO.cell) && Intrinsics.d(this.tokenizedEvent, pointsAndBonusesVO.tokenizedEvent) && this.hasSeparator == pointsAndBonusesVO.hasSeparator;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final boolean getHasSeparator() {
        return this.hasSeparator;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.cell, Long.hashCode(this.id) * 31, 31);
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.hasSeparator) + ((c11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.hasSeparator;
        StringBuilder e11 = h.e("PointsAndBonusesVO(id=", j11, ", cell=", cellDTO);
        e11.append(", tokenizedEvent=");
        e11.append(tVar);
        e11.append(", hasSeparator=");
        e11.append(z11);
        e11.append(")");
        return e11.toString();
    }
}
