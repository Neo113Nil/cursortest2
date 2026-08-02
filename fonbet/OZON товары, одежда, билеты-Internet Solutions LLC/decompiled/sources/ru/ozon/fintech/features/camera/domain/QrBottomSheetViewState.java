package ru.ozon.fintech.features.camera.domain;

import C.o0;
import G.g;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/camera/domain/QrBottomSheetViewState;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "negativeBtnText", "positiveBtnText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getNegativeBtnText", "getPositiveBtnText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrBottomSheetViewState {

    @NotNull
    private final String negativeBtnText;

    @NotNull
    private final String positiveBtnText;

    @NotNull
    private final String title;

    public QrBottomSheetViewState(@NotNull String title, @NotNull String negativeBtnText, @NotNull String positiveBtnText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(negativeBtnText, "negativeBtnText");
        Intrinsics.checkNotNullParameter(positiveBtnText, "positiveBtnText");
        this.title = title;
        this.negativeBtnText = negativeBtnText;
        this.positiveBtnText = positiveBtnText;
    }

    public static /* synthetic */ QrBottomSheetViewState copy$default(QrBottomSheetViewState qrBottomSheetViewState, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = qrBottomSheetViewState.title;
        }
        if ((i11 & 2) != 0) {
            str2 = qrBottomSheetViewState.negativeBtnText;
        }
        if ((i11 & 4) != 0) {
            str3 = qrBottomSheetViewState.positiveBtnText;
        }
        return qrBottomSheetViewState.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNegativeBtnText() {
        return this.negativeBtnText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPositiveBtnText() {
        return this.positiveBtnText;
    }

    @NotNull
    public final QrBottomSheetViewState copy(@NotNull String title, @NotNull String negativeBtnText, @NotNull String positiveBtnText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(negativeBtnText, "negativeBtnText");
        Intrinsics.checkNotNullParameter(positiveBtnText, "positiveBtnText");
        return new QrBottomSheetViewState(title, negativeBtnText, positiveBtnText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrBottomSheetViewState)) {
            return false;
        }
        QrBottomSheetViewState qrBottomSheetViewState = (QrBottomSheetViewState) other;
        return Intrinsics.d(this.title, qrBottomSheetViewState.title) && Intrinsics.d(this.negativeBtnText, qrBottomSheetViewState.negativeBtnText) && Intrinsics.d(this.positiveBtnText, qrBottomSheetViewState.positiveBtnText);
    }

    @NotNull
    public final String getNegativeBtnText() {
        return this.negativeBtnText;
    }

    @NotNull
    public final String getPositiveBtnText() {
        return this.positiveBtnText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.positiveBtnText.hashCode() + g.a(this.title.hashCode() * 31, 31, this.negativeBtnText);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.negativeBtnText;
        return o0.c(C3660k.d("QrBottomSheetViewState(title=", str, ", negativeBtnText=", str2, ", positiveBtnText="), this.positiveBtnText, ")");
    }
}
