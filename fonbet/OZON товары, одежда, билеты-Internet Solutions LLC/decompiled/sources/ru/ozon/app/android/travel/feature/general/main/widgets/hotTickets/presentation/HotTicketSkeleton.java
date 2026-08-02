package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation;

import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketSkeleton;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsListItemVO;", "", "id", "", "borderColor", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getBorderColor", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotTicketSkeleton implements HotTicketsListItemVO {
    private final String borderColor;
    private final int id;

    public HotTicketSkeleton(int i11, String str) {
        this.id = i11;
        this.borderColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotTicketSkeleton)) {
            return false;
        }
        HotTicketSkeleton hotTicketSkeleton = (HotTicketSkeleton) other;
        return this.id == hotTicketSkeleton.id && Intrinsics.d(this.borderColor, hotTicketSkeleton.borderColor);
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsListItemVO
    public int getId() {
        return this.id;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.borderColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return a.c(this.id, "HotTicketSkeleton(id=", ", borderColor=", this.borderColor, ")");
    }
}
