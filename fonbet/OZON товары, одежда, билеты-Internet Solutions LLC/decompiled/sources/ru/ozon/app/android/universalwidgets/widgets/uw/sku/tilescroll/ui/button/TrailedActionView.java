package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.button;

import Dc0.n;
import I1.w;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.c;
import id.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.ConstraintLayoutExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR/\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\fR0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/button/TrailedActionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "prepareUI", "()V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TrailedActionVO;", "data", "bindVO", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TrailedActionVO;)V", "<set-?>", "viewObject$delegate", "Lid/f;", "getViewObject", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TrailedActionVO;", "setViewObject", "viewObject", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "", "innerVerticalMargin", "I", "outerMargin", "maxContentWidth", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "text", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrailedActionView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {w.c(TrailedActionView.class, "viewObject", "getViewObject()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TrailedActionVO;", 0)};

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final IconButtonV3View iconButton;
    private final int innerVerticalMargin;
    private final int maxContentWidth;
    private final int outerMargin;

    @NotNull
    private final TextAtomV2View text;

    /* renamed from: viewObject$delegate, reason: from kotlin metadata */
    @NotNull
    private final f viewObject;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/button/TrailedActionView$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "layoutParams", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TrailedActionVO;", "viewObject", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/button/TrailedActionView;", "create", "(Landroid/content/Context;Landroidx/constraintlayout/widget/ConstraintLayout$b;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TrailedActionVO;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/button/TrailedActionView;", "", "LOCATOR", "Ljava/lang/String;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrailedActionView create$default(Companion companion, Context context, ConstraintLayout.b bVar, TileScrollVO.ItemVO.TrailedActionVO trailedActionVO, Function1 function1, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bVar = null;
            }
            if ((i11 & 4) != 0) {
                trailedActionVO = null;
            }
            if ((i11 & 8) != 0) {
                function1 = null;
            }
            return companion.create(context, bVar, trailedActionVO, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [android.view.ViewGroup$LayoutParams] */
        @NotNull
        public final TrailedActionView create(@NotNull Context context, ConstraintLayout.b layoutParams, TileScrollVO.ItemVO.TrailedActionVO viewObject, Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(context, "context");
            TrailedActionView trailedActionView = new TrailedActionView(context, null);
            ConstraintLayout.b bVar = layoutParams;
            if (layoutParams == null) {
                bVar = new ViewGroup.LayoutParams(-2, -1);
            }
            trailedActionView.setLayoutParams(bVar);
            trailedActionView.setViewObject(viewObject);
            trailedActionView.setActionHandler(actionHandler);
            return trailedActionView;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrailedActionView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindVO(TileScrollVO.ItemVO.TrailedActionVO data) {
        if (data == null) {
            ViewExtKt.gone(this.iconButton);
            ViewExtKt.gone(this.text);
        } else {
            TextHolderKt.bindOrGone$default(this.text, data.getTextAtom(), null, 2, null);
            IconButtonV3HolderKt.bindOrGone(this.iconButton, data.getIconButton(), this.actionHandler);
        }
    }

    private final void prepareUI() {
        setOnClickListener(new n(this, 18));
        ConstraintLayoutExtKt.createVerticalChain$default(this, this.innerVerticalMargin, 2, new View[]{this.iconButton, this.text}, null, 8, null);
        setContentDescription("tileScrollTrailButtonContainer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareUI$lambda$7(TrailedActionView trailedActionView, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        TileScrollVO.ItemVO.TrailedActionVO viewObject = trailedActionView.getViewObject();
        if (viewObject == null || (action = viewObject.getAction()) == null || (function1 = trailedActionView.actionHandler) == null) {
            return;
        }
        function1.invoke(action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TileScrollVO.ItemVO.TrailedActionVO getViewObject() {
        return (TileScrollVO.ItemVO.TrailedActionVO) this.viewObject.getValue(this, $$delegatedProperties[0]);
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    public final void setViewObject(TileScrollVO.ItemVO.TrailedActionVO trailedActionVO) {
        this.viewObject.setValue(this, $$delegatedProperties[0], trailedActionVO);
    }

    private TrailedActionView(Context context) {
        super(context);
        final Object obj = null;
        this.viewObject = new c<TileScrollVO.ItemVO.TrailedActionVO>(obj) { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.button.TrailedActionView$special$$inlined$observable$1
            @Override // id.c
            protected void afterChange(m<?> property, TileScrollVO.ItemVO.TrailedActionVO oldValue, TileScrollVO.ItemVO.TrailedActionVO newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                TileScrollVO.ItemVO.TrailedActionVO trailedActionVO = newValue;
                if (Intrinsics.d(trailedActionVO, oldValue)) {
                    return;
                }
                this.bindVO(trailedActionVO);
            }
        };
        this.innerVerticalMargin = ResourceExtKt.toPx(6);
        int px = ResourceExtKt.toPx(8);
        this.outerMargin = px;
        int px2 = (ResourceExtKt.toPx(108) - px) - px;
        this.maxContentWidth = px2;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(View.generateViewId());
        iconButtonV3View.setOnClickListener(new Dc0.m(this, 16));
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41628e = 0;
        bVar.f41634h = 0;
        bVar.setMarginEnd(px);
        bVar.setMarginStart(px);
        bVar.f41617X = true;
        iconButtonV3View.setLayoutParams(bVar);
        addView(iconButtonV3View);
        this.iconButton = iconButtonV3View;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setTextIsSelectable(false);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41628e = 0;
        bVar2.f41634h = 0;
        bVar2.setMarginEnd(px);
        bVar2.setMarginStart(px);
        textAtomV2View.setMaxWidth(px2);
        bVar2.f41617X = true;
        textAtomV2View.setLayoutParams(bVar2);
        textAtomV2View.setEllipsize(TextUtils.TruncateAt.END);
        addView(textAtomV2View);
        this.text = textAtomV2View;
        prepareUI();
    }
}
