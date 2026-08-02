package ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormTextUpdate;", "LA00/a$J$a;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "message", "", "text", "<init>", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "getMessage", "()Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "Ljava/lang/String;", "getText", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InputFormTextUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final ComposerActionWithActionDTO.MessageDTO message;

    @NotNull
    private final String text;

    public InputFormTextUpdate(@NotNull ComposerActionWithActionDTO.MessageDTO message, @NotNull String text) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(text, "text");
        this.message = message;
        this.text = text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFormTextUpdate)) {
            return false;
        }
        InputFormTextUpdate inputFormTextUpdate = (InputFormTextUpdate) other;
        return Intrinsics.d(this.message, inputFormTextUpdate.message) && Intrinsics.d(this.text, inputFormTextUpdate.text);
    }

    @NotNull
    public final ComposerActionWithActionDTO.MessageDTO getMessage() {
        return this.message;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.message.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "InputFormTextUpdate(message=" + this.message + ", text=" + this.text + ")";
    }
}
