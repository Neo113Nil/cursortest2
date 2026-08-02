package ru.ozon.uni.atoms.data.deprecated;

import C.J;
import De.C2859b;
import G.g;
import GR.b;
import Sc.InterfaceC3999a;
import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
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
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Je\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0006\u0010&\u001a\u00020\u001dJ\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001dHÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00062"}, d2 = {"Lru/ozon/uni/atoms/data/deprecated/Annotation;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textColor", "", "image", "control", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextColor", "()Ljava/lang/String;", "getImage", "getControl", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Annotation extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Annotation> CREATOR = new Creator();
    private final String context;
    private final AtomDTO control;

    @NotNull
    private final String image;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;
    private final String textColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Annotation> {
        @Override // android.os.Parcelable.Creator
        public final Annotation createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AtomDTO atomDTO = (AtomDTO) parcel.readParcelable(Annotation.class.getClassLoader());
            TestInfo createFromParcel = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(Annotation.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Annotation(create, readString, readString2, atomDTO, createFromParcel, readString3, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Annotation[] newArray(int i11) {
            return new Annotation[i11];
        }
    }

    public /* synthetic */ Annotation(OzonSpannableString ozonSpannableString, String str, String str2, AtomDTO atomDTO, TestInfo testInfo, String str3, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, (i11 & 2) != 0 ? null : str, str2, atomDTO, (i11 & 16) != 0 ? null : testInfo, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : map);
    }

    public static /* synthetic */ Annotation copy$default(Annotation annotation, OzonSpannableString ozonSpannableString, String str, String str2, AtomDTO atomDTO, TestInfo testInfo, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = annotation.text;
        }
        if ((i11 & 2) != 0) {
            str = annotation.textColor;
        }
        if ((i11 & 4) != 0) {
            str2 = annotation.image;
        }
        if ((i11 & 8) != 0) {
            atomDTO = annotation.control;
        }
        if ((i11 & 16) != 0) {
            testInfo = annotation.testInfo;
        }
        if ((i11 & 32) != 0) {
            str3 = annotation.context;
        }
        if ((i11 & 64) != 0) {
            map = annotation.trackingInfo;
        }
        String str4 = str3;
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        String str5 = str2;
        return annotation.copy(ozonSpannableString, str, str5, atomDTO, testInfo2, str4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomDTO getControl() {
        return this.control;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final Annotation copy(@NotNull OzonSpannableString text, String textColor, @NotNull String image, AtomDTO control, TestInfo testInfo, String context, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        return new Annotation(text, textColor, image, control, testInfo, context, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Annotation)) {
            return false;
        }
        Annotation annotation = (Annotation) other;
        return Intrinsics.d(this.text, annotation.text) && Intrinsics.d(this.textColor, annotation.textColor) && Intrinsics.d(this.image, annotation.image) && Intrinsics.d(this.control, annotation.control) && Intrinsics.d(this.testInfo, annotation.testInfo) && Intrinsics.d(this.context, annotation.context) && Intrinsics.d(this.trackingInfo, annotation.trackingInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final AtomDTO getControl() {
        return this.control;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_annotation;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.textColor;
        int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.image);
        AtomDTO atomDTO = this.control;
        int hashCode2 = (a11 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        String str2 = this.context;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        String str = this.textColor;
        String str2 = this.image;
        AtomDTO atomDTO = this.control;
        TestInfo testInfo = this.testInfo;
        String str3 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = b.f("Annotation(text=", ozonSpannableString, ", textColor=", str, ", image=");
        f7.append(str2);
        f7.append(", control=");
        f7.append(atomDTO);
        f7.append(", testInfo=");
        f7.append(testInfo);
        f7.append(", context=");
        f7.append(str3);
        f7.append(", trackingInfo=");
        return P.f(f7, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        dest.writeString(this.textColor);
        dest.writeString(this.image);
        dest.writeParcelable(this.control, flags);
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
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
    public Annotation(@NotNull OzonSpannableString text, String str, @NotNull String image, AtomDTO atomDTO, TestInfo testInfo, String str2, Map<String, TokenizedTrackingInfo> map) {
        super(AtomTypeImpl.ANNOTATION, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        this.text = text;
        this.textColor = str;
        this.image = image;
        this.control = atomDTO;
        this.testInfo = testInfo;
        this.context = str2;
        this.trackingInfo = map;
    }
}
