package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cards;

import Tc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselCardView;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.extensions.ServicePackageCardViewHelper;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0017R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR<\u0010\"\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020!\u0012\u0004\u0012\u00020\u0011\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselCardView;", "getCardItemView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselCardView;", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardViewHolder;ILjava/util/List;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "cardOnFocusCallback", "Lkotlin/jvm/functions/Function2;", "getCardOnFocusCallback", "()Lkotlin/jvm/functions/Function2;", "setCardOnFocusCallback", "(Lkotlin/jvm/functions/Function2;)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselCardsAdapter extends t<ServicePackageCarouselVO.ServicePackageCarouselCardVO, ServicePackageCarouselCardViewHolder> {
    private Function1<? super AtomAction, Unit> actionHandler;
    private Function2<? super Integer, ? super List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>, Unit> cardOnFocusCallback;

    public ServicePackageCarouselCardsAdapter() {
        super(new i.d<ServicePackageCarouselVO.ServicePackageCarouselCardVO>() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cards.ServicePackageCarouselCardsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ServicePackageCarouselVO.ServicePackageCarouselCardVO oldItem, ServicePackageCarouselVO.ServicePackageCarouselCardVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ServicePackageCarouselVO.ServicePackageCarouselCardVO oldItem, ServicePackageCarouselVO.ServicePackageCarouselCardVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public Object getChangePayload(ServicePackageCarouselVO.ServicePackageCarouselCardVO oldItem, ServicePackageCarouselVO.ServicePackageCarouselCardVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                b builder = C7714v.B();
                if (oldItem.getIsActive() != newItem.getIsActive()) {
                    builder.add(ServicePackageCarouselCardsPayload.IS_ACTIVE);
                }
                if (!Intrinsics.d(oldItem.getSmsToggler(), newItem.getSmsToggler())) {
                    builder.add(ServicePackageCarouselCardsPayload.SMS);
                }
                if (!Intrinsics.d(oldItem.getLightThemeButton(), newItem.getLightThemeButton()) || !Intrinsics.d(oldItem.getDarkThemeButton(), newItem.getDarkThemeButton())) {
                    builder.add(ServicePackageCarouselCardsPayload.BUTTON);
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                return builder.B();
            }
        });
    }

    private final ServicePackageCarouselCardView getCardItemView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ServicePackageCarouselCardView servicePackageCarouselCardView = new ServicePackageCarouselCardView(context);
        servicePackageCarouselCardView.setLayoutParams(new RecyclerView.p(ServicePackageCardViewHelper.INSTANCE.getCardWidth(parent), -1));
        return servicePackageCarouselCardView;
    }

    public final Function2<Integer, List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>, Unit> getCardOnFocusCallback() {
        return this.cardOnFocusCallback;
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    public final void setCardOnFocusCallback(Function2<? super Integer, ? super List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>, Unit> function2) {
        this.cardOnFocusCallback = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((ServicePackageCarouselCardViewHolder) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ServicePackageCarouselCardViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ServicePackageCarouselCardViewHolder(getCardItemView(parent), new ServicePackageCarouselCardsAdapter$onCreateViewHolder$1(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ServicePackageCarouselCardViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ServicePackageCarouselVO.ServicePackageCarouselCardVO servicePackageCarouselCardVO = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(servicePackageCarouselCardVO, "get(...)");
        holder.bind(servicePackageCarouselCardVO, this.actionHandler);
    }

    public void onBindViewHolder(@NotNull ServicePackageCarouselCardViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Object M11 = C7714v.M(payloads);
        List list = M11 instanceof List ? (List) M11 : null;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ServicePackageCarouselVO.ServicePackageCarouselCardVO item = getItem(position);
            for (Object obj : list) {
                if (obj == ServicePackageCarouselCardsPayload.IS_ACTIVE) {
                    Intrinsics.f(item);
                    holder.bindIsActive(item);
                } else if (obj == ServicePackageCarouselCardsPayload.SMS) {
                    Intrinsics.f(item);
                    holder.bindSmsToggle(item, this.actionHandler);
                } else if (obj == ServicePackageCarouselCardsPayload.BUTTON) {
                    Intrinsics.f(item);
                    holder.bindButton(item, this.actionHandler);
                }
            }
            return;
        }
        onBindViewHolder(holder, position);
    }
}
