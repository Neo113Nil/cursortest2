package com.vk.id;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFb/b;", "Lcom/vk/id/VKIDUser;", "toVKIDUser", "(LFb/b;)Lcom/vk/id/VKIDUser;", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDUserKt {
    @NotNull
    public static final VKIDUser toVKIDUser(@NotNull Fb.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new VKIDUser(bVar.e(), bVar.f(), bVar.g(), bVar.j(), bVar.h(), bVar.i(), null, 64, null);
    }
}
