package ru.ozon.app.android.search.dialogsearchscreen.utils;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.dialogsearchscreen.utils.RecyclerViewAnimationExtKt;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a?\u0010\n\u001a\u00020\t*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\t*\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagVO;", "data", "Lkotlin/Function0;", "Landroid/view/View;", "tagListProvider", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "tagListMarginListener", "", "updateTapTagsWithAnimation", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V", "", "animationTag", "onAnimationEnd", "(Landroid/view/View;ILandroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RecyclerViewAnimationExtKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd(View view, int i11, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getLayoutParams().height = -2;
        view.requestLayout();
        if (onGlobalLayoutListener != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        view.setTag(i11, null);
    }

    public static final void updateTapTagsWithAnimation(@NotNull final RecyclerView recyclerView, List<DialogSearchBarVO.TapTagVO> list, @NotNull final Function0<? extends View> tagListProvider, final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(tagListProvider, "tagListProvider");
        final int i11 = R$id.heightAnimator;
        Object tag = recyclerView.getTag(i11);
        ValueAnimator valueAnimator = tag instanceof ValueAnimator ? (ValueAnimator) tag : null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int height = recyclerView.getHeight();
        recyclerView.setItemAnimator(null);
        if (onGlobalLayoutListener != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        RecyclerView.g adapter = recyclerView.getAdapter();
        t tVar = adapter instanceof t ? (t) adapter : null;
        if (tVar != null) {
            tVar.submitList(list, new Runnable() { // from class: dI.b
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerViewAnimationExtKt.updateTapTagsWithAnimation$lambda$1(RecyclerView.this, height, onGlobalLayoutListener, tagListProvider, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTapTagsWithAnimation$lambda$1(RecyclerView recyclerView, int i11, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, Function0 function0, int i12) {
        recyclerView.getViewTreeObserver().addOnPreDrawListener(new RecyclerViewAnimationExtKt$updateTapTagsWithAnimation$2$1(recyclerView, i11, onGlobalLayoutListener, function0, i12));
    }
}
