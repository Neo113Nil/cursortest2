package com.zoho.livechat.android.modules.knowledgebase.ui.listeners;

import androidx.annotation.Keep;
import com.zoho.livechat.android.modules.knowledgebase.ui.entities.Resource;
import com.zoho.salesiqembed.ZohoSalesIQ;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import we.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\t\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\n\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/listeners/SalesIQKnowledgeBaseListener;", "", "Lcom/zoho/salesiqembed/ZohoSalesIQ$k;", "type", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource;", "resource", "", "handleResourceOpened", "(Lcom/zoho/salesiqembed/ZohoSalesIQ$k;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource;)V", "handleResourceClosed", "handleResourceLiked", "handleResourceDisliked", "Lwe/c;", "error", "onError", "(Lcom/zoho/salesiqembed/ZohoSalesIQ$k;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource;Lwe/c;)V", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SalesIQKnowledgeBaseListener {
    @Keep
    default void handleResourceClosed(@NotNull ZohoSalesIQ.k type, @Nullable Resource resource) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Keep
    default void handleResourceDisliked(@NotNull ZohoSalesIQ.k type, @Nullable Resource resource) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Keep
    default void handleResourceLiked(@NotNull ZohoSalesIQ.k type, @Nullable Resource resource) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Keep
    default void handleResourceOpened(@NotNull ZohoSalesIQ.k type, @Nullable Resource resource) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Keep
    default void onError(@NotNull ZohoSalesIQ.k type, @Nullable Resource resource, @NotNull c error) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
