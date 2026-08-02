package ru.ozon.app.android.atoms.rv.factory;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.holders.AnnotationAtom;
import ru.ozon.app.android.atoms.af.holders.BulletElementsAtom;
import ru.ozon.app.android.atoms.af.holders.ButtonAtomHolder;
import ru.ozon.app.android.atoms.af.holders.ButtonBlueAtom;
import ru.ozon.app.android.atoms.af.holders.ButtonBlueSmallAtom;
import ru.ozon.app.android.atoms.af.holders.ButtonBorderlessAtom;
import ru.ozon.app.android.atoms.af.holders.ButtonBorderlessSmallAtom;
import ru.ozon.app.android.atoms.af.holders.ButtonSecondaryAtom;
import ru.ozon.app.android.atoms.af.holders.ButtonSecondarySmallAtom;
import ru.ozon.app.android.atoms.af.holders.CellDefaultAtom;
import ru.ozon.app.android.atoms.af.holders.CellRadioAtom;
import ru.ozon.app.android.atoms.af.holders.CellRadioGroupAtom;
import ru.ozon.app.android.atoms.af.holders.CellToggleAtom;
import ru.ozon.app.android.atoms.af.holders.CheckboxAtom;
import ru.ozon.app.android.atoms.af.holders.CheckboxesAtom;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.atoms.af.holders.HorizontalContainerAtom;
import ru.ozon.app.android.atoms.af.holders.ImageAtom;
import ru.ozon.app.android.atoms.af.holders.ImageCarouselAtomHolder;
import ru.ozon.app.android.atoms.af.holders.InputAtomHolder;
import ru.ozon.app.android.atoms.af.holders.LabelAtomHolder;
import ru.ozon.app.android.atoms.af.holders.LabelsAtomHolder;
import ru.ozon.app.android.atoms.af.holders.PaymentMethodAtom;
import ru.ozon.app.android.atoms.af.holders.RadioItemAtom;
import ru.ozon.app.android.atoms.af.holders.RatingAtomHolder;
import ru.ozon.app.android.atoms.af.holders.TextSubtextAtom;
import ru.ozon.app.android.atoms.af.holders.VariantsColorAtomHolder;
import ru.ozon.app.android.atoms.af.holders.VariantsTextAtomHolder;
import ru.ozon.app.android.atoms.af.holders.VerticalContainerAtom;
import ru.ozon.app.android.atoms.data.authorBlock.AuthorBlock;
import ru.ozon.app.android.atoms.data.badge.MultilineBadge;
import ru.ozon.app.android.atoms.data.badge.TimerBadge;
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
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.atoms.data.gradientbadge.GradientBadge;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.atoms.data.list.BulletListAtom;
import ru.ozon.app.android.atoms.data.list.Select;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.atoms.data.rating.Rating;
import ru.ozon.app.android.atoms.data.rating.RatingBadgeAtom;
import ru.ozon.app.android.atoms.data.rating.RatingVerticalAtom;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.atoms.data.variants.ColorVariants;
import ru.ozon.app.android.atoms.data.variants.TextVariants;
import ru.ozon.app.android.atoms.data.variants.VariantsColor;
import ru.ozon.app.android.atoms.data.variants.VariantsText;
import ru.ozon.app.android.atoms.v3.factories.ButtonAtomsFactory;
import ru.ozon.app.android.atoms.v3.factories.CellAtomsFactory;
import ru.ozon.app.android.atoms.v3.factories.ListElementAtomsFactory;
import ru.ozon.app.android.atoms.v3.factories.TagsAtomsFactory;
import ru.ozon.app.android.atoms.v3.flashsale.StockBarHolder;
import ru.ozon.app.android.atoms.v3.holders.authorBlock.AuthorBlockHolder;
import ru.ozon.app.android.atoms.v3.holders.color.ColorHolder;
import ru.ozon.app.android.atoms.v3.holders.colorVariants.ColorVariantsHolder;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolder;
import ru.ozon.app.android.atoms.v3.holders.disclosure.DisclosureHolder;
import ru.ozon.app.android.atoms.v3.holders.gradientbadge.GradientBadgeHolder;
import ru.ozon.app.android.atoms.v3.holders.labelList.LabelListAtomViewHolder;
import ru.ozon.app.android.atoms.v3.holders.listed.BulletListHolder;
import ru.ozon.app.android.atoms.v3.holders.listed.gallery.GalleryHolder;
import ru.ozon.app.android.atoms.v3.holders.multilineBadge.MultilineBadgeHolder;
import ru.ozon.app.android.atoms.v3.holders.priceWithTitle.PriceWithTitleHolder;
import ru.ozon.app.android.atoms.v3.holders.progressbar.ProgressBarHolder;
import ru.ozon.app.android.atoms.v3.holders.rating.RatingVerticalHolder;
import ru.ozon.app.android.atoms.v3.holders.ratingbadge.RatingBadgeHolder;
import ru.ozon.app.android.atoms.v3.holders.select.SelectAtomHolder;
import ru.ozon.app.android.atoms.v3.holders.textVariants.TextVariantsHolder;
import ru.ozon.app.android.atoms.v3.holders.texts.TextAtomWithIconHolder;
import ru.ozon.app.android.atoms.v3.holders.timerBadge.TimerBadgeHolder;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.ButtonIconAtom;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.Unsupported;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonIcon;
import ru.ozon.uni.atoms.data.deprecated.Annotation;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.deprecated.Image;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.price.PriceWithDiscount;
import ru.ozon.uni.atoms.data.price.PriceWithPoints;
import ru.ozon.uni.atoms.data.rating.RatingAtom;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.data.timer.TimerAtom;
import ru.ozon.uni.atoms.v3.factories.ButtonsAtomFactory;
import ru.ozon.uni.atoms.v3.factories.CellsAtomFactory;
import ru.ozon.uni.atoms.v3.factories.ChipAtomsFactory;
import ru.ozon.uni.atoms.v3.factories.DSAtomsFactory;
import ru.ozon.uni.atoms.v3.holders.avatar.AvatarHolder;
import ru.ozon.uni.atoms.v3.holders.badge.BadgeHolder;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolder;
import ru.ozon.uni.atoms.v3.holders.price.PriceWithDiscountHolder;
import ru.ozon.uni.atoms.v3.holders.price.PriceWithPointsHolder;
import ru.ozon.uni.atoms.v3.holders.rating.RatingHolder;
import ru.ozon.uni.atoms.v3.holders.tabs.TabHolder;
import ru.ozon.uni.atoms.v3.holders.text.expandable.ExpandableTextHolder;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolder;
import ru.ozon.uni.atoms.v3.holders.timer.TimerHolder;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JO\u0010\u0011\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/reflect/d;", "Lru/ozon/uni/atoms/data/AtomDTO;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "createCustomAtom", "", "Lru/ozon/uni/atoms/AtomsFactory;", "factories", "Ljava/util/Set;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AtomRecyclerFactory {

    @NotNull
    private final Set<AtomsFactory> factories;

    public AtomRecyclerFactory() {
        AtomsFactory[] elements = {new ButtonAtomsFactory(), new CellAtomsFactory(), new TagsAtomsFactory(), new ListElementAtomsFactory(), new ButtonsAtomFactory(), new ChipAtomsFactory(), new CellsAtomFactory(), new DSAtomsFactory()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.factories = C7705l.j0(elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Atom createAtom$default(AtomRecyclerFactory atomRecyclerFactory, Context context, d dVar, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAtom");
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return atomRecyclerFactory.createAtom(context, dVar, function1);
    }

    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        if (Intrinsics.d(viewType, N.b(TextAtom.class))) {
            return new TextAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ExpandableTextDTO.class))) {
            return new ExpandableTextHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TextAtomWithIcon.class))) {
            return new TextAtomWithIconHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Price.class))) {
            return new PriceHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(PriceWithTitle.class))) {
            return new PriceWithTitleHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(PriceWithPoints.class))) {
            return new PriceWithPointsHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(PriceWithDiscount.class))) {
            return new PriceWithDiscountHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Badge.class))) {
            return new BadgeHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(MultilineBadge.class))) {
            return new MultilineBadgeHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(GradientBadge.class))) {
            return new GradientBadgeHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ColorVariants.class))) {
            return new ColorVariantsHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TextVariants.class))) {
            return new TextVariantsHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(AuthorBlock.class))) {
            return new AuthorBlockHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(BulletListAtom.class))) {
            return new BulletListHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ProgressBar.class))) {
            return new ProgressBarHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(StockBar.class))) {
            return new StockBarHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TimerBadge.class))) {
            return new TimerBadgeHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclaimerAtom.class))) {
            return new DisclaimerHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(RatingAtom.class))) {
            return new RatingHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(RatingVerticalAtom.class))) {
            return new RatingVerticalHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(RatingBadgeAtom.class))) {
            return new RatingBadgeHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Gallery.class))) {
            return new GalleryHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Select.class))) {
            return new SelectAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Avatar.class))) {
            return new AvatarHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ColorAtom.class))) {
            return new ColorHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Tabs.class))) {
            return new TabHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TimerAtom.class))) {
            return new TimerHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Header.class))) {
            return new HeaderAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CommonText.class))) {
            return new ru.ozon.app.android.atoms.af.holders.TextAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TextSubtext.class))) {
            return new TextSubtextAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Checkbox.class))) {
            return new CheckboxAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Checkboxes.class))) {
            return new CheckboxesAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Cell.CellDefault.class))) {
            return new CellDefaultAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Cell.CellRadio.class))) {
            return new CellRadioAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Cell.CellToggle.class))) {
            return new CellToggleAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellRadioGroup.class))) {
            return new CellRadioGroupAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Button.class))) {
            return new ButtonAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CommonButton.ButtonBlue.class))) {
            return new ButtonBlueAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CommonButton.ButtonBlueSmall.class))) {
            return new ButtonBlueSmallAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CommonButton.ButtonSecondary.class))) {
            return new ButtonSecondaryAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CommonButton.ButtonSecondarySmall.class))) {
            return new ButtonSecondarySmallAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CommonButton.ButtonBorderless.class))) {
            return new ButtonBorderlessAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CommonButton.ButtonBorderlessSmall.class))) {
            return new ButtonBorderlessSmallAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonIcon.class))) {
            return new ButtonIconAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Input.class))) {
            return new InputAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Image.class))) {
            return new ImageAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(VerticalContainer.class))) {
            return new VerticalContainerAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(HorizontalContainer.class))) {
            return new HorizontalContainerAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Annotation.class))) {
            return new AnnotationAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(PaymentMethod.class))) {
            return new PaymentMethodAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(RadioItem.class))) {
            return new RadioItemAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ImageCarousel.class))) {
            return new ImageCarouselAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(BulletElements.class))) {
            return new BulletElementsAtom(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Labels.class))) {
            return new LabelsAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Label.class))) {
            return new LabelAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(VariantsText.class))) {
            return new VariantsTextAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(VariantsColor.class))) {
            return new VariantsColorAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(Rating.class))) {
            return new RatingAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclosureAtom.class))) {
            return new DisclosureHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(LabelListAtom.class))) {
            return new LabelListAtomViewHolder(context, (String) null);
        }
        if (!Intrinsics.d(viewType, N.b(Unsupported.class))) {
            Iterator<AtomsFactory> it = this.factories.iterator();
            Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> atom = null;
            while (it.hasNext() && (atom = it.next().createAtom(context, viewType, actionHandler)) == null) {
            }
            if (atom == null) {
                atom = createCustomAtom(context, viewType, actionHandler);
            }
            if (atom != null) {
                return atom.withAction(actionHandler);
            }
        }
        return null;
    }

    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createCustomAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        return null;
    }
}
