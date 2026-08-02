package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.multiCell;

import G.g;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import v0.I;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/CellHorizontalScrollVI;", "Ll20/c;", "", "id", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lv0/I;", "scrollState", "<init>", "(JLjava/util/List;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;Lv0/I;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lv0/I;", "getScrollState", "()Lv0/I;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CellHorizontalScrollVI implements c {

    @NotNull
    private final List<CellDTO> cells;
    private final long id;

    @NotNull
    private final I scrollState;
    private final TestInfo testInfo;
    private final t tokenizedEvent;

    public CellHorizontalScrollVI(long j11, @NotNull List<CellDTO> cells, t tVar, TestInfo testInfo, @NotNull I scrollState) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.id = j11;
        this.cells = cells;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
        this.scrollState = scrollState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellHorizontalScrollVI)) {
            return false;
        }
        CellHorizontalScrollVI cellHorizontalScrollVI = (CellHorizontalScrollVI) other;
        return this.id == cellHorizontalScrollVI.id && Intrinsics.d(this.cells, cellHorizontalScrollVI.cells) && Intrinsics.d(this.tokenizedEvent, cellHorizontalScrollVI.tokenizedEvent) && Intrinsics.d(this.testInfo, cellHorizontalScrollVI.testInfo) && Intrinsics.d(this.scrollState, cellHorizontalScrollVI.scrollState);
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

    public final TestInfo getTestInfo() {
        return this.testInfo;
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
        t tVar = this.tokenizedEvent;
        int hashCode = (b11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return this.scrollState.hashCode() + ((hashCode + (testInfo != null ? testInfo.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<CellDTO> list = this.cells;
        t tVar = this.tokenizedEvent;
        TestInfo testInfo = this.testInfo;
        I i11 = this.scrollState;
        StringBuilder b11 = b.b(j11, "CellHorizontalScrollVI(id=", ", cells=", list);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", testInfo=");
        b11.append(testInfo);
        b11.append(", scrollState=");
        b11.append(i11);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ CellHorizontalScrollVI(long j11, List list, t tVar, TestInfo testInfo, I i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, tVar, testInfo, (i12 & 16) != 0 ? new I(0, 0) : i11);
    }
}
