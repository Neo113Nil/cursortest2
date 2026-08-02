package ru.ozon.uni.foundation.components.icon;

import D1.AbstractC2794c0;
import Z1.h;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.J0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/foundation/components/icon/ScaledClipModifierElement;", "LD1/c0;", "Lru/ozon/uni/foundation/components/icon/ScaledClipNode;", "Ll1/J0;", "shape", "LZ1/h;", "inset", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/e1;", "", "inspectorInfo", "<init>", "(Ll1/J0;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Lru/ozon/uni/foundation/components/icon/ScaledClipNode;", "node", "update", "(Lru/ozon/uni/foundation/components/icon/ScaledClipNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ll1/J0;", "F", "Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ScaledClipModifierElement extends AbstractC2794c0<ScaledClipNode> {
    private final float inset;

    @NotNull
    private final Function1<C5242e1, Unit> inspectorInfo;

    @NotNull
    private final J0 shape;

    public /* synthetic */ ScaledClipModifierElement(J0 j02, float f7, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(j02, f7, function1);
    }

    public boolean equals(Object other) {
        if (!(other instanceof ScaledClipModifierElement)) {
            return false;
        }
        ScaledClipModifierElement scaledClipModifierElement = (ScaledClipModifierElement) other;
        return Intrinsics.d(scaledClipModifierElement.shape, this.shape) && h.b(scaledClipModifierElement.inset, this.inset);
    }

    public int hashCode() {
        return Float.hashCode(this.inset) + (this.shape.hashCode() * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ScaledClipModifierElement(J0 shape, float f7, Function1<? super C5242e1, Unit> inspectorInfo) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.shape = shape;
        this.inset = f7;
        this.inspectorInfo = inspectorInfo;
    }

    @Override // D1.AbstractC2794c0
    @NotNull
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public ScaledClipNode getF41119a() {
        return new ScaledClipNode(this.shape, this.inset, null);
    }

    @Override // D1.AbstractC2794c0
    public void update(@NotNull ScaledClipNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setShape(this.shape);
        node.m2998setInset0680j_4(this.inset);
    }
}
