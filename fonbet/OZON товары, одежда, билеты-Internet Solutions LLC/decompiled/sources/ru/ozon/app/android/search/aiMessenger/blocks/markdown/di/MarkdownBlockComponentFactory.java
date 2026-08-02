package ru.ozon.app.android.search.aiMessenger.blocks.markdown.di;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.di.MarkdownBlockComponent;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.MarkdownBlockApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/di/MarkdownBlockComponentFactory;", "Lii/a;", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/MarkdownBlockApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/storefrontcommonwidgets/di/component/MarkdownBlockApi;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MarkdownBlockComponentFactory implements InterfaceC7081a<MarkdownBlockApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public MarkdownBlockApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        MarkdownBlockComponent.Factory factory = DaggerMarkdownBlockComponent.factory();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        return factory.create((NetworkComponentApi) componentStorage.b(NetworkComponentApi.class));
    }
}
