package ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation;

import Bi.b;
import C.C2702w;
import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "millis", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "isSilentRefresh", "<init>", "(JJLru/ozon/uni/atoms/af/AtomAction;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getMillis", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InvisibleRefresherVO implements c {
    public static final int $stable = AtomAction.$stable;

    @NotNull
    private final AtomAction action;
    private final long id;
    private final boolean isSilentRefresh;
    private final long millis;

    public InvisibleRefresherVO(long j11, long j12, @NotNull AtomAction action, boolean z11) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.millis = j12;
        this.action = action;
        this.isSilentRefresh = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvisibleRefresherVO)) {
            return false;
        }
        InvisibleRefresherVO invisibleRefresherVO = (InvisibleRefresherVO) other;
        return this.id == invisibleRefresherVO.id && this.millis == invisibleRefresherVO.millis && Intrinsics.d(this.action, invisibleRefresherVO.action) && this.isSilentRefresh == invisibleRefresherVO.isSilentRefresh;
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
        return Boolean.hashCode(this.isSilentRefresh) + C4598rp.a(this.action, Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.millis), 31);
    }

    /* renamed from: isSilentRefresh, reason: from getter */
    public final boolean getIsSilentRefresh() {
        return this.isSilentRefresh;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.millis;
        AtomAction atomAction = this.action;
        boolean z11 = this.isSilentRefresh;
        StringBuilder d11 = C2702w.d(j11, "InvisibleRefresherVO(id=", ", millis=");
        d11.append(j12);
        d11.append(", action=");
        d11.append(atomAction);
        return b.f(d11, ", isSilentRefresh=", z11, ")");
    }
}
