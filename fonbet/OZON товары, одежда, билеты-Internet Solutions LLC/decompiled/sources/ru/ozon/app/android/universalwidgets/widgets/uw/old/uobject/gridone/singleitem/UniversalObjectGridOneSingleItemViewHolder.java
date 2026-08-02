package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem;

import DS.a;
import Sc.o;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.OpenNestedPageExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.TextAlign;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ#\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ\u001a\u0010\"\u001a\u00020\r2\b\b\u0001\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b*\u0010+J0\u00101\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r\u0018\u00010.H\u0096\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u00107\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010=\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/GridOneViewDelegate;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/GridOneViewDelegateImpl;", "viewDelegate", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/GridOneViewDelegateImpl;)V", "", "triggerViewInitialization", "()V", "item", "bindText", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;)V", "bindImage", "onViewInVisibleBounds", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;Ll20/d;)V", "", "createIfNotExist", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitleTv", "(Z)Landroidx/appcompat/widget/AppCompatTextView;", "getSubtitleTv", "", "color", "setBackgroundColor", "(I)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "paddings", "setupRootPaddings", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;)V", "", "radius", "setCornerRadius", "(F)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "setAdvBadgeOrGone", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "marginSmall", "I", "marginBig", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "actualItem", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "widgetInfo", "Ll20/d;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "getImageView", "()Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "imageView", "Landroid/widget/LinearLayout;", "getTextLl", "()Landroid/widget/LinearLayout;", "textLl", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectGridOneSingleItemViewHolder extends k<ObjectItemsVO> implements GridOneViewDelegate {
    private final /* synthetic */ GridOneViewDelegateImpl $$delegate_0;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private ObjectItemVO actualItem;

    @NotNull
    private final View containerView;
    private final int marginBig;
    private final int marginSmall;

    @NotNull
    private final ComposerReferences ref;
    private d widgetInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAlign.values().length];
            try {
                iArr[TextAlign.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextAlign.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalObjectGridOneSingleItemViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref, @NotNull GridOneViewDelegateImpl viewDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        this.$$delegate_0 = viewDelegate;
        this.containerView = containerView;
        this.ref = ref;
        this.marginSmall = ResourceExtKt.toPx(16);
        this.marginBig = ResourceExtKt.toPx(54);
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        triggerViewInitialization();
        containerView.setOnClickListener(new a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(UniversalObjectGridOneSingleItemViewHolder universalObjectGridOneSingleItemViewHolder, View view) {
        ObjectItemVO objectItemVO = universalObjectGridOneSingleItemViewHolder.actualItem;
        if (objectItemVO != null) {
            UWDeeplink deeplink = objectItemVO.getDeeplink();
            if (deeplink != null) {
                OpenNestedPageExtKt.navigate$default(deeplink, universalObjectGridOneSingleItemViewHolder.ref, "UniversalObjectGridOneSingleItemViewHolder", null, 4, null);
            }
            t tokenizedEvent = objectItemVO.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(universalObjectGridOneSingleItemViewHolder.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }

    private final void bindImage(ObjectItemsVO item) {
        getImageView().setRatio(Float.valueOf(item.getRatio()));
        AspectRatioImageView imageView = getImageView();
        ObjectItemVO objectItemVO = this.actualItem;
        ImageViewExtKt.load$default(imageView, objectItemVO != null ? objectItemVO.getImage() : null, null, null, null, null, false, null, 126, null);
        ThemeExtKt.setParandjaForDarkTheme(getImageView());
    }

    private final void bindText(ObjectItemsVO item) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getTextAlign().ordinal()];
        if (i11 == 1) {
            LinearLayout textLl = getTextLl();
            ViewGroup.LayoutParams layoutParams = textLl.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 8388659;
            layoutParams2.setMarginStart(this.marginSmall);
            layoutParams2.setMarginEnd(this.marginSmall);
            int i12 = this.marginSmall;
            layoutParams2.topMargin = i12;
            layoutParams2.bottomMargin = i12;
            textLl.setLayoutParams(layoutParams2);
            AppCompatTextView titleTv$default = GridOneViewDelegate.DefaultImpls.getTitleTv$default(this, false, 1, null);
            if (titleTv$default != null) {
                titleTv$default.setGravity(8388611);
            }
            AppCompatTextView subtitleTv$default = GridOneViewDelegate.DefaultImpls.getSubtitleTv$default(this, false, 1, null);
            if (subtitleTv$default != null) {
                subtitleTv$default.setGravity(8388611);
            }
        } else {
            if (i11 != 2) {
                throw new o();
            }
            LinearLayout textLl2 = getTextLl();
            ViewGroup.LayoutParams layoutParams3 = textLl2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 17;
            layoutParams4.setMarginStart(this.marginBig);
            layoutParams4.setMarginEnd(this.marginBig);
            int i13 = this.marginSmall;
            layoutParams4.topMargin = i13;
            layoutParams4.bottomMargin = i13;
            textLl2.setLayoutParams(layoutParams4);
            AppCompatTextView titleTv$default2 = GridOneViewDelegate.DefaultImpls.getTitleTv$default(this, false, 1, null);
            if (titleTv$default2 != null) {
                titleTv$default2.setGravity(17);
            }
            AppCompatTextView subtitleTv$default2 = GridOneViewDelegate.DefaultImpls.getSubtitleTv$default(this, false, 1, null);
            if (subtitleTv$default2 != null) {
                subtitleTv$default2.setGravity(17);
            }
        }
        AppCompatTextView titleTv$default3 = GridOneViewDelegate.DefaultImpls.getTitleTv$default(this, false, 1, null);
        if (titleTv$default3 != null) {
            ObjectItemVO objectItemVO = this.actualItem;
            TextViewExtKt.setTextOrGone(titleTv$default3, objectItemVO != null ? objectItemVO.getTitle() : null);
        }
        AppCompatTextView subtitleTv$default3 = GridOneViewDelegate.DefaultImpls.getSubtitleTv$default(this, false, 1, null);
        if (subtitleTv$default3 != null) {
            ObjectItemVO objectItemVO2 = this.actualItem;
            TextViewExtKt.setTextOrGone(subtitleTv$default3, objectItemVO2 != null ? objectItemVO2.getSubtitle() : null);
        }
        AppCompatTextView titleTv$default4 = GridOneViewDelegate.DefaultImpls.getTitleTv$default(this, false, 1, null);
        if (titleTv$default4 != null) {
            titleTv$default4.setTextColor(item.getTextColor());
        }
        AppCompatTextView subtitleTv$default4 = GridOneViewDelegate.DefaultImpls.getSubtitleTv$default(this, false, 1, null);
        if (subtitleTv$default4 != null) {
            subtitleTv$default4.setTextColor(item.getTextColor());
        }
    }

    private final void triggerViewInitialization() {
        getTextLl();
        getTitleTv(true);
        getSubtitleTv(true);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    @NotNull
    public AspectRatioImageView getImageView() {
        return this.$$delegate_0.getImageView();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    public AppCompatTextView getSubtitleTv(boolean createIfNotExist) {
        return this.$$delegate_0.getSubtitleTv(createIfNotExist);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    @NotNull
    public LinearLayout getTextLl() {
        return this.$$delegate_0.getTextLl();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    public AppCompatTextView getTitleTv(boolean createIfNotExist) {
        return this.$$delegate_0.getTitleTv(createIfNotExist);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        ObjectItemVO objectItemVO = this.actualItem;
        if (objectItemVO == null || (tokenizedEvent = objectItemVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeDelegate
    public void setAdvBadgeOrGone(BadgeDTO badge, Function1<? super AtomAction, Unit> onAction) {
        this.$$delegate_0.setAdvBadgeOrGone(badge, onAction);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    public void setBackgroundColor(int color) {
        this.$$delegate_0.setBackgroundColor(color);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    public void setCornerRadius(float radius) {
        this.$$delegate_0.setCornerRadius(radius);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    public void setupRootPaddings(@NotNull ObjectItemsVO.Paddings paddings) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.$$delegate_0.setupRootPaddings(paddings);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ObjectItemsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.actualItem = (ObjectItemVO) C7714v.K(item.getItems());
        this.widgetInfo = info;
        this.containerView.setContentDescription(StringProvider.getString(R$string.universalobjectgridone_u_obj_grid_one_item_content_description_android, 1));
        bindImage(item);
        bindText(item);
        ObjectItemVO objectItemVO = this.actualItem;
        setAdvBadgeOrGone(objectItemVO != null ? objectItemVO.getAdvBadge() : null, this.actionHandler);
        setupRootPaddings(item.getPaddings());
        setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), UniColors.BG_SECONDARY.getResId()));
        setCornerRadius(ResourceExtKt.toPxF(item.getCornerRadius().getPx()));
    }
}
