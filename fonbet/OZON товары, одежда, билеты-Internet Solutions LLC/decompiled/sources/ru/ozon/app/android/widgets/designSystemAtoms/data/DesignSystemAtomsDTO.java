package ru.ozon.app.android.widgets.designSystemAtoms.data;

import D3.g;
import D40.c;
import De.C2860c;
import GZ.e;
import N3.C3660k;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.proto.OneOfSignature;
import ru.ozon.app.android.atoms.proto.ProtoOneOf;
import ru.ozon.app.android.platform.widgets.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.AtomType;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.cell.BadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.BadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ButtonIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureBadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureBadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorBadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorBadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconButtonIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorBadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorBadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.RadioTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ToggleTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.DataButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconCellCardDTO;
import ru.ozon.uni.atoms.data.controls.button.IconLabelButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IndicatorLabelButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.InputSelectButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.IconChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.image.ImageFixedDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.labelRating.LabelRatingDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0005$%&'(B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015JH\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015¨\u0006)"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;", "", "atom", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomLayoutRule", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$AtomLayoutRule;", "widgetWidthPercent", "", "showWidgetBackground", "", "tagSupported", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$AtomLayoutRule;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getAtomLayoutRule", "()Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$AtomLayoutRule;", "getWidgetWidthPercent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowWidgetBackground", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTagSupported", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$AtomLayoutRule;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;", "equals", "other", "hashCode", "toString", "", "AtomLayoutRule", "TestOnlyTextAreaDTO", "Type", "State", "Status", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DesignSystemAtomsDTO {
    public static final int $stable = AtomDTO.$stable;

    @NotNull
    private final AtomDTO atom;
    private final AtomLayoutRule atomLayoutRule;
    private final Boolean showWidgetBackground;
    private final Boolean tagSupported;
    private final Integer widgetWidthPercent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$AtomLayoutRule;", "", "<init>", "(Ljava/lang/String;I)V", "ATOM_CONTENT", "WIDGET_WIDTH", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AtomLayoutRule {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AtomLayoutRule[] $VALUES;
        public static final AtomLayoutRule ATOM_CONTENT = new AtomLayoutRule("ATOM_CONTENT", 0);
        public static final AtomLayoutRule WIDGET_WIDTH = new AtomLayoutRule("WIDGET_WIDTH", 1);

        private static final /* synthetic */ AtomLayoutRule[] $values() {
            return new AtomLayoutRule[]{ATOM_CONTENT, WIDGET_WIDTH};
        }

        static {
            AtomLayoutRule[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AtomLayoutRule(String str, int i11) {
        }

        public static AtomLayoutRule valueOf(String str) {
            return (AtomLayoutRule) Enum.valueOf(AtomLayoutRule.class, str);
        }

        public static AtomLayoutRule[] values() {
            return (AtomLayoutRule[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$State;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_DEFAULT", "STATE_ACTIVE", "STATE_DISABLED", "STATE_READONLY", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State STATE_DEFAULT = new State("STATE_DEFAULT", 0);
        public static final State STATE_ACTIVE = new State("STATE_ACTIVE", 1);
        public static final State STATE_DISABLED = new State("STATE_DISABLED", 2);
        public static final State STATE_READONLY = new State("STATE_READONLY", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{STATE_DEFAULT, STATE_ACTIVE, STATE_DISABLED, STATE_READONLY};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Status;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_NEUTRAL", "STATUS_SUCCESS", "STATUS_ERROR", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status STATUS_NEUTRAL = new Status("STATUS_NEUTRAL", 0);
        public static final Status STATUS_SUCCESS = new Status("STATUS_SUCCESS", 1);
        public static final Status STATUS_ERROR = new Status("STATUS_ERROR", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{STATUS_NEUTRAL, STATUS_SUCCESS, STATUS_ERROR};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Status(String str, int i11) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u00106\u001a\u00020\tH\u0016J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010A\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010F\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010G\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jæ\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010JJ\u0006\u0010K\u001a\u00020\tJ\u0013\u0010L\u001a\u00020\u000f2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\tHÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001J\u0016\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b/\u0010+R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b0\u0010+R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010%\u001a\u0004\b1\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\u0017\u0010+R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010%\u001a\u0004\b4\u0010$R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\u0019\u0010+R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001e¨\u0006V"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$TestOnlyTextAreaDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "label", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "caption", "textAreaType", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Type;", "rows", "", "state", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$State;", "status", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Status;", "hasScrollBar", "", "infoAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "hasBottomBar", "hasCounter", "maxCounter", "currentCounterColor", "captionColor", "isCaptionTagSupported", "captionNumberOfLines", "isDeleteAllButtonAllowed", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Type;Ljava/lang/Integer;Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$State;Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Status;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getValue", "getCaption", "getTextAreaType", "()Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Type;", "getRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getState", "()Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$State;", "getStatus", "()Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Status;", "getHasScrollBar", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInfoAction", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getHasBottomBar", "getHasCounter", "getMaxCounter", "getCurrentCounterColor", "getCaptionColor", "getCaptionNumberOfLines", "getContext", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Type;Ljava/lang/Integer;Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$State;Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Status;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$TestOnlyTextAreaDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TestOnlyTextAreaDTO extends AtomDTO {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<TestOnlyTextAreaDTO> CREATOR = new Creator();
        private final String caption;
        private final String captionColor;
        private final Integer captionNumberOfLines;
        private final String context;
        private final String currentCounterColor;
        private final Boolean hasBottomBar;
        private final Boolean hasCounter;
        private final Boolean hasScrollBar;
        private final CommonControlSettings infoAction;
        private final Boolean isCaptionTagSupported;
        private final Boolean isDeleteAllButtonAllowed;
        private final String label;
        private final Integer maxCounter;
        private final Integer rows;
        private final State state;
        private final Status status;
        private final Type textAreaType;
        private final String value;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TestOnlyTextAreaDTO> {
            @Override // android.os.Parcelable.Creator
            public final TestOnlyTextAreaDTO createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                Boolean bool = null;
                Type valueOf5 = parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString());
                Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                State valueOf7 = parcel.readInt() == 0 ? null : State.valueOf(parcel.readString());
                Status valueOf8 = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                CommonControlSettings commonControlSettings = (CommonControlSettings) parcel.readParcelable(TestOnlyTextAreaDTO.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z11 = false;
                Boolean bool2 = valueOf3;
                String readString4 = parcel.readString();
                Boolean bool3 = valueOf2;
                Integer num = valueOf9;
                String readString5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() != 0) {
                        z11 = true;
                    }
                    bool = Boolean.valueOf(z11);
                }
                return new TestOnlyTextAreaDTO(readString, readString2, readString3, valueOf5, valueOf6, valueOf7, valueOf8, valueOf, commonControlSettings, bool3, bool2, num, readString4, readString5, valueOf4, valueOf10, bool, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TestOnlyTextAreaDTO[] newArray(int i11) {
                return new TestOnlyTextAreaDTO[i11];
            }
        }

        public TestOnlyTextAreaDTO(String str, String str2, String str3, Type type, Integer num, State state, Status status, Boolean bool, CommonControlSettings commonControlSettings, Boolean bool2, Boolean bool3, Integer num2, String str4, String str5, Boolean bool4, Integer num3, Boolean bool5, String str6) {
            super(new AtomType() { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTO.TestOnlyTextAreaDTO.1
                @Override // ru.ozon.uni.atoms.data.AtomType
                public String getValue() {
                    return SelectionItemFormDTO.TEXT_AREA_FIELD_NAME;
                }
            }, str6, null, null, 12, null);
            this.label = str;
            this.value = str2;
            this.caption = str3;
            this.textAreaType = type;
            this.rows = num;
            this.state = state;
            this.status = status;
            this.hasScrollBar = bool;
            this.infoAction = commonControlSettings;
            this.hasBottomBar = bool2;
            this.hasCounter = bool3;
            this.maxCounter = num2;
            this.currentCounterColor = str4;
            this.captionColor = str5;
            this.isCaptionTagSupported = bool4;
            this.captionNumberOfLines = num3;
            this.isDeleteAllButtonAllowed = bool5;
            this.context = str6;
        }

        public static /* synthetic */ TestOnlyTextAreaDTO copy$default(TestOnlyTextAreaDTO testOnlyTextAreaDTO, String str, String str2, String str3, Type type, Integer num, State state, Status status, Boolean bool, CommonControlSettings commonControlSettings, Boolean bool2, Boolean bool3, Integer num2, String str4, String str5, Boolean bool4, Integer num3, Boolean bool5, String str6, int i11, Object obj) {
            String str7;
            Boolean bool6;
            String str8 = (i11 & 1) != 0 ? testOnlyTextAreaDTO.label : str;
            String str9 = (i11 & 2) != 0 ? testOnlyTextAreaDTO.value : str2;
            String str10 = (i11 & 4) != 0 ? testOnlyTextAreaDTO.caption : str3;
            Type type2 = (i11 & 8) != 0 ? testOnlyTextAreaDTO.textAreaType : type;
            Integer num4 = (i11 & 16) != 0 ? testOnlyTextAreaDTO.rows : num;
            State state2 = (i11 & 32) != 0 ? testOnlyTextAreaDTO.state : state;
            Status status2 = (i11 & 64) != 0 ? testOnlyTextAreaDTO.status : status;
            Boolean bool7 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? testOnlyTextAreaDTO.hasScrollBar : bool;
            CommonControlSettings commonControlSettings2 = (i11 & 256) != 0 ? testOnlyTextAreaDTO.infoAction : commonControlSettings;
            Boolean bool8 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? testOnlyTextAreaDTO.hasBottomBar : bool2;
            Boolean bool9 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? testOnlyTextAreaDTO.hasCounter : bool3;
            Integer num5 = (i11 & 2048) != 0 ? testOnlyTextAreaDTO.maxCounter : num2;
            String str11 = (i11 & 4096) != 0 ? testOnlyTextAreaDTO.currentCounterColor : str4;
            String str12 = (i11 & 8192) != 0 ? testOnlyTextAreaDTO.captionColor : str5;
            String str13 = str8;
            Boolean bool10 = (i11 & 16384) != 0 ? testOnlyTextAreaDTO.isCaptionTagSupported : bool4;
            Integer num6 = (i11 & 32768) != 0 ? testOnlyTextAreaDTO.captionNumberOfLines : num3;
            Boolean bool11 = (i11 & 65536) != 0 ? testOnlyTextAreaDTO.isDeleteAllButtonAllowed : bool5;
            if ((i11 & 131072) != 0) {
                bool6 = bool11;
                str7 = testOnlyTextAreaDTO.context;
            } else {
                str7 = str6;
                bool6 = bool11;
            }
            return testOnlyTextAreaDTO.copy(str13, str9, str10, type2, num4, state2, status2, bool7, commonControlSettings2, bool8, bool9, num5, str11, str12, bool10, num6, bool6, str7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getHasBottomBar() {
            return this.hasBottomBar;
        }

        /* renamed from: component11, reason: from getter */
        public final Boolean getHasCounter() {
            return this.hasCounter;
        }

        /* renamed from: component12, reason: from getter */
        public final Integer getMaxCounter() {
            return this.maxCounter;
        }

        /* renamed from: component13, reason: from getter */
        public final String getCurrentCounterColor() {
            return this.currentCounterColor;
        }

        /* renamed from: component14, reason: from getter */
        public final String getCaptionColor() {
            return this.captionColor;
        }

        /* renamed from: component15, reason: from getter */
        public final Boolean getIsCaptionTagSupported() {
            return this.isCaptionTagSupported;
        }

        /* renamed from: component16, reason: from getter */
        public final Integer getCaptionNumberOfLines() {
            return this.captionNumberOfLines;
        }

        /* renamed from: component17, reason: from getter */
        public final Boolean getIsDeleteAllButtonAllowed() {
            return this.isDeleteAllButtonAllowed;
        }

        /* renamed from: component18, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCaption() {
            return this.caption;
        }

        /* renamed from: component4, reason: from getter */
        public final Type getTextAreaType() {
            return this.textAreaType;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getRows() {
            return this.rows;
        }

        /* renamed from: component6, reason: from getter */
        public final State getState() {
            return this.state;
        }

        /* renamed from: component7, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component8, reason: from getter */
        public final Boolean getHasScrollBar() {
            return this.hasScrollBar;
        }

        /* renamed from: component9, reason: from getter */
        public final CommonControlSettings getInfoAction() {
            return this.infoAction;
        }

        @NotNull
        public final TestOnlyTextAreaDTO copy(String label, String value, String caption, Type textAreaType, Integer rows, State state, Status status, Boolean hasScrollBar, CommonControlSettings infoAction, Boolean hasBottomBar, Boolean hasCounter, Integer maxCounter, String currentCounterColor, String captionColor, Boolean isCaptionTagSupported, Integer captionNumberOfLines, Boolean isDeleteAllButtonAllowed, String context) {
            return new TestOnlyTextAreaDTO(label, value, caption, textAreaType, rows, state, status, hasScrollBar, infoAction, hasBottomBar, hasCounter, maxCounter, currentCounterColor, captionColor, isCaptionTagSupported, captionNumberOfLines, isDeleteAllButtonAllowed, context);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TestOnlyTextAreaDTO)) {
                return false;
            }
            TestOnlyTextAreaDTO testOnlyTextAreaDTO = (TestOnlyTextAreaDTO) other;
            return Intrinsics.d(this.label, testOnlyTextAreaDTO.label) && Intrinsics.d(this.value, testOnlyTextAreaDTO.value) && Intrinsics.d(this.caption, testOnlyTextAreaDTO.caption) && this.textAreaType == testOnlyTextAreaDTO.textAreaType && Intrinsics.d(this.rows, testOnlyTextAreaDTO.rows) && this.state == testOnlyTextAreaDTO.state && this.status == testOnlyTextAreaDTO.status && Intrinsics.d(this.hasScrollBar, testOnlyTextAreaDTO.hasScrollBar) && Intrinsics.d(this.infoAction, testOnlyTextAreaDTO.infoAction) && Intrinsics.d(this.hasBottomBar, testOnlyTextAreaDTO.hasBottomBar) && Intrinsics.d(this.hasCounter, testOnlyTextAreaDTO.hasCounter) && Intrinsics.d(this.maxCounter, testOnlyTextAreaDTO.maxCounter) && Intrinsics.d(this.currentCounterColor, testOnlyTextAreaDTO.currentCounterColor) && Intrinsics.d(this.captionColor, testOnlyTextAreaDTO.captionColor) && Intrinsics.d(this.isCaptionTagSupported, testOnlyTextAreaDTO.isCaptionTagSupported) && Intrinsics.d(this.captionNumberOfLines, testOnlyTextAreaDTO.captionNumberOfLines) && Intrinsics.d(this.isDeleteAllButtonAllowed, testOnlyTextAreaDTO.isDeleteAllButtonAllowed) && Intrinsics.d(this.context, testOnlyTextAreaDTO.context);
        }

        public final String getCaption() {
            return this.caption;
        }

        public final String getCaptionColor() {
            return this.captionColor;
        }

        public final Integer getCaptionNumberOfLines() {
            return this.captionNumberOfLines;
        }

        @Override // ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final String getCurrentCounterColor() {
            return this.currentCounterColor;
        }

        public final Boolean getHasBottomBar() {
            return this.hasBottomBar;
        }

        public final Boolean getHasCounter() {
            return this.hasCounter;
        }

        public final Boolean getHasScrollBar() {
            return this.hasScrollBar;
        }

        public final CommonControlSettings getInfoAction() {
            return this.infoAction;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.textArea;
        }

        public final String getLabel() {
            return this.label;
        }

        public final Integer getMaxCounter() {
            return this.maxCounter;
        }

        public final Integer getRows() {
            return this.rows;
        }

        public final State getState() {
            return this.state;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final Type getTextAreaType() {
            return this.textAreaType;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.label;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.caption;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Type type = this.textAreaType;
            int hashCode4 = (hashCode3 + (type == null ? 0 : type.hashCode())) * 31;
            Integer num = this.rows;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            State state = this.state;
            int hashCode6 = (hashCode5 + (state == null ? 0 : state.hashCode())) * 31;
            Status status = this.status;
            int hashCode7 = (hashCode6 + (status == null ? 0 : status.hashCode())) * 31;
            Boolean bool = this.hasScrollBar;
            int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.infoAction;
            int hashCode9 = (hashCode8 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            Boolean bool2 = this.hasBottomBar;
            int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.hasCounter;
            int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num2 = this.maxCounter;
            int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.currentCounterColor;
            int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.captionColor;
            int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool4 = this.isCaptionTagSupported;
            int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Integer num3 = this.captionNumberOfLines;
            int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Boolean bool5 = this.isDeleteAllButtonAllowed;
            int hashCode17 = (hashCode16 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            String str6 = this.context;
            return hashCode17 + (str6 != null ? str6.hashCode() : 0);
        }

        public final Boolean isCaptionTagSupported() {
            return this.isCaptionTagSupported;
        }

        public final Boolean isDeleteAllButtonAllowed() {
            return this.isDeleteAllButtonAllowed;
        }

        @NotNull
        public String toString() {
            String str = this.label;
            String str2 = this.value;
            String str3 = this.caption;
            Type type = this.textAreaType;
            Integer num = this.rows;
            State state = this.state;
            Status status = this.status;
            Boolean bool = this.hasScrollBar;
            CommonControlSettings commonControlSettings = this.infoAction;
            Boolean bool2 = this.hasBottomBar;
            Boolean bool3 = this.hasCounter;
            Integer num2 = this.maxCounter;
            String str4 = this.currentCounterColor;
            String str5 = this.captionColor;
            Boolean bool4 = this.isCaptionTagSupported;
            Integer num3 = this.captionNumberOfLines;
            Boolean bool5 = this.isDeleteAllButtonAllowed;
            String str6 = this.context;
            StringBuilder d11 = C3660k.d("TestOnlyTextAreaDTO(label=", str, ", value=", str2, ", caption=");
            d11.append(str3);
            d11.append(", textAreaType=");
            d11.append(type);
            d11.append(", rows=");
            d11.append(num);
            d11.append(", state=");
            d11.append(state);
            d11.append(", status=");
            d11.append(status);
            d11.append(", hasScrollBar=");
            d11.append(bool);
            d11.append(", infoAction=");
            d11.append(commonControlSettings);
            d11.append(", hasBottomBar=");
            d11.append(bool2);
            d11.append(", hasCounter=");
            e.d(bool3, num2, ", maxCounter=", ", currentCounterColor=", d11);
            Nh.a.h(d11, str4, ", captionColor=", str5, ", isCaptionTagSupported=");
            e.d(bool4, num3, ", captionNumberOfLines=", ", isDeleteAllButtonAllowed=", d11);
            d11.append(bool5);
            d11.append(", context=");
            d11.append(str6);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.label);
            dest.writeString(this.value);
            dest.writeString(this.caption);
            Type type = this.textAreaType;
            if (type == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(type.name());
            }
            Integer num = this.rows;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            State state = this.state;
            if (state == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(state.name());
            }
            Status status = this.status;
            if (status == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(status.name());
            }
            Boolean bool = this.hasScrollBar;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
            dest.writeParcelable(this.infoAction, flags);
            Boolean bool2 = this.hasBottomBar;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool2);
            }
            Boolean bool3 = this.hasCounter;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool3);
            }
            Integer num2 = this.maxCounter;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
            dest.writeString(this.currentCounterColor);
            dest.writeString(this.captionColor);
            Boolean bool4 = this.isCaptionTagSupported;
            if (bool4 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool4);
            }
            Integer num3 = this.captionNumberOfLines;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num3);
            }
            Boolean bool5 = this.isDeleteAllButtonAllowed;
            if (bool5 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool5);
            }
            dest.writeString(this.context);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Type;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_RESIZABLE", "TYPE_FIXED", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type TYPE_RESIZABLE = new Type("TYPE_RESIZABLE", 0);
        public static final Type TYPE_FIXED = new Type("TYPE_FIXED", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TYPE_RESIZABLE, TYPE_FIXED};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public DesignSystemAtomsDTO(@ProtoOneOf(label = "type", signatures = {@OneOfSignature(name = "badge", type = BadgeDTO.class), @OneOfSignature(name = "badgeOld", type = Badge.class), @OneOfSignature(name = "badgeList", type = BadgeListDTO.class), @OneOfSignature(name = "icon", type = IconDTO.class), @OneOfSignature(name = "indicator", type = IndicatorDTO.class), @OneOfSignature(name = "textOld", type = TextAtom.class), @OneOfSignature(name = "text", type = TextDTO.class), @OneOfSignature(name = "expandableText", type = ExpandableTextDTO.class), @OneOfSignature(name = "priceV2", type = PriceDTO.class), @OneOfSignature(name = "price", type = Price.class), @OneOfSignature(name = "checkBox", type = CheckBoxDTO.class), @OneOfSignature(name = "radioButton", type = RadioDTO.class), @OneOfSignature(name = "toggle", type = ToggleDTO.class), @OneOfSignature(name = "dsCell", type = CellDTO.class), @OneOfSignature(name = "badgeTitleSubtitleCell", type = BadgeTitleSubtitleCellDTO.class), @OneOfSignature(name = "badgeIconTitleSubtitleCell", type = BadgeIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureTitleSubtitleCell", type = DisclosureTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureIconTitleSubtitleCell", type = DisclosureIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureBadgeTitleSubtitleCell", type = DisclosureBadgeTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureBadgeIconTitleSubtitleCell", type = DisclosureBadgeIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureIndicatorTitleSubtitleCell", type = DisclosureIndicatorTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureIndicatorIconTitleSubtitleCell", type = DisclosureIndicatorIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureIndicatorBadgeTitleSubtitleCell", type = DisclosureIndicatorBadgeTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureIndicatorBadgeIconTitleSubtitleCell", type = DisclosureIndicatorBadgeIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "iconTitleSubtitleCell", type = IconTitleSubtitleCellDTO.class), @OneOfSignature(name = "indicatorTitleSubtitleCell", type = IndicatorTitleSubtitleCellDTO.class), @OneOfSignature(name = "indicatorIconTitleSubtitleCell", type = IndicatorIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "indicatorBadgeTitleSubtitleCell", type = IndicatorBadgeTitleSubtitleCellDTO.class), @OneOfSignature(name = "indicatorBadgeIconTitleSubtitleCell", type = IndicatorBadgeIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "checkboxTitleSubtitleCell", type = CheckboxTitleSubtitleCellDTO.class), @OneOfSignature(name = "radioTitleSubtitleCell", type = RadioTitleSubtitleCellDTO.class), @OneOfSignature(name = "toggleTitleSubtitleCell", type = ToggleTitleSubtitleCellDTO.class), @OneOfSignature(name = "titleSubtitleCell", type = TitleSubtitleCellDTO.class), @OneOfSignature(name = "button", type = ButtonDTO.class), @OneOfSignature(name = "dataButton", type = DataButtonDTO.class), @OneOfSignature(name = "iconButton", type = IconButtonDTO.class), @OneOfSignature(name = "iconCellCard", type = IconCellCardDTO.class), @OneOfSignature(name = "iconLabelButton", type = IconLabelButtonDTO.class), @OneOfSignature(name = "indicatorLabelButton", type = IndicatorLabelButtonDTO.class), @OneOfSignature(name = "uncontainedButton", type = UncontainedButtonDTO.class), @OneOfSignature(name = "uncontainedIconLabelButton", type = UncontainedIconLabelButtonDTO.class), @OneOfSignature(name = "buttonTitleSubtitleCell", type = ButtonTitleSubtitleCellDTO.class), @OneOfSignature(name = "buttonIconTitleSubtitleCell", type = ButtonIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "iconButtonTitleSubtitleCell", type = IconButtonTitleSubtitleCellDTO.class), @OneOfSignature(name = "iconButtonIconTitleSubtitleCell", type = IconButtonIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "chip", type = ChipDTO.class), @OneOfSignature(name = "iconChip", type = IconChipDTO.class), @OneOfSignature(name = "indicatorLabelChip", type = IndicatorLabelChipDTO.class), @OneOfSignature(name = "image", type = ImageDTO.class), @OneOfSignature(name = "imageFixed", type = ImageFixedDTO.class), @OneOfSignature(name = "imageTitleSubtitleCell", type = ImageTitleSubtitleCellDTO.class), @OneOfSignature(name = "rating", type = RatingDTO.class), @OneOfSignature(name = "labelRating", type = LabelRatingDTO.class), @OneOfSignature(name = "buttonV3", type = ButtonV3DTO.class), @OneOfSignature(name = "iconButtonV3", type = IconButtonV3DTO.class), @OneOfSignature(name = "tagButton", type = TagButtonDTO.class), @OneOfSignature(name = "inputSelectButton", type = InputSelectButtonDTO.class), @OneOfSignature(name = "notificationBar", type = NotificationDTO.class), @OneOfSignature(name = "testOnlyTextArea", type = TestOnlyTextAreaDTO.class), @OneOfSignature(name = "aspect", type = AspectDTO.class), @OneOfSignature(name = "productMedia", type = ProductMediaDTO.class), @OneOfSignature(name = "tabs", type = TabsDTO.class), @OneOfSignature(name = "disclaimer", type = DisclaimerDTO.class)}) @NotNull AtomDTO atom, AtomLayoutRule atomLayoutRule, Integer num, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        this.atom = atom;
        this.atomLayoutRule = atomLayoutRule;
        this.widgetWidthPercent = num;
        this.showWidgetBackground = bool;
        this.tagSupported = bool2;
    }

    public static /* synthetic */ DesignSystemAtomsDTO copy$default(DesignSystemAtomsDTO designSystemAtomsDTO, AtomDTO atomDTO, AtomLayoutRule atomLayoutRule, Integer num, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomDTO = designSystemAtomsDTO.atom;
        }
        if ((i11 & 2) != 0) {
            atomLayoutRule = designSystemAtomsDTO.atomLayoutRule;
        }
        if ((i11 & 4) != 0) {
            num = designSystemAtomsDTO.widgetWidthPercent;
        }
        if ((i11 & 8) != 0) {
            bool = designSystemAtomsDTO.showWidgetBackground;
        }
        if ((i11 & 16) != 0) {
            bool2 = designSystemAtomsDTO.tagSupported;
        }
        Boolean bool3 = bool2;
        Integer num2 = num;
        return designSystemAtomsDTO.copy(atomDTO, atomLayoutRule, num2, bool, bool3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AtomDTO getAtom() {
        return this.atom;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomLayoutRule getAtomLayoutRule() {
        return this.atomLayoutRule;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getWidgetWidthPercent() {
        return this.widgetWidthPercent;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getShowWidgetBackground() {
        return this.showWidgetBackground;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getTagSupported() {
        return this.tagSupported;
    }

    @NotNull
    public final DesignSystemAtomsDTO copy(@ProtoOneOf(label = "type", signatures = {@OneOfSignature(name = "badge", type = BadgeDTO.class), @OneOfSignature(name = "badgeOld", type = Badge.class), @OneOfSignature(name = "badgeList", type = BadgeListDTO.class), @OneOfSignature(name = "icon", type = IconDTO.class), @OneOfSignature(name = "indicator", type = IndicatorDTO.class), @OneOfSignature(name = "textOld", type = TextAtom.class), @OneOfSignature(name = "text", type = TextDTO.class), @OneOfSignature(name = "expandableText", type = ExpandableTextDTO.class), @OneOfSignature(name = "priceV2", type = PriceDTO.class), @OneOfSignature(name = "price", type = Price.class), @OneOfSignature(name = "checkBox", type = CheckBoxDTO.class), @OneOfSignature(name = "radioButton", type = RadioDTO.class), @OneOfSignature(name = "toggle", type = ToggleDTO.class), @OneOfSignature(name = "dsCell", type = CellDTO.class), @OneOfSignature(name = "badgeTitleSubtitleCell", type = BadgeTitleSubtitleCellDTO.class), @OneOfSignature(name = "badgeIconTitleSubtitleCell", type = BadgeIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureTitleSubtitleCell", type = DisclosureTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureIconTitleSubtitleCell", type = DisclosureIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureBadgeTitleSubtitleCell", type = DisclosureBadgeTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureBadgeIconTitleSubtitleCell", type = DisclosureBadgeIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureIndicatorTitleSubtitleCell", type = DisclosureIndicatorTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureIndicatorIconTitleSubtitleCell", type = DisclosureIndicatorIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureIndicatorBadgeTitleSubtitleCell", type = DisclosureIndicatorBadgeTitleSubtitleCellDTO.class), @OneOfSignature(name = "disclosureIndicatorBadgeIconTitleSubtitleCell", type = DisclosureIndicatorBadgeIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "iconTitleSubtitleCell", type = IconTitleSubtitleCellDTO.class), @OneOfSignature(name = "indicatorTitleSubtitleCell", type = IndicatorTitleSubtitleCellDTO.class), @OneOfSignature(name = "indicatorIconTitleSubtitleCell", type = IndicatorIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "indicatorBadgeTitleSubtitleCell", type = IndicatorBadgeTitleSubtitleCellDTO.class), @OneOfSignature(name = "indicatorBadgeIconTitleSubtitleCell", type = IndicatorBadgeIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "checkboxTitleSubtitleCell", type = CheckboxTitleSubtitleCellDTO.class), @OneOfSignature(name = "radioTitleSubtitleCell", type = RadioTitleSubtitleCellDTO.class), @OneOfSignature(name = "toggleTitleSubtitleCell", type = ToggleTitleSubtitleCellDTO.class), @OneOfSignature(name = "titleSubtitleCell", type = TitleSubtitleCellDTO.class), @OneOfSignature(name = "button", type = ButtonDTO.class), @OneOfSignature(name = "dataButton", type = DataButtonDTO.class), @OneOfSignature(name = "iconButton", type = IconButtonDTO.class), @OneOfSignature(name = "iconCellCard", type = IconCellCardDTO.class), @OneOfSignature(name = "iconLabelButton", type = IconLabelButtonDTO.class), @OneOfSignature(name = "indicatorLabelButton", type = IndicatorLabelButtonDTO.class), @OneOfSignature(name = "uncontainedButton", type = UncontainedButtonDTO.class), @OneOfSignature(name = "uncontainedIconLabelButton", type = UncontainedIconLabelButtonDTO.class), @OneOfSignature(name = "buttonTitleSubtitleCell", type = ButtonTitleSubtitleCellDTO.class), @OneOfSignature(name = "buttonIconTitleSubtitleCell", type = ButtonIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "iconButtonTitleSubtitleCell", type = IconButtonTitleSubtitleCellDTO.class), @OneOfSignature(name = "iconButtonIconTitleSubtitleCell", type = IconButtonIconTitleSubtitleCellDTO.class), @OneOfSignature(name = "chip", type = ChipDTO.class), @OneOfSignature(name = "iconChip", type = IconChipDTO.class), @OneOfSignature(name = "indicatorLabelChip", type = IndicatorLabelChipDTO.class), @OneOfSignature(name = "image", type = ImageDTO.class), @OneOfSignature(name = "imageFixed", type = ImageFixedDTO.class), @OneOfSignature(name = "imageTitleSubtitleCell", type = ImageTitleSubtitleCellDTO.class), @OneOfSignature(name = "rating", type = RatingDTO.class), @OneOfSignature(name = "labelRating", type = LabelRatingDTO.class), @OneOfSignature(name = "buttonV3", type = ButtonV3DTO.class), @OneOfSignature(name = "iconButtonV3", type = IconButtonV3DTO.class), @OneOfSignature(name = "tagButton", type = TagButtonDTO.class), @OneOfSignature(name = "inputSelectButton", type = InputSelectButtonDTO.class), @OneOfSignature(name = "notificationBar", type = NotificationDTO.class), @OneOfSignature(name = "testOnlyTextArea", type = TestOnlyTextAreaDTO.class), @OneOfSignature(name = "aspect", type = AspectDTO.class), @OneOfSignature(name = "productMedia", type = ProductMediaDTO.class), @OneOfSignature(name = "tabs", type = TabsDTO.class), @OneOfSignature(name = "disclaimer", type = DisclaimerDTO.class)}) @NotNull AtomDTO atom, AtomLayoutRule atomLayoutRule, Integer widgetWidthPercent, Boolean showWidgetBackground, Boolean tagSupported) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        return new DesignSystemAtomsDTO(atom, atomLayoutRule, widgetWidthPercent, showWidgetBackground, tagSupported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesignSystemAtomsDTO)) {
            return false;
        }
        DesignSystemAtomsDTO designSystemAtomsDTO = (DesignSystemAtomsDTO) other;
        return Intrinsics.d(this.atom, designSystemAtomsDTO.atom) && this.atomLayoutRule == designSystemAtomsDTO.atomLayoutRule && Intrinsics.d(this.widgetWidthPercent, designSystemAtomsDTO.widgetWidthPercent) && Intrinsics.d(this.showWidgetBackground, designSystemAtomsDTO.showWidgetBackground) && Intrinsics.d(this.tagSupported, designSystemAtomsDTO.tagSupported);
    }

    @NotNull
    public final AtomDTO getAtom() {
        return this.atom;
    }

    public final AtomLayoutRule getAtomLayoutRule() {
        return this.atomLayoutRule;
    }

    public final Boolean getShowWidgetBackground() {
        return this.showWidgetBackground;
    }

    public final Boolean getTagSupported() {
        return this.tagSupported;
    }

    public final Integer getWidgetWidthPercent() {
        return this.widgetWidthPercent;
    }

    public int hashCode() {
        int hashCode = this.atom.hashCode() * 31;
        AtomLayoutRule atomLayoutRule = this.atomLayoutRule;
        int hashCode2 = (hashCode + (atomLayoutRule == null ? 0 : atomLayoutRule.hashCode())) * 31;
        Integer num = this.widgetWidthPercent;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.showWidgetBackground;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.tagSupported;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AtomDTO atomDTO = this.atom;
        AtomLayoutRule atomLayoutRule = this.atomLayoutRule;
        Integer num = this.widgetWidthPercent;
        Boolean bool = this.showWidgetBackground;
        Boolean bool2 = this.tagSupported;
        StringBuilder sb2 = new StringBuilder("DesignSystemAtomsDTO(atom=");
        sb2.append(atomDTO);
        sb2.append(", atomLayoutRule=");
        sb2.append(atomLayoutRule);
        sb2.append(", widgetWidthPercent=");
        C2860c.f(bool, num, ", showWidgetBackground=", ", tagSupported=", sb2);
        return g.d(sb2, bool2, ")");
    }

    public /* synthetic */ DesignSystemAtomsDTO(AtomDTO atomDTO, AtomLayoutRule atomLayoutRule, Integer num, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomDTO, atomLayoutRule, num, bool, (i11 & 16) != 0 ? Boolean.FALSE : bool2);
    }
}
