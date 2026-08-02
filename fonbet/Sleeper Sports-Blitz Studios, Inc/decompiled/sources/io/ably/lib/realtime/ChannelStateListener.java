package io.ably.lib.realtime;

import io.ably.lib.types.ErrorInfo;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public interface ChannelStateListener {
    void onChannelStateChanged(ChannelStateChange channelStateChange);

    public static class ChannelStateChange {
        public final ChannelState current;
        public final ChannelEvent event;
        public final ChannelState previous;
        public final ErrorInfo reason;
        public final boolean resumed;

        ChannelStateChange(ChannelState channelState, ChannelState channelState2, ErrorInfo errorInfo, boolean z) {
            this.event = channelState.getChannelEvent();
            this.current = channelState;
            this.previous = channelState2;
            this.reason = errorInfo;
            this.resumed = z;
        }

        private ChannelStateChange(ErrorInfo errorInfo, boolean z) {
            this.event = ChannelEvent.update;
            ChannelState channelState = ChannelState.attached;
            this.previous = channelState;
            this.current = channelState;
            this.reason = errorInfo;
            this.resumed = z;
        }

        static ChannelStateChange createUpdateEvent(ErrorInfo errorInfo, boolean z) {
            return new ChannelStateChange(errorInfo, z);
        }

        public String toString() {
            return "{event=" + this.event + ", current=" + this.current + ", previous=" + this.previous + ", reason=" + this.reason + ", resumed=" + this.resumed + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class Multicaster extends io.ably.lib.util.Multicaster<ChannelStateListener> implements ChannelStateListener {
        public Multicaster() {
            super(new ChannelStateListener[0]);
        }

        @Override // io.ably.lib.realtime.ChannelStateListener
        public void onChannelStateChanged(ChannelStateChange channelStateChange) {
            Iterator<ChannelStateListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onChannelStateChanged(channelStateChange);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static class Filter implements ChannelStateListener {
        ChannelStateListener listener;
        ChannelState state;

        @Override // io.ably.lib.realtime.ChannelStateListener
        public void onChannelStateChanged(ChannelStateChange channelStateChange) {
            if (channelStateChange.current == this.state) {
                this.listener.onChannelStateChanged(channelStateChange);
            }
        }

        Filter(ChannelState channelState, ChannelStateListener channelStateListener) {
            this.state = channelState;
            this.listener = channelStateListener;
        }
    }
}
