package ru.ozon.pikazon.compose.placeholder;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfo;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/ozon/pikazon/compose/placeholder/OnPlaceholderInfoChangedElement;", "LD1/c0;", "LCg0/a;", "pikazon-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class OnPlaceholderInfoChangedElement extends AbstractC2794c0<Cg0.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f97684a;

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlaceholderInfoChangedElement(@NotNull Function1<? super PlaceholderInfo, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f97684a = (AbstractC7737t) callback;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final Cg0.a getF41119a() {
        return new Cg0.a(this.f97684a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPlaceholderInfoChangedElement) {
            return this.f97684a == ((OnPlaceholderInfoChangedElement) obj).f97684a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f97684a.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // D1.AbstractC2794c0
    public final void update(Cg0.a aVar) {
        Cg0.a node = aVar;
        Intrinsics.checkNotNullParameter(node, "node");
        node.I1(this.f97684a);
    }
}
