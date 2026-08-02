package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;", "initState", "<init>", "(JLru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;)V", "copy", "(JLru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;", "getInitState", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;", "setInitState", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;)V", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TipCourierReviewDO implements c {
    private final long id;
    private TipCourierReviewInitState initState;

    public TipCourierReviewDO(long j11, TipCourierReviewInitState tipCourierReviewInitState) {
        this.id = j11;
        this.initState = tipCourierReviewInitState;
    }

    public static /* synthetic */ TipCourierReviewDO copy$default(TipCourierReviewDO tipCourierReviewDO, long j11, TipCourierReviewInitState tipCourierReviewInitState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = tipCourierReviewDO.id;
        }
        if ((i11 & 2) != 0) {
            tipCourierReviewInitState = tipCourierReviewDO.initState;
        }
        return tipCourierReviewDO.copy(j11, tipCourierReviewInitState);
    }

    @NotNull
    public final TipCourierReviewDO copy(long id2, TipCourierReviewInitState initState) {
        return new TipCourierReviewDO(id2, initState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipCourierReviewDO)) {
            return false;
        }
        TipCourierReviewDO tipCourierReviewDO = (TipCourierReviewDO) other;
        return this.id == tipCourierReviewDO.id && Intrinsics.d(this.initState, tipCourierReviewDO.initState);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TipCourierReviewInitState getInitState() {
        return this.initState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TipCourierReviewInitState tipCourierReviewInitState = this.initState;
        return hashCode + (tipCourierReviewInitState == null ? 0 : tipCourierReviewInitState.hashCode());
    }

    @NotNull
    public String toString() {
        return "TipCourierReviewDO(id=" + this.id + ", initState=" + this.initState + ")";
    }
}
