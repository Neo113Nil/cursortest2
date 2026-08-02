package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import B90.C2616s;
import Bi.b;
import C.J;
import D40.c;
import De.C2860c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÏ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b0\u0010*J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b1\u0010-J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b2\u0010-J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b3\u0010-J\u0012\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b4\u0010*J\u0012\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u0010$J\u0012\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b6\u0010*J\u0012\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b7\u0010$Jð\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b:\u0010$J\u0010\u0010;\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b;\u0010\"J\u001a\u0010>\u001a\u00020\t2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bA\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bH\u0010*R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010-R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bK\u0010-R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bL\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bM\u0010*R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bN\u0010-R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bO\u0010-R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bP\u0010-R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bQ\u0010*R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010@\u001a\u0004\bR\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\bS\u0010*R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bT\u0010$R\u001c\u0010V\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010-¨\u0006W"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2ScreenDTO;", "Landroid/os/Parcelable;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;", "", "id", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "type", "", "version", "", "modal", "noBottomTabs", "", "LF40/a;", CommentV3DTO.HEADER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, "main", "canClose", "mainPaddings", "footerPaddings", "headerPaddings", "animated", "imageUrl", "scrollable", "backgroundColor", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2ScreenDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "getType", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/Boolean;", "getModal", "getNoBottomTabs", "Ljava/util/List;", "getHeader", "getFooter", "getMain", "getCanClose", "getMainPaddings", "getFooterPaddings", "getHeaderPaddings", "getAnimated", "getImageUrl", "getScrollable", "getBackgroundColor", "getAllWidgets", "allWidgets", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Cbottom2ScreenDTO implements Parcelable, ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a {

    @NotNull
    public static final Parcelable.Creator<Cbottom2ScreenDTO> CREATOR = new a();

    @i(name = "animated")
    private final Boolean animated;

    @i(name = "backgroundColor")
    private final String backgroundColor;

    @i(name = "canClose")
    private final Boolean canClose;

    @i(name = CommentV3DTO.FOOTER_FIELD_NAME)
    private final List<F40.a> footer;

    @i(name = "footerPaddings")
    private final List<Integer> footerPaddings;

    @i(name = CommentV3DTO.HEADER_FIELD_NAME)
    private final List<F40.a> header;

    @i(name = "headerPaddings")
    private final List<Integer> headerPaddings;

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "imageUrl")
    private final String imageUrl;

    @i(name = "main")
    private final List<F40.a> main;

    @i(name = "mainPaddings")
    private final List<Integer> mainPaddings;

    @i(name = "modal")
    private final Boolean modal;

    @i(name = "noBottomTabs")
    private final Boolean noBottomTabs;

    @i(name = "scrollable")
    private final Boolean scrollable;

    @i(name = "type")
    @NotNull
    private final CbottomType type;

    @i(name = "version")
    private final Integer version;

    public static final class a implements Parcelable.Creator<Cbottom2ScreenDTO> {
        @Override // android.os.Parcelable.Creator
        public final Cbottom2ScreenDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Boolean valueOf4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            CbottomType valueOf5 = CbottomType.valueOf(parcel.readString());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = b.a(Cbottom2ScreenDTO.class, parcel, arrayList, i11, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = b.a(Cbottom2ScreenDTO.class, parcel, arrayList7, i12, 1);
                }
                arrayList2 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt3);
                int i13 = 0;
                while (i13 != readInt3) {
                    i13 = b.a(Cbottom2ScreenDTO.class, parcel, arrayList8, i13, 1);
                }
                arrayList3 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i14 = 0;
                while (i14 != readInt4) {
                    i14 = Sh.a.a(parcel, arrayList4, i14, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                int i15 = 0;
                while (i15 != readInt5) {
                    i15 = Sh.a.a(parcel, arrayList5, i15, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList6 = new ArrayList(readInt6);
                int i16 = 0;
                while (i16 != readInt6) {
                    i16 = Sh.a.a(parcel, arrayList6, i16, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = null;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Cbottom2ScreenDTO(readString, valueOf5, valueOf6, valueOf, valueOf2, arrayList, arrayList2, arrayList3, valueOf3, arrayList4, arrayList5, arrayList6, valueOf4, readString2, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Cbottom2ScreenDTO[] newArray(int i11) {
            return new Cbottom2ScreenDTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cbottom2ScreenDTO(@NotNull String id2, @NotNull CbottomType type, Integer num, Boolean bool, Boolean bool2, List<? extends F40.a> list, List<? extends F40.a> list2, List<? extends F40.a> list3, Boolean bool3, List<Integer> list4, List<Integer> list5, List<Integer> list6, Boolean bool4, String str, Boolean bool5, String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.type = type;
        this.version = num;
        this.modal = bool;
        this.noBottomTabs = bool2;
        this.header = list;
        this.footer = list2;
        this.main = list3;
        this.canClose = bool3;
        this.mainPaddings = list4;
        this.footerPaddings = list5;
        this.headerPaddings = list6;
        this.animated = bool4;
        this.imageUrl = str;
        this.scrollable = bool5;
        this.backgroundColor = str2;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<Integer> component10() {
        return this.mainPaddings;
    }

    public final List<Integer> component11() {
        return this.footerPaddings;
    }

    public final List<Integer> component12() {
        return this.headerPaddings;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getAnimated() {
        return this.animated;
    }

    /* renamed from: component14, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getScrollable() {
        return this.scrollable;
    }

    /* renamed from: component16, reason: from getter */
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

    /* renamed from: component4, reason: from getter */
    public final Boolean getModal() {
        return this.modal;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getNoBottomTabs() {
        return this.noBottomTabs;
    }

    public final List<F40.a> component6() {
        return this.header;
    }

    public final List<F40.a> component7() {
        return this.footer;
    }

    public final List<F40.a> component8() {
        return this.main;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getCanClose() {
        return this.canClose;
    }

    @NotNull
    public final Cbottom2ScreenDTO copy(@NotNull String id2, @NotNull CbottomType type, Integer version, Boolean modal, Boolean noBottomTabs, List<? extends F40.a> header, List<? extends F40.a> footer, List<? extends F40.a> main, Boolean canClose, List<Integer> mainPaddings, List<Integer> footerPaddings, List<Integer> headerPaddings, Boolean animated, String imageUrl, Boolean scrollable, String backgroundColor) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Cbottom2ScreenDTO(id2, type, version, modal, noBottomTabs, header, footer, main, canClose, mainPaddings, footerPaddings, headerPaddings, animated, imageUrl, scrollable, backgroundColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cbottom2ScreenDTO)) {
            return false;
        }
        Cbottom2ScreenDTO cbottom2ScreenDTO = (Cbottom2ScreenDTO) other;
        return Intrinsics.d(this.id, cbottom2ScreenDTO.id) && this.type == cbottom2ScreenDTO.type && Intrinsics.d(this.version, cbottom2ScreenDTO.version) && Intrinsics.d(this.modal, cbottom2ScreenDTO.modal) && Intrinsics.d(this.noBottomTabs, cbottom2ScreenDTO.noBottomTabs) && Intrinsics.d(this.header, cbottom2ScreenDTO.header) && Intrinsics.d(this.footer, cbottom2ScreenDTO.footer) && Intrinsics.d(this.main, cbottom2ScreenDTO.main) && Intrinsics.d(this.canClose, cbottom2ScreenDTO.canClose) && Intrinsics.d(this.mainPaddings, cbottom2ScreenDTO.mainPaddings) && Intrinsics.d(this.footerPaddings, cbottom2ScreenDTO.footerPaddings) && Intrinsics.d(this.headerPaddings, cbottom2ScreenDTO.headerPaddings) && Intrinsics.d(this.animated, cbottom2ScreenDTO.animated) && Intrinsics.d(this.imageUrl, cbottom2ScreenDTO.imageUrl) && Intrinsics.d(this.scrollable, cbottom2ScreenDTO.scrollable) && Intrinsics.d(this.backgroundColor, cbottom2ScreenDTO.backgroundColor);
    }

    @Override // B40.a
    public List<F40.a> getAllWidgets() {
        Collection collection = this.header;
        if (collection == null) {
            collection = K.f71697a;
        }
        Collection collection2 = collection;
        Iterable iterable = this.main;
        if (iterable == null) {
            iterable = K.f71697a;
        }
        ArrayList p02 = C7714v.p0(iterable, collection2);
        Iterable iterable2 = this.footer;
        if (iterable2 == null) {
            iterable2 = K.f71697a;
        }
        return C7714v.p0(iterable2, p02);
    }

    public final Boolean getAnimated() {
        return this.animated;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Boolean getCanClose() {
        return this.canClose;
    }

    public final List<F40.a> getFooter() {
        return this.footer;
    }

    public final List<Integer> getFooterPaddings() {
        return this.footerPaddings;
    }

    public final List<F40.a> getHeader() {
        return this.header;
    }

    public final List<Integer> getHeaderPaddings() {
        return this.headerPaddings;
    }

    @Override // A40.a
    @NotNull
    public String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<F40.a> getMain() {
        return this.main;
    }

    public final List<Integer> getMainPaddings() {
        return this.mainPaddings;
    }

    public final Boolean getModal() {
        return this.modal;
    }

    public final Boolean getNoBottomTabs() {
        return this.noBottomTabs;
    }

    public final Boolean getScrollable() {
        return this.scrollable;
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
        Boolean bool = this.modal;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.noBottomTabs;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<F40.a> list = this.header;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<F40.a> list2 = this.footer;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<F40.a> list3 = this.main;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool3 = this.canClose;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<Integer> list4 = this.mainPaddings;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Integer> list5 = this.footerPaddings;
        int hashCode10 = (hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<Integer> list6 = this.headerPaddings;
        int hashCode11 = (hashCode10 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Boolean bool4 = this.animated;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.imageUrl;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool5 = this.scrollable;
        int hashCode14 = (hashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return hashCode14 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        CbottomType cbottomType = this.type;
        Integer num = this.version;
        Boolean bool = this.modal;
        Boolean bool2 = this.noBottomTabs;
        List<F40.a> list = this.header;
        List<F40.a> list2 = this.footer;
        List<F40.a> list3 = this.main;
        Boolean bool3 = this.canClose;
        List<Integer> list4 = this.mainPaddings;
        List<Integer> list5 = this.footerPaddings;
        List<Integer> list6 = this.headerPaddings;
        Boolean bool4 = this.animated;
        String str2 = this.imageUrl;
        Boolean bool5 = this.scrollable;
        String str3 = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("Cbottom2ScreenDTO(id=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(cbottomType);
        sb2.append(", version=");
        C2860c.f(bool, num, ", modal=", ", noBottomTabs=", sb2);
        sb2.append(bool2);
        sb2.append(", header=");
        sb2.append(list);
        sb2.append(", footer=");
        C2616s.g(", main=", ", canClose=", sb2, list2, list3);
        sb2.append(bool3);
        sb2.append(", mainPaddings=");
        sb2.append(list4);
        sb2.append(", footerPaddings=");
        C2616s.g(", headerPaddings=", ", animated=", sb2, list5, list6);
        HY.b.c(bool4, ", imageUrl=", str2, ", scrollable=", sb2);
        sb2.append(bool5);
        sb2.append(", backgroundColor=");
        sb2.append(str3);
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
        Boolean bool = this.modal;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Boolean bool2 = this.noBottomTabs;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        List<F40.a> list = this.header;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                dest.writeParcelable((Parcelable) c11.next(), flags);
            }
        }
        List<F40.a> list2 = this.footer;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator c12 = J.c(dest, 1, list2);
            while (c12.hasNext()) {
                dest.writeParcelable((Parcelable) c12.next(), flags);
            }
        }
        List<F40.a> list3 = this.main;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator c13 = J.c(dest, 1, list3);
            while (c13.hasNext()) {
                dest.writeParcelable((Parcelable) c13.next(), flags);
            }
        }
        Boolean bool3 = this.canClose;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool3);
        }
        List<Integer> list4 = this.mainPaddings;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator c14 = J.c(dest, 1, list4);
            while (c14.hasNext()) {
                dest.writeInt(((Number) c14.next()).intValue());
            }
        }
        List<Integer> list5 = this.footerPaddings;
        if (list5 == null) {
            dest.writeInt(0);
        } else {
            Iterator c15 = J.c(dest, 1, list5);
            while (c15.hasNext()) {
                dest.writeInt(((Number) c15.next()).intValue());
            }
        }
        List<Integer> list6 = this.headerPaddings;
        if (list6 == null) {
            dest.writeInt(0);
        } else {
            Iterator c16 = J.c(dest, 1, list6);
            while (c16.hasNext()) {
                dest.writeInt(((Number) c16.next()).intValue());
            }
        }
        Boolean bool4 = this.animated;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool4);
        }
        dest.writeString(this.imageUrl);
        Boolean bool5 = this.scrollable;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool5);
        }
        dest.writeString(this.backgroundColor);
    }

    public /* synthetic */ Cbottom2ScreenDTO(String str, CbottomType cbottomType, Integer num, Boolean bool, Boolean bool2, List list, List list2, List list3, Boolean bool3, List list4, List list5, List list6, Boolean bool4, String str2, Boolean bool5, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? CbottomType.SCREEN : cbottomType, (i11 & 4) != 0 ? 1 : num, (i11 & 8) != 0 ? Boolean.TRUE : bool, (i11 & 16) != 0 ? Boolean.TRUE : bool2, list, list2, list3, bool3, list4, list5, list6, bool4, str2, bool5, str3);
    }
}
