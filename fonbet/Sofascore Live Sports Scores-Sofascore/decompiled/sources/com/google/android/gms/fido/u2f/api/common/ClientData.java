package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public class ClientData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder implements Cloneable {
        public Builder() {
            Parcelable.Creator<ChannelIdValue> creator = ChannelIdValue.CREATOR;
        }

        public final Object clone() {
            return new Builder();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClientData) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }
}
