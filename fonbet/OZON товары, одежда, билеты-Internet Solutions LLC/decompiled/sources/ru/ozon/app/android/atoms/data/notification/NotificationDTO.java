package ru.ozon.app.android.atoms.data.notification;

import Ef0.c;
import Fj.b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import Xc.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.app.android.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.app.android.atoms.data.icon.IconDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0005HIJKLB{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bq\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017Jy\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b/\u00100J\u0086\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0018\u00101J\u0010\u00102\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b2\u0010\"J\u0010\u00103\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b3\u0010\u0017J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b:\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b=\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bB\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\bE\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u00100¨\u0006M"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "titleMaxLines", "subtitleMaxLines", "Lru/ozon/app/android/atoms/data/notification/NotificationDTO$LeftContent;", "leftContent", "Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent;", "rightContent", "autoHideDelay", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "common", "context", "Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Preset;", "preset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$LeftContent;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Preset;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$LeftContent;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getItemType", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$LeftContent;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)Lru/ozon/app/android/atoms/data/notification/NotificationDTO;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Lru/ozon/app/android/atoms/data/notification/NotificationDTO$LeftContent;", "component6", "()Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent;", "component7", "component8", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "component9", "component10", "()Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Preset;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$LeftContent;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Preset;)Lru/ozon/app/android/atoms/data/notification/NotificationDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/lang/Integer;", "getTitleMaxLines", "getSubtitleMaxLines", "Lru/ozon/app/android/atoms/data/notification/NotificationDTO$LeftContent;", "getLeftContent", "Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent;", "getRightContent", "getAutoHideDelay", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getCommon", "getContext", "Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Preset;", "getPreset", "Companion", "LeftContent", "RightContent", "Alignment", "Preset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NotificationDTO extends AtomDTO implements Parcelable {

    @NotNull
    private static final RightContent defaultRightContent = new RightContent(null, null, new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_400, ButtonV3DTO.StyleTypes.CUSTOM, null, "ic_s_cross_filled", null, b.GRAPHIC_TERTIARY_INVERTED.e(), b.CLEAR_LIGHT_KEY_0.e(), null, Boolean.FALSE, 148, null), null, 11, null);
    private final Integer autoHideDelay;
    private final CommonControlSettings common;
    private final String context;
    private final LeftContent leftContent;
    private final Preset preset;
    private final RightContent rightContent;
    private final String subtitle;
    private final Integer subtitleMaxLines;

    @NotNull
    private final String title;
    private final Integer titleMaxLines;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<NotificationDTO> CREATOR = new Creator();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "CENTER", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class Alignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment TOP = new Alignment("TOP", 0);
        public static final Alignment CENTER = new Alignment("CENTER", 1);

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{TOP, CENTER};
        }

        static {
            Alignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Alignment(String str, int i11) {
        }

        @NotNull
        public static a<Alignment> getEntries() {
            return $ENTRIES;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Companion;", "", "<init>", "()V", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationDTO> {
        @Override // android.os.Parcelable.Creator
        public final NotificationDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotificationDTO(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : LeftContent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RightContent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Preset.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationDTO[] newArray(int i11) {
            return new NotificationDTO[i11];
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationDTO$LeftContent;", "Landroid/os/Parcelable;", "atom", "Lru/ozon/app/android/atoms/data/AtomDTO;", "alignment", "Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Alignment;", "<init>", "(Lru/ozon/app/android/atoms/data/AtomDTO;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Alignment;)V", "getAtom", "()Lru/ozon/app/android/atoms/data/AtomDTO;", "getAlignment", "()Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Alignment;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class LeftContent implements Parcelable {
        private final Alignment alignment;
        private final AtomDTO atom;

        @NotNull
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<LeftContent> CREATOR = new Creator();

        @NotNull
        private static final IconDTO defaultAtom = new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.SHAPE_SQUIRCLE_FORCE, null, new CommonAtomIconDTO("ic_m_exclamation_filled", b.GRAPHIC_TERTIARY_INVERTED.e()), null, b.BG_SECONDARY_INVERTED.e(), null, null, null, null, null, null, null, null, null, IconDTO.FitType.FILL_CENTER, 65450, null);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationDTO$LeftContent$Companion;", "", "<init>", "()V", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LeftContent> {
            @Override // android.os.Parcelable.Creator
            public final LeftContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LeftContent((AtomDTO) parcel.readParcelable(LeftContent.class.getClassLoader()), parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final LeftContent[] newArray(int i11) {
                return new LeftContent[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LeftContent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ LeftContent copy$default(LeftContent leftContent, AtomDTO atomDTO, Alignment alignment, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomDTO = leftContent.atom;
            }
            if ((i11 & 2) != 0) {
                alignment = leftContent.alignment;
            }
            return leftContent.copy(atomDTO, alignment);
        }

        /* renamed from: component1, reason: from getter */
        public final AtomDTO getAtom() {
            return this.atom;
        }

        /* renamed from: component2, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final LeftContent copy(AtomDTO atom, Alignment alignment) {
            return new LeftContent(atom, alignment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeftContent)) {
                return false;
            }
            LeftContent leftContent = (LeftContent) other;
            return Intrinsics.d(this.atom, leftContent.atom) && this.alignment == leftContent.alignment;
        }

        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final AtomDTO getAtom() {
            return this.atom;
        }

        public int hashCode() {
            AtomDTO atomDTO = this.atom;
            int hashCode = (atomDTO == null ? 0 : atomDTO.hashCode()) * 31;
            Alignment alignment = this.alignment;
            return hashCode + (alignment != null ? alignment.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LeftContent(atom=" + this.atom + ", alignment=" + this.alignment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.atom, flags);
            Alignment alignment = this.alignment;
            if (alignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(alignment.name());
            }
        }

        public LeftContent(AtomDTO atomDTO, Alignment alignment) {
            this.atom = atomDTO;
            this.alignment = alignment;
        }

        public /* synthetic */ LeftContent(AtomDTO atomDTO, Alignment alignment, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? defaultAtom : atomDTO, (i11 & 2) != 0 ? Alignment.TOP : alignment);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Preset;", "", "<init>", "(Ljava/lang/String;I)V", "CUSTOM", "INFO", "SUCCESS", "WARNING", "NEGATIVE", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class Preset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Preset[] $VALUES;
        public static final Preset CUSTOM = new Preset("CUSTOM", 0);
        public static final Preset INFO = new Preset("INFO", 1);
        public static final Preset SUCCESS = new Preset("SUCCESS", 2);
        public static final Preset WARNING = new Preset("WARNING", 3);
        public static final Preset NEGATIVE = new Preset("NEGATIVE", 4);

        private static final /* synthetic */ Preset[] $values() {
            return new Preset[]{CUSTOM, INFO, SUCCESS, WARNING, NEGATIVE};
        }

        static {
            Preset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Preset(String str, int i11) {
        }

        @NotNull
        public static a<Preset> getEntries() {
            return $ENTRIES;
        }

        public static Preset valueOf(String str) {
            return (Preset) Enum.valueOf(Preset.class, str);
        }

        public static Preset[] values() {
            return (Preset[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent;", "Landroid/os/Parcelable;", "buttonType", "Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent$ButtonType;", "button", "Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO;", "iconButton", "Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO;", "alignment", "Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Alignment;", "<init>", "(Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent$ButtonType;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Alignment;)V", "getButtonType", "()Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent$ButtonType;", "getButton", "()Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO;", "getIconButton", "()Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO;", "getAlignment", "()Lru/ozon/app/android/atoms/data/notification/NotificationDTO$Alignment;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ButtonType", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class RightContent implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<RightContent> CREATOR = new Creator();
        private final Alignment alignment;
        private final ButtonV3DTO button;
        private final ButtonType buttonType;
        private final IconButtonV3DTO iconButton;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationDTO$RightContent$ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "CLOSE", "DISCLOSURE", "BUTTON", "NONE", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class ButtonType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ButtonType[] $VALUES;
            public static final ButtonType CLOSE = new ButtonType("CLOSE", 0);
            public static final ButtonType DISCLOSURE = new ButtonType("DISCLOSURE", 1);
            public static final ButtonType BUTTON = new ButtonType("BUTTON", 2);
            public static final ButtonType NONE = new ButtonType("NONE", 3);

            private static final /* synthetic */ ButtonType[] $values() {
                return new ButtonType[]{CLOSE, DISCLOSURE, BUTTON, NONE};
            }

            static {
                ButtonType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private ButtonType(String str, int i11) {
            }

            @NotNull
            public static a<ButtonType> getEntries() {
                return $ENTRIES;
            }

            public static ButtonType valueOf(String str) {
                return (ButtonType) Enum.valueOf(ButtonType.class, str);
            }

            public static ButtonType[] values() {
                return (ButtonType[]) $VALUES.clone();
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RightContent> {
            @Override // android.os.Parcelable.Creator
            public final RightContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RightContent(parcel.readInt() == 0 ? null : ButtonType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ButtonV3DTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconButtonV3DTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Alignment.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final RightContent[] newArray(int i11) {
                return new RightContent[i11];
            }
        }

        public RightContent() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ RightContent copy$default(RightContent rightContent, ButtonType buttonType, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, Alignment alignment, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonType = rightContent.buttonType;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = rightContent.button;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = rightContent.iconButton;
            }
            if ((i11 & 8) != 0) {
                alignment = rightContent.alignment;
            }
            return rightContent.copy(buttonType, buttonV3DTO, iconButtonV3DTO, alignment);
        }

        /* renamed from: component1, reason: from getter */
        public final ButtonType getButtonType() {
            return this.buttonType;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        /* renamed from: component4, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public final RightContent copy(ButtonType buttonType, ButtonV3DTO button, IconButtonV3DTO iconButton, Alignment alignment) {
            return new RightContent(buttonType, button, iconButton, alignment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RightContent)) {
                return false;
            }
            RightContent rightContent = (RightContent) other;
            return this.buttonType == rightContent.buttonType && Intrinsics.d(this.button, rightContent.button) && Intrinsics.d(this.iconButton, rightContent.iconButton) && this.alignment == rightContent.alignment;
        }

        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final ButtonType getButtonType() {
            return this.buttonType;
        }

        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        public int hashCode() {
            ButtonType buttonType = this.buttonType;
            int hashCode = (buttonType == null ? 0 : buttonType.hashCode()) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            int hashCode3 = (hashCode2 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            Alignment alignment = this.alignment;
            return hashCode3 + (alignment != null ? alignment.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RightContent(buttonType=" + this.buttonType + ", button=" + this.button + ", iconButton=" + this.iconButton + ", alignment=" + this.alignment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ButtonType buttonType = this.buttonType;
            if (buttonType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(buttonType.name());
            }
            ButtonV3DTO buttonV3DTO = this.button;
            if (buttonV3DTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonV3DTO.writeToParcel(dest, flags);
            }
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            if (iconButtonV3DTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                iconButtonV3DTO.writeToParcel(dest, flags);
            }
            Alignment alignment = this.alignment;
            if (alignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(alignment.name());
            }
        }

        public RightContent(ButtonType buttonType, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, Alignment alignment) {
            this.buttonType = buttonType;
            this.button = buttonV3DTO;
            this.iconButton = iconButtonV3DTO;
            this.alignment = alignment;
        }

        public /* synthetic */ RightContent(ButtonType buttonType, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, Alignment alignment, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? ButtonType.CLOSE : buttonType, (i11 & 2) != 0 ? null : buttonV3DTO, (i11 & 4) != 0 ? null : iconButtonV3DTO, (i11 & 8) != 0 ? Alignment.CENTER : alignment);
        }
    }

    public /* synthetic */ NotificationDTO(String str, String str2, Integer num, Integer num2, LeftContent leftContent, RightContent rightContent, Integer num3, CommonControlSettings commonControlSettings, String str3, Preset preset, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 2 : num, (i11 & 8) != 0 ? 2 : num2, (i11 & 16) != 0 ? null : leftContent, (i11 & 32) != 0 ? defaultRightContent : rightContent, (i11 & 64) != 0 ? 5 : num3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : commonControlSettings, (i11 & 256) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? Preset.CUSTOM : preset);
    }

    public static /* synthetic */ NotificationDTO copy$default(NotificationDTO notificationDTO, String str, String str2, Integer num, Integer num2, LeftContent leftContent, RightContent rightContent, Integer num3, CommonControlSettings commonControlSettings, String str3, Preset preset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = notificationDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = notificationDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            num = notificationDTO.titleMaxLines;
        }
        if ((i11 & 8) != 0) {
            num2 = notificationDTO.subtitleMaxLines;
        }
        if ((i11 & 16) != 0) {
            leftContent = notificationDTO.leftContent;
        }
        if ((i11 & 32) != 0) {
            rightContent = notificationDTO.rightContent;
        }
        if ((i11 & 64) != 0) {
            num3 = notificationDTO.autoHideDelay;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = notificationDTO.common;
        }
        if ((i11 & 256) != 0) {
            str3 = notificationDTO.context;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            preset = notificationDTO.preset;
        }
        String str4 = str3;
        Preset preset2 = preset;
        Integer num4 = num3;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        LeftContent leftContent2 = leftContent;
        RightContent rightContent2 = rightContent;
        return notificationDTO.copy(str, str2, num, num2, leftContent2, rightContent2, num4, commonControlSettings2, str4, preset2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final Preset getPreset() {
        return this.preset;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTitleMaxLines() {
        return this.titleMaxLines;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    /* renamed from: component5, reason: from getter */
    public final LeftContent getLeftContent() {
        return this.leftContent;
    }

    /* renamed from: component6, reason: from getter */
    public final RightContent getRightContent() {
        return this.rightContent;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getAutoHideDelay() {
        return this.autoHideDelay;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component9, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final NotificationDTO copy(@NotNull String title, String subtitle, Integer titleMaxLines, Integer subtitleMaxLines, LeftContent leftContent, RightContent rightContent, Integer autoHideDelay, CommonControlSettings common, String context, Preset preset) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new NotificationDTO(title, subtitle, titleMaxLines, subtitleMaxLines, leftContent, rightContent, autoHideDelay, common, context, preset);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationDTO)) {
            return false;
        }
        NotificationDTO notificationDTO = (NotificationDTO) other;
        return Intrinsics.d(this.title, notificationDTO.title) && Intrinsics.d(this.subtitle, notificationDTO.subtitle) && Intrinsics.d(this.titleMaxLines, notificationDTO.titleMaxLines) && Intrinsics.d(this.subtitleMaxLines, notificationDTO.subtitleMaxLines) && Intrinsics.d(this.leftContent, notificationDTO.leftContent) && Intrinsics.d(this.rightContent, notificationDTO.rightContent) && Intrinsics.d(this.autoHideDelay, notificationDTO.autoHideDelay) && Intrinsics.d(this.common, notificationDTO.common) && Intrinsics.d(this.context, notificationDTO.context) && this.preset == notificationDTO.preset;
    }

    public final Integer getAutoHideDelay() {
        return this.autoHideDelay;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.notificationBar;
    }

    public final LeftContent getLeftContent() {
        return this.leftContent;
    }

    public final Preset getPreset() {
        return this.preset;
    }

    public final RightContent getRightContent() {
        return this.rightContent;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Integer getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Integer getTitleMaxLines() {
        return this.titleMaxLines;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.titleMaxLines;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.subtitleMaxLines;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        LeftContent leftContent = this.leftContent;
        int hashCode5 = (hashCode4 + (leftContent == null ? 0 : leftContent.hashCode())) * 31;
        RightContent rightContent = this.rightContent;
        int hashCode6 = (hashCode5 + (rightContent == null ? 0 : rightContent.hashCode())) * 31;
        Integer num3 = this.autoHideDelay;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode8 = (hashCode7 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str2 = this.context;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Preset preset = this.preset;
        return hashCode9 + (preset != null ? preset.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        Integer num = this.titleMaxLines;
        Integer num2 = this.subtitleMaxLines;
        LeftContent leftContent = this.leftContent;
        RightContent rightContent = this.rightContent;
        Integer num3 = this.autoHideDelay;
        CommonControlSettings commonControlSettings = this.common;
        String str3 = this.context;
        Preset preset = this.preset;
        StringBuilder d11 = C3660k.d("NotificationDTO(title=", str, ", subtitle=", str2, ", titleMaxLines=");
        c.e(d11, num, ", subtitleMaxLines=", num2, ", leftContent=");
        d11.append(leftContent);
        d11.append(", rightContent=");
        d11.append(rightContent);
        d11.append(", autoHideDelay=");
        d11.append(num3);
        d11.append(", common=");
        d11.append(commonControlSettings);
        d11.append(", context=");
        d11.append(str3);
        d11.append(", preset=");
        d11.append(preset);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        Integer num = this.titleMaxLines;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        Integer num2 = this.subtitleMaxLines;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num2);
        }
        LeftContent leftContent = this.leftContent;
        if (leftContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            leftContent.writeToParcel(dest, flags);
        }
        RightContent rightContent = this.rightContent;
        if (rightContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rightContent.writeToParcel(dest, flags);
        }
        Integer num3 = this.autoHideDelay;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num3);
        }
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
        Preset preset = this.preset;
        if (preset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(preset.name());
        }
    }

    public static /* synthetic */ NotificationDTO copy$default(NotificationDTO notificationDTO, String str, String str2, Integer num, Integer num2, LeftContent leftContent, RightContent rightContent, Integer num3, CommonControlSettings commonControlSettings, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = notificationDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = notificationDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            num = notificationDTO.titleMaxLines;
        }
        if ((i11 & 8) != 0) {
            num2 = notificationDTO.subtitleMaxLines;
        }
        if ((i11 & 16) != 0) {
            leftContent = notificationDTO.leftContent;
        }
        if ((i11 & 32) != 0) {
            rightContent = notificationDTO.rightContent;
        }
        if ((i11 & 64) != 0) {
            num3 = notificationDTO.autoHideDelay;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = notificationDTO.common;
        }
        if ((i11 & 256) != 0) {
            str3 = notificationDTO.getContext();
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        String str4 = str3;
        RightContent rightContent2 = rightContent;
        Integer num4 = num3;
        LeftContent leftContent2 = leftContent;
        Integer num5 = num;
        return notificationDTO.copy(str, str2, num5, num2, leftContent2, rightContent2, num4, commonControlSettings2, str4);
    }

    @InterfaceC3999a
    public final /* synthetic */ NotificationDTO copy(String title, String subtitle, Integer titleMaxLines, Integer subtitleMaxLines, LeftContent leftContent, RightContent rightContent, Integer autoHideDelay, CommonControlSettings common, String context) {
        Intrinsics.checkNotNullParameter(title, "title");
        return copy(title, subtitle, titleMaxLines, subtitleMaxLines, leftContent, rightContent, autoHideDelay, common, context, this.preset);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationDTO(@NotNull String title, String str, Integer num, Integer num2, LeftContent leftContent, RightContent rightContent, Integer num3, CommonControlSettings commonControlSettings, String str2, Preset preset) {
        super(DsAtomsType.NOTIFICATION, str2, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.titleMaxLines = num;
        this.subtitleMaxLines = num2;
        this.leftContent = leftContent;
        this.rightContent = rightContent;
        this.autoHideDelay = num3;
        this.common = commonControlSettings;
        this.context = str2;
        this.preset = preset;
    }

    public /* synthetic */ NotificationDTO(String str, String str2, Integer num, Integer num2, LeftContent leftContent, RightContent rightContent, Integer num3, CommonControlSettings commonControlSettings, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 2 : num, (i11 & 8) != 0 ? 2 : num2, (i11 & 16) != 0 ? null : leftContent, (i11 & 32) != 0 ? defaultRightContent : rightContent, (i11 & 64) != 0 ? 5 : num3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : commonControlSettings, (i11 & 256) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public /* synthetic */ NotificationDTO(String title, String str, Integer num, Integer num2, LeftContent leftContent, RightContent rightContent, Integer num3, CommonControlSettings commonControlSettings, String str2) {
        this(title, str, num, num2, leftContent, rightContent, num3, commonControlSettings, str2, Preset.CUSTOM);
        Intrinsics.checkNotNullParameter(title, "title");
    }
}
