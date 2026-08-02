package ru.ozon.android.messenger.blocks.rateoperator.bottomsheet;

import B0.C2454a;
import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.rateoperator.d;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final AtomActionDTO f86218a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f86219b;

    /* renamed from: c, reason: collision with root package name */
    private final int f86220c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f86221d;

    public j(AtomActionDTO atomActionDTO, @NotNull String text, int i11, @NotNull ArrayList reasonsVo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(reasonsVo, "reasonsVo");
        this.f86218a = atomActionDTO;
        this.f86219b = text;
        this.f86220c = i11;
        this.f86221d = reasonsVo;
    }

    public final AtomActionDTO a() {
        return this.f86218a;
    }

    public final int b() {
        return this.f86220c;
    }

    @NotNull
    public final List<d.b> c() {
        return this.f86221d;
    }

    @NotNull
    public final String d() {
        return this.f86219b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f86218a, jVar.f86218a) && this.f86219b.equals(jVar.f86219b) && this.f86220c == jVar.f86220c && Intrinsics.d(this.f86221d, jVar.f86221d);
    }

    public final int hashCode() {
        AtomActionDTO atomActionDTO = this.f86218a;
        return this.f86221d.hashCode() + C2454a.a(this.f86220c, G.g.a((atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31, 31, this.f86219b), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RateOperatorParamsModel(action=");
        sb2.append(this.f86218a);
        sb2.append(", text=");
        sb2.append(this.f86219b);
        sb2.append(", rate=");
        sb2.append(this.f86220c);
        sb2.append(", reasonsVo=");
        return Om.a(")", sb2, this.f86221d);
    }
}
