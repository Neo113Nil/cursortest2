package ru.ozon.app.android.fresh.chat.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di.FloatCartButtonWidgetKt;
import ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/chat/di/FreshChatWidgetsModule;", "", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "", "Ln20/i;", "provideComposeWidgetSet$chat_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideComposeWidgetSet", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshChatWidgetsModule {

    @NotNull
    public static final FreshChatWidgetsModule INSTANCE = new FreshChatWidgetsModule();

    private FreshChatWidgetsModule() {
    }

    @NotNull
    public final Set<i> provideComposeWidgetSet$chat_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        i[] elements = {TextInputWidgetConfigurationKt.TextInputComposeWidget(jsonDeserializer), FloatCartButtonWidgetKt.FloatCartButtonWidget(jsonDeserializer)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
