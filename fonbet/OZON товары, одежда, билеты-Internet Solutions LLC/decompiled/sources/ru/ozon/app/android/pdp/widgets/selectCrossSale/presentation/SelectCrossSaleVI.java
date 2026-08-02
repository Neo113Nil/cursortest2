package ru.ozon.app.android.pdp.widgets.selectCrossSale.presentation;

import Bi.a;
import G.g;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import v0.I;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectCrossSale/presentation/SelectCrossSaleVI;", "Ll20/c;", "", "id", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "", "backgroundColor", "LWZ/t;", "tokenizedEvent", "Lv0/I;", "scrollState", "<init>", "(JLjava/util/List;Ljava/lang/String;LWZ/t;Lv0/I;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lv0/I;", "getScrollState", "()Lv0/I;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectCrossSaleVI implements c {
    private final String backgroundColor;

    @NotNull
    private final List<CellDTO> cells;
    private final long id;

    @NotNull
    private final I scrollState;
    private final t tokenizedEvent;

    public SelectCrossSaleVI(long j11, @NotNull List<CellDTO> cells, String str, t tVar, @NotNull I scrollState) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.id = j11;
        this.cells = cells;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
        this.scrollState = scrollState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectCrossSaleVI)) {
            return false;
        }
        SelectCrossSaleVI selectCrossSaleVI = (SelectCrossSaleVI) other;
        return this.id == selectCrossSaleVI.id && Intrinsics.d(this.cells, selectCrossSaleVI.cells) && Intrinsics.d(this.backgroundColor, selectCrossSaleVI.backgroundColor) && Intrinsics.d(this.tokenizedEvent, selectCrossSaleVI.tokenizedEvent) && Intrinsics.d(this.scrollState, selectCrossSaleVI.scrollState);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final I getScrollState() {
        return this.scrollState;
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
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.cells);
        String str = this.backgroundColor;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return this.scrollState.hashCode() + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<CellDTO> list = this.cells;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        I i11 = this.scrollState;
        StringBuilder b11 = b.b(j11, "SelectCrossSaleVI(id=", ", cells=", list);
        a.f(b11, ", backgroundColor=", str, ", tokenizedEvent=", tVar);
        b11.append(", scrollState=");
        b11.append(i11);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ SelectCrossSaleVI(long j11, List list, String str, t tVar, I i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, str, tVar, (i12 & 16) != 0 ? new I(0, 0) : i11);
    }
}
