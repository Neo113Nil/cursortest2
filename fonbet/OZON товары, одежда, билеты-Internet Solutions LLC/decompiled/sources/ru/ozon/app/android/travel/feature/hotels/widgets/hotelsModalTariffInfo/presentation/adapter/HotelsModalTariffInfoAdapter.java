package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.adapter;

import Ej.b;
import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.HotelsModalTariffInfoVI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.adapter.viewHolders.HotelsModalTariffInfoCellViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.adapter.viewHolders.HotelsModalTariffInfoDisclaimerViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.adapter.viewHolders.HotelsModalTariffInfoHtmlBlockViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.adapter.viewHolders.HotelsModalTariffInfoTextViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.adapter.viewHolders.HotelsModalTariffInfoViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.view.HtmlBlockView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&¨\u0006+²\u0006\f\u0010(\u001a\u00020'8\nX\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/HotelsModalTariffInfoAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoTextViewHolder;", "createTextHolder", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoTextViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoCellViewHolder;", "createCellHolder", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoCellViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoDisclaimerViewHolder;", "createDisclaimerHolder", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoDisclaimerViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoHtmlBlockViewHolder;", "createHtmlBlockHolder", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoHtmlBlockViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "text", "Lru/ozon/uni/android/cell/CellView;", "cell", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsModalTariffInfoAdapter extends i<HotelsModalTariffInfoVI.AtomWrapperVI, HotelsModalTariffInfoViewHolder> {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {N.g(new C(HotelsModalTariffInfoAdapter.class, "text", "<v#0>", 0)), N.g(new C(HotelsModalTariffInfoAdapter.class, "cell", "<v#1>", 0))};

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelsModalTariffInfoAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new HotelsModalTariffInfoItemCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    private final HotelsModalTariffInfoCellViewHolder createCellHolder(Context context) {
        return new HotelsModalTariffInfoCellViewHolder(createCellHolder$lambda$3(new PreCreationViewPoolDelegate(context, N.b(CellView.class), new HotelsModalTariffInfoAdapter$createCellHolder$$inlined$preCreationViewPool$default$1(context), new HotelsModalTariffInfoAdapter$createCellHolder$$inlined$preCreationViewPool$default$2())));
    }

    private static final CellView createCellHolder$lambda$3(PreCreationViewPoolDelegate<CellView> preCreationViewPoolDelegate) {
        return preCreationViewPoolDelegate.getValue(null, $$delegatedProperties[1]);
    }

    private final HotelsModalTariffInfoDisclaimerViewHolder createDisclaimerHolder(Context context) {
        DisclaimerView disclaimerView = new DisclaimerView(context, null, 0, 0, 14, null);
        disclaimerView.setLayoutParams(new RecyclerView.p(-1, -2));
        return new HotelsModalTariffInfoDisclaimerViewHolder(disclaimerView);
    }

    private final HotelsModalTariffInfoHtmlBlockViewHolder createHtmlBlockHolder(Context context) {
        HtmlBlockView htmlBlockView = new HtmlBlockView(context);
        htmlBlockView.setLayoutParams(new RecyclerView.p(-1, -2));
        return new HotelsModalTariffInfoHtmlBlockViewHolder(htmlBlockView);
    }

    private final HotelsModalTariffInfoTextViewHolder createTextHolder(Context context) {
        return new HotelsModalTariffInfoTextViewHolder(createTextHolder$lambda$1(new PreCreationViewPoolDelegate(context, N.b(TextAtomV2View.class), new HotelsModalTariffInfoAdapter$createTextHolder$$inlined$preCreationViewPool$default$1(context), new HotelsModalTariffInfoAdapter$createTextHolder$$inlined$preCreationViewPool$default$2())));
    }

    private static final TextAtomV2View createTextHolder$lambda$1(PreCreationViewPoolDelegate<? extends TextAtomV2View> preCreationViewPoolDelegate) {
        return preCreationViewPoolDelegate.getValue(null, $$delegatedProperties[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        HotelsModalTariffInfoVI.AtomWrapperVI item = getItem(position);
        if (item instanceof HotelsModalTariffInfoVI.TextAtomWrapper) {
            return 0;
        }
        if (item instanceof HotelsModalTariffInfoVI.CellAtomWrapper) {
            return 1;
        }
        if (item instanceof HotelsModalTariffInfoVI.DisclaimerAtomWrapper) {
            return 2;
        }
        if (item instanceof HotelsModalTariffInfoVI.HtmlBlockWrapper) {
            return 3;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull HotelsModalTariffInfoViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HotelsModalTariffInfoVI.AtomWrapperVI item = getItem(position);
        if (item instanceof HotelsModalTariffInfoVI.TextAtomWrapper) {
            holder.bind(item, this.actionHandler);
            return;
        }
        if (item instanceof HotelsModalTariffInfoVI.CellAtomWrapper) {
            holder.bind(item, this.actionHandler);
        } else if (item instanceof HotelsModalTariffInfoVI.DisclaimerAtomWrapper) {
            HotelsModalTariffInfoViewHolder.bind$default(holder, item, null, 2, null);
        } else {
            if (!(item instanceof HotelsModalTariffInfoVI.HtmlBlockWrapper)) {
                throw new o();
            }
            HotelsModalTariffInfoViewHolder.bind$default(holder, item, null, 2, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public HotelsModalTariffInfoViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return createTextHolder(context);
        }
        if (viewType == 1) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return createCellHolder(context2);
        }
        if (viewType == 2) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return createDisclaimerHolder(context3);
        }
        if (viewType != 3) {
            throw new IllegalArgumentException(b.a(viewType, "Wrong viewType: "));
        }
        Context context4 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        return createHtmlBlockHolder(context4);
    }
}
