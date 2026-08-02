package ru.ozon.fintech.features.camera.domain.analytic;

import B0.A0;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g30.InterfaceC6618a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.camera.scanners.api.DetectedData;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0004,-./B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR*\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, d2 = {"Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic;", "", "Lg30/a;", "fintechAnalyticInteractor", "<init>", "(Lg30/a;)V", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;", "workingMode", "", "sendResult", "(Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;)V", "Lg30/a;", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "statusType", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType;", "getStatusType", "()Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType;", "setStatusType", "(Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType;)V", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$SourceType;", "sourceType", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$SourceType;", "getSourceType", "()Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$SourceType;", "setSourceType", "(Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$SourceType;)V", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$AnalyserType;", "analyserType", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$AnalyserType;", "getAnalyserType", "()Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$AnalyserType;", "setAnalyserType", "(Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$AnalyserType;)V", "Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "qrData", "Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "getQrData", "()Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "setQrData", "(Lru/ozon/fintech/features/camera/scanners/api/DetectedData;)V", "", "startTime", "J", "Companion", "SourceType", "StatusType", "AnalyserType", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrScannerAnalytic {
    private static final long FLUCTUATION_LIMIT = 2000;

    @NotNull
    private AnalyserType analyserType;

    @NotNull
    private final InterfaceC6618a fintechAnalyticInteractor;
    private DetectedData qrData;

    @NotNull
    private SourceType sourceType;
    private long startTime;

    @NotNull
    private StatusType statusType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$AnalyserType;", "", "code", "", "enabled", "", "<init>", "(Ljava/lang/String;IIZ)V", "getCode", "()I", "getEnabled", "()Z", "NONE", "MLKIT", "SALUTE", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnalyserType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AnalyserType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final int code;
        private final boolean enabled;
        public static final AnalyserType NONE = new AnalyserType("NONE", 0, 0, false);
        public static final AnalyserType MLKIT = new AnalyserType("MLKIT", 1, 1, true);
        public static final AnalyserType SALUTE = new AnalyserType("SALUTE", 2, 2, false);

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$AnalyserType$Companion;", "", "<init>", "()V", "provideAvailable", "", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int provideAvailable() {
                a<AnalyserType> entries = AnalyserType.getEntries();
                ArrayList arrayList = new ArrayList();
                for (Object obj : entries) {
                    if (((AnalyserType) obj).getEnabled()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((AnalyserType) it.next()).getCode()));
                }
                int i11 = 0;
                if (!arrayList2.isEmpty()) {
                    ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                    while (listIterator.hasPrevious()) {
                        i11 |= ((Number) listIterator.previous()).intValue();
                    }
                }
                return i11;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ AnalyserType[] $values() {
            return new AnalyserType[]{NONE, MLKIT, SALUTE};
        }

        static {
            AnalyserType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
        }

        private AnalyserType(String str, int i11, int i12, boolean z11) {
            this.code = i12;
            this.enabled = z11;
        }

        @NotNull
        public static a<AnalyserType> getEntries() {
            return $ENTRIES;
        }

        public static AnalyserType valueOf(String str) {
            return (AnalyserType) Enum.valueOf(AnalyserType.class, str);
        }

        public static AnalyserType[] values() {
            return (AnalyserType[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$SourceType;", "", "<init>", "(Ljava/lang/String;I)V", "VIDEO", "IMAGE", "NONE", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SourceType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SourceType[] $VALUES;
        public static final SourceType VIDEO = new SourceType("VIDEO", 0);
        public static final SourceType IMAGE = new SourceType("IMAGE", 1);
        public static final SourceType NONE = new SourceType("NONE", 2);

        private static final /* synthetic */ SourceType[] $values() {
            return new SourceType[]{VIDEO, IMAGE, NONE};
        }

        static {
            SourceType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SourceType(String str, int i11) {
        }

        @NotNull
        public static a<SourceType> getEntries() {
            return $ENTRIES;
        }

        public static SourceType valueOf(String str) {
            return (SourceType) Enum.valueOf(SourceType.class, str);
        }

        public static SourceType[] values() {
            return (SourceType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType;", "", "<init>", "()V", "FAIL", "SUCCESS", "ERROR", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType$ERROR;", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType$FAIL;", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType$SUCCESS;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class StatusType {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType$ERROR;", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType;", "description", "", "<init>", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ERROR extends StatusType {

            @NotNull
            private final String description;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ERROR(@NotNull String description) {
                super(null);
                Intrinsics.checkNotNullParameter(description, "description");
                this.description = description;
            }

            public static /* synthetic */ ERROR copy$default(ERROR error, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = error.description;
                }
                return error.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final ERROR copy(@NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new ERROR(description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ERROR) && Intrinsics.d(this.description, ((ERROR) other).description);
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            public int hashCode() {
                return this.description.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("ERROR(description=", this.description, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType$FAIL;", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FAIL extends StatusType {

            @NotNull
            public static final FAIL INSTANCE = new FAIL();

            private FAIL() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof FAIL);
            }

            public int hashCode() {
                return -1651624569;
            }

            @NotNull
            public String toString() {
                return "FAIL";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType$SUCCESS;", "Lru/ozon/fintech/features/camera/domain/analytic/QrScannerAnalytic$StatusType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SUCCESS extends StatusType {

            @NotNull
            public static final SUCCESS INSTANCE = new SUCCESS();

            private SUCCESS() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SUCCESS);
            }

            public int hashCode() {
                return -1182703398;
            }

            @NotNull
            public String toString() {
                return "SUCCESS";
            }
        }

        public /* synthetic */ StatusType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StatusType() {
        }
    }

    public QrScannerAnalytic(@NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.fintechAnalyticInteractor = fintechAnalyticInteractor;
        this.statusType = StatusType.FAIL.INSTANCE;
        this.sourceType = SourceType.NONE;
        this.analyserType = AnalyserType.NONE;
        this.startTime = System.currentTimeMillis();
    }

    @NotNull
    public final AnalyserType getAnalyserType() {
        return this.analyserType;
    }

    public final DetectedData getQrData() {
        return this.qrData;
    }

    @NotNull
    public final SourceType getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final StatusType getStatusType() {
        return this.statusType;
    }

    public final void sendResult(@NotNull CameraFragment.WorkingMode workingMode) {
        Intrinsics.checkNotNullParameter(workingMode, "workingMode");
        long currentTimeMillis = System.currentTimeMillis() - this.startTime;
        if (currentTimeMillis >= FLUCTUATION_LIMIT || !Intrinsics.d(this.statusType, StatusType.FAIL.INSTANCE)) {
            InterfaceC6618a interfaceC6618a = this.fintechAnalyticInteractor;
            String name = this.sourceType.name();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int code = this.analyserType.getCode();
            String lowerCase2 = this.analyserType.name().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            int provideAvailable = AnalyserType.INSTANCE.provideAvailable();
            StatusType statusType = this.statusType;
            boolean z11 = statusType instanceof StatusType.SUCCESS;
            boolean z12 = statusType instanceof StatusType.ERROR;
            boolean z13 = statusType instanceof StatusType.FAIL;
            StatusType.ERROR error = z12 ? (StatusType.ERROR) statusType : null;
            String description = error != null ? error.getDescription() : null;
            String name2 = workingMode.name();
            DetectedData detectedData = this.qrData;
            String qrString = detectedData != null ? detectedData.getQrString() : null;
            DetectedData detectedData2 = this.qrData;
            interfaceC6618a.Y1(currentTimeMillis, lowerCase, code, lowerCase2, provideAvailable, z11, z12, z13, description, name2, qrString, detectedData2 != null ? detectedData2.getRawDataBase64() : null);
        }
    }

    public final void setAnalyserType(@NotNull AnalyserType analyserType) {
        Intrinsics.checkNotNullParameter(analyserType, "<set-?>");
        this.analyserType = analyserType;
    }

    public final void setQrData(DetectedData detectedData) {
        this.qrData = detectedData;
    }

    public final void setSourceType(@NotNull SourceType sourceType) {
        Intrinsics.checkNotNullParameter(sourceType, "<set-?>");
        this.sourceType = sourceType;
    }

    public final void setStatusType(@NotNull StatusType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.statusType = value;
    }
}
