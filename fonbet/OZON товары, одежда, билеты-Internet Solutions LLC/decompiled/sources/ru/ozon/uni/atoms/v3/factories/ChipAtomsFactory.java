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
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.IconChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO;
import ru.ozon.uni.atoms.v3.holders.controls.chip.ChipHolder;
import ru.ozon.uni.atoms.v3.holders.controls.chip.IconChipHolder;
import ru.ozon.uni.atoms.v3.holders.controls.chip.IndicatorLabelChipHolder;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/v3/factories/ChipAtomsFactory;", "Lru/ozon/uni/atoms/AtomsFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/reflect/d;", "Lru/ozon/uni/atoms/data/AtomDTO;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "data", "onAction", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChipAtomsFactory implements AtomsFactory {
    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        if (Intrinsics.d(viewType, N.b(ChipDTO.class))) {
            return new ChipHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IconChipDTO.class))) {
            return new IconChipHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(IndicatorLabelChipDTO.class))) {
            return new IndicatorLabelChipHolder(context, (String) null);
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (data instanceof ChipDTO) {
            return new ChipHolder(context, ((ChipDTO) data).getContext());
        }
        if (data instanceof IconChipDTO) {
            return new IconChipHolder(context, ((IconChipDTO) data).getContext());
        }
        if (data instanceof IndicatorLabelChipDTO) {
            return new IndicatorLabelChipHolder(context, ((IndicatorLabelChipDTO) data).getContext());
        }
        return null;
    }
}
