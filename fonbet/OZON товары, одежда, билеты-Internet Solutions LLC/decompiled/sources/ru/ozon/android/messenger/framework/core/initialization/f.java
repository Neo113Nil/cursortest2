package ru.ozon.android.messenger.framework.core.initialization;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.AtomsFactoryProvider;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

/* loaded from: classes6.dex */
public final class f implements AtomsFactoryProvider {

    /* loaded from: classes10.dex */
    public static final class a implements AtomsFactory {
        a() {
        }

        @Override // ru.ozon.uni.atoms.AtomsFactory
        public final Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(Context context, kotlin.reflect.d<? extends AtomDTO> dVar, Function1<? super AtomAction, Unit> function1) {
            return AtomsFactory.DefaultImpls.createAtom(this, context, dVar, function1);
        }

        @Override // ru.ozon.uni.atoms.AtomsFactory
        public final Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(Context context, AtomDTO data, Function1<? super AtomAction, Unit> onAction) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(onAction, "onAction");
            return c.a(context, data, onAction);
        }
    }

    @Override // ru.ozon.uni.atoms.AtomsFactoryProvider
    public final AtomsFactory provideAtomsFactory() {
        return new a();
    }
}
