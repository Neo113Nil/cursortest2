package ru.ozon.app.android.tileselector.domain.selectedstate;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/tileselector/domain/selectedstate/SelectedProductsManagerProviderImpl;", "Lru/ozon/app/android/tileselector/domain/selectedstate/SelectedProductsManagerProvider;", "<init>", "()V", "", "", "isUrlMatchUgcManagerPages", "(Ljava/lang/String;)Z", "", "storeHash", "Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "getManagerByKey", "(I)Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "pageUrl", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "default", "LSc/j;", "get", "(ILjava/lang/String;Lru/ozon/app/android/favorites/common/SelectedProductsManager;)LSc/j;", "(ILjava/lang/String;)Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManagerImpl;", "pageToManagerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "allowedUgcManagerPages", "Ljava/util/List;", "Companion", "tileselector_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectedProductsManagerProviderImpl implements SelectedProductsManagerProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ConcurrentHashMap<Integer, UgcSelectedProductsManagerImpl> pageToManagerMap = new ConcurrentHashMap<>();

    @NotNull
    private final List<String> allowedUgcManagerPages = C7714v.b0("/advBlogger/postFormItemsList", "/highlight/kabinet-blogera", "/selections/addProducts");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/tileselector/domain/selectedstate/SelectedProductsManagerProviderImpl$Companion;", "", "<init>", "()V", "PAGE_POST_FORM_ITEM_LIST", "", "PAGE_MAIN_BLOGGER", "PAGE_SELECTIONS_ADD_PRODUCTS", "tileselector_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UgcSelectedProductsManager getManagerByKey(int storeHash) {
        UgcSelectedProductsManagerImpl putIfAbsent;
        ConcurrentHashMap<Integer, UgcSelectedProductsManagerImpl> concurrentHashMap = this.pageToManagerMap;
        Integer valueOf = Integer.valueOf(storeHash);
        UgcSelectedProductsManagerImpl ugcSelectedProductsManagerImpl = concurrentHashMap.get(valueOf);
        if (ugcSelectedProductsManagerImpl == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (ugcSelectedProductsManagerImpl = new UgcSelectedProductsManagerImpl(new SelectedProductsManagerProviderImpl$getManagerByKey$1$1(this, storeHash))))) != null) {
            ugcSelectedProductsManagerImpl = putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(ugcSelectedProductsManagerImpl, "getOrPut(...)");
        return ugcSelectedProductsManagerImpl;
    }

    private final boolean isUrlMatchUgcManagerPages(String str) {
        if (str != null) {
            List<String> list = this.allowedUgcManagerPages;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (h.e0(str, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ru.ozon.app.android.tileselector.domain.selectedstate.SelectedProductsManagerProvider
    @NotNull
    public InterfaceC4008j<SelectedProductsManager> get(int storeHash, String pageUrl, @NotNull SelectedProductsManager r42) {
        Intrinsics.checkNotNullParameter(r42, "default");
        return isUrlMatchUgcManagerPages(pageUrl) ? k.b(new SelectedProductsManagerProviderImpl$get$1(this, storeHash)) : k.b(new SelectedProductsManagerProviderImpl$get$2(r42));
    }

    @Override // ru.ozon.app.android.tileselector.domain.selectedstate.SelectedProductsManagerProvider
    public UgcSelectedProductsManager get(int storeHash, String pageUrl) {
        if (isUrlMatchUgcManagerPages(pageUrl)) {
            return getManagerByKey(storeHash);
        }
        return null;
    }
}
