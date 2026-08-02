package ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewItem;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/ReasonVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "reason", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/NestedReasons;", "nestedReasons", "<init>", "(JLru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/NestedReasons;)V", "copy", "(JLru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/NestedReasons;)Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/ReasonVI;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "getReason", "()Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/NestedReasons;", "getNestedReasons", "()Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/NestedReasons;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReasonVI implements c {
    private final long id;
    private final NestedReasons nestedReasons;

    @NotNull
    private final ReasonRow reason;

    public ReasonVI(long j11, @NotNull ReasonRow reason, NestedReasons nestedReasons) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.id = j11;
        this.reason = reason;
        this.nestedReasons = nestedReasons;
    }

    public static /* synthetic */ ReasonVI copy$default(ReasonVI reasonVI, long j11, ReasonRow reasonRow, NestedReasons nestedReasons, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = reasonVI.id;
        }
        if ((i11 & 2) != 0) {
            reasonRow = reasonVI.reason;
        }
        if ((i11 & 4) != 0) {
            nestedReasons = reasonVI.nestedReasons;
        }
        return reasonVI.copy(j11, reasonRow, nestedReasons);
    }

    @NotNull
    public final ReasonVI copy(long id2, @NotNull ReasonRow reason, NestedReasons nestedReasons) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new ReasonVI(id2, reason, nestedReasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReasonVI)) {
            return false;
        }
        ReasonVI reasonVI = (ReasonVI) other;
        return this.id == reasonVI.id && Intrinsics.d(this.reason, reasonVI.reason) && Intrinsics.d(this.nestedReasons, reasonVI.nestedReasons);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final NestedReasons getNestedReasons() {
        return this.nestedReasons;
    }

    @NotNull
    public final ReasonRow getReason() {
        return this.reason;
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
        int hashCode = (this.reason.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        NestedReasons nestedReasons = this.nestedReasons;
        return hashCode + (nestedReasons == null ? 0 : nestedReasons.hashCode());
    }

    @NotNull
    public String toString() {
        return "ReasonVI(id=" + this.id + ", reason=" + this.reason + ", nestedReasons=" + this.nestedReasons + ")";
    }
}
