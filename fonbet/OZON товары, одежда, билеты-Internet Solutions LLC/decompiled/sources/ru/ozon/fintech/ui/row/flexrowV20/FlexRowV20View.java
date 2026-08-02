package ru.ozon.fintech.ui.row.flexrowV20;

import H30.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerAdapter;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.base.NoScrollRecycler;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/ui/row/flexrowV20/FlexRowV20View;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerPagedAdapter", "Lcom/detmir/recycli/adapters/RecyclerAdapter;", "llm", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "state", "Lru/ozon/fintech/ui/row/flexrowV20/FlexRowV20State;", "provideWidgetState", "provideActualWidget", "Landroid/view/View;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlexRowV20View extends WidgetFrameLayout {

    @NotNull
    private FlexboxLayoutManager llm;

    @NotNull
    private final RecyclerView recycler;

    @NotNull
    private final RecyclerAdapter recyclerPagedAdapter;
    private FlexRowV20State state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlexRowV20View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull FlexRowV20State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        FlexRowV20State flexRowV20State = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, flexRowV20State != null ? flexRowV20State.getCommon() : null);
        Common common2 = state.getCommon();
        FlexRowV20State flexRowV20State2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, flexRowV20State2 != null ? flexRowV20State2.getCommon() : null);
        Common common3 = state.getCommon();
        FlexRowV20State flexRowV20State3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, flexRowV20State3 != null ? flexRowV20State3.getCommon() : null, null, 4, null);
        this.state = state;
        FlexboxLayoutManager flexboxLayoutManager = this.llm;
        Integer alignment = state.getAlignment();
        int i11 = 0;
        if (alignment == null || alignment.intValue() != 8388611) {
            if (alignment != null && alignment.intValue() == 8388613) {
                i11 = 1;
            } else if ((alignment != null && alignment.intValue() == 1) || (alignment != null && alignment.intValue() == 17)) {
                i11 = 2;
            }
        }
        flexboxLayoutManager.setJustifyContent(i11);
        this.recyclerPagedAdapter.bindState(state.getWidgets());
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.recycler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlexRowV20View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState, reason: from getter */
    public FlexRowV20State getState() {
        return this.state;
    }

    public /* synthetic */ FlexRowV20View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexRowV20View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        this.recyclerPagedAdapter = recyclerAdapter;
        NoScrollRecycler noScrollRecycler = new NoScrollRecycler(context, null, 6, 0);
        this.recycler = noScrollRecycler;
        noScrollRecycler.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        getPaddingFrameLayout().addView(noScrollRecycler);
        noScrollRecycler.setClipChildren(false);
        noScrollRecycler.setClipToPadding(false);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
        this.llm = flexboxLayoutManager;
        flexboxLayoutManager.setFlexDirection(0);
        this.llm.setFlexWrap(1);
        this.llm.setAlignItems(0);
        noScrollRecycler.setNestedScrollingEnabled(false);
        noScrollRecycler.setLayoutManager(this.llm);
        noScrollRecycler.setAdapter(recyclerAdapter);
        noScrollRecycler.setClipToOutline(true);
        r.a(noScrollRecycler);
    }
}
