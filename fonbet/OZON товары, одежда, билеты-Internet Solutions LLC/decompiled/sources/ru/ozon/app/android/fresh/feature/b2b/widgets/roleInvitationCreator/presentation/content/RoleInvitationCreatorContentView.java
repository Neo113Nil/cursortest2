package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content;

import B90.C2618u;
import Bi.b;
import C.o0;
import Sc.o;
import aX.ViewOnClickListenerC4980a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.RoleInvitationCreatorContentVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.RoleInvitationCreatorViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.RoleInvitationCreatorContentView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 e2\u00020\u0001:\u0002efB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u00152\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020'2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010/J7\u00103\u001a\u00020\u000f2\u0006\u00100\u001a\u00020#2\b\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b3\u00104J)\u00105\u001a\u00020\u000f2\u0006\u00100\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u000f2\u0006\u00100\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u00020'2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00152\u0006\u00100\u001a\u00020#2\u0006\u0010<\u001a\u00020\u0015H\u0002¢\u0006\u0004\b=\u0010>J%\u0010@\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020'\u0018\u00010?2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b@\u0010AJ!\u0010C\u001a\u00020\u000f2\u0006\u00109\u001a\u00020'2\b\b\u0002\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u000f2\u0006\u00100\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u000fH\u0002¢\u0006\u0004\bJ\u0010\u001cJ\u000f\u0010K\u001a\u00020\u000fH\u0002¢\u0006\u0004\bK\u0010\u001cR\u0014\u0010L\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010Q\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010OR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010OR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020,0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/content/RoleInvitationCreatorContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel;", "viewModel", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel;)V", "", "index", "", "message", "showErrorForInput", "(ILjava/lang/String;)V", "clearError", "()V", "clearInputFocus", "resetState", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel;)V", "id", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "configureParams", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "createInput", "(ILkotlin/jvm/functions/Function1;)Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "topToBottomId", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createErrorText", "(II)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "addInputRow", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/content/RoleInvitationCreatorContentView$InputRow;", "row", "removeInputRow", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/content/RoleInvitationCreatorContentView$InputRow;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel;)V", "inputView", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Input;", "input", "setupEmailInput", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Input;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel;I)V", "setupTextChangeListener", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;ILru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel;)V", "setupFocusListener", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;I)V", "textView", "setupCaption", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Input;)V", "initialIndex", "findActualIndex", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;I)I", "Lkotlin/Pair;", "getInput", "(I)Lkotlin/Pair;", "isNegative", "setErrorTextColor", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Z)V", "clearErrorForInput", "(I)V", "Landroid/widget/EditText;", "setupHideKeyboardOnDone", "(Landroid/widget/EditText;)V", "hideKeyboard", "updateAddButtonVisibility", "contentView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "emailInput", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "captionView", "Landroid/widget/LinearLayout;", "dynamicInputsContainer", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "addInputButtonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "agreementView", "", "inputRows", "Ljava/util/List;", "maxEmailCount", "Ljava/lang/Integer;", "backendCaption", "Ljava/lang/String;", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "emailWatcher", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "Companion", "InputRow", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RoleInvitationCreatorContentView extends ConstraintLayout {

    @NotNull
    private final ButtonV3View addInputButtonView;

    @NotNull
    private final TextAtomV2View agreementView;
    private String backendCaption;

    @NotNull
    private final TextAtomV2View captionView;

    @NotNull
    private final ConstraintLayout contentView;

    @NotNull
    private final LinearLayout dynamicInputsContainer;

    @NotNull
    private final OzonTextInputLayout emailInput;
    private OzonTextWatcher emailWatcher;

    @NotNull
    private final List<InputRow> inputRows;
    private Integer maxEmailCount;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int PADDING_24 = UiExtKt.toPx(Paddings.PADDING_700.getPx());
    private static final int PADDING_16 = UiExtKt.toPx(Paddings.PADDING_500.getPx());
    private static final int PADDING_8 = UiExtKt.toPx(Paddings.PADDING_300.getPx());
    private static final int PADDING_4 = UiExtKt.toPx(Paddings.PADDING_200.getPx());
    private static final int ERROR_TEXT_STYLE = R$style.OzonTextAppearance_Body_300xsmall;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/content/RoleInvitationCreatorContentView$Companion;", "", "<init>", "()V", "", "PADDING_8", "I", "getPADDING_8", "()I", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getPADDING_8() {
            return RoleInvitationCreatorContentView.PADDING_8;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u000f¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/content/RoleInvitationCreatorContentView$InputRow;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "input", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "deleteButton", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "errorTextView", "", "backendCaption", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/uni/android/atom/text/TextAtomV2View;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContainerView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "getInput", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getDeleteButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getErrorTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Ljava/lang/String;", "getBackendCaption", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class InputRow {
        private final String backendCaption;

        @NotNull
        private final ConstraintLayout containerView;

        @NotNull
        private final IconButtonV3View deleteButton;

        @NotNull
        private final TextAtomV2View errorTextView;

        @NotNull
        private final OzonTextInputLayout input;

        public InputRow(@NotNull ConstraintLayout containerView, @NotNull OzonTextInputLayout input, @NotNull IconButtonV3View deleteButton, @NotNull TextAtomV2View errorTextView, String str) {
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(deleteButton, "deleteButton");
            Intrinsics.checkNotNullParameter(errorTextView, "errorTextView");
            this.containerView = containerView;
            this.input = input;
            this.deleteButton = deleteButton;
            this.errorTextView = errorTextView;
            this.backendCaption = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputRow)) {
                return false;
            }
            InputRow inputRow = (InputRow) other;
            return Intrinsics.d(this.containerView, inputRow.containerView) && Intrinsics.d(this.input, inputRow.input) && Intrinsics.d(this.deleteButton, inputRow.deleteButton) && Intrinsics.d(this.errorTextView, inputRow.errorTextView) && Intrinsics.d(this.backendCaption, inputRow.backendCaption);
        }

        public final String getBackendCaption() {
            return this.backendCaption;
        }

        @NotNull
        public final ConstraintLayout getContainerView() {
            return this.containerView;
        }

        @NotNull
        public final TextAtomV2View getErrorTextView() {
            return this.errorTextView;
        }

        @NotNull
        public final OzonTextInputLayout getInput() {
            return this.input;
        }

        public int hashCode() {
            int hashCode = (this.errorTextView.hashCode() + ((this.deleteButton.hashCode() + ((this.input.hashCode() + (this.containerView.hashCode() * 31)) * 31)) * 31)) * 31;
            String str = this.backendCaption;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            ConstraintLayout constraintLayout = this.containerView;
            OzonTextInputLayout ozonTextInputLayout = this.input;
            IconButtonV3View iconButtonV3View = this.deleteButton;
            TextAtomV2View textAtomV2View = this.errorTextView;
            String str = this.backendCaption;
            StringBuilder sb2 = new StringBuilder("InputRow(containerView=");
            sb2.append(constraintLayout);
            sb2.append(", input=");
            sb2.append(ozonTextInputLayout);
            sb2.append(", deleteButton=");
            sb2.append(iconButtonV3View);
            sb2.append(", errorTextView=");
            sb2.append(textAtomV2View);
            sb2.append(", backendCaption=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoleInvitationCreatorContentVO.Size.values().length];
            try {
                iArr[RoleInvitationCreatorContentVO.Size.SIZE_500.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoleInvitationCreatorContentVO.Size.SIZE_600.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleInvitationCreatorContentView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R$id.roleInvitationCreatorContent);
        constraintLayout.setLayoutParams(new ConstraintLayout.b(-1, -2));
        int i11 = PADDING_16;
        constraintLayout.setPadding(i11, 0, i11, i11);
        addView(constraintLayout);
        this.contentView = constraintLayout;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.roleInvitationCreatorTitle, 0, -2);
        d11.f41636i = 0;
        d11.f41656t = 0;
        d11.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = PADDING_24;
        textAtomV2View.setLayoutParams(d11);
        constraintLayout.addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.roleInvitationCreatorSubtitle, 0, -2);
        d12.f41638j = textAtomV2View.getId();
        d12.f41656t = 0;
        d12.f41658v = 0;
        int i12 = PADDING_8;
        ((ViewGroup.MarginLayoutParams) d12).topMargin = i12;
        ((ViewGroup.MarginLayoutParams) d12).bottomMargin = i12;
        textAtomV2View2.setLayoutParams(d12);
        constraintLayout.addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        OzonTextInputLayout createInput = createInput(R$id.roleInvitationCreatorInput, new RoleInvitationCreatorContentView$emailInput$1(this));
        constraintLayout.addView(createInput);
        this.emailInput = createInput;
        TextAtomV2View createErrorText = createErrorText(R$id.roleInvitationCreatorCaption, createInput.getId());
        constraintLayout.addView(createErrorText);
        this.captionView = createErrorText;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.f41638j = createErrorText.getId();
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i12;
        linearLayout.setLayoutParams(bVar);
        linearLayout.setOrientation(1);
        constraintLayout.addView(linearLayout);
        this.dynamicInputsContainer = linearLayout;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.roleInvitationCreatorAddInputButton, -2, -2);
        e11.f41638j = linearLayout.getId();
        e11.f41656t = 0;
        ((ViewGroup.MarginLayoutParams) e11).topMargin = i12;
        ((ViewGroup.MarginLayoutParams) e11).bottomMargin = i12;
        buttonV3View.setLayoutParams(e11);
        constraintLayout.addView(buttonV3View);
        this.addInputButtonView = buttonV3View;
        TextAtomV2View textAtomV2View3 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d13 = b.d(textAtomV2View3, R$id.roleInvitationCreatorAgreement, 0, -2);
        d13.f41638j = R$id.roleInvitationCreatorAddInputButton;
        d13.f41656t = 0;
        d13.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) d13).topMargin = i11;
        ((ViewGroup.MarginLayoutParams) d13).bottomMargin = i12;
        textAtomV2View3.setLayoutParams(d13);
        constraintLayout.addView(textAtomV2View3);
        this.agreementView = textAtomV2View3;
        this.inputRows = new ArrayList();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ResourceExtKt.toPxF(24), ResourceExtKt.toPxF(24), ResourceExtKt.toPxF(24), ResourceExtKt.toPxF(24)});
        setBackground(gradientDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addInputRow(RoleInvitationCreatorContentVO item, final RoleInvitationCreatorViewModel viewModel) {
        IconButtonV3View iconButtonV3View;
        String str;
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i11 = PADDING_8;
        layoutParams.setMargins(0, 0, 0, i11);
        constraintLayout.setLayoutParams(layoutParams);
        this.dynamicInputsContainer.addView(constraintLayout);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View2.setId(View.generateViewId());
        OzonTextInputLayout createInput = createInput(View.generateViewId(), new RoleInvitationCreatorContentView$addInputRow$input$1(iconButtonV3View2));
        constraintLayout.addView(createInput);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41658v = 0;
        bVar.f41636i = createInput.getId();
        bVar.f41642l = createInput.getId();
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i11;
        iconButtonV3View2.setLayoutParams(bVar);
        constraintLayout.addView(iconButtonV3View2);
        TextAtomV2View createErrorText = createErrorText(View.generateViewId(), createInput.getId());
        constraintLayout.addView(createErrorText);
        int size = this.inputRows.size() + 1;
        viewModel.updateEmail(size, "");
        RoleInvitationCreatorContentVO.Input input = item.getField().getInput();
        if (input != null) {
            str = input.getCaption();
            iconButtonV3View = iconButtonV3View2;
        } else {
            iconButtonV3View = iconButtonV3View2;
            str = null;
        }
        final InputRow inputRow = new InputRow(constraintLayout, createInput, iconButtonV3View, createErrorText, str);
        IconButtonV3View iconButtonV3View3 = iconButtonV3View;
        this.inputRows.add(inputRow);
        setupEmailInput(createInput, item.getField().getInput(), viewModel, size);
        setupCaption(createErrorText, item.getField().getInput());
        IconButtonV3HolderKt.bindOrGone$default(iconButtonV3View3, item.getField().getDeleteInputButton(), null, 2, null);
        iconButtonV3View3.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoleInvitationCreatorContentView.this.removeInputRow(inputRow, viewModel);
            }
        });
        updateAddButtonVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearErrorForInput(int index) {
        String backendCaption;
        Pair<OzonTextInputLayout, TextAtomV2View> input = getInput(index);
        if (input == null) {
            return;
        }
        OzonTextInputLayout a11 = input.a();
        TextAtomV2View b11 = input.b();
        a11.setStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        if (index == 0) {
            backendCaption = this.backendCaption;
        } else {
            InputRow inputRow = (InputRow) C7714v.Q(index - 1, this.inputRows);
            backendCaption = inputRow != null ? inputRow.getBackendCaption() : null;
        }
        if (backendCaption != null) {
            b11.setText(backendCaption);
            ViewExtKt.show(b11);
            setErrorTextColor(b11, false);
        } else {
            ViewExtKt.gone(b11);
            b11.setText((CharSequence) null);
            setErrorTextColor(b11, false);
        }
    }

    private final TextAtomV2View createErrorText(int id2, int topToBottomId) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, id2, 0, -2);
        d11.f41656t = 0;
        d11.f41658v = 0;
        d11.f41638j = topToBottomId;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = PADDING_4;
        d11.setMarginStart(PADDING_16);
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextAppearance(ERROR_TEXT_STYLE);
        ViewExtKt.gone(textAtomV2View);
        return textAtomV2View;
    }

    private final OzonTextInputLayout createInput(int id2, Function1<? super ConstraintLayout.b, Unit> configureParams) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OzonTextInputLayout ozonTextInputLayout = new OzonTextInputLayout(context, null, 0, 6, null);
        ozonTextInputLayout.setId(id2);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        configureParams.invoke(bVar);
        ozonTextInputLayout.setLayoutParams(bVar);
        ozonTextInputLayout.setKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.DONE);
        setupHideKeyboardOnDone(ozonTextInputLayout.getInputViewGroup().getInputView());
        return ozonTextInputLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int findActualIndex(OzonTextInputLayout inputView, int initialIndex) {
        int i11 = 0;
        if (Intrinsics.d(inputView, this.emailInput)) {
            return 0;
        }
        Iterator<InputRow> it = this.inputRows.iterator();
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(it.next().getInput(), inputView)) {
                break;
            }
            i11++;
        }
        return i11 >= 0 ? i11 + 1 : initialIndex;
    }

    private final Pair<OzonTextInputLayout, TextAtomV2View> getInput(int index) {
        if (index == 0) {
            return new Pair<>(this.emailInput, this.captionView);
        }
        InputRow inputRow = (InputRow) C7714v.Q(index - 1, this.inputRows);
        if (inputRow == null) {
            return null;
        }
        return new Pair<>(inputRow.getInput(), inputRow.getErrorTextView());
    }

    private final void hideKeyboard() {
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.emailInput.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeInputRow(InputRow row, RoleInvitationCreatorViewModel viewModel) {
        int indexOf = this.inputRows.indexOf(row);
        this.dynamicInputsContainer.removeView(row.getContainerView());
        this.inputRows.remove(row);
        viewModel.removeEmail(indexOf + 1);
        updateAddButtonVisibility();
    }

    private final void resetState(RoleInvitationCreatorViewModel viewModel) {
        OzonTextWatcher ozonTextWatcher = this.emailWatcher;
        if (ozonTextWatcher != null) {
            this.emailInput.getInputViewGroup().getInputView().removeTextChangedListener(ozonTextWatcher);
            this.emailWatcher = null;
        }
        Iterator<T> it = this.inputRows.iterator();
        while (it.hasNext()) {
            this.dynamicInputsContainer.removeView(((InputRow) it.next()).getContainerView());
        }
        this.inputRows.clear();
        viewModel.clearEmails();
    }

    private final void setErrorTextColor(TextAtomV2View textView, boolean isNegative) {
        UniColors uniColors = isNegative ? UniColors.TEXT_NEGATIVE : UniColors.TEXT_SECONDARY;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(ResourceExtKt.color(context, uniColors.getResId()));
    }

    private final void setupCaption(TextAtomV2View textView, RoleInvitationCreatorContentVO.Input input) {
        if ((input != null ? input.getCaption() : null) != null) {
            ViewExtKt.show(textView);
            textView.setText(input.getCaption());
        } else {
            ViewExtKt.gone(textView);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        setErrorTextColor(textView, false);
    }

    private final void setupEmailInput(OzonTextInputLayout inputView, RoleInvitationCreatorContentVO.Input input, RoleInvitationCreatorViewModel viewModel, int index) {
        TextInputStyle createInput500Style;
        if (input == null) {
            ViewExtKt.gone(inputView);
            return;
        }
        ViewExtKt.show(inputView);
        String placeholder = input.getPlaceholder();
        if (placeholder == null) {
            placeholder = "";
        }
        inputView.setLabelText(placeholder);
        int i11 = WhenMappings.$EnumSwitchMapping$0[input.getSize().ordinal()];
        if (i11 == 1) {
            createInput500Style = TextInputStyle.INSTANCE.createInput500Style();
        } else {
            if (i11 != 2) {
                throw new o();
            }
            createInput500Style = TextInputStyle.INSTANCE.createInput600Style();
        }
        inputView.setStyle(createInput500Style);
        OzonTextInput inputView2 = inputView.getInputViewGroup().getInputView();
        String value = input.getValue();
        inputView2.setText(value != null ? value : "");
        setupHideKeyboardOnDone(inputView.getInputViewGroup().getInputView());
        setupFocusListener(inputView, index);
        setupTextChangeListener(inputView, index, viewModel);
    }

    private final void setupFocusListener(final OzonTextInputLayout inputView, final int index) {
        OzonTextInput inputView2 = inputView.getInputViewGroup().getInputView();
        final View.OnFocusChangeListener onFocusChangeListener = inputView2.getOnFocusChangeListener();
        inputView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: mv.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                OzonTextInputLayout ozonTextInputLayout = inputView;
                RoleInvitationCreatorContentView.setupFocusListener$lambda$37(onFocusChangeListener, this, ozonTextInputLayout, index, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFocusListener$lambda$37(View.OnFocusChangeListener onFocusChangeListener, RoleInvitationCreatorContentView roleInvitationCreatorContentView, OzonTextInputLayout ozonTextInputLayout, int i11, View view, boolean z11) {
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        if (z11) {
            roleInvitationCreatorContentView.clearErrorForInput(roleInvitationCreatorContentView.findActualIndex(ozonTextInputLayout, i11));
        }
    }

    private final void setupHideKeyboardOnDone(EditText inputView) {
        inputView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: mv.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean z11;
                z11 = RoleInvitationCreatorContentView.setupHideKeyboardOnDone$lambda$39(RoleInvitationCreatorContentView.this, textView, i11, keyEvent);
                return z11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupHideKeyboardOnDone$lambda$39(RoleInvitationCreatorContentView roleInvitationCreatorContentView, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        roleInvitationCreatorContentView.hideKeyboard();
        return true;
    }

    private final void setupTextChangeListener(final OzonTextInputLayout inputView, final int index, final RoleInvitationCreatorViewModel viewModel) {
        if (viewModel == null) {
            return;
        }
        OzonTextInput inputView2 = inputView.getInputViewGroup().getInputView();
        OzonTextWatcher ozonTextWatcher = new OzonTextWatcher() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.RoleInvitationCreatorContentView$setupTextChangeListener$watcher$1
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                int findActualIndex;
                String str;
                findActualIndex = RoleInvitationCreatorContentView.this.findActualIndex(inputView, index);
                RoleInvitationCreatorViewModel roleInvitationCreatorViewModel = viewModel;
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                roleInvitationCreatorViewModel.updateEmail(findActualIndex, str);
                RoleInvitationCreatorContentView.this.clearErrorForInput(findActualIndex);
            }
        };
        if (inputView.equals(this.emailInput)) {
            this.emailWatcher = ozonTextWatcher;
        }
        inputView2.addTextChangedListener(ozonTextWatcher);
    }

    private final void updateAddButtonVisibility() {
        Integer num = this.maxEmailCount;
        if (num != null) {
            if (this.inputRows.size() + 1 >= num.intValue()) {
                ViewExtKt.gone(this.addInputButtonView);
                return;
            }
        }
        ViewExtKt.show(this.addInputButtonView);
    }

    public final void bind(@NotNull RoleInvitationCreatorContentVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull RoleInvitationCreatorViewModel viewModel) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        resetState(viewModel);
        TextHolderKt.bindOrGone$default(this.titleView, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, item.getSubtitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.agreementView, item.getAgreement(), null, 2, null);
        this.maxEmailCount = item.getField().getMaxEmailCount();
        RoleInvitationCreatorContentVO.Input input = item.getField().getInput();
        this.backendCaption = input != null ? input.getCaption() : null;
        RoleInvitationCreatorContentVO.Field field = item.getField();
        setupEmailInput(this.emailInput, field.getInput(), viewModel, 0);
        setupCaption(this.captionView, field.getInput());
        ButtonV3HolderKt.bindOrGone(this.addInputButtonView, field.getAddInputButton(), actionHandler);
        this.addInputButtonView.setOnClickListener(new ViewOnClickListenerC4980a(this, item, viewModel, 1));
    }

    public final void clearError() {
        int i11 = 0;
        clearErrorForInput(0);
        for (Object obj : this.inputRows) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            clearErrorForInput(i12);
            i11 = i12;
        }
    }

    public final void clearInputFocus() {
        this.emailInput.getInputViewGroup().getInputView().clearFocus();
        Iterator<T> it = this.inputRows.iterator();
        while (it.hasNext()) {
            ((InputRow) it.next()).getInput().getInputViewGroup().getInputView().clearFocus();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0 && !(focusSearch(130) instanceof OzonTextInputLayout)) {
            clearInputFocus();
            hideKeyboard();
        }
        return super.dispatchTouchEvent(event);
    }

    public final void showErrorForInput(int index, String message) {
        Pair<OzonTextInputLayout, TextAtomV2View> input = getInput(index);
        if (input == null) {
            return;
        }
        OzonTextInputLayout a11 = input.a();
        TextAtomV2View b11 = input.b();
        a11.setState(OzonTextInputLayoutModel.State.DEFAULT);
        a11.setStatus(OzonTextInputLayoutModel.Status.ERROR);
        if (message != null) {
            b11.setText(message);
            ViewExtKt.show(b11);
            setErrorTextColor(b11, true);
        }
    }
}
