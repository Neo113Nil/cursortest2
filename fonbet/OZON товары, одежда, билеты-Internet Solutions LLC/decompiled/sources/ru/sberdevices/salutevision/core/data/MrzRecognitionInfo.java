package ru.sberdevices.salutevision.core.data;

import B3.D;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/sberdevices/salutevision/core/data/MrzRecognitionInfo;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MrzRecognitionInfo implements SaluteVisionRecognition.Info {
    private final String text;

    public MrzRecognitionInfo(String str) {
        this.text = str;
    }

    public static /* synthetic */ MrzRecognitionInfo copy$default(MrzRecognitionInfo mrzRecognitionInfo, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mrzRecognitionInfo.text;
        }
        return mrzRecognitionInfo.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final MrzRecognitionInfo copy(String text) {
        return new MrzRecognitionInfo(text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MrzRecognitionInfo) && Intrinsics.d(this.text, ((MrzRecognitionInfo) other).text);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return D.c(new StringBuilder("MrzRecognitionInfo(text="), this.text, ')');
    }
}
