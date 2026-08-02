package ru.ozon.android.uikit.appearance;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/android/uikit/appearance/ProxyAttributeAppearance;", "Landroid/view/View;", "T", "Lru/ozon/android/uikit/appearance/StyleAppearance;", "", "appearances", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ProxyAttributeAppearance<T extends View> implements StyleAppearance<T> {

    @NotNull
    private final List<StyleAppearance<T>> appearances;

    /* JADX WARN: Multi-variable type inference failed */
    public ProxyAttributeAppearance(@NotNull List<? extends StyleAppearance<T>> appearances) {
        Intrinsics.checkNotNullParameter(appearances, "appearances");
        this.appearances = appearances;
    }
}
