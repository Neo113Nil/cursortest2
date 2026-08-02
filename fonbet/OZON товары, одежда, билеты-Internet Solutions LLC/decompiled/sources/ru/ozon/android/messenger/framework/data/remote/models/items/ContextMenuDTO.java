package ru.ozon.android.messenger.framework.data.remote.models.items;

import C.J;
import Kk.c;
import android.os.Parcel;
import android.os.Parcelable;
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
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "Landroid/os/Parcelable;", "additionalMenuItems", "", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO$ContextMenuItem;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getAdditionalMenuItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ContextMenuItem", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ContextMenuDTO implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ContextMenuDTO> CREATOR = new a();

    @NotNull
    private final List<ContextMenuItem> additionalMenuItems;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\nHÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO$ContextMenuItem;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContextMenuItem implements Parcelable {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<ContextMenuItem> CREATOR = new a();

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final CommonAtomIconDTO icon;

        @NotNull
        private final CommonAtomLabelDTO title;
        private final Map<String, MessengerTrackingInfo> trackingInfo;

        public static final class a implements Parcelable.Creator<ContextMenuItem> {
            @Override // android.os.Parcelable.Creator
            public final ContextMenuItem createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                CommonAtomLabelDTO commonAtomLabelDTO = (CommonAtomLabelDTO) parcel.readParcelable(ContextMenuItem.class.getClassLoader());
                CommonAtomIconDTO commonAtomIconDTO = (CommonAtomIconDTO) parcel.readParcelable(ContextMenuItem.class.getClassLoader());
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(ContextMenuItem.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap2.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new ContextMenuItem(commonAtomLabelDTO, commonAtomIconDTO, atomActionDTO, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final ContextMenuItem[] newArray(int i11) {
                return new ContextMenuItem[i11];
            }
        }

        public ContextMenuItem(@NotNull CommonAtomLabelDTO title, @NotNull CommonAtomIconDTO icon, @NotNull AtomActionDTO action, Map<String, MessengerTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.icon = icon;
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ContextMenuItem copy$default(ContextMenuItem contextMenuItem, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonAtomLabelDTO = contextMenuItem.title;
            }
            if ((i11 & 2) != 0) {
                commonAtomIconDTO = contextMenuItem.icon;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = contextMenuItem.action;
            }
            if ((i11 & 8) != 0) {
                map = contextMenuItem.trackingInfo;
            }
            return contextMenuItem.copy(commonAtomLabelDTO, commonAtomIconDTO, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CommonAtomLabelDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, MessengerTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final ContextMenuItem copy(@NotNull CommonAtomLabelDTO title, @NotNull CommonAtomIconDTO icon, @NotNull AtomActionDTO action, Map<String, MessengerTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ContextMenuItem(title, icon, action, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContextMenuItem)) {
                return false;
            }
            ContextMenuItem contextMenuItem = (ContextMenuItem) other;
            return Intrinsics.d(this.title, contextMenuItem.title) && Intrinsics.d(this.icon, contextMenuItem.icon) && Intrinsics.d(this.action, contextMenuItem.action) && Intrinsics.d(this.trackingInfo, contextMenuItem.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final CommonAtomLabelDTO getTitle() {
            return this.title;
        }

        public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = Ih.a.b(this.action, (this.icon.hashCode() + (this.title.hashCode() * 31)) * 31, 31);
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            CommonAtomLabelDTO commonAtomLabelDTO = this.title;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ContextMenuItem(title=");
            sb2.append(commonAtomLabelDTO);
            sb2.append(", icon=");
            sb2.append(commonAtomIconDTO);
            sb2.append(", action=");
            return D40.a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.title, flags);
            dest.writeParcelable(this.icon, flags);
            dest.writeParcelable(this.action, flags);
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                ((MessengerTrackingInfo) entry.getValue()).writeToParcel(dest, flags);
            }
        }
    }

    public static final class a implements Parcelable.Creator<ContextMenuDTO> {
        @Override // android.os.Parcelable.Creator
        public final ContextMenuDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Ak.b.b(ContextMenuItem.CREATOR, parcel, arrayList, i11, 1);
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    linkedHashMap2.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ContextMenuDTO(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ContextMenuDTO[] newArray(int i11) {
            return new ContextMenuDTO[i11];
        }
    }

    public ContextMenuDTO(@NotNull List<ContextMenuItem> additionalMenuItems, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(additionalMenuItems, "additionalMenuItems");
        this.additionalMenuItems = additionalMenuItems;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContextMenuDTO copy$default(ContextMenuDTO contextMenuDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = contextMenuDTO.additionalMenuItems;
        }
        if ((i11 & 2) != 0) {
            map = contextMenuDTO.trackingInfo;
        }
        return contextMenuDTO.copy(list, map);
    }

    @NotNull
    public final List<ContextMenuItem> component1() {
        return this.additionalMenuItems;
    }

    public final Map<String, MessengerTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final ContextMenuDTO copy(@NotNull List<ContextMenuItem> additionalMenuItems, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(additionalMenuItems, "additionalMenuItems");
        return new ContextMenuDTO(additionalMenuItems, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextMenuDTO)) {
            return false;
        }
        ContextMenuDTO contextMenuDTO = (ContextMenuDTO) other;
        return Intrinsics.d(this.additionalMenuItems, contextMenuDTO.additionalMenuItems) && Intrinsics.d(this.trackingInfo, contextMenuDTO.trackingInfo);
    }

    @NotNull
    public final List<ContextMenuItem> getAdditionalMenuItems() {
        return this.additionalMenuItems;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.additionalMenuItems.hashCode() * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("ContextMenuDTO(additionalMenuItems=", ", trackingInfo=", ")", this.additionalMenuItems, this.trackingInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.additionalMenuItems, dest);
        while (c11.hasNext()) {
            ((ContextMenuItem) c11.next()).writeToParcel(dest, flags);
        }
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            ((MessengerTrackingInfo) entry.getValue()).writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ ContextMenuDTO(List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : map);
    }
}
