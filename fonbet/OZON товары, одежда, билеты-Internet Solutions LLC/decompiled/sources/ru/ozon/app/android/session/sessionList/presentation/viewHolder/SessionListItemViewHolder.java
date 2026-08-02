package ru.ozon.app.android.session.sessionList.presentation.viewHolder;

import Sc.InterfaceC4008j;
import android.R;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleDefaultHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.sessionList.data.SessionListNeedUpdate;
import ru.ozon.app.android.session.sessionList.presentation.SessionListVO;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 (2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001(B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\f¨\u0006)"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/viewHolder/SessionListItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Item;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleDefaultView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleDefaultView;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/graphics/drawable/ShapeDrawable;", "createBackgroundDrawable", "()Landroid/graphics/drawable/ShapeDrawable;", "item", "", "setCornerRadii", "(Landroid/graphics/drawable/ShapeDrawable;Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Item;)V", "Landroid/graphics/drawable/shapes/RoundRectShape;", "createBackgroundShape", "(Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Item;)Landroid/graphics/drawable/shapes/RoundRectShape;", "Landroid/view/View;", "setVerticalPadding", "(Landroid/view/View;Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Item;)V", "onViewInVisibleBounds", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$Item;Ll20/d;)V", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleDefaultView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "backgroundDrawable$delegate", "LSc/j;", "getBackgroundDrawable", "backgroundDrawable", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionListItemViewHolder extends k<SessionListVO.Item> {

    @NotNull
    private static final float[] CORNER_RADII;
    private static final float CORNER_RADIUS;

    @NotNull
    private static final float[] ZERO_CORNER_RADII;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: backgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundDrawable;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final CellWithSubtitleDefaultView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int CORNER_PADDING = UiExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/viewHolder/SessionListItemViewHolder$Companion;", "", "<init>", "()V", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        float pxF = UiExtKt.toPxF(16);
        CORNER_RADIUS = pxF;
        CORNER_RADII = new float[]{pxF, pxF, pxF, pxF};
        ZERO_CORNER_RADII = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListItemViewHolder(@NotNull CellWithSubtitleDefaultView view, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.backgroundDrawable = LazyUtilsKt.unsafeLazy(new SessionListItemViewHolder$backgroundDrawable$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShapeDrawable createBackgroundDrawable() {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(StyleParser.INSTANCE.parseColor(getContext(), StyleParser.OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE.getValue(), R.color.transparent));
        return shapeDrawable;
    }

    private final RoundRectShape createBackgroundShape(SessionListVO.Item item) {
        float[] fArr = item.getIsFirst() ? CORNER_RADII : ZERO_CORNER_RADII;
        float[] fArr2 = item.getIsLast() ? CORNER_RADII : ZERO_CORNER_RADII;
        C7731m c7731m = new C7731m();
        c7731m.a(fArr);
        c7731m.a(fArr2);
        return new RoundRectShape(c7731m.b(), null, null);
    }

    private final ShapeDrawable getBackgroundDrawable() {
        return (ShapeDrawable) this.backgroundDrawable.getValue();
    }

    private final void setCornerRadii(ShapeDrawable shapeDrawable, SessionListVO.Item item) {
        shapeDrawable.setShape(createBackgroundShape(item));
    }

    private final void setVerticalPadding(View view, SessionListVO.Item item) {
        view.setPadding(view.getPaddingLeft(), item.getIsFirst() ? CORNER_PADDING : 0, view.getPaddingRight(), item.getIsLast() ? CORNER_PADDING : 0);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        if (SessionListNeedUpdate.INSTANCE.getValue().compareAndSet(true, false)) {
            InterfaceC7851b.a.e(this.refs.getController(), null, null, null, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SessionListVO.Item item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellWithSubtitleDefaultHolderKt.bind(this.view, item.getCell(), this.actionHandler);
        setCornerRadii(getBackgroundDrawable(), item);
        this.view.setBackground(getBackgroundDrawable());
        setVerticalPadding(this.view, item);
    }
}
