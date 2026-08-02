package ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation;

import B90.C2618u;
import Bi.b;
import Hj.C3143a;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data.PdpNutritionInfoDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation.PdpNutritionInfoVO;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation.PdpNutritionInfoView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 k2\u00020\u0001:\u0001kB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJs\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2&\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000e0\u00102 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\u0019\u0010\u001aJw\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2&\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000e0\u00102 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b \u0010!JC\u0010%\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"2 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010$\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u0011*\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010(J)\u0010.\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b.\u0010/JW\u00105\u001a\u00020\u000e2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00104\u001a\u0002032\u0006\u0010*\u001a\u00020)2&\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b5\u00106J3\u0010;\u001a\u00020\u000e2\u0006\u00108\u001a\u0002072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\u000e2\b\u0010=\u001a\u0004\u0018\u00010\u00132\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000eH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bF\u0010GJ\u0013\u0010I\u001a\u00020H*\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u001b\u0010M\u001a\u00020K*\u00020K2\u0006\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010TR\u001a\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010ER\u0014\u0010]\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010QR\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010`R\u0014\u0010b\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010`R\u0014\u0010c\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010`R\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010`R\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006l"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "handler", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onSwitchClick", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onSauceClick", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "bindExtendedState", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lkotlin/Unit;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "getComponents", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "bindCompactState", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;", "sauceInfo", "currentState", "bindOrGoneCheckbox", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$SauceInfo;Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;)V", "withChangedSauceState", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$PdpNutritionInfoState;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;", "paddings", "components", "bindComponents", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;)V", "", "withSauce", "isPartial", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Switch;", "switch", "bindSwitch", "(ZZLru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Switch;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "radius", "bindButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lkotlin/jvm/functions/Function1;F)V", "color", "bindBackground", "(Ljava/lang/String;F)V", "bindSpacers", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;)V", "bindPaddings", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;)V", "hideInfoBlock", "()V", "countCellWidth", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$ContainerPaddings;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoVO$Info$Spacers;)I", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "format", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "maxLength", "formatText", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;I)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "partialButton", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "separatorText", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "wholeButton", "Landroidx/constraintlayout/widget/Barrier;", "toggleBarrier", "Landroidx/constraintlayout/widget/Barrier;", "getToggleBarrier$annotations", "cellContainer", "Lru/ozon/uni/android/cell/CellView;", "energyCell", "Lru/ozon/uni/android/cell/CellView;", "proteinCell", "fatCell", "carbohydrateCell", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "detailsButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "checkboxWithText", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpNutritionInfoView extends FrameLayout {

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final CellView carbohydrateCell;

    @NotNull
    private final ConstraintLayout cellContainer;

    @NotNull
    private final CellView checkboxWithText;

    @NotNull
    private final ConstraintLayout container;

    @NotNull
    private final ButtonV3View detailsButton;

    @NotNull
    private final CellView energyCell;

    @NotNull
    private final CellView fatCell;

    @NotNull
    private final TagButtonView partialButton;

    @NotNull
    private final CellView proteinCell;

    @NotNull
    private final TextAtomV2View separatorText;

    @NotNull
    private final Barrier toggleBarrier;

    @NotNull
    private final TagButtonView wholeButton;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final TextDTO separatorData = new TextDTO(new OzonSpannableString("•"), null, null, null, null, null, null, "tsCompactControl400Small", UniColors.TEXT_TERTIARY.getToken(), null, null, null, null, false, null, null, null, null, null, 523902, null);
    private static final float defaultBackgroundRadius = UiExtKt.toPxF(28);
    private static final int defaultInfoBlockRightMargin = UiExtKt.toPx(8);
    private static final int defaultCellRightMargin = UiExtKt.toPx(24);
    private static final int toggleAndCheckboxMargin = UiExtKt.toPx(4);
    private static final int defaultBackgroundColor = UniColors.BG_SECONDARY.getResId();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/presentation/PdpNutritionInfoView$Companion;", "", "<init>", "()V", "", "BOTTOM_BIAS", "F", "LEFT_BIAS", "RIGHT_BIAS", "", "MAX_TITLE_TEXT_LENGTH", "I", "MAX_SUBTITLE_TEXT_LENGTH", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PdpNutritionInfoVO.PdpNutritionInfoState.values().length];
            try {
                iArr[PdpNutritionInfoVO.PdpNutritionInfoState.PARTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PdpNutritionInfoVO.PdpNutritionInfoState.WHOLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PdpNutritionInfoVO.PdpNutritionInfoState.WHOLE_WITH_SAUCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PdpNutritionInfoVO.PdpNutritionInfoState.PARTIAL_WITH_SAUCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PdpNutritionInfoVO.PdpNutritionInfoState.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ PdpNutritionInfoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBackground(String color, float radius) {
        GradientDrawable gradientDrawable = this.backgroundDrawable;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, color, defaultBackgroundColor);
        gradientDrawable.setColors(new int[]{parseColor, parseColor});
        gradientDrawable.setCornerRadius(radius);
        this.container.setBackground(this.backgroundDrawable);
    }

    private final void bindButton(ButtonV3DTO button, Function1<? super AtomAction, Unit> handler, final float radius) {
        ButtonV3View buttonV3View = this.detailsButton;
        ButtonV3HolderKt.bindOrGone(buttonV3View, button, handler);
        buttonV3View.setClipToOutline(true);
        buttonV3View.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation.PdpNutritionInfoView$bindButton$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), radius);
            }
        });
    }

    private final void bindCompactState(PdpNutritionInfoVO item, Function1<? super AtomAction, Unit> handler) {
        hideInfoBlock();
        bindButton(item.getButton(), handler, item.getCorners().getButtonRadius());
        bindBackground(item.getBackgroundColor(), item.getCorners().getWidgetRadius());
        bindPaddings(item.getPaddings());
    }

    private final void bindComponents(PdpNutritionInfoVO.Info.Spacers spacers, PdpNutritionInfoVO.ContainerPaddings paddings, PdpNutritionInfoDTO.Components components) {
        int countCellWidth = countCellWidth(paddings, spacers);
        ConstraintLayout constraintLayout = this.cellContainer;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = countCellWidth;
        constraintLayout.setLayoutParams(layoutParams);
        if (components != null) {
            CellHolderKt.bindOrGone$default(this.energyCell, format(components.getEnergy()), null, 2, null);
            CellHolderKt.bindOrGone$default(this.proteinCell, format(components.getProtein()), null, 2, null);
            CellHolderKt.bindOrGone$default(this.fatCell, format(components.getFat()), null, 2, null);
            CellHolderKt.bindOrGone$default(this.carbohydrateCell, format(components.getCarbohydrate()), null, 2, null);
        }
    }

    private final Unit bindExtendedState(PdpNutritionInfoVO item, Function1<? super AtomAction, Unit> handler, Function2<? super PdpNutritionInfoVO.PdpNutritionInfoState, ? super Map<String, TokenizedTrackingInfo>, Unit> onSwitchClick, Function2<? super PdpNutritionInfoVO.PdpNutritionInfoState, ? super t, Unit> onSauceClick) {
        PdpNutritionInfoVO.Info info = item.getInfo();
        if (info == null) {
            return null;
        }
        boolean z11 = item.getInfoState() == PdpNutritionInfoVO.PdpNutritionInfoState.PARTIAL || item.getInfoState() == PdpNutritionInfoVO.PdpNutritionInfoState.PARTIAL_WITH_SAUCE;
        bindOrGoneCheckbox(item.getSauceInfo(), onSauceClick, item.getInfoState());
        bindSwitch(item.getInfoState().hasSauce(), z11, info.getSwitch(), info.getSpacers(), onSwitchClick);
        bindComponents(item.getInfo().getSpacers(), item.getPaddings(), getComponents(item));
        bindButton(item.getButton(), handler, item.getCorners().getButtonRadius());
        bindBackground(item.getBackgroundColor(), item.getCorners().getWidgetRadius());
        bindPaddings(item.getPaddings());
        return Unit.f71690a;
    }

    private final void bindOrGoneCheckbox(final PdpNutritionInfoVO.SauceInfo sauceInfo, final Function2<? super PdpNutritionInfoVO.PdpNutritionInfoState, ? super t, Unit> onSauceClick, final PdpNutritionInfoVO.PdpNutritionInfoState currentState) {
        if (sauceInfo == null) {
            ViewExtKt.gone(this.checkboxWithText);
            return;
        }
        CellHolderKt.bindOrGone$default(this.checkboxWithText, sauceInfo.getCheckBoxCell(), null, 2, null);
        this.checkboxWithText.getCenterBlock().setOnClickListener(new View.OnClickListener() { // from class: Fx.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PdpNutritionInfoVO.SauceInfo sauceInfo2 = sauceInfo;
                PdpNutritionInfoView.bindOrGoneCheckbox$lambda$37(Function2.this, this, currentState, sauceInfo2, view);
            }
        });
        this.checkboxWithText.getRightBlock().setOnClickListener(new View.OnClickListener() { // from class: Fx.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PdpNutritionInfoVO.SauceInfo sauceInfo2 = sauceInfo;
                PdpNutritionInfoView.bindOrGoneCheckbox$lambda$38(Function2.this, this, currentState, sauceInfo2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrGoneCheckbox$lambda$37(Function2 function2, PdpNutritionInfoView pdpNutritionInfoView, PdpNutritionInfoVO.PdpNutritionInfoState pdpNutritionInfoState, PdpNutritionInfoVO.SauceInfo sauceInfo, View view) {
        function2.invoke(pdpNutritionInfoView.withChangedSauceState(pdpNutritionInfoState), sauceInfo.getTrackingInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrGoneCheckbox$lambda$38(Function2 function2, PdpNutritionInfoView pdpNutritionInfoView, PdpNutritionInfoVO.PdpNutritionInfoState pdpNutritionInfoState, PdpNutritionInfoVO.SauceInfo sauceInfo, View view) {
        function2.invoke(pdpNutritionInfoView.withChangedSauceState(pdpNutritionInfoState), sauceInfo.getTrackingInfo());
    }

    private final void bindPaddings(PdpNutritionInfoVO.ContainerPaddings paddings) {
        this.container.setPadding(paddings.getInner(), paddings.getTop(), paddings.getInner(), paddings.getBottom());
        ConstraintLayout constraintLayout = this.container;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = paddings.getOuter();
        marginLayoutParams.leftMargin = paddings.getOuter();
        constraintLayout.setLayoutParams(marginLayoutParams);
        ButtonV3View buttonV3View = this.detailsButton;
        ViewGroup.LayoutParams layoutParams2 = buttonV3View.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (this.partialButton.getVisibility() == 0) {
            marginLayoutParams2.topMargin = paddings.getBetween();
        }
        buttonV3View.setLayoutParams(marginLayoutParams2);
    }

    private final void bindSpacers(PdpNutritionInfoVO.Info.Spacers spacers) {
        TextAtomV2View textAtomV2View = this.separatorText;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = spacers.getBetween();
        textAtomV2View.setLayoutParams(marginLayoutParams);
        TagButtonView tagButtonView = this.wholeButton;
        ViewGroup.LayoutParams layoutParams2 = tagButtonView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.leftMargin = spacers.getBetween();
        int i11 = defaultInfoBlockRightMargin;
        marginLayoutParams2.rightMargin = i11;
        tagButtonView.setLayoutParams(marginLayoutParams2);
        ConstraintLayout constraintLayout = this.cellContainer;
        ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.topMargin = spacers.getHorizontal();
        marginLayoutParams3.leftMargin = spacers.getVertical();
        marginLayoutParams3.rightMargin = defaultCellRightMargin + i11;
        constraintLayout.setLayoutParams(marginLayoutParams3);
    }

    private final void bindSwitch(final boolean withSauce, boolean isPartial, final PdpNutritionInfoDTO.Info.Switch r43, PdpNutritionInfoVO.Info.Spacers spacers, final Function2<? super PdpNutritionInfoVO.PdpNutritionInfoState, ? super Map<String, TokenizedTrackingInfo>, Unit> onSwitchClick) {
        TagButtonDTO copy;
        TagButtonDTO tagButtonDTO;
        TagButtonView tagButtonView = this.partialButton;
        TagButtonDTO partial = r43.getPartial();
        ImageDTO image = r43.getPartial().getImage();
        Boolean valueOf = Boolean.valueOf(isPartial);
        Boolean bool = Boolean.TRUE;
        copy = partial.copy((r34 & 1) != 0 ? partial.styleType : null, (r34 & 2) != 0 ? partial.size : null, (r34 & 4) != 0 ? partial.isSelected : valueOf, (r34 & 8) != 0 ? partial.isDisabled : null, (r34 & 16) != 0 ? partial.isClosable : null, (r34 & 32) != 0 ? partial.icon : null, (r34 & 64) != 0 ? partial.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? partial.indicator : null, (r34 & 256) != 0 ? partial.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? partial.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? partial.common : null, (r34 & 2048) != 0 ? partial.closeControlSettings : null, (r34 & 4096) != 0 ? partial.context : null, (r34 & 8192) != 0 ? partial.isStateChangeDisabled : bool, (r34 & 16384) != 0 ? partial.image : image, (r34 & 32768) != 0 ? partial.round : null);
        TagButtonHolderKt.bindOrGone$default(tagButtonView, copy, null, 2, null);
        TagButtonView tagButtonView2 = this.wholeButton;
        TagButtonDTO whole = r43.getWhole();
        if (whole != null) {
            tagButtonDTO = whole.copy((r34 & 1) != 0 ? whole.styleType : null, (r34 & 2) != 0 ? whole.size : null, (r34 & 4) != 0 ? whole.isSelected : Boolean.valueOf(!isPartial), (r34 & 8) != 0 ? whole.isDisabled : null, (r34 & 16) != 0 ? whole.isClosable : null, (r34 & 32) != 0 ? whole.icon : null, (r34 & 64) != 0 ? whole.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? whole.indicator : null, (r34 & 256) != 0 ? whole.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? whole.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? whole.common : null, (r34 & 2048) != 0 ? whole.closeControlSettings : null, (r34 & 4096) != 0 ? whole.context : null, (r34 & 8192) != 0 ? whole.isStateChangeDisabled : bool, (r34 & 16384) != 0 ? whole.image : r43.getWhole().getImage(), (r34 & 32768) != 0 ? whole.round : null);
        } else {
            tagButtonDTO = null;
        }
        TagButtonHolderKt.bindOrGone$default(tagButtonView2, tagButtonDTO, null, 2, null);
        bindSpacers(spacers);
        if (r43.getWhole() == null) {
            ViewExtKt.gone(this.separatorText);
            this.partialButton.setOnClickListener(null);
            this.wholeButton.setOnClickListener(null);
        } else {
            ViewExtKt.show(this.separatorText);
            this.partialButton.setOnClickListener(new View.OnClickListener() { // from class: Fx.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PdpNutritionInfoView.bindSwitch$lambda$41(Function2.this, withSauce, r43, view);
                }
            });
            this.wholeButton.setOnClickListener(new View.OnClickListener() { // from class: Fx.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PdpNutritionInfoView.bindSwitch$lambda$42(Function2.this, withSauce, r43, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindSwitch$lambda$41(Function2 function2, boolean z11, PdpNutritionInfoDTO.Info.Switch r22, View view) {
        PdpNutritionInfoVO.PdpNutritionInfoState pdpNutritionInfoState = z11 ? PdpNutritionInfoVO.PdpNutritionInfoState.PARTIAL_WITH_SAUCE : PdpNutritionInfoVO.PdpNutritionInfoState.PARTIAL;
        CommonControlSettings common = r22.getPartial().getCommon();
        function2.invoke(pdpNutritionInfoState, common != null ? common.getTrackingInfo() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindSwitch$lambda$42(Function2 function2, boolean z11, PdpNutritionInfoDTO.Info.Switch r22, View view) {
        PdpNutritionInfoVO.PdpNutritionInfoState pdpNutritionInfoState = z11 ? PdpNutritionInfoVO.PdpNutritionInfoState.WHOLE_WITH_SAUCE : PdpNutritionInfoVO.PdpNutritionInfoState.WHOLE;
        CommonControlSettings common = r22.getWhole().getCommon();
        function2.invoke(pdpNutritionInfoState, common != null ? common.getTrackingInfo() : null);
    }

    private final int countCellWidth(PdpNutritionInfoVO.ContainerPaddings paddings, PdpNutritionInfoVO.Info.Spacers spacers) {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            return (((viewGroup.getWidth() - (paddings.getOuter() * 2)) - (paddings.getInner() * 2)) - spacers.getVertical()) - defaultCellRightMargin;
        }
        return 0;
    }

    private final CellDTO format(CellDTO cellDTO) {
        CellDTO.CellText cellText;
        CellDTO.CellText cellText2;
        CellDTO.CellText title = cellDTO.getCenterBlock().getTitle();
        CellDTO.CellText subtitle = cellDTO.getCenterBlock().getSubtitle();
        CellDTO.CenterBlock centerBlock = cellDTO.getCenterBlock();
        CellDTO.CellText copy$default = CellDTO.CellText.copy$default(title, formatText(title.getText(), 6), null, null, false, null, null, 62, null);
        if (subtitle != null) {
            cellText = subtitle;
            CellDTO.CellText copy$default2 = CellDTO.CellText.copy$default(cellText, formatText(subtitle.getText(), 8), null, null, false, null, null, 62, null);
            if (copy$default2 != null) {
                cellText2 = copy$default2;
                return CellDTO.copy$default(cellDTO, CellDTO.CenterBlock.copy$default(centerBlock, copy$default, cellText2, null, null, null, null, 60, null), null, null, null, null, 30, null);
            }
        } else {
            cellText = subtitle;
        }
        cellText2 = cellText;
        return CellDTO.copy$default(cellDTO, CellDTO.CenterBlock.copy$default(centerBlock, copy$default, cellText2, null, null, null, null, 60, null), null, null, null, null, 30, null);
    }

    private final OzonSpannableString formatText(OzonSpannableString ozonSpannableString, int i11) {
        if (((String) h.l(ozonSpannableString, new char[]{' '}, 0, 6).get(0)).length() <= i11) {
            return ozonSpannableString;
        }
        return new OzonSpannableString(((Object) h.p0(ozonSpannableString, i11)) + "...");
    }

    private final PdpNutritionInfoDTO.Components getComponents(PdpNutritionInfoVO pdpNutritionInfoVO) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[pdpNutritionInfoVO.getInfoState().ordinal()];
        if (i11 == 1) {
            PdpNutritionInfoVO.Info info = pdpNutritionInfoVO.getInfo();
            if (info != null) {
                return info.getPartialComponents();
            }
            return null;
        }
        if (i11 == 2) {
            PdpNutritionInfoVO.Info info2 = pdpNutritionInfoVO.getInfo();
            if (info2 != null) {
                return info2.getWholeComponents();
            }
            return null;
        }
        if (i11 == 3) {
            PdpNutritionInfoVO.SauceInfo sauceInfo = pdpNutritionInfoVO.getSauceInfo();
            if (sauceInfo != null) {
                return sauceInfo.getWholeComponents();
            }
            return null;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                return null;
            }
            throw new o();
        }
        PdpNutritionInfoVO.SauceInfo sauceInfo2 = pdpNutritionInfoVO.getSauceInfo();
        if (sauceInfo2 != null) {
            return sauceInfo2.getPartialComponents();
        }
        return null;
    }

    private final void hideInfoBlock() {
        ViewExtKt.gone(this.partialButton);
        ViewExtKt.gone(this.separatorText);
        ViewExtKt.gone(this.wholeButton);
        ViewExtKt.gone(this.energyCell);
        ViewExtKt.gone(this.proteinCell);
        ViewExtKt.gone(this.fatCell);
        ViewExtKt.gone(this.carbohydrateCell);
    }

    private final PdpNutritionInfoVO.PdpNutritionInfoState withChangedSauceState(PdpNutritionInfoVO.PdpNutritionInfoState pdpNutritionInfoState) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[pdpNutritionInfoState.ordinal()];
        if (i11 == 1) {
            return PdpNutritionInfoVO.PdpNutritionInfoState.PARTIAL_WITH_SAUCE;
        }
        if (i11 == 2) {
            return PdpNutritionInfoVO.PdpNutritionInfoState.WHOLE_WITH_SAUCE;
        }
        if (i11 == 3) {
            return PdpNutritionInfoVO.PdpNutritionInfoState.WHOLE;
        }
        if (i11 == 4) {
            return PdpNutritionInfoVO.PdpNutritionInfoState.PARTIAL;
        }
        if (i11 == 5) {
            return PdpNutritionInfoVO.PdpNutritionInfoState.NONE;
        }
        throw new o();
    }

    public final void bind(@NotNull PdpNutritionInfoVO item, @NotNull Function1<? super AtomAction, Unit> handler, @NotNull Function2<? super PdpNutritionInfoVO.PdpNutritionInfoState, ? super Map<String, TokenizedTrackingInfo>, Unit> onSwitchClick, @NotNull Function2<? super PdpNutritionInfoVO.PdpNutritionInfoState, ? super t, Unit> onSauceClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(onSwitchClick, "onSwitchClick");
        Intrinsics.checkNotNullParameter(onSauceClick, "onSauceClick");
        if (item.getInfoState() == PdpNutritionInfoVO.PdpNutritionInfoState.NONE) {
            bindCompactState(item, handler);
        } else {
            bindExtendedState(item, handler, onSwitchClick, onSauceClick);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpNutritionInfoView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(constraintLayout);
        this.container = constraintLayout;
        TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
        tagButtonView.setId(R$id.pdpNutritionInfoPartial);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41628e = 0;
        bVar.f41636i = 0;
        tagButtonView.setLayoutParams(bVar);
        constraintLayout.addView(tagButtonView);
        this.partialButton = tagButtonView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.pdpNutritionInfoSeparator, -2, -2);
        int i12 = R$id.pdpNutritionInfoPartial;
        d11.f41630f = i12;
        d11.f41636i = i12;
        d11.f41642l = i12;
        textAtomV2View.setLayoutParams(d11);
        TextHolderKt.bindOrGone$default(textAtomV2View, separatorData, null, 2, null);
        constraintLayout.addView(textAtomV2View);
        this.separatorText = textAtomV2View;
        TagButtonView tagButtonView2 = new TagButtonView(context, null, 0, 0, 14, null);
        tagButtonView2.setId(R$id.pdpNutritionInfoWhole);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41630f = R$id.pdpNutritionInfoSeparator;
        bVar2.f41634h = 0;
        int i13 = R$id.pdpNutritionInfoPartial;
        bVar2.f41636i = i13;
        bVar2.f41642l = i13;
        bVar2.f41599F = 1.0f;
        bVar2.f41598E = 0.0f;
        tagButtonView2.setLayoutParams(bVar2);
        constraintLayout.addView(tagButtonView2);
        this.wholeButton = tagButtonView2;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.pdpNutritionInfoToggleBarrier);
        barrier.f(1);
        barrier.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        barrier.setReferencedIds(new int[]{R$id.pdpNutritionInfoPartial, R$id.pdpNutritionInfoSeparator, R$id.pdpNutritionInfoWhole});
        constraintLayout.addView(barrier);
        this.toggleBarrier = barrier;
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R$id.pdpNutritionInfoCellContainer);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-1, -2);
        bVar3.f41628e = 0;
        bVar3.f41634h = 0;
        bVar3.f41638j = R$id.pdpNutritionInfoPartial;
        bVar3.f41603J = 1;
        constraintLayout2.setLayoutParams(bVar3);
        constraintLayout.addView(constraintLayout2);
        this.cellContainer = constraintLayout2;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.pdpNutritionInfoEnergy);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.f41628e = 0;
        bVar4.f41632g = R$id.pdpNutritionInfoProtein;
        bVar4.f41636i = 0;
        bVar4.f41603J = 1;
        cellView.setLayoutParams(bVar4);
        constraintLayout2.addView(cellView);
        this.energyCell = cellView;
        CellView cellView2 = new CellView(context, null, 0, 0, null, 30, null);
        cellView2.setId(R$id.pdpNutritionInfoProtein);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(-2, -2);
        bVar5.f41630f = R$id.pdpNutritionInfoEnergy;
        bVar5.f41632g = R$id.pdpNutritionInfoFat;
        bVar5.f41636i = 0;
        cellView2.setLayoutParams(bVar5);
        constraintLayout2.addView(cellView2);
        this.proteinCell = cellView2;
        CellView cellView3 = new CellView(context, null, 0, 0, null, 30, null);
        cellView3.setId(R$id.pdpNutritionInfoFat);
        ConstraintLayout.b bVar6 = new ConstraintLayout.b(-2, -2);
        bVar6.f41630f = R$id.pdpNutritionInfoProtein;
        bVar6.f41632g = R$id.pdpNutritionInfoCarbohydrate;
        bVar6.f41636i = 0;
        cellView3.setLayoutParams(bVar6);
        constraintLayout2.addView(cellView3);
        this.fatCell = cellView3;
        CellView cellView4 = new CellView(context, null, 0, 0, null, 30, null);
        cellView4.setId(R$id.pdpNutritionInfoCarbohydrate);
        ConstraintLayout.b bVar7 = new ConstraintLayout.b(-2, -2);
        bVar7.f41630f = R$id.pdpNutritionInfoFat;
        bVar7.f41634h = 0;
        bVar7.f41636i = 0;
        cellView4.setLayoutParams(bVar7);
        constraintLayout2.addView(cellView4);
        this.carbohydrateCell = cellView4;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.pdpNutritionInfoButton, -1, -2);
        e11.f41638j = R$id.pdpNutritionInfoCellContainer;
        e11.f41642l = 0;
        e11.f41628e = 0;
        e11.f41634h = 0;
        buttonV3View.setLayoutParams(e11);
        constraintLayout.addView(buttonV3View);
        this.detailsButton = buttonV3View;
        CellView cellView5 = new CellView(context, null, 0, 0, null, 30, null);
        cellView5.setId(R$id.pdpNutritionInfoCheckboxWithText);
        ConstraintLayout.b bVar8 = new ConstraintLayout.b(0, -2);
        bVar8.f41636i = 0;
        bVar8.f41634h = 0;
        bVar8.f41630f = R$id.pdpNutritionInfoToggleBarrier;
        bVar8.f41642l = R$id.pdpNutritionInfoPartial;
        bVar8.f41598E = 1.0f;
        ((ViewGroup.MarginLayoutParams) bVar8).rightMargin = toggleAndCheckboxMargin;
        bVar8.f41605L = 1;
        cellView5.setLayoutParams(bVar8);
        constraintLayout.addView(cellView5);
        this.checkboxWithText = cellView5;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(defaultBackgroundRadius);
        int i14 = defaultBackgroundColor;
        gradientDrawable.setColors(new int[]{i14, i14});
        this.backgroundDrawable = gradientDrawable;
    }
}
