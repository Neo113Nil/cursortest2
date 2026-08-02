package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewItem;

import G.g;
import Lh.b;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/sticky/viewItem/StickyVI;", "Ll20/c;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "", "backgroundColor", "<init>", "(JLjava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StickyVI implements c {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final long id;

    public StickyVI(long j11, @NotNull List<ButtonV3DTO> buttons, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.buttons = buttons;
        this.backgroundColor = backgroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyVI)) {
            return false;
        }
        StickyVI stickyVI = (StickyVI) other;
        return this.id == stickyVI.id && Intrinsics.d(this.buttons, stickyVI.buttons) && Intrinsics.d(this.backgroundColor, stickyVI.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
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
        return this.backgroundColor.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.buttons);
    }

    @NotNull
    public String toString() {
        return C6594f.a(", backgroundColor=", this.backgroundColor, ")", b.b(this.id, "StickyVI(id=", ", buttons=", this.buttons));
    }
}
