package ru.ozon.app.android.atoms.data.disclosure;

import C.J;
import De.C2859b;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
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
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J[\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010$\u001a\u00020\u001cJ\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u001cHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, d2 = {"Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "", "theme", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom$Theme;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom$Theme;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Ljava/lang/String;", "getTheme", "()Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom$Theme;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Theme", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DisclosureAtom extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<DisclosureAtom> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final TestInfo testInfo;
    private final String text;

    @NotNull
    private final Theme theme;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<DisclosureAtom> {
        @Override // android.os.Parcelable.Creator
        public final DisclosureAtom createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Theme valueOf = Theme.valueOf(parcel.readString());
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(DisclosureAtom.class.getClassLoader());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(DisclosureAtom.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                }
            }
            return new DisclosureAtom(readString, valueOf, atomActionDTO, readString2, linkedHashMap, (TestInfo) parcel.readParcelable(DisclosureAtom.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DisclosureAtom[] newArray(int i11) {
            return new DisclosureAtom[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "FRESH", "LIGHT", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;
        public static final Theme DEFAULT = new Theme("DEFAULT", 0);
        public static final Theme FRESH = new Theme("FRESH", 1);

        @InterfaceC3999a
        public static final Theme LIGHT = new Theme("LIGHT", 2);

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{DEFAULT, FRESH, LIGHT};
        }

        static {
            Theme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Theme(String str, int i11) {
        }

        @NotNull
        public static a<Theme> getEntries() {
            return $ENTRIES;
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DisclosureAtom(String str, Theme theme, AtomActionDTO atomActionDTO, String str2, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, theme, (i11 & 4) != 0 ? null : atomActionDTO, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : map, (i11 & 32) != 0 ? null : testInfo);
    }

    public static /* synthetic */ DisclosureAtom copy$default(DisclosureAtom disclosureAtom, String str, Theme theme, AtomActionDTO atomActionDTO, String str2, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = disclosureAtom.text;
        }
        if ((i11 & 2) != 0) {
            theme = disclosureAtom.theme;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = disclosureAtom.action;
        }
        if ((i11 & 8) != 0) {
            str2 = disclosureAtom.context;
        }
        if ((i11 & 16) != 0) {
            map = disclosureAtom.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            testInfo = disclosureAtom.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        return disclosureAtom.copy(str, theme, atomActionDTO, str2, map2, testInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final DisclosureAtom copy(String text, @NotNull Theme theme, AtomActionDTO action, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new DisclosureAtom(text, theme, action, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureAtom)) {
            return false;
        }
        DisclosureAtom disclosureAtom = (DisclosureAtom) other;
        return Intrinsics.d(this.text, disclosureAtom.text) && this.theme == disclosureAtom.theme && Intrinsics.d(this.action, disclosureAtom.action) && Intrinsics.d(this.context, disclosureAtom.context) && Intrinsics.d(this.trackingInfo, disclosureAtom.trackingInfo) && Intrinsics.d(this.testInfo, disclosureAtom.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_disclosure;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getText() {
        return this.text;
    }

    @NotNull
    public final Theme getTheme() {
        return this.theme;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (this.theme.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str2 = this.context;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        Theme theme = this.theme;
        AtomActionDTO atomActionDTO = this.action;
        String str2 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("DisclosureAtom(text=");
        sb2.append(str);
        sb2.append(", theme=");
        sb2.append(theme);
        sb2.append(", action=");
        HY.b.d(", context=", str2, ", trackingInfo=", sb2, atomActionDTO);
        return Ns.b.b(", testInfo=", ")", sb2, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.theme.name());
        dest.writeParcelable(this.action, flags);
        dest.writeString(this.context);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
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
        dest.writeParcelable(this.testInfo, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureAtom(String str, @NotNull Theme theme, AtomActionDTO atomActionDTO, String str2, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(Type.DISCLOSURE, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.text = str;
        this.theme = theme;
        this.action = atomActionDTO;
        this.context = str2;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
