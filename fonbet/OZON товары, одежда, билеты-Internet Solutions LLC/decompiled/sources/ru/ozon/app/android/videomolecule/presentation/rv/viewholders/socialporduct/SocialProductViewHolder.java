package ru.ozon.app.android.videomolecule.presentation.rv.viewholders.socialporduct;

import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.ui.videomolecule.R$layout;
import ru.ozon.app.android.storefront.ui.videomolecule.databinding.VideoMoleculeSocialProductViewBinding;
import ru.ozon.app.android.videomolecule.presentation.rv.models.VideoMoleculeSocialListProduct;
import ru.ozon.app.android.videomolecule.presentation.rv.viewholders.VideoMoleculeViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/socialporduct/SocialProductViewHolder;", "Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolder;", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeSocialListProduct;", "Landroid/view/View;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "<init>", "(Landroid/view/View;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "model", "bindContent", "(Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeSocialListProduct;)V", "LWZ/l;", "Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeSocialProductViewBinding;", "binding", "Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeSocialProductViewBinding;", "Companion", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialProductViewHolder extends VideoMoleculeViewHolder<VideoMoleculeSocialListProduct> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int viewType = R$layout.video_molecule_social_product_view;

    @NotNull
    private final VideoMoleculeSocialProductViewBinding binding;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/socialporduct/SocialProductViewHolder$Companion;", "", "<init>", "()V", "viewType", "", "getViewType", "()I", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getViewType() {
            return SocialProductViewHolder.viewType;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialProductViewHolder(@NotNull View containerView, @NotNull l tokenizedAnalytics, Function1<? super AtomAction, Unit> function1) {
        super(containerView, function1);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        VideoMoleculeSocialProductViewBinding bind = VideoMoleculeSocialProductViewBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.videomolecule.presentation.rv.viewholders.VideoMoleculeViewHolder
    public void bindContent(@NotNull VideoMoleculeSocialListProduct model) {
        Intrinsics.checkNotNullParameter(model, "model");
        VideoMoleculeSocialProductListView videoMoleculeSocialProductListView = this.binding.socialProductListView;
        videoMoleculeSocialProductListView.setOnAction(getActionHandler());
        videoMoleculeSocialProductListView.setup(model.getProductListDTO(), new SocialProductViewHolder$bindContent$1$1(this, model));
    }
}
