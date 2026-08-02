package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.leaveatdoor;

import B0.C2454a;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/LeaveAtDoorVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "iconId", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "gallery", "<init>", "(Ljava/lang/String;ILru/ozon/app/android/atoms/data/gallery/Gallery;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getIconId", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "getGallery", "()Lru/ozon/app/android/atoms/data/gallery/Gallery;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LeaveAtDoorVO {
    private final Gallery gallery;
    private final int iconId;

    @NotNull
    private final String title;

    public LeaveAtDoorVO(@NotNull String title, int i11, Gallery gallery) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.iconId = i11;
        this.gallery = gallery;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaveAtDoorVO)) {
            return false;
        }
        LeaveAtDoorVO leaveAtDoorVO = (LeaveAtDoorVO) other;
        return Intrinsics.d(this.title, leaveAtDoorVO.title) && this.iconId == leaveAtDoorVO.iconId && Intrinsics.d(this.gallery, leaveAtDoorVO.gallery);
    }

    public final Gallery getGallery() {
        return this.gallery;
    }

    public final int getIconId() {
        return this.iconId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.iconId, this.title.hashCode() * 31, 31);
        Gallery gallery = this.gallery;
        return a11 + (gallery == null ? 0 : gallery.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i11 = this.iconId;
        Gallery gallery = this.gallery;
        StringBuilder c11 = C3660k.c(i11, "LeaveAtDoorVO(title=", str, ", iconId=", ", gallery=");
        c11.append(gallery);
        c11.append(")");
        return c11.toString();
    }
}
