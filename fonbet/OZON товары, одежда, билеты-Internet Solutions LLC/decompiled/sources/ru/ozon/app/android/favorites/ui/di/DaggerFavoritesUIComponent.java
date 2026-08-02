package ru.ozon.app.android.favorites.ui.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.di.FavoritesUIComponent;

/* loaded from: classes6.dex */
public final class DaggerFavoritesUIComponent {

    private static final class Factory implements FavoritesUIComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.favorites.ui.di.FavoritesUIComponent.Factory
        public FavoritesUIComponent create() {
            return new FavoritesUIComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class FavoritesUIComponentImpl implements FavoritesUIComponent {
        private a<FavoritesListsEventsManager> favoritesListsEventsManagerProvider;
        private final FavoritesUIComponentImpl favoritesUIComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {
            private final FavoritesUIComponentImpl favoritesUIComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92571id;

            SwitchingProvider(FavoritesUIComponentImpl favoritesUIComponentImpl, int i11) {
                this.favoritesUIComponentImpl = favoritesUIComponentImpl;
                this.f92571id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92571id == 0) {
                    return (T) new FavoritesListsEventsManager();
                }
                throw new AssertionError(this.f92571id);
            }
        }

        /* synthetic */ FavoritesUIComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.favoritesListsEventsManagerProvider = d.b(new SwitchingProvider(this.favoritesUIComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.favorites.ui.di.FavoritesUIComponentApi
        public FavoritesListsEventsManager getFavoritesListsEventsManager() {
            return this.favoritesListsEventsManagerProvider.get();
        }

        private FavoritesUIComponentImpl() {
            this.favoritesUIComponentImpl = this;
            initialize();
        }
    }

    public static FavoritesUIComponent.Factory factory() {
        return new Factory(0);
    }
}
