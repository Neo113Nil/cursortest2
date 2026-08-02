package ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation;

import Bi.b;
import D3.h;
import Nh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b&\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b'\u0010\u0012R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "shownKey", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "backgroundColor", "strokeColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/lang/String;", "getShownKey", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundColor", "getStrokeColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StickyCellVO implements c {
    private final String backgroundColor;

    @NotNull
    private final CellDTO cell;
    private final CornerRadius cornerRadius;
    private final long id;
    private final String shownKey;
    private final String strokeColor;
    private final t tokenizedEvent;

    public StickyCellVO(long j11, @NotNull CellDTO cell, String str, CornerRadius cornerRadius, String str2, String str3, t tVar) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
        this.cell = cell;
        this.shownKey = str;
        this.cornerRadius = cornerRadius;
        this.backgroundColor = str2;
        this.strokeColor = str3;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyCellVO)) {
            return false;
        }
        StickyCellVO stickyCellVO = (StickyCellVO) other;
        return this.id == stickyCellVO.id && Intrinsics.d(this.cell, stickyCellVO.cell) && Intrinsics.d(this.shownKey, stickyCellVO.shownKey) && this.cornerRadius == stickyCellVO.cornerRadius && Intrinsics.d(this.backgroundColor, stickyCellVO.backgroundColor) && Intrinsics.d(this.strokeColor, stickyCellVO.strokeColor) && Intrinsics.d(this.tokenizedEvent, stickyCellVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getShownKey() {
        return this.shownKey;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
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
        String str = this.shownKey;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.strokeColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        String str = this.shownKey;
        CornerRadius cornerRadius = this.cornerRadius;
        String str2 = this.backgroundColor;
        String str3 = this.strokeColor;
        t tVar = this.tokenizedEvent;
        StringBuilder e11 = h.e("StickyCellVO(id=", j11, ", cell=", cellDTO);
        e11.append(", shownKey=");
        e11.append(str);
        e11.append(", cornerRadius=");
        e11.append(cornerRadius);
        a.h(e11, ", backgroundColor=", str2, ", strokeColor=", str3);
        return Lh.a.b(e11, ", tokenizedEvent=", tVar, ")");
    }
}
