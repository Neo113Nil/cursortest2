package ru.ozon.fintech.exchanger.datapass;

import B6.b;
import C.J;
import N3.C3660k;
import Ul.C4070a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "Landroid/os/Parcelable;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "key", "sliceKey", "custom", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getActionType", "()Ljava/lang/String;", "getKey", "getSliceKey", "getCustom", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "fintech-exchanger_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ComposerTrackingInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ComposerTrackingInfo> CREATOR = new a();
    private final String actionType;
    private final Map<String, String> custom;
    private final String key;
    private final String sliceKey;

    public static final class a implements Parcelable.Creator<ComposerTrackingInfo> {
        @Override // android.os.Parcelable.Creator
        public final ComposerTrackingInfo createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = b.a(parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ComposerTrackingInfo(readString, readString2, readString3, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ComposerTrackingInfo[] newArray(int i11) {
            return new ComposerTrackingInfo[i11];
        }
    }

    public ComposerTrackingInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposerTrackingInfo copy$default(ComposerTrackingInfo composerTrackingInfo, String str, String str2, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = composerTrackingInfo.actionType;
        }
        if ((i11 & 2) != 0) {
            str2 = composerTrackingInfo.key;
        }
        if ((i11 & 4) != 0) {
            str3 = composerTrackingInfo.sliceKey;
        }
        if ((i11 & 8) != 0) {
            map = composerTrackingInfo.custom;
        }
        return composerTrackingInfo.copy(str, str2, str3, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSliceKey() {
        return this.sliceKey;
    }

    public final Map<String, String> component4() {
        return this.custom;
    }

    @NotNull
    public final ComposerTrackingInfo copy(@i(name = "actionType") String actionType, @i(name = "key") String key, @i(name = "sliceKey") String sliceKey, @i(name = "custom") Map<String, String> custom) {
        return new ComposerTrackingInfo(actionType, key, sliceKey, custom);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposerTrackingInfo)) {
            return false;
        }
        ComposerTrackingInfo composerTrackingInfo = (ComposerTrackingInfo) other;
        return Intrinsics.d(this.actionType, composerTrackingInfo.actionType) && Intrinsics.d(this.key, composerTrackingInfo.key) && Intrinsics.d(this.sliceKey, composerTrackingInfo.sliceKey) && Intrinsics.d(this.custom, composerTrackingInfo.custom);
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final Map<String, String> getCustom() {
        return this.custom;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getSliceKey() {
        return this.sliceKey;
    }

    public int hashCode() {
        String str = this.actionType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sliceKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.custom;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.actionType;
        String str2 = this.key;
        return C4070a.a(C3660k.d("ComposerTrackingInfo(actionType=", str, ", key=", str2, ", sliceKey="), this.sliceKey, ", custom=", this.custom, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.actionType);
        dest.writeString(this.key);
        dest.writeString(this.sliceKey);
        Map<String, String> map = this.custom;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    public ComposerTrackingInfo(@i(name = "actionType") String str, @i(name = "key") String str2, @i(name = "sliceKey") String str3, @i(name = "custom") Map<String, String> map) {
        this.actionType = str;
        this.key = str2;
        this.sliceKey = str3;
        this.custom = map;
    }

    public /* synthetic */ ComposerTrackingInfo(String str, String str2, String str3, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : map);
    }
}
