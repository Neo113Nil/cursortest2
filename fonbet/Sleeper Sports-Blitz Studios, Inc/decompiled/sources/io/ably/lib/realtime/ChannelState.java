package io.ably.lib.realtime;

/* loaded from: classes9.dex */
public enum ChannelState {
    initialized(ChannelEvent.initialized),
    attaching(ChannelEvent.attaching),
    attached(ChannelEvent.attached),
    detaching(ChannelEvent.detaching),
    detached(ChannelEvent.detached),
    failed(ChannelEvent.failed),
    suspended(ChannelEvent.suspended);

    private final ChannelEvent event;

    ChannelState(ChannelEvent channelEvent) {
        this.event = channelEvent;
    }

    public ChannelEvent getChannelEvent() {
        return this.event;
    }

    public boolean isReattachable() {
        return this == attaching || this == attached || this == suspended;
    }
}
