package ru.ozon.fintech.ui.row.verticalrow;

import H30.r;
import H30.z;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.base.NoScrollRecycler;
import ru.ozon.fintech.ui.common.MidDecorator;
import ru.ozon.fintech.ui.databinding.FinVerticalRowViewBinding;
import ru.ozon.fintech.ui.row.base.FrameRoundRow;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/ui/row/verticalrow/VerticalRowView;", "Lru/ozon/fintech/ui/row/base/FrameRoundRow;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/ui/databinding/FinVerticalRowViewBinding;", "recyclerPagedAdapter", "Lcom/detmir/recycli/adapters/RecyclerAdapter;", "state", "Lru/ozon/fintech/ui/row/verticalrow/VerticalRowState;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerticalRowView extends FrameRoundRow {

    @NotNull
    private final FinVerticalRowViewBinding binding;

    @NotNull
    private final RecyclerAdapter recyclerPagedAdapter;
    private VerticalRowState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalRowView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull VerticalRowState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        RecyclerView.n itemDecorationAt = this.binding.verticalRowRecycler.getItemDecorationAt(0);
        Intrinsics.checkNotNullExpressionValue(itemDecorationAt, "getItemDecorationAt(...)");
        if (!Intrinsics.d(itemDecorationAt, state.toMidDecorator())) {
            this.binding.verticalRowRecycler.removeItemDecorationAt(0);
            this.binding.verticalRowRecycler.addItemDecoration(state.toMidDecorator());
        }
        NoScrollRecycler noScrollRecycler = this.binding.verticalRowRecycler;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, state.getBackColor());
        noScrollRecycler.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        this.binding.verticalRowRecycler.setOutlineProvider(getRounded(state.getRadius()));
        this.recyclerPagedAdapter.bindState(state.getWidgets());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalRowView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VerticalRowView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalRowView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        FinVerticalRowViewBinding inflate = FinVerticalRowViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        this.recyclerPagedAdapter = recyclerAdapter;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        NoScrollRecycler noScrollRecycler = inflate.verticalRowRecycler;
        noScrollRecycler.setNestedScrollingEnabled(false);
        noScrollRecycler.setLayoutManager(new LinearLayoutManager(context, 1, false));
        noScrollRecycler.setAdapter(recyclerAdapter);
        noScrollRecycler.setClipToOutline(true);
        r.a(noScrollRecycler);
        noScrollRecycler.addItemDecoration(new MidDecorator(0, 0, 0, 0, 0, MidDecorator.ORIENTATION.VERTICAL));
        VerticalRowState verticalRowState = this.state;
        noScrollRecycler.setOutlineProvider(getRounded(verticalRowState != null ? verticalRowState.getRadius() : null));
    }
}
