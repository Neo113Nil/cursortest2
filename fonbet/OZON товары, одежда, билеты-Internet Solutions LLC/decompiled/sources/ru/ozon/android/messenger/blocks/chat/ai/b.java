package ru.ozon.android.messenger.blocks.chat.ai;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.presentation.models.g;

/* loaded from: classes10.dex */
public final class b implements g, ru.ozon.android.messenger.blocks.chat.common.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f84481a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.chat.common.c f84482b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84483c;

    public b(int i11, @NotNull ru.ozon.android.messenger.blocks.chat.common.c chatBaseInfoVO, @NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId) {
        Intrinsics.checkNotNullParameter(chatBaseInfoVO, "chatBaseInfoVO");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f84481a = i11;
        this.f84482b = chatBaseInfoVO;
        this.f84483c = blockId;
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    public final String a() {
        return this.f84482b.a();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    public final ContextMenuDTO b() {
        return this.f84482b.b();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b> c() {
        return this.f84482b.c();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.b
    @NotNull
    public final m d() {
        return this.f84482b.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f84481a == bVar.f84481a && Intrinsics.d(this.f84482b, bVar.f84482b) && Intrinsics.d(this.f84483c, bVar.f84483c);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84483c;
    }

    public final int hashCode() {
        return this.f84483c.hashCode() + ((this.f84482b.hashCode() + (Integer.hashCode(this.f84481a) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AiAssistantVO(unreadCount=" + this.f84481a + ", chatBaseInfoVO=" + this.f84482b + ", blockId=" + this.f84483c + ")";
    }
}
