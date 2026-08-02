package ru.ozon.app.android.common.buttonwidget.sticky;

import Vg.c;
import android.widget.FrameLayout;
import j10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.common.ui.buttonwidget.ButtonVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.FavoritesListAtomActionSheetHandler;
import ru.ozon.app.android.widgets.buttonWidget.AlignType;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u001e\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0018\u0010\u0013\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/common/buttonwidget/sticky/ButtonV3StickyViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/ui/buttonwidget/ButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/widget/FrameLayout;", "containerView", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "atomActionSheetHandlers", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "store", "<init>", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Ljava/util/Set;LVg/c;)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "item", "", "bindLayoutParams", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lru/ozon/app/android/common/ui/buttonwidget/ButtonVO;)V", "setBgColor", "(Lru/ozon/app/android/common/ui/buttonwidget/ButtonVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/ui/buttonwidget/ButtonVO;Ll20/d;)V", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lj10/h;", "Ljava/util/Set;", "LVg/c;", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "mainButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "button-widget_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonV3StickyViewHolder extends k<ButtonVO> {
    private DisposableActionHandler actionHandler;

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private final Set<AtomActionSheetHandler> atomActionSheetHandlers;

    @NotNull
    private final FrameLayout containerView;
    private final ButtonV3View mainButton;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final c store;

    @NotNull
    private final h<l> voHelper;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlignType.values().length];
            try {
                iArr[AlignType.ALIGN_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlignType.ALIGN_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonV3StickyViewHolder(@NotNull FrameLayout containerView, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull ComposerReferences ref, @NotNull h<l> voHelper, @NotNull Set<? extends AtomActionSheetHandler> atomActionSheetHandlers, @NotNull c store) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(atomActionSheetHandlers, "atomActionSheetHandlers");
        Intrinsics.checkNotNullParameter(store, "store");
        this.containerView = containerView;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.ref = ref;
        this.voHelper = voHelper;
        this.atomActionSheetHandlers = atomActionSheetHandlers;
        this.store = store;
        Object L11 = C7714v.L(ViewGroupExtKt.children(containerView));
        this.mainButton = L11 instanceof ButtonV3View ? (ButtonV3View) L11 : null;
    }

    private final void bindLayoutParams(ButtonV3View buttonV3View, ButtonVO buttonVO) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(buttonVO.getButtonFill() ? -1 : -2, -2);
        int px = ResourceExtKt.toPx(buttonVO.getButtonHorizontalMargin());
        int px2 = ResourceExtKt.toPx(buttonVO.getButtonVerticalMargin());
        layoutParams.leftMargin = px;
        layoutParams.rightMargin = px;
        layoutParams.topMargin = px2;
        layoutParams.bottomMargin = px2;
        int i11 = WhenMappings.$EnumSwitchMapping$0[buttonVO.getAlign().ordinal()];
        layoutParams.gravity = i11 != 1 ? i11 != 2 ? 17 : 5 : 3;
        buttonV3View.setLayoutParams(layoutParams);
    }

    private final void setBgColor(ButtonVO item) {
        this.containerView.setBackgroundColor(ResourceExtKt.color(getContext(), item.getBackgroundColor()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ButtonVO item, @NotNull d info) {
        Function1<AtomAction, Unit> handler;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getButtonV3() == null || this.mainButton == null) {
            return;
        }
        for (AtomActionSheetHandler atomActionSheetHandler : this.atomActionSheetHandlers) {
            if (atomActionSheetHandler instanceof FavoritesListAtomActionSheetHandler) {
                ((FavoritesListAtomActionSheetHandler) atomActionSheetHandler).setRequestId(item.getId());
            }
            atomActionSheetHandler.onBind();
        }
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
        DisposableActionHandler buildDisposableHandler = new ActionHandler.Builder(this.ref, this.voHelper, ButtonVO.class).onPreProcess(new ButtonV3StickyViewHolder$bind$2(this)).customActionHandlers(new ButtonV3StickyViewHolder$bind$3(this)).buildDisposableHandler(item.getId(), U7.d.c(this.ref), this.actionSheetEventHandler);
        this.actionHandler = buildDisposableHandler;
        if (buildDisposableHandler == null || (handler = buildDisposableHandler.getHandler()) == null) {
            return;
        }
        bindLayoutParams(this.mainButton, item);
        ButtonV3HolderKt.bindOrGone(this.mainButton, item.getButtonV3(), handler);
        setBgColor(item);
    }
}
