package ru.ozon.app.android.returns.ui.molecules.textarea.v2.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0001$Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/textarea/v2/data/RmsTextAreaV2Dto;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "label", "caption", "captionColorToken", "minRows", "", "maxRows", "status", "Lru/ozon/app/android/returns/ui/molecules/textarea/v2/data/RmsTextAreaV2Dto$Status;", "hasCounter", "", "maxCounterValue", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/returns/ui/molecules/textarea/v2/data/RmsTextAreaV2Dto$Status;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/TestInfo;)V", "getValue", "()Ljava/lang/String;", "getLabel", "getCaption", "getCaptionColorToken", "getMinRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxRows", "getStatus", "()Lru/ozon/app/android/returns/ui/molecules/textarea/v2/data/RmsTextAreaV2Dto$Status;", "getHasCounter", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxCounterValue", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Status", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RmsTextAreaV2Dto {
    private final String caption;
    private final String captionColorToken;
    private final Boolean hasCounter;
    private final String label;
    private final Integer maxCounterValue;
    private final Integer maxRows;
    private final Integer minRows;
    private final Status status;
    private final TestInfo testInfo;
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/textarea/v2/data/RmsTextAreaV2Dto$Status;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_NEUTRAL", "STATUS_SUCCESS", "STATUS_ERROR", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class Status {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status STATUS_NEUTRAL = new Status("STATUS_NEUTRAL", 0);
        public static final Status STATUS_SUCCESS = new Status("STATUS_SUCCESS", 1);
        public static final Status STATUS_ERROR = new Status("STATUS_ERROR", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{STATUS_NEUTRAL, STATUS_SUCCESS, STATUS_ERROR};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Status(String str, int i11) {
        }

        @NotNull
        public static a<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public RmsTextAreaV2Dto(String str, String str2, String str3, String str4, Integer num, Integer num2, Status status, Boolean bool, Integer num3, TestInfo testInfo) {
        this.value = str;
        this.label = str2;
        this.caption = str3;
        this.captionColorToken = str4;
        this.minRows = num;
        this.maxRows = num2;
        this.status = status;
        this.hasCounter = bool;
        this.maxCounterValue = num3;
        this.testInfo = testInfo;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getCaptionColorToken() {
        return this.captionColorToken;
    }

    public final Boolean getHasCounter() {
        return this.hasCounter;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getMaxCounterValue() {
        return this.maxCounterValue;
    }

    public final Integer getMaxRows() {
        return this.maxRows;
    }

    public final Integer getMinRows() {
        return this.minRows;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getValue() {
        return this.value;
    }
}
