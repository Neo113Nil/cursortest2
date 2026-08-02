package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SubmitReason;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REVIEW_BUTTON", "REVIEW_BACK", "REVIEW_CLOSE", "REVIEW_SHEET", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubmitReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SubmitReason[] $VALUES;

    @NotNull
    private final String value;
    public static final SubmitReason REVIEW_BUTTON = new SubmitReason("REVIEW_BUTTON", 0, "add_review_button");
    public static final SubmitReason REVIEW_BACK = new SubmitReason("REVIEW_BACK", 1, "add_review_back");
    public static final SubmitReason REVIEW_CLOSE = new SubmitReason("REVIEW_CLOSE", 2, "add_review_close_app");
    public static final SubmitReason REVIEW_SHEET = new SubmitReason("REVIEW_SHEET", 3, "add_review_from_sheet");

    private static final /* synthetic */ SubmitReason[] $values() {
        return new SubmitReason[]{REVIEW_BUTTON, REVIEW_BACK, REVIEW_CLOSE, REVIEW_SHEET};
    }

    static {
        SubmitReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SubmitReason(String str, int i11, String str2) {
        this.value = str2;
    }

    public static SubmitReason valueOf(String str) {
        return (SubmitReason) Enum.valueOf(SubmitReason.class, str);
    }

    public static SubmitReason[] values() {
        return (SubmitReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
