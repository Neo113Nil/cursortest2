package ru.ozon.app.android.atoms.data.list;

import Ak.b;
import Bi.a;
import C.J;
import C.o0;
import De.C2859b;
import Ql.c;
import Sc.InterfaceC3999a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0013J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lru/ozon/app/android/atoms/data/list/Select;", "Lru/ozon/uni/atoms/data/AtomDTO;", "options", "", "Lru/ozon/app/android/atoms/data/list/Select$Option;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "icon", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "getOptions", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getIcon", "()Ljava/lang/String;", "getItemType", "", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Option", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Select extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<Select> CREATOR = new Creator();
    private final String icon;

    @NotNull
    private final List<Option> options;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<Select> {
        @Override // android.os.Parcelable.Creator
        public final Select createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(Option.CREATOR, parcel, arrayList, i11, 1);
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(Select.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Select(arrayList, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Select[] newArray(int i11) {
            return new Select[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Select(@NotNull List<Option> options, Map<String, TokenizedTrackingInfo> map, String str) {
        super(Type.SELECT, null, null, null, 12, null);
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        this.trackingInfo = map;
        this.icon = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Select copy$default(Select select, List list, Map map, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = select.options;
        }
        if ((i11 & 2) != 0) {
            map = select.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            str = select.icon;
        }
        return select.copy(list, map, str);
    }

    @NotNull
    public final List<Option> component1() {
        return this.options;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final Select copy(@NotNull List<Option> options, Map<String, TokenizedTrackingInfo> trackingInfo, String icon) {
        Intrinsics.checkNotNullParameter(options, "options");
        return new Select(options, trackingInfo, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Select)) {
            return false;
        }
        Select select = (Select) other;
        return Intrinsics.d(this.options, select.options) && Intrinsics.d(this.trackingInfo, select.trackingInfo) && Intrinsics.d(this.icon, select.icon);
    }

    public final String getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_select;
    }

    @NotNull
    public final List<Option> getOptions() {
        return this.options;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.options.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.icon;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Option> list = this.options;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str = this.icon;
        StringBuilder sb2 = new StringBuilder("Select(options=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", icon=");
        return o0.c(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = a.c(this.options, dest);
        while (c11.hasNext()) {
            ((Option) c11.next()).writeToParcel(dest, flags);
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
        dest.writeString(this.icon);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0006\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lru/ozon/app/android/atoms/data/list/Select$Option;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "isSelected", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Boolean;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/list/Select$Option;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Option implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Option> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final Boolean isSelected;

        @NotNull
        private final String name;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(Option.class.getClassLoader());
                LinkedHashMap linkedHashMap = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(Option.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Option(readString, atomActionDTO, valueOf, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i11) {
                return new Option[i11];
            }
        }

        public Option(@NotNull String name, AtomActionDTO atomActionDTO, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.action = atomActionDTO;
            this.isSelected = bool;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Option copy$default(Option option, String str, AtomActionDTO atomActionDTO, Boolean bool, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = option.name;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = option.action;
            }
            if ((i11 & 4) != 0) {
                bool = option.isSelected;
            }
            if ((i11 & 8) != 0) {
                map = option.trackingInfo;
            }
            return option.copy(str, atomActionDTO, bool, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final Option copy(@NotNull String name, AtomActionDTO action, Boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Option(name, action, isSelected, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.d(this.name, option.name) && Intrinsics.d(this.action, option.action) && Intrinsics.d(this.isSelected, option.isSelected) && Intrinsics.d(this.trackingInfo, option.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Boolean bool = this.isSelected;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.name;
            AtomActionDTO atomActionDTO = this.action;
            Boolean bool = this.isSelected;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("Option(name=", str, ", action=", atomActionDTO, ", isSelected=");
            c11.append(bool);
            c11.append(", trackingInfo=");
            c11.append(map);
            c11.append(")");
            return c11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeParcelable(this.action, flags);
            Boolean bool = this.isSelected;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                D40.c.c(dest, 1, bool);
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

        public /* synthetic */ Option(String str, AtomActionDTO atomActionDTO, Boolean bool, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomActionDTO, bool, (i11 & 8) != 0 ? null : map);
        }
    }
}
