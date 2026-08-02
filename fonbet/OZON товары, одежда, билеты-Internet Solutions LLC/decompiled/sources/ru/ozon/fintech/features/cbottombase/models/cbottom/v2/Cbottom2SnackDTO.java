package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import B0.C2454a;
import Bi.b;
import C.J;
import Ef0.c;
import I1.w;
import Kk.C3532b;
import Pk0.f;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B«\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b,\u0010&J\u0012\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b-\u0010&J\u0010\u0010.\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b/\u0010*J\u0012\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b1\u0010(J\u0012\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b2\u0010\"J\u0012\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b3\u0010&J¸\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b6\u0010\"J\u0010\u00107\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b7\u0010 J\u001a\u0010:\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010&R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010*R\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bF\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bG\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bH\u0010&R\u001a\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u0010 R\u001a\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bK\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\bL\u0010\"R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bM\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\bN\u0010\"R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010@\u001a\u0004\bO\u0010&R\u001c\u0010Q\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010(¨\u0006R"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SnackDTO;", "Landroid/os/Parcelable;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;", "", "id", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "type", "", "version", "", "LF40/a;", "main", "", "inWindow", "atTop", "topPadding", "bottomPadding", "duration", "swipeable", "backgroundColor", "backgroundRadius", "borderColor", "borderWidth", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/util/List;ZZLjava/lang/Integer;Ljava/lang/Integer;IZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/util/List;", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/util/List;ZZLjava/lang/Integer;Ljava/lang/Integer;IZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SnackDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "getType", "Ljava/lang/Integer;", "getVersion", "Ljava/util/List;", "getMain", "Z", "getInWindow", "getAtTop", "getTopPadding", "getBottomPadding", "I", "getDuration", "getSwipeable", "getBackgroundColor", "getBackgroundRadius", "getBorderColor", "getBorderWidth", "getAllWidgets", "allWidgets", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Cbottom2SnackDTO implements Parcelable, ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a {

    @NotNull
    public static final Parcelable.Creator<Cbottom2SnackDTO> CREATOR = new a();

    @i(name = "atTop")
    private final boolean atTop;

    @i(name = "backgroundColor")
    private final String backgroundColor;

    @i(name = "backgroundRadius")
    private final List<Integer> backgroundRadius;

    @i(name = "borderColor")
    private final String borderColor;

    @i(name = "borderWidth")
    private final Integer borderWidth;

    @i(name = "bottomPadding")
    private final Integer bottomPadding;

    @i(name = "duration")
    private final int duration;

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "inWindow")
    private final boolean inWindow;

    @i(name = "main")
    private final List<F40.a> main;

    @i(name = "swipeable")
    private final boolean swipeable;

    @i(name = "topPadding")
    private final Integer topPadding;

    @i(name = "type")
    @NotNull
    private final CbottomType type;

    @i(name = "version")
    private final Integer version;

    public static final class a implements Parcelable.Creator<Cbottom2SnackDTO> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Cbottom2SnackDTO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i11;
            ArrayList arrayList2;
            boolean z11;
            boolean z12;
            Integer num;
            Integer num2;
            int i12;
            boolean z13;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            CbottomType valueOf = CbottomType.valueOf(parcel.readString());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i13 = 0;
                while (i13 != readInt) {
                    i13 = b.a(Cbottom2SnackDTO.class, parcel, arrayList, i13, 1);
                }
            }
            boolean z14 = 1;
            if (parcel.readInt() != 0) {
                i11 = 0;
                arrayList2 = arrayList;
                z11 = true;
            } else {
                i11 = 0;
                arrayList2 = arrayList;
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = true;
                z14 = i11;
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z13 = z12;
                num = valueOf3;
                num2 = valueOf4;
                i12 = readInt2;
            } else {
                num = valueOf3;
                num2 = valueOf4;
                i12 = readInt2;
                z13 = i11;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i11 != readInt3) {
                    i11 = Sh.a.a(parcel, arrayList4, i11, 1);
                }
                arrayList3 = arrayList4;
            }
            return new Cbottom2SnackDTO(readString, valueOf, valueOf2, arrayList2, z11, z14, num, num2, i12, z13, readString2, arrayList3, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Cbottom2SnackDTO[] newArray(int i11) {
            return new Cbottom2SnackDTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cbottom2SnackDTO(@NotNull String id2, @NotNull CbottomType type, Integer num, List<? extends F40.a> list, boolean z11, boolean z12, Integer num2, Integer num3, int i11, boolean z13, String str, List<Integer> list2, String str2, Integer num4) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.type = type;
        this.version = num;
        this.main = list;
        this.inWindow = z11;
        this.atTop = z12;
        this.topPadding = num2;
        this.bottomPadding = num3;
        this.duration = i11;
        this.swipeable = z13;
        this.backgroundColor = str;
        this.backgroundRadius = list2;
        this.borderColor = str2;
        this.borderWidth = num4;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSwipeable() {
        return this.swipeable;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<Integer> component12() {
        return this.backgroundRadius;
    }

    /* renamed from: component13, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getBorderWidth() {
        return this.borderWidth;
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
    public final boolean getInWindow() {
        return this.inWindow;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAtTop() {
        return this.atTop;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component9, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final Cbottom2SnackDTO copy(@NotNull String id2, @NotNull CbottomType type, Integer version, List<? extends F40.a> main, boolean inWindow, boolean atTop, Integer topPadding, Integer bottomPadding, int duration, boolean swipeable, String backgroundColor, List<Integer> backgroundRadius, String borderColor, Integer borderWidth) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Cbottom2SnackDTO(id2, type, version, main, inWindow, atTop, topPadding, bottomPadding, duration, swipeable, backgroundColor, backgroundRadius, borderColor, borderWidth);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cbottom2SnackDTO)) {
            return false;
        }
        Cbottom2SnackDTO cbottom2SnackDTO = (Cbottom2SnackDTO) other;
        return Intrinsics.d(this.id, cbottom2SnackDTO.id) && this.type == cbottom2SnackDTO.type && Intrinsics.d(this.version, cbottom2SnackDTO.version) && Intrinsics.d(this.main, cbottom2SnackDTO.main) && this.inWindow == cbottom2SnackDTO.inWindow && this.atTop == cbottom2SnackDTO.atTop && Intrinsics.d(this.topPadding, cbottom2SnackDTO.topPadding) && Intrinsics.d(this.bottomPadding, cbottom2SnackDTO.bottomPadding) && this.duration == cbottom2SnackDTO.duration && this.swipeable == cbottom2SnackDTO.swipeable && Intrinsics.d(this.backgroundColor, cbottom2SnackDTO.backgroundColor) && Intrinsics.d(this.backgroundRadius, cbottom2SnackDTO.backgroundRadius) && Intrinsics.d(this.borderColor, cbottom2SnackDTO.borderColor) && Intrinsics.d(this.borderWidth, cbottom2SnackDTO.borderWidth);
    }

    @Override // B40.a
    public List<F40.a> getAllWidgets() {
        return this.main;
    }

    public final boolean getAtTop() {
        return this.atTop;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<Integer> getBackgroundRadius() {
        return this.backgroundRadius;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Integer getBorderWidth() {
        return this.borderWidth;
    }

    public final Integer getBottomPadding() {
        return this.bottomPadding;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // A40.a
    @NotNull
    public String getId() {
        return this.id;
    }

    public final boolean getInWindow() {
        return this.inWindow;
    }

    public final List<F40.a> getMain() {
        return this.main;
    }

    public final boolean getSwipeable() {
        return this.swipeable;
    }

    public final Integer getTopPadding() {
        return this.topPadding;
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

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        Integer num = this.version;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<F40.a> list = this.main;
        int a11 = C3532b.a(C3532b.a((hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.inWindow), 31, this.atTop);
        Integer num2 = this.topPadding;
        int hashCode3 = (a11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bottomPadding;
        int a12 = C3532b.a(C2454a.a(this.duration, (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31, 31), 31, this.swipeable);
        String str = this.backgroundColor;
        int hashCode4 = (a12 + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list2 = this.backgroundRadius;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.borderColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.borderWidth;
        return hashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        CbottomType cbottomType = this.type;
        Integer num = this.version;
        List<F40.a> list = this.main;
        boolean z11 = this.inWindow;
        boolean z12 = this.atTop;
        Integer num2 = this.topPadding;
        Integer num3 = this.bottomPadding;
        int i11 = this.duration;
        boolean z13 = this.swipeable;
        String str2 = this.backgroundColor;
        List<Integer> list2 = this.backgroundRadius;
        String str3 = this.borderColor;
        Integer num4 = this.borderWidth;
        StringBuilder sb2 = new StringBuilder("Cbottom2SnackDTO(id=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(cbottomType);
        sb2.append(", version=");
        sb2.append(num);
        sb2.append(", main=");
        sb2.append(list);
        sb2.append(", inWindow=");
        f.c(", atTop=", ", topPadding=", sb2, z11, z12);
        c.e(sb2, num2, ", bottomPadding=", num3, ", duration=");
        Ql.c.d(sb2, i11, ", swipeable=", z13, ", backgroundColor=");
        w.d(str2, ", backgroundRadius=", ", borderColor=", sb2, list2);
        sb2.append(str3);
        sb2.append(", borderWidth=");
        sb2.append(num4);
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
        List<F40.a> list = this.main;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                dest.writeParcelable((Parcelable) c11.next(), flags);
            }
        }
        dest.writeInt(this.inWindow ? 1 : 0);
        dest.writeInt(this.atTop ? 1 : 0);
        Integer num2 = this.topPadding;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num2);
        }
        Integer num3 = this.bottomPadding;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num3);
        }
        dest.writeInt(this.duration);
        dest.writeInt(this.swipeable ? 1 : 0);
        dest.writeString(this.backgroundColor);
        List<Integer> list2 = this.backgroundRadius;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator c12 = J.c(dest, 1, list2);
            while (c12.hasNext()) {
                dest.writeInt(((Number) c12.next()).intValue());
            }
        }
        dest.writeString(this.borderColor);
        Integer num4 = this.borderWidth;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num4);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Cbottom2SnackDTO(java.lang.String r18, ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType r19, java.lang.Integer r20, java.util.List r21, boolean r22, boolean r23, java.lang.Integer r24, java.lang.Integer r25, int r26, boolean r27, java.lang.String r28, java.util.List r29, java.lang.String r30, java.lang.Integer r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 2
            if (r1 == 0) goto La
            ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType r1 = ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType.SNACK
            r4 = r1
            goto Lc
        La:
            r4 = r19
        Lc:
            r1 = r0 & 4
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r5 = r1
            goto L19
        L17:
            r5 = r20
        L19:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L20
            r7 = r3
            goto L22
        L20:
            r7 = r22
        L22:
            r1 = r0 & 32
            if (r1 == 0) goto L28
            r8 = r2
            goto L2a
        L28:
            r8 = r23
        L2a:
            r1 = r0 & 64
            if (r1 == 0) goto L34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r9 = r1
            goto L36
        L34:
            r9 = r24
        L36:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L40
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r10 = r1
            goto L42
        L40:
            r10 = r25
        L42:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4a
            r1 = 2000(0x7d0, float:2.803E-42)
            r11 = r1
            goto L4c
        L4a:
            r11 = r26
        L4c:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L52
            r12 = r2
            goto L54
        L52:
            r12 = r27
        L54:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L5b
            r13 = r2
            goto L5d
        L5b:
            r13 = r28
        L5d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L63
            r14 = r2
            goto L65
        L63:
            r14 = r29
        L65:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L6b
            r15 = r2
            goto L6d
        L6b:
            r15 = r30
        L6d:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L7a
            r16 = r2
            r3 = r18
            r6 = r21
            r2 = r17
            goto L82
        L7a:
            r16 = r31
            r2 = r17
            r3 = r18
            r6 = r21
        L82:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO.<init>(java.lang.String, ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType, java.lang.Integer, java.util.List, boolean, boolean, java.lang.Integer, java.lang.Integer, int, boolean, java.lang.String, java.util.List, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
