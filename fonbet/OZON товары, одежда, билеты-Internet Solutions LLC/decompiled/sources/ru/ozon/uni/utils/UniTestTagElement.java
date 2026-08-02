package ru.ozon.uni.utils;

import D1.AbstractC2794c0;
import androidx.compose.ui.platform.C5242e1;
import java.lang.Enum;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0012\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004BE\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R)\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\r0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/uni/utils/UniTestTagElement;", "", "", "T", "LD1/c0;", "Lru/ozon/uni/utils/UniTestTagModifierNode;", "tag", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/e1;", "", "inspectorInfo", "", "Lru/ozon/uni/utils/UniTestTagParameter;", "", "customInfo", "packageName", "<init>", "(Ljava/lang/Enum;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Ljava/lang/String;)V", "create", "()Lru/ozon/uni/utils/UniTestTagModifierNode;", "node", "update", "(Lru/ozon/uni/utils/UniTestTagModifierNode;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Enum;", "getTag", "()Ljava/lang/Enum;", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/Map;", "getCustomInfo", "()Ljava/util/Map;", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniTestTagElement<T extends Enum<T>> extends AbstractC2794c0<UniTestTagModifierNode<T>> {

    @NotNull
    private final Map<UniTestTagParameter<T>, String> customInfo;

    @NotNull
    private final Function1<C5242e1, Unit> inspectorInfo;

    @NotNull
    private final String packageName;

    @NotNull
    private final T tag;

    /* JADX WARN: Multi-variable type inference failed */
    public UniTestTagElement(@NotNull T tag, @NotNull Function1<? super C5242e1, Unit> inspectorInfo, @NotNull Map<UniTestTagParameter<T>, String> customInfo, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(customInfo, "customInfo");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.tag = tag;
        this.inspectorInfo = inspectorInfo;
        this.customInfo = customInfo;
        this.packageName = packageName;
    }

    public boolean equals(Object other) {
        UniTestTagElement uniTestTagElement = other instanceof UniTestTagElement ? (UniTestTagElement) other : null;
        return uniTestTagElement != null && Intrinsics.d(this.tag, uniTestTagElement.tag) && Intrinsics.d(this.customInfo, uniTestTagElement.customInfo) && Intrinsics.d(this.packageName, uniTestTagElement.packageName);
    }

    public int hashCode() {
        return this.packageName.hashCode() + this.customInfo.hashCode() + this.tag.hashCode();
    }

    @Override // D1.AbstractC2794c0
    @NotNull
    /* renamed from: create */
    public UniTestTagModifierNode<T> getF41119a() {
        return new UniTestTagModifierNode<>(this.tag, this.customInfo, this.packageName);
    }

    @Override // D1.AbstractC2794c0
    public void update(@NotNull UniTestTagModifierNode<T> node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setTag(this.tag);
        node.setCustomInfo(this.customInfo);
    }
}
