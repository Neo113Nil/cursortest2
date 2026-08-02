package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation;

import B0.C2454a;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data.FastAnswerDTO;

/* loaded from: classes10.dex */
public final class b implements l20.c {

    /* renamed from: a, reason: collision with root package name */
    private final long f86966a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final FastAnswerDTO.FastAnswerTemplateCellDTO f86967b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f86968c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f86969d;

    /* renamed from: e, reason: collision with root package name */
    private final int f86970e;

    /* renamed from: f, reason: collision with root package name */
    private final int f86971f;

    public b(long j11, @NotNull FastAnswerDTO.FastAnswerTemplateCellDTO cell, boolean z11, boolean z12, int i11, int i12) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.f86966a = j11;
        this.f86967b = cell;
        this.f86968c = z11;
        this.f86969d = z12;
        this.f86970e = i11;
        this.f86971f = i12;
    }

    @NotNull
    public final FastAnswerDTO.FastAnswerTemplateCellDTO a() {
        return this.f86967b;
    }

    public final int b() {
        return this.f86971f;
    }

    public final int c() {
        return this.f86970e;
    }

    public final boolean d() {
        return this.f86969d;
    }

    public final boolean e() {
        return this.f86968c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f86966a == bVar.f86966a && Intrinsics.d(this.f86967b, bVar.f86967b) && this.f86968c == bVar.f86968c && this.f86969d == bVar.f86969d && this.f86970e == bVar.f86970e && this.f86971f == bVar.f86971f;
    }

    @Override // l20.c
    public final long getId() {
        return this.f86966a;
    }

    @Override // l20.c
    public final Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public final int getViewItemKey() {
        return hashCode();
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86971f) + C2454a.a(this.f86970e, C3532b.a(C3532b.a((this.f86967b.hashCode() + (Long.hashCode(this.f86966a) * 31)) * 31, 31, this.f86968c), 31, this.f86969d), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FastAnswersItemVO(id=");
        sb2.append(this.f86966a);
        sb2.append(", cell=");
        sb2.append(this.f86967b);
        sb2.append(", roundTop=");
        sb2.append(this.f86968c);
        sb2.append(", roundBottom=");
        sb2.append(this.f86969d);
        sb2.append(", paddingTop=");
        sb2.append(this.f86970e);
        sb2.append(", paddingBottom=");
        return K00.b.e(this.f86971f, ")", sb2);
    }
}
