package ru.ozon.app.android.fresh.main.ui.atoms;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom;
import ru.ozon.app.android.atoms.v3.factories.DefaultAtomsFactory;
import ru.ozon.app.android.fresh.main.ui.atoms.cartPrice.CartPriceFreshHolder;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/atoms/FreshAtomsFactory;", "Lru/ozon/uni/atoms/AtomsFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/uni/atoms/data/AtomDTO;", "data", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/v3/factories/DefaultAtomsFactory;", "defaultAtomsFactory", "Lru/ozon/app/android/atoms/v3/factories/DefaultAtomsFactory;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshAtomsFactory implements AtomsFactory {

    @NotNull
    private final DefaultAtomsFactory defaultAtomsFactory = new DefaultAtomsFactory();

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> dVar, Function1<? super AtomAction, Unit> function1) {
        return AtomsFactory.DefaultImpls.createAtom(this, context, dVar, function1);
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Atom withAction;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        CartPriceFreshHolder cartPriceFreshHolder = data instanceof CartPriceFreshAtom ? new CartPriceFreshHolder(context, data.getContext()) : null;
        return (cartPriceFreshHolder == null || (withAction = cartPriceFreshHolder.withAction(onAction)) == null) ? this.defaultAtomsFactory.createAtom(context, data, onAction) : withAction;
    }
}
