package ru.ozon.uni.atoms.data.avatar;

import C.J;
import De.C2859b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import T7.P;
import Ul.C4070a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
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
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00013B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020\u001eJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u001eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lru/ozon/uni/atoms/data/avatar/Avatar;", "Lru/ozon/uni/atoms/data/AtomDTO;", "backgroundColor", "", "initials", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "theme", "Lru/ozon/uni/atoms/data/avatar/Avatar$Theme;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/avatar/Avatar$Theme;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getInitials", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTheme", "()Lru/ozon/uni/atoms/data/avatar/Avatar$Theme;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Theme", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Avatar extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Avatar> CREATOR = new Creator();

    @NotNull
    private final String backgroundColor;
    private final String context;
    private final Icon icon;
    private final String initials;
    private final TestInfo testInfo;

    @NotNull
    private final Theme theme;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Avatar> {
        @Override // android.os.Parcelable.Creator
        public final Avatar createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Icon createFromParcel = parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel);
            Theme valueOf = Theme.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(Avatar.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Avatar(readString, readString2, createFromParcel, valueOf, readString3, createFromParcel2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Avatar[] newArray(int i11) {
            return new Avatar[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/data/avatar/Avatar$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_LARGE", "THEME_TYPE_MEDIUM", "THEME_TYPE_SMALL", "THEME_TYPE_X_SMALL", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;

        @i(name = "THEME_TYPE_LARGE")
        public static final Theme THEME_TYPE_LARGE = new Theme("THEME_TYPE_LARGE", 0);

        @i(name = "THEME_TYPE_MEDIUM")
        public static final Theme THEME_TYPE_MEDIUM = new Theme("THEME_TYPE_MEDIUM", 1);

        @i(name = "THEME_TYPE_SMALL")
        public static final Theme THEME_TYPE_SMALL = new Theme("THEME_TYPE_SMALL", 2);

        @i(name = "THEME_TYPE_X_SMALL")
        public static final Theme THEME_TYPE_X_SMALL = new Theme("THEME_TYPE_X_SMALL", 3);

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{THEME_TYPE_LARGE, THEME_TYPE_MEDIUM, THEME_TYPE_SMALL, THEME_TYPE_X_SMALL};
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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Avatar(java.lang.String r2, java.lang.String r3, ru.ozon.uni.atoms.data.button.Icon r4, ru.ozon.uni.atoms.data.avatar.Avatar.Theme r5, java.lang.String r6, ru.ozon.uni.atoms.data.TestInfo r7, java.util.Map r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r2 = "ozaccentprimarypale"
        L6:
            r10 = r9 & 8
            if (r10 == 0) goto Lc
            ru.ozon.uni.atoms.data.avatar.Avatar$Theme r5 = ru.ozon.uni.atoms.data.avatar.Avatar.Theme.THEME_TYPE_MEDIUM
        Lc:
            r10 = r9 & 16
            r0 = 0
            if (r10 == 0) goto L12
            r6 = r0
        L12:
            r10 = r9 & 32
            if (r10 == 0) goto L17
            r7 = r0
        L17:
            r9 = r9 & 64
            if (r9 == 0) goto L24
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2c
        L24:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2c:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.avatar.Avatar.<init>(java.lang.String, java.lang.String, ru.ozon.uni.atoms.data.button.Icon, ru.ozon.uni.atoms.data.avatar.Avatar$Theme, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ Avatar copy$default(Avatar avatar, String str, String str2, Icon icon, Theme theme, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = avatar.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = avatar.initials;
        }
        if ((i11 & 4) != 0) {
            icon = avatar.icon;
        }
        if ((i11 & 8) != 0) {
            theme = avatar.theme;
        }
        if ((i11 & 16) != 0) {
            str3 = avatar.context;
        }
        if ((i11 & 32) != 0) {
            testInfo = avatar.testInfo;
        }
        if ((i11 & 64) != 0) {
            map = avatar.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        String str4 = str3;
        Icon icon2 = icon;
        return avatar.copy(str, str2, icon2, theme, str4, testInfo2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInitials() {
        return this.initials;
    }

    /* renamed from: component3, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
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
    public final Avatar copy(@NotNull String backgroundColor, String initials, Icon icon, @NotNull Theme theme, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new Avatar(backgroundColor, initials, icon, theme, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) other;
        return Intrinsics.d(this.backgroundColor, avatar.backgroundColor) && Intrinsics.d(this.initials, avatar.initials) && Intrinsics.d(this.icon, avatar.icon) && this.theme == avatar.theme && Intrinsics.d(this.context, avatar.context) && Intrinsics.d(this.testInfo, avatar.testInfo) && Intrinsics.d(this.trackingInfo, avatar.trackingInfo);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getInitials() {
        return this.initials;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_avatar;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
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
        int hashCode = this.backgroundColor.hashCode() * 31;
        String str = this.initials;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode3 = (this.theme.hashCode() + ((hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31)) * 31;
        String str2 = this.context;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.initials;
        Icon icon = this.icon;
        Theme theme = this.theme;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("Avatar(backgroundColor=", str, ", initials=", str2, ", icon=");
        d11.append(icon);
        d11.append(", theme=");
        d11.append(theme);
        d11.append(", context=");
        C4070a.b(d11, str3, ", testInfo=", testInfo, ", trackingInfo=");
        return P.f(d11, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.backgroundColor);
        dest.writeString(this.initials);
        Icon icon = this.icon;
        if (icon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            icon.writeToParcel(dest, flags);
        }
        dest.writeString(this.theme.name());
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
    public Avatar(@NotNull String backgroundColor, String str, Icon icon, @NotNull Theme theme, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(AtomTypeImpl.AVATAR, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.backgroundColor = backgroundColor;
        this.initials = str;
        this.icon = icon;
        this.theme = theme;
        this.context = str2;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
