package ru.ozon.app.android.storefront.widgets.naviBlocksV5.view;

import Fs.ViewOnClickListenerC3059a;
import Lc.a;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation.BlockV5VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013J\b\u0010\u0015\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/view/BlockV5View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp4", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "titleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTextView", "bind", "", "item", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "createIcon", "createTextView", "viewId", "addViews", "setConstraints", "makeRoundedCorners", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlockV5View extends ConstraintLayout {
    public static final int $stable = TextAtomV2View.$stable | IconView.$stable;
    private final int dp2;
    private final int dp4;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TextAtomV2View subtitleTextView;

    @NotNull
    private final TextAtomV2View titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockV5View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.iconView = createIcon();
        this.titleTextView = createTextView(R$id.blockTitleV5);
        this.subtitleTextView = createTextView(R$id.blockSubtitleV5);
        addViews();
        setConstraints();
        makeRoundedCorners();
        int px = ResourceExtKt.toPx(12, context);
        setPadding(px, px, px, px);
    }

    private final void addViews() {
        addView(this.iconView);
        addView(this.titleTextView);
        addView(this.subtitleTextView);
    }

    private final IconView createIcon() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.blockIconV5);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        return iconView;
    }

    private final TextAtomV2View createTextView(int viewId) {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomV2View.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
        a.d(textAtomV2View, viewId, 0, -2, false);
        return textAtomV2View;
    }

    private final void makeRoundedCorners() {
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.storefront.widgets.naviBlocksV5.view.BlockV5View$makeRoundedCorners$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null) {
                    return;
                }
                Context context = BlockV5View.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                float pxF = ResourceExtKt.toPxF(16, context);
                if (outline != null) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), pxF);
                }
            }
        });
        setClipToOutline(true);
    }

    private final void setConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new BlockV5View$setConstraints$1(this));
    }

    public final void bind(@NotNull BlockV5VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor().getId());
        if (parseColor != null) {
            setBackgroundColor(parseColor.intValue());
        }
        IconHolderKt.bind$default(this.iconView, item.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.titleTextView, item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleTextView, item.getSubtitle(), null, 2, null);
        AtomAction action = item.getAction();
        setOnClickListener(action != null ? new ViewOnClickListenerC3059a(5, actionHandler, action) : null);
    }
}
