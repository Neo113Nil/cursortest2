package ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultBaseViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultFullImageViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultImageItemViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultTextAtomViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model.ResultServiceCell;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\t2\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/ResultAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/holders/ResultBaseViewHolder;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onServiceClickAction", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/holders/ResultBaseViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/holders/ResultBaseViewHolder;I)V", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultAdapter extends t<ResultServiceCell, ResultBaseViewHolder<? extends View>> {

    @NotNull
    private final Context context;

    @NotNull
    private final Function1<AtomAction, Unit> onServiceClickAction;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.SECTION_TYPE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.SECTION_TYPE_SERVICE_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.SECTION_TYPE_FULL_BODY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResultAdapter(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> onServiceClickAction) {
        super(new ResultSectionDiffUtil());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onServiceClickAction, "onServiceClickAction");
        this.context = context;
        this.onServiceClickAction = onServiceClickAction;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ResultBaseViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ResultServiceCell item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bindItem(item, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ResultBaseViewHolder<? extends View> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        ResultBaseViewHolder<? extends View> resultTextAtomViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i11 = WhenMappings.$EnumSwitchMapping$0[ViewType.INSTANCE.valueOf(viewType).ordinal()];
        if (i11 == 1) {
            resultTextAtomViewHolder = new ResultTextAtomViewHolder(this.context);
        } else if (i11 == 2) {
            resultTextAtomViewHolder = new ResultImageItemViewHolder(ViewGroupExtKt.inflate(parent, R$layout.item_nps_service_suggestion), this.onServiceClickAction);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            resultTextAtomViewHolder = new ResultFullImageViewHolder(ViewGroupExtKt.inflate(parent, R$layout.widget_nps_feedback_result_image));
        }
        resultTextAtomViewHolder.onCreateViewHolder();
        return resultTextAtomViewHolder;
    }
}
