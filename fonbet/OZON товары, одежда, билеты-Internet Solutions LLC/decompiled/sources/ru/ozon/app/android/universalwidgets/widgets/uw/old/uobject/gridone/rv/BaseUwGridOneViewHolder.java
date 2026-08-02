package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv;

import Ar.b;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.OpenNestedPageExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.views.UwObjectGridOneView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/BaseUwGridOneViewHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/BindableUwViewHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/views/UwObjectGridOneView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/views/UwObjectGridOneView;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "item", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwAdapterData;", "adapterData", "bindText", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwAdapterData;)V", "", "position", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;ILru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwAdapterData;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/views/UwObjectGridOneView;", "getContainerView", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/views/UwObjectGridOneView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwAdapterData;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BaseUwGridOneViewHolder extends BindableUwViewHolder {
    private UwAdapterData adapterData;

    @NotNull
    private final UwObjectGridOneView containerView;
    private ObjectItemVO item;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseUwGridOneViewHolder(@NotNull UwObjectGridOneView containerView, @NotNull ComposerReferences ref, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.containerView = containerView;
        this.ref = ref;
        this.onAction = onAction;
        containerView.getImageView().setOnClickListener(new b(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(BaseUwGridOneViewHolder baseUwGridOneViewHolder, View view) {
        UWDeeplink deeplink;
        ObjectItemVO objectItemVO = baseUwGridOneViewHolder.item;
        if (objectItemVO == null || (deeplink = objectItemVO.getDeeplink()) == null) {
            return;
        }
        OpenNestedPageExtKt.navigate$default(deeplink, baseUwGridOneViewHolder.ref, "ItemViewHolder", null, 4, null);
        t tokenizedEvent = objectItemVO.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(baseUwGridOneViewHolder.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    private final void bindText(ObjectItemVO item, UwAdapterData adapterData) {
        this.containerView.getTitleTv().setTextColor(adapterData.getTextColor());
        this.containerView.getSubtitleTv().setTextColor(adapterData.getTextColor());
        TextViewExtKt.setTextOrGone(this.containerView.getTitleTv(), item.getTitle());
        TextViewExtKt.setTextOrGone(this.containerView.getSubtitleTv(), item.getSubtitle());
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv.BindableUwViewHolder
    public void bind(@NotNull ObjectItemVO item, int position, @NotNull UwAdapterData adapterData) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        this.item = item;
        this.adapterData = adapterData;
        this.containerView.setContentDescription(StringProvider.getString(R$string.universalobjectgridone_u_obj_grid_one_item_content_description_android, Integer.valueOf(position)));
        this.containerView.bindImageView(item.getImage(), adapterData);
        this.containerView.setAdvBadgeOrGone(item.getAdvBadge(), this.onAction);
        bindText(item, adapterData);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        ObjectItemVO objectItemVO = this.item;
        if (objectItemVO == null || (tokenizedEvent = objectItemVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }
}
