package ru.ozon.app.android.ordertracking.v4.presentation.util;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.orderTracking.data.AnimationParamsDTO;
import ru.ozon.app.android.ordertracking.databinding.ItemOrderTrackingV4OrderBinding;
import ru.ozon.app.android.ordertracking.v4.presentation.model.DescriptionVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.SubtitleVO;
import ru.ozon.app.android.ordertracking.v4.presentation.util.PercentageConstraintLayout;
import ru.ozon.app.android.ordertracking.v4.presentation.view.OrderTrackingAddressView;
import ru.ozon.app.android.ordertracking.v4.presentation.view.OrderTrackingMarqueeView;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0010\b\u0000\u0018\u0000 J2\u00020\u0001:\u0002JKB'\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u0018\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010\u001f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010#J'\u0010(\u001a\u00020\u0004*\u00020$2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b(\u0010)J1\u0010(\u001a\u00020\u0004*\u00020*2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010%2\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b(\u0010-J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010\u000eJ\u001d\u0010/\u001a\u00020\u0004*\u00020$2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b/\u00100J-\u00105\u001a\u000204*\u00020$2\u0006\u00101\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106J'\u00107\u001a\u00020\u0004*\u00020$2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b7\u0010)J-\u0010:\u001a\u000204*\u00020$2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u00108\u001a\u0002022\u0006\u00109\u001a\u000202H\u0002¢\u0006\u0004\b:\u0010;J%\u0010?\u001a\u00020%*\u00020%2\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u000202H\u0002¢\u0006\u0004\bA\u0010BJ\u0013\u0010C\u001a\u00020\u0004*\u00020\u0007H\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bE\u0010\u000eR$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010FR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0016\u0010H\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/OrderTrackingViewManager;", "", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;", "binding", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;)V", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;", "item", "updateView", "(Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;)V", "Lru/ozon/app/android/ordertracking/v4/presentation/util/ViewState;", "toViewState", "(Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;)Lru/ozon/app/android/ordertracking/v4/presentation/util/ViewState;", "bindButton", "(Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;)V", "bindBadge", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$AddressVO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "action", "bindAddress", "(Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$AddressVO;Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$MarqueeAddressVO;", "bindMarqueeAddress", "(Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$MarqueeAddressVO;)V", "Lru/ozon/app/android/ordertracking/v4/presentation/util/OrderTrackingViewManager$SubtitleLines;", "lines", "bindSubtitle", "(Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;Lru/ozon/app/android/ordertracking/v4/presentation/util/OrderTrackingViewManager$SubtitleLines;)V", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$SubtitleTextVO;", "subtitle", "(Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$SubtitleTextVO;Lru/ozon/app/android/ordertracking/v4/presentation/util/OrderTrackingViewManager$SubtitleLines;)V", "Landroid/widget/TextView;", "", "text", "textColor", "bindOrGone", "(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/ordertracking/v4/presentation/view/OrderTrackingMarqueeView;", "", "pixelSpeed", "(Lru/ozon/app/android/ordertracking/v4/presentation/view/OrderTrackingMarqueeView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)V", "calculateStatus", "calculateSubtitleAsMultiLineText", "(Landroid/widget/TextView;Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$SubtitleTextVO;)V", "textView", "", "maxWidth", "", "isLesserWidthThen", "(Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;I)Z", "calculateAsSingleLineText", "width", "maxLines", "isFitInWidth", "(Landroid/widget/TextView;Ljava/lang/String;II)Z", "", "char", "index", "addCharAtIndex", "(Ljava/lang/String;CLjava/lang/Integer;)Ljava/lang/String;", "getMaxWidthForText", "()I", "goneViews", "(Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;)V", "bindView", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4OrderBinding;", "state", "Lru/ozon/app/android/ordertracking/v4/presentation/util/ViewState;", "Companion", "SubtitleLines", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackingViewManager {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemOrderTrackingV4OrderBinding binding;

    @NotNull
    private ViewState state;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int TITLE_PADDING = ResourceExtKt.toPx(17);
    private static final int TIMER_MARGIN = ResourceExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/OrderTrackingViewManager$Companion;", "", "<init>", "()V", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/OrderTrackingViewManager$SubtitleLines;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SINGLE", "MULTILINE", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class SubtitleLines {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SubtitleLines[] $VALUES;
        public static final SubtitleLines DEFAULT = new SubtitleLines("DEFAULT", 0);
        public static final SubtitleLines SINGLE = new SubtitleLines("SINGLE", 1);
        public static final SubtitleLines MULTILINE = new SubtitleLines("MULTILINE", 2);

        private static final /* synthetic */ SubtitleLines[] $values() {
            return new SubtitleLines[]{DEFAULT, SINGLE, MULTILINE};
        }

        static {
            SubtitleLines[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SubtitleLines(String str, int i11) {
        }

        public static SubtitleLines valueOf(String str) {
            return (SubtitleLines) Enum.valueOf(SubtitleLines.class, str);
        }

        public static SubtitleLines[] values() {
            return (SubtitleLines[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ViewState.values().length];
            try {
                iArr[ViewState.STATUS_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewState.STATUS_BADGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewState.STATUS_TITLE_SUBTITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewState.STATUS_BADGE_SUBTITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewState.STATUS_SUBTITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewState.ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SubtitleLines.values().length];
            try {
                iArr2[SubtitleLines.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SubtitleLines.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SubtitleLines.MULTILINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderTrackingViewManager(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull ItemOrderTrackingV4OrderBinding binding) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.actionHandler = actionHandler;
        this.binding = binding;
        this.state = ViewState.STATUS_TITLE_SUBTITLE;
    }

    private final String addCharAtIndex(String str, char c11, Integer num) {
        if (num == null || num.intValue() >= str.length()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.insert(num.intValue(), c11);
        String sb3 = sb2.toString();
        Intrinsics.f(sb3);
        return sb3;
    }

    private final void bindAddress(ItemOrderTrackingV4OrderBinding itemOrderTrackingV4OrderBinding, SubtitleVO.AddressVO addressVO, AtomAction atomAction) {
        FrameLayout addressContainer = itemOrderTrackingV4OrderBinding.addressContainer;
        Intrinsics.checkNotNullExpressionValue(addressContainer, "addressContainer");
        ViewExtKt.show(addressContainer);
        itemOrderTrackingV4OrderBinding.addressView.bindOrGone(addressVO.withAction(atomAction), this.actionHandler);
    }

    private final void bindBadge(ItemOrderTrackingV4OrderBinding itemOrderTrackingV4OrderBinding, OrderVO orderVO) {
        FrameLayout actionButtonContainer = itemOrderTrackingV4OrderBinding.actionButtonContainer;
        Intrinsics.checkNotNullExpressionValue(actionButtonContainer, "actionButtonContainer");
        ViewExtKt.show(actionButtonContainer);
        BadgeView actionBadge = itemOrderTrackingV4OrderBinding.actionBadge;
        Intrinsics.checkNotNullExpressionValue(actionBadge, "actionBadge");
        BadgeHolderKt.bindOrGone(actionBadge, orderVO.getActionBadge(), this.actionHandler);
    }

    private final void bindButton(ItemOrderTrackingV4OrderBinding itemOrderTrackingV4OrderBinding, OrderVO orderVO) {
        FrameLayout actionButtonContainer = itemOrderTrackingV4OrderBinding.actionButtonContainer;
        Intrinsics.checkNotNullExpressionValue(actionButtonContainer, "actionButtonContainer");
        ViewExtKt.show(actionButtonContainer);
        ButtonView button = itemOrderTrackingV4OrderBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ButtonHolderKt.bindOrGone(button, orderVO.getButton(), this.actionHandler);
    }

    private final void bindMarqueeAddress(ItemOrderTrackingV4OrderBinding itemOrderTrackingV4OrderBinding, SubtitleVO.MarqueeAddressVO marqueeAddressVO) {
        FrameLayout addressContainer = itemOrderTrackingV4OrderBinding.addressContainer;
        Intrinsics.checkNotNullExpressionValue(addressContainer, "addressContainer");
        ViewExtKt.show(addressContainer);
        OrderTrackingMarqueeView marqueeAddressView = itemOrderTrackingV4OrderBinding.marqueeAddressView;
        Intrinsics.checkNotNullExpressionValue(marqueeAddressView, "marqueeAddressView");
        String unitedAddress = marqueeAddressVO.getUnitedAddress();
        String textColor = marqueeAddressVO.getTextColor();
        AnimationParamsDTO animationParams = marqueeAddressVO.getAnimationParams();
        bindOrGone(marqueeAddressView, unitedAddress, textColor, animationParams != null ? animationParams.getMillisecondsPerPixel() : null);
    }

    private final void bindOrGone(TextView textView, String str, String str2) {
        TextViewExtKt.setTextOrGone(textView, str);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(styleParser.parseColor(context, str2, UniColors.TEXT_PRIMARY.getResId()));
    }

    private final void bindSubtitle(ItemOrderTrackingV4OrderBinding itemOrderTrackingV4OrderBinding, OrderVO orderVO, SubtitleLines subtitleLines) {
        SubtitleVO subtitle = orderVO.getSubtitle();
        if (subtitle instanceof SubtitleVO.SubtitleTextVO) {
            bindSubtitle(itemOrderTrackingV4OrderBinding, (SubtitleVO.SubtitleTextVO) subtitle, subtitleLines);
        } else if (subtitle instanceof SubtitleVO.AddressVO) {
            bindAddress(itemOrderTrackingV4OrderBinding, (SubtitleVO.AddressVO) subtitle, orderVO.getAction());
        } else if (subtitle instanceof SubtitleVO.MarqueeAddressVO) {
            bindMarqueeAddress(itemOrderTrackingV4OrderBinding, (SubtitleVO.MarqueeAddressVO) subtitle);
        }
    }

    static /* synthetic */ void bindSubtitle$default(OrderTrackingViewManager orderTrackingViewManager, ItemOrderTrackingV4OrderBinding itemOrderTrackingV4OrderBinding, OrderVO orderVO, SubtitleLines subtitleLines, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            subtitleLines = SubtitleLines.DEFAULT;
        }
        orderTrackingViewManager.bindSubtitle(itemOrderTrackingV4OrderBinding, orderVO, subtitleLines);
    }

    private final void calculateAsSingleLineText(TextView textView, String str, String str2) {
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        textView.setLayoutParams(layoutParams);
        bindOrGone(textView, str, str2);
    }

    private final void calculateStatus(OrderVO item) {
        final TextView textView = this.binding.titleTav;
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        calculateAsSingleLineText(textView, item.getTitle().getText(), item.getTitle().getColor());
        if (!textView.isLaidOut() || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.ordertracking.v4.presentation.util.OrderTrackingViewManager$calculateStatus$lambda$7$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    if (textView.getLayout().getEllipsisCount(0) > 0) {
                        Intrinsics.f(textView);
                        TextView textView2 = textView;
                        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.width = textView.getMeasuredWidth();
                        textView2.setLayoutParams(layoutParams);
                        AppCompatTextView timerTv = this.binding.timerTv;
                        Intrinsics.checkNotNullExpressionValue(timerTv, "timerTv");
                        ViewGroup.LayoutParams layoutParams2 = timerTv.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        int i11 = marginLayoutParams.topMargin;
                        int marginEnd = marginLayoutParams.getMarginEnd();
                        int i12 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart(0);
                        marginLayoutParams.topMargin = i11;
                        marginLayoutParams.setMarginEnd(marginEnd);
                        marginLayoutParams.bottomMargin = i12;
                        timerTv.setLayoutParams(marginLayoutParams);
                    }
                }
            });
        } else if (textView.getLayout().getEllipsisCount(0) > 0) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = textView.getMeasuredWidth();
            textView.setLayoutParams(layoutParams);
            AppCompatTextView timerTv = this.binding.timerTv;
            Intrinsics.checkNotNullExpressionValue(timerTv, "timerTv");
            ViewGroup.LayoutParams layoutParams2 = timerTv.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            int i11 = marginLayoutParams.topMargin;
            int marginEnd = marginLayoutParams.getMarginEnd();
            int i12 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i12;
            timerTv.setLayoutParams(marginLayoutParams);
        }
        ViewExtKt.show(textView);
    }

    private final void calculateSubtitleAsMultiLineText(TextView textView, SubtitleVO.SubtitleTextVO subtitleTextVO) {
        if (subtitleTextVO == null) {
            return;
        }
        String text = subtitleTextVO.getText();
        PercentageConstraintLayout.Companion companion = PercentageConstraintLayout.INSTANCE;
        int min_width = companion.getMIN_WIDTH() - companion.getWIDTH_OF_LEFT_SIDE_BEFORE_TITLE$orderTracking_prodGoogleAllVendorsRelease();
        int maxWidthForText = getMaxWidthForText();
        textView.setMaxLines(Integer.MAX_VALUE);
        TextView titleTav = this.binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        if (isLesserWidthThen(textView, titleTav, text, maxWidthForText)) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -2;
            textView.setLayoutParams(layoutParams);
            bindOrGone(textView, text, subtitleTextVO.getColor());
            return;
        }
        if (subtitleTextVO.getBreakPosition() != null) {
            String addCharAtIndex = addCharAtIndex(subtitleTextVO.getText(), '\n', subtitleTextVO.getBreakPosition());
            String substring = addCharAtIndex.substring(0, subtitleTextVO.getBreakPosition().intValue());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (isFitInWidth(textView, substring, maxWidthForText, 1)) {
                text = addCharAtIndex;
            }
        }
        if (isFitInWidth(textView, text, maxWidthForText, 1) && !this.binding.orderCard.getIsBarcodeVisible()) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = -2;
            textView.setLayoutParams(layoutParams2);
        } else if (!isFitInWidth(textView, text, min_width, 2) || this.binding.orderCard.getIsBarcodeVisible() || this.binding.orderCard.getIsFullWidth()) {
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.width = -2;
            textView.setLayoutParams(layoutParams3);
        } else {
            ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams4.width = min_width;
            textView.setLayoutParams(layoutParams4);
        }
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        bindOrGone(textView, text, subtitleTextVO.getColor());
    }

    private final int getMaxWidthForText() {
        return (this.binding.orderCard.getLocalMaxWidth() - PercentageConstraintLayout.INSTANCE.getWIDTH_OF_LEFT_SIDE_BEFORE_TITLE$orderTracking_prodGoogleAllVendorsRelease()) - TITLE_PADDING;
    }

    private final void goneViews(ItemOrderTrackingV4OrderBinding itemOrderTrackingV4OrderBinding) {
        TextView subtitleTav = itemOrderTrackingV4OrderBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        ViewExtKt.gone(subtitleTav);
        OrderTrackingAddressView addressView = itemOrderTrackingV4OrderBinding.addressView;
        Intrinsics.checkNotNullExpressionValue(addressView, "addressView");
        ViewExtKt.gone(addressView);
        OrderTrackingMarqueeView marqueeAddressView = itemOrderTrackingV4OrderBinding.marqueeAddressView;
        Intrinsics.checkNotNullExpressionValue(marqueeAddressView, "marqueeAddressView");
        ViewExtKt.gone(marqueeAddressView);
        TextView descriptionTav = itemOrderTrackingV4OrderBinding.descriptionTav;
        Intrinsics.checkNotNullExpressionValue(descriptionTav, "descriptionTav");
        ViewExtKt.gone(descriptionTav);
        ButtonView button = itemOrderTrackingV4OrderBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ViewExtKt.gone(button);
        BadgeView actionBadge = itemOrderTrackingV4OrderBinding.actionBadge;
        Intrinsics.checkNotNullExpressionValue(actionBadge, "actionBadge");
        ViewExtKt.gone(actionBadge);
        FrameLayout actionButtonContainer = itemOrderTrackingV4OrderBinding.actionButtonContainer;
        Intrinsics.checkNotNullExpressionValue(actionButtonContainer, "actionButtonContainer");
        ViewExtKt.gone(actionButtonContainer);
    }

    private final boolean isFitInWidth(TextView textView, String str, int i11, int i12) {
        textView.setText(str);
        textView.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0);
        return textView.getLineCount() <= i12;
    }

    private final boolean isLesserWidthThen(TextView textView, TextView textView2, String str, int i11) {
        textView.setText(str);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET);
        textView2.measure(makeMeasureSpec, 0);
        textView.measure(makeMeasureSpec, 0);
        return textView.getMeasuredWidth() <= textView2.getMeasuredWidth() && textView.getLineCount() == 1;
    }

    private final ViewState toViewState(OrderVO orderVO) {
        return (orderVO.getSubtitle() == null || orderVO.getDescription() == null) ? (orderVO.getSubtitle() == null || orderVO.getActionBadge() == null) ? orderVO.getSubtitle() != null ? ViewState.STATUS_SUBTITLE : orderVO.getButton() != null ? ViewState.STATUS_BUTTON : orderVO.getActionBadge() != null ? ViewState.STATUS_BADGE : ViewState.ALL : ViewState.STATUS_BADGE_SUBTITLE : ViewState.STATUS_TITLE_SUBTITLE;
    }

    private final void updateView(OrderVO item) {
        ItemOrderTrackingV4OrderBinding itemOrderTrackingV4OrderBinding = this.binding;
        AppCompatTextView appCompatTextView = itemOrderTrackingV4OrderBinding.timerTv;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = itemOrderTrackingV4OrderBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(styleParser.parseColor(context, item.getTitle().getColor(), UniColors.TEXT_PRIMARY.getResId()));
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = TIMER_MARGIN;
        int i12 = marginLayoutParams.topMargin;
        int marginEnd = marginLayoutParams.getMarginEnd();
        int i13 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(i11);
        marginLayoutParams.topMargin = i12;
        marginLayoutParams.setMarginEnd(marginEnd);
        marginLayoutParams.bottomMargin = i13;
        appCompatTextView.setLayoutParams(marginLayoutParams);
        IconView titleIconIv = itemOrderTrackingV4OrderBinding.titleIconIv;
        Intrinsics.checkNotNullExpressionValue(titleIconIv, "titleIconIv");
        IconHolderKt.bindOrGone(titleIconIv, item.getTitle().getIcon(), this.actionHandler);
        BadgeView countBV = itemOrderTrackingV4OrderBinding.countBV;
        Intrinsics.checkNotNullExpressionValue(countBV, "countBV");
        BadgeHolderKt.bindOrGone(countBV, item.getBadge(), this.actionHandler);
        itemOrderTrackingV4OrderBinding.imageIV.bind(item.getImage().getImage().getImage(), item.getShouldBlur(), item.getImage().getIsOpacity());
        goneViews(itemOrderTrackingV4OrderBinding);
        calculateStatus(item);
        switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            case 1:
                bindButton(itemOrderTrackingV4OrderBinding, item);
                return;
            case 2:
                bindBadge(itemOrderTrackingV4OrderBinding, item);
                return;
            case 3:
                bindSubtitle(itemOrderTrackingV4OrderBinding, item, SubtitleLines.SINGLE);
                TextView descriptionTav = itemOrderTrackingV4OrderBinding.descriptionTav;
                Intrinsics.checkNotNullExpressionValue(descriptionTav, "descriptionTav");
                DescriptionVO description = item.getDescription();
                String text = description != null ? description.getText() : null;
                DescriptionVO description2 = item.getDescription();
                calculateAsSingleLineText(descriptionTav, text, description2 != null ? description2.getColor() : null);
                return;
            case 4:
                bindSubtitle(itemOrderTrackingV4OrderBinding, item, SubtitleLines.SINGLE);
                bindBadge(itemOrderTrackingV4OrderBinding, item);
                return;
            case 5:
                bindSubtitle(itemOrderTrackingV4OrderBinding, item, SubtitleLines.MULTILINE);
                return;
            case 6:
                bindSubtitle$default(this, itemOrderTrackingV4OrderBinding, item, null, 2, null);
                TextView descriptionTav2 = itemOrderTrackingV4OrderBinding.descriptionTav;
                Intrinsics.checkNotNullExpressionValue(descriptionTav2, "descriptionTav");
                DescriptionVO description3 = item.getDescription();
                String text2 = description3 != null ? description3.getText() : null;
                DescriptionVO description4 = item.getDescription();
                bindOrGone(descriptionTav2, text2, description4 != null ? description4.getColor() : null);
                bindButton(itemOrderTrackingV4OrderBinding, item);
                return;
            default:
                throw new o();
        }
    }

    public final void bindView(@NotNull OrderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.state = toViewState(item);
        updateView(item);
    }

    private final void bindOrGone(OrderTrackingMarqueeView orderTrackingMarqueeView, String str, String str2, Float f7) {
        orderTrackingMarqueeView.setAnimationPixelSpeed(f7);
        TextViewExtKt.setTextOrGone(orderTrackingMarqueeView, str);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = orderTrackingMarqueeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        orderTrackingMarqueeView.setTextColor(styleParser.parseColor(context, str2, UniColors.TEXT_PRIMARY.getResId()));
    }

    private final void bindSubtitle(ItemOrderTrackingV4OrderBinding itemOrderTrackingV4OrderBinding, SubtitleVO.SubtitleTextVO subtitleTextVO, SubtitleLines subtitleLines) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[subtitleLines.ordinal()];
        if (i11 == 1) {
            TextView subtitleTav = itemOrderTrackingV4OrderBinding.subtitleTav;
            Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
            bindOrGone(subtitleTav, subtitleTextVO.getText(), subtitleTextVO.getColor());
        } else if (i11 == 2) {
            TextView subtitleTav2 = itemOrderTrackingV4OrderBinding.subtitleTav;
            Intrinsics.checkNotNullExpressionValue(subtitleTav2, "subtitleTav");
            calculateAsSingleLineText(subtitleTav2, subtitleTextVO.getText(), subtitleTextVO.getColor());
        } else {
            if (i11 == 3) {
                TextView subtitleTav3 = itemOrderTrackingV4OrderBinding.subtitleTav;
                Intrinsics.checkNotNullExpressionValue(subtitleTav3, "subtitleTav");
                calculateSubtitleAsMultiLineText(subtitleTav3, subtitleTextVO);
                return;
            }
            throw new o();
        }
    }
}
