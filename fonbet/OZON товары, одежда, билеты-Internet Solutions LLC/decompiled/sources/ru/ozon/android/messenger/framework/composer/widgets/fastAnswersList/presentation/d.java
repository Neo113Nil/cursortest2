package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation;

import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d implements l20.c {

    /* renamed from: a, reason: collision with root package name */
    private final long f86992a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f86993b;

    public d(long j11, @NotNull ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f86992a = j11;
        this.f86993b = items;
    }

    @NotNull
    public final List<b> a() {
        return this.f86993b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f86992a == dVar.f86992a && this.f86993b.equals(dVar.f86993b);
    }

    @Override // l20.c
    public final long getId() {
        return this.f86992a;
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
        return this.f86993b.hashCode() + (Long.hashCode(this.f86992a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FastAnswersListVO(id=");
        sb2.append(this.f86992a);
        sb2.append(", items=");
        return Om.a(")", sb2, this.f86993b);
    }
}
