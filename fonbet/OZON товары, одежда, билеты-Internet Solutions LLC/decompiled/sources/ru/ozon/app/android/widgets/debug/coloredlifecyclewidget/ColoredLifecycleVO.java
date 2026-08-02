package ru.ozon.app.android.widgets.debug.coloredlifecyclewidget;

import B0.C2454a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "height", "", "excludeSticky", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JIZLru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getHeight", "Z", "getExcludeSticky", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ColoredLifecycleVO implements c {
    public static final int $stable = AtomAction.$stable;

    @NotNull
    private final AtomAction action;
    private final boolean excludeSticky;
    private final int height;
    private final long id;

    public ColoredLifecycleVO(long j11, int i11, boolean z11, @NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.height = i11;
        this.excludeSticky = z11;
        this.action = action;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColoredLifecycleVO)) {
            return false;
        }
        ColoredLifecycleVO coloredLifecycleVO = (ColoredLifecycleVO) other;
        return this.id == coloredLifecycleVO.id && this.height == coloredLifecycleVO.height && this.excludeSticky == coloredLifecycleVO.excludeSticky && Intrinsics.d(this.action, coloredLifecycleVO.action);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    public final boolean getExcludeSticky() {
        return this.excludeSticky;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        return this.action.hashCode() + C3532b.a(C2454a.a(this.height, Long.hashCode(this.id) * 31, 31), 31, this.excludeSticky);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.height;
        boolean z11 = this.excludeSticky;
        AtomAction atomAction = this.action;
        StringBuilder b11 = Ql.c.b(j11, "ColoredLifecycleVO(id=", i11, ", height=");
        b11.append(", excludeSticky=");
        b11.append(z11);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(")");
        return b11.toString();
    }
}
