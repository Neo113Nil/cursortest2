package ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\b\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "icon", "", "isDefaultBehavior", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;ZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getIcon", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HomeButtonVO implements c {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final String icon;
    private final long id;
    private final boolean isDefaultBehavior;
    private final t tokenizedEvent;

    public HomeButtonVO(long j11, @NotNull String icon, boolean z11, @NotNull AtomAction action, t tVar) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.icon = icon;
        this.isDefaultBehavior = z11;
        this.action = action;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeButtonVO)) {
            return false;
        }
        HomeButtonVO homeButtonVO = (HomeButtonVO) other;
        return this.id == homeButtonVO.id && Intrinsics.d(this.icon, homeButtonVO.icon) && this.isDefaultBehavior == homeButtonVO.isDefaultBehavior && Intrinsics.d(this.action, homeButtonVO.action) && Intrinsics.d(this.tokenizedEvent, homeButtonVO.tokenizedEvent);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
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
        int a11 = C4598rp.a(this.action, C3532b.a(g.a(Long.hashCode(this.id) * 31, 31, this.icon), 31, this.isDefaultBehavior), 31);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    /* renamed from: isDefaultBehavior, reason: from getter */
    public final boolean getIsDefaultBehavior() {
        return this.isDefaultBehavior;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.icon;
        boolean z11 = this.isDefaultBehavior;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "HomeButtonVO(id=", ", icon=", str);
        c11.append(", isDefaultBehavior=");
        c11.append(z11);
        c11.append(", action=");
        c11.append(atomAction);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
