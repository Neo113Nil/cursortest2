package com.vk.im.engine.internal.longpoll.polling_tasks.channels;

/* compiled from: ChannelsLongPollUnsupportedException.kt */
/* loaded from: classes2.dex */
public final class ChannelsLongPollUnsupportedException extends Exception {
    public ChannelsLongPollUnsupportedException() {
        super("Unsupported LongPollType.CHANNELS history/init call");
    }
}
