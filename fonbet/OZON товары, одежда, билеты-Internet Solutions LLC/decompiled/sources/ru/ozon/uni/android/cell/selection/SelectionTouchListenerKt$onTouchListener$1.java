package ru.ozon.uni.android.cell.selection;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<unused var>", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SelectionTouchListenerKt$onTouchListener$1 extends AbstractC7737t implements Function2<View, MotionEvent, Boolean> {
    final /* synthetic */ MainAddonWrapperV3<?, ?> $this_onTouchListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionTouchListenerKt$onTouchListener$1(MainAddonWrapperV3<?, ?> mainAddonWrapperV3) {
        super(2);
        this.$this_onTouchListener = mainAddonWrapperV3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            this.$this_onTouchListener.performClick();
        }
        return Boolean.TRUE;
    }
}
