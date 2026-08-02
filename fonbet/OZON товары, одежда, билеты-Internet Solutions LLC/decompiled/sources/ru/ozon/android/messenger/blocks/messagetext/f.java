package ru.ozon.android.messenger.blocks.messagetext;

import C.o0;
import android.text.Spannable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f implements ru.ozon.android.messenger.framework.presentation.models.g, ru.ozon.android.messenger.framework.presentation.models.i, ru.ozon.android.messenger.framework.presentation.models.j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85866a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f85867b;

    /* renamed from: c, reason: collision with root package name */
    private String f85868c;

    /* renamed from: d, reason: collision with root package name */
    private String f85869d;

    public f(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull Spannable text, String str, String str2) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f85866a = blockId;
        this.f85867b = text;
        this.f85868c = str;
        this.f85869d = str2;
    }

    public static f c(f fVar, Spannable text) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = fVar.f85866a;
        String str = fVar.f85868c;
        String str2 = fVar.f85869d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(text, "text");
        return new f(blockId, text, str, str2);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.i
    public final String a() {
        return this.f85869d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.i
    public final void b(String str) {
        this.f85869d = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.text.Spannable, java.lang.Object] */
    @NotNull
    public final Spannable d() {
        return this.f85867b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f85866a, fVar.f85866a) && Intrinsics.d(this.f85867b, fVar.f85867b) && Intrinsics.d(this.f85868c, fVar.f85868c) && Intrinsics.d(this.f85869d, fVar.f85869d);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85866a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final String getSendTime() {
        return this.f85868c;
    }

    public final int hashCode() {
        int c11 = H00.a.c(this.f85866a.hashCode() * 31, 31, this.f85867b);
        String str = this.f85868c;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85869d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final void setSendTime(String str) {
        this.f85868c = str;
    }

    @NotNull
    public final String toString() {
        String str = this.f85868c;
        String str2 = this.f85869d;
        StringBuilder sb2 = new StringBuilder("MessageTextVO(blockId=");
        sb2.append(this.f85866a);
        sb2.append(", text=");
        sb2.append(this.f85867b);
        sb2.append(", sendTime=");
        sb2.append(str);
        sb2.append(", author=");
        return o0.c(sb2, str2, ")");
    }
}
