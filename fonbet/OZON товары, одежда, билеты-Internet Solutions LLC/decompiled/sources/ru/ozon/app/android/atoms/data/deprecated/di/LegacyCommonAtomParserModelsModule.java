package ru.ozon.app.android.atoms.data.deprecated.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.authorBlock.AuthorBlock;
import ru.ozon.app.android.atoms.data.badge.MultilineBadge;
import ru.ozon.app.android.atoms.data.badge.TimerBadge;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.color.ColorAtom;
import ru.ozon.app.android.atoms.data.deprecated.BulletElements;
import ru.ozon.app.android.atoms.data.deprecated.Cell;
import ru.ozon.app.android.atoms.data.deprecated.CellRadioGroup;
import ru.ozon.app.android.atoms.data.deprecated.Checkbox;
import ru.ozon.app.android.atoms.data.deprecated.Checkboxes;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.atoms.data.deprecated.HorizontalContainer;
import ru.ozon.app.android.atoms.data.deprecated.ImageCarousel;
import ru.ozon.app.android.atoms.data.deprecated.Input;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.atoms.data.deprecated.Labels;
import ru.ozon.app.android.atoms.data.deprecated.PaymentMethod;
import ru.ozon.app.android.atoms.data.deprecated.RadioItem;
import ru.ozon.app.android.atoms.data.deprecated.TextSubtext;
import ru.ozon.app.android.atoms.data.deprecated.VerticalContainer;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.disclosure.DisclosureAtom;
import ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.atoms.data.gradientbadge.GradientBadge;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.atoms.data.list.BulletListAtom;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.atoms.data.list.NumberedListAtom;
import ru.ozon.app.android.atoms.data.list.Select;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.atoms.data.rating.RatingBadgeAtom;
import ru.ozon.app.android.atoms.data.rating.RatingVerticalAtom;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.atoms.data.variants.ColorVariants;
import ru.ozon.app.android.atoms.data.variants.TextVariants;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonIcon;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.deprecated.Annotation;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.deprecated.Image;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.price.PriceWithDiscount;
import ru.ozon.uni.atoms.data.price.PriceWithPoints;
import ru.ozon.uni.atoms.data.rating.RatingAtom;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.data.timer.TimerAtom;
import ru.ozon.uni.atoms.parsing.AtomParserModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/di/LegacyCommonAtomParserModelsModule;", "", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LegacyCommonAtomParserModelsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/di/LegacyCommonAtomParserModelsModule$Companion;", "", "<init>", "()V", "provideLegacyCommonAtomParserModels", "", "Lru/ozon/uni/atoms/parsing/AtomParserModel;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<AtomParserModel> provideLegacyCommonAtomParserModels() {
            AtomParserModel atomParserModel = new AtomParserModel(Type.COLOR.getValue(), ColorAtom.class);
            AtomParserModel atomParserModel2 = new AtomParserModel(Type.AUTHOR_BLOCK.getValue(), AuthorBlock.class);
            AtomParserModel atomParserModel3 = new AtomParserModel(AtomTypeImpl.TEXT_ATOM.getValue(), TextAtom.class);
            AtomParserModel atomParserModel4 = new AtomParserModel(Type.TEXT_ATOM_WITH_ICON.getValue(), TextAtomWithIcon.class);
            AtomParserModel atomParserModel5 = new AtomParserModel(Type.SELECT.getValue(), Select.class);
            AtomParserModel atomParserModel6 = new AtomParserModel(Type.BULLET_LIST.getValue(), BulletListAtom.class);
            AtomParserModel atomParserModel7 = new AtomParserModel(Type.NUMBERED_LIST.getValue(), NumberedListAtom.class);
            AtomParserModel atomParserModel8 = new AtomParserModel(Type.LIST_ELEMENT_BULLET.getValue(), ListElementAtom.BulletListElement.class);
            AtomParserModel atomParserModel9 = new AtomParserModel(Type.LIST_ELEMENT_NUMBERED.getValue(), ListElementAtom.NumberedListElement.class);
            AtomParserModel atomParserModel10 = new AtomParserModel(Type.LIST_ELEMENT_ICON_TEXT_MEDIUM.getValue(), ListElementAtom.IconTextMediumListElement.class);
            AtomParserModel atomParserModel11 = new AtomParserModel(Type.LIST_ELEMENT_ICON_WITH_TITLE_MEDIUM.getValue(), ListElementAtom.IconWithTitleMediumListElement.class);
            AtomParserModel atomParserModel12 = new AtomParserModel(Type.LIST_ELEMENT_TABLE_ROW.getValue(), ListElementAtom.TableRowListElement.class);
            AtomParserModel atomParserModel13 = new AtomParserModel(Type.LIST_ELEMENT.getValue(), ListElementAtom.ListElement.class);
            AtomParserModel atomParserModel14 = new AtomParserModel(AtomTypeImpl.TAG.getValue(), TagV3Atom.TagAtom.class);
            AtomParserModel atomParserModel15 = new AtomParserModel(AtomTypeImpl.SMALL_LINK_TAG.getValue(), TagV3Atom.SmallLinkTagAtom.class);
            AtomParserModel atomParserModel16 = new AtomParserModel(AtomTypeImpl.CROSS_TAG.getValue(), TagV3Atom.CrossTagAtom.class);
            AtomParserModel atomParserModel17 = new AtomParserModel(AtomTypeImpl.CROSS_COLOR_TAG.getValue(), TagV3Atom.CrossColorTagAtom.class);
            AtomParserModel atomParserModel18 = new AtomParserModel(AtomTypeImpl.LARGE_BUTTON.getValue(), ButtonV3Atom.LargeButton.class);
            AtomParserModel atomParserModel19 = new AtomParserModel(AtomTypeImpl.LARGE_GRADIENT_BUTTON.getValue(), ButtonV3Atom.LargeGradientButton.class);
            AtomParserModel atomParserModel20 = new AtomParserModel(AtomTypeImpl.SMALL_ICON_BUTTON.getValue(), ButtonV3Atom.SmallIconButton.class);
            AtomParserModel atomParserModel21 = new AtomParserModel(AtomTypeImpl.LARGE_BORDERLESS_BUTTON.getValue(), ButtonV3Atom.LargeBorderlessButton.class);
            AtomParserModel atomParserModel22 = new AtomParserModel(AtomTypeImpl.SMALL_BUTTON.getValue(), ButtonV3Atom.SmallButton.class);
            AtomParserModel atomParserModel23 = new AtomParserModel(AtomTypeImpl.RESIZABLE_SMALL_BUTTON.getValue(), ButtonV3Atom.ResizableSmallButton.class);
            AtomParserModel atomParserModel24 = new AtomParserModel(AtomTypeImpl.SMALL_BORDERLESS_BUTTON.getValue(), ButtonV3Atom.SmallBorderlessButton.class);
            AtomParserModel atomParserModel25 = new AtomParserModel(AtomTypeImpl.SMALL_BORDERLESS_BUTTON_WITH_ICON.getValue(), ButtonV3Atom.SmallBorderlessButtonWithIcon.class);
            AtomParserModel atomParserModel26 = new AtomParserModel(AtomTypeImpl.LARGE_PAYMENT_BUTTON.getValue(), ButtonV3Atom.PaymentButtonLarge.class);
            AtomParserModel atomParserModel27 = new AtomParserModel(AtomTypeImpl.SMALL_PAYMENT_BUTTON.getValue(), ButtonV3Atom.PaymentButtonSmall.class);
            AtomParserModel atomParserModel28 = new AtomParserModel(AtomTypeImpl.GET_BUTTON.getValue(), ButtonV3Atom.GetButton.class);
            AtomParserModel atomParserModel29 = new AtomParserModel(AtomTypeImpl.ADD_TO_CART_BUTTON_WITH_QUANTITY.getValue(), ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.class);
            AtomParserModel atomParserModel30 = new AtomParserModel(AtomTypeImpl.ADD_TO_CART_BUTTON.getValue(), ButtonV3Atom.AddToCartAtom.AddToCartButton.class);
            AtomParserModel atomParserModel31 = new AtomParserModel(AtomTypeImpl.ADD_TO_CART_BUTTON_IMAGE.getValue(), ButtonV3Atom.AddToCartAtom.AddToCartButtonImage.class);
            AtomParserModel atomParserModel32 = new AtomParserModel(AtomTypeImpl.ADD_TO_JOINT_PURCHASE_BUTTON.getValue(), ButtonV3Atom.AddToJointPurchaseButton.class);
            AtomParserModel atomParserModel33 = new AtomParserModel(AtomTypeImpl.ADD_TO_CART_WITH_PRICE_BUTTON.getValue(), CartPriceFreshAtom.class);
            AtomParserModel atomParserModel34 = new AtomParserModel(Type.CELL_REGULAR_24ICON_PICKER.getValue(), CellAtom.CellRegular24IconPicker.class);
            AtomParserModel atomParserModel35 = new AtomParserModel(Type.CELL_REGULAR_PICKER.getValue(), CellAtom.CellRegularPicker.class);
            AtomParserModel atomParserModel36 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_48ICON.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle48Icon.class);
            AtomParserModel atomParserModel37 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_48ICON_CHECKBOX_RADIO.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio.class);
            AtomParserModel atomParserModel38 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_40ICON_CHECKBOX_RADIO.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio.class);
            AtomParserModel atomParserModel39 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_32ICON.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon.class);
            AtomParserModel atomParserModel40 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_40ICON.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon.class);
            AtomParserModel atomParserModel41 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_24ICON.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class);
            AtomParserModel atomParserModel42 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio.class);
            AtomParserModel atomParserModel43 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_COUNTER.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter.class);
            AtomParserModel atomParserModel44 = new AtomParserModel(Type.CELL_WITH_REVERSE_SUBTITLE_COUNTER.getValue(), CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter.class);
            AtomParserModel atomParserModel45 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_VALUE.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitleValue.class);
            AtomParserModel atomParserModel46 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_TOGGLE.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.class);
            AtomParserModel atomParserModel47 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_CHECKBOX_RADIO.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio.class);
            AtomParserModel atomParserModel48 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_DEFAULT.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault.class);
            AtomParserModel atomParserModel49 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_CHECKBOX_RADIO_COUNTER.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.class);
            AtomParserModel atomParserModel50 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO_COUNTER.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.class);
            AtomParserModel atomParserModel51 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_24ICON_COUNTER.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter.class);
            AtomParserModel atomParserModel52 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_TOGGLE_COUNTER.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter.class);
            AtomParserModel atomParserModel53 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_24ICON_PICKER.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconPicker.class);
            AtomParserModel atomParserModel54 = new AtomParserModel(Type.CELL_WITH_SUBTITLE_24ICON_TOGGLE_COUNTER.getValue(), CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter.class);
            AtomParserModel atomParserModel55 = new AtomParserModel(Type.HEADER.getValue(), Header.class);
            AtomParserModel atomParserModel56 = new AtomParserModel(Type.TEXT_SMALL.getValue(), CommonText.TextSmall.class);
            AtomParserModel atomParserModel57 = new AtomParserModel(Type.TEXT_MEDIUM.getValue(), CommonText.TextMedium.class);
            AtomParserModel atomParserModel58 = new AtomParserModel(Type.TEXT_FOOTER.getValue(), CommonText.TextFooter.class);
            AtomParserModel atomParserModel59 = new AtomParserModel(Type.TEXT_SUBTEXT.getValue(), TextSubtext.class);
            AtomParserModel atomParserModel60 = new AtomParserModel(Type.CHECKBOX.getValue(), Checkbox.class);
            AtomParserModel atomParserModel61 = new AtomParserModel(Type.CHECKBOXES.getValue(), Checkboxes.class);
            AtomParserModel atomParserModel62 = new AtomParserModel(Type.BUTTON.getValue(), Button.class);
            AtomParserModel atomParserModel63 = new AtomParserModel(Type.BUTTON_SMALL.getValue(), CommonButton.ButtonBlueSmall.class);
            AtomParserModel atomParserModel64 = new AtomParserModel(Type.BUTTON_SECONDARY.getValue(), CommonButton.ButtonSecondary.class);
            AtomParserModel atomParserModel65 = new AtomParserModel(Type.BUTTON_SECONDARY_SMALL.getValue(), CommonButton.ButtonSecondarySmall.class);
            AtomParserModel atomParserModel66 = new AtomParserModel(Type.BUTTON_BORDERLESS.getValue(), CommonButton.ButtonBorderless.class);
            AtomParserModel atomParserModel67 = new AtomParserModel(Type.BUTTON_BORDERLESS_SMALL.getValue(), CommonButton.ButtonBorderlessSmall.class);
            AtomParserModel atomParserModel68 = new AtomParserModel(AtomTypeImpl.BUTTON_ICON.getValue(), ButtonIcon.class);
            AtomParserModel atomParserModel69 = new AtomParserModel(Type.INPUT.getValue(), Input.class);
            AtomParserModel atomParserModel70 = new AtomParserModel(AtomTypeImpl.IMAGE.getValue(), Image.class);
            AtomParserModel atomParserModel71 = new AtomParserModel(Type.VERTICAL_CONTAINER.getValue(), VerticalContainer.class);
            AtomParserModel atomParserModel72 = new AtomParserModel(Type.HORIZONTAL_CONTAINER.getValue(), HorizontalContainer.class);
            AtomTypeImpl atomTypeImpl = AtomTypeImpl.ANNOTATION;
            AtomParserModel[] elements = {atomParserModel, atomParserModel2, atomParserModel3, atomParserModel4, atomParserModel5, atomParserModel6, atomParserModel7, atomParserModel8, atomParserModel9, atomParserModel10, atomParserModel11, atomParserModel12, atomParserModel13, atomParserModel14, atomParserModel15, atomParserModel16, atomParserModel17, atomParserModel18, atomParserModel19, atomParserModel20, atomParserModel21, atomParserModel22, atomParserModel23, atomParserModel24, atomParserModel25, atomParserModel26, atomParserModel27, atomParserModel28, atomParserModel29, atomParserModel30, atomParserModel31, atomParserModel32, atomParserModel33, atomParserModel34, atomParserModel35, atomParserModel36, atomParserModel37, atomParserModel38, atomParserModel39, atomParserModel40, atomParserModel41, atomParserModel42, atomParserModel43, atomParserModel44, atomParserModel45, atomParserModel46, atomParserModel47, atomParserModel48, atomParserModel49, atomParserModel50, atomParserModel51, atomParserModel52, atomParserModel53, atomParserModel54, atomParserModel55, atomParserModel56, atomParserModel57, atomParserModel58, atomParserModel59, atomParserModel60, atomParserModel61, atomParserModel62, atomParserModel63, atomParserModel64, atomParserModel65, atomParserModel66, atomParserModel67, atomParserModel68, atomParserModel69, atomParserModel70, atomParserModel71, atomParserModel72, new AtomParserModel(atomTypeImpl.getValue(), Annotation.class), new AtomParserModel(Type.PAYMENT_METHOD.getValue(), PaymentMethod.class), new AtomParserModel(Type.RADIO_ITEM.getValue(), RadioItem.class), new AtomParserModel(atomTypeImpl.getValue(), Annotation.class), new AtomParserModel(AtomTypeImpl.PRICE.getValue(), Price.class), new AtomParserModel(Type.PRICE_WITH_TITLE.getValue(), PriceWithTitle.class), new AtomParserModel(AtomTypeImpl.PRICE_WITH_DISCOUNT.getValue(), PriceWithDiscount.class), new AtomParserModel(AtomTypeImpl.PRICE_WITH_POINTS.getValue(), PriceWithPoints.class), new AtomParserModel(DsAtomsType.PRICE_V2.getValue(), PriceDTO.class), new AtomParserModel(Type.PROGRESS_BAR.getValue(), ProgressBar.class), new AtomParserModel(Type.STOCK_BAR.getValue(), StockBar.class), new AtomParserModel(Type.IMAGE_CAROUSEL.getValue(), ImageCarousel.class), new AtomParserModel(Type.BULLET_ELEMENTS.getValue(), BulletElements.class), new AtomParserModel(Type.CELL_DEFAULT.getValue(), Cell.CellDefault.class), new AtomParserModel(Type.CELL_TOGGLE.getValue(), Cell.CellToggle.class), new AtomParserModel(Type.CELL_RADIO.getValue(), Cell.CellRadio.class), new AtomParserModel(Type.CELL_RADIO_GROUP.getValue(), CellRadioGroup.class), new AtomParserModel(Type.LABELS.getValue(), Labels.class), new AtomParserModel(Type.LABEL.getValue(), Label.class), new AtomParserModel(AtomTypeImpl.BADGE.getValue(), Badge.class), new AtomParserModel(Type.MULTILINE_BADGE.getValue(), MultilineBadge.class), new AtomParserModel(Type.GRADIENT_BADGE.getValue(), GradientBadge.class), new AtomParserModel(Type.TIMER_BADGE.getValue(), TimerBadge.class), new AtomParserModel(Type.DISCLAIMER.getValue(), DisclaimerAtom.class), new AtomParserModel(AtomTypeImpl.RATING.getValue(), RatingAtom.class), new AtomParserModel(Type.RATING_VERTICAL.getValue(), RatingVerticalAtom.class), new AtomParserModel(Type.RATING_BADGE.getValue(), RatingBadgeAtom.class), new AtomParserModel(Type.GALLERY.getValue(), Gallery.class), new AtomParserModel(AtomTypeImpl.AVATAR.getValue(), Avatar.class), new AtomParserModel(Type.SWITCHING_BUTTON.getValue(), SwitchingButton.class), new AtomParserModel(Type.COLOR_VARIANTS.getValue(), ColorVariants.class), new AtomParserModel(Type.TEXT_VARIANTS.getValue(), TextVariants.class), new AtomParserModel(Type.TABS.getValue(), Tabs.class), new AtomParserModel(DsAtomsType.TIMER.getValue(), TimerAtom.class), new AtomParserModel(DsAtomsType.NOTIFICATION_WITHOUT_ICON.getValue(), NotificationAtom.Notification.class), new AtomParserModel(DsAtomsType.NOTIFICATION_WITH_ICON.getValue(), NotificationAtom.NotificationWithIcon.class), new AtomParserModel(Type.DISCLOSURE.getValue(), DisclosureAtom.class), new AtomParserModel(Type.LABEL_LIST.getValue(), LabelListAtom.class), new AtomParserModel(DsAtomsType.TEXT.getValue(), TextDTO.class), new AtomParserModel(DsAtomsType.EXPANDABLE_TEXT.getValue(), ExpandableTextDTO.class), new AtomParserModel(DsAtomsType.BUTTON_V3.getValue(), ButtonV3DTO.class), new AtomParserModel(DsAtomsType.BADGE.getValue(), BadgeDTO.class), new AtomParserModel(DsAtomsType.ICON.getValue(), IconDTO.class)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }

        private Companion() {
        }
    }
}
