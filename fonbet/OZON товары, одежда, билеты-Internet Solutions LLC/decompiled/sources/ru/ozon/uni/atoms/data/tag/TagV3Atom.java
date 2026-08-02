package ru.ozon.uni.atoms.data.tag;

import Bl.C2639a;
import C.J;
import De.C2859b;
import Kk.C3532b;
import N3.C3660k;
import Ql.c;
import Sc.InterfaceC3999a;
import T7.P;
import Ul.C4070a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.AtomType;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.TestInfo;

@InterfaceC3999a
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B?\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0005\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/uni/atoms/data/tag/TagV3Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "type", "Lru/ozon/uni/atoms/data/AtomType;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomType;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getType", "()Lru/ozon/uni/atoms/data/AtomType;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "TagAtom", "LinkTagAtom", "SmallLinkTagAtom", "CrossTagAtom", "CrossColorTagAtom", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossColorTagAtom;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossTagAtom;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$LinkTagAtom;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$SmallLinkTagAtom;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class TagV3Atom extends AtomDTO {
    public static final int $stable = 8;
    private final String context;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final AtomType type;

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0018HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossColorTagAtom;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom;", "hexColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getHexColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CrossColorTagAtom extends TagV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<CrossColorTagAtom> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;

        @NotNull
        private final String hexColor;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<CrossColorTagAtom> {
            @Override // android.os.Parcelable.Creator
            public final CrossColorTagAtom createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(CrossColorTagAtom.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new CrossColorTagAtom(readString, createFromParcel, readString2, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final CrossColorTagAtom[] newArray(int i11) {
                return new CrossColorTagAtom[i11];
            }
        }

        public /* synthetic */ CrossColorTagAtom(String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map);
        }

        public static /* synthetic */ CrossColorTagAtom copy$default(CrossColorTagAtom crossColorTagAtom, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = crossColorTagAtom.hexColor;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = crossColorTagAtom.action;
            }
            if ((i11 & 4) != 0) {
                str2 = crossColorTagAtom.context;
            }
            if ((i11 & 8) != 0) {
                testInfo = crossColorTagAtom.testInfo;
            }
            if ((i11 & 16) != 0) {
                map = crossColorTagAtom.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return crossColorTagAtom.copy(str, atomActionDTO, str3, testInfo, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getHexColor() {
            return this.hexColor;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final CrossColorTagAtom copy(@NotNull String hexColor, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(hexColor, "hexColor");
            return new CrossColorTagAtom(hexColor, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrossColorTagAtom)) {
                return false;
            }
            CrossColorTagAtom crossColorTagAtom = (CrossColorTagAtom) other;
            return Intrinsics.d(this.hexColor, crossColorTagAtom.hexColor) && Intrinsics.d(this.action, crossColorTagAtom.action) && Intrinsics.d(this.context, crossColorTagAtom.context) && Intrinsics.d(this.testInfo, crossColorTagAtom.testInfo) && Intrinsics.d(this.trackingInfo, crossColorTagAtom.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @NotNull
        public final String getHexColor() {
            return this.hexColor;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_cross_color_tag_atom;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.hexColor.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.hexColor;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("CrossColorTagAtom(hexColor=", str, ", action=", atomActionDTO, ", context=");
            C4070a.b(c11, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.hexColor);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
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
        public CrossColorTagAtom(@NotNull String hexColor, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.CROSS_COLOR_TAG, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(hexColor, "hexColor");
            this.hexColor = hexColor;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0018HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lru/ozon/uni/atoms/data/tag/TagV3Atom$LinkTagAtom;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom;", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class LinkTagAtom extends TagV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<LinkTagAtom> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final TestInfo testInfo;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<LinkTagAtom> {
            @Override // android.os.Parcelable.Creator
            public final LinkTagAtom createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(LinkTagAtom.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new LinkTagAtom(readString, createFromParcel, readString2, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final LinkTagAtom[] newArray(int i11) {
                return new LinkTagAtom[i11];
            }
        }

        public /* synthetic */ LinkTagAtom(String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map);
        }

        public static /* synthetic */ LinkTagAtom copy$default(LinkTagAtom linkTagAtom, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = linkTagAtom.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = linkTagAtom.action;
            }
            if ((i11 & 4) != 0) {
                str2 = linkTagAtom.context;
            }
            if ((i11 & 8) != 0) {
                testInfo = linkTagAtom.testInfo;
            }
            if ((i11 & 16) != 0) {
                map = linkTagAtom.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return linkTagAtom.copy(str, atomActionDTO, str3, testInfo, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final LinkTagAtom copy(@NotNull String text, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new LinkTagAtom(text, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkTagAtom)) {
                return false;
            }
            LinkTagAtom linkTagAtom = (LinkTagAtom) other;
            return Intrinsics.d(this.text, linkTagAtom.text) && Intrinsics.d(this.action, linkTagAtom.action) && Intrinsics.d(this.context, linkTagAtom.context) && Intrinsics.d(this.testInfo, linkTagAtom.testInfo) && Intrinsics.d(this.trackingInfo, linkTagAtom.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_link_tag_atom;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("LinkTagAtom(text=", str, ", action=", atomActionDTO, ", context=");
            C4070a.b(c11, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
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
        public LinkTagAtom(@NotNull String text, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.LINK_TAG, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0018HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lru/ozon/uni/atoms/data/tag/TagV3Atom$SmallLinkTagAtom;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom;", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SmallLinkTagAtom extends TagV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<SmallLinkTagAtom> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final TestInfo testInfo;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<SmallLinkTagAtom> {
            @Override // android.os.Parcelable.Creator
            public final SmallLinkTagAtom createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(SmallLinkTagAtom.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new SmallLinkTagAtom(readString, createFromParcel, readString2, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final SmallLinkTagAtom[] newArray(int i11) {
                return new SmallLinkTagAtom[i11];
            }
        }

        public /* synthetic */ SmallLinkTagAtom(String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map);
        }

        public static /* synthetic */ SmallLinkTagAtom copy$default(SmallLinkTagAtom smallLinkTagAtom, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = smallLinkTagAtom.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = smallLinkTagAtom.action;
            }
            if ((i11 & 4) != 0) {
                str2 = smallLinkTagAtom.context;
            }
            if ((i11 & 8) != 0) {
                testInfo = smallLinkTagAtom.testInfo;
            }
            if ((i11 & 16) != 0) {
                map = smallLinkTagAtom.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return smallLinkTagAtom.copy(str, atomActionDTO, str3, testInfo, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final SmallLinkTagAtom copy(@NotNull String text, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new SmallLinkTagAtom(text, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmallLinkTagAtom)) {
                return false;
            }
            SmallLinkTagAtom smallLinkTagAtom = (SmallLinkTagAtom) other;
            return Intrinsics.d(this.text, smallLinkTagAtom.text) && Intrinsics.d(this.action, smallLinkTagAtom.action) && Intrinsics.d(this.context, smallLinkTagAtom.context) && Intrinsics.d(this.testInfo, smallLinkTagAtom.testInfo) && Intrinsics.d(this.trackingInfo, smallLinkTagAtom.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_small_link_tag_atom;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("SmallLinkTagAtom(text=", str, ", action=", atomActionDTO, ", context=");
            C4070a.b(c11, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
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
        public SmallLinkTagAtom(@NotNull String text, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.SMALL_LINK_TAG, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    public /* synthetic */ TagV3Atom(AtomType atomType, String str, TestInfo testInfo, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomType, str, testInfo, map);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    @NotNull
    public AtomType getType() {
        return this.type;
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00019B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u008b\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0006\u0010-\u001a\u00020\"J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\"HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001a¨\u0006:"}, d2 = {"Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossTagAtom;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom;", "text", "", "icon", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "crossAction", "crossTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "theme", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossTagAtom$ThemeType;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossTagAtom$ThemeType;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getIcon", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getCrossAction", "getCrossTrackingInfo", "()Ljava/util/Map;", "getTheme", "()Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossTagAtom$ThemeType;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ThemeType", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CrossTagAtom extends TagV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<CrossTagAtom> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final AtomActionDTO crossAction;
        private final Map<String, TokenizedTrackingInfo> crossTrackingInfo;
        private final String icon;
        private final TestInfo testInfo;

        @NotNull
        private final String text;
        private final ThemeType theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<CrossTagAtom> {
            @Override // android.os.Parcelable.Creator
            public final CrossTagAtom createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                ThemeType valueOf;
                LinkedHashMap linkedHashMap2;
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                String readString = parcel2.readString();
                String readString2 = parcel2.readString();
                AtomActionDTO createFromParcel = parcel2.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel2);
                AtomActionDTO createFromParcel2 = parcel2.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel2);
                if (parcel2.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel2.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11 = C2859b.a(CrossTagAtom.class, parcel2, linkedHashMap3, parcel2.readString(), i11, 1)) {
                    }
                    linkedHashMap = linkedHashMap3;
                }
                if (parcel2.readInt() == 0) {
                    linkedHashMap2 = null;
                    valueOf = null;
                } else {
                    valueOf = ThemeType.valueOf(parcel2.readString());
                    linkedHashMap2 = null;
                }
                String readString3 = parcel2.readString();
                TestInfo testInfo = (TestInfo) (parcel2.readInt() == 0 ? linkedHashMap2 : TestInfo.CREATOR.createFromParcel(parcel2));
                if (parcel2.readInt() != 0) {
                    int readInt2 = parcel2.readInt();
                    linkedHashMap2 = new LinkedHashMap(readInt2);
                    int i12 = 0;
                    while (i12 != readInt2) {
                        i12 = C2859b.a(CrossTagAtom.class, parcel2, linkedHashMap2, parcel2.readString(), i12, 1);
                        parcel2 = parcel;
                    }
                }
                return new CrossTagAtom(readString, readString2, createFromParcel, createFromParcel2, linkedHashMap, valueOf, readString3, testInfo, linkedHashMap2);
            }

            @Override // android.os.Parcelable.Creator
            public final CrossTagAtom[] newArray(int i11) {
                return new CrossTagAtom[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossTagAtom$ThemeType;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_INVALID", "THEME_TYPE_PRIMARY", "THEME_TYPE_SECONDARY", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ThemeType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ThemeType[] $VALUES;

            @i(name = "THEME_TYPE_INVALID")
            public static final ThemeType THEME_TYPE_INVALID = new ThemeType("THEME_TYPE_INVALID", 0);

            @i(name = "THEME_TYPE_PRIMARY")
            public static final ThemeType THEME_TYPE_PRIMARY = new ThemeType("THEME_TYPE_PRIMARY", 1);

            @i(name = "THEME_TYPE_SECONDARY")
            public static final ThemeType THEME_TYPE_SECONDARY = new ThemeType("THEME_TYPE_SECONDARY", 2);

            private static final /* synthetic */ ThemeType[] $values() {
                return new ThemeType[]{THEME_TYPE_INVALID, THEME_TYPE_PRIMARY, THEME_TYPE_SECONDARY};
            }

            static {
                ThemeType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ThemeType(String str, int i11) {
            }

            @NotNull
            public static a<ThemeType> getEntries() {
                return $ENTRIES;
            }

            public static ThemeType valueOf(String str) {
                return (ThemeType) Enum.valueOf(ThemeType.class, str);
            }

            public static ThemeType[] values() {
                return (ThemeType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ CrossTagAtom(String str, String str2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map, ThemeType themeType, String str3, TestInfo testInfo, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, atomActionDTO, atomActionDTO2, (i11 & 16) != 0 ? null : map, (i11 & 32) != 0 ? ThemeType.THEME_TYPE_PRIMARY : themeType, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo, (i11 & 256) != 0 ? null : map2);
        }

        public static /* synthetic */ CrossTagAtom copy$default(CrossTagAtom crossTagAtom, String str, String str2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map, ThemeType themeType, String str3, TestInfo testInfo, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = crossTagAtom.text;
            }
            if ((i11 & 2) != 0) {
                str2 = crossTagAtom.icon;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = crossTagAtom.action;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO2 = crossTagAtom.crossAction;
            }
            if ((i11 & 16) != 0) {
                map = crossTagAtom.crossTrackingInfo;
            }
            if ((i11 & 32) != 0) {
                themeType = crossTagAtom.theme;
            }
            if ((i11 & 64) != 0) {
                str3 = crossTagAtom.context;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                testInfo = crossTagAtom.testInfo;
            }
            if ((i11 & 256) != 0) {
                map2 = crossTagAtom.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map3 = map2;
            ThemeType themeType2 = themeType;
            String str4 = str3;
            Map map4 = map;
            AtomActionDTO atomActionDTO3 = atomActionDTO;
            return crossTagAtom.copy(str, str2, atomActionDTO3, atomActionDTO2, map4, themeType2, str4, testInfo2, map3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getCrossAction() {
            return this.crossAction;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.crossTrackingInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final ThemeType getTheme() {
            return this.theme;
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
        public final CrossTagAtom copy(@NotNull String text, String icon, AtomActionDTO action, AtomActionDTO crossAction, Map<String, TokenizedTrackingInfo> crossTrackingInfo, ThemeType theme, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new CrossTagAtom(text, icon, action, crossAction, crossTrackingInfo, theme, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrossTagAtom)) {
                return false;
            }
            CrossTagAtom crossTagAtom = (CrossTagAtom) other;
            return Intrinsics.d(this.text, crossTagAtom.text) && Intrinsics.d(this.icon, crossTagAtom.icon) && Intrinsics.d(this.action, crossTagAtom.action) && Intrinsics.d(this.crossAction, crossTagAtom.crossAction) && Intrinsics.d(this.crossTrackingInfo, crossTagAtom.crossTrackingInfo) && this.theme == crossTagAtom.theme && Intrinsics.d(this.context, crossTagAtom.context) && Intrinsics.d(this.testInfo, crossTagAtom.testInfo) && Intrinsics.d(this.trackingInfo, crossTagAtom.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final AtomActionDTO getCrossAction() {
            return this.crossAction;
        }

        public final Map<String, TokenizedTrackingInfo> getCrossTrackingInfo() {
            return this.crossTrackingInfo;
        }

        public final String getIcon() {
            return this.icon;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_cross_tag_atom;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final ThemeType getTheme() {
            return this.theme;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.icon;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO2 = this.crossAction;
            int hashCode4 = (hashCode3 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.crossTrackingInfo;
            int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            ThemeType themeType = this.theme;
            int hashCode6 = (hashCode5 + (themeType == null ? 0 : themeType.hashCode())) * 31;
            String str2 = this.context;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode8 = (hashCode7 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            return hashCode8 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            AtomActionDTO atomActionDTO2 = this.crossAction;
            Map<String, TokenizedTrackingInfo> map = this.crossTrackingInfo;
            ThemeType themeType = this.theme;
            String str3 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            StringBuilder d11 = C3660k.d("CrossTagAtom(text=", str, ", icon=", str2, ", action=");
            d11.append(atomActionDTO);
            d11.append(", crossAction=");
            d11.append(atomActionDTO2);
            d11.append(", crossTrackingInfo=");
            d11.append(map);
            d11.append(", theme=");
            d11.append(themeType);
            d11.append(", context=");
            C4070a.b(d11, str3, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(d11, map2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeString(this.icon);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            AtomActionDTO atomActionDTO2 = this.crossAction;
            if (atomActionDTO2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO2.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.crossTrackingInfo;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }
            ThemeType themeType = this.theme;
            if (themeType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(themeType.name());
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            if (map2 == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e12 = J.e(map2, dest, 1);
            while (e12.hasNext()) {
                Map.Entry entry2 = (Map.Entry) e12.next();
                dest.writeString((String) entry2.getKey());
                dest.writeParcelable((Parcelable) entry2.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CrossTagAtom(@NotNull String text, String str, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map<String, TokenizedTrackingInfo> map, ThemeType themeType, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map2) {
            super(AtomTypeImpl.CROSS_TAG, str2, testInfo, map2, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = str;
            this.action = atomActionDTO;
            this.crossAction = atomActionDTO2;
            this.crossTrackingInfo = map;
            this.theme = themeType;
            this.context = str2;
            this.testInfo = testInfo;
            this.trackingInfo = map2;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<B\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010$\u001a\u00020%H\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u008b\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0006\u00101\u001a\u00020%J\u0013\u00102\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020%HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020%R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006="}, d2 = {"Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom;", "text", "", "icon", "theme", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom$ThemeType;", "count", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tintColor", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom$ThemeType;Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getIcon", "getTheme", "()Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom$ThemeType;", "getCount", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTintColor", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ThemeType", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TagAtom extends TagV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<TagAtom> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final String count;
        private final String icon;
        private final boolean isSelected;
        private final TestInfo testInfo;
        private final String text;
        private final ThemeType theme;
        private final String tintColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<TagAtom> {
            @Override // android.os.Parcelable.Creator
            public final TagAtom createFromParcel(Parcel parcel) {
                String str;
                boolean z11;
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                String readString = parcel2.readString();
                String readString2 = parcel2.readString();
                LinkedHashMap linkedHashMap = null;
                ThemeType valueOf = parcel2.readInt() == 0 ? null : ThemeType.valueOf(parcel2.readString());
                String readString3 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    str = readString;
                    z11 = true;
                } else {
                    str = readString;
                    z11 = false;
                }
                AtomActionDTO createFromParcel = parcel2.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel2);
                ThemeType themeType = valueOf;
                String readString4 = parcel2.readString();
                String readString5 = parcel2.readString();
                TestInfo createFromParcel2 = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
                if (parcel2.readInt() != 0) {
                    int readInt = parcel2.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(TagAtom.class, parcel2, linkedHashMap, parcel2.readString(), i11, 1);
                        parcel2 = parcel;
                    }
                }
                return new TagAtom(str, readString2, themeType, readString3, z11, createFromParcel, readString4, readString5, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final TagAtom[] newArray(int i11) {
                return new TagAtom[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom$ThemeType;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_INVALID", "THEME_TYPE_DEFAULT", "THEME_TYPE_DELIVERY", "THEME_TYPE_TRUST_FACTOR", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ThemeType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ThemeType[] $VALUES;

            @i(name = "THEME_TYPE_INVALID")
            public static final ThemeType THEME_TYPE_INVALID = new ThemeType("THEME_TYPE_INVALID", 0);

            @i(name = "THEME_TYPE_DEFAULT")
            public static final ThemeType THEME_TYPE_DEFAULT = new ThemeType("THEME_TYPE_DEFAULT", 1);

            @i(name = "THEME_TYPE_DELIVERY")
            public static final ThemeType THEME_TYPE_DELIVERY = new ThemeType("THEME_TYPE_DELIVERY", 2);

            @i(name = "THEME_TYPE_TRUST_FACTOR")
            public static final ThemeType THEME_TYPE_TRUST_FACTOR = new ThemeType("THEME_TYPE_TRUST_FACTOR", 3);

            private static final /* synthetic */ ThemeType[] $values() {
                return new ThemeType[]{THEME_TYPE_INVALID, THEME_TYPE_DEFAULT, THEME_TYPE_DELIVERY, THEME_TYPE_TRUST_FACTOR};
            }

            static {
                ThemeType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ThemeType(String str, int i11) {
            }

            @NotNull
            public static a<ThemeType> getEntries() {
                return $ENTRIES;
            }

            public static ThemeType valueOf(String str) {
                return (ThemeType) Enum.valueOf(ThemeType.class, str);
            }

            public static ThemeType[] values() {
                return (ThemeType[]) $VALUES.clone();
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ TagAtom(java.lang.String r14, java.lang.String r15, ru.ozon.uni.atoms.data.tag.TagV3Atom.TagAtom.ThemeType r16, java.lang.String r17, boolean r18, ru.ozon.uni.atoms.data.AtomActionDTO r19, java.lang.String r20, java.lang.String r21, ru.ozon.uni.atoms.data.TestInfo r22, java.util.Map r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
            /*
                r13 = this;
                r0 = r24
                r1 = r0 & 4
                if (r1 == 0) goto La
                ru.ozon.uni.atoms.data.tag.TagV3Atom$TagAtom$ThemeType r1 = ru.ozon.uni.atoms.data.tag.TagV3Atom.TagAtom.ThemeType.THEME_TYPE_DEFAULT
                r5 = r1
                goto Lc
            La:
                r5 = r16
            Lc:
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L13
                r6 = r2
                goto L15
            L13:
                r6 = r17
            L15:
                r1 = r0 & 16
                if (r1 == 0) goto L1c
                r1 = 0
                r7 = r1
                goto L1e
            L1c:
                r7 = r18
            L1e:
                r1 = r0 & 32
                if (r1 == 0) goto L24
                r8 = r2
                goto L26
            L24:
                r8 = r19
            L26:
                r1 = r0 & 64
                if (r1 == 0) goto L2c
                r9 = r2
                goto L2e
            L2c:
                r9 = r20
            L2e:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L34
                r10 = r2
                goto L36
            L34:
                r10 = r21
            L36:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L3c
                r11 = r2
                goto L3e
            L3c:
                r11 = r22
            L3e:
                r0 = r0 & 512(0x200, float:7.17E-43)
                if (r0 == 0) goto L47
                r12 = r2
                r3 = r14
                r4 = r15
                r2 = r13
                goto L4c
            L47:
                r12 = r23
                r2 = r13
                r3 = r14
                r4 = r15
            L4c:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.tag.TagV3Atom.TagAtom.<init>(java.lang.String, java.lang.String, ru.ozon.uni.atoms.data.tag.TagV3Atom$TagAtom$ThemeType, java.lang.String, boolean, ru.ozon.uni.atoms.data.AtomActionDTO, java.lang.String, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ TagAtom copy$default(TagAtom tagAtom, String str, String str2, ThemeType themeType, String str3, boolean z11, AtomActionDTO atomActionDTO, String str4, String str5, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tagAtom.text;
            }
            if ((i11 & 2) != 0) {
                str2 = tagAtom.icon;
            }
            if ((i11 & 4) != 0) {
                themeType = tagAtom.theme;
            }
            if ((i11 & 8) != 0) {
                str3 = tagAtom.count;
            }
            if ((i11 & 16) != 0) {
                z11 = tagAtom.isSelected;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = tagAtom.action;
            }
            if ((i11 & 64) != 0) {
                str4 = tagAtom.tintColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str5 = tagAtom.context;
            }
            if ((i11 & 256) != 0) {
                testInfo = tagAtom.testInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = tagAtom.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str6 = str4;
            String str7 = str5;
            boolean z12 = z11;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return tagAtom.copy(str, str2, themeType, str3, z12, atomActionDTO2, str6, str7, testInfo2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final ThemeType getTheme() {
            return this.theme;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCount() {
            return this.count;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        /* renamed from: component8, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component9, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final TagAtom copy(String text, String icon, ThemeType theme, String count, boolean isSelected, AtomActionDTO action, String tintColor, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new TagAtom(text, icon, theme, count, isSelected, action, tintColor, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TagAtom)) {
                return false;
            }
            TagAtom tagAtom = (TagAtom) other;
            return Intrinsics.d(this.text, tagAtom.text) && Intrinsics.d(this.icon, tagAtom.icon) && this.theme == tagAtom.theme && Intrinsics.d(this.count, tagAtom.count) && this.isSelected == tagAtom.isSelected && Intrinsics.d(this.action, tagAtom.action) && Intrinsics.d(this.tintColor, tagAtom.tintColor) && Intrinsics.d(this.context, tagAtom.context) && Intrinsics.d(this.testInfo, tagAtom.testInfo) && Intrinsics.d(this.trackingInfo, tagAtom.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final String getCount() {
            return this.count;
        }

        public final String getIcon() {
            return this.icon;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_tag_atom;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final String getText() {
            return this.text;
        }

        public final ThemeType getTheme() {
            return this.theme;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @Override // ru.ozon.uni.atoms.data.tag.TagV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.icon;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ThemeType themeType = this.theme;
            int hashCode3 = (hashCode2 + (themeType == null ? 0 : themeType.hashCode())) * 31;
            String str3 = this.count;
            int a11 = C3532b.a((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isSelected);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str4 = this.tintColor;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.context;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode7 = (hashCode6 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode7 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.icon;
            ThemeType themeType = this.theme;
            String str3 = this.count;
            boolean z11 = this.isSelected;
            AtomActionDTO atomActionDTO = this.action;
            String str4 = this.tintColor;
            String str5 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("TagAtom(text=", str, ", icon=", str2, ", theme=");
            d11.append(themeType);
            d11.append(", count=");
            d11.append(str3);
            d11.append(", isSelected=");
            d11.append(z11);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", tintColor=");
            Nh.a.h(d11, str4, ", context=", str5, ", testInfo=");
            return C2639a.a(", trackingInfo=", ")", d11, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeString(this.icon);
            ThemeType themeType = this.theme;
            if (themeType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(themeType.name());
            }
            dest.writeString(this.count);
            dest.writeInt(this.isSelected ? 1 : 0);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.tintColor);
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
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

        public TagAtom(String str, String str2, ThemeType themeType, String str3, boolean z11, AtomActionDTO atomActionDTO, String str4, String str5, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.TAG, str5, testInfo, map, null);
            this.text = str;
            this.icon = str2;
            this.theme = themeType;
            this.count = str3;
            this.isSelected = z11;
            this.action = atomActionDTO;
            this.tintColor = str4;
            this.context = str5;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    public /* synthetic */ TagV3Atom(AtomType atomType, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomType, str, (i11 & 4) != 0 ? null : testInfo, (i11 & 8) != 0 ? null : map, null);
    }

    private TagV3Atom(AtomType atomType, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(atomType, str, map, null, 8, null);
        this.type = atomType;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
