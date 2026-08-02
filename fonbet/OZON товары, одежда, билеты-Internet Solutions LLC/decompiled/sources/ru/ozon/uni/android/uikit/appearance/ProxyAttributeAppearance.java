package ru.ozon.uni.android.uikit.appearance;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/ProxyAttributeAppearance;", "T", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "appearances", "", "<init>", "(Ljava/util/List;)V", "resId", "", "Ljava/lang/Integer;", "read", "", "context", "Landroid/content/Context;", "apply", "view", "(Landroid/view/View;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProxyAttributeAppearance<T extends View> implements StyleAppearance<T> {

    @NotNull
    private final List<StyleAppearance<T>> appearances;
    private Integer resId;

    /* JADX WARN: Multi-variable type inference failed */
    public ProxyAttributeAppearance(@NotNull List<? extends StyleAppearance<T>> appearances) {
        Intrinsics.checkNotNullParameter(appearances, "appearances");
        this.appearances = appearances;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void apply(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.d(this.resId, view.getTag(R$id.atom_style_res))) {
            return;
        }
        Iterator<StyleAppearance<T>> it = this.appearances.iterator();
        while (it.hasNext()) {
            it.next().apply(view);
        }
        view.setTag(R$id.atom_style_res, this.resId);
    }

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void read(@NotNull Context context, int resId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer num = this.resId;
        if (num != null && num.intValue() == resId) {
            return;
        }
        Iterator<StyleAppearance<T>> it = this.appearances.iterator();
        while (it.hasNext()) {
            it.next().read(context, resId);
        }
        this.resId = Integer.valueOf(resId);
    }
}
