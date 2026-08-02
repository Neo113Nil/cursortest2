package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main;

import G.g;
import Kk.C3532b;
import Lh.a;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/EmptyScreenVI;", "Ll20/c;", "Lru/ozon/composer/network/widget/item/ViewItem;", "", "id", "", "", "items", "", "showBackground", "", "topMargin", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;ZLjava/lang/Integer;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Z", "getShowBackground", "()Z", "Ljava/lang/Integer;", "getTopMargin", "()Ljava/lang/Integer;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EmptyScreenVI implements c {
    private final long id;

    @NotNull
    private final List<Object> items;
    private final boolean showBackground;
    private final t tokenizedEvent;
    private final Integer topMargin;

    public EmptyScreenVI(long j11, @NotNull List<? extends Object> items, boolean z11, Integer num, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
        this.showBackground = z11;
        this.topMargin = num;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyScreenVI)) {
            return false;
        }
        EmptyScreenVI emptyScreenVI = (EmptyScreenVI) other;
        return this.id == emptyScreenVI.id && Intrinsics.d(this.items, emptyScreenVI.items) && this.showBackground == emptyScreenVI.showBackground && Intrinsics.d(this.topMargin, emptyScreenVI.topMargin) && Intrinsics.d(this.tokenizedEvent, emptyScreenVI.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowBackground() {
        return this.showBackground;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(g.b(Long.hashCode(this.id) * 31, 31, this.items), 31, this.showBackground);
        Integer num = this.topMargin;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Object> list = this.items;
        boolean z11 = this.showBackground;
        Integer num = this.topMargin;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "EmptyScreenVI(id=", ", items=", list);
        b11.append(", showBackground=");
        b11.append(z11);
        b11.append(", topMargin=");
        b11.append(num);
        return a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
