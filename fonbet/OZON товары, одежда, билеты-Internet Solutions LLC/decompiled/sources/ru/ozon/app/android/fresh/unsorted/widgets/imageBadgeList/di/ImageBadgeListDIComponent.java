package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.di;

import CQ.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.data.ImageBadgeListMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/di/ImageBadgeListDIComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ImageBadgeListDIComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/di/ImageBadgeListDIComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/di/ImageBadgeListDIComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImageBadgeListDIComponent create$lambda$0(final C7475g c7475g) {
            return new ImageBadgeListDIComponent() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.di.ImageBadgeListDIComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(ImageBadgeListDIComponent$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.di.ImageBadgeListDIComponent
                public ImageBadgeListMapper getMapper() {
                    return (ImageBadgeListMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.di.ImageBadgeListDIComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<ImageBadgeListDIComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ImageBadgeListDIComponent.class), new a(storage, 12));
        }
    }

    @NotNull
    ImageBadgeListMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
