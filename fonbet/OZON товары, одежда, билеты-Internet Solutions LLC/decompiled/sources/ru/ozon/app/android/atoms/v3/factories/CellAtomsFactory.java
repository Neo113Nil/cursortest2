package ru.ozon.app.android.atoms.v3.factories;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.cells.regular.CellRegular24IconPickerHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.regular.CellRegularPickerHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithReverseSubtitleCounterHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconCheckboxRadioCounterHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconCheckboxRadioHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconCounterHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconPickerHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconToggleCounterHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle32IconHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle40IconCheckboxRadioHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle40IconHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle48IconCheckboxRadioHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle48IconHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleCheckboxRadioCounterHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleCheckboxRadioHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleCounterHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleDefaultHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleToggleCounterHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleToggleHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleValueHolder;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/atoms/v3/factories/CellAtomsFactory;", "Lru/ozon/uni/atoms/AtomsFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/reflect/d;", "Lru/ozon/uni/atoms/data/AtomDTO;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "data", "onAction", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CellAtomsFactory implements AtomsFactory {
    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        if (Intrinsics.d(viewType, N.b(CellAtom.CellRegular24IconPicker.class))) {
            return new CellRegular24IconPickerHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellRegularPicker.class))) {
            return new CellRegularPickerHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle48Icon.class))) {
            return new CellWithSubtitle48IconHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio.class))) {
            return new CellWithSubtitle48IconCheckboxRadioHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio.class))) {
            return new CellWithSubtitle40IconCheckboxRadioHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon.class))) {
            return new CellWithSubtitle32IconHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon.class))) {
            return new CellWithSubtitle40IconHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio.class))) {
            return new CellWithSubtitle24IconCheckboxRadioHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class))) {
            return new CellWithSubtitle24IconHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconPicker.class))) {
            return new CellWithSubtitle24IconPickerHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter.class))) {
            return new CellWithSubtitleCounterHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter.class))) {
            return new CellWithReverseSubtitleCounterHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitleValue.class))) {
            return new CellWithSubtitleValueHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.class))) {
            return new CellWithSubtitleToggleHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio.class))) {
            return new CellWithSubtitleCheckboxRadioHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault.class))) {
            return new CellWithSubtitleDefaultHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.class))) {
            return new CellWithSubtitleCheckboxRadioCounterHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.class))) {
            return new CellWithSubtitle24IconCheckboxRadioCounterHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter.class))) {
            return new CellWithSubtitle24IconCounterHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter.class))) {
            return new CellWithSubtitleToggleCounterHolder(context, null);
        }
        if (Intrinsics.d(viewType, N.b(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter.class))) {
            return new CellWithSubtitle24IconToggleCounterHolder(context, (String) null);
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Object cellWithSubtitle24IconToggleCounterHolder;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (data instanceof CellAtom.CellRegular24IconPicker) {
            cellWithSubtitle24IconToggleCounterHolder = new CellRegular24IconPickerHolder(context, ((CellAtom.CellRegular24IconPicker) data).getContext());
        } else if (data instanceof CellAtom.CellRegularPicker) {
            cellWithSubtitle24IconToggleCounterHolder = new CellRegularPickerHolder(context, ((CellAtom.CellRegularPicker) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle48Icon) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitle48IconHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle48Icon) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitle48IconCheckboxRadioHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitle40IconCheckboxRadioHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitle32IconHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitle40IconHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitle24IconCheckboxRadioHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitle24IconHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconPicker) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitle24IconPickerHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconPicker) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitleCounterHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithReverseSubtitleCounterHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleValue) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitleValueHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleValue) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitleToggleHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitleCheckboxRadioHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitleDefaultHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitleCheckboxRadioCounterHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitle24IconCounterHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitle24IconCheckboxRadioCounterHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) data).getContext());
        } else if (data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter) {
            cellWithSubtitle24IconToggleCounterHolder = new CellWithSubtitleToggleCounterHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter) data).getContext());
        } else {
            cellWithSubtitle24IconToggleCounterHolder = data instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter ? new CellWithSubtitle24IconToggleCounterHolder(context, ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter) data).getContext()) : null;
        }
        return (Atom) ExtensionsKt.getExhaustive(cellWithSubtitle24IconToggleCounterHolder);
    }
}
