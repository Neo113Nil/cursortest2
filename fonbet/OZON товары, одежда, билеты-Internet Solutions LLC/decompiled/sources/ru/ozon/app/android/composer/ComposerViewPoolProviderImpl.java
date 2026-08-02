package ru.ozon.app.android.composer;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/ComposerViewPoolProviderImpl;", "Lru/ozon/app/android/composer/ComposerViewPoolProvider;", "<init>", "()V", "", "clear", "LSc/j;", "Lru/ozon/app/android/composer/ComposerViewPool;", "lViewPool", "LSc/j;", "Landroidx/recyclerview/widget/RecyclerView$u;", "getViewPool", "()Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerViewPoolProviderImpl implements ComposerViewPoolProvider {

    @NotNull
    private final InterfaceC4008j<ComposerViewPool> lViewPool = k.a(n.NONE, ComposerViewPoolProviderImpl$lViewPool$1.INSTANCE);

    @Override // ru.ozon.app.android.composer.ComposerViewPoolProvider
    public void clear() {
        if (this.lViewPool.isInitialized()) {
            getViewPool().clear();
        }
    }

    @Override // ru.ozon.app.android.composer.ComposerViewPoolProvider
    @NotNull
    public RecyclerView.u getViewPool() {
        return this.lViewPool.getValue();
    }
}
