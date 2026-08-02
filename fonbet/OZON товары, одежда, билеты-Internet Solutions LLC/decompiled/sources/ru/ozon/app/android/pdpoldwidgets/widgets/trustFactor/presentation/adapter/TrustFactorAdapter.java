package ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.adapter;

import TS.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.databinding.WidgetTrustFactorItemBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.TrustFactorVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/adapter/TrustFactorAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$TrustFactorItem;", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/adapter/TrustFactorHolder;", "Lkotlin/Function1;", "", "", "onLinkClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/adapter/TrustFactorHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/adapter/TrustFactorHolder;I)V", "Lkotlin/jvm/functions/Function1;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TrustFactorAdapter extends t<TrustFactorVO.TrustFactorItem, TrustFactorHolder> {

    @NotNull
    private final Function1<String, Unit> onLinkClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrustFactorAdapter(@NotNull Function1<? super String, Unit> onLinkClick) {
        super(new TrustFactorDiffUtilCallback());
        Intrinsics.checkNotNullParameter(onLinkClick, "onLinkClick");
        this.onLinkClick = onLinkClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$5$lambda$4(TrustFactorHolder trustFactorHolder, TrustFactorAdapter trustFactorAdapter, View view) {
        String deeplink;
        Integer valueOf = Integer.valueOf(trustFactorHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null || (deeplink = trustFactorAdapter.getItem(valueOf.intValue()).getDeeplink()) == null) {
            return;
        }
        String str = h.K(deeplink) ? null : deeplink;
        if (str != null) {
            trustFactorAdapter.onLinkClick.invoke(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TrustFactorHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TrustFactorVO.TrustFactorItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TrustFactorHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetTrustFactorItemBinding inflate = WidgetTrustFactorItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        TrustFactorHolder trustFactorHolder = new TrustFactorHolder(inflate);
        trustFactorHolder.itemView.setOnClickListener(new a(1, trustFactorHolder, this));
        return trustFactorHolder;
    }
}
