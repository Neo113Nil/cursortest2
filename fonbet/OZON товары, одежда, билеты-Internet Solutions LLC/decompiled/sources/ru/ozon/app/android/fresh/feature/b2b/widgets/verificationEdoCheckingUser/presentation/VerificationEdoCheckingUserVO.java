package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation;

import De.C2859b;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.h;
import Sh.b;
import TY.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.data.VerificationEdoCheckingUserDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001,BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "requisites", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserVO$Field;", "fields", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "", "lexemes", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRequisites", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/util/Map;", "getLexemes", "()Ljava/util/Map;", "Field", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class VerificationEdoCheckingUserVO implements c {

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final List<Field> fields;
    private final long id;
    private final Map<String, String> lexemes;
    private final TextDTO name;
    private final TextDTO requisites;

    public VerificationEdoCheckingUserVO(long j11, TextDTO textDTO, TextDTO textDTO2, @NotNull List<Field> fields, @NotNull ButtonV3DTO button, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.name = textDTO;
        this.requisites = textDTO2;
        this.fields = fields;
        this.button = button;
        this.lexemes = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationEdoCheckingUserVO)) {
            return false;
        }
        VerificationEdoCheckingUserVO verificationEdoCheckingUserVO = (VerificationEdoCheckingUserVO) other;
        return this.id == verificationEdoCheckingUserVO.id && Intrinsics.d(this.name, verificationEdoCheckingUserVO.name) && Intrinsics.d(this.requisites, verificationEdoCheckingUserVO.requisites) && Intrinsics.d(this.fields, verificationEdoCheckingUserVO.fields) && Intrinsics.d(this.button, verificationEdoCheckingUserVO.button) && Intrinsics.d(this.lexemes, verificationEdoCheckingUserVO.lexemes);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<Field> getFields() {
        return this.fields;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Map<String, String> getLexemes() {
        return this.lexemes;
    }

    public final TextDTO getName() {
        return this.name;
    }

    public final TextDTO getRequisites() {
        return this.requisites;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.name;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.requisites;
        int c11 = C2859b.c(this.button, g.b((hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.fields), 31);
        Map<String, String> map = this.lexemes;
        return c11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.name;
        TextDTO textDTO2 = this.requisites;
        List<Field> list = this.fields;
        ButtonV3DTO buttonV3DTO = this.button;
        Map<String, String> map = this.lexemes;
        StringBuilder b11 = a.b("VerificationEdoCheckingUserVO(id=", j11, ", name=", textDTO);
        b11.append(", requisites=");
        b11.append(textDTO2);
        b11.append(", fields=");
        b11.append(list);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(", lexemes=");
        b11.append(map);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0082\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserVO$Field;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "label", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "hasError", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Size;", "size", "required", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Size;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Size;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserVO$Field;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getLabel", "getValue", "Z", "getHasError", "()Z", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Size;", "getSize", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Size;", "Ljava/lang/Boolean;", "getRequired", "()Ljava/lang/Boolean;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Field {
        private final AtomActionDTO action;
        private final boolean hasError;

        @NotNull
        private final String label;

        @NotNull
        private final String name;
        private final Boolean required;
        private final VerificationEdoCheckingUserDTO.Size size;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final String value;

        public Field(@NotNull String name, @NotNull String label, String str, boolean z11, VerificationEdoCheckingUserDTO.Size size, Boolean bool, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            this.name = name;
            this.label = label;
            this.value = str;
            this.hasError = z11;
            this.size = size;
            this.required = bool;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ Field copy$default(Field field, String str, String str2, String str3, boolean z11, VerificationEdoCheckingUserDTO.Size size, Boolean bool, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = field.name;
            }
            if ((i11 & 2) != 0) {
                str2 = field.label;
            }
            if ((i11 & 4) != 0) {
                str3 = field.value;
            }
            if ((i11 & 8) != 0) {
                z11 = field.hasError;
            }
            if ((i11 & 16) != 0) {
                size = field.size;
            }
            if ((i11 & 32) != 0) {
                bool = field.required;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = field.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = field.trackingInfo;
            }
            if ((i11 & 256) != 0) {
                testInfo = field.testInfo;
            }
            Map map2 = map;
            TestInfo testInfo2 = testInfo;
            Boolean bool2 = bool;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            VerificationEdoCheckingUserDTO.Size size2 = size;
            String str4 = str3;
            return field.copy(str, str2, str4, z11, size2, bool2, atomActionDTO2, map2, testInfo2);
        }

        @NotNull
        public final Field copy(@NotNull String name, @NotNull String label, String value, boolean hasError, VerificationEdoCheckingUserDTO.Size size, Boolean required, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Field(name, label, value, hasError, size, required, action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return Intrinsics.d(this.name, field.name) && Intrinsics.d(this.label, field.label) && Intrinsics.d(this.value, field.value) && this.hasError == field.hasError && this.size == field.size && Intrinsics.d(this.required, field.required) && Intrinsics.d(this.action, field.action) && Intrinsics.d(this.trackingInfo, field.trackingInfo) && Intrinsics.d(this.testInfo, field.testInfo);
        }

        public final boolean getHasError() {
            return this.hasError;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final Boolean getRequired() {
            return this.required;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = g.a(this.name.hashCode() * 31, 31, this.label);
            String str = this.value;
            int a12 = C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasError);
            VerificationEdoCheckingUserDTO.Size size = this.size;
            int hashCode = (a12 + (size == null ? 0 : size.hashCode())) * 31;
            Boolean bool = this.required;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.label;
            String str3 = this.value;
            boolean z11 = this.hasError;
            VerificationEdoCheckingUserDTO.Size size = this.size;
            Boolean bool = this.required;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("Field(name=", str, ", label=", str2, ", value=");
            C2880a.c(str3, ", hasError=", ", size=", d11, z11);
            d11.append(size);
            d11.append(", required=");
            d11.append(bool);
            d11.append(", action=");
            b.f(d11, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
            return h.c(d11, testInfo, ")");
        }

        public /* synthetic */ Field(String str, String str2, String str3, boolean z11, VerificationEdoCheckingUserDTO.Size size, Boolean bool, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? false : z11, size, bool, atomActionDTO, map, testInfo);
        }
    }
}
