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
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolder;
import ru.ozon.uni.atoms.v3.holders.controls.button.DataButtonHolder;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconButtonHolder;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconCellCardHolder;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconLabelButtonHolder;
import ru.ozon.uni.atoms.v3.holders.controls.button.IndicatorLabelButtonHolder;
import ru.ozon.uni.atoms.v3.holders.controls.button.InputSelectButtonHolder;
import ru.ozon.uni.atoms.v3.holders.controls.button.UncontainedButtonHolder;
import ru.ozon.uni.atoms.v3.holders.controls.button.UncontainedIconLabelButtonHolder;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3Holder;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3Holder;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolder;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/v3/factories/ButtonsAtomFactory;", "Lru/ozon/uni/atoms/AtomsFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/reflect/d;", "Lru/ozon/uni/atoms/data/AtomDTO;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "data", "onAction", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ButtonsAtomFactory implements AtomsFactory {
    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        if (Intrinsics.d(viewType, N.b(ButtonDTO.class))) {
            return new ButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(DataButtonDTO.class))) {
            return new DataButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IconButtonDTO.class))) {
            return new IconButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IconLabelButtonDTO.class))) {
            return new IconLabelButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IndicatorLabelButtonDTO.class))) {
            return new IndicatorLabelButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(UncontainedButtonDTO.class))) {
            return new UncontainedButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(UncontainedIconLabelButtonDTO.class))) {
            return new UncontainedIconLabelButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IconCellCardDTO.class))) {
            return new IconCellCardHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3DTO.class))) {
            return new ButtonV3Holder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IconButtonV3DTO.class))) {
            return new IconButtonV3Holder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TagButtonDTO.class))) {
            return new TagButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(InputSelectButtonDTO.class))) {
            return new InputSelectButtonHolder(context, (String) null);
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (data instanceof ButtonDTO) {
            return new ButtonHolder(context, ((ButtonDTO) data).getContext());
        }
        if (data instanceof DataButtonDTO) {
            return new DataButtonHolder(context, ((DataButtonDTO) data).getContext());
        }
        if (data instanceof IconButtonDTO) {
            return new IconButtonHolder(context, ((IconButtonDTO) data).getContext());
        }
        if (data instanceof IconLabelButtonDTO) {
            return new IconLabelButtonHolder(context, ((IconLabelButtonDTO) data).getContext());
        }
        if (data instanceof IndicatorLabelButtonDTO) {
            return new IndicatorLabelButtonHolder(context, ((IndicatorLabelButtonDTO) data).getContext());
        }
        if (data instanceof UncontainedButtonDTO) {
            return new UncontainedButtonHolder(context, ((UncontainedButtonDTO) data).getContext());
        }
        if (data instanceof UncontainedIconLabelButtonDTO) {
            return new UncontainedIconLabelButtonHolder(context, ((UncontainedIconLabelButtonDTO) data).getContext());
        }
        if (data instanceof IconCellCardDTO) {
            return new IconCellCardHolder(context, ((IconCellCardDTO) data).getContext());
        }
        if (data instanceof ButtonV3DTO) {
            return new ButtonV3Holder(context, ((ButtonV3DTO) data).getContext());
        }
        if (data instanceof IconButtonV3DTO) {
            return new IconButtonV3Holder(context, ((IconButtonV3DTO) data).getContext());
        }
        if (data instanceof TagButtonDTO) {
            return new TagButtonHolder(context, ((TagButtonDTO) data).getContext());
        }
        if (data instanceof InputSelectButtonDTO) {
            return new InputSelectButtonHolder(context, (String) null);
        }
        return null;
    }
}
