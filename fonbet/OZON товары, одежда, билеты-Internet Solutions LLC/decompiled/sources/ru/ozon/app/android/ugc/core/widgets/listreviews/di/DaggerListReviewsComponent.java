package ru.ozon.app.android.ugc.core.widgets.listreviews.di;

import Pc.a;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewSortsViewModel;
import ru.ozon.app.android.ugc.core.widgets.listreviews.core.sorts.ListReviewsSortsMapper;
import ru.ozon.app.android.ugc.core.widgets.listreviews.di.ListReviewsComponent;

/* loaded from: classes2.dex */
public final class DaggerListReviewsComponent {

    private static final class Factory implements ListReviewsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.listreviews.di.ListReviewsComponent.Factory
        public ListReviewsComponent create() {
            return new ListReviewsComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class ListReviewsComponentImpl implements ListReviewsComponent {
        private a<ListReviewSortsViewModel> listReviewSortsViewModelProvider;
        private final ListReviewsComponentImpl listReviewsComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94361id;
            private final ListReviewsComponentImpl listReviewsComponentImpl;

            SwitchingProvider(ListReviewsComponentImpl listReviewsComponentImpl, int i11) {
                this.listReviewsComponentImpl = listReviewsComponentImpl;
                this.f94361id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f94361id == 0) {
                    return (T) new ListReviewSortsViewModel();
                }
                throw new AssertionError(this.f94361id);
            }
        }

        /* synthetic */ ListReviewsComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.listReviewSortsViewModelProvider = new SwitchingProvider(this.listReviewsComponentImpl, 0);
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.listreviews.di.ListReviewsComponent
        public ListReviewsSortsMapper mapper() {
            return new ListReviewsSortsMapper();
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.listreviews.di.ListReviewsComponent
        public a<ListReviewSortsViewModel> pListReviewSortsViewModel() {
            return this.listReviewSortsViewModelProvider;
        }

        private ListReviewsComponentImpl() {
            this.listReviewsComponentImpl = this;
            initialize();
        }
    }

    public static ListReviewsComponent.Factory factory() {
        return new Factory(0);
    }
}
