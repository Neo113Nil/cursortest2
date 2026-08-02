package ru.ozon.app.android.atoms.v3.factories;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.atoms.data.gradientbadge.GradientBadge;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.atoms.data.list.BulletListAtom;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.atoms.data.list.NumberedListAtom;
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
import ru.ozon.app.android.atoms.v3.flashsale.StockBarHolder;
import ru.ozon.app.android.atoms.v3.holders.authorBlock.AuthorBlockHolder;
import ru.ozon.app.android.atoms.v3.holders.color.ColorHolder;
import ru.ozon.app.android.atoms.v3.holders.colorVariants.ColorVariantsHolder;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolder;
import ru.ozon.app.android.atoms.v3.holders.disclosure.DisclosureHolder;
import ru.ozon.app.android.atoms.v3.holders.gradientbadge.GradientBadgeHolder;
import ru.ozon.app.android.atoms.v3.holders.labelList.LabelListAtomViewHolder;
import ru.ozon.app.android.atoms.v3.holders.listed.gallery.GalleryHolder;
import ru.ozon.app.android.atoms.v3.holders.multilineBadge.MultilineBadgeHolder;
import ru.ozon.app.android.atoms.v3.holders.priceWithTitle.PriceWithTitleHolder;
import ru.ozon.app.android.atoms.v3.holders.progressbar.ProgressBarHolder;
import ru.ozon.app.android.atoms.v3.holders.rating.RatingVerticalHolder;
import ru.ozon.app.android.atoms.v3.holders.ratingbadge.RatingBadgeHolder;
import ru.ozon.app.android.atoms.v3.holders.select.SelectAtomHolder;
import ru.ozon.app.android.atoms.v3.holders.switchingButton.SwitchingButtonHolder;
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
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.deprecated.Annotation;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.deprecated.Image;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.price.PriceWithDiscount;
import ru.ozon.uni.atoms.data.price.PriceWithPoints;
import ru.ozon.uni.atoms.data.rating.RatingAtom;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
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
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolder;
import ru.ozon.uni.atoms.v3.holders.timer.TimerHolder;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0010\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/atoms/v3/factories/DefaultAtomsFactory;", "Lru/ozon/uni/atoms/AtomsFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/uni/atoms/data/AtomDTO;", "data", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createFromFactory", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "createAtom", "Lru/ozon/app/android/atoms/v3/factories/ButtonAtomsFactory;", "buttonAtomsFactory", "Lru/ozon/app/android/atoms/v3/factories/ButtonAtomsFactory;", "Lru/ozon/app/android/atoms/v3/factories/ListElementAtomsFactory;", "listElementAtomsFactory", "Lru/ozon/app/android/atoms/v3/factories/ListElementAtomsFactory;", "Lru/ozon/app/android/atoms/v3/factories/CellAtomsFactory;", "cellAtomsFactory", "Lru/ozon/app/android/atoms/v3/factories/CellAtomsFactory;", "Lru/ozon/app/android/atoms/v3/factories/TagsAtomsFactory;", "tagsAtomFactory", "Lru/ozon/app/android/atoms/v3/factories/TagsAtomsFactory;", "", "designSystemAtomsFactories", "Ljava/util/Set;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DefaultAtomsFactory implements AtomsFactory {

    @NotNull
    private final Set<AtomsFactory> designSystemAtomsFactories;

    @NotNull
    private final ButtonAtomsFactory buttonAtomsFactory = new ButtonAtomsFactory();

    @NotNull
    private final ListElementAtomsFactory listElementAtomsFactory = new ListElementAtomsFactory();

    @NotNull
    private final CellAtomsFactory cellAtomsFactory = new CellAtomsFactory();

    @NotNull
    private final TagsAtomsFactory tagsAtomFactory = new TagsAtomsFactory();

    public DefaultAtomsFactory() {
        AtomsFactory[] elements = {new ButtonsAtomFactory(), new ChipAtomsFactory(), new CellsAtomFactory(), new DSAtomsFactory()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.designSystemAtomsFactories = C7705l.j0(elements);
    }

    private final Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createFromFactory(Context context, AtomDTO data, Function1<? super AtomAction, Unit> onAction) {
        Iterator<AtomsFactory> it = this.designSystemAtomsFactories.iterator();
        while (it.hasNext()) {
            Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom = it.next().createAtom(context, data, onAction);
            if (createAtom != null) {
                return createAtom;
            }
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> dVar, Function1<? super AtomAction, Unit> function1) {
        return AtomsFactory.DefaultImpls.createAtom(this, context, dVar, function1);
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> authorBlockHolder = Intrinsics.d(data, Unsupported.INSTANCE) ? null : data instanceof AuthorBlock ? new AuthorBlockHolder(context, ((AuthorBlock) data).getContext()) : data instanceof TextAtom ? new TextAtomHolder(context, ((TextAtom) data).getContext()) : data instanceof TextAtomWithIcon ? new TextAtomWithIconHolder(context, ((TextAtomWithIcon) data).getContext()) : ((data instanceof BulletListAtom) || (data instanceof NumberedListAtom) || (data instanceof ListElementAtom)) ? this.listElementAtomsFactory.createAtom(context, data, onAction) : data instanceof ButtonV3Atom ? this.buttonAtomsFactory.createAtom(context, data, onAction) : data instanceof TagV3Atom ? this.tagsAtomFactory.createAtom(context, data, onAction) : data instanceof CellAtom ? this.cellAtomsFactory.createAtom(context, data, onAction) : data instanceof Header ? new HeaderAtom(context, ((Header) data).getContext()) : data instanceof CommonText ? new ru.ozon.app.android.atoms.af.holders.TextAtomHolder(context, ((CommonText) data).getContext()) : data instanceof TextSubtext ? new TextSubtextAtom(context, ((TextSubtext) data).getContext()) : data instanceof Checkbox ? new CheckboxAtom(context, ((Checkbox) data).getContext()) : data instanceof Checkboxes ? new CheckboxesAtom(context, ((Checkboxes) data).getContext()) : data instanceof Cell.CellDefault ? new CellDefaultAtom(context, ((Cell.CellDefault) data).getContext()) : data instanceof Cell.CellRadio ? new CellRadioAtom(context, ((Cell.CellRadio) data).getContext()) : data instanceof Cell.CellToggle ? new CellToggleAtom(context, ((Cell.CellToggle) data).getContext()) : data instanceof CellRadioGroup ? new CellRadioGroupAtom(context, ((CellRadioGroup) data).getContext()) : data instanceof Button ? new ButtonAtomHolder(context, ((Button) data).getContext()) : data instanceof CommonButton.ButtonBlue ? new ButtonBlueAtom(context, ((CommonButton.ButtonBlue) data).getContext()) : data instanceof CommonButton.ButtonBlueSmall ? new ButtonBlueSmallAtom(context, ((CommonButton.ButtonBlueSmall) data).getContext()) : data instanceof CommonButton.ButtonSecondary ? new ButtonSecondaryAtom(context, ((CommonButton.ButtonSecondary) data).getContext()) : data instanceof CommonButton.ButtonSecondarySmall ? new ButtonSecondarySmallAtom(context, ((CommonButton.ButtonSecondarySmall) data).getContext()) : data instanceof CommonButton.ButtonBorderless ? new ButtonBorderlessAtom(context, ((CommonButton.ButtonBorderless) data).getContext()) : data instanceof CommonButton.ButtonBorderlessSmall ? new ButtonBorderlessSmallAtom(context, ((CommonButton.ButtonBorderlessSmall) data).getContext()) : data instanceof ButtonIcon ? new ButtonIconAtom(context, ((ButtonIcon) data).getContext()) : data instanceof Input ? new InputAtomHolder(context, ((Input) data).getContext()) : data instanceof Image ? new ImageAtom(context, ((Image) data).getContext()) : data instanceof VerticalContainer ? new VerticalContainerAtom(context, ((VerticalContainer) data).getContext()) : data instanceof HorizontalContainer ? new HorizontalContainerAtom(context, ((HorizontalContainer) data).getContext()) : data instanceof Annotation ? new AnnotationAtom(context, ((Annotation) data).getContext()) : data instanceof PaymentMethod ? new PaymentMethodAtom(context, ((PaymentMethod) data).getContext()) : data instanceof RadioItem ? new RadioItemAtom(context, ((RadioItem) data).getContext()) : data instanceof Price ? new PriceHolder(context, data.getContext()) : data instanceof PriceWithTitle ? new PriceWithTitleHolder(context, data.getContext()) : data instanceof PriceWithDiscount ? new PriceWithDiscountHolder(context, ((PriceWithDiscount) data).getContext()) : data instanceof PriceWithPoints ? new PriceWithPointsHolder(context, ((PriceWithPoints) data).getContext()) : data instanceof ProgressBar ? new ProgressBarHolder(context, ((ProgressBar) data).getContext()) : data instanceof StockBar ? new StockBarHolder(context, data.getContext()) : data instanceof ImageCarousel ? new ImageCarouselAtomHolder(context, ((ImageCarousel) data).getContext()) : data instanceof BulletElements ? new BulletElementsAtom(context, ((BulletElements) data).getContext()) : data instanceof Labels ? new LabelsAtomHolder(context, ((Labels) data).getContext()) : data instanceof Label ? new LabelAtomHolder(context, ((Label) data).getContext()) : data instanceof VariantsText ? new VariantsTextAtomHolder(context, ((VariantsText) data).getContext()) : data instanceof VariantsColor ? new VariantsColorAtomHolder(context, ((VariantsColor) data).getContext()) : data instanceof Rating ? new RatingAtomHolder(context, ((Rating) data).getContext()) : data instanceof Badge ? new BadgeHolder(context, ((Badge) data).getContext()) : data instanceof MultilineBadge ? new MultilineBadgeHolder(context, ((MultilineBadge) data).getContext()) : data instanceof GradientBadge ? new GradientBadgeHolder(context, ((GradientBadge) data).getContext()) : data instanceof TimerBadge ? new TimerBadgeHolder(context, data.getContext()) : data instanceof DisclaimerAtom ? new DisclaimerHolder(context, data.getContext()) : data instanceof RatingAtom ? new RatingHolder(context, data.getContext()) : data instanceof RatingVerticalAtom ? new RatingVerticalHolder(context, data.getContext()) : data instanceof RatingBadgeAtom ? new RatingBadgeHolder(context, data.getContext()) : data instanceof Gallery ? new GalleryHolder(context, ((Gallery) data).getContext()) : data instanceof Select ? new SelectAtomHolder(context, data.getContext()) : data instanceof Avatar ? new AvatarHolder(context, ((Avatar) data).getContext()) : data instanceof SwitchingButton ? new SwitchingButtonHolder(context, ((SwitchingButton) data).getContext()) : data instanceof ColorVariants ? new ColorVariantsHolder(context, ((ColorVariants) data).getContext()) : data instanceof TextVariants ? new TextVariantsHolder(context, ((TextVariants) data).getContext()) : data instanceof ColorAtom ? new ColorHolder(context, ((ColorAtom) data).getContext()) : data instanceof Tabs ? new TabHolder(context, ((Tabs) data).getContext()) : data instanceof TimerAtom ? new TimerHolder(context, ((TimerAtom) data).getContext()) : data instanceof DisclosureAtom ? new DisclosureHolder(context, ((DisclosureAtom) data).getContext()) : data instanceof LabelListAtom ? new LabelListAtomViewHolder(context, data.getContext()) : createFromFactory(context, data, onAction);
        if (authorBlockHolder != null) {
            return authorBlockHolder.withAction(onAction);
        }
        return null;
    }
}
