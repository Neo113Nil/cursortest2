package ru.ozon.app.android.widgets.designSystemAtoms.presentation;

import Sc.o;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.platform.widgets.databinding.WidgetDsAtomsTextAreaBinding;
import ru.ozon.app.android.widgets.designSystemAtoms.core.TextAreaVO;
import ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 #2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001#B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00160\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/presentation/TextAreaViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/widgets/designSystemAtoms/core/TextAreaVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Ll10/i;", "container", "<init>", "(Landroid/view/View;Ll10/i;)V", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Status;", "Lru/ozon/uni/android/textArea/TextAreaView$Status;", "mapToTextAreaStatus", "(Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Status;)Lru/ozon/uni/android/textArea/TextAreaView$Status;", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$State;", "Lru/ozon/uni/android/textArea/TextAreaView$State;", "mapToTextAreaState", "(Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$State;)Lru/ozon/uni/android/textArea/TextAreaView$State;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/widgets/designSystemAtoms/core/TextAreaVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/platform/widgets/databinding/WidgetDsAtomsTextAreaBinding;", "binding", "Lru/ozon/app/android/platform/widgets/databinding/WidgetDsAtomsTextAreaBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAreaViewHolder extends k<TextAreaVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDsAtomsTextAreaBinding binding;

    @NotNull
    private final View containerView;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DesignSystemAtomsDTO.Type.values().length];
            try {
                iArr[DesignSystemAtomsDTO.Type.TYPE_RESIZABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DesignSystemAtomsDTO.Type.TYPE_FIXED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DesignSystemAtomsDTO.Status.values().length];
            try {
                iArr2[DesignSystemAtomsDTO.Status.STATUS_NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DesignSystemAtomsDTO.Status.STATUS_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DesignSystemAtomsDTO.Status.STATUS_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DesignSystemAtomsDTO.State.values().length];
            try {
                iArr3[DesignSystemAtomsDTO.State.STATE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[DesignSystemAtomsDTO.State.STATE_ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[DesignSystemAtomsDTO.State.STATE_DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DesignSystemAtomsDTO.State.STATE_READONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAreaViewHolder(@NotNull View containerView, @NotNull i container) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        this.containerView = containerView;
        WidgetDsAtomsTextAreaBinding bind = WidgetDsAtomsTextAreaBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    private final TextAreaView.State mapToTextAreaState(DesignSystemAtomsDTO.State state) {
        int i11 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$2[state.ordinal()];
        if (i11 == -1 || i11 == 1) {
            return TextAreaView.State.DEFAULT;
        }
        if (i11 == 2) {
            return TextAreaView.State.ACTIVE;
        }
        if (i11 == 3) {
            return TextAreaView.State.DISABLED;
        }
        if (i11 == 4) {
            return TextAreaView.State.READ_ONLY;
        }
        throw new o();
    }

    private final TextAreaView.Status mapToTextAreaStatus(DesignSystemAtomsDTO.Status status) {
        int i11 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
        if (i11 == -1 || i11 == 1) {
            return TextAreaView.Status.NEUTRAL;
        }
        if (i11 == 2) {
            return TextAreaView.Status.SUCCESS;
        }
        if (i11 == 3) {
            return TextAreaView.Status.ERROR;
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TextAreaVO item, @NotNull d info) {
        boolean z11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetDsAtomsTextAreaBinding widgetDsAtomsTextAreaBinding = this.binding;
        TextAreaView textAreaView = widgetDsAtomsTextAreaBinding.textArea;
        if (item.getTextAreaParams().getInfoAction() != null) {
            Map<String, TokenizedTrackingInfo> trackingInfo = item.getTextAreaParams().getInfoAction().getTrackingInfo();
            AtomActionDTO action = item.getTextAreaParams().getInfoAction().getAction();
            widgetDsAtomsTextAreaBinding.textArea.setInfoClickListener(new TextAreaViewHolder$bind$1$1(action != null ? AtomActionMapperKt.toAtomAction(action, trackingInfo) : null, this));
            z11 = true;
        } else {
            z11 = false;
        }
        textAreaView.setHasInfoIcon(z11);
        TextAreaView textAreaView2 = widgetDsAtomsTextAreaBinding.textArea;
        Boolean isDeleteAllButtonAllowed = item.getTextAreaParams().isDeleteAllButtonAllowed();
        textAreaView2.setDeleteAllButtonAllowed(isDeleteAllButtonAllowed != null ? isDeleteAllButtonAllowed.booleanValue() : true);
        widgetDsAtomsTextAreaBinding.textArea.setState(mapToTextAreaState(item.getTextAreaParams().getState()));
        widgetDsAtomsTextAreaBinding.textArea.setStatus(mapToTextAreaStatus(item.getTextAreaParams().getStatus()));
        TextAreaView textAreaView3 = widgetDsAtomsTextAreaBinding.textArea;
        Boolean hasBottomBar = item.getTextAreaParams().getHasBottomBar();
        textAreaView3.setHasBottomBar(hasBottomBar != null ? hasBottomBar.booleanValue() : false);
        widgetDsAtomsTextAreaBinding.textArea.setInputText(item.getTextAreaParams().getValue());
        widgetDsAtomsTextAreaBinding.textArea.setLabel(item.getTextAreaParams().getLabel());
        widgetDsAtomsTextAreaBinding.textArea.setCaption(item.getTextAreaParams().getCaption());
        TextAreaView textAreaView4 = widgetDsAtomsTextAreaBinding.textArea;
        StyleParser styleParser = StyleParser.INSTANCE;
        textAreaView4.setCaptionColor(styleParser.parseColor(getContext(), item.getTextAreaParams().getCaptionColor()));
        TextAreaView textAreaView5 = widgetDsAtomsTextAreaBinding.textArea;
        Boolean isCaptionTagSupported = item.getTextAreaParams().isCaptionTagSupported();
        textAreaView5.setCaptionTagSupported(isCaptionTagSupported != null ? isCaptionTagSupported.booleanValue() : false);
        TextAreaView textAreaView6 = widgetDsAtomsTextAreaBinding.textArea;
        Integer captionNumberOfLines = item.getTextAreaParams().getCaptionNumberOfLines();
        textAreaView6.setCaptionMaxLines(captionNumberOfLines != null ? captionNumberOfLines.intValue() : 3);
        TextAreaView textAreaView7 = widgetDsAtomsTextAreaBinding.textArea;
        Boolean hasCounter = item.getTextAreaParams().getHasCounter();
        textAreaView7.setHasCounter(hasCounter != null ? hasCounter.booleanValue() : false);
        TextAreaView textAreaView8 = widgetDsAtomsTextAreaBinding.textArea;
        Integer maxCounter = item.getTextAreaParams().getMaxCounter();
        textAreaView8.setMaxLength(maxCounter != null ? maxCounter.intValue() : CounterView.COUNTER_MAX_DEFAULT);
        TextAreaView textAreaView9 = widgetDsAtomsTextAreaBinding.textArea;
        Boolean hasScrollBar = item.getTextAreaParams().getHasScrollBar();
        textAreaView9.setScrollbarEnabled(hasScrollBar != null ? hasScrollBar.booleanValue() : false);
        widgetDsAtomsTextAreaBinding.textArea.setCurrentCountColor(styleParser.parseColor(getContext(), item.getTextAreaParams().getCurrentCounterColor()));
        DesignSystemAtomsDTO.Type textAreaType = item.getTextAreaParams().getTextAreaType();
        int i11 = textAreaType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[textAreaType.ordinal()];
        if (i11 == -1 || i11 == 1) {
            TextAreaView textAreaView10 = widgetDsAtomsTextAreaBinding.textArea;
            Integer rows = item.getTextAreaParams().getRows();
            textAreaView10.setMinLines(rows != null ? rows.intValue() : 1);
            widgetDsAtomsTextAreaBinding.textArea.setMaxLines(15);
            return;
        }
        if (i11 != 2) {
            throw new o();
        }
        TextAreaView textAreaView11 = widgetDsAtomsTextAreaBinding.textArea;
        Integer rows2 = item.getTextAreaParams().getRows();
        textAreaView11.setMinLines(rows2 != null ? rows2.intValue() : 1);
        TextAreaView textAreaView12 = widgetDsAtomsTextAreaBinding.textArea;
        Integer rows3 = item.getTextAreaParams().getRows();
        textAreaView12.setMaxLines(rows3 != null ? rows3.intValue() : 15);
    }
}
