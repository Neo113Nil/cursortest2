package ru.ozon.app.android.partpayment.formpage.view.vo;

import Ak.C2436a;
import B0.C2454a;
import B90.C2618u;
import C.o0;
import Ds.C2880a;
import G.g;
import GR.b;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "fields", "", "refreshOnBack", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getName", "getTitle", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "Z", "getRefreshOnBack", "()Z", "Field", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FormPageVO implements c {

    @NotNull
    private final List<Field> fields;
    private final long id;

    @NotNull
    private final String name;
    private final boolean refreshOnBack;
    private final String title;

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0016\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0012\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b\u0082\u0001\u0011)*+,-./0123456789¨\u0006:"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "", "<init>", "()V", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue", "displayValue", "getDisplayValue", "error", "getError", "copyWithValue", "ViewType", "Hidden", "Text", "Mask", "Radio", "AddressSelector", "Address", "Landing", "Range", "Image", "Picker", "Checkbox", "Checker", "Summary", "Separator", "ValidateButton", "UploadPhotoButton", "ApproveButton", "FocusableField", "ButtonField", "Options", "KeyboardType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Address;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$AddressSelector;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ApproveButton;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Checkbox;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Checker;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Hidden;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Image;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Landing;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Mask;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Radio;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Range;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Separator;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Text;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ValidateButton;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Field {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000b\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\u0010R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Address;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Address;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Address extends Field {
            private final String displayValue;
            private final String error;

            @NotNull
            private final String name;

            @NotNull
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Address(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.viewType = ViewType.ADDRESS;
            }

            public static /* synthetic */ Address copy$default(Address address, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = address.title;
                }
                if ((i11 & 2) != 0) {
                    str = address.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = address.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = address.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = address.error;
                }
                String str5 = str4;
                String str6 = str2;
                return address.copy(ozonSpannableString, str, str6, str3, str5);
            }

            @NotNull
            public final Address copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                return new Address(title, name, value, displayValue, error);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, 3, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Address)) {
                    return false;
                }
                Address address = (Address) other;
                return Intrinsics.d(this.title, address.title) && Intrinsics.d(this.name, address.name) && Intrinsics.d(this.value, address.value) && Intrinsics.d(this.displayValue, address.displayValue) && Intrinsics.d(this.error, address.error);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                StringBuilder f7 = b.f("Address(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                return o0.c(f7, str4, ")");
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011Jd\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$AddressSelector;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "description", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Address;", "options", "", "showStepIndicator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;Z)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;Z)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$AddressSelector;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getDescription", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Z", "getShowStepIndicator", "()Z", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AddressSelector extends Field {
            private final OzonSpannableString description;
            private final String displayValue;
            private final String error;

            @NotNull
            private final String name;

            @NotNull
            private final List<Options.Address> options;
            private final boolean showStepIndicator;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddressSelector(@NotNull String name, String str, String str2, String str3, OzonSpannableString ozonSpannableString, @NotNull List<Options.Address> options, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(options, "options");
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.description = ozonSpannableString;
                this.options = options;
                this.showStepIndicator = z11;
                this.viewType = ViewType.ADDRESS_SELECTOR;
            }

            public static /* synthetic */ AddressSelector copy$default(AddressSelector addressSelector, String str, String str2, String str3, String str4, OzonSpannableString ozonSpannableString, List list, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = addressSelector.name;
                }
                if ((i11 & 2) != 0) {
                    str2 = addressSelector.value;
                }
                if ((i11 & 4) != 0) {
                    str3 = addressSelector.displayValue;
                }
                if ((i11 & 8) != 0) {
                    str4 = addressSelector.error;
                }
                if ((i11 & 16) != 0) {
                    ozonSpannableString = addressSelector.description;
                }
                if ((i11 & 32) != 0) {
                    list = addressSelector.options;
                }
                if ((i11 & 64) != 0) {
                    z11 = addressSelector.showStepIndicator;
                }
                List list2 = list;
                boolean z12 = z11;
                OzonSpannableString ozonSpannableString2 = ozonSpannableString;
                String str5 = str3;
                return addressSelector.copy(str, str2, str5, str4, ozonSpannableString2, list2, z12);
            }

            @NotNull
            public final AddressSelector copy(@NotNull String name, String value, String displayValue, String error, OzonSpannableString description, @NotNull List<Options.Address> options, boolean showStepIndicator) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(options, "options");
                return new AddressSelector(name, value, displayValue, error, description, options, showStepIndicator);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, value, displayValue, error, null, null, false, 113, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddressSelector)) {
                    return false;
                }
                AddressSelector addressSelector = (AddressSelector) other;
                return Intrinsics.d(this.name, addressSelector.name) && Intrinsics.d(this.value, addressSelector.value) && Intrinsics.d(this.displayValue, addressSelector.displayValue) && Intrinsics.d(this.error, addressSelector.error) && Intrinsics.d(this.description, addressSelector.description) && Intrinsics.d(this.options, addressSelector.options) && this.showStepIndicator == addressSelector.showStepIndicator;
            }

            public final OzonSpannableString getDescription() {
                return this.description;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final List<Options.Address> getOptions() {
                return this.options;
            }

            public final boolean getShowStepIndicator() {
                return this.showStepIndicator;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.value;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                OzonSpannableString ozonSpannableString = this.description;
                return Boolean.hashCode(this.showStepIndicator) + g.b((hashCode4 + (ozonSpannableString != null ? ozonSpannableString.hashCode() : 0)) * 31, 31, this.options);
            }

            @NotNull
            public String toString() {
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                OzonSpannableString ozonSpannableString = this.description;
                List<Options.Address> list = this.options;
                boolean z11 = this.showStepIndicator;
                StringBuilder d11 = C3660k.d("AddressSelector(name=", str, ", value=", str2, ", displayValue=");
                a.h(d11, str3, ", error=", str4, ", description=");
                d11.append((Object) ozonSpannableString);
                d11.append(", options=");
                d11.append(list);
                d11.append(", showStepIndicator=");
                return Pk0.a.a(")", d11, z11);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0080\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b&\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b(\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b\u000f\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ApproveButton;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ButtonField;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "deeplink", "description", "errorFoundDeeplink", "", "showErrorBtn", "isEnabled", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZZ)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZZ)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ApproveButton;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "getDeeplink", "getDescription", "getErrorFoundDeeplink", "Z", "getShowErrorBtn", "()Z", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ApproveButton extends Field implements ButtonField {
            private final String deeplink;
            private final OzonSpannableString description;
            private final String displayValue;
            private final String error;
            private final String errorFoundDeeplink;
            private final boolean isEnabled;

            @NotNull
            private final String name;
            private final boolean showErrorBtn;

            @NotNull
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApproveButton(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3, String str4, OzonSpannableString ozonSpannableString, String str5, boolean z11, boolean z12) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.deeplink = str4;
                this.description = ozonSpannableString;
                this.errorFoundDeeplink = str5;
                this.showErrorBtn = z11;
                this.isEnabled = z12;
                this.viewType = ViewType.APPROVE_BUTTON;
            }

            public static /* synthetic */ ApproveButton copy$default(ApproveButton approveButton, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, String str5, OzonSpannableString ozonSpannableString2, String str6, boolean z11, boolean z12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = approveButton.title;
                }
                if ((i11 & 2) != 0) {
                    str = approveButton.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = approveButton.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = approveButton.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = approveButton.error;
                }
                if ((i11 & 32) != 0) {
                    str5 = approveButton.deeplink;
                }
                if ((i11 & 64) != 0) {
                    ozonSpannableString2 = approveButton.description;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str6 = approveButton.errorFoundDeeplink;
                }
                if ((i11 & 256) != 0) {
                    z11 = approveButton.showErrorBtn;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    z12 = approveButton.isEnabled;
                }
                boolean z13 = z11;
                boolean z14 = z12;
                OzonSpannableString ozonSpannableString3 = ozonSpannableString2;
                String str7 = str6;
                String str8 = str4;
                String str9 = str5;
                return approveButton.copy(ozonSpannableString, str, str2, str3, str8, str9, ozonSpannableString3, str7, z13, z14);
            }

            @NotNull
            public final ApproveButton copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, String deeplink, OzonSpannableString description, String errorFoundDeeplink, boolean showErrorBtn, boolean isEnabled) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                return new ApproveButton(title, name, value, displayValue, error, deeplink, description, errorFoundDeeplink, showErrorBtn, isEnabled);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, null, null, null, false, false, 995, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ApproveButton)) {
                    return false;
                }
                ApproveButton approveButton = (ApproveButton) other;
                return Intrinsics.d(this.title, approveButton.title) && Intrinsics.d(this.name, approveButton.name) && Intrinsics.d(this.value, approveButton.value) && Intrinsics.d(this.displayValue, approveButton.displayValue) && Intrinsics.d(this.error, approveButton.error) && Intrinsics.d(this.deeplink, approveButton.deeplink) && Intrinsics.d(this.description, approveButton.description) && Intrinsics.d(this.errorFoundDeeplink, approveButton.errorFoundDeeplink) && this.showErrorBtn == approveButton.showErrorBtn && this.isEnabled == approveButton.isEnabled;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field.ButtonField
            public OzonSpannableString getDescription() {
                return this.description;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            public final String getErrorFoundDeeplink() {
                return this.errorFoundDeeplink;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            public final boolean getShowErrorBtn() {
                return this.showErrorBtn;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.deeplink;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                OzonSpannableString ozonSpannableString = this.description;
                int hashCode5 = (hashCode4 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
                String str5 = this.errorFoundDeeplink;
                return Boolean.hashCode(this.isEnabled) + C3532b.a((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.showErrorBtn);
            }

            /* renamed from: isEnabled, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                String str5 = this.deeplink;
                OzonSpannableString ozonSpannableString2 = this.description;
                String str6 = this.errorFoundDeeplink;
                boolean z11 = this.showErrorBtn;
                boolean z12 = this.isEnabled;
                StringBuilder f7 = b.f("ApproveButton(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                a.h(f7, str4, ", deeplink=", str5, ", description=");
                HY.a.c(", errorFoundDeeplink=", str6, ", showErrorBtn=", f7, ozonSpannableString2);
                f7.append(z11);
                f7.append(", isEnabled=");
                f7.append(z12);
                f7.append(")");
                return f7.toString();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ButtonField;", "", "description", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getDescription", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface ButtonField {
            OzonSpannableString getDescription();
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000b\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\u0010R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Checkbox;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Checkbox;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Checkbox extends Field {
            private final String displayValue;
            private final String error;

            @NotNull
            private final String name;

            @NotNull
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Checkbox(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.viewType = ViewType.CHECKBOX;
            }

            public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = checkbox.title;
                }
                if ((i11 & 2) != 0) {
                    str = checkbox.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = checkbox.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = checkbox.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = checkbox.error;
                }
                String str5 = str4;
                String str6 = str2;
                return checkbox.copy(ozonSpannableString, str, str6, str3, str5);
            }

            @NotNull
            public final Checkbox copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                return new Checkbox(title, name, value, displayValue, error);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, 3, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Checkbox)) {
                    return false;
                }
                Checkbox checkbox = (Checkbox) other;
                return Intrinsics.d(this.title, checkbox.title) && Intrinsics.d(this.name, checkbox.name) && Intrinsics.d(this.value, checkbox.value) && Intrinsics.d(this.displayValue, checkbox.displayValue) && Intrinsics.d(this.error, checkbox.error);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                StringBuilder f7 = b.f("Checkbox(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                return o0.c(f7, str4, ")");
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJX\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010\u0013R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Checker;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Checker;", "options", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Checker;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Checker extends Field {
            private final String displayValue;
            private final String error;

            @NotNull
            private final String name;

            @NotNull
            private final List<Options.Checker> options;

            @NotNull
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Checker(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3, @NotNull List<Options.Checker> options) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(options, "options");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.options = options;
                this.viewType = ViewType.CHECKER;
            }

            public static /* synthetic */ Checker copy$default(Checker checker, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = checker.title;
                }
                if ((i11 & 2) != 0) {
                    str = checker.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = checker.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = checker.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = checker.error;
                }
                if ((i11 & 32) != 0) {
                    list = checker.options;
                }
                String str5 = str4;
                List list2 = list;
                return checker.copy(ozonSpannableString, str, str2, str3, str5, list2);
            }

            @NotNull
            public final Checker copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, @NotNull List<Options.Checker> options) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(options, "options");
                return new Checker(title, name, value, displayValue, error, options);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                List<Options.Checker> list = this.options;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                for (Options.Checker checker : list) {
                    arrayList.add(Options.Checker.copy$default(checker, null, null, null, Intrinsics.d(checker.getValue(), value), null, 23, null));
                }
                return copy$default(this, null, null, value, displayValue, error, arrayList, 3, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Checker)) {
                    return false;
                }
                Checker checker = (Checker) other;
                return Intrinsics.d(this.title, checker.title) && Intrinsics.d(this.name, checker.name) && Intrinsics.d(this.value, checker.value) && Intrinsics.d(this.displayValue, checker.displayValue) && Intrinsics.d(this.error, checker.error) && Intrinsics.d(this.options, checker.options);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final List<Options.Checker> getOptions() {
                return this.options;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                return this.options.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                List<Options.Checker> list = this.options;
                StringBuilder f7 = b.f("Checker(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                f7.append(str4);
                f7.append(", options=");
                f7.append(list);
                f7.append(")");
                return f7.toString();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$FocusableField;", "", "focusableViewTag", "", "getFocusableViewTag", "()Ljava/lang/String;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface FocusableField {
            @NotNull
            String getFocusableViewTag();
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\t\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Hidden;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Hidden;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Hidden extends Field {
            private final String displayValue;
            private final String error;

            @NotNull
            private final String name;
            private final String value;

            @NotNull
            private final ViewType viewType;

            public /* synthetic */ Hidden(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, (i11 & 8) != 0 ? null : str4);
            }

            public static /* synthetic */ Hidden copy$default(Hidden hidden, String str, String str2, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = hidden.name;
                }
                if ((i11 & 2) != 0) {
                    str2 = hidden.value;
                }
                if ((i11 & 4) != 0) {
                    str3 = hidden.displayValue;
                }
                if ((i11 & 8) != 0) {
                    str4 = hidden.error;
                }
                return hidden.copy(str, str2, str3, str4);
            }

            @NotNull
            public final Hidden copy(@NotNull String name, String value, String displayValue, String error) {
                Intrinsics.checkNotNullParameter(name, "name");
                return new Hidden(name, value, displayValue, error);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, value, displayValue, error, 1, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Hidden)) {
                    return false;
                }
                Hidden hidden = (Hidden) other;
                return Intrinsics.d(this.name, hidden.name) && Intrinsics.d(this.value, hidden.value) && Intrinsics.d(this.displayValue, hidden.displayValue) && Intrinsics.d(this.error, hidden.error);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.value;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.name;
                String str2 = this.value;
                return C3173b.c(C3660k.d("Hidden(name=", str, ", value=", str2, ", displayValue="), this.displayValue, ", error=", this.error, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Hidden(@NotNull String name, String str, String str2, String str3) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.viewType = ViewType.TEXT;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\r\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0014R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Image;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "description", "", "imageHeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;I)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;I)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Image;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getDescription", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "I", "getImageHeight", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends Field {
            private final OzonSpannableString description;
            private final String displayValue;
            private final String error;
            private final int imageHeight;

            @NotNull
            private final String name;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(@NotNull String name, String str, String str2, String str3, OzonSpannableString ozonSpannableString, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.description = ozonSpannableString;
                this.imageHeight = i11;
                this.viewType = ViewType.IMAGE;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, String str2, String str3, String str4, OzonSpannableString ozonSpannableString, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = image.name;
                }
                if ((i12 & 2) != 0) {
                    str2 = image.value;
                }
                if ((i12 & 4) != 0) {
                    str3 = image.displayValue;
                }
                if ((i12 & 8) != 0) {
                    str4 = image.error;
                }
                if ((i12 & 16) != 0) {
                    ozonSpannableString = image.description;
                }
                if ((i12 & 32) != 0) {
                    i11 = image.imageHeight;
                }
                OzonSpannableString ozonSpannableString2 = ozonSpannableString;
                int i13 = i11;
                return image.copy(str, str2, str3, str4, ozonSpannableString2, i13);
            }

            @NotNull
            public final Image copy(@NotNull String name, String value, String displayValue, String error, OzonSpannableString description, int imageHeight) {
                Intrinsics.checkNotNullParameter(name, "name");
                return new Image(name, value, displayValue, error, description, imageHeight);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, value, displayValue, error, null, 0, 49, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.name, image.name) && Intrinsics.d(this.value, image.value) && Intrinsics.d(this.displayValue, image.displayValue) && Intrinsics.d(this.error, image.error) && Intrinsics.d(this.description, image.description) && this.imageHeight == image.imageHeight;
            }

            public final OzonSpannableString getDescription() {
                return this.description;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            public final int getImageHeight() {
                return this.imageHeight;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.value;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                OzonSpannableString ozonSpannableString = this.description;
                return Integer.hashCode(this.imageHeight) + ((hashCode4 + (ozonSpannableString != null ? ozonSpannableString.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                OzonSpannableString ozonSpannableString = this.description;
                int i11 = this.imageHeight;
                StringBuilder d11 = C3660k.d("Image(name=", str, ", value=", str2, ", displayValue=");
                a.h(d11, str3, ", error=", str4, ", description=");
                d11.append((Object) ozonSpannableString);
                d11.append(", imageHeight=");
                d11.append(i11);
                d11.append(")");
                return d11.toString();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "NUMBER", "PHONE", "EMAIL", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class KeyboardType {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ KeyboardType[] $VALUES;
            public static final KeyboardType DEFAULT = new KeyboardType("DEFAULT", 0);
            public static final KeyboardType NUMBER = new KeyboardType("NUMBER", 1);
            public static final KeyboardType PHONE = new KeyboardType("PHONE", 2);
            public static final KeyboardType EMAIL = new KeyboardType("EMAIL", 3);

            private static final /* synthetic */ KeyboardType[] $values() {
                return new KeyboardType[]{DEFAULT, NUMBER, PHONE, EMAIL};
            }

            static {
                KeyboardType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private KeyboardType(String str, int i11) {
            }

            @NotNull
            public static Xc.a<KeyboardType> getEntries() {
                return $ENTRIES;
            }

            public static KeyboardType valueOf(String str) {
                return (KeyboardType) Enum.valueOf(KeyboardType.class, str);
            }

            public static KeyboardType[] values() {
                return (KeyboardType[]) $VALUES.clone();
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001-BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ^\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Landing;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "description", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Landing$LandingOptions;", "landingOptions", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Landing$LandingOptions;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Landing$LandingOptions;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Landing;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "getDescription", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Landing$LandingOptions;", "getLandingOptions", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Landing$LandingOptions;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "LandingOptions", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Landing extends Field {
            private final OzonSpannableString description;
            private final String displayValue;
            private final String error;

            @NotNull
            private final LandingOptions landingOptions;

            @NotNull
            private final String name;

            @NotNull
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Landing$LandingOptions;", "", "", "image", "maxValue", "maxValueHint", "period", "periodHint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getMaxValue", "getMaxValueHint", "getPeriod", "getPeriodHint", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Landing(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3, OzonSpannableString ozonSpannableString, @NotNull LandingOptions landingOptions) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(landingOptions, "landingOptions");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.description = ozonSpannableString;
                this.landingOptions = landingOptions;
                this.viewType = ViewType.LANDING;
            }

            public static /* synthetic */ Landing copy$default(Landing landing, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, OzonSpannableString ozonSpannableString2, LandingOptions landingOptions, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = landing.title;
                }
                if ((i11 & 2) != 0) {
                    str = landing.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = landing.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = landing.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = landing.error;
                }
                if ((i11 & 32) != 0) {
                    ozonSpannableString2 = landing.description;
                }
                if ((i11 & 64) != 0) {
                    landingOptions = landing.landingOptions;
                }
                OzonSpannableString ozonSpannableString3 = ozonSpannableString2;
                LandingOptions landingOptions2 = landingOptions;
                String str5 = str4;
                String str6 = str2;
                return landing.copy(ozonSpannableString, str, str6, str3, str5, ozonSpannableString3, landingOptions2);
            }

            @NotNull
            public final Landing copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, OzonSpannableString description, @NotNull LandingOptions landingOptions) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(landingOptions, "landingOptions");
                return new Landing(title, name, value, displayValue, error, description, landingOptions);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, null, null, 99, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Landing)) {
                    return false;
                }
                Landing landing = (Landing) other;
                return Intrinsics.d(this.title, landing.title) && Intrinsics.d(this.name, landing.name) && Intrinsics.d(this.value, landing.value) && Intrinsics.d(this.displayValue, landing.displayValue) && Intrinsics.d(this.error, landing.error) && Intrinsics.d(this.description, landing.description) && Intrinsics.d(this.landingOptions, landing.landingOptions);
            }

            public final OzonSpannableString getDescription() {
                return this.description;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @NotNull
            public final LandingOptions getLandingOptions() {
                return this.landingOptions;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                OzonSpannableString ozonSpannableString = this.description;
                return this.landingOptions.hashCode() + ((hashCode3 + (ozonSpannableString != null ? ozonSpannableString.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                OzonSpannableString ozonSpannableString2 = this.description;
                LandingOptions landingOptions = this.landingOptions;
                StringBuilder f7 = b.f("Landing(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                B6.b.c(str4, ", description=", ", landingOptions=", f7, ozonSpannableString2);
                f7.append(landingOptions);
                f7.append(")");
                return f7.toString();
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012Jr\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b&\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b(\u0010\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u000e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b,\u0010\u0016R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Mask;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$FocusableField;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", FormPageDTO.Field.FIELD_TYPE_MASK, "autocompleteUrl", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "keyboardType", "focusableViewTag", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;Ljava/lang/String;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Mask;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "getMask", "getAutocompleteUrl", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "getKeyboardType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "getFocusableViewTag", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Mask extends Field implements FocusableField {
            private final String autocompleteUrl;
            private final String displayValue;
            private final String error;

            @NotNull
            private final String focusableViewTag;

            @NotNull
            private final KeyboardType keyboardType;

            @NotNull
            private final String mask;

            @NotNull
            private final String name;

            @NotNull
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Mask(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3, @NotNull String mask, String str4, @NotNull KeyboardType keyboardType, @NotNull String focusableViewTag) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(mask, "mask");
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                Intrinsics.checkNotNullParameter(focusableViewTag, "focusableViewTag");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.mask = mask;
                this.autocompleteUrl = str4;
                this.keyboardType = keyboardType;
                this.focusableViewTag = focusableViewTag;
                this.viewType = ViewType.MASK;
            }

            public static /* synthetic */ Mask copy$default(Mask mask, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, String str5, String str6, KeyboardType keyboardType, String str7, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = mask.title;
                }
                if ((i11 & 2) != 0) {
                    str = mask.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = mask.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = mask.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = mask.error;
                }
                if ((i11 & 32) != 0) {
                    str5 = mask.mask;
                }
                if ((i11 & 64) != 0) {
                    str6 = mask.autocompleteUrl;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    keyboardType = mask.keyboardType;
                }
                if ((i11 & 256) != 0) {
                    str7 = mask.focusableViewTag;
                }
                KeyboardType keyboardType2 = keyboardType;
                String str8 = str7;
                String str9 = str5;
                String str10 = str6;
                String str11 = str4;
                String str12 = str2;
                return mask.copy(ozonSpannableString, str, str12, str3, str11, str9, str10, keyboardType2, str8);
            }

            @NotNull
            public final Mask copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, @NotNull String mask, String autocompleteUrl, @NotNull KeyboardType keyboardType, @NotNull String focusableViewTag) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(mask, "mask");
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                Intrinsics.checkNotNullParameter(focusableViewTag, "focusableViewTag");
                return new Mask(title, name, value, displayValue, error, mask, autocompleteUrl, keyboardType, focusableViewTag);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, null, null, null, null, 483, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Mask)) {
                    return false;
                }
                Mask mask = (Mask) other;
                return Intrinsics.d(this.title, mask.title) && Intrinsics.d(this.name, mask.name) && Intrinsics.d(this.value, mask.value) && Intrinsics.d(this.displayValue, mask.displayValue) && Intrinsics.d(this.error, mask.error) && Intrinsics.d(this.mask, mask.mask) && Intrinsics.d(this.autocompleteUrl, mask.autocompleteUrl) && this.keyboardType == mask.keyboardType && Intrinsics.d(this.focusableViewTag, mask.focusableViewTag);
            }

            public final String getAutocompleteUrl() {
                return this.autocompleteUrl;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field.FocusableField
            @NotNull
            public String getFocusableViewTag() {
                return this.focusableViewTag;
            }

            @NotNull
            public final KeyboardType getKeyboardType() {
                return this.keyboardType;
            }

            @NotNull
            public final String getMask() {
                return this.mask;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                int a12 = g.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.mask);
                String str4 = this.autocompleteUrl;
                return this.focusableViewTag.hashCode() + ((this.keyboardType.hashCode() + ((a12 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                String str5 = this.mask;
                String str6 = this.autocompleteUrl;
                KeyboardType keyboardType = this.keyboardType;
                String str7 = this.focusableViewTag;
                StringBuilder f7 = b.f("Mask(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                a.h(f7, str4, ", mask=", str5, ", autocompleteUrl=");
                f7.append(str6);
                f7.append(", keyboardType=");
                f7.append(keyboardType);
                f7.append(", focusableViewTag=");
                return o0.c(f7, str7, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options;", "", "<init>", "()V", "TitleValue", "Address", "Picker", "Checker", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Address;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Checker;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$TitleValue;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Options {

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Address;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "toField", "fias", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getToField", "getFias", "getDescription", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Address extends Options {
                private final String description;

                @NotNull
                private final String fias;

                @NotNull
                private final String name;

                @NotNull
                private final String toField;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Address(@NotNull String name, @NotNull String toField, @NotNull String fias, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(toField, "toField");
                    Intrinsics.checkNotNullParameter(fias, "fias");
                    this.name = name;
                    this.toField = toField;
                    this.fias = fias;
                    this.description = str;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Address)) {
                        return false;
                    }
                    Address address = (Address) other;
                    return Intrinsics.d(this.name, address.name) && Intrinsics.d(this.toField, address.toField) && Intrinsics.d(this.fias, address.fias) && Intrinsics.d(this.description, address.description);
                }

                public final String getDescription() {
                    return this.description;
                }

                @NotNull
                public final String getFias() {
                    return this.fias;
                }

                @NotNull
                public final String getName() {
                    return this.name;
                }

                @NotNull
                public final String getToField() {
                    return this.toField;
                }

                public int hashCode() {
                    int a11 = g.a(g.a(this.name.hashCode() * 31, 31, this.toField), 31, this.fias);
                    String str = this.description;
                    return a11 + (str == null ? 0 : str.hashCode());
                }

                @NotNull
                public String toString() {
                    String str = this.name;
                    String str2 = this.toField;
                    return C3173b.c(C3660k.d("Address(name=", str, ", toField=", str2, ", fias="), this.fias, ", description=", this.description, ")");
                }
            }

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Checker;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options;", "", "displayValue", "img", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isSelected", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Checker;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayValue", "getImg", "getValue", "Z", "()Z", "getDeeplink", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Checker extends Options {
                private final String deeplink;

                @NotNull
                private final String displayValue;

                @NotNull
                private final String img;
                private final boolean isSelected;

                @NotNull
                private final String value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Checker(@NotNull String displayValue, @NotNull String img, @NotNull String value, boolean z11, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(displayValue, "displayValue");
                    Intrinsics.checkNotNullParameter(img, "img");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.displayValue = displayValue;
                    this.img = img;
                    this.value = value;
                    this.isSelected = z11;
                    this.deeplink = str;
                }

                public static /* synthetic */ Checker copy$default(Checker checker, String str, String str2, String str3, boolean z11, String str4, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = checker.displayValue;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = checker.img;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = checker.value;
                    }
                    if ((i11 & 8) != 0) {
                        z11 = checker.isSelected;
                    }
                    if ((i11 & 16) != 0) {
                        str4 = checker.deeplink;
                    }
                    String str5 = str4;
                    String str6 = str3;
                    return checker.copy(str, str2, str6, z11, str5);
                }

                @NotNull
                public final Checker copy(@NotNull String displayValue, @NotNull String img, @NotNull String value, boolean isSelected, String deeplink) {
                    Intrinsics.checkNotNullParameter(displayValue, "displayValue");
                    Intrinsics.checkNotNullParameter(img, "img");
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new Checker(displayValue, img, value, isSelected, deeplink);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Checker)) {
                        return false;
                    }
                    Checker checker = (Checker) other;
                    return Intrinsics.d(this.displayValue, checker.displayValue) && Intrinsics.d(this.img, checker.img) && Intrinsics.d(this.value, checker.value) && this.isSelected == checker.isSelected && Intrinsics.d(this.deeplink, checker.deeplink);
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                @NotNull
                public final String getDisplayValue() {
                    return this.displayValue;
                }

                @NotNull
                public final String getImg() {
                    return this.img;
                }

                @NotNull
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    int a11 = C3532b.a(g.a(g.a(this.displayValue.hashCode() * 31, 31, this.img), 31, this.value), 31, this.isSelected);
                    String str = this.deeplink;
                    return a11 + (str == null ? 0 : str.hashCode());
                }

                /* renamed from: isSelected, reason: from getter */
                public final boolean getIsSelected() {
                    return this.isSelected;
                }

                @NotNull
                public String toString() {
                    String str = this.displayValue;
                    String str2 = this.img;
                    String str3 = this.value;
                    boolean z11 = this.isSelected;
                    String str4 = this.deeplink;
                    StringBuilder d11 = C3660k.d("Checker(displayValue=", str, ", img=", str2, ", value=");
                    C2880a.c(str3, ", isSelected=", ", deeplink=", d11, z11);
                    return o0.c(d11, str4, ")");
                }
            }

            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options;", "Landroid/os/Parcelable;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getDisplayValue", "Z", "()Z", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Picker extends Options implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Picker> CREATOR = new Creator();

                @NotNull
                private final String displayValue;
                private final boolean isSelected;

                @NotNull
                private final String value;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Picker> {
                    @Override // android.os.Parcelable.Creator
                    public final Picker createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Picker(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Picker[] newArray(int i11) {
                        return new Picker[i11];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Picker(@NotNull String value, @NotNull String displayValue, boolean z11) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(displayValue, "displayValue");
                    this.value = value;
                    this.displayValue = displayValue;
                    this.isSelected = z11;
                }

                public static /* synthetic */ Picker copy$default(Picker picker, String str, String str2, boolean z11, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = picker.value;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = picker.displayValue;
                    }
                    if ((i11 & 4) != 0) {
                        z11 = picker.isSelected;
                    }
                    return picker.copy(str, str2, z11);
                }

                @NotNull
                public final Picker copy(@NotNull String value, @NotNull String displayValue, boolean isSelected) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(displayValue, "displayValue");
                    return new Picker(value, displayValue, isSelected);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Picker)) {
                        return false;
                    }
                    Picker picker = (Picker) other;
                    return Intrinsics.d(this.value, picker.value) && Intrinsics.d(this.displayValue, picker.displayValue) && this.isSelected == picker.isSelected;
                }

                @NotNull
                public final String getDisplayValue() {
                    return this.displayValue;
                }

                @NotNull
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.isSelected) + g.a(this.value.hashCode() * 31, 31, this.displayValue);
                }

                /* renamed from: isSelected, reason: from getter */
                public final boolean getIsSelected() {
                    return this.isSelected;
                }

                @NotNull
                public String toString() {
                    String str = this.value;
                    String str2 = this.displayValue;
                    return Pk0.a.a(")", C3660k.d("Picker(value=", str, ", displayValue=", str2, ", isSelected="), this.isSelected);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.value);
                    dest.writeString(this.displayValue);
                    dest.writeInt(this.isSelected ? 1 : 0);
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$TitleValue;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getValue", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TitleValue extends Options {

                @NotNull
                private final String title;

                @NotNull
                private final String value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TitleValue(@NotNull String title, @NotNull String value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.title = title;
                    this.value = value;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TitleValue)) {
                        return false;
                    }
                    TitleValue titleValue = (TitleValue) other;
                    return Intrinsics.d(this.title, titleValue.title) && Intrinsics.d(this.value, titleValue.value);
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode() + (this.title.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("TitleValue(title=", this.title, ", value=", this.value, ")");
                }
            }

            public /* synthetic */ Options(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Options() {
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJX\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010\u0013R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "options", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Picker extends Field {
            private final String displayValue;
            private final String error;

            @NotNull
            private final String name;

            @NotNull
            private final List<Options.Picker> options;

            @NotNull
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Picker(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3, @NotNull List<Options.Picker> options) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(options, "options");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.options = options;
                this.viewType = ViewType.PICKER;
            }

            public static /* synthetic */ Picker copy$default(Picker picker, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = picker.title;
                }
                if ((i11 & 2) != 0) {
                    str = picker.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = picker.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = picker.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = picker.error;
                }
                if ((i11 & 32) != 0) {
                    list = picker.options;
                }
                String str5 = str4;
                List list2 = list;
                return picker.copy(ozonSpannableString, str, str2, str3, str5, list2);
            }

            @NotNull
            public final Picker copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, @NotNull List<Options.Picker> options) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(options, "options");
                return new Picker(title, name, value, displayValue, error, options);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                List<Options.Picker> list = this.options;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                for (Options.Picker picker : list) {
                    arrayList.add(Options.Picker.copy$default(picker, null, null, Intrinsics.d(picker.getValue(), value), 3, null));
                }
                return copy$default(this, null, null, value, displayValue, error, arrayList, 3, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Picker)) {
                    return false;
                }
                Picker picker = (Picker) other;
                return Intrinsics.d(this.title, picker.title) && Intrinsics.d(this.name, picker.name) && Intrinsics.d(this.value, picker.value) && Intrinsics.d(this.displayValue, picker.displayValue) && Intrinsics.d(this.error, picker.error) && Intrinsics.d(this.options, picker.options);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final List<Options.Picker> getOptions() {
                return this.options;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                return this.options.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                List<Options.Picker> list = this.options;
                StringBuilder f7 = b.f("Picker(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                f7.append(str4);
                f7.append(", options=");
                f7.append(list);
                f7.append(")");
                return f7.toString();
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJX\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010\u0013R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Radio;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$TitleValue;", "options", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Radio;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Radio extends Field {
            private final String displayValue;
            private final String error;

            @NotNull
            private final String name;

            @NotNull
            private final List<Options.TitleValue> options;

            @NotNull
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Radio(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3, @NotNull List<Options.TitleValue> options) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(options, "options");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.options = options;
                this.viewType = ViewType.RADIO;
            }

            public static /* synthetic */ Radio copy$default(Radio radio, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = radio.title;
                }
                if ((i11 & 2) != 0) {
                    str = radio.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = radio.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = radio.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = radio.error;
                }
                if ((i11 & 32) != 0) {
                    list = radio.options;
                }
                String str5 = str4;
                List list2 = list;
                return radio.copy(ozonSpannableString, str, str2, str3, str5, list2);
            }

            @NotNull
            public final Radio copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, @NotNull List<Options.TitleValue> options) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(options, "options");
                return new Radio(title, name, value, displayValue, error, options);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, null, 35, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Radio)) {
                    return false;
                }
                Radio radio = (Radio) other;
                return Intrinsics.d(this.title, radio.title) && Intrinsics.d(this.name, radio.name) && Intrinsics.d(this.value, radio.value) && Intrinsics.d(this.displayValue, radio.displayValue) && Intrinsics.d(this.error, radio.error) && Intrinsics.d(this.options, radio.options);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final List<Options.TitleValue> getOptions() {
                return this.options;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                return this.options.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                List<Options.TitleValue> list = this.options;
                StringBuilder f7 = b.f("Radio(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                f7.append(str4);
                f7.append(", options=");
                f7.append(list);
                f7.append(")");
                return f7.toString();
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013Jr\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b\u000b\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b,\u0010!R\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b-\u0010\u0017R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Range;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$FocusableField;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "", "isMultiline", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "keyboardType", "description", "focusableViewTag", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Range;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Z", "()Z", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "getKeyboardType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "getDescription", "getFocusableViewTag", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Range extends Field implements FocusableField {
            private final OzonSpannableString description;
            private final String displayValue;
            private final String error;

            @NotNull
            private final String focusableViewTag;
            private final boolean isMultiline;

            @NotNull
            private final KeyboardType keyboardType;

            @NotNull
            private final String name;

            @NotNull
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Range(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3, boolean z11, @NotNull KeyboardType keyboardType, OzonSpannableString ozonSpannableString, @NotNull String focusableViewTag) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                Intrinsics.checkNotNullParameter(focusableViewTag, "focusableViewTag");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.isMultiline = z11;
                this.keyboardType = keyboardType;
                this.description = ozonSpannableString;
                this.focusableViewTag = focusableViewTag;
                this.viewType = ViewType.RANGE;
            }

            public static /* synthetic */ Range copy$default(Range range, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, boolean z11, KeyboardType keyboardType, OzonSpannableString ozonSpannableString2, String str5, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = range.title;
                }
                if ((i11 & 2) != 0) {
                    str = range.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = range.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = range.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = range.error;
                }
                if ((i11 & 32) != 0) {
                    z11 = range.isMultiline;
                }
                if ((i11 & 64) != 0) {
                    keyboardType = range.keyboardType;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    ozonSpannableString2 = range.description;
                }
                if ((i11 & 256) != 0) {
                    str5 = range.focusableViewTag;
                }
                OzonSpannableString ozonSpannableString3 = ozonSpannableString2;
                String str6 = str5;
                boolean z12 = z11;
                KeyboardType keyboardType2 = keyboardType;
                String str7 = str4;
                String str8 = str2;
                return range.copy(ozonSpannableString, str, str8, str3, str7, z12, keyboardType2, ozonSpannableString3, str6);
            }

            @NotNull
            public final Range copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, boolean isMultiline, @NotNull KeyboardType keyboardType, OzonSpannableString description, @NotNull String focusableViewTag) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                Intrinsics.checkNotNullParameter(focusableViewTag, "focusableViewTag");
                return new Range(title, name, value, displayValue, error, isMultiline, keyboardType, description, focusableViewTag);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, false, null, null, null, 483, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Range)) {
                    return false;
                }
                Range range = (Range) other;
                return Intrinsics.d(this.title, range.title) && Intrinsics.d(this.name, range.name) && Intrinsics.d(this.value, range.value) && Intrinsics.d(this.displayValue, range.displayValue) && Intrinsics.d(this.error, range.error) && this.isMultiline == range.isMultiline && this.keyboardType == range.keyboardType && Intrinsics.d(this.description, range.description) && Intrinsics.d(this.focusableViewTag, range.focusableViewTag);
            }

            public final OzonSpannableString getDescription() {
                return this.description;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field.FocusableField
            @NotNull
            public String getFocusableViewTag() {
                return this.focusableViewTag;
            }

            @NotNull
            public final KeyboardType getKeyboardType() {
                return this.keyboardType;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                int hashCode3 = (this.keyboardType.hashCode() + C3532b.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isMultiline)) * 31;
                OzonSpannableString ozonSpannableString = this.description;
                return this.focusableViewTag.hashCode() + ((hashCode3 + (ozonSpannableString != null ? ozonSpannableString.hashCode() : 0)) * 31);
            }

            /* renamed from: isMultiline, reason: from getter */
            public final boolean getIsMultiline() {
                return this.isMultiline;
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                boolean z11 = this.isMultiline;
                KeyboardType keyboardType = this.keyboardType;
                OzonSpannableString ozonSpannableString2 = this.description;
                String str5 = this.focusableViewTag;
                StringBuilder f7 = b.f("Range(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                C2880a.c(str4, ", isMultiline=", ", keyboardType=", f7, z11);
                f7.append(keyboardType);
                f7.append(", description=");
                f7.append((Object) ozonSpannableString2);
                f7.append(", focusableViewTag=");
                return o0.c(f7, str5, ")");
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003345BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012Jt\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b,\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b-\u0010+R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryOptions;", "summaryOptions", "", "showChangeBtn", "changeDeeplink", "showLoader", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryOptions;ZLjava/lang/String;Z)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryOptions;ZLjava/lang/String;Z)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryOptions;", "getSummaryOptions", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryOptions;", "Z", "getShowChangeBtn", "()Z", "getChangeDeeplink", "getShowLoader", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "SummaryOptions", "SummaryButton", "InfoField", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Summary extends Field {
            private final String changeDeeplink;
            private final String displayValue;
            private final String error;

            @NotNull
            private final String name;
            private final boolean showChangeBtn;
            private final boolean showLoader;

            @NotNull
            private final SummaryOptions summaryOptions;
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$InfoField;", "", "", "hint", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHint", "getValue", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class InfoField {
                private final String hint;

                @NotNull
                private final String value;

                public InfoField(String str, @NotNull String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.hint = str;
                    this.value = value;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof InfoField)) {
                        return false;
                    }
                    InfoField infoField = (InfoField) other;
                    return Intrinsics.d(this.hint, infoField.hint) && Intrinsics.d(this.value, infoField.value);
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
                    return e.a("InfoField(hint=", this.hint, ", value=", this.value, ")");
                }
            }

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryButton;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDeeplink", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SummaryButton {

                @NotNull
                private final String deeplink;

                @NotNull
                private final String title;

                public SummaryButton(@NotNull String title, @NotNull String deeplink) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                    this.title = title;
                    this.deeplink = deeplink;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SummaryButton)) {
                        return false;
                    }
                    SummaryButton summaryButton = (SummaryButton) other;
                    return Intrinsics.d(this.title, summaryButton.title) && Intrinsics.d(this.deeplink, summaryButton.deeplink);
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
                    return this.deeplink.hashCode() + (this.title.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("SummaryButton(title=", this.title, ", deeplink=", this.deeplink, ")");
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryOptions;", "", "", "changeDeeplink", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$InfoField;", "fields", "statusIcon", "description", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryButton;", "buttons", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChangeDeeplink", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getStatusIcon", "getDescription", "getButtons", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SummaryOptions {

                @NotNull
                private final List<SummaryButton> buttons;
                private final String changeDeeplink;
                private final String description;

                @NotNull
                private final List<InfoField> fields;
                private final String statusIcon;

                public SummaryOptions(String str, @NotNull List<InfoField> fields, String str2, String str3, @NotNull List<SummaryButton> buttons) {
                    Intrinsics.checkNotNullParameter(fields, "fields");
                    Intrinsics.checkNotNullParameter(buttons, "buttons");
                    this.changeDeeplink = str;
                    this.fields = fields;
                    this.statusIcon = str2;
                    this.description = str3;
                    this.buttons = buttons;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SummaryOptions)) {
                        return false;
                    }
                    SummaryOptions summaryOptions = (SummaryOptions) other;
                    return Intrinsics.d(this.changeDeeplink, summaryOptions.changeDeeplink) && Intrinsics.d(this.fields, summaryOptions.fields) && Intrinsics.d(this.statusIcon, summaryOptions.statusIcon) && Intrinsics.d(this.description, summaryOptions.description) && Intrinsics.d(this.buttons, summaryOptions.buttons);
                }

                @NotNull
                public final List<SummaryButton> getButtons() {
                    return this.buttons;
                }

                public final String getDescription() {
                    return this.description;
                }

                @NotNull
                public final List<InfoField> getFields() {
                    return this.fields;
                }

                public final String getStatusIcon() {
                    return this.statusIcon;
                }

                public int hashCode() {
                    String str = this.changeDeeplink;
                    int b11 = g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.fields);
                    String str2 = this.statusIcon;
                    int hashCode = (b11 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.description;
                    return this.buttons.hashCode() + ((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
                }

                @NotNull
                public String toString() {
                    String str = this.changeDeeplink;
                    List<InfoField> list = this.fields;
                    String str2 = this.statusIcon;
                    String str3 = this.description;
                    List<SummaryButton> list2 = this.buttons;
                    StringBuilder f7 = Tl.b.f("SummaryOptions(changeDeeplink=", str, ", fields=", ", statusIcon=", list);
                    a.h(f7, str2, ", description=", str3, ", buttons=");
                    return C2618u.h(f7, list2, ")");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Summary(OzonSpannableString ozonSpannableString, @NotNull String name, String str, String str2, String str3, @NotNull SummaryOptions summaryOptions, boolean z11, String str4, boolean z12) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(summaryOptions, "summaryOptions");
                this.title = ozonSpannableString;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.summaryOptions = summaryOptions;
                this.showChangeBtn = z11;
                this.changeDeeplink = str4;
                this.showLoader = z12;
                this.viewType = ViewType.SUMMARY;
            }

            public static /* synthetic */ Summary copy$default(Summary summary, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, SummaryOptions summaryOptions, boolean z11, String str5, boolean z12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = summary.title;
                }
                if ((i11 & 2) != 0) {
                    str = summary.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = summary.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = summary.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = summary.error;
                }
                if ((i11 & 32) != 0) {
                    summaryOptions = summary.summaryOptions;
                }
                if ((i11 & 64) != 0) {
                    z11 = summary.showChangeBtn;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str5 = summary.changeDeeplink;
                }
                if ((i11 & 256) != 0) {
                    z12 = summary.showLoader;
                }
                String str6 = str5;
                boolean z13 = z12;
                SummaryOptions summaryOptions2 = summaryOptions;
                boolean z14 = z11;
                String str7 = str4;
                String str8 = str2;
                return summary.copy(ozonSpannableString, str, str8, str3, str7, summaryOptions2, z14, str6, z13);
            }

            @NotNull
            public final Summary copy(OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, @NotNull SummaryOptions summaryOptions, boolean showChangeBtn, String changeDeeplink, boolean showLoader) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(summaryOptions, "summaryOptions");
                return new Summary(title, name, value, displayValue, error, summaryOptions, showChangeBtn, changeDeeplink, showLoader);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, null, false, null, false, 483, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Summary)) {
                    return false;
                }
                Summary summary = (Summary) other;
                return Intrinsics.d(this.title, summary.title) && Intrinsics.d(this.name, summary.name) && Intrinsics.d(this.value, summary.value) && Intrinsics.d(this.displayValue, summary.displayValue) && Intrinsics.d(this.error, summary.error) && Intrinsics.d(this.summaryOptions, summary.summaryOptions) && this.showChangeBtn == summary.showChangeBtn && Intrinsics.d(this.changeDeeplink, summary.changeDeeplink) && this.showLoader == summary.showLoader;
            }

            public final String getChangeDeeplink() {
                return this.changeDeeplink;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            public final boolean getShowChangeBtn() {
                return this.showChangeBtn;
            }

            public final boolean getShowLoader() {
                return this.showLoader;
            }

            @NotNull
            public final SummaryOptions getSummaryOptions() {
                return this.summaryOptions;
            }

            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                OzonSpannableString ozonSpannableString = this.title;
                int a11 = g.a((ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                int a12 = C3532b.a((this.summaryOptions.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.showChangeBtn);
                String str4 = this.changeDeeplink;
                return Boolean.hashCode(this.showLoader) + ((a12 + (str4 != null ? str4.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                SummaryOptions summaryOptions = this.summaryOptions;
                boolean z11 = this.showChangeBtn;
                String str5 = this.changeDeeplink;
                boolean z12 = this.showLoader;
                StringBuilder f7 = b.f("Summary(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                f7.append(str4);
                f7.append(", summaryOptions=");
                f7.append(summaryOptions);
                f7.append(", showChangeBtn=");
                C5766e.a(", changeDeeplink=", str5, ", showLoader=", f7, z11);
                return Pk0.a.a(")", f7, z12);
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012Jf\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b\u000b\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b+\u0010\u0016R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Text;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$FocusableField;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "", "isMultiline", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "keyboardType", "focusableViewTag", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;Ljava/lang/String;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Text;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Z", "()Z", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "getKeyboardType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "getFocusableViewTag", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Text extends Field implements FocusableField {
            private final String displayValue;
            private final String error;

            @NotNull
            private final String focusableViewTag;
            private final boolean isMultiline;

            @NotNull
            private final KeyboardType keyboardType;

            @NotNull
            private final String name;

            @NotNull
            private final OzonSpannableString title;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3, boolean z11, @NotNull KeyboardType keyboardType, @NotNull String focusableViewTag) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                Intrinsics.checkNotNullParameter(focusableViewTag, "focusableViewTag");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.isMultiline = z11;
                this.keyboardType = keyboardType;
                this.focusableViewTag = focusableViewTag;
                this.viewType = ViewType.TEXT;
            }

            public static /* synthetic */ Text copy$default(Text text, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, boolean z11, KeyboardType keyboardType, String str5, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = text.title;
                }
                if ((i11 & 2) != 0) {
                    str = text.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = text.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = text.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = text.error;
                }
                if ((i11 & 32) != 0) {
                    z11 = text.isMultiline;
                }
                if ((i11 & 64) != 0) {
                    keyboardType = text.keyboardType;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str5 = text.focusableViewTag;
                }
                KeyboardType keyboardType2 = keyboardType;
                String str6 = str5;
                String str7 = str4;
                boolean z12 = z11;
                return text.copy(ozonSpannableString, str, str2, str3, str7, z12, keyboardType2, str6);
            }

            @NotNull
            public final Text copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, boolean isMultiline, @NotNull KeyboardType keyboardType, @NotNull String focusableViewTag) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                Intrinsics.checkNotNullParameter(focusableViewTag, "focusableViewTag");
                return new Text(title, name, value, displayValue, error, isMultiline, keyboardType, focusableViewTag);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, false, null, null, 227, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return Intrinsics.d(this.title, text.title) && Intrinsics.d(this.name, text.name) && Intrinsics.d(this.value, text.value) && Intrinsics.d(this.displayValue, text.displayValue) && Intrinsics.d(this.error, text.error) && this.isMultiline == text.isMultiline && this.keyboardType == text.keyboardType && Intrinsics.d(this.focusableViewTag, text.focusableViewTag);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field.FocusableField
            @NotNull
            public String getFocusableViewTag() {
                return this.focusableViewTag;
            }

            @NotNull
            public final KeyboardType getKeyboardType() {
                return this.keyboardType;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                return this.focusableViewTag.hashCode() + ((this.keyboardType.hashCode() + C3532b.a((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.isMultiline)) * 31);
            }

            /* renamed from: isMultiline, reason: from getter */
            public final boolean getIsMultiline() {
                return this.isMultiline;
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                boolean z11 = this.isMultiline;
                KeyboardType keyboardType = this.keyboardType;
                String str5 = this.focusableViewTag;
                StringBuilder f7 = b.f("Text(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                C2880a.c(str4, ", isMultiline=", ", keyboardType=", f7, z11);
                f7.append(keyboardType);
                f7.append(", focusableViewTag=");
                f7.append(str5);
                f7.append(")");
                return f7.toString();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J~\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b&\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b(\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b-\u0010,R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ButtonField;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "uploadUrl", "description", "borderRatio", "", "uploadFromGallery", "returnBack", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZZ)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZZ)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "getUploadUrl", "getDescription", "getBorderRatio", "Z", "getUploadFromGallery", "()Z", "getReturnBack", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UploadPhotoButton extends Field implements ButtonField {
            private final String borderRatio;
            private final OzonSpannableString description;
            private final String displayValue;
            private final String error;

            @NotNull
            private final String name;
            private final boolean returnBack;

            @NotNull
            private final OzonSpannableString title;
            private final boolean uploadFromGallery;

            @NotNull
            private final String uploadUrl;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UploadPhotoButton(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3, @NotNull String uploadUrl, OzonSpannableString ozonSpannableString, String str4, boolean z11, boolean z12) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.uploadUrl = uploadUrl;
                this.description = ozonSpannableString;
                this.borderRatio = str4;
                this.uploadFromGallery = z11;
                this.returnBack = z12;
                this.viewType = ViewType.UPLOAD_PHOTO_BUTTON;
            }

            public static /* synthetic */ UploadPhotoButton copy$default(UploadPhotoButton uploadPhotoButton, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, String str5, OzonSpannableString ozonSpannableString2, String str6, boolean z11, boolean z12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = uploadPhotoButton.title;
                }
                if ((i11 & 2) != 0) {
                    str = uploadPhotoButton.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = uploadPhotoButton.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = uploadPhotoButton.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = uploadPhotoButton.error;
                }
                if ((i11 & 32) != 0) {
                    str5 = uploadPhotoButton.uploadUrl;
                }
                if ((i11 & 64) != 0) {
                    ozonSpannableString2 = uploadPhotoButton.description;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str6 = uploadPhotoButton.borderRatio;
                }
                if ((i11 & 256) != 0) {
                    z11 = uploadPhotoButton.uploadFromGallery;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    z12 = uploadPhotoButton.returnBack;
                }
                boolean z13 = z11;
                boolean z14 = z12;
                OzonSpannableString ozonSpannableString3 = ozonSpannableString2;
                String str7 = str6;
                String str8 = str4;
                String str9 = str5;
                return uploadPhotoButton.copy(ozonSpannableString, str, str2, str3, str8, str9, ozonSpannableString3, str7, z13, z14);
            }

            @NotNull
            public final UploadPhotoButton copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, @NotNull String uploadUrl, OzonSpannableString description, String borderRatio, boolean uploadFromGallery, boolean returnBack) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
                return new UploadPhotoButton(title, name, value, displayValue, error, uploadUrl, description, borderRatio, uploadFromGallery, returnBack);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, null, null, null, false, false, 995, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UploadPhotoButton)) {
                    return false;
                }
                UploadPhotoButton uploadPhotoButton = (UploadPhotoButton) other;
                return Intrinsics.d(this.title, uploadPhotoButton.title) && Intrinsics.d(this.name, uploadPhotoButton.name) && Intrinsics.d(this.value, uploadPhotoButton.value) && Intrinsics.d(this.displayValue, uploadPhotoButton.displayValue) && Intrinsics.d(this.error, uploadPhotoButton.error) && Intrinsics.d(this.uploadUrl, uploadPhotoButton.uploadUrl) && Intrinsics.d(this.description, uploadPhotoButton.description) && Intrinsics.d(this.borderRatio, uploadPhotoButton.borderRatio) && this.uploadFromGallery == uploadPhotoButton.uploadFromGallery && this.returnBack == uploadPhotoButton.returnBack;
            }

            public final String getBorderRatio() {
                return this.borderRatio;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field.ButtonField
            public OzonSpannableString getDescription() {
                return this.description;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            public final boolean getReturnBack() {
                return this.returnBack;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            public final boolean getUploadFromGallery() {
                return this.uploadFromGallery;
            }

            @NotNull
            public final String getUploadUrl() {
                return this.uploadUrl;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                int a12 = g.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.uploadUrl);
                OzonSpannableString ozonSpannableString = this.description;
                int hashCode3 = (a12 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
                String str4 = this.borderRatio;
                return Boolean.hashCode(this.returnBack) + C3532b.a((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.uploadFromGallery);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                String str5 = this.uploadUrl;
                OzonSpannableString ozonSpannableString2 = this.description;
                String str6 = this.borderRatio;
                boolean z11 = this.uploadFromGallery;
                boolean z12 = this.returnBack;
                StringBuilder f7 = b.f("UploadPhotoButton(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                a.h(f7, str4, ", uploadUrl=", str5, ", description=");
                HY.a.c(", borderRatio=", str6, ", uploadFromGallery=", f7, ozonSpannableString2);
                f7.append(z11);
                f7.append(", returnBack=");
                f7.append(z12);
                f7.append(")");
                return f7.toString();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012Jt\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b%\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b&\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b'\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ValidateButton;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ButtonField;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "validationURL", "description", "fullDescription", "", "returnBack", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Z)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Z)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ValidateButton;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "getValidationURL", "getDescription", "getFullDescription", "Z", "getReturnBack", "()Z", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ValidateButton extends Field implements ButtonField {
            private final OzonSpannableString description;
            private final String displayValue;
            private final String error;
            private final String fullDescription;

            @NotNull
            private final String name;
            private final boolean returnBack;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String validationURL;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ValidateButton(@NotNull OzonSpannableString title, @NotNull String name, String str, String str2, String str3, @NotNull String validationURL, OzonSpannableString ozonSpannableString, String str4, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(validationURL, "validationURL");
                this.title = title;
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.validationURL = validationURL;
                this.description = ozonSpannableString;
                this.fullDescription = str4;
                this.returnBack = z11;
                this.viewType = ViewType.VALIDATE_BUTTON;
            }

            public static /* synthetic */ ValidateButton copy$default(ValidateButton validateButton, OzonSpannableString ozonSpannableString, String str, String str2, String str3, String str4, String str5, OzonSpannableString ozonSpannableString2, String str6, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = validateButton.title;
                }
                if ((i11 & 2) != 0) {
                    str = validateButton.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = validateButton.value;
                }
                if ((i11 & 8) != 0) {
                    str3 = validateButton.displayValue;
                }
                if ((i11 & 16) != 0) {
                    str4 = validateButton.error;
                }
                if ((i11 & 32) != 0) {
                    str5 = validateButton.validationURL;
                }
                if ((i11 & 64) != 0) {
                    ozonSpannableString2 = validateButton.description;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str6 = validateButton.fullDescription;
                }
                if ((i11 & 256) != 0) {
                    z11 = validateButton.returnBack;
                }
                String str7 = str6;
                boolean z12 = z11;
                String str8 = str5;
                OzonSpannableString ozonSpannableString3 = ozonSpannableString2;
                String str9 = str4;
                String str10 = str2;
                return validateButton.copy(ozonSpannableString, str, str10, str3, str9, str8, ozonSpannableString3, str7, z12);
            }

            @NotNull
            public final ValidateButton copy(@NotNull OzonSpannableString title, @NotNull String name, String value, String displayValue, String error, @NotNull String validationURL, OzonSpannableString description, String fullDescription, boolean returnBack) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(validationURL, "validationURL");
                return new ValidateButton(title, name, value, displayValue, error, validationURL, description, fullDescription, returnBack);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, null, value, displayValue, error, null, null, null, false, 483, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidateButton)) {
                    return false;
                }
                ValidateButton validateButton = (ValidateButton) other;
                return Intrinsics.d(this.title, validateButton.title) && Intrinsics.d(this.name, validateButton.name) && Intrinsics.d(this.value, validateButton.value) && Intrinsics.d(this.displayValue, validateButton.displayValue) && Intrinsics.d(this.error, validateButton.error) && Intrinsics.d(this.validationURL, validateButton.validationURL) && Intrinsics.d(this.description, validateButton.description) && Intrinsics.d(this.fullDescription, validateButton.fullDescription) && this.returnBack == validateButton.returnBack;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field.ButtonField
            public OzonSpannableString getDescription() {
                return this.description;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            public final boolean getReturnBack() {
                return this.returnBack;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            public final String getValidationURL() {
                return this.validationURL;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.name);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                int a12 = g.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.validationURL);
                OzonSpannableString ozonSpannableString = this.description;
                int hashCode3 = (a12 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
                String str4 = this.fullDescription;
                return Boolean.hashCode(this.returnBack) + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                String str5 = this.validationURL;
                OzonSpannableString ozonSpannableString2 = this.description;
                String str6 = this.fullDescription;
                boolean z11 = this.returnBack;
                StringBuilder f7 = b.f("ValidateButton(title=", ozonSpannableString, ", name=", str, ", value=");
                a.h(f7, str2, ", displayValue=", str3, ", error=");
                a.h(f7, str4, ", validationURL=", str5, ", description=");
                HY.a.c(", fullDescription=", str6, ", returnBack=", f7, ozonSpannableString2);
                return Pk0.a.a(")", f7, z11);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TEXT", "RANGE", "MASK", "RADIO", "ADDRESS_SELECTOR", "ADDRESS", "LANDING", "IMAGE", "PICKER", "CHECKBOX", "CHECKER", "SUMMARY", "SEPARATOR", "VALIDATE_BUTTON", "UPLOAD_PHOTO_BUTTON", "APPROVE_BUTTON", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ViewType {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ ViewType[] $VALUES;
            private final int value;
            public static final ViewType TEXT = new ViewType("TEXT", 0, 1);
            public static final ViewType RANGE = new ViewType("RANGE", 1, 2);
            public static final ViewType MASK = new ViewType("MASK", 2, 3);
            public static final ViewType RADIO = new ViewType("RADIO", 3, 4);
            public static final ViewType ADDRESS_SELECTOR = new ViewType("ADDRESS_SELECTOR", 4, 5);
            public static final ViewType ADDRESS = new ViewType("ADDRESS", 5, 6);
            public static final ViewType LANDING = new ViewType("LANDING", 6, 8);
            public static final ViewType IMAGE = new ViewType("IMAGE", 7, 9);
            public static final ViewType PICKER = new ViewType("PICKER", 8, 10);
            public static final ViewType CHECKBOX = new ViewType("CHECKBOX", 9, 11);
            public static final ViewType CHECKER = new ViewType("CHECKER", 10, 12);
            public static final ViewType SUMMARY = new ViewType("SUMMARY", 11, 13);
            public static final ViewType SEPARATOR = new ViewType("SEPARATOR", 12, 14);
            public static final ViewType VALIDATE_BUTTON = new ViewType("VALIDATE_BUTTON", 13, 15);
            public static final ViewType UPLOAD_PHOTO_BUTTON = new ViewType("UPLOAD_PHOTO_BUTTON", 14, 16);
            public static final ViewType APPROVE_BUTTON = new ViewType("APPROVE_BUTTON", 15, 17);

            private static final /* synthetic */ ViewType[] $values() {
                return new ViewType[]{TEXT, RANGE, MASK, RADIO, ADDRESS_SELECTOR, ADDRESS, LANDING, IMAGE, PICKER, CHECKBOX, CHECKER, SUMMARY, SEPARATOR, VALIDATE_BUTTON, UPLOAD_PHOTO_BUTTON, APPROVE_BUTTON};
            }

            static {
                ViewType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private ViewType(String str, int i11, int i12) {
                this.value = i12;
            }

            public static ViewType valueOf(String str) {
                return (ViewType) Enum.valueOf(ViewType.class, str);
            }

            public static ViewType[] values() {
                return (ViewType[]) $VALUES.clone();
            }

            public final int getValue() {
                return this.value;
            }
        }

        public /* synthetic */ Field(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Field copyWithValue$default(Field field, String str, String str2, String str3, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyWithValue");
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            return field.copyWithValue(str, str2, str3);
        }

        @NotNull
        public abstract Field copyWithValue(String value, String displayValue, String error);

        public abstract String getDisplayValue();

        public abstract String getError();

        @NotNull
        public abstract String getName();

        public abstract String getValue();

        @NotNull
        public abstract ViewType getViewType();

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J`\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Separator;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ButtonField;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "error", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "description", "", "height", "background", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;ILjava/lang/Integer;)V", "copyWithValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;ILjava/lang/Integer;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Separator;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "getDisplayValue", "getError", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getDescription", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "I", "getHeight", "Ljava/lang/Integer;", "getBackground", "()Ljava/lang/Integer;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "viewType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "getViewType", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ViewType;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Separator extends Field implements ButtonField {
            private final Integer background;
            private final OzonSpannableString description;
            private final String displayValue;
            private final String error;
            private final int height;

            @NotNull
            private final String name;
            private final String value;

            @NotNull
            private final ViewType viewType;

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ Separator(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, ru.ozon.uni.atoms.utils.OzonSpannableString r6, int r7, java.lang.Integer r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
                /*
                    r1 = this;
                    r10 = r9 & 1
                    if (r10 == 0) goto L6
                    java.lang.String r2 = ""
                L6:
                    r10 = r9 & 2
                    r0 = 0
                    if (r10 == 0) goto Lc
                    r3 = r0
                Lc:
                    r10 = r9 & 4
                    if (r10 == 0) goto L11
                    r4 = r0
                L11:
                    r10 = r9 & 8
                    if (r10 == 0) goto L16
                    r5 = r0
                L16:
                    r9 = r9 & 16
                    r10 = r8
                    if (r9 == 0) goto L23
                    r8 = r0
                    r6 = r4
                    r9 = r7
                    r4 = r2
                    r7 = r5
                    r5 = r3
                    r3 = r1
                    goto L2a
                L23:
                    r8 = r6
                    r9 = r7
                    r7 = r5
                    r5 = r3
                    r6 = r4
                    r3 = r1
                    r4 = r2
                L2a:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field.Separator.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, int, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ Separator copy$default(Separator separator, String str, String str2, String str3, String str4, OzonSpannableString ozonSpannableString, int i11, Integer num, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = separator.name;
                }
                if ((i12 & 2) != 0) {
                    str2 = separator.value;
                }
                if ((i12 & 4) != 0) {
                    str3 = separator.displayValue;
                }
                if ((i12 & 8) != 0) {
                    str4 = separator.error;
                }
                if ((i12 & 16) != 0) {
                    ozonSpannableString = separator.description;
                }
                if ((i12 & 32) != 0) {
                    i11 = separator.height;
                }
                if ((i12 & 64) != 0) {
                    num = separator.background;
                }
                int i13 = i11;
                Integer num2 = num;
                OzonSpannableString ozonSpannableString2 = ozonSpannableString;
                String str5 = str3;
                return separator.copy(str, str2, str5, str4, ozonSpannableString2, i13, num2);
            }

            @NotNull
            public final Separator copy(@NotNull String name, String value, String displayValue, String error, OzonSpannableString description, int height, Integer background) {
                Intrinsics.checkNotNullParameter(name, "name");
                return new Separator(name, value, displayValue, error, description, height, background);
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public Field copyWithValue(String value, String displayValue, String error) {
                return copy$default(this, null, value, displayValue, error, null, 0, null, 113, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Separator)) {
                    return false;
                }
                Separator separator = (Separator) other;
                return Intrinsics.d(this.name, separator.name) && Intrinsics.d(this.value, separator.value) && Intrinsics.d(this.displayValue, separator.displayValue) && Intrinsics.d(this.error, separator.error) && Intrinsics.d(this.description, separator.description) && this.height == separator.height && Intrinsics.d(this.background, separator.background);
            }

            public final Integer getBackground() {
                return this.background;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field.ButtonField
            public OzonSpannableString getDescription() {
                return this.description;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getDisplayValue() {
                return this.displayValue;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getError() {
                return this.error;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            public String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.value;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.displayValue;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                OzonSpannableString ozonSpannableString = this.description;
                int a11 = C2454a.a(this.height, (hashCode4 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31);
                Integer num = this.background;
                return a11 + (num != null ? num.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.name;
                String str2 = this.value;
                String str3 = this.displayValue;
                String str4 = this.error;
                OzonSpannableString ozonSpannableString = this.description;
                int i11 = this.height;
                Integer num = this.background;
                StringBuilder d11 = C3660k.d("Separator(name=", str, ", value=", str2, ", displayValue=");
                a.h(d11, str3, ", error=", str4, ", description=");
                d11.append((Object) ozonSpannableString);
                d11.append(", height=");
                d11.append(i11);
                d11.append(", background=");
                return Ep.a.c(d11, num, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Separator(@NotNull String name, String str, String str2, String str3, OzonSpannableString ozonSpannableString, int i11, Integer num) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                this.name = name;
                this.value = str;
                this.displayValue = str2;
                this.error = str3;
                this.description = ozonSpannableString;
                this.height = i11;
                this.background = num;
                this.viewType = ViewType.SEPARATOR;
            }
        }

        private Field() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormPageVO(long j11, @NotNull String name, String str, @NotNull List<? extends Field> fields, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.id = j11;
        this.name = name;
        this.title = str;
        this.fields = fields;
        this.refreshOnBack = z11;
    }

    public static /* synthetic */ FormPageVO copy$default(FormPageVO formPageVO, long j11, String str, String str2, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = formPageVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = formPageVO.name;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = formPageVO.title;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            list = formPageVO.fields;
        }
        List list2 = list;
        if ((i11 & 16) != 0) {
            z11 = formPageVO.refreshOnBack;
        }
        return formPageVO.copy(j12, str3, str4, list2, z11);
    }

    @NotNull
    public final FormPageVO copy(long id2, @NotNull String name, String title, @NotNull List<? extends Field> fields, boolean refreshOnBack) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new FormPageVO(id2, name, title, fields, refreshOnBack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormPageVO)) {
            return false;
        }
        FormPageVO formPageVO = (FormPageVO) other;
        return this.id == formPageVO.id && Intrinsics.d(this.name, formPageVO.name) && Intrinsics.d(this.title, formPageVO.title) && Intrinsics.d(this.fields, formPageVO.fields) && this.refreshOnBack == formPageVO.refreshOnBack;
    }

    @NotNull
    public final List<Field> getFields() {
        return this.fields;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final boolean getRefreshOnBack() {
        return this.refreshOnBack;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.name);
        String str = this.title;
        return Boolean.hashCode(this.refreshOnBack) + g.b((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.fields);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.name;
        String str2 = this.title;
        List<Field> list = this.fields;
        boolean z11 = this.refreshOnBack;
        StringBuilder c11 = C2436a.c(j11, "FormPageVO(id=", ", name=", str);
        a.g(", title=", str2, ", fields=", c11, list);
        return Bi.b.f(c11, ", refreshOnBack=", z11, ")");
    }
}
