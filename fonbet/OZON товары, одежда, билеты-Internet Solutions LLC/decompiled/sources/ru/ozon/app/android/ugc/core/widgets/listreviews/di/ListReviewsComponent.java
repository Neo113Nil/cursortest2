package ru.ozon.app.android.ugc.core.widgets.listreviews.di;

import QU.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewSortsViewModel;
import ru.ozon.app.android.ugc.core.widgets.listreviews.core.sorts.ListReviewsSortsMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \n2\u00060\u0001j\u0002`\u0002:\u0002\n\u000bJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/di/ListReviewsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/core/widgets/listreviews/core/sorts/ListReviewsSortsMapper;", "mapper", "()Lru/ozon/app/android/ugc/core/widgets/listreviews/core/sorts/ListReviewsSortsMapper;", "LPc/a;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel;", "pListReviewSortsViewModel", "()LPc/a;", "Companion", "Factory", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ListReviewsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/di/ListReviewsComponent$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/listreviews/di/ListReviewsComponent;", "getInstance", "()Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ListReviewsComponent getInstance$lambda$0() {
            return DaggerListReviewsComponent.factory().create();
        }

        @NotNull
        public final C7473e<ListReviewsComponent> getInstance() {
            return new C7473e<>(N.b(ListReviewsComponent.class), new a(0));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/di/ListReviewsComponent$Factory;", "", "create", "Lru/ozon/app/android/ugc/core/widgets/listreviews/di/ListReviewsComponent;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        ListReviewsComponent create();
    }

    @NotNull
    ListReviewsSortsMapper mapper();

    @NotNull
    Pc.a<ListReviewSortsViewModel> pListReviewSortsViewModel();
}
