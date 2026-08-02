package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import B4.V;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JR\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b0\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b\f\u0010 R\u001c\u00106\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2WebViewDTO;", "Landroid/os/Parcelable;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;", "", "id", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "type", "", "version", ImagesContract.URL, SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isClean", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2WebViewDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "getType", "Ljava/lang/Integer;", "getVersion", "getUrl", "getTitle", "Z", "", "LF40/a;", "getAllWidgets", "()Ljava/util/List;", "allWidgets", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Cbottom2WebViewDTO implements Parcelable, ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a {

    @NotNull
    public static final Parcelable.Creator<Cbottom2WebViewDTO> CREATOR = new a();

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "is_clean")
    private final boolean isClean;

    @i(name = SelectionItemFormDTO.TITLE_FIELD_NAME)
    private final String title;

    @i(name = "type")
    @NotNull
    private final CbottomType type;

    @i(name = ImagesContract.URL)
    private final String url;

    @i(name = "version")
    private final Integer version;

    public static final class a implements Parcelable.Creator<Cbottom2WebViewDTO> {
        @Override // android.os.Parcelable.Creator
        public final Cbottom2WebViewDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Cbottom2WebViewDTO(parcel.readString(), CbottomType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Cbottom2WebViewDTO[] newArray(int i11) {
            return new Cbottom2WebViewDTO[i11];
        }
    }

    public Cbottom2WebViewDTO(@NotNull String id2, @NotNull CbottomType type, Integer num, String str, String str2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.type = type;
        this.version = num;
        this.url = str;
        this.title = str2;
        this.isClean = z11;
    }

    public static /* synthetic */ Cbottom2WebViewDTO copy$default(Cbottom2WebViewDTO cbottom2WebViewDTO, String str, CbottomType cbottomType, Integer num, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cbottom2WebViewDTO.id;
        }
        if ((i11 & 2) != 0) {
            cbottomType = cbottom2WebViewDTO.type;
        }
        if ((i11 & 4) != 0) {
            num = cbottom2WebViewDTO.version;
        }
        if ((i11 & 8) != 0) {
            str2 = cbottom2WebViewDTO.url;
        }
        if ((i11 & 16) != 0) {
            str3 = cbottom2WebViewDTO.title;
        }
        if ((i11 & 32) != 0) {
            z11 = cbottom2WebViewDTO.isClean;
        }
        String str4 = str3;
        boolean z12 = z11;
        return cbottom2WebViewDTO.copy(str, cbottomType, num, str2, str4, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CbottomType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsClean() {
        return this.isClean;
    }

    @NotNull
    public final Cbottom2WebViewDTO copy(@NotNull String id2, @NotNull CbottomType type, Integer version, String url, String title, boolean isClean) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Cbottom2WebViewDTO(id2, type, version, url, title, isClean);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cbottom2WebViewDTO)) {
            return false;
        }
        Cbottom2WebViewDTO cbottom2WebViewDTO = (Cbottom2WebViewDTO) other;
        return Intrinsics.d(this.id, cbottom2WebViewDTO.id) && this.type == cbottom2WebViewDTO.type && Intrinsics.d(this.version, cbottom2WebViewDTO.version) && Intrinsics.d(this.url, cbottom2WebViewDTO.url) && Intrinsics.d(this.title, cbottom2WebViewDTO.title) && this.isClean == cbottom2WebViewDTO.isClean;
    }

    @Override // B40.a
    public List<F40.a> getAllWidgets() {
        return K.f71697a;
    }

    @Override // A40.a
    @NotNull
    public String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // A40.a
    @NotNull
    public CbottomType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // A40.a
    public Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        Integer num = this.version;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return Boolean.hashCode(this.isClean) + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isClean() {
        return this.isClean;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        CbottomType cbottomType = this.type;
        Integer num = this.version;
        String str2 = this.url;
        String str3 = this.title;
        boolean z11 = this.isClean;
        StringBuilder sb2 = new StringBuilder("Cbottom2WebViewDTO(id=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(cbottomType);
        sb2.append(", version=");
        V.f(num, ", url=", str2, ", title=", sb2);
        sb2.append(str3);
        sb2.append(", isClean=");
        sb2.append(z11);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // B40.a
    public boolean updateLazyColumnWidgetsOrder(List<? extends F40.a> list, boolean z11, String str, List<String> list2) {
        return a.C1999a.a(this, list, z11, str, list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.type.name());
        Integer num = this.version;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        dest.writeString(this.url);
        dest.writeString(this.title);
        dest.writeInt(this.isClean ? 1 : 0);
    }

    public /* synthetic */ Cbottom2WebViewDTO(String str, CbottomType cbottomType, Integer num, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? CbottomType.WEBVIEW : cbottomType, (i11 & 4) != 0 ? 1 : num, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? false : z11);
    }
}
