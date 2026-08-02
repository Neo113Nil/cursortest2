package ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainUpdate;", "", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "status", "", "message", "Lru/ozon/uni/core/UniColors;", "messageColor", "dataText", "<init>", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;Ljava/lang/String;Lru/ozon/uni/core/UniColors;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "getStatus", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "Ljava/lang/String;", "getMessage", "Lru/ozon/uni/core/UniColors;", "getMessageColor", "()Lru/ozon/uni/core/UniColors;", "getDataText", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputCurtainUpdate {

    @NotNull
    private final String dataText;

    @NotNull
    private final String message;

    @NotNull
    private final UniColors messageColor;

    @NotNull
    private final OzonTextInputLayoutModel.Status status;

    public InputCurtainUpdate(@NotNull OzonTextInputLayoutModel.Status status, @NotNull String message, @NotNull UniColors messageColor, @NotNull String dataText) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageColor, "messageColor");
        Intrinsics.checkNotNullParameter(dataText, "dataText");
        this.status = status;
        this.message = message;
        this.messageColor = messageColor;
        this.dataText = dataText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCurtainUpdate)) {
            return false;
        }
        InputCurtainUpdate inputCurtainUpdate = (InputCurtainUpdate) other;
        return this.status == inputCurtainUpdate.status && Intrinsics.d(this.message, inputCurtainUpdate.message) && this.messageColor == inputCurtainUpdate.messageColor && Intrinsics.d(this.dataText, inputCurtainUpdate.dataText);
    }

    @NotNull
    public final String getDataText() {
        return this.dataText;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final UniColors getMessageColor() {
        return this.messageColor;
    }

    @NotNull
    public final OzonTextInputLayoutModel.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.dataText.hashCode() + ((this.messageColor.hashCode() + g.a(this.status.hashCode() * 31, 31, this.message)) * 31);
    }

    @NotNull
    public String toString() {
        return "InputCurtainUpdate(status=" + this.status + ", message=" + this.message + ", messageColor=" + this.messageColor + ", dataText=" + this.dataText + ")";
    }
}
