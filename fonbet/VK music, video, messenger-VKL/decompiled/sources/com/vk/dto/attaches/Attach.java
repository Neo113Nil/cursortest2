package com.vk.dto.attaches;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;

/* compiled from: Attach.kt */
/* loaded from: classes18.dex */
public interface Attach extends Serializer.StreamParcelable {
    AttachSyncState G0();

    String N4(String str);

    void S2(AttachSyncState attachSyncState);

    default boolean Ya() {
        return G0() == AttachSyncState.DONE;
    }

    void c(UserId userId);

    Attach copy();

    default boolean h0() {
        return G0().i();
    }

    void m0(int i);

    UserId q();

    int xb();
}
