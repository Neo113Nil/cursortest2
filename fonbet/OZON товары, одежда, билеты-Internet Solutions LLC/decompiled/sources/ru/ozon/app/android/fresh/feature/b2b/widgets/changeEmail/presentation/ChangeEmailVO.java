package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import Ak.C2436a;
import G.g;
import Lh.a;
import N3.C3660k;
import Ns.b;
import T7.P;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003789Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b/\u0010+R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b3\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "state", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$ChangeEmailInputVO;", "changeEmail", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$InputVO;", "inputs", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$ButtonVO;", "buttons", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$ChangeEmailInputVO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getState", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$ChangeEmailInputVO;", "getChangeEmail", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$ChangeEmailInputVO;", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getButtons", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ChangeEmailInputVO", "InputVO", "ButtonVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChangeEmailVO implements c {

    @NotNull
    private final List<ButtonVO> buttons;
    private final CellDTO cell;
    private final ChangeEmailInputVO changeEmail;
    private final long id;
    private final List<InputVO> inputs;

    @NotNull
    private final String state;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$ButtonVO;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", DynamicElementDTO.TIMER, "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/Integer;", "getTimer", "()Ljava/lang/Integer;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonVO {

        @NotNull
        private final ButtonV3DTO button;
        private final Integer timer;

        public ButtonVO(@NotNull ButtonV3DTO button, Integer num) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.timer = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonVO)) {
                return false;
            }
            ButtonVO buttonVO = (ButtonVO) other;
            return Intrinsics.d(this.button, buttonVO.button) && Intrinsics.d(this.timer, buttonVO.timer);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            Integer num = this.timer;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "ButtonVO(button=" + this.button + ", timer=" + this.timer + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$ChangeEmailInputVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangeEmailInputVO {
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO title;

        public ChangeEmailInputVO(@NotNull TextDTO title, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.common = commonControlSettings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeEmailInputVO)) {
                return false;
            }
            ChangeEmailInputVO changeEmailInputVO = (ChangeEmailInputVO) other;
            return Intrinsics.d(this.title, changeEmailInputVO.title) && Intrinsics.d(this.common, changeEmailInputVO.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            return "ChangeEmailInputVO(title=" + this.title + ", common=" + this.common + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b$\u0010\u0011R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$InputVO;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/text/TextDTO;", HammersV3BodyDTO.PLACEHOLDER, "", "required", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "maskOtp", "", "lexemes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPlaceholder", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/Boolean;", "getRequired", "()Ljava/lang/Boolean;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getMaskOtp", "Ljava/util/Map;", "getLexemes", "()Ljava/util/Map;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputVO {
        private final CommonControlSettings common;
        private final Map<String, String> lexemes;
        private final String maskOtp;

        @NotNull
        private final String name;

        @NotNull
        private final TextDTO placeholder;
        private final Boolean required;
        private final String value;

        public InputVO(@NotNull String name, String str, @NotNull TextDTO placeholder, Boolean bool, CommonControlSettings commonControlSettings, String str2, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.name = name;
            this.value = str;
            this.placeholder = placeholder;
            this.required = bool;
            this.common = commonControlSettings;
            this.maskOtp = str2;
            this.lexemes = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputVO)) {
                return false;
            }
            InputVO inputVO = (InputVO) other;
            return Intrinsics.d(this.name, inputVO.name) && Intrinsics.d(this.value, inputVO.value) && Intrinsics.d(this.placeholder, inputVO.placeholder) && Intrinsics.d(this.required, inputVO.required) && Intrinsics.d(this.common, inputVO.common) && Intrinsics.d(this.maskOtp, inputVO.maskOtp) && Intrinsics.d(this.lexemes, inputVO.lexemes);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final Map<String, String> getLexemes() {
            return this.lexemes;
        }

        public final String getMaskOtp() {
            return this.maskOtp;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final TextDTO getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.value;
            int a11 = b.a(this.placeholder, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            Boolean bool = this.required;
            int hashCode2 = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            int hashCode3 = (hashCode2 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            String str2 = this.maskOtp;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, String> map = this.lexemes;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.value;
            TextDTO textDTO = this.placeholder;
            Boolean bool = this.required;
            CommonControlSettings commonControlSettings = this.common;
            String str3 = this.maskOtp;
            Map<String, String> map = this.lexemes;
            StringBuilder d11 = C3660k.d("InputVO(name=", str, ", value=", str2, ", placeholder=");
            d11.append(textDTO);
            d11.append(", required=");
            d11.append(bool);
            d11.append(", common=");
            d11.append(commonControlSettings);
            d11.append(", maskOtp=");
            d11.append(str3);
            d11.append(", lexemes=");
            return P.f(d11, map, ")");
        }
    }

    public ChangeEmailVO(long j11, @NotNull String state, ChangeEmailInputVO changeEmailInputVO, List<InputVO> list, CellDTO cellDTO, @NotNull List<ButtonVO> buttons, @NotNull TextDTO title, TextDTO textDTO, t tVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.state = state;
        this.changeEmail = changeEmailInputVO;
        this.inputs = list;
        this.cell = cellDTO;
        this.buttons = buttons;
        this.title = title;
        this.subtitle = textDTO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeEmailVO)) {
            return false;
        }
        ChangeEmailVO changeEmailVO = (ChangeEmailVO) other;
        return this.id == changeEmailVO.id && Intrinsics.d(this.state, changeEmailVO.state) && Intrinsics.d(this.changeEmail, changeEmailVO.changeEmail) && Intrinsics.d(this.inputs, changeEmailVO.inputs) && Intrinsics.d(this.cell, changeEmailVO.cell) && Intrinsics.d(this.buttons, changeEmailVO.buttons) && Intrinsics.d(this.title, changeEmailVO.title) && Intrinsics.d(this.subtitle, changeEmailVO.subtitle) && Intrinsics.d(this.tokenizedEvent, changeEmailVO.tokenizedEvent);
    }

    @NotNull
    public final List<ButtonVO> getButtons() {
        return this.buttons;
    }

    public final CellDTO getCell() {
        return this.cell;
    }

    public final ChangeEmailInputVO getChangeEmail() {
        return this.changeEmail;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<InputVO> getInputs() {
        return this.inputs;
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

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.state);
        ChangeEmailInputVO changeEmailInputVO = this.changeEmail;
        int hashCode = (a11 + (changeEmailInputVO == null ? 0 : changeEmailInputVO.hashCode())) * 31;
        List<InputVO> list = this.inputs;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        CellDTO cellDTO = this.cell;
        int a12 = b.a(this.title, g.b((hashCode2 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31, 31, this.buttons), 31);
        TextDTO textDTO = this.subtitle;
        int hashCode3 = (a12 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.state;
        ChangeEmailInputVO changeEmailInputVO = this.changeEmail;
        List<InputVO> list = this.inputs;
        CellDTO cellDTO = this.cell;
        List<ButtonVO> list2 = this.buttons;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "ChangeEmailVO(id=", ", state=", str);
        c11.append(", changeEmail=");
        c11.append(changeEmailInputVO);
        c11.append(", inputs=");
        c11.append(list);
        c11.append(", cell=");
        c11.append(cellDTO);
        c11.append(", buttons=");
        c11.append(list2);
        D3.g.i(", title=", ", subtitle=", c11, textDTO, textDTO2);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
