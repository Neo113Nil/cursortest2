package ru.ozon.app.android.cart.totalV3.presentation.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.app.android.cart.totalV3.presentation.views.PriceLineView;
import ru.ozon.app.android.cart.totalV3.presentation.views.TotalPriceBlockView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.DataButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u0000 \u001c2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001\u001cB\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00062\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/adapter/TotalAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO;", "Lru/ozon/app/android/cart/totalV3/presentation/adapter/ItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "setupBackground", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/cart/totalV3/presentation/adapter/ItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/cart/totalV3/presentation/adapter/ItemViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "bgColor", "Ljava/lang/Integer;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalAdapter extends t<TotalVO.TotalItemVO, ItemViewHolder<?>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private Integer bgColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/adapter/TotalAdapter$Companion;", "", "<init>", "()V", "TYPE_BUTTON", "", "TYPE_TEXT", "TYPE_PRICE_BLOCK", "TYPE_SPACE", "TYPE_PRICE_LINE", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TotalAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new TotalDiffItemCallback());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    private final void setupBackground(View view) {
        int color;
        Integer num = this.bgColor;
        if (num != null) {
            color = num.intValue();
        } else {
            color = a.getColor(view.getContext(), R$color.layer_floor_1);
            this.bgColor = Integer.valueOf(color);
        }
        view.setBackgroundColor(color);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        TotalVO.TotalItemVO item = getItem(position);
        if (item instanceof TotalVO.TotalItemVO.TotalButtonVO) {
            return 1;
        }
        if (item instanceof TotalVO.TotalItemVO.TotalTextVO) {
            return 2;
        }
        if (item instanceof TotalVO.TotalItemVO.PriceBlockVO) {
            return 3;
        }
        if (item instanceof TotalVO.TotalItemVO.SpaceVO) {
            return 4;
        }
        return item instanceof TotalVO.TotalItemVO.PriceLineVO ? 5 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemViewHolder<?> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TotalVO.TotalItemVO item = getItem(position);
        if (holder instanceof ButtonItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.cart.totalV3.presentation.TotalVO.TotalItemVO.TotalButtonVO");
            ((ButtonItemViewHolder) holder).bind((TotalVO.TotalItemVO.TotalButtonVO) item);
            return;
        }
        if (holder instanceof TextItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.cart.totalV3.presentation.TotalVO.TotalItemVO.TotalTextVO");
            ((TextItemViewHolder) holder).bind((TotalVO.TotalItemVO.TotalTextVO) item);
            return;
        }
        if (holder instanceof PriceBlockItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.cart.totalV3.presentation.TotalVO.TotalItemVO.PriceBlockVO");
            ((PriceBlockItemViewHolder) holder).bind((TotalVO.TotalItemVO.PriceBlockVO) item);
        } else if (holder instanceof SpaceViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.cart.totalV3.presentation.TotalVO.TotalItemVO.SpaceVO");
            ((SpaceViewHolder) holder).bind((TotalVO.TotalItemVO.SpaceVO) item);
        } else if (holder instanceof PriceLineViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.cart.totalV3.presentation.TotalVO.TotalItemVO.PriceLineVO");
            ((PriceLineViewHolder) holder).bind((TotalVO.TotalItemVO.PriceLineVO) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemViewHolder<?> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == 1) {
            DataButtonView dataButtonView = (DataButtonView) q.f64554a.i(N.b(DataButtonView.class), context);
            if (dataButtonView == null) {
                Intrinsics.f(context);
                dataButtonView = new DataButtonView(context, null, 0, 0, 14, null);
            }
            dataButtonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            setupBackground(frameLayout);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            frameLayout.addView(dataButtonView);
            return new ButtonItemViewHolder(frameLayout, dataButtonView, this.actionHandler);
        }
        if (viewType == 2) {
            TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), context);
            if (textAtomV2View == null) {
                Intrinsics.f(context);
                textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            }
            setupBackground(textAtomV2View);
            textAtomV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new TextItemViewHolder(textAtomV2View, this.actionHandler);
        }
        if (viewType == 3) {
            TotalPriceBlockView totalPriceBlockView = (TotalPriceBlockView) q.f64554a.i(N.b(TotalPriceBlockView.class), context);
            if (totalPriceBlockView == null) {
                Intrinsics.f(context);
                totalPriceBlockView = new TotalPriceBlockView(context, null, 0, 6, null);
            }
            setupBackground(totalPriceBlockView);
            totalPriceBlockView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new PriceBlockItemViewHolder(totalPriceBlockView, this.actionHandler);
        }
        if (viewType == 4) {
            View view = new View(context);
            setupBackground(view);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new SpaceViewHolder(view);
        }
        if (viewType != 5) {
            throw new IllegalStateException(("Unknown view type: " + viewType).toString());
        }
        PriceLineView priceLineView = (PriceLineView) q.f64554a.i(N.b(PriceLineView.class), context);
        if (priceLineView == null) {
            Intrinsics.f(context);
            priceLineView = new PriceLineView(context, null, 0, 6, null);
        }
        setupBackground(priceLineView);
        priceLineView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new PriceLineViewHolder(priceLineView, this.actionHandler);
    }
}
