package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import B90.C2616s;
import Bi.b;
import C.J;
import C.o0;
import D40.c;
import GZ.e;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b*\u0010%J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010%J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ¨\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00101\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u001a\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010#R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b@\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bA\u0010#R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bB\u0010%R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bC\u0010%R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bD\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\bE\u0010\u001fR\u001c\u0010G\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010%¨\u0006H"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2ModalDTO;", "Landroid/os/Parcelable;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;", "", "id", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "type", "", "version", "", "LF40/a;", "main", "", "canClose", "width", "height", "margins", "mainPaddings", "backgroundRadius", "backgroundColor", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2ModalDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "getType", "Ljava/lang/Integer;", "getVersion", "Ljava/util/List;", "getMain", "Ljava/lang/Boolean;", "getCanClose", "getWidth", "getHeight", "getMargins", "getMainPaddings", "getBackgroundRadius", "getBackgroundColor", "getAllWidgets", "allWidgets", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Cbottom2ModalDTO implements Parcelable, ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a {

    @NotNull
    public static final Parcelable.Creator<Cbottom2ModalDTO> CREATOR = new a();

    @i(name = "backgroundColor")
    private final String backgroundColor;

    @i(name = "backgroundRadius")
    private final List<Integer> backgroundRadius;

    @i(name = "canClose")
    private final Boolean canClose;

    @i(name = "height")
    private final Integer height;

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "main")
    private final List<F40.a> main;

    @i(name = "mainPaddings")
    private final List<Integer> mainPaddings;

    @i(name = "margins")
    private final List<Integer> margins;

    @i(name = "type")
    @NotNull
    private final CbottomType type;

    @i(name = "version")
    private final Integer version;

    @i(name = "width")
    private final Integer width;

    public static final class a implements Parcelable.Creator<Cbottom2ModalDTO> {
        @Override // android.os.Parcelable.Creator
        public final Cbottom2ModalDTO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            CbottomType valueOf2 = CbottomType.valueOf(parcel.readString());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i11 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i12 = 0;
                while (i12 != readInt) {
                    i12 = b.a(Cbottom2ModalDTO.class, parcel, arrayList, i12, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i13 = 0;
                while (i13 != readInt2) {
                    i13 = Sh.a.a(parcel, arrayList5, i13, 1);
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt3);
                int i14 = 0;
                while (i14 != readInt3) {
                    i14 = Sh.a.a(parcel, arrayList6, i14, 1);
                }
                arrayList3 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i11 != readInt4) {
                    i11 = Sh.a.a(parcel, arrayList4, i11, 1);
                }
            }
            return new Cbottom2ModalDTO(readString, valueOf2, valueOf3, arrayList, valueOf, valueOf4, valueOf5, arrayList2, arrayList3, arrayList4, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Cbottom2ModalDTO[] newArray(int i11) {
            return new Cbottom2ModalDTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cbottom2ModalDTO(@NotNull String id2, @NotNull CbottomType type, Integer num, List<? extends F40.a> list, Boolean bool, Integer num2, Integer num3, List<Integer> list2, List<Integer> list3, List<Integer> list4, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.type = type;
        this.version = num;
        this.main = list;
        this.canClose = bool;
        this.width = num2;
        this.height = num3;
        this.margins = list2;
        this.mainPaddings = list3;
        this.backgroundRadius = list4;
        this.backgroundColor = str;
    }

    public static /* synthetic */ Cbottom2ModalDTO copy$default(Cbottom2ModalDTO cbottom2ModalDTO, String str, CbottomType cbottomType, Integer num, List list, Boolean bool, Integer num2, Integer num3, List list2, List list3, List list4, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cbottom2ModalDTO.id;
        }
        if ((i11 & 2) != 0) {
            cbottomType = cbottom2ModalDTO.type;
        }
        if ((i11 & 4) != 0) {
            num = cbottom2ModalDTO.version;
        }
        if ((i11 & 8) != 0) {
            list = cbottom2ModalDTO.main;
        }
        if ((i11 & 16) != 0) {
            bool = cbottom2ModalDTO.canClose;
        }
        if ((i11 & 32) != 0) {
            num2 = cbottom2ModalDTO.width;
        }
        if ((i11 & 64) != 0) {
            num3 = cbottom2ModalDTO.height;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list2 = cbottom2ModalDTO.margins;
        }
        if ((i11 & 256) != 0) {
            list3 = cbottom2ModalDTO.mainPaddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            list4 = cbottom2ModalDTO.backgroundRadius;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str2 = cbottom2ModalDTO.backgroundColor;
        }
        List list5 = list4;
        String str3 = str2;
        List list6 = list2;
        List list7 = list3;
        Integer num4 = num2;
        Integer num5 = num3;
        Boolean bool2 = bool;
        Integer num6 = num;
        return cbottom2ModalDTO.copy(str, cbottomType, num6, list, bool2, num4, num5, list6, list7, list5, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<Integer> component10() {
        return this.backgroundRadius;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
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

    public final List<F40.a> component4() {
        return this.main;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getCanClose() {
        return this.canClose;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    public final List<Integer> component8() {
        return this.margins;
    }

    public final List<Integer> component9() {
        return this.mainPaddings;
    }

    @NotNull
    public final Cbottom2ModalDTO copy(@NotNull String id2, @NotNull CbottomType type, Integer version, List<? extends F40.a> main, Boolean canClose, Integer width, Integer height, List<Integer> margins, List<Integer> mainPaddings, List<Integer> backgroundRadius, String backgroundColor) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Cbottom2ModalDTO(id2, type, version, main, canClose, width, height, margins, mainPaddings, backgroundRadius, backgroundColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cbottom2ModalDTO)) {
            return false;
        }
        Cbottom2ModalDTO cbottom2ModalDTO = (Cbottom2ModalDTO) other;
        return Intrinsics.d(this.id, cbottom2ModalDTO.id) && this.type == cbottom2ModalDTO.type && Intrinsics.d(this.version, cbottom2ModalDTO.version) && Intrinsics.d(this.main, cbottom2ModalDTO.main) && Intrinsics.d(this.canClose, cbottom2ModalDTO.canClose) && Intrinsics.d(this.width, cbottom2ModalDTO.width) && Intrinsics.d(this.height, cbottom2ModalDTO.height) && Intrinsics.d(this.margins, cbottom2ModalDTO.margins) && Intrinsics.d(this.mainPaddings, cbottom2ModalDTO.mainPaddings) && Intrinsics.d(this.backgroundRadius, cbottom2ModalDTO.backgroundRadius) && Intrinsics.d(this.backgroundColor, cbottom2ModalDTO.backgroundColor);
    }

    @Override // B40.a
    public List<F40.a> getAllWidgets() {
        return this.main;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<Integer> getBackgroundRadius() {
        return this.backgroundRadius;
    }

    public final Boolean getCanClose() {
        return this.canClose;
    }

    public final Integer getHeight() {
        return this.height;
    }

    @Override // A40.a
    @NotNull
    public String getId() {
        return this.id;
    }

    public final List<F40.a> getMain() {
        return this.main;
    }

    public final List<Integer> getMainPaddings() {
        return this.mainPaddings;
    }

    public final List<Integer> getMargins() {
        return this.margins;
    }

    @Override // A40.a
    @NotNull
    public CbottomType getType() {
        return this.type;
    }

    @Override // A40.a
    public Integer getVersion() {
        return this.version;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        Integer num = this.version;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<F40.a> list = this.main;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.canClose;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Integer> list2 = this.margins;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.mainPaddings;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.backgroundRadius;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode9 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        CbottomType cbottomType = this.type;
        Integer num = this.version;
        List<F40.a> list = this.main;
        Boolean bool = this.canClose;
        Integer num2 = this.width;
        Integer num3 = this.height;
        List<Integer> list2 = this.margins;
        List<Integer> list3 = this.mainPaddings;
        List<Integer> list4 = this.backgroundRadius;
        String str2 = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("Cbottom2ModalDTO(id=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(cbottomType);
        sb2.append(", version=");
        sb2.append(num);
        sb2.append(", main=");
        sb2.append(list);
        sb2.append(", canClose=");
        e.d(bool, num2, ", width=", ", height=", sb2);
        sb2.append(num3);
        sb2.append(", margins=");
        sb2.append(list2);
        sb2.append(", mainPaddings=");
        C2616s.g(", backgroundRadius=", ", backgroundColor=", sb2, list3, list4);
        return o0.c(sb2, str2, ")");
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
        List<F40.a> list = this.main;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                dest.writeParcelable((Parcelable) c11.next(), flags);
            }
        }
        Boolean bool = this.canClose;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Integer num2 = this.width;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num2);
        }
        Integer num3 = this.height;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num3);
        }
        List<Integer> list2 = this.margins;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator c12 = J.c(dest, 1, list2);
            while (c12.hasNext()) {
                dest.writeInt(((Number) c12.next()).intValue());
            }
        }
        List<Integer> list3 = this.mainPaddings;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator c13 = J.c(dest, 1, list3);
            while (c13.hasNext()) {
                dest.writeInt(((Number) c13.next()).intValue());
            }
        }
        List<Integer> list4 = this.backgroundRadius;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator c14 = J.c(dest, 1, list4);
            while (c14.hasNext()) {
                dest.writeInt(((Number) c14.next()).intValue());
            }
        }
        dest.writeString(this.backgroundColor);
    }

    public /* synthetic */ Cbottom2ModalDTO(String str, CbottomType cbottomType, Integer num, List list, Boolean bool, Integer num2, Integer num3, List list2, List list3, List list4, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? CbottomType.MODAL : cbottomType, (i11 & 4) != 0 ? 1 : num, list, (i11 & 16) != 0 ? Boolean.TRUE : bool, num2, num3, list2, list3, list4, str2);
    }
}
