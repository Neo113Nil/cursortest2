package ru.ozon.app.android.travel.feature.general.common.widgets.pendingAction.presentation;

import C.C2702w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pendingAction/presentation/PendingActionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "millis", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JJLru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getMillis", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PendingActionVO implements c {
    public static final int $stable = AtomAction.$stable;

    @NotNull
    private final AtomAction action;
    private final long id;
    private final long millis;

    public PendingActionVO(long j11, long j12, @NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.millis = j12;
        this.action = action;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingActionVO)) {
            return false;
        }
        PendingActionVO pendingActionVO = (PendingActionVO) other;
        return this.id == pendingActionVO.id && this.millis == pendingActionVO.millis && Intrinsics.d(this.action, pendingActionVO.action);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final long getMillis() {
        return this.millis;
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
        return this.action.hashCode() + Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.millis);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.millis;
        AtomAction atomAction = this.action;
        StringBuilder d11 = C2702w.d(j11, "PendingActionVO(id=", ", millis=");
        d11.append(j12);
        d11.append(", action=");
        d11.append(atomAction);
        d11.append(")");
        return d11.toString();
    }
}
