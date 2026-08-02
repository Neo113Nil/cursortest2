package org.chromium.net;

import android.net.NetworkCapabilities;

/* loaded from: classes10.dex */
class NetworkCapabilitiesWrapper {
    private final long mNetworkCapabilities;
    private final long mTransportTypes;
    private final NetworkCapabilities mWrapped;

    NetworkCapabilitiesWrapper(int[] networkCapabilities, int[] transportTypes) {
        this.mNetworkCapabilities = packIntoLong(networkCapabilities);
        this.mTransportTypes = packIntoLong(transportTypes);
        this.mWrapped = null;
    }

    NetworkCapabilitiesWrapper(NetworkCapabilities other) {
        this.mWrapped = other;
        this.mNetworkCapabilities = -1L;
        this.mTransportTypes = -1L;
    }

    public boolean hasCapability(int capability) {
        NetworkCapabilities networkCapabilities = this.mWrapped;
        if (networkCapabilities != null) {
            return networkCapabilities.hasCapability(capability);
        }
        return capability >= 0 && capability < 64 && (this.mNetworkCapabilities & (1 << capability)) != 0;
    }

    public boolean hasTransport(int transportType) {
        NetworkCapabilities networkCapabilities = this.mWrapped;
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(transportType);
        }
        return transportType >= 0 && transportType < 64 && (this.mTransportTypes & ((long) (1 << transportType))) != 0;
    }

    private static long packIntoLong(int[] bits) {
        long j = 0;
        for (int i : bits) {
            j |= 1 << i;
        }
        return j;
    }
}
