package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import Sc.InterfaceC4008j;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J)\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u001b\u00106\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b2\u00103*\u0004\b4\u00105R\u001b\u0010:\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b7\u00108*\u0004\b9\u00105R\u001b\u0010>\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b;\u0010<*\u0004\b=\u00105R\u001b\u0010A\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b?\u00103*\u0004\b@\u00105¨\u0006B"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindName", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nameIcon", "bindNameIcon", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "bindDate", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "subscribeControl", "bindSubscribe", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;Lkotlin/jvm/functions/Function1;)V", "", "hasIcon", "hasSubscribe", "", "nameLeftMargin", "dateLeftMargin", "setupConstraints", "(ZZII)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$HeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "bind", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO$Content$HeaderVO;Lkotlin/jvm/functions/Function1;)V", "", "viewIds", "[I", "LSc/j;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "nameBadgeDelegate", "LSc/j;", "Lru/ozon/uni/android/atom/icon/IconView;", "nameIconDelegate", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "dateTextDelegate", "subscribeBadgeDelegate", "getNameBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "getNameBadge$delegate", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentHeaderView;)Ljava/lang/Object;", "nameBadge", "getNameIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "getNameIconView$delegate", "nameIconView", "getDateText", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getDateText$delegate", "dateText", "getSubscribeBadge", "getSubscribeBadge$delegate", "subscribeBadge", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentHeaderView extends ConstraintLayout {

    @NotNull
    private final InterfaceC4008j<TextAtomV2View> dateTextDelegate;

    @NotNull
    private final InterfaceC4008j<BadgeView> nameBadgeDelegate;

    @NotNull
    private final InterfaceC4008j<IconView> nameIconDelegate;

    @NotNull
    private final InterfaceC4008j<BadgeView> subscribeBadgeDelegate;

    @NotNull
    private final int[] viewIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentHeaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewIds = new int[]{R$id.commentNameBadge, R$id.commentNameIcon, R$id.commentDateText, R$id.commentSubscribeBadge};
        this.nameBadgeDelegate = LazyUtilsKt.unsafeLazy(new CommentHeaderView$nameBadgeDelegate$1(context));
        this.nameIconDelegate = LazyUtilsKt.unsafeLazy(new CommentHeaderView$nameIconDelegate$1(context));
        this.dateTextDelegate = LazyUtilsKt.unsafeLazy(new CommentHeaderView$dateTextDelegate$1(context));
        this.subscribeBadgeDelegate = LazyUtilsKt.unsafeLazy(new CommentHeaderView$subscribeBadgeDelegate$1(context));
    }

    private final void bindDate(TextDTO date) {
        if (date == null && !this.dateTextDelegate.isInitialized()) {
            return;
        }
        if (getDateText().getParent() == null) {
            addView(getDateText());
        }
        TextHolderKt.bindOrGone$default(getDateText(), date, null, 2, null);
    }

    private final void bindName(BadgeDTO name, Function1<? super AtomAction, Unit> actionHandler) {
        if (name == null && !this.nameBadgeDelegate.isInitialized()) {
            return;
        }
        if (getNameBadge().getParent() == null) {
            addView(getNameBadge());
        }
        BadgeHolderKt.bindOrGone(getNameBadge(), name, actionHandler);
    }

    private final void bindNameIcon(IconDTO nameIcon) {
        if (nameIcon == null && !this.nameIconDelegate.isInitialized()) {
            return;
        }
        if (getNameIconView().getParent() == null) {
            addView(getNameIconView());
        }
        IconHolderKt.bindOrGone$default(getNameIconView(), nameIcon, null, 2, null);
    }

    private final void bindSubscribe(CommentV3DTO.Control subscribeControl, Function1<? super AtomAction, Unit> actionHandler) {
        if (subscribeControl == null && !this.subscribeBadgeDelegate.isInitialized()) {
            return;
        }
        if (getSubscribeBadge().getParent() == null) {
            addView(getSubscribeBadge());
        }
        AtomDTO selected = subscribeControl != null ? subscribeControl.isSelected() ? subscribeControl.getSelected() : subscribeControl.getNormal() : null;
        BadgeHolderKt.bindOrGone(getSubscribeBadge(), selected instanceof BadgeDTO ? (BadgeDTO) selected : null, new CommentHeaderView$bindSubscribe$1(subscribeControl, this, actionHandler));
    }

    private final TextAtomV2View getDateText() {
        return this.dateTextDelegate.getValue();
    }

    private final BadgeView getNameBadge() {
        return this.nameBadgeDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconView getNameIconView() {
        return this.nameIconDelegate.getValue();
    }

    private final BadgeView getSubscribeBadge() {
        return this.subscribeBadgeDelegate.getValue();
    }

    private final void setupConstraints(boolean hasIcon, boolean hasSubscribe, int nameLeftMargin, int dateLeftMargin) {
        ConstraintLayoutExtKt.updateConstraints(this, new CommentHeaderView$setupConstraints$1(this, nameLeftMargin, hasIcon, dateLeftMargin, hasSubscribe));
    }

    public final void bind(@NotNull CommentV3VO.Content.HeaderVO header, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindName(header.getName(), actionHandler);
        bindNameIcon(header.getNameIcon());
        bindDate(header.getDate());
        bindSubscribe(header.getSubscribeControl(), actionHandler);
        setupConstraints(header.getNameIcon() != null, header.getSubscribeControl() != null, header.getNameLeftPadding(), header.getDateLeftPadding());
    }
}
