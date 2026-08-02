package ru.ozon.uni.atoms.data.selectionControls.radiobutton;

import Bl.C2639a;
import C.J;
import D40.c;
import De.C2859b;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000223B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jb\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u001eJ\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001eHÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0004\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "size", "Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioSize;", "isSelected", "", "state", "Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioState;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioSize;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioState;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getSize", "()Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioSize;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getState", "()Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioState;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioSize;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioState;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RadioSize", "RadioState", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RadioDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<RadioDTO> CREATOR = new Creator();
    private final String context;
    private final Boolean isSelected;

    @EnumNullFallback
    private final RadioSize size;

    @EnumNullFallback
    private final RadioState state;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RadioDTO> {
        @Override // android.os.Parcelable.Creator
        public final RadioDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            RadioSize valueOf2 = parcel.readInt() == 0 ? null : RadioSize.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            RadioState valueOf3 = parcel.readInt() == 0 ? null : RadioState.valueOf(parcel.readString());
            String readString = parcel.readString();
            TestInfo createFromParcel = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(RadioDTO.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new RadioDTO(valueOf2, valueOf, valueOf3, readString, createFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final RadioDTO[] newArray(int i11) {
            return new RadioDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioSize;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_500", "SIZE_600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RadioSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RadioSize[] $VALUES;
        public static final RadioSize SIZE_500 = new RadioSize("SIZE_500", 0);
        public static final RadioSize SIZE_600 = new RadioSize("SIZE_600", 1);

        private static final /* synthetic */ RadioSize[] $values() {
            return new RadioSize[]{SIZE_500, SIZE_600};
        }

        static {
            RadioSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RadioSize(String str, int i11) {
        }

        @NotNull
        public static a<RadioSize> getEntries() {
            return $ENTRIES;
        }

        public static RadioSize valueOf(String str) {
            return (RadioSize) Enum.valueOf(RadioSize.class, str);
        }

        public static RadioSize[] values() {
            return (RadioSize[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "ERROR", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RadioState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RadioState[] $VALUES;
        public static final RadioState ENABLED = new RadioState("ENABLED", 0);
        public static final RadioState DISABLED = new RadioState("DISABLED", 1);
        public static final RadioState ERROR = new RadioState("ERROR", 2);

        private static final /* synthetic */ RadioState[] $values() {
            return new RadioState[]{ENABLED, DISABLED, ERROR};
        }

        static {
            RadioState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RadioState(String str, int i11) {
        }

        @NotNull
        public static a<RadioState> getEntries() {
            return $ENTRIES;
        }

        public static RadioState valueOf(String str) {
            return (RadioState) Enum.valueOf(RadioState.class, str);
        }

        public static RadioState[] values() {
            return (RadioState[]) $VALUES.clone();
        }
    }

    public RadioDTO() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ RadioDTO copy$default(RadioDTO radioDTO, RadioSize radioSize, Boolean bool, RadioState radioState, String str, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            radioSize = radioDTO.size;
        }
        if ((i11 & 2) != 0) {
            bool = radioDTO.isSelected;
        }
        if ((i11 & 4) != 0) {
            radioState = radioDTO.state;
        }
        if ((i11 & 8) != 0) {
            str = radioDTO.context;
        }
        if ((i11 & 16) != 0) {
            testInfo = radioDTO.testInfo;
        }
        if ((i11 & 32) != 0) {
            map = radioDTO.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        return radioDTO.copy(radioSize, bool, radioState, str, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final RadioSize getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component3, reason: from getter */
    public final RadioState getState() {
        return this.state;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final RadioDTO copy(RadioSize size, Boolean isSelected, RadioState state, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new RadioDTO(size, isSelected, state, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadioDTO)) {
            return false;
        }
        RadioDTO radioDTO = (RadioDTO) other;
        return this.size == radioDTO.size && Intrinsics.d(this.isSelected, radioDTO.isSelected) && this.state == radioDTO.state && Intrinsics.d(this.context, radioDTO.context) && Intrinsics.d(this.testInfo, radioDTO.testInfo) && Intrinsics.d(this.trackingInfo, radioDTO.trackingInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.radioButton;
    }

    public final RadioSize getSize() {
        return this.size;
    }

    public final RadioState getState() {
        return this.state;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        RadioSize radioSize = this.size;
        int hashCode = (radioSize == null ? 0 : radioSize.hashCode()) * 31;
        Boolean bool = this.isSelected;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        RadioState radioState = this.state;
        int hashCode3 = (hashCode2 + (radioState == null ? 0 : radioState.hashCode())) * 31;
        String str = this.context;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        RadioSize radioSize = this.size;
        Boolean bool = this.isSelected;
        RadioState radioState = this.state;
        String str = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("RadioDTO(size=");
        sb2.append(radioSize);
        sb2.append(", isSelected=");
        sb2.append(bool);
        sb2.append(", state=");
        sb2.append(radioState);
        sb2.append(", context=");
        sb2.append(str);
        sb2.append(", testInfo=");
        return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RadioSize radioSize = this.size;
        if (radioSize == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(radioSize.name());
        }
        Boolean bool = this.isSelected;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        RadioState radioState = this.state;
        if (radioState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(radioState.name());
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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RadioDTO(ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO.RadioSize r2, java.lang.Boolean r3, ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO.RadioState r4, java.lang.String r5, ru.ozon.uni.atoms.data.TestInfo r6, java.util.Map r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO$RadioSize r2 = ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO.RadioSize.SIZE_500
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L12
            ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO$RadioState r4 = ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO.RadioState.ENABLED
        L12:
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L18
            r5 = r0
        L18:
            r9 = r8 & 16
            if (r9 == 0) goto L1d
            r6 = r0
        L1d:
            r8 = r8 & 32
            if (r8 == 0) goto L29
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L30
        L29:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L30:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO.<init>(ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO$RadioSize, java.lang.Boolean, ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO$RadioState, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public RadioDTO(RadioSize radioSize, Boolean bool, RadioState radioState, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(DsAtomsType.RADIOBUTTON, str, map, testInfo);
        this.size = radioSize;
        this.isSelected = bool;
        this.state = radioState;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
