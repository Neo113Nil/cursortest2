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
import ru.ozon.uni.atoms.data.cell.OrderedListCellDTO;
import ru.ozon.uni.atoms.data.cell.RadioTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ToggleTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.UnorderedListCellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.badge.BadgeIconTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.badge.BadgeTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.button.ButtonIconTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.button.ButtonTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.button.IconButtonIconTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.button.IconButtonTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureBadgeIconTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureBadgeTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureIconTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureIndicatorBadgeIconTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureIndicatorBadgeTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureIndicatorIconTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureIndicatorTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.iconCell.IconTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.image.ImageTitleSubtitleCellV2Holder;
import ru.ozon.uni.atoms.v3.holders.cell.indicatorCell.IndicatorBadgeIconTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.indicatorCell.IndicatorBadgeTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.indicatorCell.IndicatorIconTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.indicatorCell.IndicatorTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.listItem.OrderedListCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.listItem.UnorderedListCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.selection.CheckboxTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.selection.RadioTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.selection.ToggleTitleSubtitleCellHolder;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolder;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/v3/factories/CellsAtomFactory;", "Lru/ozon/uni/atoms/AtomsFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/reflect/d;", "Lru/ozon/uni/atoms/data/AtomDTO;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "data", "onAction", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CellsAtomFactory implements AtomsFactory {
    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        if (Intrinsics.d(viewType, N.b(BadgeIconTitleSubtitleCellDTO.class))) {
            return new BadgeIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(BadgeTitleSubtitleCellDTO.class))) {
            return new BadgeTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclosureBadgeIconTitleSubtitleCellDTO.class))) {
            return new DisclosureBadgeIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclosureBadgeTitleSubtitleCellDTO.class))) {
            return new DisclosureBadgeTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclosureIconTitleSubtitleCellDTO.class))) {
            return new DisclosureIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclosureIndicatorBadgeIconTitleSubtitleCellDTO.class))) {
            return new DisclosureIndicatorBadgeIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclosureIndicatorBadgeTitleSubtitleCellDTO.class))) {
            return new DisclosureIndicatorBadgeTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclosureIndicatorIconTitleSubtitleCellDTO.class))) {
            return new DisclosureIndicatorIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclosureIndicatorTitleSubtitleCellDTO.class))) {
            return new DisclosureIndicatorTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DisclosureTitleSubtitleCellDTO.class))) {
            return new DisclosureTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IconTitleSubtitleCellDTO.class))) {
            return new IconTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IndicatorBadgeIconTitleSubtitleCellDTO.class))) {
            return new IndicatorBadgeIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IndicatorBadgeTitleSubtitleCellDTO.class))) {
            return new IndicatorBadgeTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IndicatorIconTitleSubtitleCellDTO.class))) {
            return new IndicatorIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IndicatorTitleSubtitleCellDTO.class))) {
            return new IndicatorTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TitleSubtitleCellDTO.class))) {
            return new TitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CheckboxTitleSubtitleCellDTO.class))) {
            return new CheckboxTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(RadioTitleSubtitleCellDTO.class))) {
            return new RadioTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ToggleTitleSubtitleCellDTO.class))) {
            return new ToggleTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(OrderedListCellDTO.class))) {
            return new OrderedListCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(UnorderedListCellDTO.class))) {
            return new UnorderedListCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonTitleSubtitleCellDTO.class))) {
            return new ButtonTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonIconTitleSubtitleCellDTO.class))) {
            return new ButtonIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IconButtonTitleSubtitleCellDTO.class))) {
            return new IconButtonTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IconButtonIconTitleSubtitleCellDTO.class))) {
            return new IconButtonIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ImageTitleSubtitleCellDTO.class))) {
            return new ImageTitleSubtitleCellV2Holder(context, (String) null);
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (data instanceof BadgeIconTitleSubtitleCellDTO) {
            return new BadgeIconTitleSubtitleCellHolder(context, ((BadgeIconTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof BadgeTitleSubtitleCellDTO) {
            return new BadgeTitleSubtitleCellHolder(context, ((BadgeTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof DisclosureBadgeIconTitleSubtitleCellDTO) {
            return new DisclosureBadgeIconTitleSubtitleCellHolder(context, ((DisclosureBadgeIconTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof DisclosureBadgeTitleSubtitleCellDTO) {
            return new DisclosureBadgeTitleSubtitleCellHolder(context, ((DisclosureBadgeTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof DisclosureIconTitleSubtitleCellDTO) {
            return new DisclosureIconTitleSubtitleCellHolder(context, ((DisclosureIconTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof DisclosureIndicatorBadgeIconTitleSubtitleCellDTO) {
            return new DisclosureIndicatorBadgeIconTitleSubtitleCellHolder(context, ((DisclosureIndicatorBadgeIconTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof DisclosureIndicatorBadgeTitleSubtitleCellDTO) {
            return new DisclosureIndicatorBadgeTitleSubtitleCellHolder(context, ((DisclosureIndicatorBadgeTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof DisclosureIndicatorIconTitleSubtitleCellDTO) {
            return new DisclosureIndicatorIconTitleSubtitleCellHolder(context, ((DisclosureIndicatorIconTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof DisclosureIndicatorTitleSubtitleCellDTO) {
            return new DisclosureIndicatorTitleSubtitleCellHolder(context, ((DisclosureIndicatorTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof DisclosureTitleSubtitleCellDTO) {
            return new DisclosureTitleSubtitleCellHolder(context, ((DisclosureTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof IconTitleSubtitleCellDTO) {
            return new IconTitleSubtitleCellHolder(context, ((IconTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof IndicatorBadgeIconTitleSubtitleCellDTO) {
            return new IndicatorBadgeIconTitleSubtitleCellHolder(context, ((IndicatorBadgeIconTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof IndicatorBadgeTitleSubtitleCellDTO) {
            return new IndicatorBadgeTitleSubtitleCellHolder(context, ((IndicatorBadgeTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof IndicatorIconTitleSubtitleCellDTO) {
            return new IndicatorIconTitleSubtitleCellHolder(context, ((IndicatorIconTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof IndicatorTitleSubtitleCellDTO) {
            return new IndicatorTitleSubtitleCellHolder(context, ((IndicatorTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof TitleSubtitleCellDTO) {
            return new TitleSubtitleCellHolder(context, ((TitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof CheckboxTitleSubtitleCellDTO) {
            return new CheckboxTitleSubtitleCellHolder(context, ((CheckboxTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof RadioTitleSubtitleCellDTO) {
            return new RadioTitleSubtitleCellHolder(context, ((RadioTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof ToggleTitleSubtitleCellDTO) {
            return new ToggleTitleSubtitleCellHolder(context, ((ToggleTitleSubtitleCellDTO) data).getContext());
        }
        if (data instanceof OrderedListCellDTO) {
            return new OrderedListCellHolder(context, ((OrderedListCellDTO) data).getContext());
        }
        if (data instanceof UnorderedListCellDTO) {
            return new UnorderedListCellHolder(context, ((UnorderedListCellDTO) data).getContext());
        }
        if (data instanceof ButtonTitleSubtitleCellDTO) {
            return new ButtonTitleSubtitleCellHolder(context, (String) null);
        }
        if (data instanceof ButtonIconTitleSubtitleCellDTO) {
            return new ButtonIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (data instanceof IconButtonTitleSubtitleCellDTO) {
            return new IconButtonTitleSubtitleCellHolder(context, (String) null);
        }
        if (data instanceof IconButtonIconTitleSubtitleCellDTO) {
            return new IconButtonIconTitleSubtitleCellHolder(context, (String) null);
        }
        if (data instanceof ImageTitleSubtitleCellDTO) {
            return new ImageTitleSubtitleCellV2Holder(context, ((ImageTitleSubtitleCellDTO) data).getContext());
        }
        return null;
    }
}
