package ru.ozon.app.android.session.editCredential.newCredentials.data;

import C.o0;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/data/InputDTO;", "", "type", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.NAME, "caption", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getValue", "getPlaceholder", "getName", "getCaption", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InputDTO {
    public static final int $stable = 0;
    private final String caption;
    private final String name;
    private final String placeholder;

    @NotNull
    private final String type;
    private final String value;

    public InputDTO(@NotNull String type, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.value = str;
        this.placeholder = str2;
        this.name = str3;
        this.caption = str4;
    }

    public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputDTO.type;
        }
        if ((i11 & 2) != 0) {
            str2 = inputDTO.value;
        }
        if ((i11 & 4) != 0) {
            str3 = inputDTO.placeholder;
        }
        if ((i11 & 8) != 0) {
            str4 = inputDTO.name;
        }
        if ((i11 & 16) != 0) {
            str5 = inputDTO.caption;
        }
        String str6 = str5;
        String str7 = str3;
        return inputDTO.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    @NotNull
    public final InputDTO copy(@NotNull String type, String value, String placeholder, String name, String caption) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new InputDTO(type, value, placeholder, name, caption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputDTO)) {
            return false;
        }
        InputDTO inputDTO = (InputDTO) other;
        return Intrinsics.d(this.type, inputDTO.type) && Intrinsics.d(this.value, inputDTO.value) && Intrinsics.d(this.placeholder, inputDTO.placeholder) && Intrinsics.d(this.name, inputDTO.name) && Intrinsics.d(this.caption, inputDTO.caption);
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.caption;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.value;
        String str3 = this.placeholder;
        String str4 = this.name;
        String str5 = this.caption;
        StringBuilder d11 = C3660k.d("InputDTO(type=", str, ", value=", str2, ", placeholder=");
        a.h(d11, str3, ", name=", str4, ", caption=");
        return o0.c(d11, str5, ")");
    }
}
