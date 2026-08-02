package ru.ozon.uni.android.cell.selection;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"/\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"onTouchListener", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/view/MotionEvent;", "", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "getOnTouchListener", "(Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;)Lkotlin/jvm/functions/Function2;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SelectionTouchListenerKt {
    @NotNull
    public static final Function2<View, MotionEvent, Boolean> getOnTouchListener(@NotNull MainAddonWrapperV3<?, ?> mainAddonWrapperV3) {
        Intrinsics.checkNotNullParameter(mainAddonWrapperV3, "<this>");
        return new SelectionTouchListenerKt$onTouchListener$1(mainAddonWrapperV3);
    }
}
