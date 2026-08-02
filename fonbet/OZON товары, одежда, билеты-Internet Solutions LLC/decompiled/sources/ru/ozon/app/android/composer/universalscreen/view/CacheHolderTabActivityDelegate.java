package ru.ozon.app.android.composer.universalscreen.view;

import NZ.a;
import NZ.g;
import androidx.lifecycle.InterfaceC5431s;
import fk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/CacheHolderTabActivityDelegate;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "<init>", "()V", "getCacheHolder", "()Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "LNZ/a;", "appTabNavigator", "", "init", "(LNZ/a;)V", "LNZ/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheHolderTabActivityDelegate implements CacheHolder {
    private a appTabNavigator;

    private final CacheHolder getCacheHolder() {
        a aVar = this.appTabNavigator;
        if (aVar != null) {
            g activeTabOrNull = aVar.activeTabOrNull();
            InterfaceC5431s currentFragment = activeTabOrNull != null ? activeTabOrNull.getCurrentFragment() : null;
            if (currentFragment instanceof CacheHolder) {
                return (CacheHolder) currentFragment;
            }
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.af.pool.CacheHolder
    /* renamed from: getRecycledAtomPool */
    public RecycledAtomPool getAtomPool() {
        CacheHolder cacheHolder = getCacheHolder();
        if (cacheHolder != null) {
            return cacheHolder.getAtomPool();
        }
        return null;
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public c getPrefetchViewPool() {
        CacheHolder cacheHolder = getCacheHolder();
        if (cacheHolder != null) {
            return cacheHolder.getPrefetchViewPool();
        }
        return null;
    }

    public final void init(@NotNull a appTabNavigator) {
        Intrinsics.checkNotNullParameter(appTabNavigator, "appTabNavigator");
        this.appTabNavigator = appTabNavigator;
    }
}
