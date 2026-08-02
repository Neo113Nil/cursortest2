package ru.ozon.uni.atoms.v3.factories;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.image.ImageFixedDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.labelRating.LabelRatingDTO;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;
import ru.ozon.uni.atoms.data.timer.TimerAtom;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolder;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolder;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolder;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolder;
import ru.ozon.uni.atoms.v3.holders.dsBadge.badgeList.BadgeListHolder;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolder;
import ru.ozon.uni.atoms.v3.holders.image.ImageFixedHolder;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolder;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolder;
import ru.ozon.uni.atoms.v3.holders.labelRatingHolder.LabelRatingHolder;
import ru.ozon.uni.atoms.v3.holders.notification.NotificationHolder;
import ru.ozon.uni.atoms.v3.holders.notification.deprecated.NotificationWithIconHolder;
import ru.ozon.uni.atoms.v3.holders.notification.deprecated.NotificationWithoutIconHolder;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolder;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolder;
import ru.ozon.uni.atoms.v3.holders.rating.DsRatingHolder;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolder;
import ru.ozon.uni.atoms.v3.holders.selectionControls.RadioButtonHolder;
import ru.ozon.uni.atoms.v3.holders.selectionControls.ToggleHolder;
import ru.ozon.uni.atoms.v3.holders.tabs.TabsHolder;
import ru.ozon.uni.atoms.v3.holders.tags.TagHolder;
import ru.ozon.uni.atoms.v3.holders.text.TextHolder;
import ru.ozon.uni.atoms.v3.holders.text.expandable.ExpandableTextHolder;
import ru.ozon.uni.atoms.v3.holders.timer.TimerHolder;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/v3/factories/DSAtomsFactory;", "Lru/ozon/uni/atoms/AtomsFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/reflect/d;", "Lru/ozon/uni/atoms/data/AtomDTO;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "data", "onAction", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DSAtomsFactory implements AtomsFactory {
    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        if (Intrinsics.d(viewType, N.b(BadgeDTO.class))) {
            return new BadgeHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IconDTO.class))) {
            return new IconHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IndicatorDTO.class))) {
            return new IndicatorHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CheckBoxDTO.class))) {
            return new CheckBoxHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(RadioDTO.class))) {
            return new RadioButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ToggleDTO.class))) {
            return new ToggleHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TextDTO.class))) {
            return new TextHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ExpandableTextDTO.class))) {
            return new ExpandableTextHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ImageDTO.class))) {
            return new ImageHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ImageFixedDTO.class))) {
            return new ImageFixedHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(BadgeListDTO.class))) {
            return new BadgeListHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ProductMediaDTO.class))) {
            return new ProductMediaHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(PriceDTO.class))) {
            return new PriceAtomHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(RatingDTO.class))) {
            return new DsRatingHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(LabelRatingDTO.class))) {
            return new LabelRatingHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TagV3Atom.TagAtom.class))) {
            return new TagHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellDTO.class))) {
            return new CellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(NotificationDTO.class))) {
            return new NotificationHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TimerAtom.class))) {
            return new TimerHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(AspectDTO.class))) {
            return new AspectHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(NotificationAtom.Notification.class))) {
            return new NotificationWithoutIconHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(NotificationAtom.NotificationWithIcon.class))) {
            return new NotificationWithIconHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TabsDTO.class))) {
            return new TabsHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclaimerDTO.class))) {
            return new DSDisclaimerHolder(context, (String) null);
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (data instanceof BadgeDTO) {
            return new BadgeHolder(context, ((BadgeDTO) data).getContext());
        }
        if (data instanceof IconDTO) {
            return new IconHolder(context, ((IconDTO) data).getContext());
        }
        if (data instanceof IndicatorDTO) {
            return new IndicatorHolder(context, ((IndicatorDTO) data).getContext());
        }
        if (data instanceof CheckBoxDTO) {
            return new CheckBoxHolder(context, ((CheckBoxDTO) data).getContext());
        }
        if (data instanceof RadioDTO) {
            return new RadioButtonHolder(context, ((RadioDTO) data).getContext());
        }
        if (data instanceof ToggleDTO) {
            return new ToggleHolder(context, ((ToggleDTO) data).getContext());
        }
        if (data instanceof TextDTO) {
            return new TextHolder(context, ((TextDTO) data).getContext());
        }
        if (data instanceof ExpandableTextDTO) {
            return new ExpandableTextHolder(context, ((ExpandableTextDTO) data).getContext());
        }
        if (data instanceof ImageDTO) {
            return new ImageHolder(context, ((ImageDTO) data).getContext());
        }
        if (data instanceof ImageFixedDTO) {
            return new ImageFixedHolder(context, ((ImageFixedDTO) data).getContext());
        }
        if (data instanceof RatingDTO) {
            return new DsRatingHolder(context, ((RatingDTO) data).getContext());
        }
        if (data instanceof LabelRatingDTO) {
            return new LabelRatingHolder(context, ((LabelRatingDTO) data).getContext());
        }
        if (data instanceof BadgeListDTO) {
            return new BadgeListHolder(context, ((BadgeListDTO) data).getContext());
        }
        if (data instanceof ProductMediaDTO) {
            return new ProductMediaHolder(context, ((ProductMediaDTO) data).getContext());
        }
        if (data instanceof PriceDTO) {
            return new PriceAtomHolder(context, ((PriceDTO) data).getContext());
        }
        if (data instanceof TagV3Atom.TagAtom) {
            return new TagHolder(context, ((TagV3Atom.TagAtom) data).getContext());
        }
        if (data instanceof CellDTO) {
            return new CellHolder(context, data.getContext());
        }
        if (data instanceof NotificationDTO) {
            return new NotificationHolder(context, ((NotificationDTO) data).getContext());
        }
        if (data instanceof TimerAtom) {
            return new TimerHolder(context, ((TimerAtom) data).getContext());
        }
        if (data instanceof AspectDTO) {
            return new AspectHolder(context, ((AspectDTO) data).getContext());
        }
        if (data instanceof NotificationAtom.Notification) {
            return new NotificationWithoutIconHolder(context, ((NotificationAtom.Notification) data).getContext());
        }
        if (data instanceof NotificationAtom.NotificationWithIcon) {
            return new NotificationWithIconHolder(context, ((NotificationAtom.NotificationWithIcon) data).getContext());
        }
        if (data instanceof TabsDTO) {
            return new TabsHolder(context, data.getContext());
        }
        if (data instanceof DisclaimerDTO) {
            return new DSDisclaimerHolder(context, ((DisclaimerDTO) data).getContext());
        }
        return null;
    }
}
