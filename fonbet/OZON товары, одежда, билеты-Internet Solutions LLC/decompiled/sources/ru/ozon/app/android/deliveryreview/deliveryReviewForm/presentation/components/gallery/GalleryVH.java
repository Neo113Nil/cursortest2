package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.gallery;

import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentGalleryBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/gallery/GalleryVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentGalleryBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentGalleryBinding;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "", "", "params", "showGallery", "(Ljava/util/Map;)V", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "component", "bind", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;)V", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentGalleryBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Companion", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GalleryVH extends RecyclerView.C {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemDeliveryReviewComponentGalleryBinding binding;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/gallery/GalleryVH$Companion;", "", "<init>", "()V", "PHOTOS_PARAMS", "", "URLS_SEPARATOR", "START_POSITION", "", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryVH(@NotNull ItemDeliveryReviewComponentGalleryBinding binding, @NotNull ComposerReferences refs, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.binding = binding;
        this.refs = refs;
        this.actionHandler = actionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showGallery(Map<String, String> params) {
        r a11;
        String str = params.get("photos");
        List m11 = str != null ? h.m(str, new String[]{","}, 0, 6) : null;
        List list = m11;
        if (list == null || list.isEmpty() || (a11 = this.refs.getContainer().a()) == null) {
            return;
        }
        a11.startActivity(GalleryActivity.INSTANCE.newIntent(a11, GalleryRequest.Companion.createFromImageUrls$default(GalleryRequest.INSTANCE, m11, 0, null, null, 12, null)));
    }

    public final void bind(@NotNull ComponentVO component) {
        Intrinsics.checkNotNullParameter(component, "component");
        ItemDeliveryReviewComponentGalleryBinding itemDeliveryReviewComponentGalleryBinding = this.binding;
        LargeBorderlessButtonView galleryBtn = itemDeliveryReviewComponentGalleryBinding.galleryBtn;
        Intrinsics.checkNotNullExpressionValue(galleryBtn, "galleryBtn");
        ViewExtKt.showOrGone(galleryBtn, Boolean.valueOf(!component.getHidden()));
        if (component.getHidden()) {
            return;
        }
        ElementVO element = component.getElement();
        ElementVO.Gallery gallery = element instanceof ElementVO.Gallery ? (ElementVO.Gallery) element : null;
        if (gallery != null) {
            LargeBorderlessButtonView galleryBtn2 = itemDeliveryReviewComponentGalleryBinding.galleryBtn;
            Intrinsics.checkNotNullExpressionValue(galleryBtn2, "galleryBtn");
            LargeBorderlessButtonHolderKt.bind(galleryBtn2, gallery.getAtom(), new GalleryVH$bind$1$1$1(this));
        }
    }
}
