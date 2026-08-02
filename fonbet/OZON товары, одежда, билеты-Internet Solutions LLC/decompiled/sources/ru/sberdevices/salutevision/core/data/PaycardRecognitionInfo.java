package ru.sberdevices.salutevision.core.data;

import B3.D;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lru/sberdevices/salutevision/core/data/PaycardRecognitionInfo;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "number", "", "date", AppMeasurementSdk.ConditionalUserProperty.NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getName", "getNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaycardRecognitionInfo implements SaluteVisionRecognition.Info {
    private final String date;
    private final String name;
    private final String number;

    public PaycardRecognitionInfo(String str, String str2, String str3) {
        this.number = str;
        this.date = str2;
        this.name = str3;
    }

    public static /* synthetic */ PaycardRecognitionInfo copy$default(PaycardRecognitionInfo paycardRecognitionInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paycardRecognitionInfo.number;
        }
        if ((i11 & 2) != 0) {
            str2 = paycardRecognitionInfo.date;
        }
        if ((i11 & 4) != 0) {
            str3 = paycardRecognitionInfo.name;
        }
        return paycardRecognitionInfo.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final PaycardRecognitionInfo copy(String number, String date, String name) {
        return new PaycardRecognitionInfo(number, date, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaycardRecognitionInfo)) {
            return false;
        }
        PaycardRecognitionInfo paycardRecognitionInfo = (PaycardRecognitionInfo) other;
        return Intrinsics.d(this.number, paycardRecognitionInfo.number) && Intrinsics.d(this.date, paycardRecognitionInfo.date) && Intrinsics.d(this.name, paycardRecognitionInfo.name);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        String str = this.number;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.date;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaycardRecognitionInfo(number=");
        sb2.append(this.number);
        sb2.append(", date=");
        sb2.append(this.date);
        sb2.append(", name=");
        return D.c(sb2, this.name, ')');
    }
}
