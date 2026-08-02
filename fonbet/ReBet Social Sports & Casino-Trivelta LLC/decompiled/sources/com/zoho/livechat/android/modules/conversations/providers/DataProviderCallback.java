package com.zoho.livechat.android.modules.conversations.providers;

import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/providers/DataProviderCallback;", "T", "", "onResult", "", EventKeys.DATA, "(Ljava/lang/Object;)V", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DataProviderCallback<T> {
    void onResult(@Nullable T data);
}
