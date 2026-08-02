package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.K;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "index", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CenterOnScrollListener$selectMiddleItem$1 extends AbstractC7737t implements Function1<Integer, Boolean> {
    final /* synthetic */ LinearLayoutManager $layoutManager;
    final /* synthetic */ K $newIndex;
    final /* synthetic */ RecyclerView $recyclerView;
    final /* synthetic */ int $rvCenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CenterOnScrollListener$selectMiddleItem$1(RecyclerView recyclerView, int i11, K k11, LinearLayoutManager linearLayoutManager) {
        super(1);
        this.$recyclerView = recyclerView;
        this.$rvCenter = i11;
        this.$newIndex = k11;
        this.$layoutManager = linearLayoutManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Boolean invoke(int i11) {
        View view;
        RecyclerView.C findViewHolderForLayoutPosition = this.$recyclerView.findViewHolderForLayoutPosition(i11);
        if (findViewHolderForLayoutPosition == null || (view = findViewHolderForLayoutPosition.itemView) == null) {
            return Boolean.FALSE;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        boolean z11 = false;
        int i12 = iArr[0];
        int width = findViewHolderForLayoutPosition.itemView.getWidth() + i12;
        int i13 = this.$rvCenter;
        if (i12 <= i13 && i13 <= width) {
            z11 = true;
        }
        if (z11) {
            this.$newIndex.f71785a = this.$layoutManager.getPosition(findViewHolderForLayoutPosition.itemView);
        }
        return Boolean.valueOf(!z11);
    }
}
