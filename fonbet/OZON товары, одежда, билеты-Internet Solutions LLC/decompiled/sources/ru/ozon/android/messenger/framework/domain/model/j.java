package ru.ozon.android.messenger.framework.domain.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f88850a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q f88851b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q f88852c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.models.c f88853d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final q f88854e;

    /* renamed from: f, reason: collision with root package name */
    private final String f88855f;

    public j(@NotNull String updateMessageId, @NotNull q originalItem, @NotNull q updatedItem, @NotNull ru.ozon.android.messenger.framework.data.remote.models.c sendMessageModel, @NotNull q editFooter, String str) {
        Intrinsics.checkNotNullParameter(updateMessageId, "updateMessageId");
        Intrinsics.checkNotNullParameter(originalItem, "originalItem");
        Intrinsics.checkNotNullParameter(updatedItem, "updatedItem");
        Intrinsics.checkNotNullParameter(sendMessageModel, "sendMessageModel");
        Intrinsics.checkNotNullParameter(editFooter, "editFooter");
        this.f88850a = updateMessageId;
        this.f88851b = originalItem;
        this.f88852c = updatedItem;
        this.f88853d = sendMessageModel;
        this.f88854e = editFooter;
        this.f88855f = str;
    }

    @NotNull
    public final q a() {
        return this.f88854e;
    }

    @NotNull
    public final q b() {
        return this.f88851b;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.data.remote.models.c c() {
        return this.f88853d;
    }

    @NotNull
    public final String d() {
        return this.f88850a;
    }

    @NotNull
    public final q e() {
        return this.f88852c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f88850a, jVar.f88850a) && Intrinsics.d(this.f88851b, jVar.f88851b) && Intrinsics.d(this.f88852c, jVar.f88852c) && Intrinsics.d(this.f88853d, jVar.f88853d) && Intrinsics.d(this.f88854e, jVar.f88854e) && Intrinsics.d(this.f88855f, jVar.f88855f);
    }

    public final int hashCode() {
        int hashCode = (this.f88854e.hashCode() + ((this.f88853d.hashCode() + ((this.f88852c.hashCode() + ((this.f88851b.hashCode() + (this.f88850a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f88855f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return "UpdateMessagePayload(updateMessageId=" + this.f88850a + ", originalItem=" + this.f88851b + ", updatedItem=" + this.f88852c + ", sendMessageModel=" + this.f88853d + ", editFooter=" + this.f88854e + ", originalText=" + this.f88855f + ")";
    }
}
