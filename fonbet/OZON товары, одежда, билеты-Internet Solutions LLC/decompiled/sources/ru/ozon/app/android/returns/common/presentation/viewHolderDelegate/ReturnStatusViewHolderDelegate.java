package ru.ozon.app.android.returns.common.presentation.viewHolderDelegate;

import Hj.C3143a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.common.data.dto.ReturnStatusDto;
import ru.ozon.app.android.returns.common.data.dto.ReturnStatusMessage;
import ru.ozon.app.android.returns.common.presentation.views.ReturnStatusView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u0006*\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/ReturnStatusViewHolderDelegate;", "", "Lru/ozon/app/android/returns/common/presentation/views/ReturnStatusView;", "returnStatusView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/returns/common/presentation/views/ReturnStatusView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "bindDescription", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessage;", "message", "bindMessage", "(Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessage;)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "addMarginsIfNotAlone", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessage;)V", "setupMessageRadiusAndBackground", "Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "status", "bind", "(Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;)V", "Lru/ozon/app/android/returns/common/presentation/views/ReturnStatusView;", "Lkotlin/jvm/functions/Function1;", "", "containerBottomPadding$delegate", "LSc/j;", "getContainerBottomPadding", "()I", "containerBottomPadding", "Companion", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnStatusViewHolderDelegate {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: containerBottomPadding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j containerBottomPadding;

    @NotNull
    private final ReturnStatusView returnStatusView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int BUTTON_TOP_MARGIN = UiExtKt.toPx(12);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/ReturnStatusViewHolderDelegate$Companion;", "", "<init>", "()V", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnStatusViewHolderDelegate(@NotNull ReturnStatusView returnStatusView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(returnStatusView, "returnStatusView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.returnStatusView = returnStatusView;
        this.actionHandler = actionHandler;
        this.containerBottomPadding = k.b(ReturnStatusViewHolderDelegate$containerBottomPadding$2.INSTANCE);
    }

    private final void addMarginsIfNotAlone(ButtonV3View buttonV3View, ReturnStatusMessage returnStatusMessage) {
        int i11;
        ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            List b02 = C7714v.b0(returnStatusMessage != null ? returnStatusMessage.getHeader() : null, returnStatusMessage != null ? returnStatusMessage.getText() : null, returnStatusMessage != null ? returnStatusMessage.getCaption() : null);
            if (!(b02 instanceof Collection) || !b02.isEmpty()) {
                Iterator it = b02.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        i11 = BUTTON_TOP_MARGIN;
                        break;
                    }
                }
            }
            i11 = 0;
            bVar.setMargins(((ViewGroup.MarginLayoutParams) bVar).leftMargin, i11, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
        }
    }

    private final void bindDescription(TextAtom description) {
        ReturnStatusView returnStatusView = this.returnStatusView;
        if (description == null) {
            returnStatusView.changeDescriptionGroupVisibility(false);
        } else {
            TextAtomHolderKt.bind(returnStatusView.getDescriptionTextAtomView(), description, this.actionHandler);
            this.returnStatusView.changeDescriptionGroupVisibility(true);
        }
    }

    private final void bindMessage(ReturnStatusMessage message) {
        ReturnStatusView returnStatusView = this.returnStatusView;
        returnStatusView.getMessageContainer().setVisibility(message != null ? 0 : 8);
        if (message != null) {
            returnStatusView.setMessagePaddings(message.getLeftPadding(), message.getTopPadding(), message.getRightPadding(), message.getBottomPadding());
        }
        setupMessageRadiusAndBackground(message);
        TextAtomHolderKt.bindOrGone$default(returnStatusView.getMessageHeaderTAV(), message != null ? message.getHeader() : null, null, 2, null);
        TextAtomHolderKt.bindOrGone$default(returnStatusView.getMessageTextTAV(), message != null ? message.getText() : null, null, 2, null);
        TextAtomHolderKt.bindOrGone$default(returnStatusView.getMessageCaptionTAV(), message != null ? message.getCaption() : null, null, 2, null);
        ButtonV3HolderKt.bindOrGone(returnStatusView.getButton(), message != null ? message.getActionButton() : null, this.actionHandler);
        addMarginsIfNotAlone(returnStatusView.getButton(), message);
        returnStatusView.setPadding(returnStatusView.getPaddingLeft(), returnStatusView.getPaddingTop(), returnStatusView.getPaddingRight(), message == null ? getContainerBottomPadding() : 0);
    }

    private final int getContainerBottomPadding() {
        return ((Number) this.containerBottomPadding.getValue()).intValue();
    }

    private final void setupMessageRadiusAndBackground(ReturnStatusMessage message) {
        ConstraintLayout messageContainer = this.returnStatusView.getMessageContainer();
        if (message == null) {
            return;
        }
        CornerRadius radius = message.getRadius();
        if (radius == null) {
            radius = CornerRadius.RADIUS_500;
        }
        final float pxF = ResourceExtKt.toPxF(radius.getPx());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = messageContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        messageContainer.setBackgroundColor(styleParser.parseColor(context, message.getBackgroundColor(), R$color.bg_secondary));
        messageContainer.setClipToOutline(true);
        messageContainer.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.ReturnStatusViewHolderDelegate$setupMessageRadiusAndBackground$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), pxF);
            }
        });
    }

    public final void bind(@NotNull ReturnStatusDto status) {
        Intrinsics.checkNotNullParameter(status, "status");
        ReturnStatusView returnStatusView = this.returnStatusView;
        BadgeHolderKt.bind(returnStatusView.getBadgeView(), status.getBadge(), this.actionHandler);
        TextAtomHolderKt.bindOrGone$default(returnStatusView.getCaptionTAV(), status.getCaption(), null, 2, null);
        ButtonV3HolderKt.bindOrGone(returnStatusView.getActionButton(), status.getActionButton(), this.actionHandler);
        TestInfo testInfo = status.getTestInfo();
        returnStatusView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        bindDescription(status.getDescription());
        bindMessage(status.getMessage());
    }
}
