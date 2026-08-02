package ru.ozon.android.messenger.framework.core.initialization;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.factories.ButtonsAtomFactory;
import ru.ozon.uni.atoms.v3.factories.CellsAtomFactory;
import ru.ozon.uni.atoms.v3.factories.ChipAtomsFactory;
import ru.ozon.uni.atoms.v3.factories.DSAtomsFactory;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<AtomsFactory> f87137a;

    static {
        AtomsFactory[] elements = {new ButtonsAtomFactory(), new ChipAtomsFactory(), new CellsAtomFactory(), new DSAtomsFactory()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f87137a = C7705l.j0(elements);
    }

    public static Atom a(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1 onAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Iterator<AtomsFactory> it = f87137a.iterator();
        while (it.hasNext()) {
            Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom = it.next().createAtom(context, data, (Function1<? super AtomAction, Unit>) onAction);
            if (createAtom != null) {
                return createAtom.withAction(onAction);
            }
        }
        return null;
    }
}
