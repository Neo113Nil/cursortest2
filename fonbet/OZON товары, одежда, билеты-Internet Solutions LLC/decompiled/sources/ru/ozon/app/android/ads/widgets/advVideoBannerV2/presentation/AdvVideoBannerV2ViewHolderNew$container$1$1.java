package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.databinding.WidgetAdvVideoBannerV2NewBinding;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "inflatedView", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2ViewHolderNew$container$1$1 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
    final /* synthetic */ AdvVideoBannerV2ViewHolderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2ViewHolderNew$container$1$1(AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew) {
        super(2);
        this.this$0 = advVideoBannerV2ViewHolderNew;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$3$lambda$1(AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew, View view) {
        AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew;
        ComposerReferences composerReferences;
        AdvBannerVideoV2VO boundData = advVideoBannerV2ViewHolderNew.getBoundData();
        if (boundData == null) {
            return;
        }
        advVideoBannerV2ViewModelNew = advVideoBannerV2ViewHolderNew.viewModel;
        advVideoBannerV2ViewModelNew.onVideoClick(boundData.getId());
        composerReferences = advVideoBannerV2ViewHolderNew.refs;
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences.getNavigator(), boundData.getDeeplink(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$3$lambda$2(AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew, View view) {
        AdvBannerVideoV2VO boundData = advVideoBannerV2ViewHolderNew.getBoundData();
        if (boundData == null) {
            return;
        }
        advVideoBannerV2ViewHolderNew.switchVolume(boundData.getId());
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AsyncFrameLayout asyncFrameLayout, View view) {
        invoke2(asyncFrameLayout, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AsyncFrameLayout invokeWhenInflated, View inflatedView) {
        Intrinsics.checkNotNullParameter(invokeWhenInflated, "$this$invokeWhenInflated");
        Intrinsics.checkNotNullParameter(inflatedView, "inflatedView");
        AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew = this.this$0;
        WidgetAdvVideoBannerV2NewBinding bind = WidgetAdvVideoBannerV2NewBinding.bind(inflatedView);
        bind.advVideoBannerContainerNew.getPreviewImageView().setClipToOutline(true);
        final AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew2 = this.this$0;
        bind.advVideoBannerContainerNew.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvVideoBannerV2ViewHolderNew$container$1$1.invoke$lambda$3$lambda$1(AdvVideoBannerV2ViewHolderNew.this, view);
            }
        });
        bind.advVideoBannerContainerNew.getVolumeImageButton().setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvVideoBannerV2ViewHolderNew$container$1$1.invoke$lambda$3$lambda$2(AdvVideoBannerV2ViewHolderNew.this, view);
            }
        });
        advVideoBannerV2ViewHolderNew.binding = bind;
    }
}
