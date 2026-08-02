package ru.ozon.app.android.returns.ui.data.components;

import B0.C2454a;
import K1.G;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001*BI\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\u0004\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006+"}, d2 = {"Lru/ozon/app/android/returns/ui/data/components/RmsInputDto;", "Lru/ozon/app/android/returns/ui/data/components/Component;", "", "", "isRequired", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "maxLength", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/app/android/returns/ui/data/components/RmsInputDto$InputType;", "inputType", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/returns/ui/data/components/RmsInputDto$InputType;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()Lru/ozon/app/android/returns/ui/data/components/RmsInputDto$InputType;", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/returns/ui/data/components/RmsInputDto$InputType;)Lru/ozon/app/android/returns/ui/data/components/RmsInputDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getName", "getValue", "Ljava/lang/Integer;", "getMaxLength", "getPlaceholder", "Lru/ozon/app/android/returns/ui/data/components/RmsInputDto$InputType;", "getInputType", "InputType", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RmsInputDto implements Component {

    @NotNull
    private final InputType inputType;
    private final boolean isRequired;
    private final Integer maxLength;
    private final String name;
    private final String placeholder;
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/returns/ui/data/components/RmsInputDto$InputType;", "", "<init>", "(Ljava/lang/String;I)V", "NUMBER", "FILE", "TEXT", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;

        @i(name = "number")
        public static final InputType NUMBER = new InputType("NUMBER", 0);

        @i(name = "file")
        public static final InputType FILE = new InputType("FILE", 1);

        @i(name = "text")
        public static final InputType TEXT = new InputType("TEXT", 2);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{NUMBER, FILE, TEXT};
        }

        static {
            InputType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private InputType(String str, int i11) {
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    public RmsInputDto(boolean z11, String str, @i(name = "value") String str2, @i(name = "maxLength") Integer num, @i(name = "placeholder") String str3, @i(name = "type") @NotNull InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        this.isRequired = z11;
        this.name = str;
        this.value = str2;
        this.maxLength = num;
        this.placeholder = str3;
        this.inputType = inputType;
    }

    public static /* synthetic */ RmsInputDto copy$default(RmsInputDto rmsInputDto, boolean z11, String str, String str2, Integer num, String str3, InputType inputType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = rmsInputDto.isRequired;
        }
        if ((i11 & 2) != 0) {
            str = rmsInputDto.name;
        }
        if ((i11 & 4) != 0) {
            str2 = rmsInputDto.value;
        }
        if ((i11 & 8) != 0) {
            num = rmsInputDto.maxLength;
        }
        if ((i11 & 16) != 0) {
            str3 = rmsInputDto.placeholder;
        }
        if ((i11 & 32) != 0) {
            inputType = rmsInputDto.inputType;
        }
        String str4 = str3;
        InputType inputType2 = inputType;
        return rmsInputDto.copy(z11, str, str2, num, str4, inputType2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final InputType getInputType() {
        return this.inputType;
    }

    @NotNull
    public final RmsInputDto copy(boolean isRequired, String name, @i(name = "value") String value, @i(name = "maxLength") Integer maxLength, @i(name = "placeholder") String placeholder, @i(name = "type") @NotNull InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        return new RmsInputDto(isRequired, name, value, maxLength, placeholder, inputType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RmsInputDto)) {
            return false;
        }
        RmsInputDto rmsInputDto = (RmsInputDto) other;
        return this.isRequired == rmsInputDto.isRequired && Intrinsics.d(this.name, rmsInputDto.name) && Intrinsics.d(this.value, rmsInputDto.value) && Intrinsics.d(this.maxLength, rmsInputDto.maxLength) && Intrinsics.d(this.placeholder, rmsInputDto.placeholder) && this.inputType == rmsInputDto.inputType;
    }

    @NotNull
    public final InputType getInputType() {
        return this.inputType;
    }

    public Integer getMaxLength() {
        return this.maxLength;
    }

    @Override // ru.ozon.app.android.returns.ui.data.components.Component
    public String getName() {
        return this.name;
    }

    public String getPlaceholder() {
        return this.placeholder;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isRequired) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.maxLength;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.placeholder;
        return this.inputType.hashCode() + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // ru.ozon.app.android.returns.ui.data.components.Component
    public boolean isRequired() {
        return this.isRequired;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isRequired;
        String str = this.name;
        String str2 = this.value;
        Integer num = this.maxLength;
        String str3 = this.placeholder;
        InputType inputType = this.inputType;
        StringBuilder d11 = G.d("RmsInputDto(isRequired=", ", name=", str, ", value=", z11);
        C2454a.f(num, str2, ", maxLength=", ", placeholder=", d11);
        d11.append(str3);
        d11.append(", inputType=");
        d11.append(inputType);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ RmsInputDto(boolean z11, String str, String str2, Integer num, String str3, InputType inputType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, str, str2, num, str3, inputType);
    }
}
