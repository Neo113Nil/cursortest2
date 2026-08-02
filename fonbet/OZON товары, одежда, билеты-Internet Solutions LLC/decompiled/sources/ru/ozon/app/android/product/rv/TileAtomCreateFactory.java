package ru.ozon.app.android.product.rv;

import android.content.Context;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.BxAtomConfig;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.atoms.rv.factory.AtomRecyclerFactory;
import ru.ozon.app.android.atoms.v3.flashsale.StockBarHolder;
import ru.ozon.app.android.atoms.v3.holders.labelList.LabelListAtomViewHolder;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolder;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/product/rv/TileAtomCreateFactory;", "Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/reflect/d;", "Lru/ozon/uni/atoms/data/AtomDTO;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileAtomCreateFactory extends AtomRecyclerFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TileAtomCreateFactory instance = new TileAtomCreateFactory();
    private static boolean preCreateStockBar;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/product/rv/TileAtomCreateFactory$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/product/rv/TileAtomCreateFactory;", "instance", "Lru/ozon/app/android/product/rv/TileAtomCreateFactory;", "getInstance", "()Lru/ozon/app/android/product/rv/TileAtomCreateFactory;", "", "preCreateStockBar", "Z", "getPreCreateStockBar", "()Z", "setPreCreateStockBar", "(Z)V", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TileAtomCreateFactory getInstance() {
            return TileAtomCreateFactory.instance;
        }

        public final void setPreCreateStockBar(boolean z11) {
            TileAtomCreateFactory.preCreateStockBar = z11;
        }

        private Companion() {
        }
    }

    private TileAtomCreateFactory() {
    }

    @Override // ru.ozon.app.android.atoms.rv.factory.AtomRecyclerFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        return Intrinsics.d(viewType, N.b(PriceDTO.class)) ? new PriceAtomHolder(context, (String) null) : Intrinsics.d(viewType, N.b(LabelListAtom.class)) ? new LabelListAtomViewHolder(context, (String) null) : (Intrinsics.d(viewType, N.b(StockBar.class)) && preCreateStockBar) ? new StockBarHolder((StockBarView) q.f64554a.g(N.b(StockBarView.class), context), (String) null) : Intrinsics.d(viewType, N.b(StockBar.class)) ? new StockBarHolder(context, (String) null) : BxAtomConfig.INSTANCE.getAtomRecyclerFactory().createAtom(context, viewType, actionHandler);
    }
}
