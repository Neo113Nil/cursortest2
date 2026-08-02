package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailsButtonVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;", "initState", "<init>", "(JLru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;)V", "copy", "(JLru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;)Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailsButtonVI;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;", "getInitState", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TipCourierDetailsButtonVI implements c {
    private final long id;
    private final TipCourierDetailInitState initState;

    public TipCourierDetailsButtonVI(long j11, TipCourierDetailInitState tipCourierDetailInitState) {
        this.id = j11;
        this.initState = tipCourierDetailInitState;
    }

    public static /* synthetic */ TipCourierDetailsButtonVI copy$default(TipCourierDetailsButtonVI tipCourierDetailsButtonVI, long j11, TipCourierDetailInitState tipCourierDetailInitState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = tipCourierDetailsButtonVI.id;
        }
        if ((i11 & 2) != 0) {
            tipCourierDetailInitState = tipCourierDetailsButtonVI.initState;
        }
        return tipCourierDetailsButtonVI.copy(j11, tipCourierDetailInitState);
    }

    @NotNull
    public final TipCourierDetailsButtonVI copy(long id2, TipCourierDetailInitState initState) {
        return new TipCourierDetailsButtonVI(id2, initState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipCourierDetailsButtonVI)) {
            return false;
        }
        TipCourierDetailsButtonVI tipCourierDetailsButtonVI = (TipCourierDetailsButtonVI) other;
        return this.id == tipCourierDetailsButtonVI.id && Intrinsics.d(this.initState, tipCourierDetailsButtonVI.initState);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TipCourierDetailInitState getInitState() {
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
        TipCourierDetailInitState tipCourierDetailInitState = this.initState;
        return hashCode + (tipCourierDetailInitState == null ? 0 : tipCourierDetailInitState.hashCode());
    }

    @NotNull
    public String toString() {
        return "TipCourierDetailsButtonVI(id=" + this.id + ", initState=" + this.initState + ")";
    }
}
