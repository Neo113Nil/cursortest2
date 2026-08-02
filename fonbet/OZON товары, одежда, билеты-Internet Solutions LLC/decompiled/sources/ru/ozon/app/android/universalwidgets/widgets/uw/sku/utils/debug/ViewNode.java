package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.debug;

import B0.A0;
import android.graphics.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/debug/ViewNode;", "", "", "className", "Landroid/graphics/Rect;", "position", "", "children", "<init>", "(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getClassName", "Landroid/graphics/Rect;", "getPosition", "()Landroid/graphics/Rect;", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewNode {

    @NotNull
    private final List<ViewNode> children;

    @NotNull
    private final String className;

    @NotNull
    private final Rect position;

    public ViewNode(@NotNull String className, @NotNull Rect position, @NotNull List<ViewNode> children) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(children, "children");
        this.className = className;
        this.position = position;
        this.children = children;
    }

    @NotNull
    public String toString() {
        String str = this.className;
        Rect rect = this.position;
        int i11 = rect.left;
        int i12 = rect.top;
        int i13 = rect.right;
        int i14 = rect.bottom;
        int size = this.children.size();
        List<ViewNode> list = this.children;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" [");
        sb2.append(i11);
        sb2.append(",");
        sb2.append(i12);
        A0.c(i13, i14, "-", ",", sb2);
        sb2.append("] (children: ");
        sb2.append(size);
        sb2.append(") ");
        sb2.append(list);
        return sb2.toString();
    }
}
