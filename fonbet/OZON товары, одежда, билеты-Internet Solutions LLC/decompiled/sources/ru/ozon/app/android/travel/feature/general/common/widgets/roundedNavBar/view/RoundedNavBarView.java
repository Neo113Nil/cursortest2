package ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.view;

import Bl.b;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.presentation.RoundedNavBarVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.view.RoundedNavBarLayout;
import ru.ozon.app.android.travel.utils.searchView.SearchableChildView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0017\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010j\u0002`\u0012J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\r\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J6\u0010\u001b\u001a\u00020\f*\u00060\u001cR\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010j\u0002`\u0012H\u0002J6\u0010 \u001a\u00020\f*\u00060\u001cR\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010j\u0002`\u0012H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarLayout;", "Lru/ozon/app/android/travel/utils/searchView/SearchableChildView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cornersRadius", "", "paddingHorizontal", "", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/presentation/RoundedNavBarVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "setBackground", "backgroundColor", "", "getRoundedOutlineProvider", "ru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarView$getRoundedOutlineProvider$1", "()Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarView$getRoundedOutlineProvider$1;", "createIconButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "addAndBindLeftButtons", "Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarLayout$LayoutBuilder;", "buttonsState", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "addAndBindRightButtons", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RoundedNavBarView extends RoundedNavBarLayout implements SearchableChildView {
    private final float cornersRadius;
    private final int paddingHorizontal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedNavBarView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cornersRadius = ResourceExtKt.toPxF(20, context);
        int px = ResourceExtKt.toPx(6, context);
        this.paddingHorizontal = px;
        setClipToOutline(true);
        setElevation(ResourceExtKt.toPxF(6, context));
        setOutlineProvider(getRoundedOutlineProvider());
        setPadding(px, getPaddingTop(), px, getPaddingBottom());
    }

    private final void addAndBindLeftButtons(RoundedNavBarLayout.LayoutBuilder layoutBuilder, List<IconButtonV3DTO> list, Function1<? super AtomAction, Unit> function1) {
        for (IconButtonV3DTO iconButtonV3DTO : list) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            IconButtonV3View createIconButtonView = createIconButtonView(context);
            layoutBuilder.addLeftView(createIconButtonView);
            IconButtonV3HolderKt.bind(createIconButtonView, iconButtonV3DTO, function1);
        }
    }

    private final void addAndBindRightButtons(RoundedNavBarLayout.LayoutBuilder layoutBuilder, List<IconButtonV3DTO> list, Function1<? super AtomAction, Unit> function1) {
        for (IconButtonV3DTO iconButtonV3DTO : list) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            IconButtonV3View createIconButtonView = createIconButtonView(context);
            layoutBuilder.addRightView(createIconButtonView);
            IconButtonV3HolderKt.bind(createIconButtonView, iconButtonV3DTO, function1);
        }
    }

    private final IconButtonV3View createIconButtonView(Context context) {
        IconButtonV3View iconButtonV3View = (IconButtonV3View) b.a(IconButtonV3View.class, "type", q.f64554a, null);
        if (iconButtonV3View == null) {
            iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        }
        iconButtonV3View.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return iconButtonV3View;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.view.RoundedNavBarView$getRoundedOutlineProvider$1] */
    private final RoundedNavBarView$getRoundedOutlineProvider$1 getRoundedOutlineProvider() {
        return new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.view.RoundedNavBarView$getRoundedOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                if (outline != null) {
                    int width = RoundedNavBarView.this.getWidth();
                    int height = RoundedNavBarView.this.getHeight();
                    f7 = RoundedNavBarView.this.cornersRadius;
                    outline.setRoundRect(0, 0, width, height, f7);
                }
            }
        };
    }

    private final void setBackground(String backgroundColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, backgroundColor);
        if (parseColor != null) {
            setBackgroundColor(parseColor.intValue());
        }
    }

    public final void bind(@NotNull RoundedNavBarVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        clearAllViews();
        RoundedNavBarLayout.LayoutBuilder layoutBuilder = new RoundedNavBarLayout.LayoutBuilder();
        addAndBindLeftButtons(layoutBuilder, item.getLeftButtons(), actionHandler);
        addAndBindRightButtons(layoutBuilder, item.getRightButtons(), actionHandler);
        addAllViews();
        requestLayout();
        String backgroundColor = item.getBackgroundColor();
        if (backgroundColor != null) {
            setBackground(backgroundColor);
        }
    }
}
