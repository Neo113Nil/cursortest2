package ru.ozon.app.android.search.aiMessenger.blocks.markdown.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.MarkdownBlockApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/di/MarkdownBlockComponent;", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/MarkdownBlockApi;", "Factory", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MarkdownBlockComponent extends MarkdownBlockApi {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/di/MarkdownBlockComponent$Factory;", "", "create", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/MarkdownBlockApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        MarkdownBlockApi create(@NotNull NetworkComponentApi networkComponentApi);
    }
}
