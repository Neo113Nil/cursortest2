package ru.ozon.uni.utils;

import D1.AbstractC2794c0;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/uni/utils/UniTestInfoTagElement;", "LD1/c0;", "Lru/ozon/uni/utils/UniTestInfoTagModifierNode;", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/e1;", "", "inspectorInfo", "", "packageName", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "create", "()Lru/ozon/uni/utils/UniTestInfoTagModifierNode;", "node", "update", "(Lru/ozon/uni/utils/UniTestInfoTagModifierNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniTestInfoTagElement extends AbstractC2794c0<UniTestInfoTagModifierNode> {

    @NotNull
    private final Function1<C5242e1, Unit> inspectorInfo;

    @NotNull
    private final String packageName;

    @NotNull
    private final TestInfo testInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public UniTestInfoTagElement(@NotNull TestInfo testInfo, @NotNull Function1<? super C5242e1, Unit> inspectorInfo, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(testInfo, "testInfo");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.testInfo = testInfo;
        this.inspectorInfo = inspectorInfo;
        this.packageName = packageName;
    }

    public boolean equals(Object other) {
        UniTestInfoTagElement uniTestInfoTagElement = other instanceof UniTestInfoTagElement ? (UniTestInfoTagElement) other : null;
        return uniTestInfoTagElement != null && Intrinsics.d(this.testInfo, uniTestInfoTagElement.testInfo) && Intrinsics.d(this.packageName, uniTestInfoTagElement.packageName);
    }

    public int hashCode() {
        return this.packageName.hashCode() + this.testInfo.hashCode();
    }

    @Override // D1.AbstractC2794c0
    @NotNull
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public UniTestInfoTagModifierNode getF41119a() {
        return new UniTestInfoTagModifierNode(this.testInfo, this.packageName);
    }

    @Override // D1.AbstractC2794c0
    public void update(@NotNull UniTestInfoTagModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setTestInfo(this.testInfo);
    }
}
