package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import B4.V;
import B90.C2616s;
import B90.C2618u;
import Bi.b;
import C.J;
import D40.c;
import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
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
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0097\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010&J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010&J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010&J²\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00101\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u001a\u00104\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010#R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b<\u0010\u001fR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010&R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b?\u0010&R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b@\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010*R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\bC\u0010&R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\bD\u0010&R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\bE\u0010&R\u001c\u0010G\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010&¨\u0006H"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2PdfDTO;", "Landroid/os/Parcelable;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;", "", "id", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "type", "", "version", ImagesContract.URL, "", "LF40/a;", CommentV3DTO.HEADER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, "main", "", "canClose", "mainPaddings", "footerPaddings", "headerPaddings", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2PdfDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "getType", "Ljava/lang/Integer;", "getVersion", "getUrl", "Ljava/util/List;", "getHeader", "getFooter", "getMain", "Ljava/lang/Boolean;", "getCanClose", "getMainPaddings", "getFooterPaddings", "getHeaderPaddings", "getAllWidgets", "allWidgets", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Cbottom2PdfDTO implements Parcelable, ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a {

    @NotNull
    public static final Parcelable.Creator<Cbottom2PdfDTO> CREATOR = new a();

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

    @i(name = "main")
    private final List<F40.a> main;

    @i(name = "mainPaddings")
    private final List<Integer> mainPaddings;

    @i(name = "type")
    @NotNull
    private final CbottomType type;

    @i(name = ImagesContract.URL)
    @NotNull
    private final String url;

    @i(name = "version")
    private final Integer version;

    public static final class a implements Parcelable.Creator<Cbottom2PdfDTO> {
        @Override // android.os.Parcelable.Creator
        public final Cbottom2PdfDTO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            CbottomType valueOf2 = CbottomType.valueOf(parcel.readString());
            ArrayList arrayList6 = null;
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            int i11 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i12 = 0;
                while (i12 != readInt) {
                    i12 = b.a(Cbottom2PdfDTO.class, parcel, arrayList, i12, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i13 = 0;
                while (i13 != readInt2) {
                    i13 = b.a(Cbottom2PdfDTO.class, parcel, arrayList2, i13, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i14 = 0;
                while (i14 != readInt3) {
                    i14 = b.a(Cbottom2PdfDTO.class, parcel, arrayList3, i14, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i15 = 0;
                while (i15 != readInt4) {
                    i15 = Sh.a.a(parcel, arrayList4, i15, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                int i16 = 0;
                while (i16 != readInt5) {
                    i16 = Sh.a.a(parcel, arrayList5, i16, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt6);
                while (i11 != readInt6) {
                    i11 = Sh.a.a(parcel, arrayList7, i11, 1);
                }
                arrayList6 = arrayList7;
            }
            return new Cbottom2PdfDTO(readString, valueOf2, valueOf3, readString2, arrayList, arrayList2, arrayList3, valueOf, arrayList4, arrayList5, arrayList6);
        }

        @Override // android.os.Parcelable.Creator
        public final Cbottom2PdfDTO[] newArray(int i11) {
            return new Cbottom2PdfDTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cbottom2PdfDTO(@NotNull String id2, @NotNull CbottomType type, Integer num, @NotNull String url, List<? extends F40.a> list, List<? extends F40.a> list2, List<? extends F40.a> list3, Boolean bool, List<Integer> list4, List<Integer> list5, List<Integer> list6) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = id2;
        this.type = type;
        this.version = num;
        this.url = url;
        this.header = list;
        this.footer = list2;
        this.main = list3;
        this.canClose = bool;
        this.mainPaddings = list4;
        this.footerPaddings = list5;
        this.headerPaddings = list6;
    }

    public static /* synthetic */ Cbottom2PdfDTO copy$default(Cbottom2PdfDTO cbottom2PdfDTO, String str, CbottomType cbottomType, Integer num, String str2, List list, List list2, List list3, Boolean bool, List list4, List list5, List list6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cbottom2PdfDTO.id;
        }
        if ((i11 & 2) != 0) {
            cbottomType = cbottom2PdfDTO.type;
        }
        if ((i11 & 4) != 0) {
            num = cbottom2PdfDTO.version;
        }
        if ((i11 & 8) != 0) {
            str2 = cbottom2PdfDTO.url;
        }
        if ((i11 & 16) != 0) {
            list = cbottom2PdfDTO.header;
        }
        if ((i11 & 32) != 0) {
            list2 = cbottom2PdfDTO.footer;
        }
        if ((i11 & 64) != 0) {
            list3 = cbottom2PdfDTO.main;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool = cbottom2PdfDTO.canClose;
        }
        if ((i11 & 256) != 0) {
            list4 = cbottom2PdfDTO.mainPaddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            list5 = cbottom2PdfDTO.footerPaddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            list6 = cbottom2PdfDTO.headerPaddings;
        }
        List list7 = list5;
        List list8 = list6;
        Boolean bool2 = bool;
        List list9 = list4;
        List list10 = list2;
        List list11 = list3;
        List list12 = list;
        Integer num2 = num;
        return cbottom2PdfDTO.copy(str, cbottomType, num2, str2, list12, list10, list11, bool2, list9, list7, list8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<Integer> component10() {
        return this.footerPaddings;
    }

    public final List<Integer> component11() {
        return this.headerPaddings;
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

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final List<F40.a> component5() {
        return this.header;
    }

    public final List<F40.a> component6() {
        return this.footer;
    }

    public final List<F40.a> component7() {
        return this.main;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getCanClose() {
        return this.canClose;
    }

    public final List<Integer> component9() {
        return this.mainPaddings;
    }

    @NotNull
    public final Cbottom2PdfDTO copy(@NotNull String id2, @NotNull CbottomType type, Integer version, @NotNull String url, List<? extends F40.a> header, List<? extends F40.a> footer, List<? extends F40.a> main, Boolean canClose, List<Integer> mainPaddings, List<Integer> footerPaddings, List<Integer> headerPaddings) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        return new Cbottom2PdfDTO(id2, type, version, url, header, footer, main, canClose, mainPaddings, footerPaddings, headerPaddings);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cbottom2PdfDTO)) {
            return false;
        }
        Cbottom2PdfDTO cbottom2PdfDTO = (Cbottom2PdfDTO) other;
        return Intrinsics.d(this.id, cbottom2PdfDTO.id) && this.type == cbottom2PdfDTO.type && Intrinsics.d(this.version, cbottom2PdfDTO.version) && Intrinsics.d(this.url, cbottom2PdfDTO.url) && Intrinsics.d(this.header, cbottom2PdfDTO.header) && Intrinsics.d(this.footer, cbottom2PdfDTO.footer) && Intrinsics.d(this.main, cbottom2PdfDTO.main) && Intrinsics.d(this.canClose, cbottom2PdfDTO.canClose) && Intrinsics.d(this.mainPaddings, cbottom2PdfDTO.mainPaddings) && Intrinsics.d(this.footerPaddings, cbottom2PdfDTO.footerPaddings) && Intrinsics.d(this.headerPaddings, cbottom2PdfDTO.headerPaddings);
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

    @NotNull
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
        int a11 = g.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.url);
        List<F40.a> list = this.header;
        int hashCode2 = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        List<F40.a> list2 = this.footer;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<F40.a> list3 = this.main;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.canClose;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Integer> list4 = this.mainPaddings;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Integer> list5 = this.footerPaddings;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<Integer> list6 = this.headerPaddings;
        return hashCode7 + (list6 != null ? list6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        CbottomType cbottomType = this.type;
        Integer num = this.version;
        String str2 = this.url;
        List<F40.a> list = this.header;
        List<F40.a> list2 = this.footer;
        List<F40.a> list3 = this.main;
        Boolean bool = this.canClose;
        List<Integer> list4 = this.mainPaddings;
        List<Integer> list5 = this.footerPaddings;
        List<Integer> list6 = this.headerPaddings;
        StringBuilder sb2 = new StringBuilder("Cbottom2PdfDTO(id=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(cbottomType);
        sb2.append(", version=");
        V.f(num, ", url=", str2, ", header=", sb2);
        C2616s.g(", footer=", ", main=", sb2, list, list2);
        sb2.append(list3);
        sb2.append(", canClose=");
        sb2.append(bool);
        sb2.append(", mainPaddings=");
        C2616s.g(", footerPaddings=", ", headerPaddings=", sb2, list4, list5);
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
        dest.writeString(this.url);
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
        Boolean bool = this.canClose;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
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
            return;
        }
        Iterator c16 = J.c(dest, 1, list6);
        while (c16.hasNext()) {
            dest.writeInt(((Number) c16.next()).intValue());
        }
    }

    public /* synthetic */ Cbottom2PdfDTO(String str, CbottomType cbottomType, Integer num, String str2, List list, List list2, List list3, Boolean bool, List list4, List list5, List list6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? CbottomType.PDF : cbottomType, (i11 & 4) != 0 ? 1 : num, str2, list, list2, list3, bool, list4, list5, list6);
    }
}
