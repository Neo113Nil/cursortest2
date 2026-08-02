package ru.ozon.app.android.search.widgets.feedbackTile.presentation;

import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp10", "containerCornerRadius", "", "titleAtom", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleAtom", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "buttonsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getButtonsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "addViews", "", "createTextAtomV2View", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackTileView extends LinearLayout {

    @NotNull
    private final RecyclerView buttonsRv;
    private final float containerCornerRadius;
    private final int dp10;

    @NotNull
    private final TextAtomV2View titleAtom;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int ITEM_PADDING = UiExtKt.toPx(8);
    private static final int LAYOUT_PADDING = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileView$Companion;", "", "<init>", "()V", "", "ITEM_PADDING", "I", "getITEM_PADDING", "()I", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getITEM_PADDING() {
            return FeedbackTileView.ITEM_PADDING;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeedbackTileView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.titleAtom);
        addView(this.buttonsRv);
    }

    private final TextAtomV2View createTextAtomV2View(Context context) {
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), context);
        return textAtomV2View == null ? new TextAtomV2View(context, null, 0, 6, null) : textAtomV2View;
    }

    @NotNull
    public final RecyclerView getButtonsRv() {
        return this.buttonsRv;
    }

    @NotNull
    public final TextAtomV2View getTitleAtom() {
        return this.titleAtom;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackTileView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(10);
        this.dp10 = px;
        this.containerCornerRadius = UiExtKt.toPxF(16.0f);
        TextAtomV2View createTextAtomV2View = createTextAtomV2View(context);
        createTextAtomV2View.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        createTextAtomV2View.setGravity(1);
        this.titleAtom = createTextAtomV2View;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.feedbackTile);
        recyclerView.setLayoutParams(new FlexboxLayout.a(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        int i13 = ITEM_PADDING;
        ViewExtKt.updatePadding$default(recyclerView, i13, px, i13, 0, 8, null);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context));
        this.buttonsRv = recyclerView;
        int i14 = LAYOUT_PADDING;
        setPadding(0, i14, 0, i14);
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.search.widgets.feedbackTile.presentation.FeedbackTileView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), FeedbackTileView.this.containerCornerRadius);
            }
        });
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setClipToOutline(true);
        setOrientation(1);
        addViews();
    }
}
