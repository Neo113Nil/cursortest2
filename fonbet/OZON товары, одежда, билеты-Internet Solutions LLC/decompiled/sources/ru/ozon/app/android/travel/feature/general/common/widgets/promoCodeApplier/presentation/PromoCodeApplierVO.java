package ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.presentation;

import G.g;
import N3.C3660k;
import Sh.a;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.data.PromoCodeApplierDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001!BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO$InputVO;", "input", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO$InputVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO$InputVO;", "getInput", "()Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO$InputVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "InputVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoCodeApplierVO implements c {

    @NotNull
    private final ButtonV3DTO button;
    private final long id;

    @NotNull
    private final InputVO input;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t trackingInfo;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b \u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b$\u0010\u0012R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO$InputVO;", "", "", "label", AppMeasurementSdk.ConditionalUserProperty.NAME, "size", "", "hasClearButton", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$Status;", "status", "error", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$Status;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getName", "getSize", "Ljava/lang/Boolean;", "getHasClearButton", "()Ljava/lang/Boolean;", "getValue", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$Status;", "getStatus", "()Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO$Status;", "getError", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputVO {
        private final String error;
        private final Boolean hasClearButton;

        @NotNull
        private final String label;
        private final String name;
        private final String size;

        @NotNull
        private final PromoCodeApplierDTO.Status status;
        private final t trackingInfo;

        @NotNull
        private final String value;

        public InputVO(@NotNull String label, String str, String str2, Boolean bool, @NotNull String value, @NotNull PromoCodeApplierDTO.Status status, String str3, t tVar) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(status, "status");
            this.label = label;
            this.name = str;
            this.size = str2;
            this.hasClearButton = bool;
            this.value = value;
            this.status = status;
            this.error = str3;
            this.trackingInfo = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputVO)) {
                return false;
            }
            InputVO inputVO = (InputVO) other;
            return Intrinsics.d(this.label, inputVO.label) && Intrinsics.d(this.name, inputVO.name) && Intrinsics.d(this.size, inputVO.size) && Intrinsics.d(this.hasClearButton, inputVO.hasClearButton) && Intrinsics.d(this.value, inputVO.value) && this.status == inputVO.status && Intrinsics.d(this.error, inputVO.error) && Intrinsics.d(this.trackingInfo, inputVO.trackingInfo);
        }

        public final String getError() {
            return this.error;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        public final String getName() {
            return this.name;
        }

        @NotNull
        public final PromoCodeApplierDTO.Status getStatus() {
            return this.status;
        }

        public final t getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.label.hashCode() * 31;
            String str = this.name;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.size;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.hasClearButton;
            int hashCode4 = (this.status.hashCode() + g.a((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.value)) * 31;
            String str3 = this.error;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            t tVar = this.trackingInfo;
            return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.label;
            String str2 = this.name;
            String str3 = this.size;
            Boolean bool = this.hasClearButton;
            String str4 = this.value;
            PromoCodeApplierDTO.Status status = this.status;
            String str5 = this.error;
            t tVar = this.trackingInfo;
            StringBuilder d11 = C3660k.d("InputVO(label=", str, ", name=", str2, ", size=");
            a.d(bool, str3, ", hasClearButton=", ", value=", d11);
            d11.append(str4);
            d11.append(", status=");
            d11.append(status);
            d11.append(", error=");
            d11.append(str5);
            d11.append(", trackingInfo=");
            d11.append(tVar);
            d11.append(")");
            return d11.toString();
        }
    }

    public PromoCodeApplierVO(long j11, @NotNull TextDTO title, TextDTO textDTO, @NotNull InputVO input, @NotNull ButtonV3DTO button, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.input = input;
        this.button = button;
        this.trackingInfo = tVar;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final InputVO getInput() {
        return this.input;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
