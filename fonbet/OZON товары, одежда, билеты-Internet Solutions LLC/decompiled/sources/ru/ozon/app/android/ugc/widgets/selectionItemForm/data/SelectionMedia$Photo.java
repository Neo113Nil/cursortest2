package ru.ozon.app.android.ugc.widgets.selectionItemForm.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Content;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"ru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionMedia$Photo", "", "", "type", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;", "photo", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionMedia$Photo;", "copy", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionMedia$Photo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;", "getPhoto", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionMedia$Photo {
    public static final int $stable = Content.Photo.$stable;

    @NotNull
    private final Content.Photo photo;

    @NotNull
    private final String type;

    public SelectionMedia$Photo(@NotNull String type, @NotNull Content.Photo photo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(photo, "photo");
        this.type = type;
        this.photo = photo;
    }

    public static /* synthetic */ SelectionMedia$Photo copy$default(SelectionMedia$Photo selectionMedia$Photo, String str, Content.Photo photo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = selectionMedia$Photo.type;
        }
        if ((i11 & 2) != 0) {
            photo = selectionMedia$Photo.photo;
        }
        return selectionMedia$Photo.copy(str, photo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Content.Photo getPhoto() {
        return this.photo;
    }

    @NotNull
    public final SelectionMedia$Photo copy(@NotNull String type, @NotNull Content.Photo photo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(photo, "photo");
        return new SelectionMedia$Photo(type, photo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionMedia$Photo)) {
            return false;
        }
        SelectionMedia$Photo selectionMedia$Photo = (SelectionMedia$Photo) other;
        return Intrinsics.d(this.type, selectionMedia$Photo.type) && Intrinsics.d(this.photo, selectionMedia$Photo.photo);
    }

    @NotNull
    public final Content.Photo getPhoto() {
        return this.photo;
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.photo.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Photo(type=" + this.type + ", photo=" + this.photo + ")";
    }

    public /* synthetic */ SelectionMedia$Photo(String str, Content.Photo photo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "PHOTO" : str, photo);
    }
}
