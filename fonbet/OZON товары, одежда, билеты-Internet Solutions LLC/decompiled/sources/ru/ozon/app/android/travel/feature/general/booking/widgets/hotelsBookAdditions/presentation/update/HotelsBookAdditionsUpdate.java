package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.update;

import A00.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsVO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/update/HotelsBookAdditionsUpdate;", "LA00/a$J$a;", "", "isOpen", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "fields", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HotelsBookAdditionsUpdate implements a.J.InterfaceC0007a {
    private final List<HotelsBookAdditionsVO.FieldVO> fields;
    private final Boolean isOpen;

    /* JADX WARN: Multi-variable type inference failed */
    public HotelsBookAdditionsUpdate() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsBookAdditionsUpdate)) {
            return false;
        }
        HotelsBookAdditionsUpdate hotelsBookAdditionsUpdate = (HotelsBookAdditionsUpdate) other;
        return Intrinsics.d(this.isOpen, hotelsBookAdditionsUpdate.isOpen) && Intrinsics.d(this.fields, hotelsBookAdditionsUpdate.fields);
    }

    public final List<HotelsBookAdditionsVO.FieldVO> getFields() {
        return this.fields;
    }

    public int hashCode() {
        Boolean bool = this.isOpen;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<HotelsBookAdditionsVO.FieldVO> list = this.fields;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: isOpen, reason: from getter */
    public final Boolean getIsOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        return "HotelsBookAdditionsUpdate(isOpen=" + this.isOpen + ", fields=" + this.fields + ")";
    }

    public HotelsBookAdditionsUpdate(Boolean bool, List<HotelsBookAdditionsVO.FieldVO> list) {
        this.isOpen = bool;
        this.fields = list;
    }

    public /* synthetic */ HotelsBookAdditionsUpdate(Boolean bool, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : list);
    }
}
