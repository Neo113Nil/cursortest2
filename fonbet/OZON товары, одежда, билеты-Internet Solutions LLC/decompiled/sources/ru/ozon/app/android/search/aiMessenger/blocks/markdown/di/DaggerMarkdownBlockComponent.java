package ru.ozon.app.android.search.aiMessenger.blocks.markdown.di;

import Jb.j;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.MarkdownBlockProviderImpl;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.di.MarkdownBlockComponent;
import ru.ozon.app.android.storefrontcommonwidgets.core.messenger.MarkdownBlockFactory;

/* loaded from: classes7.dex */
public final class DaggerMarkdownBlockComponent {

    private static final class Factory implements MarkdownBlockComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        private Factory() {
        }

        @Override // ru.ozon.app.android.search.aiMessenger.blocks.markdown.di.MarkdownBlockComponent.Factory
        public MarkdownBlockComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new MarkdownBlockComponentImpl(networkComponentApi, 0);
        }
    }

    private static final class MarkdownBlockComponentImpl implements MarkdownBlockComponent {
        private final MarkdownBlockComponentImpl markdownBlockComponentImpl;
        private final NetworkComponentApi networkComponentApi;

        /* synthetic */ MarkdownBlockComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private MarkdownBlockProviderImpl markdownBlockProviderImpl() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new MarkdownBlockProviderImpl(jsonDeserializer);
        }

        @Override // ru.ozon.app.android.storefrontcommonwidgets.di.component.MarkdownBlockApi
        public MarkdownBlockFactory getMarkdownBlockProvider() {
            return markdownBlockProviderImpl();
        }

        private MarkdownBlockComponentImpl(NetworkComponentApi networkComponentApi) {
            this.markdownBlockComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    public static MarkdownBlockComponent.Factory factory() {
        return new Factory(0);
    }
}
