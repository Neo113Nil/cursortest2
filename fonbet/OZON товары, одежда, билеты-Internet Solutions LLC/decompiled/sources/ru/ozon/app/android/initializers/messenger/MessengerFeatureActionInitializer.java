package ru.ozon.app.android.initializers.messenger;

import Ib.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/initializers/messenger/MessengerFeatureActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "LIb/a;", "Lru/ozon/android/messenger/api/a;", "chatFeature", "aiChatFeature", "bloggerChatFeature", "<init>", "(LIb/a;LIb/a;LIb/a;)V", "", "init", "()V", "LIb/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerFeatureActionInitializer implements ActionInitializer {

    @NotNull
    private final a<ru.ozon.android.messenger.api.a> aiChatFeature;

    @NotNull
    private final a<ru.ozon.android.messenger.api.a> bloggerChatFeature;

    @NotNull
    private final a<ru.ozon.android.messenger.api.a> chatFeature;

    public MessengerFeatureActionInitializer(@NotNull a<ru.ozon.android.messenger.api.a> chatFeature, @NotNull a<ru.ozon.android.messenger.api.a> aiChatFeature, @NotNull a<ru.ozon.android.messenger.api.a> bloggerChatFeature) {
        Intrinsics.checkNotNullParameter(chatFeature, "chatFeature");
        Intrinsics.checkNotNullParameter(aiChatFeature, "aiChatFeature");
        Intrinsics.checkNotNullParameter(bloggerChatFeature, "bloggerChatFeature");
        this.chatFeature = chatFeature;
        this.aiChatFeature = aiChatFeature;
        this.bloggerChatFeature = bloggerChatFeature;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        this.chatFeature.get();
        this.aiChatFeature.get();
        this.bloggerChatFeature.get();
    }
}
