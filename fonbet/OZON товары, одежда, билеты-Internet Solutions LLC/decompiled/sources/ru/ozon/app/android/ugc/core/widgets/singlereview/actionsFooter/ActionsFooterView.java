package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import gk0.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JI\u0010\u0012\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00103\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010:\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b6\u00107*\u0004\b8\u00109¨\u0006<"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView$ActionsFooterButtonVH;", "holders", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;", "newButtons", "", "isRight", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "updateButtons", "(Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V", "", "getInsertIndex", "(Z)I", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "dto", "createViewHolder", "(Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView$ActionsFooterButtonVH;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;", CommentV3DTO.FOOTER_FIELD_NAME, "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;Lkotlin/jvm/functions/Function1;)V", "button", "index", "bindButton", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;ILkotlin/jvm/functions/Function1;Z)V", "hasSeparator", "bindTopSeparator", "(Z)V", "LSc/j;", "Landroid/view/View;", "alignmentSeparatorDelegate", "LSc/j;", "leftButtonHolders", "Ljava/util/List;", "rightButtonHolders", "currentHasSeparator", "Z", "Landroid/graphics/drawable/Drawable;", "separatorBackground$delegate", "getSeparatorBackground", "()Landroid/graphics/drawable/Drawable;", "separatorBackground", "defaultBackgroundColor", "I", "getAlignmentSeparator", "()Landroid/view/View;", "getAlignmentSeparator$delegate", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView;)Ljava/lang/Object;", "alignmentSeparator", "ActionsFooterButtonVH", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActionsFooterView extends LinearLayout {

    @NotNull
    private final InterfaceC4008j<View> alignmentSeparatorDelegate;
    private boolean currentHasSeparator;
    private final int defaultBackgroundColor;

    @NotNull
    private final List<ActionsFooterButtonVH> leftButtonHolders;

    @NotNull
    private final List<ActionsFooterButtonVH> rightButtonHolders;

    /* renamed from: separatorBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j separatorBackground;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011H&J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView$ActionsFooterButtonVH;", "", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getItemView", "()Landroid/view/View;", "bind", "", "dto", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "index", "", "isRight", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "canBind", "IconButtonViewHolder", "ButtonViewHolder", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView$ActionsFooterButtonVH$ButtonViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView$ActionsFooterButtonVH$IconButtonViewHolder;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ActionsFooterButtonVH {

        @NotNull
        private final View itemView;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView$ActionsFooterButtonVH$ButtonViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView$ActionsFooterButtonVH;", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;)V", "bind", "", "dto", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "index", "", "isRight", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "canBind", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ButtonViewHolder extends ActionsFooterButtonVH {
            public static final int $stable = ButtonV3View.$stable;

            @NotNull
            private final ButtonV3View button;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ButtonViewHolder(@NotNull ButtonV3View button) {
                super(button, null);
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
            
                if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L39;
             */
            @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterView.ActionsFooterButtonVH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void bind(@NotNull ButtonsDTO dto, int index, boolean isRight, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
                if (dto instanceof ButtonV3DTO) {
                    ButtonV3View buttonV3View = this.button;
                    ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        int i11 = marginLayoutParams.leftMargin;
                        int i12 = marginLayoutParams.topMargin;
                        int i13 = marginLayoutParams.rightMargin;
                        int i14 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart((index != 0 || isRight) ? Dimens.INSTANCE.getDP_6() : 0);
                        if (i11 == marginLayoutParams.leftMargin) {
                            ViewGroup.LayoutParams layoutParams2 = buttonV3View.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                                ViewGroup.LayoutParams layoutParams3 = buttonV3View.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                                    ViewGroup.LayoutParams layoutParams4 = buttonV3View.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                                }
                            }
                        }
                        buttonV3View.setLayoutParams(marginLayoutParams);
                    }
                    ButtonV3HolderKt.bind(this.button, (ButtonV3DTO) dto, actionHandler);
                }
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterView.ActionsFooterButtonVH
            public boolean canBind(@NotNull ButtonsDTO dto) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                return dto instanceof ButtonV3DTO;
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView$ActionsFooterButtonVH$IconButtonViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterView$ActionsFooterButtonVH;", "iconButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;)V", "bind", "", "dto", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "index", "", "isRight", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "canBind", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconButtonViewHolder extends ActionsFooterButtonVH {
            public static final int $stable = IconButtonV3View.$stable;

            @NotNull
            private final IconButtonV3View iconButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconButtonViewHolder(@NotNull IconButtonV3View iconButton) {
                super(iconButton, null);
                Intrinsics.checkNotNullParameter(iconButton, "iconButton");
                this.iconButton = iconButton;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
            
                if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L39;
             */
            @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterView.ActionsFooterButtonVH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void bind(@NotNull ButtonsDTO dto, int index, boolean isRight, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
                if (dto instanceof IconButtonV3DTO) {
                    IconButtonV3View iconButtonV3View = this.iconButton;
                    ViewGroup.LayoutParams layoutParams = iconButtonV3View.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        int i11 = marginLayoutParams.leftMargin;
                        int i12 = marginLayoutParams.topMargin;
                        int i13 = marginLayoutParams.rightMargin;
                        int i14 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart((index != 0 || isRight) ? Dimens.INSTANCE.getDP_6() : 0);
                        if (i11 == marginLayoutParams.leftMargin) {
                            ViewGroup.LayoutParams layoutParams2 = iconButtonV3View.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                                ViewGroup.LayoutParams layoutParams3 = iconButtonV3View.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                                    ViewGroup.LayoutParams layoutParams4 = iconButtonV3View.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                                }
                            }
                        }
                        iconButtonV3View.setLayoutParams(marginLayoutParams);
                    }
                    IconButtonV3HolderKt.bind(this.iconButton, (IconButtonV3DTO) dto, actionHandler);
                }
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterView.ActionsFooterButtonVH
            public boolean canBind(@NotNull ButtonsDTO dto) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                return dto instanceof IconButtonV3DTO;
            }
        }

        public /* synthetic */ ActionsFooterButtonVH(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        public abstract void bind(@NotNull ButtonsDTO dto, int index, boolean isRight, @NotNull Function1<? super AtomAction, Unit> actionHandler);

        public abstract boolean canBind(@NotNull ButtonsDTO dto);

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }

        private ActionsFooterButtonVH(View view) {
            this.itemView = view;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionsFooterView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.alignmentSeparatorDelegate = LazyUtilsKt.unsafeLazy(new ActionsFooterView$alignmentSeparatorDelegate$1(context));
        this.leftButtonHolders = new ArrayList();
        this.rightButtonHolders = new ArrayList();
        this.separatorBackground = LazyUtilsKt.unsafeLazy(new ActionsFooterView$separatorBackground$2(context));
        int color = a.getColor(context, R$color.layer_floor_1);
        this.defaultBackgroundColor = color;
        setOrientation(0);
        setBackgroundColor(color);
    }

    private final ActionsFooterButtonVH createViewHolder(ButtonsDTO dto) {
        if (dto instanceof IconButtonV3DTO) {
            IconButtonV3View iconButtonV3View = (IconButtonV3View) q.f64554a.i(N.b(IconButtonV3View.class), getContext());
            if (iconButtonV3View == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
            }
            return new ActionsFooterButtonVH.IconButtonViewHolder(iconButtonV3View);
        }
        if (!(dto instanceof ButtonV3DTO)) {
            throw new IllegalArgumentException("invalid button type");
        }
        ButtonV3View buttonV3View = (ButtonV3View) q.f64554a.i(N.b(ButtonV3View.class), getContext());
        if (buttonV3View == null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            buttonV3View = new ButtonV3View(context2, null, 0, 0, 14, null);
        }
        return new ActionsFooterButtonVH.ButtonViewHolder(buttonV3View);
    }

    private final View getAlignmentSeparator() {
        return this.alignmentSeparatorDelegate.getValue();
    }

    private final int getInsertIndex(boolean isRight) {
        return (isRight || !this.alignmentSeparatorDelegate.isInitialized()) ? getChildCount() : indexOfChild(getAlignmentSeparator());
    }

    private final Drawable getSeparatorBackground() {
        return (Drawable) this.separatorBackground.getValue();
    }

    private final void updateButtons(List<ActionsFooterButtonVH> holders, List<SingleReviewDTO.FooterControlDTO> newButtons, boolean isRight, Function1<? super AtomAction, Unit> actionHandler) {
        ButtonsDTO normal;
        View itemView;
        if (newButtons == null) {
            newButtons = K.f71697a;
        }
        while (holders.size() > newButtons.size()) {
            ActionsFooterButtonVH actionsFooterButtonVH = (ActionsFooterButtonVH) C7714v.x0(holders);
            if (actionsFooterButtonVH != null && (itemView = actionsFooterButtonVH.getItemView()) != null) {
                removeView(itemView);
            }
        }
        int i11 = 0;
        for (Object obj : newButtons) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            SingleReviewDTO.FooterControlDTO footerControlDTO = (SingleReviewDTO.FooterControlDTO) obj;
            if (!footerControlDTO.isSelected() || (normal = footerControlDTO.getSelected()) == null) {
                normal = footerControlDTO.getNormal();
            }
            if (i11 < holders.size()) {
                ActionsFooterButtonVH actionsFooterButtonVH2 = holders.get(i11);
                if (actionsFooterButtonVH2.canBind(normal)) {
                    actionsFooterButtonVH2.bind(normal, i11, isRight, actionHandler);
                } else {
                    removeView(actionsFooterButtonVH2.getItemView());
                    ActionsFooterButtonVH createViewHolder = createViewHolder(normal);
                    addView(createViewHolder.getItemView(), getInsertIndex(isRight));
                    createViewHolder.bind(normal, i11, isRight, actionHandler);
                    holders.set(i11, createViewHolder);
                }
            } else {
                ActionsFooterButtonVH createViewHolder2 = createViewHolder(normal);
                addView(createViewHolder2.getItemView(), getInsertIndex(isRight));
                createViewHolder2.bind(normal, i11, isRight, actionHandler);
                holders.add(createViewHolder2);
            }
            i11 = i12;
        }
    }

    public final void bind(@NotNull ActionsFooterVO footer, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindTopSeparator(footer.getHasSeparator());
        if (CollectionsExtKt.isNotNullOrEmpty(footer.getRightButtons()) && indexOfChild(getAlignmentSeparator()) == -1) {
            addView(getAlignmentSeparator(), this.leftButtonHolders.size());
        }
        updateButtons(this.leftButtonHolders, footer.getLeftButtons(), false, actionHandler);
        updateButtons(this.rightButtonHolders, footer.getRightButtons(), true, actionHandler);
    }

    public final void bindButton(@NotNull SingleReviewDTO.FooterControlDTO button, int index, @NotNull Function1<? super AtomAction, Unit> actionHandler, boolean isRight) {
        ButtonsDTO normal;
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (button.isSelected()) {
            normal = button.getSelected();
            if (normal == null) {
                return;
            }
        } else {
            normal = button.getNormal();
        }
        ActionsFooterButtonVH actionsFooterButtonVH = (ActionsFooterButtonVH) C7714v.Q(index, isRight ? this.rightButtonHolders : this.leftButtonHolders);
        if (actionsFooterButtonVH != null) {
            actionsFooterButtonVH.bind(normal, index, isRight, actionHandler);
        }
    }

    public final void bindTopSeparator(boolean hasSeparator) {
        if (hasSeparator != this.currentHasSeparator) {
            if (hasSeparator) {
                setBackground(getSeparatorBackground());
            } else {
                setBackgroundColor(this.defaultBackgroundColor);
            }
            this.currentHasSeparator = hasSeparator;
        }
        int dp_8 = hasSeparator ? Dimens.INSTANCE.getDP_8() : 0;
        if (getPaddingTop() != dp_8) {
            setPadding(getPaddingLeft(), dp_8, getPaddingRight(), getPaddingBottom());
        }
    }
}
