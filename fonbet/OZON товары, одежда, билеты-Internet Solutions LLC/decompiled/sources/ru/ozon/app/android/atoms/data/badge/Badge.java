package ru.ozon.app.android.atoms.data.badge;

import C.J;
import De.C2859b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import T7.P;
import V.e;
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
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.AtomTypeImpl;
import ru.ozon.app.android.atoms.data.TestInfo;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004MNOPB¡\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u00101\u001a\u000202H\u0016J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0017\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J±\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001J\u0006\u0010A\u001a\u000202J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u000202HÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\u0016\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u000202R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b0\u0010)¨\u0006Q"}, d2 = {"Lru/ozon/app/android/atoms/data/badge/Badge;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "text", "", "image", "tintColor", "iconTintColor", "backgroundColor", "action", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "gradientBackgroundColor", "Lru/ozon/app/android/atoms/data/badge/Badge$GradientColor;", "theme", "Lru/ozon/app/android/atoms/data/badge/Badge$StyleType;", "accessory", "Lru/ozon/app/android/atoms/data/badge/Badge$Accessory;", "_iconPosition", "Lru/ozon/app/android/atoms/data/badge/Badge$IconPosition;", "context", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/AtomActionDTO;Lru/ozon/app/android/atoms/data/badge/Badge$GradientColor;Lru/ozon/app/android/atoms/data/badge/Badge$StyleType;Lru/ozon/app/android/atoms/data/badge/Badge$Accessory;Lru/ozon/app/android/atoms/data/badge/Badge$IconPosition;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getImage", "getTintColor", "getIconTintColor", "getBackgroundColor", "getAction", "()Lru/ozon/app/android/atoms/data/AtomActionDTO;", "getGradientBackgroundColor", "()Lru/ozon/app/android/atoms/data/badge/Badge$GradientColor;", "getTheme", "()Lru/ozon/app/android/atoms/data/badge/Badge$StyleType;", "getAccessory", "()Lru/ozon/app/android/atoms/data/badge/Badge$Accessory;", "get_iconPosition", "()Lru/ozon/app/android/atoms/data/badge/Badge$IconPosition;", "getContext", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "iconPosition", "getIconPosition", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "GradientColor", "Accessory", "IconPosition", "StyleType", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Badge extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Badge> CREATOR = new Creator();
    private final IconPosition _iconPosition;
    private final Accessory accessory;
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final String context;
    private final GradientColor gradientBackgroundColor;
    private final String iconTintColor;
    private final String image;
    private final TestInfo testInfo;
    private final String text;
    private final StyleType theme;
    private final String tintColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/data/badge/Badge$Accessory;", "Landroid/os/Parcelable;", "icon", "", "iconTintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Accessory implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Accessory> CREATOR = new Creator();

        @NotNull
        private final String icon;
        private final String iconTintColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Accessory> {
            @Override // android.os.Parcelable.Creator
            public final Accessory createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Accessory(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Accessory[] newArray(int i11) {
                return new Accessory[i11];
            }
        }

        public Accessory(@NotNull String icon, String str) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.iconTintColor = str;
        }

        public static /* synthetic */ Accessory copy$default(Accessory accessory, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = accessory.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = accessory.iconTintColor;
            }
            return accessory.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        @NotNull
        public final Accessory copy(@NotNull String icon, String iconTintColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Accessory(icon, iconTintColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Accessory)) {
                return false;
            }
            Accessory accessory = (Accessory) other;
            return Intrinsics.d(this.icon, accessory.icon) && Intrinsics.d(this.iconTintColor, accessory.iconTintColor);
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.iconTintColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("Accessory(icon=", this.icon, ", iconTintColor=", this.iconTintColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.icon);
            dest.writeString(this.iconTintColor);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Badge> {
        @Override // android.os.Parcelable.Creator
        public final Badge createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel2.readString();
            String readString2 = parcel2.readString();
            String readString3 = parcel2.readString();
            String readString4 = parcel2.readString();
            String readString5 = parcel2.readString();
            LinkedHashMap linkedHashMap = null;
            AtomActionDTO createFromParcel = parcel2.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel2);
            GradientColor createFromParcel2 = parcel2.readInt() == 0 ? null : GradientColor.CREATOR.createFromParcel(parcel2);
            StyleType valueOf = parcel2.readInt() == 0 ? null : StyleType.valueOf(parcel2.readString());
            Accessory createFromParcel3 = parcel2.readInt() == 0 ? null : Accessory.CREATOR.createFromParcel(parcel2);
            IconPosition valueOf2 = parcel2.readInt() == 0 ? null : IconPosition.valueOf(parcel2.readString());
            String readString6 = parcel2.readString();
            TestInfo createFromParcel4 = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
            if (parcel2.readInt() != 0) {
                int readInt = parcel2.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(Badge.class, parcel2, linkedHashMap, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                    readInt = readInt;
                }
            }
            return new Badge(readString, readString2, readString3, readString4, readString5, createFromParcel, createFromParcel2, valueOf, createFromParcel3, valueOf2, readString6, createFromParcel4, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Badge[] newArray(int i11) {
            return new Badge[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/data/badge/Badge$GradientColor;", "Landroid/os/Parcelable;", "startColor", "", "endColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartColor", "()Ljava/lang/String;", "getEndColor", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GradientColor implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<GradientColor> CREATOR = new Creator();

        @NotNull
        private final String endColor;

        @NotNull
        private final String startColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GradientColor> {
            @Override // android.os.Parcelable.Creator
            public final GradientColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GradientColor(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GradientColor[] newArray(int i11) {
                return new GradientColor[i11];
            }
        }

        public GradientColor(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            this.startColor = startColor;
            this.endColor = endColor;
        }

        public static /* synthetic */ GradientColor copy$default(GradientColor gradientColor, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = gradientColor.startColor;
            }
            if ((i11 & 2) != 0) {
                str2 = gradientColor.endColor;
            }
            return gradientColor.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStartColor() {
            return this.startColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getEndColor() {
            return this.endColor;
        }

        @NotNull
        public final GradientColor copy(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            return new GradientColor(startColor, endColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GradientColor)) {
                return false;
            }
            GradientColor gradientColor = (GradientColor) other;
            return Intrinsics.d(this.startColor, gradientColor.startColor) && Intrinsics.d(this.endColor, gradientColor.endColor);
        }

        @NotNull
        public final String getEndColor() {
            return this.endColor;
        }

        @NotNull
        public final String getStartColor() {
            return this.startColor;
        }

        public int hashCode() {
            return this.endColor.hashCode() + (this.startColor.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("GradientColor(startColor=", this.startColor, ", endColor=", this.endColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.startColor);
            dest.writeString(this.endColor);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/badge/Badge$IconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "ICON_POSITION_INVALID", "ICON_POSITION_LEFT", "ICON_POSITION_RIGHT", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconPosition[] $VALUES;

        @i(name = "ICON_POSITION_INVALID")
        public static final IconPosition ICON_POSITION_INVALID = new IconPosition("ICON_POSITION_INVALID", 0);

        @i(name = "ICON_POSITION_LEFT")
        public static final IconPosition ICON_POSITION_LEFT = new IconPosition("ICON_POSITION_LEFT", 1);

        @i(name = "ICON_POSITION_RIGHT")
        public static final IconPosition ICON_POSITION_RIGHT = new IconPosition("ICON_POSITION_RIGHT", 2);

        private static final /* synthetic */ IconPosition[] $values() {
            return new IconPosition[]{ICON_POSITION_INVALID, ICON_POSITION_LEFT, ICON_POSITION_RIGHT};
        }

        static {
            IconPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconPosition(String str, int i11) {
        }

        @NotNull
        public static a<IconPosition> getEntries() {
            return $ENTRIES;
        }

        public static IconPosition valueOf(String str) {
            return (IconPosition) Enum.valueOf(IconPosition.class, str);
        }

        public static IconPosition[] values() {
            return (IconPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/atoms/data/badge/Badge$StyleType;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_INVALID", "STYLE_TYPE_DISCOUNT_SMALL", "STYLE_TYPE_DISCOUNT", "STYLE_TYPE_LARGE", "STYLE_TYPE_MEDIUM", "STYLE_TYPE_SMALL", "STYLE_TYPE_XSMALL", "STYLE_TYPE_PREMIUM", "STYLE_TYPE_PREMIUM_SMALL", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StyleType[] $VALUES;

        @i(name = "STYLE_TYPE_INVALID")
        public static final StyleType STYLE_TYPE_INVALID = new StyleType("STYLE_TYPE_INVALID", 0);

        @i(name = "STYLE_TYPE_DISCOUNT_SMALL")
        public static final StyleType STYLE_TYPE_DISCOUNT_SMALL = new StyleType("STYLE_TYPE_DISCOUNT_SMALL", 1);

        @i(name = "STYLE_TYPE_DISCOUNT")
        public static final StyleType STYLE_TYPE_DISCOUNT = new StyleType("STYLE_TYPE_DISCOUNT", 2);

        @i(name = "STYLE_TYPE_LARGE")
        public static final StyleType STYLE_TYPE_LARGE = new StyleType("STYLE_TYPE_LARGE", 3);

        @i(name = "STYLE_TYPE_MEDIUM")
        public static final StyleType STYLE_TYPE_MEDIUM = new StyleType("STYLE_TYPE_MEDIUM", 4);

        @i(name = "STYLE_TYPE_SMALL")
        public static final StyleType STYLE_TYPE_SMALL = new StyleType("STYLE_TYPE_SMALL", 5);

        @i(name = "STYLE_TYPE_XSMALL")
        public static final StyleType STYLE_TYPE_XSMALL = new StyleType("STYLE_TYPE_XSMALL", 6);

        @i(name = "STYLE_TYPE_PREMIUM")
        public static final StyleType STYLE_TYPE_PREMIUM = new StyleType("STYLE_TYPE_PREMIUM", 7);

        @i(name = "STYLE_TYPE_PREMIUM_SMALL")
        public static final StyleType STYLE_TYPE_PREMIUM_SMALL = new StyleType("STYLE_TYPE_PREMIUM_SMALL", 8);

        private static final /* synthetic */ StyleType[] $values() {
            return new StyleType[]{STYLE_TYPE_INVALID, STYLE_TYPE_DISCOUNT_SMALL, STYLE_TYPE_DISCOUNT, STYLE_TYPE_LARGE, STYLE_TYPE_MEDIUM, STYLE_TYPE_SMALL, STYLE_TYPE_XSMALL, STYLE_TYPE_PREMIUM, STYLE_TYPE_PREMIUM_SMALL};
        }

        static {
            StyleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StyleType(String str, int i11) {
        }

        @NotNull
        public static a<StyleType> getEntries() {
            return $ENTRIES;
        }

        public static StyleType valueOf(String str) {
            return (StyleType) Enum.valueOf(StyleType.class, str);
        }

        public static StyleType[] values() {
            return (StyleType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ Badge(String str, String str2, String str3, String str4, String str5, AtomActionDTO atomActionDTO, GradientColor gradientColor, StyleType styleType, Accessory accessory, IconPosition iconPosition, String str6, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, atomActionDTO, (i11 & 64) != 0 ? null : gradientColor, styleType, (i11 & 256) != 0 ? null : accessory, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : iconPosition, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str6, (i11 & 2048) != 0 ? null : testInfo, (i11 & 4096) != 0 ? null : map);
    }

    public static /* synthetic */ Badge copy$default(Badge badge, String str, String str2, String str3, String str4, String str5, AtomActionDTO atomActionDTO, GradientColor gradientColor, StyleType styleType, Accessory accessory, IconPosition iconPosition, String str6, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = badge.text;
        }
        return badge.copy(str, (i11 & 2) != 0 ? badge.image : str2, (i11 & 4) != 0 ? badge.tintColor : str3, (i11 & 8) != 0 ? badge.iconTintColor : str4, (i11 & 16) != 0 ? badge.backgroundColor : str5, (i11 & 32) != 0 ? badge.action : atomActionDTO, (i11 & 64) != 0 ? badge.gradientBackgroundColor : gradientColor, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? badge.theme : styleType, (i11 & 256) != 0 ? badge.accessory : accessory, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? badge._iconPosition : iconPosition, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? badge.context : str6, (i11 & 2048) != 0 ? badge.testInfo : testInfo, (i11 & 4096) != 0 ? badge.trackingInfo : map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final IconPosition get_iconPosition() {
        return this._iconPosition;
    }

    /* renamed from: component11, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component12, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component13() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final GradientColor getGradientBackgroundColor() {
        return this.gradientBackgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final StyleType getTheme() {
        return this.theme;
    }

    /* renamed from: component9, reason: from getter */
    public final Accessory getAccessory() {
        return this.accessory;
    }

    @NotNull
    public final Badge copy(String text, String image, String tintColor, String iconTintColor, String backgroundColor, AtomActionDTO action, GradientColor gradientBackgroundColor, StyleType theme, Accessory accessory, @i(name = "iconPosition") IconPosition _iconPosition, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new Badge(text, image, tintColor, iconTintColor, backgroundColor, action, gradientBackgroundColor, theme, accessory, _iconPosition, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) other;
        return Intrinsics.d(this.text, badge.text) && Intrinsics.d(this.image, badge.image) && Intrinsics.d(this.tintColor, badge.tintColor) && Intrinsics.d(this.iconTintColor, badge.iconTintColor) && Intrinsics.d(this.backgroundColor, badge.backgroundColor) && Intrinsics.d(this.action, badge.action) && Intrinsics.d(this.gradientBackgroundColor, badge.gradientBackgroundColor) && this.theme == badge.theme && Intrinsics.d(this.accessory, badge.accessory) && this._iconPosition == badge._iconPosition && Intrinsics.d(this.context, badge.context) && Intrinsics.d(this.testInfo, badge.testInfo) && Intrinsics.d(this.trackingInfo, badge.trackingInfo);
    }

    public final Accessory getAccessory() {
        return this.accessory;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final GradientColor getGradientBackgroundColor() {
        return this.gradientBackgroundColor;
    }

    @NotNull
    public final IconPosition getIconPosition() {
        IconPosition iconPosition = this._iconPosition;
        if (iconPosition != null) {
            return iconPosition;
        }
        StyleType styleType = this.theme;
        return (styleType == StyleType.STYLE_TYPE_LARGE || styleType == StyleType.STYLE_TYPE_PREMIUM || styleType == StyleType.STYLE_TYPE_PREMIUM_SMALL) ? IconPosition.ICON_POSITION_LEFT : IconPosition.ICON_POSITION_RIGHT;
    }

    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    public final String getImage() {
        return this.image;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.atom_type_badge;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getText() {
        return this.text;
    }

    public final StyleType getTheme() {
        return this.theme;
    }

    public final String getTintColor() {
        return this.tintColor;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final IconPosition get_iconPosition() {
        return this._iconPosition;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tintColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconTintColor;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        GradientColor gradientColor = this.gradientBackgroundColor;
        int hashCode7 = (hashCode6 + (gradientColor == null ? 0 : gradientColor.hashCode())) * 31;
        StyleType styleType = this.theme;
        int hashCode8 = (hashCode7 + (styleType == null ? 0 : styleType.hashCode())) * 31;
        Accessory accessory = this.accessory;
        int hashCode9 = (hashCode8 + (accessory == null ? 0 : accessory.hashCode())) * 31;
        IconPosition iconPosition = this._iconPosition;
        int hashCode10 = (hashCode9 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        String str6 = this.context;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode12 = (hashCode11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode12 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.image;
        String str3 = this.tintColor;
        String str4 = this.iconTintColor;
        String str5 = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        GradientColor gradientColor = this.gradientBackgroundColor;
        StyleType styleType = this.theme;
        Accessory accessory = this.accessory;
        IconPosition iconPosition = this._iconPosition;
        String str6 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("Badge(text=", str, ", image=", str2, ", tintColor=");
        Nh.a.h(d11, str3, ", iconTintColor=", str4, ", backgroundColor=");
        d11.append(str5);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(", gradientBackgroundColor=");
        d11.append(gradientColor);
        d11.append(", theme=");
        d11.append(styleType);
        d11.append(", accessory=");
        d11.append(accessory);
        d11.append(", _iconPosition=");
        d11.append(iconPosition);
        d11.append(", context=");
        D40.b.d(d11, str6, ", testInfo=", testInfo, ", trackingInfo=");
        return P.f(d11, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.image);
        dest.writeString(this.tintColor);
        dest.writeString(this.iconTintColor);
        dest.writeString(this.backgroundColor);
        AtomActionDTO atomActionDTO = this.action;
        if (atomActionDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            atomActionDTO.writeToParcel(dest, flags);
        }
        GradientColor gradientColor = this.gradientBackgroundColor;
        if (gradientColor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            gradientColor.writeToParcel(dest, flags);
        }
        StyleType styleType = this.theme;
        if (styleType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleType.name());
        }
        Accessory accessory = this.accessory;
        if (accessory == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            accessory.writeToParcel(dest, flags);
        }
        IconPosition iconPosition = this._iconPosition;
        if (iconPosition == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconPosition.name());
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

    public Badge(String str, String str2, String str3, String str4, String str5, AtomActionDTO atomActionDTO, GradientColor gradientColor, StyleType styleType, Accessory accessory, @i(name = "iconPosition") IconPosition iconPosition, String str6, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(AtomTypeImpl.BADGE, str6, map, testInfo);
        this.text = str;
        this.image = str2;
        this.tintColor = str3;
        this.iconTintColor = str4;
        this.backgroundColor = str5;
        this.action = atomActionDTO;
        this.gradientBackgroundColor = gradientColor;
        this.theme = styleType;
        this.accessory = accessory;
        this._iconPosition = iconPosition;
        this.context = str6;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
