package ru.ozon.android.messenger.blocks.input;

import G.g;
import T7.E;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f85496a;

    /* renamed from: b, reason: collision with root package name */
    private final long f85497b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f85498c;

    /* renamed from: d, reason: collision with root package name */
    private final CustomBlockDTO f85499d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f85500e;

    public b(@NotNull String chatId, long j11, @NotNull String text, CustomBlockDTO customBlockDTO, @NotNull List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> attachments) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        this.f85496a = chatId;
        this.f85497b = j11;
        this.f85498c = text;
        this.f85499d = customBlockDTO;
        this.f85500e = attachments;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b>] */
    @NotNull
    public final List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> a() {
        return this.f85500e;
    }

    public final CustomBlockDTO b() {
        return this.f85499d;
    }

    @NotNull
    public final String c() {
        return this.f85498c;
    }

    public final long d() {
        return this.f85497b;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    public final boolean e() {
        return this.f85498c.length() == 0 && this.f85499d == null && this.f85500e.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f85496a, bVar.f85496a) && this.f85497b == bVar.f85497b && this.f85498c.equals(bVar.f85498c) && Intrinsics.d(this.f85499d, bVar.f85499d) && Intrinsics.d(this.f85500e, bVar.f85500e);
    }

    public final int hashCode() {
        int a11 = g.a(Pk0.c.a(this.f85496a.hashCode() * 31, 31, this.f85497b), 31, this.f85498c);
        CustomBlockDTO customBlockDTO = this.f85499d;
        return this.f85500e.hashCode() + ((a11 + (customBlockDTO == null ? 0 : customBlockDTO.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DraftVO(chatId=");
        sb2.append(this.f85496a);
        sb2.append(", updatedAt=");
        sb2.append(this.f85497b);
        sb2.append(", text=");
        sb2.append(this.f85498c);
        sb2.append(", customBlock=");
        sb2.append(this.f85499d);
        sb2.append(", attachments=");
        return E.c(this.f85500e, ")", sb2);
    }
}
