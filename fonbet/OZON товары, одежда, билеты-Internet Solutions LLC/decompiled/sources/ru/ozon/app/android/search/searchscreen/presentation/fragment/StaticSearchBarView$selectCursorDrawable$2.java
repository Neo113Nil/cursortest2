package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class StaticSearchBarView$selectCursorDrawable$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ StaticSearchBarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticSearchBarView$selectCursorDrawable$2(StaticSearchBarView staticSearchBarView) {
        super(0);
        this.this$0 = staticSearchBarView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        int i11;
        int i12;
        SearchBarColors searchBarColors;
        GradientDrawable gradientDrawable = new GradientDrawable();
        StaticSearchBarView staticSearchBarView = this.this$0;
        i11 = StaticSearchBarView.cursorWidth;
        i12 = StaticSearchBarView.cursorHeight;
        gradientDrawable.setSize(i11, i12);
        searchBarColors = staticSearchBarView.searchBarColors;
        gradientDrawable.setColor(searchBarColors.getCursorColor());
        return gradientDrawable;
    }
}
