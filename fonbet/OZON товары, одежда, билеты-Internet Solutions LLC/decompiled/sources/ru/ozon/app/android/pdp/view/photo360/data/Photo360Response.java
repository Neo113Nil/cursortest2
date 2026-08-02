package ru.ozon.app.android.pdp.view.photo360.data;

import G.g;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/data/Photo360Response;", "", "photos", "", "", "description", "hasAutoplay", "", "zoomDescription", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getPhotos", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getHasAutoplay", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getZoomDescription", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/pdp/view/photo360/data/Photo360Response;", "equals", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Photo360Response {
    public static final int $stable = 8;

    @NotNull
    private final String description;
    private final Boolean hasAutoplay;

    @NotNull
    private final List<String> photos;

    @NotNull
    private final String zoomDescription;

    public Photo360Response(@NotNull List<String> photos, @NotNull String description, Boolean bool, @NotNull String zoomDescription) {
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(zoomDescription, "zoomDescription");
        this.photos = photos;
        this.description = description;
        this.hasAutoplay = bool;
        this.zoomDescription = zoomDescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Photo360Response copy$default(Photo360Response photo360Response, List list, String str, Boolean bool, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = photo360Response.photos;
        }
        if ((i11 & 2) != 0) {
            str = photo360Response.description;
        }
        if ((i11 & 4) != 0) {
            bool = photo360Response.hasAutoplay;
        }
        if ((i11 & 8) != 0) {
            str2 = photo360Response.zoomDescription;
        }
        return photo360Response.copy(list, str, bool, str2);
    }

    @NotNull
    public final List<String> component1() {
        return this.photos;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHasAutoplay() {
        return this.hasAutoplay;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getZoomDescription() {
        return this.zoomDescription;
    }

    @NotNull
    public final Photo360Response copy(@NotNull List<String> photos, @NotNull String description, Boolean hasAutoplay, @NotNull String zoomDescription) {
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(zoomDescription, "zoomDescription");
        return new Photo360Response(photos, description, hasAutoplay, zoomDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Photo360Response)) {
            return false;
        }
        Photo360Response photo360Response = (Photo360Response) other;
        return Intrinsics.d(this.photos, photo360Response.photos) && Intrinsics.d(this.description, photo360Response.description) && Intrinsics.d(this.hasAutoplay, photo360Response.hasAutoplay) && Intrinsics.d(this.zoomDescription, photo360Response.zoomDescription);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final Boolean getHasAutoplay() {
        return this.hasAutoplay;
    }

    @NotNull
    public final List<String> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final String getZoomDescription() {
        return this.zoomDescription;
    }

    public int hashCode() {
        int a11 = g.a(this.photos.hashCode() * 31, 31, this.description);
        Boolean bool = this.hasAutoplay;
        return this.zoomDescription.hashCode() + ((a11 + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        List<String> list = this.photos;
        String str = this.description;
        Boolean bool = this.hasAutoplay;
        String str2 = this.zoomDescription;
        StringBuilder a11 = C4055a.a("Photo360Response(photos=", ", description=", str, ", hasAutoplay=", list);
        a11.append(bool);
        a11.append(", zoomDescription=");
        a11.append(str2);
        a11.append(")");
        return a11.toString();
    }
}
