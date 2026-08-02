package ru.ozon.uni.android.input.textinput.domain;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0003J\u000e\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0003J\u000e\u0010&\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0003J\u0016\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lru/ozon/uni/android/input/textinput/domain/OzonTextInputStateConfigurator;", "", "hasFocus", "", "stateListener", "Lkotlin/Function1;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel;", "", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "currentModel", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel;", "stateProvider", "Lru/ozon/uni/android/input/textinput/domain/StateProvider;", "onFocusChange", "onStyleChange", "style", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "onStateChanged", "state", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "onStatusChanged", "status", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "onLabelTextSetted", "text", "", "onInputTextSetted", "", "onSetKeyboardAction", "action", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "onSetKeyboardType", "type", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "canCopy", "flag", "canReset", "hasInfo", "hasPassword", "hidePassword", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OzonTextInputStateConfigurator {

    @NotNull
    private OzonTextInputLayoutModel currentModel;

    @NotNull
    private final StateProvider stateProvider;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OzonTextInputLayoutModel.State.values().length];
            try {
                iArr[OzonTextInputLayoutModel.State.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OzonTextInputLayoutModel.State.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OzonTextInputLayoutModel.State.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OzonTextInputStateConfigurator(boolean z11, @NotNull Function1<? super OzonTextInputUIModel, Unit> stateListener) {
        Intrinsics.checkNotNullParameter(stateListener, "stateListener");
        this.currentModel = new OzonTextInputLayoutModel(null, null, null, null, 0, null, z11, null, null, null, 959, null);
        this.stateProvider = new StateProvider(stateListener);
    }

    public final void canCopy(boolean flag) {
        OzonTextInputLayoutModel ozonTextInputLayoutModel = this.currentModel;
        OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(ozonTextInputLayoutModel, null, null, null, null, 0, null, false, null, null, OzonTextInputLayoutModel.ActionButtonConfig.copy$default(ozonTextInputLayoutModel.getActionButtonConfig(), flag, false, false, null, 14, null), 511, null);
        this.currentModel = copy$default;
        this.stateProvider.renderState(copy$default);
    }

    public final void canReset(boolean flag) {
        OzonTextInputLayoutModel ozonTextInputLayoutModel = this.currentModel;
        OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(ozonTextInputLayoutModel, null, null, null, null, 0, null, false, null, null, OzonTextInputLayoutModel.ActionButtonConfig.copy$default(ozonTextInputLayoutModel.getActionButtonConfig(), false, flag, false, null, 13, null), 511, null);
        this.currentModel = copy$default;
        this.stateProvider.renderState(copy$default);
    }

    public final void hasInfo(boolean flag) {
        OzonTextInputLayoutModel ozonTextInputLayoutModel = this.currentModel;
        OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(ozonTextInputLayoutModel, null, null, null, null, 0, null, false, null, null, OzonTextInputLayoutModel.ActionButtonConfig.copy$default(ozonTextInputLayoutModel.getActionButtonConfig(), false, false, flag, null, 11, null), 511, null);
        this.currentModel = copy$default;
        this.stateProvider.renderState(copy$default);
    }

    public final void hasPassword(boolean flag, boolean hidePassword) {
        OzonTextInputLayoutModel ozonTextInputLayoutModel = this.currentModel;
        OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(ozonTextInputLayoutModel, null, null, null, null, 0, null, false, null, null, OzonTextInputLayoutModel.ActionButtonConfig.copy$default(ozonTextInputLayoutModel.getActionButtonConfig(), false, false, false, this.currentModel.getActionButtonConfig().getPasswordConfig().copy(flag, hidePassword), 7, null), 511, null);
        this.currentModel = copy$default;
        this.stateProvider.renderState(copy$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFocusChange(boolean hasFocus) {
        OzonTextInputLayoutModel.Status status;
        if (this.currentModel.getStatus() == OzonTextInputLayoutModel.Status.READONLY || this.currentModel.getState() == OzonTextInputLayoutModel.State.DISABLED) {
            OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(this.currentModel, null, null, null, null, 0, null, false, null, null, null, 959, null);
            this.currentModel = copy$default;
            this.stateProvider.renderState(copy$default);
            return;
        }
        OzonTextInputLayoutModel.State state = null;
        if (this.currentModel.getStatus() != OzonTextInputLayoutModel.Status.ERROR) {
            OzonTextInputLayoutModel.Status status2 = this.currentModel.getStatus();
            status = OzonTextInputLayoutModel.Status.NEUTRAL;
            if (status2 != status) {
                if (this.currentModel.getStatus() == OzonTextInputLayoutModel.Status.SUCCESS && hasFocus) {
                    state = OzonTextInputLayoutModel.State.ACTIVE;
                } else {
                    status = null;
                }
                OzonTextInputLayoutModel ozonTextInputLayoutModel = this.currentModel;
                if (state == null) {
                    state = ozonTextInputLayoutModel.getState();
                }
                OzonTextInputLayoutModel.State state2 = state;
                if (status == null) {
                    status = this.currentModel.getStatus();
                }
                OzonTextInputLayoutModel copy$default2 = OzonTextInputLayoutModel.copy$default(ozonTextInputLayoutModel, null, state2, null, null, 0, status, hasFocus, null, null, null, 925, null);
                this.currentModel = copy$default2;
                this.stateProvider.renderState(copy$default2);
            }
        }
        status = null;
        state = hasFocus ? OzonTextInputLayoutModel.State.ACTIVE : OzonTextInputLayoutModel.State.DEFAULT;
        OzonTextInputLayoutModel ozonTextInputLayoutModel2 = this.currentModel;
        if (state == null) {
        }
        OzonTextInputLayoutModel.State state22 = state;
        if (status == null) {
        }
        OzonTextInputLayoutModel copy$default22 = OzonTextInputLayoutModel.copy$default(ozonTextInputLayoutModel2, null, state22, null, null, 0, status, hasFocus, null, null, null, 925, null);
        this.currentModel = copy$default22;
        this.stateProvider.renderState(copy$default22);
    }

    public final void onInputTextSetted(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(this.currentModel, null, null, null, null, 0, null, false, null, text, null, 767, null);
        this.currentModel = copy$default;
        this.stateProvider.renderState(copy$default);
    }

    public final void onLabelTextSetted(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(this.currentModel, null, null, null, null, 0, null, false, text, null, null, 895, null);
        this.currentModel = copy$default;
        this.stateProvider.renderState(copy$default);
    }

    public final void onSetKeyboardAction(@NotNull OzonTextInputLayoutModel.KeyboardAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(this.currentModel, null, null, null, action, 0, null, false, null, null, null, 1015, null);
        this.currentModel = copy$default;
        this.stateProvider.renderState(copy$default);
    }

    public final void onSetKeyboardType(@NotNull OzonTextInputLayoutModel.KeyboardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(this.currentModel, null, null, type, null, 0, null, false, null, null, null, 1019, null);
        this.currentModel = copy$default;
        this.stateProvider.renderState(copy$default);
    }

    public final void onStateChanged(@NotNull OzonTextInputLayoutModel.State state) {
        OzonTextInputLayoutModel.Status status;
        boolean z11;
        Intrinsics.checkNotNullParameter(state, "state");
        OzonTextInputLayoutModel.Status status2 = this.currentModel.getStatus();
        this.currentModel.getHasFocus();
        if (status2 == OzonTextInputLayoutModel.Status.READONLY) {
            status2 = OzonTextInputLayoutModel.Status.NEUTRAL;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                if (this.currentModel.getStatus() == OzonTextInputLayoutModel.Status.SUCCESS) {
                    status2 = OzonTextInputLayoutModel.Status.NEUTRAL;
                }
                status = status2;
                z11 = true;
                OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(this.currentModel, null, state, null, null, 0, status, z11, null, null, null, 925, null);
                this.currentModel = copy$default;
                this.stateProvider.renderState(copy$default);
            }
            if (i11 != 3) {
                throw new o();
            }
            status2 = OzonTextInputLayoutModel.Status.NEUTRAL;
        }
        status = status2;
        z11 = false;
        OzonTextInputLayoutModel copy$default2 = OzonTextInputLayoutModel.copy$default(this.currentModel, null, state, null, null, 0, status, z11, null, null, null, 925, null);
        this.currentModel = copy$default2;
        this.stateProvider.renderState(copy$default2);
    }

    public final void onStatusChanged(@NotNull OzonTextInputLayoutModel.Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        OzonTextInputLayoutModel.State state = this.currentModel.getState();
        boolean hasFocus = this.currentModel.getHasFocus();
        if (state == OzonTextInputLayoutModel.State.DISABLED) {
            state = OzonTextInputLayoutModel.State.DEFAULT;
        }
        if (status == OzonTextInputLayoutModel.Status.SUCCESS) {
            state = OzonTextInputLayoutModel.State.DEFAULT;
        } else if (status == OzonTextInputLayoutModel.Status.READONLY) {
            state = OzonTextInputLayoutModel.State.DEFAULT;
            hasFocus = false;
        }
        OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(this.currentModel, null, state, null, null, 0, status, hasFocus, null, null, null, 925, null);
        this.currentModel = copy$default;
        this.stateProvider.renderState(copy$default);
    }

    public final void onStyleChange(@NotNull TextInputStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        OzonTextInputLayoutModel copy$default = OzonTextInputLayoutModel.copy$default(this.currentModel, style, null, null, null, 0, null, false, null, null, null, 1022, null);
        this.currentModel = copy$default;
        this.stateProvider.renderState(copy$default);
    }
}
