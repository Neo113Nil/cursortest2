package ru.ozon.app.android.partpayment.formpage.data;

import B6.b;
import C.o0;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Tz.C4055a;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J@\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", SelectionItemFormDTO.TITLE_FIELD_NAME, "fields", "", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field;", "refreshOnBack", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getTitle", "getFields", "()Ljava/util/List;", "getRefreshOnBack", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO;", "equals", "other", "hashCode", "", "toString", "Field", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FormPageDTO {

    @NotNull
    private final List<Field> fields;

    @NotNull
    private final String name;
    private final Boolean refreshOnBack;
    private final String title;

    public FormPageDTO(@NotNull String name, String str, @NotNull List<Field> fields, Boolean bool) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.name = name;
        this.title = str;
        this.fields = fields;
        this.refreshOnBack = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormPageDTO copy$default(FormPageDTO formPageDTO, String str, String str2, List list, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = formPageDTO.name;
        }
        if ((i11 & 2) != 0) {
            str2 = formPageDTO.title;
        }
        if ((i11 & 4) != 0) {
            list = formPageDTO.fields;
        }
        if ((i11 & 8) != 0) {
            bool = formPageDTO.refreshOnBack;
        }
        return formPageDTO.copy(str, str2, list, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Field> component3() {
        return this.fields;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getRefreshOnBack() {
        return this.refreshOnBack;
    }

    @NotNull
    public final FormPageDTO copy(@NotNull String name, String title, @NotNull List<Field> fields, Boolean refreshOnBack) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new FormPageDTO(name, title, fields, refreshOnBack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormPageDTO)) {
            return false;
        }
        FormPageDTO formPageDTO = (FormPageDTO) other;
        return Intrinsics.d(this.name, formPageDTO.name) && Intrinsics.d(this.title, formPageDTO.title) && Intrinsics.d(this.fields, formPageDTO.fields) && Intrinsics.d(this.refreshOnBack, formPageDTO.refreshOnBack);
    }

    @NotNull
    public final List<Field> getFields() {
        return this.fields;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final Boolean getRefreshOnBack() {
        return this.refreshOnBack;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.title;
        int b11 = g.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.fields);
        Boolean bool = this.refreshOnBack;
        return b11 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.title;
        List<Field> list = this.fields;
        Boolean bool = this.refreshOnBack;
        StringBuilder d11 = C3660k.d("FormPageDTO(name=", str, ", title=", str2, ", fields=");
        d11.append(list);
        d11.append(", refreshOnBack=");
        d11.append(bool);
        d11.append(")");
        return d11.toString();
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0006cdefghBç\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\"\u0010#J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010M\u001a\u00020\fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010@J\u0010\u0010Z\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0098\u0002\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020\f2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020aHÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0015\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010%¨\u0006i"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field;", "", "type", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "description", "borderRatio", "uploadFromGallery", "", "fullDescription", "maskOptions", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$MaskOptions;", "landingOptions", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$LandingOptions;", "summaryOptions", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions;", "textOptions", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$TextOptions;", "options", "", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$Option;", "pikerType", "uploadUrl", "validationURL", "deeplink", "errorFoundDeeplink", "returnBack", "height", "", "background", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$MaskOptions;Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$LandingOptions;Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions;Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$TextOptions;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getName", "getValue", "getDisplayValue", "getDescription", "getBorderRatio", "getUploadFromGallery", "()Z", "getFullDescription", "getMaskOptions", "()Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$MaskOptions;", "getLandingOptions", "()Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$LandingOptions;", "getSummaryOptions", "()Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions;", "getTextOptions", "()Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$TextOptions;", "getOptions", "()Ljava/util/List;", "getPikerType", "getUploadUrl", "getValidationURL", "getDeeplink", "getErrorFoundDeeplink", "getReturnBack", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBackground", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$MaskOptions;Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$LandingOptions;Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions;Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$TextOptions;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field;", "equals", "other", "hashCode", "", "toString", "Companion", "MaskOptions", "SummaryOptions", "Option", "TextOptions", "LandingOptions", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Field {

        @NotNull
        public static final String FIELD_TYPE_ADDRESS = "address";

        @NotNull
        public static final String FIELD_TYPE_ADDRESS_SELECTOR = "address_select";

        @NotNull
        public static final String FIELD_TYPE_APPROVE_BUTTON = "approve_button";

        @NotNull
        public static final String FIELD_TYPE_CHECKBOX = "checkbox";

        @NotNull
        public static final String FIELD_TYPE_CHECKER = "checker";

        @NotNull
        public static final String FIELD_TYPE_HIDDEN = "hidden";

        @NotNull
        public static final String FIELD_TYPE_IMAGE = "image";

        @NotNull
        public static final String FIELD_TYPE_LANDING = "landing";

        @NotNull
        public static final String FIELD_TYPE_MASK = "mask";

        @NotNull
        public static final String FIELD_TYPE_PICKER = "picker";

        @NotNull
        public static final String FIELD_TYPE_RADIO = "radio";

        @NotNull
        public static final String FIELD_TYPE_RANGE = "range";

        @NotNull
        public static final String FIELD_TYPE_SEPARATOR = "separator";

        @NotNull
        public static final String FIELD_TYPE_SUMMARY = "summary";

        @NotNull
        public static final String FIELD_TYPE_TEXT = "text";

        @NotNull
        public static final String FIELD_TYPE_UPLOAD_PHOTO_BUTTON = "upload_photo_button";

        @NotNull
        public static final String FIELD_TYPE_VALIDATE_BUTTON = "validate_button";
        private final String background;
        private final String borderRatio;
        private final String deeplink;
        private final OzonSpannableString description;
        private final String displayValue;
        private final String errorFoundDeeplink;
        private final String fullDescription;
        private final Float height;
        private final LandingOptions landingOptions;
        private final MaskOptions maskOptions;
        private final String name;
        private final List<Option> options;
        private final String pikerType;
        private final Boolean returnBack;
        private final SummaryOptions summaryOptions;
        private final TextOptions textOptions;
        private final OzonSpannableString title;

        @NotNull
        private final String type;
        private final boolean uploadFromGallery;
        private final String uploadUrl;
        private final String validationURL;
        private final String value;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$LandingOptions;", "", "image", "", "maxValue", "maxValueHint", "period", "periodHint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getMaxValue", "getMaxValueHint", "getPeriod", "getPeriodHint", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LandingOptions {

            @NotNull
            private final String image;

            @NotNull
            private final String maxValue;

            @NotNull
            private final String maxValueHint;

            @NotNull
            private final String period;

            @NotNull
            private final String periodHint;

            public LandingOptions(@NotNull String image, @NotNull String maxValue, @NotNull String maxValueHint, @NotNull String period, @NotNull String periodHint) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(maxValue, "maxValue");
                Intrinsics.checkNotNullParameter(maxValueHint, "maxValueHint");
                Intrinsics.checkNotNullParameter(period, "period");
                Intrinsics.checkNotNullParameter(periodHint, "periodHint");
                this.image = image;
                this.maxValue = maxValue;
                this.maxValueHint = maxValueHint;
                this.period = period;
                this.periodHint = periodHint;
            }

            public static /* synthetic */ LandingOptions copy$default(LandingOptions landingOptions, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = landingOptions.image;
                }
                if ((i11 & 2) != 0) {
                    str2 = landingOptions.maxValue;
                }
                if ((i11 & 4) != 0) {
                    str3 = landingOptions.maxValueHint;
                }
                if ((i11 & 8) != 0) {
                    str4 = landingOptions.period;
                }
                if ((i11 & 16) != 0) {
                    str5 = landingOptions.periodHint;
                }
                String str6 = str5;
                String str7 = str3;
                return landingOptions.copy(str, str2, str7, str4, str6);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getMaxValue() {
                return this.maxValue;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getMaxValueHint() {
                return this.maxValueHint;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getPeriod() {
                return this.period;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final String getPeriodHint() {
                return this.periodHint;
            }

            @NotNull
            public final LandingOptions copy(@NotNull String image, @NotNull String maxValue, @NotNull String maxValueHint, @NotNull String period, @NotNull String periodHint) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(maxValue, "maxValue");
                Intrinsics.checkNotNullParameter(maxValueHint, "maxValueHint");
                Intrinsics.checkNotNullParameter(period, "period");
                Intrinsics.checkNotNullParameter(periodHint, "periodHint");
                return new LandingOptions(image, maxValue, maxValueHint, period, periodHint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LandingOptions)) {
                    return false;
                }
                LandingOptions landingOptions = (LandingOptions) other;
                return Intrinsics.d(this.image, landingOptions.image) && Intrinsics.d(this.maxValue, landingOptions.maxValue) && Intrinsics.d(this.maxValueHint, landingOptions.maxValueHint) && Intrinsics.d(this.period, landingOptions.period) && Intrinsics.d(this.periodHint, landingOptions.periodHint);
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            @NotNull
            public final String getMaxValue() {
                return this.maxValue;
            }

            @NotNull
            public final String getMaxValueHint() {
                return this.maxValueHint;
            }

            @NotNull
            public final String getPeriod() {
                return this.period;
            }

            @NotNull
            public final String getPeriodHint() {
                return this.periodHint;
            }

            public int hashCode() {
                return this.periodHint.hashCode() + g.a(g.a(g.a(this.image.hashCode() * 31, 31, this.maxValue), 31, this.maxValueHint), 31, this.period);
            }

            @NotNull
            public String toString() {
                String str = this.image;
                String str2 = this.maxValue;
                String str3 = this.maxValueHint;
                String str4 = this.period;
                String str5 = this.periodHint;
                StringBuilder d11 = C3660k.d("LandingOptions(image=", str, ", maxValue=", str2, ", maxValueHint=");
                a.h(d11, str3, ", period=", str4, ", periodHint=");
                return o0.c(d11, str5, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$MaskOptions;", "", Field.FIELD_TYPE_MASK, "", "autocompleteUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMask", "()Ljava/lang/String;", "getAutocompleteUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MaskOptions {
            private final String autocompleteUrl;

            @NotNull
            private final String mask;

            public MaskOptions(@NotNull String mask, String str) {
                Intrinsics.checkNotNullParameter(mask, "mask");
                this.mask = mask;
                this.autocompleteUrl = str;
            }

            public static /* synthetic */ MaskOptions copy$default(MaskOptions maskOptions, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = maskOptions.mask;
                }
                if ((i11 & 2) != 0) {
                    str2 = maskOptions.autocompleteUrl;
                }
                return maskOptions.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getMask() {
                return this.mask;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAutocompleteUrl() {
                return this.autocompleteUrl;
            }

            @NotNull
            public final MaskOptions copy(@NotNull String mask, String autocompleteUrl) {
                Intrinsics.checkNotNullParameter(mask, "mask");
                return new MaskOptions(mask, autocompleteUrl);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MaskOptions)) {
                    return false;
                }
                MaskOptions maskOptions = (MaskOptions) other;
                return Intrinsics.d(this.mask, maskOptions.mask) && Intrinsics.d(this.autocompleteUrl, maskOptions.autocompleteUrl);
            }

            public final String getAutocompleteUrl() {
                return this.autocompleteUrl;
            }

            @NotNull
            public final String getMask() {
                return this.mask;
            }

            public int hashCode() {
                int hashCode = this.mask.hashCode() * 31;
                String str = this.autocompleteUrl;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("MaskOptions(mask=", this.mask, ", autocompleteUrl=", this.autocompleteUrl, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$Option;", "", "deeplink", "", "displayValue", "img", AppMeasurementSdk.ConditionalUserProperty.VALUE, SelectionItemFormDTO.TITLE_FIELD_NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, "toField", "fias", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "getDisplayValue", "getImg", "getValue", "getTitle", "getName", "getToField", "getFias", "getDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Option {
            private final String deeplink;
            private final String description;
            private final String displayValue;
            private final String fias;
            private final String img;
            private final String name;
            private final String title;
            private final String toField;
            private final String value;

            public Option(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
                this.deeplink = str;
                this.displayValue = str2;
                this.img = str3;
                this.value = str4;
                this.title = str5;
                this.name = str6;
                this.toField = str7;
                this.fias = str8;
                this.description = str9;
            }

            public static /* synthetic */ Option copy$default(Option option, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = option.deeplink;
                }
                if ((i11 & 2) != 0) {
                    str2 = option.displayValue;
                }
                if ((i11 & 4) != 0) {
                    str3 = option.img;
                }
                if ((i11 & 8) != 0) {
                    str4 = option.value;
                }
                if ((i11 & 16) != 0) {
                    str5 = option.title;
                }
                if ((i11 & 32) != 0) {
                    str6 = option.name;
                }
                if ((i11 & 64) != 0) {
                    str7 = option.toField;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str8 = option.fias;
                }
                if ((i11 & 256) != 0) {
                    str9 = option.description;
                }
                String str10 = str8;
                String str11 = str9;
                String str12 = str6;
                String str13 = str7;
                String str14 = str5;
                String str15 = str3;
                return option.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDisplayValue() {
                return this.displayValue;
            }

            /* renamed from: component3, reason: from getter */
            public final String getImg() {
                return this.img;
            }

            /* renamed from: component4, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            /* renamed from: component5, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component6, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component7, reason: from getter */
            public final String getToField() {
                return this.toField;
            }

            /* renamed from: component8, reason: from getter */
            public final String getFias() {
                return this.fias;
            }

            /* renamed from: component9, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final Option copy(String deeplink, String displayValue, String img, String value, String title, String name, String toField, String fias, String description) {
                return new Option(deeplink, displayValue, img, value, title, name, toField, fias, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Option)) {
                    return false;
                }
                Option option = (Option) other;
                return Intrinsics.d(this.deeplink, option.deeplink) && Intrinsics.d(this.displayValue, option.displayValue) && Intrinsics.d(this.img, option.img) && Intrinsics.d(this.value, option.value) && Intrinsics.d(this.title, option.title) && Intrinsics.d(this.name, option.name) && Intrinsics.d(this.toField, option.toField) && Intrinsics.d(this.fias, option.fias) && Intrinsics.d(this.description, option.description);
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getDisplayValue() {
                return this.displayValue;
            }

            public final String getFias() {
                return this.fias;
            }

            public final String getImg() {
                return this.img;
            }

            public final String getName() {
                return this.name;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getToField() {
                return this.toField;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                String str = this.deeplink;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.img;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.value;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.title;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.name;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.toField;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.fias;
                int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.description;
                return hashCode8 + (str9 != null ? str9.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.deeplink;
                String str2 = this.displayValue;
                String str3 = this.img;
                String str4 = this.value;
                String str5 = this.title;
                String str6 = this.name;
                String str7 = this.toField;
                String str8 = this.fias;
                String str9 = this.description;
                StringBuilder d11 = C3660k.d("Option(deeplink=", str, ", displayValue=", str2, ", img=");
                a.h(d11, str3, ", value=", str4, ", title=");
                a.h(d11, str5, ", name=", str6, ", toField=");
                a.h(d11, str7, ", fias=", str8, ", description=");
                return o0.c(d11, str9, ")");
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002&'BO\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jb\u0010\u001f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006("}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions;", "", "buttons", "", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions$Button;", "changeDeeplink", "", "fields", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions$SummaryFields;", "description", "loader", "", "statusIcon", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getButtons", "()Ljava/util/List;", "getChangeDeeplink", "()Ljava/lang/String;", "getFields", "getDescription", "getLoader", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStatusIcon", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions;", "equals", "other", "hashCode", "", "toString", "SummaryFields", "Button", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class SummaryOptions {
            private final List<Button> buttons;
            private final String changeDeeplink;
            private final String description;
            private final List<SummaryFields> fields;
            private final Boolean loader;
            private final String statusIcon;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions$Button;", "", "deeplink", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Button {

                @NotNull
                private final String deeplink;

                @NotNull
                private final String title;

                public Button(@NotNull String deeplink, @NotNull String title) {
                    Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.deeplink = deeplink;
                    this.title = title;
                }

                public static /* synthetic */ Button copy$default(Button button, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = button.deeplink;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = button.title;
                    }
                    return button.copy(str, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public final Button copy(@NotNull String deeplink, @NotNull String title) {
                    Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new Button(deeplink, title);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) other;
                    return Intrinsics.d(this.deeplink, button.deeplink) && Intrinsics.d(this.title, button.title);
                }

                @NotNull
                public final String getDeeplink() {
                    return this.deeplink;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.title.hashCode() + (this.deeplink.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("Button(deeplink=", this.deeplink, ", title=", this.title, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions$SummaryFields;", "", "hint", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHint", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SummaryFields {
                private final String hint;

                @NotNull
                private final String value;

                public SummaryFields(String str, @NotNull String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.hint = str;
                    this.value = value;
                }

                public static /* synthetic */ SummaryFields copy$default(SummaryFields summaryFields, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = summaryFields.hint;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = summaryFields.value;
                    }
                    return summaryFields.copy(str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getHint() {
                    return this.hint;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                @NotNull
                public final SummaryFields copy(String hint, @NotNull String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new SummaryFields(hint, value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SummaryFields)) {
                        return false;
                    }
                    SummaryFields summaryFields = (SummaryFields) other;
                    return Intrinsics.d(this.hint, summaryFields.hint) && Intrinsics.d(this.value, summaryFields.value);
                }

                public final String getHint() {
                    return this.hint;
                }

                @NotNull
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    String str = this.hint;
                    return this.value.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("SummaryFields(hint=", this.hint, ", value=", this.value, ")");
                }
            }

            public SummaryOptions(List<Button> list, String str, List<SummaryFields> list2, String str2, Boolean bool, String str3) {
                this.buttons = list;
                this.changeDeeplink = str;
                this.fields = list2;
                this.description = str2;
                this.loader = bool;
                this.statusIcon = str3;
            }

            public static /* synthetic */ SummaryOptions copy$default(SummaryOptions summaryOptions, List list, String str, List list2, String str2, Boolean bool, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = summaryOptions.buttons;
                }
                if ((i11 & 2) != 0) {
                    str = summaryOptions.changeDeeplink;
                }
                if ((i11 & 4) != 0) {
                    list2 = summaryOptions.fields;
                }
                if ((i11 & 8) != 0) {
                    str2 = summaryOptions.description;
                }
                if ((i11 & 16) != 0) {
                    bool = summaryOptions.loader;
                }
                if ((i11 & 32) != 0) {
                    str3 = summaryOptions.statusIcon;
                }
                Boolean bool2 = bool;
                String str4 = str3;
                return summaryOptions.copy(list, str, list2, str2, bool2, str4);
            }

            public final List<Button> component1() {
                return this.buttons;
            }

            /* renamed from: component2, reason: from getter */
            public final String getChangeDeeplink() {
                return this.changeDeeplink;
            }

            public final List<SummaryFields> component3() {
                return this.fields;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component5, reason: from getter */
            public final Boolean getLoader() {
                return this.loader;
            }

            /* renamed from: component6, reason: from getter */
            public final String getStatusIcon() {
                return this.statusIcon;
            }

            @NotNull
            public final SummaryOptions copy(List<Button> buttons, String changeDeeplink, List<SummaryFields> fields, String description, Boolean loader, String statusIcon) {
                return new SummaryOptions(buttons, changeDeeplink, fields, description, loader, statusIcon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SummaryOptions)) {
                    return false;
                }
                SummaryOptions summaryOptions = (SummaryOptions) other;
                return Intrinsics.d(this.buttons, summaryOptions.buttons) && Intrinsics.d(this.changeDeeplink, summaryOptions.changeDeeplink) && Intrinsics.d(this.fields, summaryOptions.fields) && Intrinsics.d(this.description, summaryOptions.description) && Intrinsics.d(this.loader, summaryOptions.loader) && Intrinsics.d(this.statusIcon, summaryOptions.statusIcon);
            }

            public final List<Button> getButtons() {
                return this.buttons;
            }

            public final String getChangeDeeplink() {
                return this.changeDeeplink;
            }

            public final String getDescription() {
                return this.description;
            }

            public final List<SummaryFields> getFields() {
                return this.fields;
            }

            public final Boolean getLoader() {
                return this.loader;
            }

            public final String getStatusIcon() {
                return this.statusIcon;
            }

            public int hashCode() {
                List<Button> list = this.buttons;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                String str = this.changeDeeplink;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                List<SummaryFields> list2 = this.fields;
                int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                String str2 = this.description;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.loader;
                int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str3 = this.statusIcon;
                return hashCode5 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                List<Button> list = this.buttons;
                String str = this.changeDeeplink;
                List<SummaryFields> list2 = this.fields;
                String str2 = this.description;
                Boolean bool = this.loader;
                String str3 = this.statusIcon;
                StringBuilder a11 = C4055a.a("SummaryOptions(buttons=", ", changeDeeplink=", str, ", fields=", list);
                Cm.e.i(", description=", str2, ", loader=", a11, list2);
                a11.append(bool);
                a11.append(", statusIcon=");
                a11.append(str3);
                a11.append(")");
                return a11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$TextOptions;", "", "isMultiline", "", "keyboardType", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getKeyboardType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextOptions {
            private final boolean isMultiline;

            @NotNull
            private final String keyboardType;

            public TextOptions(boolean z11, @NotNull String keyboardType) {
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                this.isMultiline = z11;
                this.keyboardType = keyboardType;
            }

            public static /* synthetic */ TextOptions copy$default(TextOptions textOptions, boolean z11, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = textOptions.isMultiline;
                }
                if ((i11 & 2) != 0) {
                    str = textOptions.keyboardType;
                }
                return textOptions.copy(z11, str);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsMultiline() {
                return this.isMultiline;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getKeyboardType() {
                return this.keyboardType;
            }

            @NotNull
            public final TextOptions copy(boolean isMultiline, @NotNull String keyboardType) {
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                return new TextOptions(isMultiline, keyboardType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextOptions)) {
                    return false;
                }
                TextOptions textOptions = (TextOptions) other;
                return this.isMultiline == textOptions.isMultiline && Intrinsics.d(this.keyboardType, textOptions.keyboardType);
            }

            @NotNull
            public final String getKeyboardType() {
                return this.keyboardType;
            }

            public int hashCode() {
                return this.keyboardType.hashCode() + (Boolean.hashCode(this.isMultiline) * 31);
            }

            public final boolean isMultiline() {
                return this.isMultiline;
            }

            @NotNull
            public String toString() {
                return "TextOptions(isMultiline=" + this.isMultiline + ", keyboardType=" + this.keyboardType + ")";
            }
        }

        public Field(@NotNull String type, OzonSpannableString ozonSpannableString, String str, String str2, String str3, OzonSpannableString ozonSpannableString2, String str4, boolean z11, String str5, MaskOptions maskOptions, LandingOptions landingOptions, SummaryOptions summaryOptions, TextOptions textOptions, List<Option> list, String str6, String str7, String str8, String str9, String str10, Boolean bool, Float f7, String str11) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.title = ozonSpannableString;
            this.name = str;
            this.value = str2;
            this.displayValue = str3;
            this.description = ozonSpannableString2;
            this.borderRatio = str4;
            this.uploadFromGallery = z11;
            this.fullDescription = str5;
            this.maskOptions = maskOptions;
            this.landingOptions = landingOptions;
            this.summaryOptions = summaryOptions;
            this.textOptions = textOptions;
            this.options = list;
            this.pikerType = str6;
            this.uploadUrl = str7;
            this.validationURL = str8;
            this.deeplink = str9;
            this.errorFoundDeeplink = str10;
            this.returnBack = bool;
            this.height = f7;
            this.background = str11;
        }

        public static /* synthetic */ Field copy$default(Field field, String str, OzonSpannableString ozonSpannableString, String str2, String str3, String str4, OzonSpannableString ozonSpannableString2, String str5, boolean z11, String str6, MaskOptions maskOptions, LandingOptions landingOptions, SummaryOptions summaryOptions, TextOptions textOptions, List list, String str7, String str8, String str9, String str10, String str11, Boolean bool, Float f7, String str12, int i11, Object obj) {
            String str13;
            Float f11;
            String str14 = (i11 & 1) != 0 ? field.type : str;
            OzonSpannableString ozonSpannableString3 = (i11 & 2) != 0 ? field.title : ozonSpannableString;
            String str15 = (i11 & 4) != 0 ? field.name : str2;
            String str16 = (i11 & 8) != 0 ? field.value : str3;
            String str17 = (i11 & 16) != 0 ? field.displayValue : str4;
            OzonSpannableString ozonSpannableString4 = (i11 & 32) != 0 ? field.description : ozonSpannableString2;
            String str18 = (i11 & 64) != 0 ? field.borderRatio : str5;
            boolean z12 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? field.uploadFromGallery : z11;
            String str19 = (i11 & 256) != 0 ? field.fullDescription : str6;
            MaskOptions maskOptions2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? field.maskOptions : maskOptions;
            LandingOptions landingOptions2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? field.landingOptions : landingOptions;
            SummaryOptions summaryOptions2 = (i11 & 2048) != 0 ? field.summaryOptions : summaryOptions;
            TextOptions textOptions2 = (i11 & 4096) != 0 ? field.textOptions : textOptions;
            List list2 = (i11 & 8192) != 0 ? field.options : list;
            String str20 = str14;
            String str21 = (i11 & 16384) != 0 ? field.pikerType : str7;
            String str22 = (i11 & 32768) != 0 ? field.uploadUrl : str8;
            String str23 = (i11 & 65536) != 0 ? field.validationURL : str9;
            String str24 = (i11 & 131072) != 0 ? field.deeplink : str10;
            String str25 = (i11 & 262144) != 0 ? field.errorFoundDeeplink : str11;
            Boolean bool2 = (i11 & 524288) != 0 ? field.returnBack : bool;
            Float f12 = (i11 & 1048576) != 0 ? field.height : f7;
            if ((i11 & 2097152) != 0) {
                f11 = f12;
                str13 = field.background;
            } else {
                str13 = str12;
                f11 = f12;
            }
            return field.copy(str20, ozonSpannableString3, str15, str16, str17, ozonSpannableString4, str18, z12, str19, maskOptions2, landingOptions2, summaryOptions2, textOptions2, list2, str21, str22, str23, str24, str25, bool2, f11, str13);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component10, reason: from getter */
        public final MaskOptions getMaskOptions() {
            return this.maskOptions;
        }

        /* renamed from: component11, reason: from getter */
        public final LandingOptions getLandingOptions() {
            return this.landingOptions;
        }

        /* renamed from: component12, reason: from getter */
        public final SummaryOptions getSummaryOptions() {
            return this.summaryOptions;
        }

        /* renamed from: component13, reason: from getter */
        public final TextOptions getTextOptions() {
            return this.textOptions;
        }

        public final List<Option> component14() {
            return this.options;
        }

        /* renamed from: component15, reason: from getter */
        public final String getPikerType() {
            return this.pikerType;
        }

        /* renamed from: component16, reason: from getter */
        public final String getUploadUrl() {
            return this.uploadUrl;
        }

        /* renamed from: component17, reason: from getter */
        public final String getValidationURL() {
            return this.validationURL;
        }

        /* renamed from: component18, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component19, reason: from getter */
        public final String getErrorFoundDeeplink() {
            return this.errorFoundDeeplink;
        }

        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        /* renamed from: component20, reason: from getter */
        public final Boolean getReturnBack() {
            return this.returnBack;
        }

        /* renamed from: component21, reason: from getter */
        public final Float getHeight() {
            return this.height;
        }

        /* renamed from: component22, reason: from getter */
        public final String getBackground() {
            return this.background;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisplayValue() {
            return this.displayValue;
        }

        /* renamed from: component6, reason: from getter */
        public final OzonSpannableString getDescription() {
            return this.description;
        }

        /* renamed from: component7, reason: from getter */
        public final String getBorderRatio() {
            return this.borderRatio;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getUploadFromGallery() {
            return this.uploadFromGallery;
        }

        /* renamed from: component9, reason: from getter */
        public final String getFullDescription() {
            return this.fullDescription;
        }

        @NotNull
        public final Field copy(@NotNull String type, OzonSpannableString title, String name, String value, String displayValue, OzonSpannableString description, String borderRatio, boolean uploadFromGallery, String fullDescription, MaskOptions maskOptions, LandingOptions landingOptions, SummaryOptions summaryOptions, TextOptions textOptions, List<Option> options, String pikerType, String uploadUrl, String validationURL, String deeplink, String errorFoundDeeplink, Boolean returnBack, Float height, String background) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Field(type, title, name, value, displayValue, description, borderRatio, uploadFromGallery, fullDescription, maskOptions, landingOptions, summaryOptions, textOptions, options, pikerType, uploadUrl, validationURL, deeplink, errorFoundDeeplink, returnBack, height, background);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return Intrinsics.d(this.type, field.type) && Intrinsics.d(this.title, field.title) && Intrinsics.d(this.name, field.name) && Intrinsics.d(this.value, field.value) && Intrinsics.d(this.displayValue, field.displayValue) && Intrinsics.d(this.description, field.description) && Intrinsics.d(this.borderRatio, field.borderRatio) && this.uploadFromGallery == field.uploadFromGallery && Intrinsics.d(this.fullDescription, field.fullDescription) && Intrinsics.d(this.maskOptions, field.maskOptions) && Intrinsics.d(this.landingOptions, field.landingOptions) && Intrinsics.d(this.summaryOptions, field.summaryOptions) && Intrinsics.d(this.textOptions, field.textOptions) && Intrinsics.d(this.options, field.options) && Intrinsics.d(this.pikerType, field.pikerType) && Intrinsics.d(this.uploadUrl, field.uploadUrl) && Intrinsics.d(this.validationURL, field.validationURL) && Intrinsics.d(this.deeplink, field.deeplink) && Intrinsics.d(this.errorFoundDeeplink, field.errorFoundDeeplink) && Intrinsics.d(this.returnBack, field.returnBack) && Intrinsics.d(this.height, field.height) && Intrinsics.d(this.background, field.background);
        }

        public final String getBackground() {
            return this.background;
        }

        public final String getBorderRatio() {
            return this.borderRatio;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final OzonSpannableString getDescription() {
            return this.description;
        }

        public final String getDisplayValue() {
            return this.displayValue;
        }

        public final String getErrorFoundDeeplink() {
            return this.errorFoundDeeplink;
        }

        public final String getFullDescription() {
            return this.fullDescription;
        }

        public final Float getHeight() {
            return this.height;
        }

        public final LandingOptions getLandingOptions() {
            return this.landingOptions;
        }

        public final MaskOptions getMaskOptions() {
            return this.maskOptions;
        }

        public final String getName() {
            return this.name;
        }

        public final List<Option> getOptions() {
            return this.options;
        }

        public final String getPikerType() {
            return this.pikerType;
        }

        public final Boolean getReturnBack() {
            return this.returnBack;
        }

        public final SummaryOptions getSummaryOptions() {
            return this.summaryOptions;
        }

        public final TextOptions getTextOptions() {
            return this.textOptions;
        }

        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final boolean getUploadFromGallery() {
            return this.uploadFromGallery;
        }

        public final String getUploadUrl() {
            return this.uploadUrl;
        }

        public final String getValidationURL() {
            return this.validationURL;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            OzonSpannableString ozonSpannableString = this.title;
            int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
            String str = this.name;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.value;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.displayValue;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            OzonSpannableString ozonSpannableString2 = this.description;
            int hashCode6 = (hashCode5 + (ozonSpannableString2 == null ? 0 : ozonSpannableString2.hashCode())) * 31;
            String str4 = this.borderRatio;
            int a11 = C3532b.a((hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.uploadFromGallery);
            String str5 = this.fullDescription;
            int hashCode7 = (a11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            MaskOptions maskOptions = this.maskOptions;
            int hashCode8 = (hashCode7 + (maskOptions == null ? 0 : maskOptions.hashCode())) * 31;
            LandingOptions landingOptions = this.landingOptions;
            int hashCode9 = (hashCode8 + (landingOptions == null ? 0 : landingOptions.hashCode())) * 31;
            SummaryOptions summaryOptions = this.summaryOptions;
            int hashCode10 = (hashCode9 + (summaryOptions == null ? 0 : summaryOptions.hashCode())) * 31;
            TextOptions textOptions = this.textOptions;
            int hashCode11 = (hashCode10 + (textOptions == null ? 0 : textOptions.hashCode())) * 31;
            List<Option> list = this.options;
            int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
            String str6 = this.pikerType;
            int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.uploadUrl;
            int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.validationURL;
            int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.deeplink;
            int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.errorFoundDeeplink;
            int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Boolean bool = this.returnBack;
            int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f7 = this.height;
            int hashCode19 = (hashCode18 + (f7 == null ? 0 : f7.hashCode())) * 31;
            String str11 = this.background;
            return hashCode19 + (str11 != null ? str11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            OzonSpannableString ozonSpannableString = this.title;
            String str2 = this.name;
            String str3 = this.value;
            String str4 = this.displayValue;
            OzonSpannableString ozonSpannableString2 = this.description;
            String str5 = this.borderRatio;
            boolean z11 = this.uploadFromGallery;
            String str6 = this.fullDescription;
            MaskOptions maskOptions = this.maskOptions;
            LandingOptions landingOptions = this.landingOptions;
            SummaryOptions summaryOptions = this.summaryOptions;
            TextOptions textOptions = this.textOptions;
            List<Option> list = this.options;
            String str7 = this.pikerType;
            String str8 = this.uploadUrl;
            String str9 = this.validationURL;
            String str10 = this.deeplink;
            String str11 = this.errorFoundDeeplink;
            Boolean bool = this.returnBack;
            Float f7 = this.height;
            String str12 = this.background;
            StringBuilder sb2 = new StringBuilder("Field(type=");
            sb2.append(str);
            sb2.append(", title=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", name=");
            a.h(sb2, str2, ", value=", str3, ", displayValue=");
            b.c(str4, ", description=", ", borderRatio=", sb2, ozonSpannableString2);
            C2880a.c(str5, ", uploadFromGallery=", ", fullDescription=", sb2, z11);
            sb2.append(str6);
            sb2.append(", maskOptions=");
            sb2.append(maskOptions);
            sb2.append(", landingOptions=");
            sb2.append(landingOptions);
            sb2.append(", summaryOptions=");
            sb2.append(summaryOptions);
            sb2.append(", textOptions=");
            sb2.append(textOptions);
            sb2.append(", options=");
            sb2.append(list);
            sb2.append(", pikerType=");
            a.h(sb2, str7, ", uploadUrl=", str8, ", validationURL=");
            a.h(sb2, str9, ", deeplink=", str10, ", errorFoundDeeplink=");
            Sh.a.d(bool, str11, ", returnBack=", ", height=", sb2);
            sb2.append(f7);
            sb2.append(", background=");
            sb2.append(str12);
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ Field(String str, OzonSpannableString ozonSpannableString, String str2, String str3, String str4, OzonSpannableString ozonSpannableString2, String str5, boolean z11, String str6, MaskOptions maskOptions, LandingOptions landingOptions, SummaryOptions summaryOptions, TextOptions textOptions, List list, String str7, String str8, String str9, String str10, String str11, Boolean bool, Float f7, String str12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, ozonSpannableString, str2, str3, str4, ozonSpannableString2, str5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, str6, maskOptions, landingOptions, summaryOptions, textOptions, list, str7, str8, str9, str10, str11, bool, f7, str12);
        }
    }
}
