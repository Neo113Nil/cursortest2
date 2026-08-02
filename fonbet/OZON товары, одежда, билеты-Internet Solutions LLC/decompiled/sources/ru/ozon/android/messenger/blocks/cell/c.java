package ru.ozon.android.messenger.blocks.cell;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84458a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f84459b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f84460c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f84461d;

    public c(ru.ozon.android.messenger.framework.presentation.models.c blockId, String cellTitle, boolean z11) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        this.f84458a = blockId;
        this.f84459b = cellTitle;
        this.f84460c = z11;
        this.f84461d = z11;
    }

    public final boolean a() {
        return this.f84461d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f84458a, cVar.f84458a) && Intrinsics.d(this.f84459b, cVar.f84459b) && this.f84460c == cVar.f84460c && this.f84461d == cVar.f84461d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84458a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84461d) + C3532b.a(G.g.a(this.f84458a.hashCode() * 31, 31, this.f84459b), 31, this.f84460c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CellVO(blockId=");
        sb2.append(this.f84458a);
        sb2.append(", cellTitle=");
        sb2.append(this.f84459b);
        sb2.append(", defaultValue=");
        sb2.append(this.f84460c);
        sb2.append(", currentValue=");
        return Pk0.a.a(")", sb2, this.f84461d);
    }
}
