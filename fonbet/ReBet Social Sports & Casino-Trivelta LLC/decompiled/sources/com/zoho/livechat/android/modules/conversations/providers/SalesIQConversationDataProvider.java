package com.zoho.livechat.android.modules.conversations.providers;

import androidx.annotation.Keep;
import com.zoho.livechat.android.modules.conversations.models.SalesIQConversation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J*\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\nH\u0017J'\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J*\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\nH\u0017ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/providers/SalesIQConversationDataProvider;", "", "getDisplayFields", "", "", "conversation", "Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation;", "(Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "callback", "Lcom/zoho/livechat/android/modules/conversations/providers/DataProviderCallback;", "getSecretFields", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SalesIQConversationDataProvider {
    @Keep
    static /* synthetic */ Object getDisplayFields$suspendImpl(SalesIQConversationDataProvider salesIQConversationDataProvider, SalesIQConversation salesIQConversation, Continuation<? super Map<String, String>> continuation) {
        return null;
    }

    @Keep
    static /* synthetic */ Object getSecretFields$suspendImpl(SalesIQConversationDataProvider salesIQConversationDataProvider, SalesIQConversation salesIQConversation, Continuation<? super Map<String, String>> continuation) {
        return null;
    }

    @Keep
    @Nullable
    default Object getDisplayFields(@NotNull SalesIQConversation salesIQConversation, @NotNull Continuation<? super Map<String, String>> continuation) {
        return getDisplayFields$suspendImpl(this, salesIQConversation, continuation);
    }

    @Keep
    @Nullable
    default Object getSecretFields(@NotNull SalesIQConversation salesIQConversation, @NotNull Continuation<? super Map<String, String>> continuation) {
        return getSecretFields$suspendImpl(this, salesIQConversation, continuation);
    }

    @Keep
    default void getDisplayFields(@NotNull SalesIQConversation conversation, @NotNull DataProviderCallback<Map<String, String>> callback) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onResult(null);
    }

    @Keep
    default void getSecretFields(@NotNull SalesIQConversation conversation, @NotNull DataProviderCallback<Map<String, String>> callback) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onResult(null);
    }
}
