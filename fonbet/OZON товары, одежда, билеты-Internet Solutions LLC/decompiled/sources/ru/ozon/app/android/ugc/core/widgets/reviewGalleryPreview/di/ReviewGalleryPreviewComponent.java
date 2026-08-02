package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.di;

import FU.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.core.ReviewGalleryPreviewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryViewAdapter;
import ru.ozon.app.android.video.di.VideoComponentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 \n2\u00060\u0001j\u0002`\u0002:\u0002\n\u000bJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/di/ReviewGalleryPreviewComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryViewAdapter;", "reviewGalleryViewAdapter", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryViewAdapter;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/core/ReviewGalleryPreviewMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/core/ReviewGalleryPreviewMapper;", "mapper", "Companion", "Factory", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReviewGalleryPreviewComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/di/ReviewGalleryPreviewComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/di/ReviewGalleryPreviewComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReviewGalleryPreviewComponent getInstance$lambda$0(C7475g c7475g) {
            return DaggerReviewGalleryPreviewComponent.factory().create((ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class), (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class));
        }

        @NotNull
        public final C7473e<ReviewGalleryPreviewComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ReviewGalleryPreviewComponent.class), new a(storage, 6));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/di/ReviewGalleryPreviewComponent$Factory;", "", "create", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/di/ReviewGalleryPreviewComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        ReviewGalleryPreviewComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull VideoComponentApi videoComponentApi);
    }

    @NotNull
    ReviewGalleryPreviewMapper getMapper();

    @NotNull
    ReviewGalleryViewAdapter reviewGalleryViewAdapter();
}
