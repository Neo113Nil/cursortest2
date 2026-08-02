package com.zoho.livechat.android.modules.knowledgebase.ui.listeners;

import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.knowledgebase.ui.entities.Resource;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/listeners/ResourcesListener;", "", "onFailure", "", EventKeys.ERROR_CODE, "", "message", "", "onSuccess", "articles", "", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource;", "moreDataAvailable", "", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ResourcesListener {
    @Keep
    void onFailure(int code, @Nullable String message);

    @Keep
    void onSuccess(@NotNull List<Resource> articles, boolean moreDataAvailable);
}
