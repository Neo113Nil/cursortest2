package ru.ozon.app.android.atoms.data.deprecated;

import B3.p;
import Bl.C2639a;
import C.J;
import De.C2859b;
import Ds.C2880a;
import GR.b;
import Kk.C3532b;
import Sc.InterfaceC3999a;
import T7.P;
import Ul.C4070a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@InterfaceC3999a
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003!\"#B?\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0001\u0003$%&¨\u0006'"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/Cell;", "Lru/ozon/uni/atoms/data/AtomDTO;", "type", "Lru/ozon/uni/atoms/data/Type;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "getSubtitle", "image", "getImage", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "CellDefault", "CellToggle", "CellRadio", "Lru/ozon/app/android/atoms/data/deprecated/Cell$CellDefault;", "Lru/ozon/app/android/atoms/data/deprecated/Cell$CellRadio;", "Lru/ozon/app/android/atoms/data/deprecated/Cell$CellToggle;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Cell extends AtomDTO {
    private final String context;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final Type type;

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020\u001eJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u001eHÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/Cell$CellDefault;", "Lru/ozon/app/android/atoms/data/deprecated/Cell;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "image", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "getImage", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CellDefault extends Cell {

        @NotNull
        public static final Parcelable.Creator<CellDefault> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final String image;
        private final OzonSpannableString subtitle;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<CellDefault> {
            @Override // android.os.Parcelable.Creator
            public final CellDefault createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                OzonSpannableString create = ozonSpannableStringParceler.create(parcel);
                OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel);
                String readString = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(CellDefault.class.getClassLoader());
                String readString2 = parcel.readString();
                TestInfo testInfo = (TestInfo) parcel.readParcelable(CellDefault.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(CellDefault.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new CellDefault(create, create2, readString, atomActionDTO, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final CellDefault[] newArray(int i11) {
                return new CellDefault[i11];
            }
        }

        public /* synthetic */ CellDefault(OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? null : ozonSpannableString2, (i11 & 4) != 0 ? null : str, atomActionDTO, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ CellDefault copy$default(CellDefault cellDefault, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = cellDefault.title;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString2 = cellDefault.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = cellDefault.image;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = cellDefault.action;
            }
            if ((i11 & 16) != 0) {
                str2 = cellDefault.context;
            }
            if ((i11 & 32) != 0) {
                testInfo = cellDefault.testInfo;
            }
            if ((i11 & 64) != 0) {
                map = cellDefault.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str3 = str2;
            String str4 = str;
            return cellDefault.copy(ozonSpannableString, ozonSpannableString2, str4, atomActionDTO, str3, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component6, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final CellDefault copy(@NotNull OzonSpannableString title, OzonSpannableString subtitle, String image, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new CellDefault(title, subtitle, image, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellDefault)) {
                return false;
            }
            CellDefault cellDefault = (CellDefault) other;
            return Intrinsics.d(this.title, cellDefault.title) && Intrinsics.d(this.subtitle, cellDefault.subtitle) && Intrinsics.d(this.image, cellDefault.image) && Intrinsics.d(this.action, cellDefault.action) && Intrinsics.d(this.context, cellDefault.context) && Intrinsics.d(this.testInfo, cellDefault.testInfo) && Intrinsics.d(this.trackingInfo, cellDefault.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        public String getImage() {
            return this.image;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_cell_default;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        public OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        @NotNull
        public OzonSpannableString getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            OzonSpannableString ozonSpannableString = this.subtitle;
            int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
            String str = this.image;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str2 = this.context;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode6 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.title;
            OzonSpannableString ozonSpannableString2 = this.subtitle;
            String str = this.image;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("CellDefault(title=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", subtitle=");
            sb2.append((Object) ozonSpannableString2);
            sb2.append(", image=");
            p.c(str, ", action=", ", context=", sb2, atomActionDTO);
            C4070a.b(sb2, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            ozonSpannableStringParceler.write(this.title, dest, flags);
            ozonSpannableStringParceler.write(this.subtitle, dest, flags);
            dest.writeString(this.image);
            dest.writeParcelable(this.action, flags);
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
        public CellDefault(@NotNull OzonSpannableString title, OzonSpannableString ozonSpannableString, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.CELL_DEFAULT, str2, testInfo, map, null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = ozonSpannableString;
            this.image = str;
            this.action = atomActionDTO;
            this.context = str2;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jq\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0006\u0010+\u001a\u00020!J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020!HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020!R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/Cell$CellRadio;", "Lru/ozon/app/android/atoms/data/deprecated/Cell;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "image", "", "subtitle", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getImage", "()Ljava/lang/String;", "getSubtitle", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CellRadio extends Cell {

        @NotNull
        public static final Parcelable.Creator<CellRadio> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final String image;
        private final boolean isSelected;
        private final OzonSpannableString subtitle;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<CellRadio> {
            @Override // android.os.Parcelable.Creator
            public final CellRadio createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                OzonSpannableString create = ozonSpannableStringParceler.create(parcel);
                String readString = parcel.readString();
                OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel);
                boolean z11 = parcel.readInt() != 0;
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(CellRadio.class.getClassLoader());
                String readString2 = parcel.readString();
                TestInfo testInfo = (TestInfo) parcel.readParcelable(CellRadio.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(CellRadio.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new CellRadio(create, readString, create2, z11, atomActionDTO, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final CellRadio[] newArray(int i11) {
                return new CellRadio[i11];
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ CellRadio(ru.ozon.uni.atoms.utils.OzonSpannableString r10, java.lang.String r11, ru.ozon.uni.atoms.utils.OzonSpannableString r12, boolean r13, ru.ozon.uni.atoms.data.AtomActionDTO r14, java.lang.String r15, ru.ozon.uni.atoms.data.TestInfo r16, java.util.Map r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
            /*
                r9 = this;
                r0 = r18
                r1 = r0 & 8
                if (r1 == 0) goto L7
                r13 = 0
            L7:
                r4 = r13
                r13 = r0 & 32
                r1 = 0
                if (r13 == 0) goto Lf
                r6 = r1
                goto L10
            Lf:
                r6 = r15
            L10:
                r13 = r0 & 64
                if (r13 == 0) goto L16
                r7 = r1
                goto L18
            L16:
                r7 = r16
            L18:
                r13 = r0 & 128(0x80, float:1.8E-43)
                if (r13 == 0) goto L23
                r8 = r1
                r0 = r9
                r2 = r11
                r3 = r12
                r5 = r14
                r1 = r10
                goto L2a
            L23:
                r8 = r17
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r5 = r14
            L2a:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.deprecated.Cell.CellRadio.<init>(ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, boolean, ru.ozon.uni.atoms.data.AtomActionDTO, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ CellRadio copy$default(CellRadio cellRadio, OzonSpannableString ozonSpannableString, String str, OzonSpannableString ozonSpannableString2, boolean z11, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = cellRadio.title;
            }
            if ((i11 & 2) != 0) {
                str = cellRadio.image;
            }
            if ((i11 & 4) != 0) {
                ozonSpannableString2 = cellRadio.subtitle;
            }
            if ((i11 & 8) != 0) {
                z11 = cellRadio.isSelected;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = cellRadio.action;
            }
            if ((i11 & 32) != 0) {
                str2 = cellRadio.context;
            }
            if ((i11 & 64) != 0) {
                testInfo = cellRadio.testInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = cellRadio.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str3 = str2;
            return cellRadio.copy(ozonSpannableString, str, ozonSpannableString2, z11, atomActionDTO2, str3, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component3, reason: from getter */
        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component7, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final CellRadio copy(@NotNull OzonSpannableString title, String image, OzonSpannableString subtitle, boolean isSelected, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new CellRadio(title, image, subtitle, isSelected, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellRadio)) {
                return false;
            }
            CellRadio cellRadio = (CellRadio) other;
            return Intrinsics.d(this.title, cellRadio.title) && Intrinsics.d(this.image, cellRadio.image) && Intrinsics.d(this.subtitle, cellRadio.subtitle) && this.isSelected == cellRadio.isSelected && Intrinsics.d(this.action, cellRadio.action) && Intrinsics.d(this.context, cellRadio.context) && Intrinsics.d(this.testInfo, cellRadio.testInfo) && Intrinsics.d(this.trackingInfo, cellRadio.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        public String getImage() {
            return this.image;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_cell_radio;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        public OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        @NotNull
        public OzonSpannableString getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.image;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            OzonSpannableString ozonSpannableString = this.subtitle;
            int a11 = C3532b.a((hashCode2 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.isSelected);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str2 = this.context;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.title;
            String str = this.image;
            OzonSpannableString ozonSpannableString2 = this.subtitle;
            boolean z11 = this.isSelected;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder f7 = b.f("CellRadio(title=", ozonSpannableString, ", image=", str, ", subtitle=");
            f7.append((Object) ozonSpannableString2);
            f7.append(", isSelected=");
            f7.append(z11);
            f7.append(", action=");
            HY.b.d(", context=", str2, ", testInfo=", f7, atomActionDTO);
            return C2639a.a(", trackingInfo=", ")", f7, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            ozonSpannableStringParceler.write(this.title, dest, flags);
            dest.writeString(this.image);
            ozonSpannableStringParceler.write(this.subtitle, dest, flags);
            dest.writeInt(this.isSelected ? 1 : 0);
            dest.writeParcelable(this.action, flags);
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
        public CellRadio(@NotNull OzonSpannableString title, String str, OzonSpannableString ozonSpannableString, boolean z11, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.CELL_RADIO, str2, testInfo, map, null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.image = str;
            this.subtitle = ozonSpannableString;
            this.isSelected = z11;
            this.action = atomActionDTO;
            this.context = str2;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J{\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0006\u0010-\u001a\u00020\"J\u0013\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\"HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00068"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/Cell$CellToggle;", "Lru/ozon/app/android/atoms/data/deprecated/Cell;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "image", "", "isSelected", "", "isSelect", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "getImage", "()Ljava/lang/String;", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CellToggle extends Cell {

        @NotNull
        public static final Parcelable.Creator<CellToggle> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final String image;
        private final boolean isSelect;
        private final boolean isSelected;
        private final OzonSpannableString subtitle;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<CellToggle> {
            @Override // android.os.Parcelable.Creator
            public final CellToggle createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                String readString = parcel2.readString();
                boolean z11 = parcel2.readInt() != 0;
                boolean z12 = parcel2.readInt() != 0;
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellToggle.class.getClassLoader());
                String readString2 = parcel2.readString();
                TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellToggle.class.getClassLoader());
                if (parcel2.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel2.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(CellToggle.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                        parcel2 = parcel;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new CellToggle(create, create2, readString, z11, z12, atomActionDTO, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final CellToggle[] newArray(int i11) {
                return new CellToggle[i11];
            }
        }

        public /* synthetic */ CellToggle(OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, boolean z11, boolean z12, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, ozonSpannableString2, str, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, atomActionDTO, (i11 & 64) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo, (i11 & 256) != 0 ? null : map);
        }

        public static /* synthetic */ CellToggle copy$default(CellToggle cellToggle, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, boolean z11, boolean z12, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = cellToggle.title;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString2 = cellToggle.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = cellToggle.image;
            }
            if ((i11 & 8) != 0) {
                z11 = cellToggle.isSelected;
            }
            if ((i11 & 16) != 0) {
                z12 = cellToggle.isSelect;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = cellToggle.action;
            }
            if ((i11 & 64) != 0) {
                str2 = cellToggle.context;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                testInfo = cellToggle.testInfo;
            }
            if ((i11 & 256) != 0) {
                map = cellToggle.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str3 = str2;
            boolean z13 = z12;
            String str4 = str;
            return cellToggle.copy(ozonSpannableString, ozonSpannableString2, str4, z11, z13, atomActionDTO2, str3, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsSelect() {
            return this.isSelect;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component7, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component8, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final CellToggle copy(@NotNull OzonSpannableString title, OzonSpannableString subtitle, String image, boolean isSelected, boolean isSelect, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new CellToggle(title, subtitle, image, isSelected, isSelect, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellToggle)) {
                return false;
            }
            CellToggle cellToggle = (CellToggle) other;
            return Intrinsics.d(this.title, cellToggle.title) && Intrinsics.d(this.subtitle, cellToggle.subtitle) && Intrinsics.d(this.image, cellToggle.image) && this.isSelected == cellToggle.isSelected && this.isSelect == cellToggle.isSelect && Intrinsics.d(this.action, cellToggle.action) && Intrinsics.d(this.context, cellToggle.context) && Intrinsics.d(this.testInfo, cellToggle.testInfo) && Intrinsics.d(this.trackingInfo, cellToggle.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        public String getImage() {
            return this.image;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_cell_toggle;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        public OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell
        @NotNull
        public OzonSpannableString getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.Cell, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            OzonSpannableString ozonSpannableString = this.subtitle;
            int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
            String str = this.image;
            int a11 = C3532b.a(C3532b.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSelected), 31, this.isSelect);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str2 = this.context;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelect() {
            return this.isSelect;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.title;
            OzonSpannableString ozonSpannableString2 = this.subtitle;
            String str = this.image;
            boolean z11 = this.isSelected;
            boolean z12 = this.isSelect;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("CellToggle(title=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", subtitle=");
            sb2.append((Object) ozonSpannableString2);
            sb2.append(", image=");
            C2880a.c(str, ", isSelected=", ", isSelect=", sb2, z11);
            sb2.append(z12);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", context=");
            C4070a.b(sb2, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            ozonSpannableStringParceler.write(this.title, dest, flags);
            ozonSpannableStringParceler.write(this.subtitle, dest, flags);
            dest.writeString(this.image);
            dest.writeInt(this.isSelected ? 1 : 0);
            dest.writeInt(this.isSelect ? 1 : 0);
            dest.writeParcelable(this.action, flags);
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
        public CellToggle(@NotNull OzonSpannableString title, OzonSpannableString ozonSpannableString, String str, boolean z11, boolean z12, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.CELL_TOGGLE, str2, testInfo, map, null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = ozonSpannableString;
            this.image = str;
            this.isSelected = z11;
            this.isSelect = z12;
            this.action = atomActionDTO;
            this.context = str2;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    public /* synthetic */ Cell(Type type, String str, TestInfo testInfo, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, testInfo, map);
    }

    public abstract AtomActionDTO getAction();

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public abstract String getImage();

    public abstract OzonSpannableString getSubtitle();

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public abstract OzonSpannableString getTitle();

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public /* synthetic */ Cell(Type type, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, (i11 & 4) != 0 ? null : testInfo, (i11 & 8) != 0 ? null : map, null);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    @NotNull
    public Type getType() {
        return this.type;
    }

    private Cell(Type type, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(type, str, map, testInfo);
        this.type = type;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
