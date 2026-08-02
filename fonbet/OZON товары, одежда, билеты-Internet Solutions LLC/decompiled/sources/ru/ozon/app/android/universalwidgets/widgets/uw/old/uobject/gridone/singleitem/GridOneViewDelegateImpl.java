package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeFrameLayoutDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J/\u0010*\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000b\u0018\u00010'H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u001a\u0010.\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\nR\u001b\u00104\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0010R\u0018\u00105\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/GridOneViewDelegateImpl;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/GridOneViewDelegate;", "Landroid/widget/FrameLayout;", "containerView", "", "needCorners", "<init>", "(Landroid/widget/FrameLayout;Z)V", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "appendImageView", "()Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "", "setupCorners", "(Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;)V", "Landroid/widget/LinearLayout;", "appendTextLl", "()Landroid/widget/LinearLayout;", "Landroidx/appcompat/widget/AppCompatTextView;", "appendTitleTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "appendSubtitleTv", "createIfNotExist", "getTitleTv", "(Z)Landroidx/appcompat/widget/AppCompatTextView;", "getSubtitleTv", "", "color", "setBackgroundColor", "(I)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "paddings", "setupRootPaddings", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;)V", "", "radius", "setCornerRadius", "(F)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "setAdvBadgeOrGone", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "Landroid/widget/FrameLayout;", "Z", "imageView", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "getImageView", "textLl$delegate", "LSc/j;", "getTextLl", "textLl", "titleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "subtitleTv", "margin4", "I", "margin16", "Landroid/graphics/drawable/GradientDrawable;", "cornersDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeFrameLayoutDelegate;", "badgeDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeFrameLayoutDelegate;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GridOneViewDelegateImpl implements GridOneViewDelegate {

    @NotNull
    private final AdvBadgeFrameLayoutDelegate badgeDelegate;

    @NotNull
    private final FrameLayout containerView;

    @NotNull
    private final GradientDrawable cornersDrawable;

    @NotNull
    private final AspectRatioImageView imageView;
    private final int margin16;
    private final int margin4;
    private final boolean needCorners;
    private AppCompatTextView subtitleTv;

    /* renamed from: textLl$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textLl;
    private AppCompatTextView titleTv;

    public GridOneViewDelegateImpl(@NotNull FrameLayout containerView, boolean z11) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        this.needCorners = z11;
        this.textLl = LazyUtilsKt.unsafeLazy(new GridOneViewDelegateImpl$textLl$2(this));
        int px = ResourceExtKt.toPx(4);
        this.margin4 = px;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px2 = ResourceExtKt.toPx(16, context);
        this.margin16 = px2;
        this.cornersDrawable = new GradientDrawable();
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.badgeDelegate = new AdvBadgeFrameLayoutDelegate(containerView, ResourceExtKt.toPx(8, context2), new AdvBadgeFrameLayoutDelegate.ContainerPaddings(px, px2, 0, 0, 12, null));
        AspectRatioImageView appendImageView = appendImageView();
        setupCorners(appendImageView);
        this.imageView = appendImageView;
    }

    private final AspectRatioImageView appendImageView() {
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        aspectRatioImageView.setId(R$id.imageView);
        aspectRatioImageView.setClipToOutline(true);
        aspectRatioImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.containerView.addView(aspectRatioImageView, layoutParams);
        return aspectRatioImageView;
    }

    private final AppCompatTextView appendSubtitleTv() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.containerView.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        appCompatTextView.setId(R$id.subtitleTv);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setGravity(8388611);
        appCompatTextView.setMaxLines(3);
        appCompatTextView.setTextAppearance(appCompatTextView.getContext(), R$style.TextStyle_Body_L);
        getTextLl().addView(appCompatTextView, layoutParams);
        return appCompatTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout appendTextLl() {
        LinearLayout linearLayout = new LinearLayout(this.containerView.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388659;
        int i11 = this.margin16;
        layoutParams.topMargin = i11;
        layoutParams.leftMargin = i11;
        layoutParams.bottomMargin = i11;
        linearLayout.setId(R$id.textLl);
        linearLayout.setOrientation(1);
        this.containerView.addView(linearLayout, layoutParams);
        return linearLayout;
    }

    private final AppCompatTextView appendTitleTv() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.containerView.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        appCompatTextView.setId(R$id.titleTv);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setGravity(8388611);
        appCompatTextView.setMaxLines(3);
        appCompatTextView.setTextAppearance(appCompatTextView.getContext(), R$style.TextStyle_Body_L_Bold);
        getTextLl().addView(appCompatTextView, layoutParams);
        return appCompatTextView;
    }

    private final void setupCorners(AspectRatioImageView aspectRatioImageView) {
        if (this.needCorners) {
            aspectRatioImageView.setBackground(this.cornersDrawable);
        } else {
            aspectRatioImageView.setBackground(null);
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    @NotNull
    public AspectRatioImageView getImageView() {
        return this.imageView;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    public AppCompatTextView getSubtitleTv(boolean createIfNotExist) {
        if (createIfNotExist && this.subtitleTv == null) {
            this.subtitleTv = appendSubtitleTv();
        }
        return this.subtitleTv;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    @NotNull
    public LinearLayout getTextLl() {
        return (LinearLayout) this.textLl.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    public AppCompatTextView getTitleTv(boolean createIfNotExist) {
        if (createIfNotExist && this.titleTv == null) {
            this.titleTv = appendTitleTv();
        }
        return this.titleTv;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeDelegate
    public void setAdvBadgeOrGone(BadgeDTO badge, Function1<? super AtomAction, Unit> onAction) {
        this.badgeDelegate.setAdvBadgeOrGone(badge, onAction);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    public void setBackgroundColor(int color) {
        this.containerView.setBackgroundColor(color);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    public void setCornerRadius(float radius) {
        this.cornersDrawable.setCornerRadius(radius);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.GridOneViewDelegate
    public void setupRootPaddings(@NotNull ObjectItemsVO.Paddings paddings) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.containerView.setPadding(paddings.getLeft(), paddings.getTop(), paddings.getRight(), paddings.getBottom());
    }
}
