package com.twilio.voice;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class IceOptions {
    private final Set<IceServer> iceServers;
    private final IceTransportPolicy iceTransportPolicy;

    public static class Builder {
        private Set<IceServer> iceServers;
        private IceTransportPolicy iceTransportPolicy = IceTransportPolicy.ALL;

        @NonNull
        public IceOptions build() {
            return new IceOptions(this);
        }

        @NonNull
        public Builder iceServers(@NonNull Set<IceServer> set) {
            Preconditions.checkNotNull(set, "iceServers must not be null");
            this.iceServers = set;
            return this;
        }

        @NonNull
        public Builder iceTransportPolicy(@NonNull IceTransportPolicy iceTransportPolicy) {
            Preconditions.checkNotNull(iceTransportPolicy, "iceTransportPolicy must not be null");
            this.iceTransportPolicy = iceTransportPolicy;
            return this;
        }
    }

    @NonNull
    public Set<IceServer> getIceServers() {
        return this.iceServers;
    }

    public IceServer[] getIceServersArray() {
        IceServer[] iceServerArr = new IceServer[0];
        if (this.iceServers.isEmpty()) {
            return iceServerArr;
        }
        Set<IceServer> set = this.iceServers;
        return (IceServer[]) set.toArray(new IceServer[set.size()]);
    }

    @NonNull
    public IceTransportPolicy getIceTransportPolicy() {
        return this.iceTransportPolicy;
    }

    private IceOptions(Builder builder) {
        this.iceServers = builder.iceServers != null ? builder.iceServers : new HashSet<>();
        this.iceTransportPolicy = builder.iceTransportPolicy;
    }
}
