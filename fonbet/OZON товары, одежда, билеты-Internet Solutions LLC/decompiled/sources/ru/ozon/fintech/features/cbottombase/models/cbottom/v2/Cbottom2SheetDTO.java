package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import B90.C2616s;
import B90.C2618u;
import Bi.b;
import C.J;
import D3.h;
import D40.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0099\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010%J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010%J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b-\u0010%J´\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00101\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u001a\u00104\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010#R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010%R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b>\u0010%R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b?\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bB\u0010)R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bC\u0010%R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bD\u0010%R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\bE\u0010%R\u001c\u0010G\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010%¨\u0006H"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SheetDTO;", "Landroid/os/Parcelable;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;", "", "id", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "type", "", "version", "", "LF40/a;", CommentV3DTO.HEADER_FIELD_NAME, "main", CommentV3DTO.FOOTER_FIELD_NAME, "", "dashHidden", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "headerPaddings", "mainPaddings", "footerPaddings", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SheetDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "getType", "Ljava/lang/Integer;", "getVersion", "Ljava/util/List;", "getHeader", "getMain", "getFooter", "Ljava/lang/Boolean;", "getDashHidden", "getExpanded", "getHeaderPaddings", "getMainPaddings", "getFooterPaddings", "getAllWidgets", "allWidgets", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Cbottom2SheetDTO implements Parcelable, ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a {

    @NotNull
    public static final Parcelable.Creator<Cbottom2SheetDTO> CREATOR = new a();

    @i(name = "dashHidden")
    private final Boolean dashHidden;

    @i(name = NavBarDTO.NESTED_PLACEHOLDER_EXPANDED)
    private final Boolean expanded;

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

    @i(name = "main")
    private final List<F40.a> main;

    @i(name = "mainPaddings")
    private final List<Integer> mainPaddings;

    @i(name = "type")
    @NotNull
    private final CbottomType type;

    @i(name = "version")
    private final Integer version;

    public static final class a implements Parcelable.Creator<Cbottom2SheetDTO> {
        @Override // android.os.Parcelable.Creator
        public final Cbottom2SheetDTO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            CbottomType valueOf3 = CbottomType.valueOf(parcel.readString());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i11 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i12 = 0;
                while (i12 != readInt) {
                    i12 = b.a(Cbottom2SheetDTO.class, parcel, arrayList, i12, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i13 = 0;
                while (i13 != readInt2) {
                    i13 = b.a(Cbottom2SheetDTO.class, parcel, arrayList2, i13, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i14 = 0;
                while (i14 != readInt3) {
                    i14 = b.a(Cbottom2SheetDTO.class, parcel, arrayList3, i14, 1);
                }
            }
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
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt4);
                int i15 = 0;
                while (i15 != readInt4) {
                    i15 = Sh.a.a(parcel, arrayList7, i15, 1);
                }
                arrayList4 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt5);
                int i16 = 0;
                while (i16 != readInt5) {
                    i16 = Sh.a.a(parcel, arrayList8, i16, 1);
                }
                arrayList5 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList6 = new ArrayList(readInt6);
                while (i11 != readInt6) {
                    i11 = Sh.a.a(parcel, arrayList6, i11, 1);
                }
            }
            return new Cbottom2SheetDTO(readString, valueOf3, valueOf4, arrayList, arrayList2, arrayList3, valueOf, valueOf2, arrayList4, arrayList5, arrayList6);
        }

        @Override // android.os.Parcelable.Creator
        public final Cbottom2SheetDTO[] newArray(int i11) {
            return new Cbottom2SheetDTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cbottom2SheetDTO(@NotNull String id2, @NotNull CbottomType type, Integer num, List<? extends F40.a> list, List<? extends F40.a> list2, List<? extends F40.a> list3, Boolean bool, Boolean bool2, List<Integer> list4, List<Integer> list5, List<Integer> list6) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.type = type;
        this.version = num;
        this.header = list;
        this.main = list2;
        this.footer = list3;
        this.dashHidden = bool;
        this.expanded = bool2;
        this.headerPaddings = list4;
        this.mainPaddings = list5;
        this.footerPaddings = list6;
    }

    public static /* synthetic */ Cbottom2SheetDTO copy$default(Cbottom2SheetDTO cbottom2SheetDTO, String str, CbottomType cbottomType, Integer num, List list, List list2, List list3, Boolean bool, Boolean bool2, List list4, List list5, List list6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cbottom2SheetDTO.id;
        }
        if ((i11 & 2) != 0) {
            cbottomType = cbottom2SheetDTO.type;
        }
        if ((i11 & 4) != 0) {
            num = cbottom2SheetDTO.version;
        }
        if ((i11 & 8) != 0) {
            list = cbottom2SheetDTO.header;
        }
        if ((i11 & 16) != 0) {
            list2 = cbottom2SheetDTO.main;
        }
        if ((i11 & 32) != 0) {
            list3 = cbottom2SheetDTO.footer;
        }
        if ((i11 & 64) != 0) {
            bool = cbottom2SheetDTO.dashHidden;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool2 = cbottom2SheetDTO.expanded;
        }
        if ((i11 & 256) != 0) {
            list4 = cbottom2SheetDTO.headerPaddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            list5 = cbottom2SheetDTO.mainPaddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            list6 = cbottom2SheetDTO.footerPaddings;
        }
        List list7 = list5;
        List list8 = list6;
        Boolean bool3 = bool2;
        List list9 = list4;
        List list10 = list3;
        Boolean bool4 = bool;
        List list11 = list2;
        Integer num2 = num;
        return cbottom2SheetDTO.copy(str, cbottomType, num2, list, list11, list10, bool4, bool3, list9, list7, list8);
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
        return this.header;
    }

    public final List<F40.a> component5() {
        return this.main;
    }

    public final List<F40.a> component6() {
        return this.footer;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getDashHidden() {
        return this.dashHidden;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getExpanded() {
        return this.expanded;
    }

    public final List<Integer> component9() {
        return this.headerPaddings;
    }

    @NotNull
    public final Cbottom2SheetDTO copy(@NotNull String id2, @NotNull CbottomType type, Integer version, List<? extends F40.a> header, List<? extends F40.a> main, List<? extends F40.a> footer, Boolean dashHidden, Boolean expanded, List<Integer> headerPaddings, List<Integer> mainPaddings, List<Integer> footerPaddings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Cbottom2SheetDTO(id2, type, version, header, main, footer, dashHidden, expanded, headerPaddings, mainPaddings, footerPaddings);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cbottom2SheetDTO)) {
            return false;
        }
        Cbottom2SheetDTO cbottom2SheetDTO = (Cbottom2SheetDTO) other;
        return Intrinsics.d(this.id, cbottom2SheetDTO.id) && this.type == cbottom2SheetDTO.type && Intrinsics.d(this.version, cbottom2SheetDTO.version) && Intrinsics.d(this.header, cbottom2SheetDTO.header) && Intrinsics.d(this.main, cbottom2SheetDTO.main) && Intrinsics.d(this.footer, cbottom2SheetDTO.footer) && Intrinsics.d(this.dashHidden, cbottom2SheetDTO.dashHidden) && Intrinsics.d(this.expanded, cbottom2SheetDTO.expanded) && Intrinsics.d(this.headerPaddings, cbottom2SheetDTO.headerPaddings) && Intrinsics.d(this.mainPaddings, cbottom2SheetDTO.mainPaddings) && Intrinsics.d(this.footerPaddings, cbottom2SheetDTO.footerPaddings);
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

    public final Boolean getDashHidden() {
        return this.dashHidden;
    }

    public final Boolean getExpanded() {
        return this.expanded;
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

    public final List<F40.a> getMain() {
        return this.main;
    }

    public final List<Integer> getMainPaddings() {
        return this.mainPaddings;
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
        List<F40.a> list = this.header;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<F40.a> list2 = this.main;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<F40.a> list3 = this.footer;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.dashHidden;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.expanded;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Integer> list4 = this.headerPaddings;
        int hashCode8 = (hashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Integer> list5 = this.mainPaddings;
        int hashCode9 = (hashCode8 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<Integer> list6 = this.footerPaddings;
        return hashCode9 + (list6 != null ? list6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        CbottomType cbottomType = this.type;
        Integer num = this.version;
        List<F40.a> list = this.header;
        List<F40.a> list2 = this.main;
        List<F40.a> list3 = this.footer;
        Boolean bool = this.dashHidden;
        Boolean bool2 = this.expanded;
        List<Integer> list4 = this.headerPaddings;
        List<Integer> list5 = this.mainPaddings;
        List<Integer> list6 = this.footerPaddings;
        StringBuilder sb2 = new StringBuilder("Cbottom2SheetDTO(id=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(cbottomType);
        sb2.append(", version=");
        sb2.append(num);
        sb2.append(", header=");
        sb2.append(list);
        sb2.append(", main=");
        C2616s.g(", footer=", ", dashHidden=", sb2, list2, list3);
        h.h(sb2, bool, ", expanded=", bool2, ", headerPaddings=");
        C2616s.g(", mainPaddings=", ", footerPaddings=", sb2, list4, list5);
        return C2618u.h(sb2, list6, ")");
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
        List<F40.a> list = this.header;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                dest.writeParcelable((Parcelable) c11.next(), flags);
            }
        }
        List<F40.a> list2 = this.main;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator c12 = J.c(dest, 1, list2);
            while (c12.hasNext()) {
                dest.writeParcelable((Parcelable) c12.next(), flags);
            }
        }
        List<F40.a> list3 = this.footer;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator c13 = J.c(dest, 1, list3);
            while (c13.hasNext()) {
                dest.writeParcelable((Parcelable) c13.next(), flags);
            }
        }
        Boolean bool = this.dashHidden;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Boolean bool2 = this.expanded;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        List<Integer> list4 = this.headerPaddings;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator c14 = J.c(dest, 1, list4);
            while (c14.hasNext()) {
                dest.writeInt(((Number) c14.next()).intValue());
            }
        }
        List<Integer> list5 = this.mainPaddings;
        if (list5 == null) {
            dest.writeInt(0);
        } else {
            Iterator c15 = J.c(dest, 1, list5);
            while (c15.hasNext()) {
                dest.writeInt(((Number) c15.next()).intValue());
            }
        }
        List<Integer> list6 = this.footerPaddings;
        if (list6 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator c16 = J.c(dest, 1, list6);
        while (c16.hasNext()) {
            dest.writeInt(((Number) c16.next()).intValue());
        }
    }

    public /* synthetic */ Cbottom2SheetDTO(String str, CbottomType cbottomType, Integer num, List list, List list2, List list3, Boolean bool, Boolean bool2, List list4, List list5, List list6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? CbottomType.SHEET : cbottomType, (i11 & 4) != 0 ? 1 : num, list, list2, list3, bool, bool2, list4, list5, list6);
    }
}
