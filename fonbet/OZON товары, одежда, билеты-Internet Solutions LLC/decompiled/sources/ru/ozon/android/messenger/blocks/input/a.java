package ru.ozon.android.messenger.blocks.input;

import B0.C2454a;
import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f85340a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85341b;

    /* renamed from: c, reason: collision with root package name */
    private final int f85342c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f85343d;

    public a(@NotNull String acceptedMimeTypes, int i11, int i12, @NotNull String uploadUrl) {
        Intrinsics.checkNotNullParameter(acceptedMimeTypes, "acceptedMimeTypes");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        this.f85340a = acceptedMimeTypes;
        this.f85341b = i11;
        this.f85342c = i12;
        this.f85343d = uploadUrl;
    }

    @NotNull
    public final String a() {
        return this.f85340a;
    }

    public final int b() {
        return this.f85341b;
    }

    public final int c() {
        return this.f85342c;
    }

    @NotNull
    public final String d() {
        return this.f85343d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f85340a, aVar.f85340a) && this.f85341b == aVar.f85341b && this.f85342c == aVar.f85342c && Intrinsics.d(this.f85343d, aVar.f85343d);
    }

    public final int hashCode() {
        return this.f85343d.hashCode() + C2454a.a(this.f85342c, C2454a.a(this.f85341b, this.f85340a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigVO(acceptedMimeTypes=");
        sb2.append(this.f85340a);
        sb2.append(", maxFileSize=");
        sb2.append(this.f85341b);
        sb2.append(", maxFilesCount=");
        sb2.append(this.f85342c);
        sb2.append(", uploadUrl=");
        return o0.c(sb2, this.f85343d, ")");
    }
}
