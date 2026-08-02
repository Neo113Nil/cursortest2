package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.data;

import De.C2859b;
import G.g;
import N3.C3660k;
import Pk0.h;
import Sh.b;
import T7.P;
import Xc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002$%BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "requisites", "fields", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Field;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "lexemes", "", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRequisites", "getFields", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getLexemes", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Field", "Size", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class VerificationEdoCheckingUserDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final List<Field> fields;
    private final Map<String, String> lexemes;
    private final TextDTO name;
    private final TextDTO requisites;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jj\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "size", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Size;", "required", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Size;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getName", "()Ljava/lang/String;", "getLabel", "getSize", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Size;", "getRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Size;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Field;", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Field {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String label;

        @NotNull
        private final String name;
        private final Boolean required;
        private final Size size;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Field(@NotNull String name, @NotNull String label, Size size, Boolean bool, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            this.name = name;
            this.label = label;
            this.size = size;
            this.required = bool;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ Field copy$default(Field field, String str, String str2, Size size, Boolean bool, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = field.name;
            }
            if ((i11 & 2) != 0) {
                str2 = field.label;
            }
            if ((i11 & 4) != 0) {
                size = field.size;
            }
            if ((i11 & 8) != 0) {
                bool = field.required;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = field.action;
            }
            if ((i11 & 32) != 0) {
                map = field.trackingInfo;
            }
            if ((i11 & 64) != 0) {
                testInfo = field.testInfo;
            }
            Map map2 = map;
            TestInfo testInfo2 = testInfo;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Size size2 = size;
            return field.copy(str, str2, size2, bool, atomActionDTO2, map2, testInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getRequired() {
            return this.required;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        /* renamed from: component7, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final Field copy(@NotNull String name, @NotNull String label, Size size, Boolean required, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Field(name, label, size, required, action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return Intrinsics.d(this.name, field.name) && Intrinsics.d(this.label, field.label) && this.size == field.size && Intrinsics.d(this.required, field.required) && Intrinsics.d(this.action, field.action) && Intrinsics.d(this.trackingInfo, field.trackingInfo) && Intrinsics.d(this.testInfo, field.testInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
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

        public final Size getSize() {
            return this.size;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.name.hashCode() * 31, 31, this.label);
            Size size = this.size;
            int hashCode = (a11 + (size == null ? 0 : size.hashCode())) * 31;
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
            Size size = this.size;
            Boolean bool = this.required;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("Field(name=", str, ", label=", str2, ", size=");
            d11.append(size);
            d11.append(", required=");
            d11.append(bool);
            d11.append(", action=");
            b.f(d11, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
            return h.c(d11, testInfo, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/data/VerificationEdoCheckingUserDTO$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_UNSPECIFIED", "SIZE_500", "SIZE_600", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size SIZE_UNSPECIFIED = new Size("SIZE_UNSPECIFIED", 0);
        public static final Size SIZE_500 = new Size("SIZE_500", 1);
        public static final Size SIZE_600 = new Size("SIZE_600", 2);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_UNSPECIFIED, SIZE_500, SIZE_600};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Size(String str, int i11) {
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    public VerificationEdoCheckingUserDTO(TextDTO textDTO, TextDTO textDTO2, @NotNull List<Field> fields, @NotNull ButtonV3DTO button, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(button, "button");
        this.name = textDTO;
        this.requisites = textDTO2;
        this.fields = fields;
        this.button = button;
        this.lexemes = map;
    }

    public static /* synthetic */ VerificationEdoCheckingUserDTO copy$default(VerificationEdoCheckingUserDTO verificationEdoCheckingUserDTO, TextDTO textDTO, TextDTO textDTO2, List list, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = verificationEdoCheckingUserDTO.name;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = verificationEdoCheckingUserDTO.requisites;
        }
        if ((i11 & 4) != 0) {
            list = verificationEdoCheckingUserDTO.fields;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = verificationEdoCheckingUserDTO.button;
        }
        if ((i11 & 16) != 0) {
            map = verificationEdoCheckingUserDTO.lexemes;
        }
        Map map2 = map;
        List list2 = list;
        return verificationEdoCheckingUserDTO.copy(textDTO, textDTO2, list2, buttonV3DTO, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getRequisites() {
        return this.requisites;
    }

    @NotNull
    public final List<Field> component3() {
        return this.fields;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final Map<String, String> component5() {
        return this.lexemes;
    }

    @NotNull
    public final VerificationEdoCheckingUserDTO copy(TextDTO name, TextDTO requisites, @NotNull List<Field> fields, @NotNull ButtonV3DTO button, Map<String, String> lexemes) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(button, "button");
        return new VerificationEdoCheckingUserDTO(name, requisites, fields, button, lexemes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationEdoCheckingUserDTO)) {
            return false;
        }
        VerificationEdoCheckingUserDTO verificationEdoCheckingUserDTO = (VerificationEdoCheckingUserDTO) other;
        return Intrinsics.d(this.name, verificationEdoCheckingUserDTO.name) && Intrinsics.d(this.requisites, verificationEdoCheckingUserDTO.requisites) && Intrinsics.d(this.fields, verificationEdoCheckingUserDTO.fields) && Intrinsics.d(this.button, verificationEdoCheckingUserDTO.button) && Intrinsics.d(this.lexemes, verificationEdoCheckingUserDTO.lexemes);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<Field> getFields() {
        return this.fields;
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

    public int hashCode() {
        TextDTO textDTO = this.name;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.requisites;
        int c11 = C2859b.c(this.button, g.b((hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.fields), 31);
        Map<String, String> map = this.lexemes;
        return c11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.name;
        TextDTO textDTO2 = this.requisites;
        List<Field> list = this.fields;
        ButtonV3DTO buttonV3DTO = this.button;
        Map<String, String> map = this.lexemes;
        StringBuilder g10 = D3.g.g("VerificationEdoCheckingUserDTO(name=", textDTO, ", requisites=", textDTO2, ", fields=");
        g10.append(list);
        g10.append(", button=");
        g10.append(buttonV3DTO);
        g10.append(", lexemes=");
        return P.f(g10, map, ")");
    }
}
