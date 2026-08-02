package ru.ozon.app.android.pdp.widgets.othersellers.presentation.footer;

import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.Cell;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u00042\u00020\u0005B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/presentation/footer/OtherSellersFooterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/m;", "Lm10/o;", "", "id", "Lru/ozon/app/android/atoms/data/deprecated/Cell$CellDefault;", "cellDefault", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/atoms/data/deprecated/Cell$CellDefault;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/atoms/data/deprecated/Cell$CellDefault;", "getCellDefault", "()Lru/ozon/app/android/atoms/data/deprecated/Cell$CellDefault;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgetName", "Ljava/lang/String;", "getWidgetName", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OtherSellersFooterVO implements c, InterfaceC8039a, m, o {

    @NotNull
    private final Cell.CellDefault cellDefault;
    private final long id;
    private final t tokenizedEvent;

    @NotNull
    private final String widgetName;

    public OtherSellersFooterVO(long j11, @NotNull Cell.CellDefault cellDefault, t tVar) {
        Intrinsics.checkNotNullParameter(cellDefault, "cellDefault");
        this.id = j11;
        this.cellDefault = cellDefault;
        this.tokenizedEvent = tVar;
        this.widgetName = "pdp_other_seller";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherSellersFooterVO)) {
            return false;
        }
        OtherSellersFooterVO otherSellersFooterVO = (OtherSellersFooterVO) other;
        return this.id == otherSellersFooterVO.id && Intrinsics.d(this.cellDefault, otherSellersFooterVO.cellDefault) && Intrinsics.d(this.tokenizedEvent, otherSellersFooterVO.tokenizedEvent);
    }

    @NotNull
    public final Cell.CellDefault getCellDefault() {
        return this.cellDefault;
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

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int hashCode = (this.cellDefault.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Cell.CellDefault cellDefault = this.cellDefault;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("OtherSellersFooterVO(id=");
        sb2.append(j11);
        sb2.append(", cellDefault=");
        sb2.append(cellDefault);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
