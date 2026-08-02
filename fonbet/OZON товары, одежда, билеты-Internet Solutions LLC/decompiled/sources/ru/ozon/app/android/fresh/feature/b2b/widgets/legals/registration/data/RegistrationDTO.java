package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data;

import B0.A0;
import D3.h;
import De.C2859b;
import De.C2860c;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002'(BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO;", "", "requisites", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "fields", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO;", "banner", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$Banner;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$Banner;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getRequisites", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getFields", "()Ljava/util/List;", "getBanner", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$Banner;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "FieldDTO", "Banner", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RegistrationDTO {
    public static final int $stable = 8;
    private final Banner banner;

    @NotNull
    private final ButtonV3DTO button;
    private final List<FieldDTO> fields;
    private final CellDTO requisites;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$Banner;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "image", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getImage", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Banner {
        public static final int $stable = 0;
        private final String backgroundColor;

        @NotNull
        private final String image;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public Banner(@NotNull TextDTO title, TextDTO textDTO, @NotNull String image, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            this.title = title;
            this.subtitle = textDTO;
            this.image = image;
            this.backgroundColor = str;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, TextDTO textDTO, TextDTO textDTO2, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = banner.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = banner.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = banner.image;
            }
            if ((i11 & 8) != 0) {
                str2 = banner.backgroundColor;
            }
            return banner.copy(textDTO, textDTO2, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Banner copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull String image, String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            return new Banner(title, subtitle, image, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.d(this.title, banner.title) && Intrinsics.d(this.subtitle, banner.subtitle) && Intrinsics.d(this.image, banner.image) && Intrinsics.d(this.backgroundColor, banner.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int a11 = g.a((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.image);
            String str = this.backgroundColor;
            return a11 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            return C3173b.c(D3.g.g("Banner(title=", textDTO, ", subtitle=", textDTO2, ", image="), this.image, ", backgroundColor=", this.backgroundColor, ")");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "input", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO;", "checkbox", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getInput", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO;", "getCheckbox", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InputDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class FieldDTO {
        public static final int $stable = CellDTO.$stable;
        private final CellDTO checkbox;
        private final InputDTO input;
        private final TextDTO subtitle;
        private final TextDTO title;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u0013HÆ\u0003J\u0096\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\rHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u000f\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "caption", "required", "", "readOnly", "lexemes", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO$Errors;", "minLength", "", "maxLength", "isAddress", "viewType", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;", "keyboardType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO$Errors;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;)V", "getName", "()Ljava/lang/String;", "getValue", "getPlaceholder", "getCaption", "getRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReadOnly", "getLexemes", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO$Errors;", "getMinLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxLength", "getViewType", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;", "getKeyboardType", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO$Errors;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO;", "equals", "other", "hashCode", "toString", "Errors", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class InputDTO {
            public static final int $stable = 0;
            private final String caption;
            private final Boolean isAddress;

            @NotNull
            private final OzonTextInputLayoutModel.KeyboardType keyboardType;
            private final Errors lexemes;
            private final Integer maxLength;
            private final Integer minLength;

            @NotNull
            private final String name;

            @NotNull
            private final String placeholder;
            private final Boolean readOnly;
            private final Boolean required;
            private final String value;

            @NotNull
            private final ViewType viewType;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO$Errors;", "", "emptyTextErrorMessage", "", "<init>", "(Ljava/lang/String;)V", "getEmptyTextErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Errors {
                public static final int $stable = 0;
                private final String emptyTextErrorMessage;

                public Errors(String str) {
                    this.emptyTextErrorMessage = str;
                }

                public static /* synthetic */ Errors copy$default(Errors errors, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = errors.emptyTextErrorMessage;
                    }
                    return errors.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getEmptyTextErrorMessage() {
                    return this.emptyTextErrorMessage;
                }

                @NotNull
                public final Errors copy(String emptyTextErrorMessage) {
                    return new Errors(emptyTextErrorMessage);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Errors) && Intrinsics.d(this.emptyTextErrorMessage, ((Errors) other).emptyTextErrorMessage);
                }

                public final String getEmptyTextErrorMessage() {
                    return this.emptyTextErrorMessage;
                }

                public int hashCode() {
                    String str = this.emptyTextErrorMessage;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @NotNull
                public String toString() {
                    return A0.b("Errors(emptyTextErrorMessage=", this.emptyTextErrorMessage, ")");
                }
            }

            public InputDTO(@NotNull String name, String str, @NotNull String placeholder, String str2, Boolean bool, Boolean bool2, Errors errors, Integer num, Integer num2, Boolean bool3, @NotNull ViewType viewType, @NotNull OzonTextInputLayoutModel.KeyboardType keyboardType) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                this.name = name;
                this.value = str;
                this.placeholder = placeholder;
                this.caption = str2;
                this.required = bool;
                this.readOnly = bool2;
                this.lexemes = errors;
                this.minLength = num;
                this.maxLength = num2;
                this.isAddress = bool3;
                this.viewType = viewType;
                this.keyboardType = keyboardType;
            }

            public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Errors errors, Integer num, Integer num2, Boolean bool3, ViewType viewType, OzonTextInputLayoutModel.KeyboardType keyboardType, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = inputDTO.name;
                }
                if ((i11 & 2) != 0) {
                    str2 = inputDTO.value;
                }
                if ((i11 & 4) != 0) {
                    str3 = inputDTO.placeholder;
                }
                if ((i11 & 8) != 0) {
                    str4 = inputDTO.caption;
                }
                if ((i11 & 16) != 0) {
                    bool = inputDTO.required;
                }
                if ((i11 & 32) != 0) {
                    bool2 = inputDTO.readOnly;
                }
                if ((i11 & 64) != 0) {
                    errors = inputDTO.lexemes;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    num = inputDTO.minLength;
                }
                if ((i11 & 256) != 0) {
                    num2 = inputDTO.maxLength;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    bool3 = inputDTO.isAddress;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    viewType = inputDTO.viewType;
                }
                if ((i11 & 2048) != 0) {
                    keyboardType = inputDTO.keyboardType;
                }
                ViewType viewType2 = viewType;
                OzonTextInputLayoutModel.KeyboardType keyboardType2 = keyboardType;
                Integer num3 = num2;
                Boolean bool4 = bool3;
                Errors errors2 = errors;
                Integer num4 = num;
                Boolean bool5 = bool;
                Boolean bool6 = bool2;
                return inputDTO.copy(str, str2, str3, str4, bool5, bool6, errors2, num4, num3, bool4, viewType2, keyboardType2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component10, reason: from getter */
            public final Boolean getIsAddress() {
                return this.isAddress;
            }

            @NotNull
            /* renamed from: component11, reason: from getter */
            public final ViewType getViewType() {
                return this.viewType;
            }

            @NotNull
            /* renamed from: component12, reason: from getter */
            public final OzonTextInputLayoutModel.KeyboardType getKeyboardType() {
                return this.keyboardType;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* renamed from: component4, reason: from getter */
            public final String getCaption() {
                return this.caption;
            }

            /* renamed from: component5, reason: from getter */
            public final Boolean getRequired() {
                return this.required;
            }

            /* renamed from: component6, reason: from getter */
            public final Boolean getReadOnly() {
                return this.readOnly;
            }

            /* renamed from: component7, reason: from getter */
            public final Errors getLexemes() {
                return this.lexemes;
            }

            /* renamed from: component8, reason: from getter */
            public final Integer getMinLength() {
                return this.minLength;
            }

            /* renamed from: component9, reason: from getter */
            public final Integer getMaxLength() {
                return this.maxLength;
            }

            @NotNull
            public final InputDTO copy(@NotNull String name, String value, @NotNull String placeholder, String caption, Boolean required, Boolean readOnly, Errors lexemes, Integer minLength, Integer maxLength, Boolean isAddress, @NotNull ViewType viewType, @NotNull OzonTextInputLayoutModel.KeyboardType keyboardType) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
                return new InputDTO(name, value, placeholder, caption, required, readOnly, lexemes, minLength, maxLength, isAddress, viewType, keyboardType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InputDTO)) {
                    return false;
                }
                InputDTO inputDTO = (InputDTO) other;
                return Intrinsics.d(this.name, inputDTO.name) && Intrinsics.d(this.value, inputDTO.value) && Intrinsics.d(this.placeholder, inputDTO.placeholder) && Intrinsics.d(this.caption, inputDTO.caption) && Intrinsics.d(this.required, inputDTO.required) && Intrinsics.d(this.readOnly, inputDTO.readOnly) && Intrinsics.d(this.lexemes, inputDTO.lexemes) && Intrinsics.d(this.minLength, inputDTO.minLength) && Intrinsics.d(this.maxLength, inputDTO.maxLength) && Intrinsics.d(this.isAddress, inputDTO.isAddress) && this.viewType == inputDTO.viewType && this.keyboardType == inputDTO.keyboardType;
            }

            public final String getCaption() {
                return this.caption;
            }

            @NotNull
            public final OzonTextInputLayoutModel.KeyboardType getKeyboardType() {
                return this.keyboardType;
            }

            public final Errors getLexemes() {
                return this.lexemes;
            }

            public final Integer getMaxLength() {
                return this.maxLength;
            }

            public final Integer getMinLength() {
                return this.minLength;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final Boolean getReadOnly() {
                return this.readOnly;
            }

            public final Boolean getRequired() {
                return this.required;
            }

            public final String getValue() {
                return this.value;
            }

            @NotNull
            public final ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.value;
                int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.placeholder);
                String str2 = this.caption;
                int hashCode2 = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.required;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.readOnly;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Errors errors = this.lexemes;
                int hashCode5 = (hashCode4 + (errors == null ? 0 : errors.hashCode())) * 31;
                Integer num = this.minLength;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.maxLength;
                int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool3 = this.isAddress;
                return this.keyboardType.hashCode() + ((this.viewType.hashCode() + ((hashCode7 + (bool3 != null ? bool3.hashCode() : 0)) * 31)) * 31);
            }

            public final Boolean isAddress() {
                return this.isAddress;
            }

            @NotNull
            public String toString() {
                String str = this.name;
                String str2 = this.value;
                String str3 = this.placeholder;
                String str4 = this.caption;
                Boolean bool = this.required;
                Boolean bool2 = this.readOnly;
                Errors errors = this.lexemes;
                Integer num = this.minLength;
                Integer num2 = this.maxLength;
                Boolean bool3 = this.isAddress;
                ViewType viewType = this.viewType;
                OzonTextInputLayoutModel.KeyboardType keyboardType = this.keyboardType;
                StringBuilder d11 = C3660k.d("InputDTO(name=", str, ", value=", str2, ", placeholder=");
                a.h(d11, str3, ", caption=", str4, ", required=");
                h.h(d11, bool, ", readOnly=", bool2, ", lexemes=");
                d11.append(errors);
                d11.append(", minLength=");
                d11.append(num);
                d11.append(", maxLength=");
                C2860c.f(bool3, num2, ", isAddress=", ", viewType=", d11);
                d11.append(viewType);
                d11.append(", keyboardType=");
                d11.append(keyboardType);
                d11.append(")");
                return d11.toString();
            }
        }

        public FieldDTO(TextDTO textDTO, TextDTO textDTO2, InputDTO inputDTO, CellDTO cellDTO) {
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.input = inputDTO;
            this.checkbox = cellDTO;
        }

        public static /* synthetic */ FieldDTO copy$default(FieldDTO fieldDTO, TextDTO textDTO, TextDTO textDTO2, InputDTO inputDTO, CellDTO cellDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = fieldDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = fieldDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                inputDTO = fieldDTO.input;
            }
            if ((i11 & 8) != 0) {
                cellDTO = fieldDTO.checkbox;
            }
            return fieldDTO.copy(textDTO, textDTO2, inputDTO, cellDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final InputDTO getInput() {
            return this.input;
        }

        /* renamed from: component4, reason: from getter */
        public final CellDTO getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        public final FieldDTO copy(TextDTO title, TextDTO subtitle, InputDTO input, CellDTO checkbox) {
            return new FieldDTO(title, subtitle, input, checkbox);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldDTO)) {
                return false;
            }
            FieldDTO fieldDTO = (FieldDTO) other;
            return Intrinsics.d(this.title, fieldDTO.title) && Intrinsics.d(this.subtitle, fieldDTO.subtitle) && Intrinsics.d(this.input, fieldDTO.input) && Intrinsics.d(this.checkbox, fieldDTO.checkbox);
        }

        public final CellDTO getCheckbox() {
            return this.checkbox;
        }

        public final InputDTO getInput() {
            return this.input;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            InputDTO inputDTO = this.input;
            int hashCode3 = (hashCode2 + (inputDTO == null ? 0 : inputDTO.hashCode())) * 31;
            CellDTO cellDTO = this.checkbox;
            return hashCode3 + (cellDTO != null ? cellDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            InputDTO inputDTO = this.input;
            CellDTO cellDTO = this.checkbox;
            StringBuilder g10 = D3.g.g("FieldDTO(title=", textDTO, ", subtitle=", textDTO2, ", input=");
            g10.append(inputDTO);
            g10.append(", checkbox=");
            g10.append(cellDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    public RegistrationDTO(CellDTO cellDTO, List<FieldDTO> list, Banner banner, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.requisites = cellDTO;
        this.fields = list;
        this.banner = banner;
        this.button = button;
        this.trackingInfo = map;
    }

    public static /* synthetic */ RegistrationDTO copy$default(RegistrationDTO registrationDTO, CellDTO cellDTO, List list, Banner banner, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = registrationDTO.requisites;
        }
        if ((i11 & 2) != 0) {
            list = registrationDTO.fields;
        }
        if ((i11 & 4) != 0) {
            banner = registrationDTO.banner;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = registrationDTO.button;
        }
        if ((i11 & 16) != 0) {
            map = registrationDTO.trackingInfo;
        }
        Map map2 = map;
        Banner banner2 = banner;
        return registrationDTO.copy(cellDTO, list, banner2, buttonV3DTO, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final CellDTO getRequisites() {
        return this.requisites;
    }

    public final List<FieldDTO> component2() {
        return this.fields;
    }

    /* renamed from: component3, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final RegistrationDTO copy(CellDTO requisites, List<FieldDTO> fields, Banner banner, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new RegistrationDTO(requisites, fields, banner, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegistrationDTO)) {
            return false;
        }
        RegistrationDTO registrationDTO = (RegistrationDTO) other;
        return Intrinsics.d(this.requisites, registrationDTO.requisites) && Intrinsics.d(this.fields, registrationDTO.fields) && Intrinsics.d(this.banner, registrationDTO.banner) && Intrinsics.d(this.button, registrationDTO.button) && Intrinsics.d(this.trackingInfo, registrationDTO.trackingInfo);
    }

    public final Banner getBanner() {
        return this.banner;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final List<FieldDTO> getFields() {
        return this.fields;
    }

    public final CellDTO getRequisites() {
        return this.requisites;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        CellDTO cellDTO = this.requisites;
        int hashCode = (cellDTO == null ? 0 : cellDTO.hashCode()) * 31;
        List<FieldDTO> list = this.fields;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Banner banner = this.banner;
        int c11 = C2859b.c(this.button, (hashCode2 + (banner == null ? 0 : banner.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.requisites;
        List<FieldDTO> list = this.fields;
        Banner banner = this.banner;
        ButtonV3DTO buttonV3DTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("RegistrationDTO(requisites=");
        sb2.append(cellDTO);
        sb2.append(", fields=");
        sb2.append(list);
        sb2.append(", banner=");
        sb2.append(banner);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
