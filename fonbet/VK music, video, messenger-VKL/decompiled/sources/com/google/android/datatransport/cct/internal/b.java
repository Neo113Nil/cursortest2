package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
import xsna.g52;
import xsna.ok5;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes.dex */
public final class b extends ClientInfo {
    public final ClientInfo.ClientType a;
    public final g52 b;

    /* compiled from: AutoValue_ClientInfo.java */
    /* loaded from: classes12.dex */
    public static final class a extends ClientInfo.a {
        public ClientInfo.ClientType a;
        public ok5 b;

        public final b a() {
            return new b(this.a, this.b);
        }

        public final a b(@Nullable ok5 ok5Var) {
            this.b = ok5Var;
            return this;
        }

        public final a c(@Nullable ClientInfo.ClientType clientType) {
            this.a = clientType;
            return this;
        }
    }

    public b(ClientInfo.ClientType clientType, ok5 ok5Var) {
        this.a = clientType;
        this.b = ok5Var;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public final g52 a() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public final ClientInfo.ClientType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.a;
        if (clientType == null) {
            if (clientInfo.b() != null) {
                return false;
            }
        } else if (!clientType.equals(clientInfo.b())) {
            return false;
        }
        g52 g52Var = this.b;
        return g52Var == null ? clientInfo.a() == null : g52Var.equals(clientInfo.a());
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.a;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        g52 g52Var = this.b;
        return (g52Var != null ? g52Var.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
