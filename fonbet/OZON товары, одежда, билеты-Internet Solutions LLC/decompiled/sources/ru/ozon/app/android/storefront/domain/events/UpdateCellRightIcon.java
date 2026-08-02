package ru.ozon.app.android.storefront.domain.events;

import A00.a;
import Bi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/domain/events/UpdateCellRightIcon;", "LA00/a$J$a;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;", "rightBlock", "", "disableClick", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;", "getRightBlock", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;", "Z", "getDisableClick", "()Z", "events_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateCellRightIcon implements a.J.InterfaceC0007a {
    private final boolean disableClick;
    private final long id;

    @NotNull
    private final CellDTO.RightBlock rightBlock;

    public UpdateCellRightIcon(long j11, @NotNull CellDTO.RightBlock rightBlock, boolean z11) {
        Intrinsics.checkNotNullParameter(rightBlock, "rightBlock");
        this.id = j11;
        this.rightBlock = rightBlock;
        this.disableClick = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCellRightIcon)) {
            return false;
        }
        UpdateCellRightIcon updateCellRightIcon = (UpdateCellRightIcon) other;
        return this.id == updateCellRightIcon.id && Intrinsics.d(this.rightBlock, updateCellRightIcon.rightBlock) && this.disableClick == updateCellRightIcon.disableClick;
    }

    public final boolean getDisableClick() {
        return this.disableClick;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final CellDTO.RightBlock getRightBlock() {
        return this.rightBlock;
    }

    public int hashCode() {
        return Boolean.hashCode(this.disableClick) + ((this.rightBlock.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO.RightBlock rightBlock = this.rightBlock;
        boolean z11 = this.disableClick;
        StringBuilder sb2 = new StringBuilder("UpdateCellRightIcon(id=");
        sb2.append(j11);
        sb2.append(", rightBlock=");
        sb2.append(rightBlock);
        return b.f(sb2, ", disableClick=", z11, ")");
    }
}
