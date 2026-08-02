package ru.ozon.app.android.partpayment.landing.limit.data;

import G.g;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Ji\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/data/FormPageLandingLimitDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "hint", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.NAME, "validationBtn", "validationURL", "description", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getHint", "getValue", "getName", "getValidationBtn", "getValidationURL", "getDescription", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FormPageLandingLimitDTO {

    @NotNull
    private final OzonSpannableString description;

    @NotNull
    private final String hint;

    @NotNull
    private final String name;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String validationBtn;

    @NotNull
    private final String validationURL;
    private final String value;

    public FormPageLandingLimitDTO(@NotNull String title, @NotNull String hint, String str, @NotNull String name, @NotNull String validationBtn, @NotNull String validationURL, @NotNull OzonSpannableString description, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(validationBtn, "validationBtn");
        Intrinsics.checkNotNullParameter(validationURL, "validationURL");
        Intrinsics.checkNotNullParameter(description, "description");
        this.title = title;
        this.hint = hint;
        this.value = str;
        this.name = name;
        this.validationBtn = validationBtn;
        this.validationURL = validationURL;
        this.description = description;
        this.trackingInfo = map;
    }

    public static /* synthetic */ FormPageLandingLimitDTO copy$default(FormPageLandingLimitDTO formPageLandingLimitDTO, String str, String str2, String str3, String str4, String str5, String str6, OzonSpannableString ozonSpannableString, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = formPageLandingLimitDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = formPageLandingLimitDTO.hint;
        }
        if ((i11 & 4) != 0) {
            str3 = formPageLandingLimitDTO.value;
        }
        if ((i11 & 8) != 0) {
            str4 = formPageLandingLimitDTO.name;
        }
        if ((i11 & 16) != 0) {
            str5 = formPageLandingLimitDTO.validationBtn;
        }
        if ((i11 & 32) != 0) {
            str6 = formPageLandingLimitDTO.validationURL;
        }
        if ((i11 & 64) != 0) {
            ozonSpannableString = formPageLandingLimitDTO.description;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = formPageLandingLimitDTO.trackingInfo;
        }
        OzonSpannableString ozonSpannableString2 = ozonSpannableString;
        Map map2 = map;
        String str7 = str5;
        String str8 = str6;
        return formPageLandingLimitDTO.copy(str, str2, str3, str4, str7, str8, ozonSpannableString2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getValidationBtn() {
        return this.validationBtn;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getValidationURL() {
        return this.validationURL;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final OzonSpannableString getDescription() {
        return this.description;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final FormPageLandingLimitDTO copy(@NotNull String title, @NotNull String hint, String value, @NotNull String name, @NotNull String validationBtn, @NotNull String validationURL, @NotNull OzonSpannableString description, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(validationBtn, "validationBtn");
        Intrinsics.checkNotNullParameter(validationURL, "validationURL");
        Intrinsics.checkNotNullParameter(description, "description");
        return new FormPageLandingLimitDTO(title, hint, value, name, validationBtn, validationURL, description, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormPageLandingLimitDTO)) {
            return false;
        }
        FormPageLandingLimitDTO formPageLandingLimitDTO = (FormPageLandingLimitDTO) other;
        return Intrinsics.d(this.title, formPageLandingLimitDTO.title) && Intrinsics.d(this.hint, formPageLandingLimitDTO.hint) && Intrinsics.d(this.value, formPageLandingLimitDTO.value) && Intrinsics.d(this.name, formPageLandingLimitDTO.name) && Intrinsics.d(this.validationBtn, formPageLandingLimitDTO.validationBtn) && Intrinsics.d(this.validationURL, formPageLandingLimitDTO.validationURL) && Intrinsics.d(this.description, formPageLandingLimitDTO.description) && Intrinsics.d(this.trackingInfo, formPageLandingLimitDTO.trackingInfo);
    }

    @NotNull
    public final OzonSpannableString getDescription() {
        return this.description;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final String getValidationBtn() {
        return this.validationBtn;
    }

    @NotNull
    public final String getValidationURL() {
        return this.validationURL;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int a11 = g.a(this.title.hashCode() * 31, 31, this.hint);
        String str = this.value;
        int c11 = P.c(this.description, g.a(g.a(g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.name), 31, this.validationBtn), 31, this.validationURL), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.hint;
        String str3 = this.value;
        String str4 = this.name;
        String str5 = this.validationBtn;
        String str6 = this.validationURL;
        OzonSpannableString ozonSpannableString = this.description;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("FormPageLandingLimitDTO(title=", str, ", hint=", str2, ", value=");
        a.h(d11, str3, ", name=", str4, ", validationBtn=");
        a.h(d11, str5, ", validationURL=", str6, ", description=");
        d11.append((Object) ozonSpannableString);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ FormPageLandingLimitDTO(String str, String str2, String str3, String str4, String str5, String str6, OzonSpannableString ozonSpannableString, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, ozonSpannableString, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map);
    }
}
