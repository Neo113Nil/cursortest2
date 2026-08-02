package ru.ozon.android.messenger.framework.core;

import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87126a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f87127b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends g>> f87128c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull String vertical, @NotNull String name, @NotNull List<? extends ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends g>> viewMappers) {
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(viewMappers, "viewMappers");
        this.f87126a = vertical;
        this.f87127b = name;
        this.f87128c = viewMappers;
    }

    @NotNull
    public final String a() {
        return this.f87127b;
    }

    @NotNull
    public final String b() {
        return this.f87126a;
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends g>> c() {
        return this.f87128c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f87126a, aVar.f87126a) && Intrinsics.d(this.f87127b, aVar.f87127b) && Intrinsics.d(this.f87128c, aVar.f87128c);
    }

    public final int hashCode() {
        return this.f87128c.hashCode() + G.g.a(this.f87126a.hashCode() * 31, 31, this.f87127b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Block(vertical=");
        sb2.append(this.f87126a);
        sb2.append(", name=");
        sb2.append(this.f87127b);
        sb2.append(", viewMappers=");
        return C2618u.h(sb2, this.f87128c, ")");
    }
}
