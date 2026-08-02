package ru.ozon.app.android.returns.ui.molecules.textarea.viewObject;

import C.o0;
import J0.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/TextAreaVO;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "maxLength", HammersV3BodyDTO.PLACEHOLDER, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/TextAreaVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "getPlaceholder", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TextAreaVO {
    private final Integer maxLength;
    private final String placeholder;
    private final String value;

    public TextAreaVO(String str, Integer num, String str2) {
        this.value = str;
        this.maxLength = num;
        this.placeholder = str2;
    }

    public static /* synthetic */ TextAreaVO copy$default(TextAreaVO textAreaVO, String str, Integer num, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textAreaVO.value;
        }
        if ((i11 & 2) != 0) {
            num = textAreaVO.maxLength;
        }
        if ((i11 & 4) != 0) {
            str2 = textAreaVO.placeholder;
        }
        return textAreaVO.copy(str, num, str2);
    }

    @NotNull
    public final TextAreaVO copy(String value, Integer maxLength, String placeholder) {
        return new TextAreaVO(value, maxLength, placeholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAreaVO)) {
            return false;
        }
        TextAreaVO textAreaVO = (TextAreaVO) other;
        return Intrinsics.d(this.value, textAreaVO.value) && Intrinsics.d(this.maxLength, textAreaVO.maxLength) && Intrinsics.d(this.placeholder, textAreaVO.placeholder);
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.maxLength;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.placeholder;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        Integer num = this.maxLength;
        return o0.c(P.b("TextAreaVO(value=", str, num, ", maxLength=", ", placeholder="), this.placeholder, ")");
    }
}
