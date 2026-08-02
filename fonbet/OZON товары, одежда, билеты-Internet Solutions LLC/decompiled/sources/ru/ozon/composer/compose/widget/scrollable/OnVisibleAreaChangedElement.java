package ru.ozon.composer.compose.widget.scrollable;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/OnVisibleAreaChangedElement;", "LD1/c0;", "Lru/ozon/composer/compose/widget/scrollable/g;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class OnVisibleAreaChangedElement extends AbstractC2794c0<g> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<h, Unit> f94702a;

    /* JADX WARN: Multi-variable type inference failed */
    public OnVisibleAreaChangedElement(@NotNull Function1<? super h, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f94702a = callback;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final g getF41119a() {
        return new g(this.f94702a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnVisibleAreaChangedElement) {
            return this.f94702a == ((OnVisibleAreaChangedElement) obj).f94702a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f94702a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(g gVar) {
        g node = gVar;
        Intrinsics.checkNotNullParameter(node, "node");
        node.J1(this.f94702a);
    }
}
