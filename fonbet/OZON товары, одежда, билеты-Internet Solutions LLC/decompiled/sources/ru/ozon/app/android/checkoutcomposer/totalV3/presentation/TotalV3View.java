package ru.ozon.app.android.checkoutcomposer.totalV3.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.hints.HintsAdapter;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.interactiveSummary.InteractiveSummaryAdapter;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e¨\u0006'"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO;Lkotlin/jvm/functions/Function1;)V", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/hints/HintsAdapter;", "hintsAdapter", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/hints/HintsAdapter;", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/interactiveSummary/InteractiveSummaryAdapter;", "interactiveSummaryAdapter", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/interactiveSummary/InteractiveSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "interactiveSummaryRV", "Landroidx/recyclerview/widget/RecyclerView;", "getInteractiveSummaryRV", "()Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "hintsRV", "getHintsRV", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalV3View extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final HintsAdapter hintsAdapter;

    @NotNull
    private final RecyclerView hintsRV;

    @NotNull
    private final InteractiveSummaryAdapter interactiveSummaryAdapter;

    @NotNull
    private final RecyclerView interactiveSummaryRV;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_12 = UiExtKt.toPx(12);
    private static final int DP_16 = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3View$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TotalV3View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull TotalV3VO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.actionHandler = onAction;
        ButtonV3HolderKt.bind(this.buttonView, item.getInteractiveActions().getButton(), onAction);
        this.hintsAdapter.submitList(item.getInteractiveActions().getHints());
        this.interactiveSummaryAdapter.submitList(item.getInteractiveActions().getInteractiveSummary());
    }

    @NotNull
    public final ButtonV3View getButtonView() {
        return this.buttonView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalV3View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        HintsAdapter hintsAdapter = new HintsAdapter();
        this.hintsAdapter = hintsAdapter;
        InteractiveSummaryAdapter interactiveSummaryAdapter = new InteractiveSummaryAdapter(new TotalV3View$interactiveSummaryAdapter$1(this));
        this.interactiveSummaryAdapter = interactiveSummaryAdapter;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        addView(recyclerView);
        this.interactiveSummaryRV = recyclerView;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i12 = DP_12;
        layoutParams.topMargin = i12;
        buttonV3View.setLayoutParams(layoutParams);
        addView(buttonV3View);
        this.buttonView = buttonV3View;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(View.generateViewId());
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView2.setNestedScrollingEnabled(false);
        addView(recyclerView2);
        this.hintsRV = recyclerView2;
        setOrientation(1);
        int i13 = DP_16;
        setPadding(i13, i12, i13, i13);
        recyclerView2.setAdapter(hintsAdapter);
        recyclerView.setAdapter(interactiveSummaryAdapter);
    }
}
