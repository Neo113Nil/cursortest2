package spay.sdk.domain.model;

import I0.C3173b;
import Lf.a;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lspay/sdk/domain/model/BiometricSuggestionModel;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "message", "positiveButtonText", "negativeButtonText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getNegativeButtonText", "getPositiveButtonText", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BiometricSuggestionModel {

    @NotNull
    private final String message;

    @NotNull
    private final String negativeButtonText;

    @NotNull
    private final String positiveButtonText;

    @NotNull
    private final String title;

    public BiometricSuggestionModel(@NotNull String title, @NotNull String message, @NotNull String positiveButtonText, @NotNull String negativeButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        this.title = title;
        this.message = message;
        this.positiveButtonText = positiveButtonText;
        this.negativeButtonText = negativeButtonText;
    }

    public static /* synthetic */ BiometricSuggestionModel copy$default(BiometricSuggestionModel biometricSuggestionModel, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = biometricSuggestionModel.title;
        }
        if ((i11 & 2) != 0) {
            str2 = biometricSuggestionModel.message;
        }
        if ((i11 & 4) != 0) {
            str3 = biometricSuggestionModel.positiveButtonText;
        }
        if ((i11 & 8) != 0) {
            str4 = biometricSuggestionModel.negativeButtonText;
        }
        return biometricSuggestionModel.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    @NotNull
    public final BiometricSuggestionModel copy(@NotNull String title, @NotNull String message, @NotNull String positiveButtonText, @NotNull String negativeButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        return new BiometricSuggestionModel(title, message, positiveButtonText, negativeButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricSuggestionModel)) {
            return false;
        }
        BiometricSuggestionModel biometricSuggestionModel = (BiometricSuggestionModel) other;
        return Intrinsics.d(this.title, biometricSuggestionModel.title) && Intrinsics.d(this.message, biometricSuggestionModel.message) && Intrinsics.d(this.positiveButtonText, biometricSuggestionModel.positiveButtonText) && Intrinsics.d(this.negativeButtonText, biometricSuggestionModel.negativeButtonText);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    @NotNull
    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.negativeButtonText.hashCode() + a.b0(a.b0(this.title.hashCode() * 31, this.message), this.positiveButtonText);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.message;
        return C3173b.c(C3660k.d("BiometricSuggestionModel(title=", str, ", message=", str2, ", positiveButtonText="), this.positiveButtonText, ", negativeButtonText=", this.negativeButtonText, ")");
    }
}
