package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateBaseViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateCellCheckboxIconViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateCellCheckboxViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateCellIconViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateHeaderViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateInputViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders.RateTextViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/RateHolderFactory;", "", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onCheckboxAction", "Lkotlin/Function2;", "", "onTextChanged", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateBaseViewHolder;", "Landroid/view/View;", "createHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateBaseViewHolder;", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateHolderFactory {

    @NotNull
    private final Context context;

    @NotNull
    private final Function1<AtomAction, Unit> onCheckboxAction;

    @NotNull
    private final Function2<String, String, Unit> onTextChanged;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.SECTION_TYPE_HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.SECTION_TYPE_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.SECTION_TYPE_INPUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewType.SECTION_TYPE_CELL_ICON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewType.SECTION_TYPE_CELL_CHECKBOX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewType.SECTION_TYPE_CELL_CHECKBOX_ICON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RateHolderFactory(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> onCheckboxAction, @NotNull Function2<? super String, ? super String, Unit> onTextChanged) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onCheckboxAction, "onCheckboxAction");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        this.context = context;
        this.onCheckboxAction = onCheckboxAction;
        this.onTextChanged = onTextChanged;
    }

    @NotNull
    public final RateBaseViewHolder<? extends View> createHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (WhenMappings.$EnumSwitchMapping$0[ViewType.INSTANCE.valueOf(viewType).ordinal()]) {
            case 1:
                return new RateHeaderViewHolder(this.context);
            case 2:
                return new RateTextViewHolder(this.context);
            case 3:
                return new RateInputViewHolder(ViewGroupExtKt.inflate(parent, R$layout.widget_rate_input_item), this.onTextChanged);
            case 4:
                return new RateCellIconViewHolder(this.context);
            case 5:
                return new RateCellCheckboxViewHolder(this.context, this.onCheckboxAction);
            case 6:
                return new RateCellCheckboxIconViewHolder(this.context, this.onCheckboxAction);
            default:
                throw new o();
        }
    }
}
