package io.ably.lib.objects;

import io.ably.lib.realtime.ChannelBase;
import io.ably.lib.transport.ConnectionManager;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;

/* loaded from: classes9.dex */
public interface ObjectsAdapter {
    ChannelBase getChannel(String str) throws AblyException;

    ClientOptions getClientOptions();

    ConnectionManager getConnectionManager();

    long getTime() throws AblyException;
}
