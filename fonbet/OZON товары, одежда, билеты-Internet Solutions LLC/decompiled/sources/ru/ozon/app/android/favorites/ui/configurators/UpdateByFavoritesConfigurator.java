package ru.ozon.app.android.favorites.ui.configurators;

import A00.a;
import A00.e;
import M10.d;
import android.view.View;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import i10.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.screen.update.TileFavoriteUpdate;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/UpdateByFavoritesConfigurator;", "Lru/ozon/app/android/favorites/ui/configurators/FavoritesConfigurator;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "LA00/a$J$a;", "item", "", "predicateAddFavorite", "(LA00/a$J$a;)Z", "", "refreshWithSaveScroll", "()V", "", "events", "fetchUpdateFavorites", "(Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdateByFavoritesConfigurator extends FavoritesConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateByFavoritesConfigurator(@NotNull FavoriteManager favoriteManager) {
        super(favoriteManager);
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRecyclerView() {
        View view;
        View rootView;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView);
    }

    private final boolean predicateAddFavorite(a.J.InterfaceC0007a item) {
        return item instanceof TileFavoriteUpdate;
    }

    private final void refreshWithSaveScroll() {
        InterfaceC7851b controller;
        final AbstractC5434v lifecycle = getContainer().g().getLifecycle();
        if (!lifecycle.b().a(AbstractC5434v.b.RESUMED)) {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.favorites.ui.configurators.UpdateByFavoritesConfigurator$refreshWithSaveScroll$$inlined$whenResumed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    AbstractC5434v.this.e(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(J owner) {
                    InterfaceC7851b controller2;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    RecyclerView recyclerView = this.getRecyclerView();
                    if (recyclerView != null) {
                        int i11 = Y.f42258g;
                        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                            recyclerView.addOnLayoutChangeListener(new UpdateByFavoritesConfigurator$refreshWithSaveScroll$lambda$3$$inlined$doOnLayout$1(this));
                        } else {
                            RecyclerView recyclerView2 = this.getRecyclerView();
                            e b11 = recyclerView2 != null ? d.b(recyclerView2) : null;
                            if (b11 == null) {
                                e.a aVar = new e.a();
                                aVar.g(0);
                                b11 = aVar.b();
                            }
                            h.b bVar = new h.b(b11);
                            ConfiguratorReferences references = this.getReferences();
                            if (references != null && (controller2 = references.getController()) != null) {
                                InterfaceC7851b.a.a(controller2, null, null, null, bVar, 7);
                            }
                        }
                    }
                    AbstractC5434v.this.e(this);
                }
            });
            return;
        }
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            int i11 = Y.f42258g;
            if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new UpdateByFavoritesConfigurator$refreshWithSaveScroll$lambda$3$$inlined$doOnLayout$1(this));
                return;
            }
            RecyclerView recyclerView2 = getRecyclerView();
            e b11 = recyclerView2 != null ? d.b(recyclerView2) : null;
            if (b11 == null) {
                e.a aVar = new e.a();
                aVar.g(0);
                b11 = aVar.b();
            }
            h.b bVar = new h.b(b11);
            ConfiguratorReferences references = getReferences();
            if (references == null || (controller = references.getController()) == null) {
                return;
            }
            InterfaceC7851b.a.a(controller, null, null, null, bVar, 7);
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator
    public void fetchUpdateFavorites(@NotNull List<? extends a.J.InterfaceC0007a> events) {
        Object obj;
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(events, "events");
        List<? extends a.J.InterfaceC0007a> list = events;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (predicateAddFavorite((a.J.InterfaceC0007a) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            refreshWithSaveScroll();
            return;
        }
        for (a.J.InterfaceC0007a interfaceC0007a : list) {
            ConfiguratorReferences references = getReferences();
            if (references != null && (controller = references.getController()) != null) {
                controller.update(interfaceC0007a);
            }
        }
    }
}
