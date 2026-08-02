package ru.ozon.app.android.search.aiMessenger.blocks.markdown;

import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.android.messenger.framework.core.a;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.core.AIMarkdownMapper;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.core.AIMarkdownViewMapper;
import ru.ozon.app.android.storefrontcommonwidgets.core.messenger.MarkdownBlockFactory;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/MarkdownBlockProviderImpl;", "Lru/ozon/app/android/storefrontcommonwidgets/core/messenger/MarkdownBlockFactory;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/android/messenger/framework/analytics/i;", "trackerAnalyticsAdapter", "Lru/ozon/android/messenger/framework/core/a;", "create", "(Lru/ozon/android/messenger/framework/analytics/i;)Lru/ozon/android/messenger/framework/core/a;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MarkdownBlockProviderImpl implements MarkdownBlockFactory {

    @NotNull
    private final JsonParser deserializer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/MarkdownBlockProviderImpl$Companion;", "", "<init>", "()V", "VERTICAL", "", "NAME", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MarkdownBlockProviderImpl(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
    }

    @Override // ru.ozon.app.android.storefrontcommonwidgets.core.messenger.MarkdownBlockFactory
    @NotNull
    public a create(@NotNull i trackerAnalyticsAdapter) {
        Intrinsics.checkNotNullParameter(trackerAnalyticsAdapter, "trackerAnalyticsAdapter");
        return new a("messenger", "markdown", C7714v.t(new AIMarkdownViewMapper(this.deserializer, new AIMarkdownMapper(), trackerAnalyticsAdapter)));
    }
}
