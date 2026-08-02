package ru.ozon.app.android.atoms.data.disclaimer;

import D40.c;
import V.e;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.utils.OzonSpannableString;
import ru.ozon.app.android.atoms.utils.OzonSpannableStringParceler;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005BCDEFB\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010'\u001a\u00020(H\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0086\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00106J\u0006\u00107\u001a\u00020(J\u0013\u00108\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020(HÖ\u0001J\t\u0010<\u001a\u00020\nHÖ\u0001J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020(R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010)\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006G"}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "subtitle", "theme", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$Theme;", "hideIcon", "", "icon", "", "mainButton", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$MainButton;", "additionalButton", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$AdditionalButton;", "closeButton", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "common", "context", "<init>", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$Theme;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$MainButton;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$AdditionalButton;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "getSubtitle", "getTheme", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$Theme;", "getHideIcon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "()Ljava/lang/String;", "getMainButton", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$MainButton;", "getAdditionalButton", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$AdditionalButton;", "getCloseButton", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getCommon", "getContext", "getItemType", "", "isClickable", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$Theme;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$MainButton;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$AdditionalButton;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Theme", "MainButton", "AdditionalButton", "ButtonTheme", "CustomButtonTheme", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisclaimerDTO extends AtomDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<DisclaimerDTO> CREATOR = new Creator();
    private final AdditionalButton additionalButton;
    private final CommonControlSettings closeButton;
    private final CommonControlSettings common;
    private final String context;
    private final Boolean hideIcon;
    private final String icon;
    private final MainButton mainButton;
    private final OzonSpannableString subtitle;
    private final Theme theme;
    private final OzonSpannableString title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$ButtonTheme;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_INVALID", "BASE", "PRIMARY", "CUSTOM", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonTheme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonTheme[] $VALUES;

        @i(name = "THEME_INVALID")
        public static final ButtonTheme THEME_INVALID = new ButtonTheme("THEME_INVALID", 0);

        @i(name = "BASE")
        public static final ButtonTheme BASE = new ButtonTheme("BASE", 1);

        @i(name = "PRIMARY")
        public static final ButtonTheme PRIMARY = new ButtonTheme("PRIMARY", 2);

        @i(name = "CUSTOM")
        public static final ButtonTheme CUSTOM = new ButtonTheme("CUSTOM", 3);

        private static final /* synthetic */ ButtonTheme[] $values() {
            return new ButtonTheme[]{THEME_INVALID, BASE, PRIMARY, CUSTOM};
        }

        static {
            ButtonTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonTheme(String str, int i11) {
        }

        @NotNull
        public static a<ButtonTheme> getEntries() {
            return $ENTRIES;
        }

        public static ButtonTheme valueOf(String str) {
            return (ButtonTheme) Enum.valueOf(ButtonTheme.class, str);
        }

        public static ButtonTheme[] values() {
            return (ButtonTheme[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DisclaimerDTO> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            OzonSpannableString create = ozonSpannableStringParceler.create(parcel);
            OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel);
            Theme valueOf2 = parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DisclaimerDTO(create, create2, valueOf2, valueOf, parcel.readString(), parcel.readInt() == 0 ? null : MainButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdditionalButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerDTO[] newArray(int i11) {
            return new DisclaimerDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$CustomButtonTheme;", "Landroid/os/Parcelable;", "backgroundColor", "", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTextColor", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomButtonTheme implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CustomButtonTheme> CREATOR = new Creator();
        private final String backgroundColor;
        private final String textColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomButtonTheme> {
            @Override // android.os.Parcelable.Creator
            public final CustomButtonTheme createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomButtonTheme(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomButtonTheme[] newArray(int i11) {
                return new CustomButtonTheme[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CustomButtonTheme() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CustomButtonTheme copy$default(CustomButtonTheme customButtonTheme, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customButtonTheme.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = customButtonTheme.textColor;
            }
            return customButtonTheme.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final CustomButtonTheme copy(String backgroundColor, String textColor) {
            return new CustomButtonTheme(backgroundColor, textColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomButtonTheme)) {
                return false;
            }
            CustomButtonTheme customButtonTheme = (CustomButtonTheme) other;
            return Intrinsics.d(this.backgroundColor, customButtonTheme.backgroundColor) && Intrinsics.d(this.textColor, customButtonTheme.textColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.textColor;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("CustomButtonTheme(backgroundColor=", this.backgroundColor, ", textColor=", this.textColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.backgroundColor);
            dest.writeString(this.textColor);
        }

        public CustomButtonTheme(String str, String str2) {
            this.backgroundColor = str;
            this.textColor = str2;
        }

        public /* synthetic */ CustomButtonTheme(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_INVALID", "NEUTRAL", "POSITIVE", "WARNING", "NEGATIVE", "MARKETING", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;

        @i(name = "THEME_INVALID")
        public static final Theme THEME_INVALID = new Theme("THEME_INVALID", 0);

        @i(name = "NEUTRAL")
        public static final Theme NEUTRAL = new Theme("NEUTRAL", 1);

        @i(name = "POSITIVE")
        public static final Theme POSITIVE = new Theme("POSITIVE", 2);

        @i(name = "WARNING")
        public static final Theme WARNING = new Theme("WARNING", 3);

        @i(name = "NEGATIVE")
        public static final Theme NEGATIVE = new Theme("NEGATIVE", 4);

        @i(name = "MARKETING")
        public static final Theme MARKETING = new Theme("MARKETING", 5);

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{THEME_INVALID, NEUTRAL, POSITIVE, WARNING, NEGATIVE, MARKETING};
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

    public DisclaimerDTO() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ DisclaimerDTO copy$default(DisclaimerDTO disclaimerDTO, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, Theme theme, Boolean bool, String str, MainButton mainButton, AdditionalButton additionalButton, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = disclaimerDTO.title;
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString2 = disclaimerDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            theme = disclaimerDTO.theme;
        }
        if ((i11 & 8) != 0) {
            bool = disclaimerDTO.hideIcon;
        }
        if ((i11 & 16) != 0) {
            str = disclaimerDTO.icon;
        }
        if ((i11 & 32) != 0) {
            mainButton = disclaimerDTO.mainButton;
        }
        if ((i11 & 64) != 0) {
            additionalButton = disclaimerDTO.additionalButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = disclaimerDTO.closeButton;
        }
        if ((i11 & 256) != 0) {
            commonControlSettings2 = disclaimerDTO.common;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str2 = disclaimerDTO.context;
        }
        CommonControlSettings commonControlSettings3 = commonControlSettings2;
        String str3 = str2;
        AdditionalButton additionalButton2 = additionalButton;
        CommonControlSettings commonControlSettings4 = commonControlSettings;
        String str4 = str;
        MainButton mainButton2 = mainButton;
        return disclaimerDTO.copy(ozonSpannableString, ozonSpannableString2, theme, bool, str4, mainButton2, additionalButton2, commonControlSettings4, commonControlSettings3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getHideIcon() {
        return this.hideIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final MainButton getMainButton() {
        return this.mainButton;
    }

    /* renamed from: component7, reason: from getter */
    public final AdditionalButton getAdditionalButton() {
        return this.additionalButton;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component9, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final DisclaimerDTO copy(OzonSpannableString title, OzonSpannableString subtitle, Theme theme, Boolean hideIcon, String icon, MainButton mainButton, AdditionalButton additionalButton, CommonControlSettings closeButton, CommonControlSettings common, String context) {
        return new DisclaimerDTO(title, subtitle, theme, hideIcon, icon, mainButton, additionalButton, closeButton, common, context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerDTO)) {
            return false;
        }
        DisclaimerDTO disclaimerDTO = (DisclaimerDTO) other;
        return Intrinsics.d(this.title, disclaimerDTO.title) && Intrinsics.d(this.subtitle, disclaimerDTO.subtitle) && this.theme == disclaimerDTO.theme && Intrinsics.d(this.hideIcon, disclaimerDTO.hideIcon) && Intrinsics.d(this.icon, disclaimerDTO.icon) && Intrinsics.d(this.mainButton, disclaimerDTO.mainButton) && Intrinsics.d(this.additionalButton, disclaimerDTO.additionalButton) && Intrinsics.d(this.closeButton, disclaimerDTO.closeButton) && Intrinsics.d(this.common, disclaimerDTO.common) && Intrinsics.d(this.context, disclaimerDTO.context);
    }

    public final AdditionalButton getAdditionalButton() {
        return this.additionalButton;
    }

    public final CommonControlSettings getCloseButton() {
        return this.closeButton;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final Boolean getHideIcon() {
        return this.hideIcon;
    }

    public final String getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.ds_disclaimer;
    }

    public final MainButton getMainButton() {
        return this.mainButton;
    }

    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final OzonSpannableString getTitle() {
        return this.title;
    }

    public int hashCode() {
        OzonSpannableString ozonSpannableString = this.title;
        int hashCode = (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31;
        OzonSpannableString ozonSpannableString2 = this.subtitle;
        int hashCode2 = (hashCode + (ozonSpannableString2 == null ? 0 : ozonSpannableString2.hashCode())) * 31;
        Theme theme = this.theme;
        int hashCode3 = (hashCode2 + (theme == null ? 0 : theme.hashCode())) * 31;
        Boolean bool = this.hideIcon;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.icon;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        MainButton mainButton = this.mainButton;
        int hashCode6 = (hashCode5 + (mainButton == null ? 0 : mainButton.hashCode())) * 31;
        AdditionalButton additionalButton = this.additionalButton;
        int hashCode7 = (hashCode6 + (additionalButton == null ? 0 : additionalButton.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.closeButton;
        int hashCode8 = (hashCode7 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        CommonControlSettings commonControlSettings2 = this.common;
        int hashCode9 = (hashCode8 + (commonControlSettings2 == null ? 0 : commonControlSettings2.hashCode())) * 31;
        String str2 = this.context;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isClickable() {
        return this.common != null;
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.title;
        OzonSpannableString ozonSpannableString2 = this.subtitle;
        return "DisclaimerDTO(title=" + ((Object) ozonSpannableString) + ", subtitle=" + ((Object) ozonSpannableString2) + ", theme=" + this.theme + ", hideIcon=" + this.hideIcon + ", icon=" + this.icon + ", mainButton=" + this.mainButton + ", additionalButton=" + this.additionalButton + ", closeButton=" + this.closeButton + ", common=" + this.common + ", context=" + this.context + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
        ozonSpannableStringParceler.write(this.title, dest, flags);
        ozonSpannableStringParceler.write(this.subtitle, dest, flags);
        Theme theme = this.theme;
        if (theme == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(theme.name());
        }
        Boolean bool = this.hideIcon;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        dest.writeString(this.icon);
        MainButton mainButton = this.mainButton;
        if (mainButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mainButton.writeToParcel(dest, flags);
        }
        AdditionalButton additionalButton = this.additionalButton;
        if (additionalButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalButton.writeToParcel(dest, flags);
        }
        CommonControlSettings commonControlSettings = this.closeButton;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        CommonControlSettings commonControlSettings2 = this.common;
        if (commonControlSettings2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings2.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
    }

    public /* synthetic */ DisclaimerDTO(OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, Theme theme, Boolean bool, String str, MainButton mainButton, AdditionalButton additionalButton, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : ozonSpannableString, (i11 & 2) != 0 ? null : ozonSpannableString2, (i11 & 4) != 0 ? Theme.NEUTRAL : theme, (i11 & 8) != 0 ? Boolean.FALSE : bool, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : mainButton, (i11 & 64) != 0 ? null : additionalButton, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : commonControlSettings, (i11 & 256) != 0 ? null : commonControlSettings2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str2);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$AdditionalButton;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalButton implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<AdditionalButton> CREATOR = new Creator();
        private final CommonControlSettings common;

        @NotNull
        private final String title;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AdditionalButton> {
            @Override // android.os.Parcelable.Creator
            public final AdditionalButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalButton(parcel.readString(), parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AdditionalButton[] newArray(int i11) {
                return new AdditionalButton[i11];
            }
        }

        public AdditionalButton(@NotNull String title, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ AdditionalButton copy$default(AdditionalButton additionalButton, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = additionalButton.title;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = additionalButton.common;
            }
            return additionalButton.copy(str, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final AdditionalButton copy(@NotNull String title, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new AdditionalButton(title, common);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalButton)) {
                return false;
            }
            AdditionalButton additionalButton = (AdditionalButton) other;
            return Intrinsics.d(this.title, additionalButton.title) && Intrinsics.d(this.common, additionalButton.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            return "AdditionalButton(title=" + this.title + ", common=" + this.common + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            CommonControlSettings commonControlSettings = this.common;
            if (commonControlSettings == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                commonControlSettings.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ AdditionalButton(String str, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : commonControlSettings);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$MainButton;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "theme", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$ButtonTheme;", "customTheme", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$CustomButtonTheme;", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$ButtonTheme;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$CustomButtonTheme;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Ljava/lang/String;", "getTheme", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$ButtonTheme;", "getCustomTheme", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerDTO$CustomButtonTheme;", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MainButton implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<MainButton> CREATOR = new Creator();
        private final CommonControlSettings common;
        private final CustomButtonTheme customTheme;
        private final ButtonTheme theme;

        @NotNull
        private final String title;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MainButton> {
            @Override // android.os.Parcelable.Creator
            public final MainButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MainButton(parcel.readString(), parcel.readInt() == 0 ? null : ButtonTheme.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CustomButtonTheme.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final MainButton[] newArray(int i11) {
                return new MainButton[i11];
            }
        }

        public MainButton(@NotNull String title, ButtonTheme buttonTheme, CustomButtonTheme customButtonTheme, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.theme = buttonTheme;
            this.customTheme = customButtonTheme;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ MainButton copy$default(MainButton mainButton, String str, ButtonTheme buttonTheme, CustomButtonTheme customButtonTheme, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = mainButton.title;
            }
            if ((i11 & 2) != 0) {
                buttonTheme = mainButton.theme;
            }
            if ((i11 & 4) != 0) {
                customButtonTheme = mainButton.customTheme;
            }
            if ((i11 & 8) != 0) {
                commonControlSettings = mainButton.common;
            }
            return mainButton.copy(str, buttonTheme, customButtonTheme, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonTheme getTheme() {
            return this.theme;
        }

        /* renamed from: component3, reason: from getter */
        public final CustomButtonTheme getCustomTheme() {
            return this.customTheme;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final MainButton copy(@NotNull String title, ButtonTheme theme, CustomButtonTheme customTheme, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new MainButton(title, theme, customTheme, common);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainButton)) {
                return false;
            }
            MainButton mainButton = (MainButton) other;
            return Intrinsics.d(this.title, mainButton.title) && this.theme == mainButton.theme && Intrinsics.d(this.customTheme, mainButton.customTheme) && Intrinsics.d(this.common, mainButton.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final CustomButtonTheme getCustomTheme() {
            return this.customTheme;
        }

        public final ButtonTheme getTheme() {
            return this.theme;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            ButtonTheme buttonTheme = this.theme;
            int hashCode2 = (hashCode + (buttonTheme == null ? 0 : buttonTheme.hashCode())) * 31;
            CustomButtonTheme customButtonTheme = this.customTheme;
            int hashCode3 = (hashCode2 + (customButtonTheme == null ? 0 : customButtonTheme.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MainButton(title=" + this.title + ", theme=" + this.theme + ", customTheme=" + this.customTheme + ", common=" + this.common + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            ButtonTheme buttonTheme = this.theme;
            if (buttonTheme == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(buttonTheme.name());
            }
            CustomButtonTheme customButtonTheme = this.customTheme;
            if (customButtonTheme == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                customButtonTheme.writeToParcel(dest, flags);
            }
            CommonControlSettings commonControlSettings = this.common;
            if (commonControlSettings == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                commonControlSettings.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ MainButton(String str, ButtonTheme buttonTheme, CustomButtonTheme customButtonTheme, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : buttonTheme, (i11 & 4) != 0 ? null : customButtonTheme, (i11 & 8) != 0 ? null : commonControlSettings);
        }
    }

    public DisclaimerDTO(OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, Theme theme, Boolean bool, String str, MainButton mainButton, AdditionalButton additionalButton, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, String str2) {
        super(DsAtomsType.DISCLAIMER, str2, commonControlSettings2 != null ? commonControlSettings2.getTrackingInfo() : null, commonControlSettings2 != null ? commonControlSettings2.getTestInfo() : null);
        this.title = ozonSpannableString;
        this.subtitle = ozonSpannableString2;
        this.theme = theme;
        this.hideIcon = bool;
        this.icon = str;
        this.mainButton = mainButton;
        this.additionalButton = additionalButton;
        this.closeButton = commonControlSettings;
        this.common = commonControlSettings2;
        this.context = str2;
    }
}
