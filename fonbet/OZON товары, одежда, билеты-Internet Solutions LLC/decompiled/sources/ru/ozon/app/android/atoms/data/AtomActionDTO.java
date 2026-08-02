package ru.ozon.app.android.atoms.data;

import Bk.C2638a;
import C.J;
import C.o0;
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

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBA\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b\n\u0010\fJB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\u0007J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u001bJO\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006*"}, d2 = {"Lru/ozon/app/android/atoms/data/AtomActionDTO;", "Landroid/os/Parcelable;", "behavior", "Lru/ozon/app/android/atoms/data/AtomActionDTO$Behavior;", "link", "", "id", "params", "", "rawBehavior", "<init>", "(Lru/ozon/app/android/atoms/data/AtomActionDTO$Behavior;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "(Lru/ozon/app/android/atoms/data/AtomActionDTO$Behavior;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBehavior", "()Lru/ozon/app/android/atoms/data/AtomActionDTO$Behavior;", "getLink", "()Ljava/lang/String;", "getId", "getParams", "()Ljava/util/Map;", "getRawBehavior$design_system_release", "copy", "component1", "component2", "component3", "component4", "component5", "component5$design_system_release", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Behavior", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AtomActionDTO implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AtomActionDTO> CREATOR = new Creator();

    @NotNull
    private final Behavior behavior;
    private final String id;
    private final String link;
    private final Map<String, String> params;
    private final String rawBehavior;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/atoms/data/AtomActionDTO$Behavior;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_ACTION", "CUSTOM", "REDIRECT", "NESTED_PAGE", "COMPOSER_NESTED_PAGE", "DISMISS", "DISMISS_AND_SCROLL", "DISMISS_REDIRECT", "DISMISS_REFRESH", "SCROLL_TO_WIDGET", "COMPOSER_ACTION", "BEHAVIOR_TYPE_ACTION_SHEET", "BEHAVIOR_TYPE_REFRESH", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Behavior {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Behavior[] $VALUES;
        public static final Behavior INVALID_ACTION = new Behavior("INVALID_ACTION", 0);
        public static final Behavior CUSTOM = new Behavior("CUSTOM", 1);
        public static final Behavior REDIRECT = new Behavior("REDIRECT", 2);
        public static final Behavior NESTED_PAGE = new Behavior("NESTED_PAGE", 3);
        public static final Behavior COMPOSER_NESTED_PAGE = new Behavior("COMPOSER_NESTED_PAGE", 4);
        public static final Behavior DISMISS = new Behavior("DISMISS", 5);
        public static final Behavior DISMISS_AND_SCROLL = new Behavior("DISMISS_AND_SCROLL", 6);
        public static final Behavior DISMISS_REDIRECT = new Behavior("DISMISS_REDIRECT", 7);
        public static final Behavior DISMISS_REFRESH = new Behavior("DISMISS_REFRESH", 8);
        public static final Behavior SCROLL_TO_WIDGET = new Behavior("SCROLL_TO_WIDGET", 9);
        public static final Behavior COMPOSER_ACTION = new Behavior("COMPOSER_ACTION", 10);
        public static final Behavior BEHAVIOR_TYPE_ACTION_SHEET = new Behavior("BEHAVIOR_TYPE_ACTION_SHEET", 11);
        public static final Behavior BEHAVIOR_TYPE_REFRESH = new Behavior("BEHAVIOR_TYPE_REFRESH", 12);

        private static final /* synthetic */ Behavior[] $values() {
            return new Behavior[]{INVALID_ACTION, CUSTOM, REDIRECT, NESTED_PAGE, COMPOSER_NESTED_PAGE, DISMISS, DISMISS_AND_SCROLL, DISMISS_REDIRECT, DISMISS_REFRESH, SCROLL_TO_WIDGET, COMPOSER_ACTION, BEHAVIOR_TYPE_ACTION_SHEET, BEHAVIOR_TYPE_REFRESH};
        }

        static {
            Behavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Behavior(String str, int i11) {
        }

        @NotNull
        public static a<Behavior> getEntries() {
            return $ENTRIES;
        }

        public static Behavior valueOf(String str) {
            return (Behavior) Enum.valueOf(Behavior.class, str);
        }

        public static Behavior[] values() {
            return (Behavior[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AtomActionDTO> {
        @Override // android.os.Parcelable.Creator
        public final AtomActionDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Behavior valueOf = Behavior.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = B6.b.a(parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AtomActionDTO(valueOf, readString, readString2, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtomActionDTO[] newArray(int i11) {
            return new AtomActionDTO[i11];
        }
    }

    public AtomActionDTO(@NotNull Behavior behavior, String str, String str2, Map<String, String> map, String str3) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.behavior = behavior;
        this.link = str;
        this.id = str2;
        this.params = map;
        this.rawBehavior = str3;
    }

    public static /* synthetic */ AtomActionDTO copy$default(AtomActionDTO atomActionDTO, Behavior behavior, String str, String str2, Map map, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            behavior = atomActionDTO.behavior;
        }
        if ((i11 & 2) != 0) {
            str = atomActionDTO.link;
        }
        if ((i11 & 4) != 0) {
            str2 = atomActionDTO.id;
        }
        if ((i11 & 8) != 0) {
            map = atomActionDTO.params;
        }
        if ((i11 & 16) != 0) {
            str3 = atomActionDTO.rawBehavior;
        }
        String str4 = str3;
        String str5 = str2;
        return atomActionDTO.copy(behavior, str, str5, map, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Behavior getBehavior() {
        return this.behavior;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, String> component4() {
        return this.params;
    }

    /* renamed from: component5$design_system_release, reason: from getter */
    public final String getRawBehavior() {
        return this.rawBehavior;
    }

    @NotNull
    public final AtomActionDTO copy(@NotNull Behavior behavior, String link, String id2, Map<String, String> params, String rawBehavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        return new AtomActionDTO(behavior, link, id2, params, rawBehavior);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtomActionDTO)) {
            return false;
        }
        AtomActionDTO atomActionDTO = (AtomActionDTO) other;
        return this.behavior == atomActionDTO.behavior && Intrinsics.d(this.link, atomActionDTO.link) && Intrinsics.d(this.id, atomActionDTO.id) && Intrinsics.d(this.params, atomActionDTO.params) && Intrinsics.d(this.rawBehavior, atomActionDTO.rawBehavior);
    }

    @NotNull
    public final Behavior getBehavior() {
        return this.behavior;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLink() {
        return this.link;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final String getRawBehavior$design_system_release() {
        return this.rawBehavior;
    }

    public int hashCode() {
        int hashCode = this.behavior.hashCode() * 31;
        String str = this.link;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.params;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.rawBehavior;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Behavior behavior = this.behavior;
        String str = this.link;
        String str2 = this.id;
        Map<String, String> map = this.params;
        String str3 = this.rawBehavior;
        StringBuilder sb2 = new StringBuilder("AtomActionDTO(behavior=");
        sb2.append(behavior);
        sb2.append(", link=");
        sb2.append(str);
        sb2.append(", id=");
        C2638a.e(sb2, str2, ", params=", map, ", rawBehavior=");
        return o0.c(sb2, str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.behavior.name());
        dest.writeString(this.link);
        dest.writeString(this.id);
        Map<String, String> map = this.params;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        dest.writeString(this.rawBehavior);
    }

    public static /* synthetic */ AtomActionDTO copy$default(AtomActionDTO atomActionDTO, Behavior behavior, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            behavior = atomActionDTO.behavior;
        }
        if ((i11 & 2) != 0) {
            str = atomActionDTO.link;
        }
        if ((i11 & 4) != 0) {
            str2 = atomActionDTO.id;
        }
        if ((i11 & 8) != 0) {
            map = atomActionDTO.params;
        }
        return atomActionDTO.copy(behavior, str, str2, map);
    }

    @InterfaceC3999a
    public final /* synthetic */ AtomActionDTO copy(Behavior behavior, String link, String id2, Map params) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        return copy(behavior, link, id2, params, this.rawBehavior);
    }

    public /* synthetic */ AtomActionDTO(Behavior behavior, String str, String str2, Map map, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(behavior, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : map, (i11 & 16) != 0 ? null : str3);
    }

    public /* synthetic */ AtomActionDTO(Behavior behavior, String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(behavior, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AtomActionDTO(@NotNull Behavior behavior, String str, String str2, Map<String, String> map) {
        this(behavior, str, str2, map, null);
        Intrinsics.checkNotNullParameter(behavior, "behavior");
    }
}
