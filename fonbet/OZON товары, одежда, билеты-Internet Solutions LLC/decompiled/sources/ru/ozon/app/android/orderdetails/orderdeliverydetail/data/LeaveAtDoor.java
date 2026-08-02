package ru.ozon.app.android.orderdetails.orderdeliverydetail.data;

import Kk.C3532b;
import Ve.C4636t5;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "delivered", "", "gallery", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "<init>", "(Ljava/lang/String;ZLru/ozon/app/android/atoms/data/gallery/Gallery;)V", "getTitle", "()Ljava/lang/String;", "getDelivered", "()Z", "getGallery", "()Lru/ozon/app/android/atoms/data/gallery/Gallery;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LeaveAtDoor {
    public static final int $stable = 8;
    private final boolean delivered;
    private final Gallery gallery;

    @NotNull
    private final String title;

    public LeaveAtDoor(@NotNull String title, boolean z11, Gallery gallery) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.delivered = z11;
        this.gallery = gallery;
    }

    public static /* synthetic */ LeaveAtDoor copy$default(LeaveAtDoor leaveAtDoor, String str, boolean z11, Gallery gallery, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = leaveAtDoor.title;
        }
        if ((i11 & 2) != 0) {
            z11 = leaveAtDoor.delivered;
        }
        if ((i11 & 4) != 0) {
            gallery = leaveAtDoor.gallery;
        }
        return leaveAtDoor.copy(str, z11, gallery);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDelivered() {
        return this.delivered;
    }

    /* renamed from: component3, reason: from getter */
    public final Gallery getGallery() {
        return this.gallery;
    }

    @NotNull
    public final LeaveAtDoor copy(@NotNull String title, boolean delivered, Gallery gallery) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new LeaveAtDoor(title, delivered, gallery);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaveAtDoor)) {
            return false;
        }
        LeaveAtDoor leaveAtDoor = (LeaveAtDoor) other;
        return Intrinsics.d(this.title, leaveAtDoor.title) && this.delivered == leaveAtDoor.delivered && Intrinsics.d(this.gallery, leaveAtDoor.gallery);
    }

    public final boolean getDelivered() {
        return this.delivered;
    }

    public final Gallery getGallery() {
        return this.gallery;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.title.hashCode() * 31, 31, this.delivered);
        Gallery gallery = this.gallery;
        return a11 + (gallery == null ? 0 : gallery.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.title;
        boolean z11 = this.delivered;
        Gallery gallery = this.gallery;
        StringBuilder b11 = C4636t5.b("LeaveAtDoor(title=", str, ", delivered=", ", gallery=", z11);
        b11.append(gallery);
        b11.append(")");
        return b11.toString();
    }
}
