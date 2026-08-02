package ru.ozon.app.android.travel.molecules.view.quickFiltersRowList;

import android.content.Context;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersLayoutManager;", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lcom/google/android/flexbox/c;", "getFlexLinesInternal", "()Ljava/util/List;", "", "count", "", "setMaxLines", "(I)V", "maxLinesCount", "I", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuickFiltersLayoutManager extends FlexboxLayoutManager {
    private int maxLinesCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickFiltersLayoutManager(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxLinesCount = 5;
    }

    @Override // com.google.android.flexbox.FlexboxLayoutManager, com.google.android.flexbox.a
    @NotNull
    public List<c> getFlexLinesInternal() {
        List<c> flexLinesInternal = super.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        int i11 = this.maxLinesCount;
        if (size > i11) {
            flexLinesInternal.subList(i11, size).clear();
        }
        return flexLinesInternal;
    }

    public final void setMaxLines(int count) {
        if (count != this.maxLinesCount) {
            this.maxLinesCount = count;
            if (getChildCount() != 0) {
                requestLayout();
            }
        }
    }
}
