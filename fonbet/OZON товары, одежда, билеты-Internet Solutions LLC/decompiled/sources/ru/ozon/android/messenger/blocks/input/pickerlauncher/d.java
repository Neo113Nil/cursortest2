package ru.ozon.android.messenger.blocks.input.pickerlauncher;

import B0.C2454a;
import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f85552a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85553b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f85554c;

    public d(int i11, int i12, @NotNull List<String> acceptedMimeTypes) {
        Intrinsics.checkNotNullParameter(acceptedMimeTypes, "acceptedMimeTypes");
        this.f85552a = i11;
        this.f85553b = i12;
        this.f85554c = acceptedMimeTypes;
    }

    @NotNull
    public final List<String> a() {
        return this.f85554c;
    }

    public final int b() {
        return this.f85552a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f85552a == dVar.f85552a && this.f85553b == dVar.f85553b && Intrinsics.d(this.f85554c, dVar.f85554c);
    }

    public final int hashCode() {
        return this.f85554c.hashCode() + C2454a.a(this.f85553b, Integer.hashCode(this.f85552a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PickerConfig(maxFilesCount=");
        sb2.append(this.f85552a);
        sb2.append(", maxFileSize=");
        sb2.append(this.f85553b);
        sb2.append(", acceptedMimeTypes=");
        return C2618u.h(sb2, this.f85554c, ")");
    }
}
