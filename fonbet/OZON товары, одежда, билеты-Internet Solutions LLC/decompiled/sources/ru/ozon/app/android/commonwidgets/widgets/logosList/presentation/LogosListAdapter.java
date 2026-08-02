package ru.ozon.app.android.commonwidgets.widgets.logosList.presentation;

import BE.a;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import jk0.d;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.LogosListVO;
import ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.view.LogosListItemView;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001/B7\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R*\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListAdapter;", "Ljk0/d;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListAdapter$LogoViewHolder;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/EnableStateHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/utils/AppType;", "appType", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;Lru/ozon/app/android/utils/AppType;Landroidx/lifecycle/J;)V", "", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListAdapter$LogoViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListAdapter$LogoViewHolder;I)V", "", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Item;", "list", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lru/ozon/app/android/utils/AppType;", "", "items", "Ljava/util/List;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isEnabled", "Z", "()Z", "setEnabled", "(Z)V", "LogoViewHolder", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LogosListAdapter extends d<LogoViewHolder> implements EnableStateHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AppType appType;
    private boolean isEnabled;

    @NotNull
    private final List<LogosListVO.Item> items;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListAdapter$LogoViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/view/LogosListItemView;", "itemView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/utils/AppType;", "appType", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/EnableStateHolder;", "enableStateHolder", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/view/LogosListItemView;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/utils/AppType;LWZ/l;Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/EnableStateHolder;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Item;", "item", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Item;)V", "LWZ/l;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/EnableStateHolder;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Item;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LogoViewHolder extends j {

        @NotNull
        private final EnableStateHolder enableStateHolder;
        private LogosListVO.Item item;

        @NotNull
        private final l tokenizedAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogoViewHolder(@NotNull LogosListItemView itemView, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AppType appType, @NotNull l tokenizedAnalytics, @NotNull EnableStateHolder enableStateHolder) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            Intrinsics.checkNotNullParameter(enableStateHolder, "enableStateHolder");
            this.tokenizedAnalytics = tokenizedAnalytics;
            this.enableStateHolder = enableStateHolder;
            itemView.setOnClickListener(new a(this, actionHandler));
            itemView.setupBackground(appType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(LogoViewHolder logoViewHolder, Function1 function1, View view) {
            AtomAction action;
            LogosListVO.Item item = logoViewHolder.item;
            if (item == null || (action = item.getAction()) == null) {
                return;
            }
            function1.invoke(action);
        }

        public final void bind(@NotNull LogosListVO.Item item) {
            int color;
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            View view = this.itemView;
            Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.view.LogosListItemView");
            LogosListItemView logosListItemView = (LogosListItemView) view;
            logosListItemView.getTextTv().setText(item.getText());
            logosListItemView.getSubtextTv().setText(item.getSubtext());
            logosListItemView.setSelected(item.getIsSelected());
            if (Build.VERSION.SDK_INT >= 28) {
                if (item.getIsSelected()) {
                    Context context = logosListItemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    color = ThemeExtKt.themeColor(context, R$attr.oz_semantic_accent_primary);
                } else {
                    color = logosListItemView.getContext().getColor(R$color.black);
                }
                logosListItemView.setOutlineSpotShadowColor(color);
            }
            logosListItemView.setEnabled(this.enableStateHolder.getIsEnabled());
        }

        @Override // jk0.j, lk0.b
        public void onViewInVisibleBounds() {
            t tokenizedEvent;
            super.onViewInVisibleBounds();
            LogosListVO.Item item = this.item;
            if (item == null || (tokenizedEvent = item.getTokenizedEvent()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LogosListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull AppType appType, @NotNull J lifecycleOwner) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.appType = appType;
        this.items = new ArrayList();
        this.isEnabled = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.EnableStateHolder
    /* renamed from: isEnabled, reason: from getter */
    public boolean getIsEnabled() {
        return this.isEnabled;
    }

    public void setEnabled(boolean z11) {
        if (this.isEnabled != z11) {
            this.isEnabled = z11;
            notifyDataSetChanged();
        }
    }

    public final void submitList(@NotNull List<LogosListVO.Item> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull LogoViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public LogoViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new LogoViewHolder(new LogosListItemView(context, null, 0, 6, null), this.actionHandler, this.appType, this.tokenizedAnalytics, this);
    }
}
