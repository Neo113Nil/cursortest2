package com.vk.push.common.clientid;

import xsna.epx;

/* compiled from: ClientId.kt */
/* loaded from: classes5.dex */
public final class ClientId {
    public final String a;
    public final ClientIdType b;

    public ClientId(String str, ClientIdType clientIdType) {
        this.a = str;
        this.b = clientIdType;
    }

    public static /* synthetic */ ClientId copy$default(ClientId clientId, String str, ClientIdType clientIdType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientId.a;
        }
        if ((i & 2) != 0) {
            clientIdType = clientId.b;
        }
        return clientId.copy(str, clientIdType);
    }

    public final String component1() {
        return this.a;
    }

    public final ClientIdType component2() {
        return this.b;
    }

    public final ClientId copy(String str, ClientIdType clientIdType) {
        return new ClientId(str, clientIdType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientId)) {
            return false;
        }
        ClientId clientId = (ClientId) obj;
        return epx.f(this.a, clientId.a) && this.b == clientId.b;
    }

    public final ClientIdType getClientIdType() {
        return this.b;
    }

    public final String getClientIdValue() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "ClientId(clientIdValue=" + this.a + ", clientIdType=" + this.b + ')';
    }
}
