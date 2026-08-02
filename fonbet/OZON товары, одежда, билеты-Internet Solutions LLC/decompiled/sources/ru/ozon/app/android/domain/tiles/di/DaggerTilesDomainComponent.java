package ru.ozon.app.android.domain.tiles.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.domain.tiles.di.TilesDomainComponent;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractorImpl;

/* loaded from: classes6.dex */
public final class DaggerTilesDomainComponent {

    private static final class Factory implements TilesDomainComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        private Factory() {
        }

        @Override // ru.ozon.app.android.domain.tiles.di.TilesDomainComponent.Factory
        public TilesDomainComponent create(ActionComponentApi actionComponentApi) {
            actionComponentApi.getClass();
            return new TilesDomainComponentImpl(actionComponentApi, 0);
        }
    }

    private static final class TilesDomainComponentImpl implements TilesDomainComponent {
        private final ActionComponentApi actionComponentApi;
        private a<TileDislikeInteractor> bindTileDislikeInteractorProvider;
        private a<TileDislikeInteractorImpl> tileDislikeInteractorImplProvider;
        private final TilesDomainComponentImpl tilesDomainComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92522id;
            private final TilesDomainComponentImpl tilesDomainComponentImpl;

            SwitchingProvider(TilesDomainComponentImpl tilesDomainComponentImpl, int i11) {
                this.tilesDomainComponentImpl = tilesDomainComponentImpl;
                this.f92522id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92522id != 0) {
                    throw new AssertionError(this.f92522id);
                }
                ActionV2Repository actionRepository = this.tilesDomainComponentImpl.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return (T) new TileDislikeInteractorImpl(actionRepository);
            }
        }

        /* synthetic */ TilesDomainComponentImpl(ActionComponentApi actionComponentApi, int i11) {
            this(actionComponentApi);
        }

        private void initialize(ActionComponentApi actionComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.tilesDomainComponentImpl, 0);
            this.tileDislikeInteractorImplProvider = switchingProvider;
            this.bindTileDislikeInteractorProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.domain.tiles.di.TilesDomainComponentApi
        public TileDislikeInteractor getTilesDislikeInteractor() {
            return this.bindTileDislikeInteractorProvider.get();
        }

        private TilesDomainComponentImpl(ActionComponentApi actionComponentApi) {
            this.tilesDomainComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
            initialize(actionComponentApi);
        }
    }

    public static TilesDomainComponent.Factory factory() {
        return new Factory(0);
    }
}
