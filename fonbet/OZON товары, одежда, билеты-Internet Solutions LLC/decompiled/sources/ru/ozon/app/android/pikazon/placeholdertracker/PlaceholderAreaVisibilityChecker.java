package ru.ozon.app.android.pikazon.placeholdertracker;

import Sc.InterfaceC3999a;
import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderAreaVisibilityChecker;", "", "", "useNewVisibilityChecker", "Lkotlin/Function0;", "Lru/ozon/app/android/pikazon/placeholdertracker/ViewVisibilityInteractor;", "getViewVisibilityInteractor", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "view", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;", "placeholderInfo", "isVisibleOld", "(Landroid/view/View;Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;)Z", "isPlaceholderVisibleOld", "", "minPercentageViewed", "isEnoughAreaVisibleOld", "(Landroid/view/View;Ljava/lang/Float;)Z", "isEnoughAreaVisible", "isNodeVisible", "(Landroid/view/View;)Z", "isVisible", "Z", "Lkotlin/jvm/functions/Function0;", "Landroid/graphics/Rect;", "globalVisibleRect", "Landroid/graphics/Rect;", "getGlobalVisibleRect$annotations", "()V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlaceholderAreaVisibilityChecker {

    @NotNull
    private final Function0<ViewVisibilityInteractor> getViewVisibilityInteractor;

    @NotNull
    private final Rect globalVisibleRect;
    private final boolean useNewVisibilityChecker;

    /* JADX WARN: Multi-variable type inference failed */
    public PlaceholderAreaVisibilityChecker(boolean z11, @NotNull Function0<? extends ViewVisibilityInteractor> getViewVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(getViewVisibilityInteractor, "getViewVisibilityInteractor");
        this.useNewVisibilityChecker = z11;
        this.getViewVisibilityInteractor = getViewVisibilityInteractor;
        this.globalVisibleRect = new Rect();
    }

    private final boolean isEnoughAreaVisible(View view, Float minPercentageViewed) {
        float viewVisiblePercent = this.getViewVisibilityInteractor.invoke().getViewVisiblePercent(view);
        if (viewVisiblePercent <= 0.0f) {
            return false;
        }
        return minPercentageViewed == null || minPercentageViewed.floatValue() <= viewVisiblePercent;
    }

    @InterfaceC3999a
    private final boolean isEnoughAreaVisibleOld(View view, Float minPercentageViewed) {
        long height = this.globalVisibleRect.height() * this.globalVisibleRect.width();
        long height2 = view.getHeight() * view.getWidth();
        if (height2 > 0) {
            return minPercentageViewed == null || ((float) height) >= minPercentageViewed.floatValue() * ((float) height2);
        }
        return false;
    }

    private final boolean isNodeVisible(View view) {
        if (view.getWindowVisibility() != 0) {
            return false;
        }
        View view2 = view;
        while (view2 != null) {
            if (view2.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        return true;
    }

    @InterfaceC3999a
    private final boolean isPlaceholderVisibleOld(View view, PlaceholderInfo placeholderInfo) {
        return isNodeVisible(view) && view.getGlobalVisibleRect(this.globalVisibleRect) && isEnoughAreaVisibleOld(view, placeholderInfo.getMinVisiblePercentageViewed());
    }

    @InterfaceC3999a
    private final boolean isVisibleOld(View view, PlaceholderInfo placeholderInfo) {
        return view.getParent() != null && isPlaceholderVisibleOld(view, placeholderInfo);
    }

    public final boolean isVisible(@NotNull View view, @NotNull PlaceholderInfo placeholderInfo) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(placeholderInfo, "placeholderInfo");
        return !this.useNewVisibilityChecker ? isVisibleOld(view, placeholderInfo) : view.getParent() != null && isNodeVisible(view) && isEnoughAreaVisible(view, placeholderInfo.getMinVisiblePercentageViewed());
    }
}
