package com.vk.im.engine.models.credentials;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import defpackage.k0;
import java.io.Serializable;
import xsna.epx;
import xsna.qdk;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: UserCredentials.kt */
/* loaded from: classes.dex */
public final class UserCredentials implements qdk, Serializable {
    private static final long serialVersionUID = -8594340285739401658L;
    private final String accessToken;
    private final long createdMs;
    private final int expiresInSec;
    private final String secret;
    private final long userId;

    public UserCredentials(int i, long j, UserId userId, String str, String str2) {
        long j2 = userId.b;
        this.userId = j2;
        this.accessToken = str;
        this.secret = str2;
        this.expiresInSec = i;
        this.createdMs = j;
        if (j2 <= 0) {
            throw new IllegalArgumentException(k0.a(j2, "userId must be > 0. Given: ").toString());
        }
        if (str.length() <= 0) {
            throw new IllegalArgumentException("accessToken must not be empty");
        }
    }

    public final Peer d() {
        long j = this.userId;
        if (j > 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            return new Peer.User(j);
        }
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        return Peer.Unknown.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCredentials)) {
            return false;
        }
        UserCredentials userCredentials = (UserCredentials) obj;
        return this.userId == userCredentials.userId && epx.f(this.accessToken, userCredentials.accessToken) && epx.f(this.secret, userCredentials.secret) && this.expiresInSec == userCredentials.expiresInSec && this.createdMs == userCredentials.createdMs;
    }

    public final long g() {
        return this.userId;
    }

    public final int hashCode() {
        int a = urd0.a(Long.hashCode(this.userId) * 31, 31, this.accessToken);
        String str = this.secret;
        return Long.hashCode(this.createdMs) + shy.a(this.expiresInSec, (a + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserCredentials(userId=");
        sb.append(this.userId);
        sb.append(", accessToken=");
        sb.append(this.accessToken);
        sb.append(", secret=");
        sb.append(this.secret);
        sb.append(", expiresInSec=");
        sb.append(this.expiresInSec);
        sb.append(", createdMs=");
        return vu5.a(')', this.createdMs, sb);
    }
}
