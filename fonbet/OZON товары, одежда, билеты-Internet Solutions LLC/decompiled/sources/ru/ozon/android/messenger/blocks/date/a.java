package ru.ozon.android.messenger.blocks.date;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.o;

/* loaded from: classes10.dex */
public final class a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85020a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final DateTime f85021b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f85022c;

    public a(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull DateTime date, @NotNull String formatedDate) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(formatedDate, "formatedDate");
        this.f85020a = blockId;
        this.f85021b = date;
        this.f85022c = formatedDate;
    }

    @NotNull
    public final DateTime a() {
        return this.f85021b;
    }

    @NotNull
    public final String b() {
        return this.f85022c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f85020a, aVar.f85020a) && Intrinsics.d(this.f85021b, aVar.f85021b) && Intrinsics.d(this.f85022c, aVar.f85022c);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85020a;
    }

    public final int hashCode() {
        return this.f85022c.hashCode() + GR.b.a(this.f85021b, this.f85020a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateVO(blockId=");
        sb2.append(this.f85020a);
        sb2.append(", date=");
        sb2.append(this.f85021b);
        sb2.append(", formatedDate=");
        return o0.c(sb2, this.f85022c, ")");
    }
}
