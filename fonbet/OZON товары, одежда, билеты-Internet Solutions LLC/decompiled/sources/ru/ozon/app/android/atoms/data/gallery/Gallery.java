package ru.ozon.app.android.atoms.data.gallery;

import Ak.b;
import B0.C2454a;
import Bi.a;
import Bl.C2639a;
import C.J;
import Cm.e;
import De.C2859b;
import G.g;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J_\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010$\u001a\u00020\u0005J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, d2 = {"Lru/ozon/app/android/atoms/data/gallery/Gallery;", "Lru/ozon/uni/atoms/data/AtomDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "maxCount", "", "items", "", "Lru/ozon/app/android/atoms/data/gallery/GalleryImage;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getMaxCount", "()I", "getItems", "()Ljava/util/List;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Gallery extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<Gallery> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final List<GalleryImage> items;
    private final int maxCount;
    private final TestInfo testInfo;
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<Gallery> {
        @Override // android.os.Parcelable.Creator
        public final Gallery createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i11 = 0;
            while (i11 != readInt2) {
                i11 = b.b(GalleryImage.CREATOR, parcel, arrayList, i11, 1);
            }
            String readString2 = parcel.readString();
            TestInfo testInfo = (TestInfo) parcel.readParcelable(Gallery.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                int i12 = 0;
                while (i12 != readInt3) {
                    i12 = C2859b.a(Gallery.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Gallery(readString, readInt, arrayList, readString2, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Gallery[] newArray(int i11) {
            return new Gallery[i11];
        }
    }

    public /* synthetic */ Gallery(String str, int i11, List list, String str2, TestInfo testInfo, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? 5 : i11, list, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : testInfo, (i12 & 32) != 0 ? null : map);
    }

    public static /* synthetic */ Gallery copy$default(Gallery gallery, String str, int i11, List list, String str2, TestInfo testInfo, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = gallery.title;
        }
        if ((i12 & 2) != 0) {
            i11 = gallery.maxCount;
        }
        if ((i12 & 4) != 0) {
            list = gallery.items;
        }
        if ((i12 & 8) != 0) {
            str2 = gallery.context;
        }
        if ((i12 & 16) != 0) {
            testInfo = gallery.testInfo;
        }
        if ((i12 & 32) != 0) {
            map = gallery.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        return gallery.copy(str, i11, list, str2, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    @NotNull
    public final List<GalleryImage> component3() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final Gallery copy(String title, int maxCount, @NotNull List<GalleryImage> items, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new Gallery(title, maxCount, items, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Gallery)) {
            return false;
        }
        Gallery gallery = (Gallery) other;
        return Intrinsics.d(this.title, gallery.title) && this.maxCount == gallery.maxCount && Intrinsics.d(this.items, gallery.items) && Intrinsics.d(this.context, gallery.context) && Intrinsics.d(this.testInfo, gallery.testInfo) && Intrinsics.d(this.trackingInfo, gallery.trackingInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_gallery;
    }

    @NotNull
    public final List<GalleryImage> getItems() {
        return this.items;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.title;
        int b11 = g.b(C2454a.a(this.maxCount, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.items);
        String str2 = this.context;
        int hashCode = (b11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i11 = this.maxCount;
        List<GalleryImage> list = this.items;
        String str2 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = C3660k.c(i11, "Gallery(title=", str, ", maxCount=", ", items=");
        e.i(", context=", str2, ", testInfo=", c11, list);
        return C2639a.a(", trackingInfo=", ")", c11, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeInt(this.maxCount);
        Iterator c11 = a.c(this.items, dest);
        while (c11.hasNext()) {
            ((GalleryImage) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
        dest.writeParcelable(this.testInfo, flags);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gallery(String str, int i11, @NotNull List<GalleryImage> items, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.GALLERY, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = str;
        this.maxCount = i11;
        this.items = items;
        this.context = str2;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
