package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation;

import Ak.C2436a;
import G.g;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "navBarTintColor", "navTintColor", "", "hideSystemBackButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getNavBarTintColor", "getNavTintColor", "Ljava/lang/Boolean;", "getHideSystemBackButton", "()Ljava/lang/Boolean;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExpressNavBarVO implements c {
    private final Boolean hideSystemBackButton;
    private final long id;

    @NotNull
    private final String navBarTintColor;

    @NotNull
    private final String navTintColor;
    private final t tokenizedEvent;

    public ExpressNavBarVO(long j11, @NotNull String navBarTintColor, @NotNull String navTintColor, Boolean bool, t tVar) {
        Intrinsics.checkNotNullParameter(navBarTintColor, "navBarTintColor");
        Intrinsics.checkNotNullParameter(navTintColor, "navTintColor");
        this.id = j11;
        this.navBarTintColor = navBarTintColor;
        this.navTintColor = navTintColor;
        this.hideSystemBackButton = bool;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpressNavBarVO)) {
            return false;
        }
        ExpressNavBarVO expressNavBarVO = (ExpressNavBarVO) other;
        return this.id == expressNavBarVO.id && Intrinsics.d(this.navBarTintColor, expressNavBarVO.navBarTintColor) && Intrinsics.d(this.navTintColor, expressNavBarVO.navTintColor) && Intrinsics.d(this.hideSystemBackButton, expressNavBarVO.hideSystemBackButton) && Intrinsics.d(this.tokenizedEvent, expressNavBarVO.tokenizedEvent);
    }

    public final Boolean getHideSystemBackButton() {
        return this.hideSystemBackButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getNavBarTintColor() {
        return this.navBarTintColor;
    }

    @NotNull
    public final String getNavTintColor() {
        return this.navTintColor;
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
        int a11 = g.a(g.a(Long.hashCode(this.id) * 31, 31, this.navBarTintColor), 31, this.navTintColor);
        Boolean bool = this.hideSystemBackButton;
        int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.navBarTintColor;
        String str2 = this.navTintColor;
        Boolean bool = this.hideSystemBackButton;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "ExpressNavBarVO(id=", ", navBarTintColor=", str);
        c11.append(", navTintColor=");
        c11.append(str2);
        c11.append(", hideSystemBackButton=");
        c11.append(bool);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
