package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view;

import B90.k0;
import Lc.a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownVO;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.textsAdapter.DirectFlightsDropdownTextItemsAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.textsAdapter.DirectFlightsDropdownTextItemsDecoration;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dJ\b\u0010&\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp4", "dp6", "dp8", "dp16", "dp46", "aviaIcon", "Lru/ozon/uni/android/atom/image/Image;", "aviaTitle", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "priceLabel", "priceIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "clickOverlay", "Landroid/view/View;", "textListAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/textsAdapter/DirectFlightsDropdownTextItemsAdapter;", "textsList", "Landroidx/recyclerview/widget/RecyclerView;", "endGradient", "gradientView", "cachedActionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "cachedAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "bind", "data", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ItemVO;", "actionHandler", "invokeItemAction", "setupConstraints", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DirectFlightsDropdownItemView extends ConstraintLayout {

    @NotNull
    private final Image aviaIcon;

    @NotNull
    private final TextAtomV2View aviaTitle;
    private CommonControlSettings cachedAction;
    private Function1<? super AtomAction, Unit> cachedActionHandler;

    @NotNull
    private final View clickOverlay;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final int dp46;
    private final int dp6;
    private final int dp8;
    private final int endGradient;

    @NotNull
    private final View gradientView;

    @NotNull
    private final IconView priceIcon;

    @NotNull
    private final TextAtomV2View priceLabel;

    @NotNull
    private final DirectFlightsDropdownTextItemsAdapter textListAdapter;

    @NotNull
    private final RecyclerView textsList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectFlightsDropdownItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp6 = ResourceExtKt.toPx(6, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        int px = ResourceExtKt.toPx(46, context);
        this.dp46 = px;
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.directFlightsDropdownItemAviaIcon);
        image.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(image);
        this.aviaIcon = image;
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        a.d(textAtomV2View, R$id.directFlightsDropdownItemAviaTitle, 0, -2, false);
        addView(g10);
        this.aviaTitle = textAtomV2View;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        a.d(textAtomV2View2, R$id.directFlightsDropdownItemPriceLabel, -2, -2, false);
        addView(g11);
        this.priceLabel = textAtomV2View2;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.directFlightsDropdownItemPriceIcon);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconView);
        this.priceIcon = iconView;
        View view = new View(context);
        view.setId(R$id.directFlightsDropdownItemClickOverlay);
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        addView(view);
        this.clickOverlay = view;
        DirectFlightsDropdownTextItemsAdapter directFlightsDropdownTextItemsAdapter = new DirectFlightsDropdownTextItemsAdapter();
        this.textListAdapter = directFlightsDropdownTextItemsAdapter;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.directFlightsDropdownItemTextsList);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(directFlightsDropdownTextItemsAdapter);
        recyclerView.addItemDecoration(new DirectFlightsDropdownTextItemsDecoration(context));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        addView(recyclerView);
        this.textsList = recyclerView;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.endGradient = themeColor;
        View view2 = new View(context);
        view2.setId(R$id.directFlightsDropdownItemTextsListGradient);
        view2.setLayoutParams(new ConstraintLayout.b(px, 0));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(new int[]{0, themeColor});
        view2.setBackground(gradientDrawable);
        addView(view2);
        this.gradientView = view2;
        recyclerView.addOnItemTouchListener(new RecyclerView.y(context, this) { // from class: ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownItemView.1
            private final GestureDetector gestureDetector;

            {
                this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownItemView$1$gestureDetector$1
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public boolean onSingleTapUp(MotionEvent e11) {
                        Intrinsics.checkNotNullParameter(e11, "e");
                        DirectFlightsDropdownItemView.this.invokeItemAction();
                        return true;
                    }
                });
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                return this.gestureDetector.onTouchEvent(e11);
            }
        });
        setupConstraints();
        view.setOnClickListener(new Il.a(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(DirectFlightsDropdownItemView directFlightsDropdownItemView, DirectFlightsDropdownVO.ItemVO itemVO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        directFlightsDropdownItemView.bind(itemVO, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$15(DirectFlightsDropdownItemView directFlightsDropdownItemView) {
        directFlightsDropdownItemView.textsList.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeItemAction() {
        AtomAction atomAction;
        Function1<? super AtomAction, Unit> function1;
        CommonControlSettings commonControlSettings = this.cachedAction;
        if (commonControlSettings == null || (atomAction = commonControlSettings.toAtomAction()) == null || (function1 = this.cachedActionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new DirectFlightsDropdownItemView$setupConstraints$1(this));
    }

    public final void bind(@NotNull DirectFlightsDropdownVO.ItemVO data, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.cachedAction = data.getCommon();
        this.cachedActionHandler = actionHandler;
        TextHolderKt.bind$default(this.aviaTitle, data.getAviaTitle(), null, 2, null);
        ImageHolderKt.bind$default(this.aviaIcon, data.getAviaIcon(), null, 2, null);
        TextHolderKt.bind$default(this.priceLabel, data.getPrice().getLabel(), null, 2, null);
        IconHolderKt.bind$default(this.priceIcon, data.getPrice().getIcon(), null, 2, null);
        this.textListAdapter.submitList(data.getTextItems(), new k0(this, 3));
    }
}
