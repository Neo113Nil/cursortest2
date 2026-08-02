package ru.ozon.app.android.atoms.data.selectionControls.toggle;

import C.J;
import D40.c;
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
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00011B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fBQ\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u0010JU\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003Jb\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020\u001eJ\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u001eHÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0002\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00062"}, d2 = {"Lru/ozon/app/android/atoms/data/selectionControls/toggle/ToggleDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "isSelected", "", "isEnabled", "context", "", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "size", "Lru/ozon/app/android/atoms/data/selectionControls/toggle/ToggleDTO$ToggleSize;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;Lru/ozon/app/android/atoms/data/selectionControls/toggle/ToggleDTO$ToggleSize;)V", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getSize", "()Lru/ozon/app/android/atoms/data/selectionControls/toggle/ToggleDTO$ToggleSize;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/selectionControls/toggle/ToggleDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;Lru/ozon/app/android/atoms/data/selectionControls/toggle/ToggleDTO$ToggleSize;)Lru/ozon/app/android/atoms/data/selectionControls/toggle/ToggleDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ToggleSize", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ToggleDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ToggleDTO> CREATOR = new Creator();
    private final String context;
    private final Boolean isEnabled;
    private final Boolean isSelected;
    private final ToggleSize size;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ToggleDTO> {
        @Override // android.os.Parcelable.Creator
        public final ToggleDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
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
            String readString = parcel.readString();
            TestInfo createFromParcel = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(ToggleDTO.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ToggleDTO(valueOf, valueOf2, readString, createFromParcel, linkedHashMap, parcel.readInt() != 0 ? ToggleSize.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ToggleDTO[] newArray(int i11) {
            return new ToggleDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/selectionControls/toggle/ToggleDTO$ToggleSize;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_500", "SIZE_600", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ToggleSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ToggleSize[] $VALUES;
        public static final ToggleSize SIZE_500 = new ToggleSize("SIZE_500", 0);
        public static final ToggleSize SIZE_600 = new ToggleSize("SIZE_600", 1);

        private static final /* synthetic */ ToggleSize[] $values() {
            return new ToggleSize[]{SIZE_500, SIZE_600};
        }

        static {
            ToggleSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ToggleSize(String str, int i11) {
        }

        @NotNull
        public static a<ToggleSize> getEntries() {
            return $ENTRIES;
        }

        public static ToggleSize valueOf(String str) {
            return (ToggleSize) Enum.valueOf(ToggleSize.class, str);
        }

        public static ToggleSize[] values() {
            return (ToggleSize[]) $VALUES.clone();
        }
    }

    public ToggleDTO() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ToggleDTO copy$default(ToggleDTO toggleDTO, Boolean bool, Boolean bool2, String str, TestInfo testInfo, Map map, ToggleSize toggleSize, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = toggleDTO.isSelected;
        }
        if ((i11 & 2) != 0) {
            bool2 = toggleDTO.isEnabled;
        }
        if ((i11 & 4) != 0) {
            str = toggleDTO.context;
        }
        if ((i11 & 8) != 0) {
            testInfo = toggleDTO.testInfo;
        }
        if ((i11 & 16) != 0) {
            map = toggleDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            toggleSize = toggleDTO.size;
        }
        Map map2 = map;
        ToggleSize toggleSize2 = toggleSize;
        return toggleDTO.copy(bool, bool2, str, testInfo, map2, toggleSize2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
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

    /* renamed from: component6, reason: from getter */
    public final ToggleSize getSize() {
        return this.size;
    }

    @NotNull
    public final ToggleDTO copy(Boolean isSelected, Boolean isEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, ToggleSize size) {
        return new ToggleDTO(isSelected, isEnabled, context, testInfo, trackingInfo, size);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleDTO)) {
            return false;
        }
        ToggleDTO toggleDTO = (ToggleDTO) other;
        return Intrinsics.d(this.isSelected, toggleDTO.isSelected) && Intrinsics.d(this.isEnabled, toggleDTO.isEnabled) && Intrinsics.d(this.context, toggleDTO.context) && Intrinsics.d(this.testInfo, toggleDTO.testInfo) && Intrinsics.d(this.trackingInfo, toggleDTO.trackingInfo) && this.size == toggleDTO.size;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.toggle;
    }

    public final ToggleSize getSize() {
        return this.size;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Boolean bool = this.isSelected;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isEnabled;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.context;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        ToggleSize toggleSize = this.size;
        return hashCode5 + (toggleSize != null ? toggleSize.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isSelected;
        Boolean bool2 = this.isEnabled;
        String str = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        ToggleSize toggleSize = this.size;
        StringBuilder sb2 = new StringBuilder("ToggleDTO(isSelected=");
        sb2.append(bool);
        sb2.append(", isEnabled=");
        sb2.append(bool2);
        sb2.append(", context=");
        D40.b.d(sb2, str, ", testInfo=", testInfo, ", trackingInfo=");
        sb2.append(map);
        sb2.append(", size=");
        sb2.append(toggleSize);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.isSelected;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Boolean bool2 = this.isEnabled;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
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
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        ToggleSize toggleSize = this.size;
        if (toggleSize == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(toggleSize.name());
        }
    }

    public /* synthetic */ ToggleDTO(Boolean bool, Boolean bool2, String str, TestInfo testInfo, Map map, ToggleSize toggleSize, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Boolean.FALSE : bool, (i11 & 2) != 0 ? Boolean.TRUE : bool2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map, (i11 & 32) != 0 ? ToggleSize.SIZE_600 : toggleSize);
    }

    public static /* synthetic */ ToggleDTO copy$default(ToggleDTO toggleDTO, Boolean bool, Boolean bool2, String str, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = toggleDTO.isSelected;
        }
        if ((i11 & 2) != 0) {
            bool2 = toggleDTO.isEnabled;
        }
        if ((i11 & 4) != 0) {
            str = toggleDTO.getContext();
        }
        if ((i11 & 8) != 0) {
            testInfo = toggleDTO.getTestInfo();
        }
        if ((i11 & 16) != 0) {
            map = toggleDTO.getTrackingInfo();
        }
        Map map2 = map;
        String str2 = str;
        return toggleDTO.copy(bool, bool2, str2, testInfo, map2);
    }

    @InterfaceC3999a
    public final /* synthetic */ ToggleDTO copy(Boolean isSelected, Boolean isEnabled, String context, TestInfo testInfo, Map trackingInfo) {
        return copy(isSelected, isEnabled, context, testInfo, trackingInfo, this.size);
    }

    public ToggleDTO(Boolean bool, Boolean bool2, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, ToggleSize toggleSize) {
        super(DsAtomsType.TOGGLE, str, map, testInfo);
        this.isSelected = bool;
        this.isEnabled = bool2;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.size = toggleSize;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ToggleDTO(java.lang.Boolean r2, java.lang.Boolean r3, java.lang.String r4, ru.ozon.app.android.atoms.data.TestInfo r5, java.util.Map r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
        Lc:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L12
            r4 = r0
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L17
            r5 = r0
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L22
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L28
        L22:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L28:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.selectionControls.toggle.ToggleDTO.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.String, ru.ozon.app.android.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @InterfaceC3999a
    public ToggleDTO(Boolean bool, Boolean bool2, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        this(bool, bool2, str, testInfo, map, null);
    }
}
