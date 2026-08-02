package ru.ozon.uni.atoms;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JO\u0010\r\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJE\u0010\r\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&¢\u0006\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/AtomsFactory;", "", "Landroid/content/Context;", "context", "Lkotlin/reflect/d;", "Lru/ozon/uni/atoms/data/AtomDTO;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "data", "onAction", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface AtomsFactory {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull AtomsFactory atomsFactory, @NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> function1) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            return null;
        }
    }

    Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler);

    Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction);
}
