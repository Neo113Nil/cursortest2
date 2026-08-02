package ru.ozon.app.android.returns.ui.molecules.textarea.v2.viewObject;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/textarea/v2/viewObject/RmsTextAreaV2VO;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "label", "caption", "captionColorToken", "", "minRows", "maxRows", "Lru/ozon/uni/android/textArea/TextAreaView$Status;", "status", "", "hasCounter", "maxCounterValue", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILru/ozon/uni/android/textArea/TextAreaView$Status;ZILru/ozon/uni/atoms/data/TestInfo;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getLabel", "getCaption", "getCaptionColorToken", "I", "getMinRows", "()I", "getMaxRows", "Lru/ozon/uni/android/textArea/TextAreaView$Status;", "getStatus", "()Lru/ozon/uni/android/textArea/TextAreaView$Status;", "Z", "getHasCounter", "()Z", "getMaxCounterValue", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RmsTextAreaV2VO {
    private final String caption;

    @NotNull
    private final String captionColorToken;
    private final boolean hasCounter;
    private final String label;
    private final int maxCounterValue;
    private final int maxRows;
    private final int minRows;

    @NotNull
    private final TextAreaView.Status status;
    private final TestInfo testInfo;
    private final String value;

    public RmsTextAreaV2VO(String str, String str2, String str3, @NotNull String captionColorToken, int i11, int i12, @NotNull TextAreaView.Status status, boolean z11, int i13, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(captionColorToken, "captionColorToken");
        Intrinsics.checkNotNullParameter(status, "status");
        this.value = str;
        this.label = str2;
        this.caption = str3;
        this.captionColorToken = captionColorToken;
        this.minRows = i11;
        this.maxRows = i12;
        this.status = status;
        this.hasCounter = z11;
        this.maxCounterValue = i13;
        this.testInfo = testInfo;
    }

    public final String getCaption() {
        return this.caption;
    }

    @NotNull
    public final String getCaptionColorToken() {
        return this.captionColorToken;
    }

    public final boolean getHasCounter() {
        return this.hasCounter;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMaxCounterValue() {
        return this.maxCounterValue;
    }

    public final int getMaxRows() {
        return this.maxRows;
    }

    public final int getMinRows() {
        return this.minRows;
    }

    @NotNull
    public final TextAreaView.Status getStatus() {
        return this.status;
    }

    public final String getValue() {
        return this.value;
    }
}
