package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.data;

import D3.g;
import De.C2859b;
import N3.C3660k;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003+,-BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Je\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "field", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Field;", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "agreement", "redirectUrl", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Field;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Field;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAgreement", "getRedirectUrl", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Field", "Input", "Size", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RoleInvitationCreatorDTO {
    public static final int $stable = 8;
    private final TextDTO agreement;

    @NotNull
    private final Field field;
    private final String redirectUrl;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JV\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Field;", "", "input", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Input;", "deleteInputButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "addInputButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "maxEmailCount", "", "lexemes", "", "", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Input;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Integer;Ljava/util/Map;)V", "getInput", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Input;", "getDeleteInputButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getAddInputButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getMaxEmailCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLexemes", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Input;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Field;", "equals", "", "other", "hashCode", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Field {
        public static final int $stable = 8;
        private final ButtonV3DTO addInputButton;
        private final IconButtonV3DTO deleteInputButton;
        private final Input input;
        private final Map<String, String> lexemes;
        private final Integer maxEmailCount;

        public Field(Input input, IconButtonV3DTO iconButtonV3DTO, ButtonV3DTO buttonV3DTO, Integer num, Map<String, String> map) {
            this.input = input;
            this.deleteInputButton = iconButtonV3DTO;
            this.addInputButton = buttonV3DTO;
            this.maxEmailCount = num;
            this.lexemes = map;
        }

        public static /* synthetic */ Field copy$default(Field field, Input input, IconButtonV3DTO iconButtonV3DTO, ButtonV3DTO buttonV3DTO, Integer num, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                input = field.input;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO = field.deleteInputButton;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO = field.addInputButton;
            }
            if ((i11 & 8) != 0) {
                num = field.maxEmailCount;
            }
            if ((i11 & 16) != 0) {
                map = field.lexemes;
            }
            Map map2 = map;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            return field.copy(input, iconButtonV3DTO, buttonV3DTO2, num, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final Input getInput() {
            return this.input;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getDeleteInputButton() {
            return this.deleteInputButton;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getAddInputButton() {
            return this.addInputButton;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getMaxEmailCount() {
            return this.maxEmailCount;
        }

        public final Map<String, String> component5() {
            return this.lexemes;
        }

        @NotNull
        public final Field copy(Input input, IconButtonV3DTO deleteInputButton, ButtonV3DTO addInputButton, Integer maxEmailCount, Map<String, String> lexemes) {
            return new Field(input, deleteInputButton, addInputButton, maxEmailCount, lexemes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return Intrinsics.d(this.input, field.input) && Intrinsics.d(this.deleteInputButton, field.deleteInputButton) && Intrinsics.d(this.addInputButton, field.addInputButton) && Intrinsics.d(this.maxEmailCount, field.maxEmailCount) && Intrinsics.d(this.lexemes, field.lexemes);
        }

        public final ButtonV3DTO getAddInputButton() {
            return this.addInputButton;
        }

        public final IconButtonV3DTO getDeleteInputButton() {
            return this.deleteInputButton;
        }

        public final Input getInput() {
            return this.input;
        }

        public final Map<String, String> getLexemes() {
            return this.lexemes;
        }

        public final Integer getMaxEmailCount() {
            return this.maxEmailCount;
        }

        public int hashCode() {
            Input input = this.input;
            int hashCode = (input == null ? 0 : input.hashCode()) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.deleteInputButton;
            int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.addInputButton;
            int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            Integer num = this.maxEmailCount;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Map<String, String> map = this.lexemes;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Input input = this.input;
            IconButtonV3DTO iconButtonV3DTO = this.deleteInputButton;
            ButtonV3DTO buttonV3DTO = this.addInputButton;
            Integer num = this.maxEmailCount;
            Map<String, String> map = this.lexemes;
            StringBuilder sb2 = new StringBuilder("Field(input=");
            sb2.append(input);
            sb2.append(", deleteInputButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", addInputButton=");
            sb2.append(buttonV3DTO);
            sb2.append(", maxEmailCount=");
            sb2.append(num);
            sb2.append(", lexemes=");
            return P.f(sb2, map, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_500", "SIZE_600", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size SIZE_500 = new Size("SIZE_500", 0);
        public static final Size SIZE_600 = new Size("SIZE_600", 1);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_500, SIZE_600};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
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

    public RoleInvitationCreatorDTO(TextDTO textDTO, TextDTO textDTO2, @NotNull Field field, @NotNull ButtonV3DTO submitButton, TextDTO textDTO3, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.field = field;
        this.submitButton = submitButton;
        this.agreement = textDTO3;
        this.redirectUrl = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ RoleInvitationCreatorDTO copy$default(RoleInvitationCreatorDTO roleInvitationCreatorDTO, TextDTO textDTO, TextDTO textDTO2, Field field, ButtonV3DTO buttonV3DTO, TextDTO textDTO3, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = roleInvitationCreatorDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = roleInvitationCreatorDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            field = roleInvitationCreatorDTO.field;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = roleInvitationCreatorDTO.submitButton;
        }
        if ((i11 & 16) != 0) {
            textDTO3 = roleInvitationCreatorDTO.agreement;
        }
        if ((i11 & 32) != 0) {
            str = roleInvitationCreatorDTO.redirectUrl;
        }
        if ((i11 & 64) != 0) {
            map = roleInvitationCreatorDTO.trackingInfo;
        }
        String str2 = str;
        Map map2 = map;
        TextDTO textDTO4 = textDTO3;
        Field field2 = field;
        return roleInvitationCreatorDTO.copy(textDTO, textDTO2, field2, buttonV3DTO, textDTO4, str2, map2);
    }

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
    public final Field getField() {
        return this.field;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getAgreement() {
        return this.agreement;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final RoleInvitationCreatorDTO copy(TextDTO title, TextDTO subtitle, @NotNull Field field, @NotNull ButtonV3DTO submitButton, TextDTO agreement, String redirectUrl, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new RoleInvitationCreatorDTO(title, subtitle, field, submitButton, agreement, redirectUrl, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoleInvitationCreatorDTO)) {
            return false;
        }
        RoleInvitationCreatorDTO roleInvitationCreatorDTO = (RoleInvitationCreatorDTO) other;
        return Intrinsics.d(this.title, roleInvitationCreatorDTO.title) && Intrinsics.d(this.subtitle, roleInvitationCreatorDTO.subtitle) && Intrinsics.d(this.field, roleInvitationCreatorDTO.field) && Intrinsics.d(this.submitButton, roleInvitationCreatorDTO.submitButton) && Intrinsics.d(this.agreement, roleInvitationCreatorDTO.agreement) && Intrinsics.d(this.redirectUrl, roleInvitationCreatorDTO.redirectUrl) && Intrinsics.d(this.trackingInfo, roleInvitationCreatorDTO.trackingInfo);
    }

    public final TextDTO getAgreement() {
        return this.agreement;
    }

    @NotNull
    public final Field getField() {
        return this.field;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.subtitle;
        int c11 = C2859b.c(this.submitButton, (this.field.hashCode() + ((hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31)) * 31, 31);
        TextDTO textDTO3 = this.agreement;
        int hashCode2 = (c11 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        String str = this.redirectUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        Field field = this.field;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        TextDTO textDTO3 = this.agreement;
        String str = this.redirectUrl;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("RoleInvitationCreatorDTO(title=", textDTO, ", subtitle=", textDTO2, ", field=");
        g10.append(field);
        g10.append(", submitButton=");
        g10.append(buttonV3DTO);
        g10.append(", agreement=");
        g10.append(textDTO3);
        g10.append(", redirectUrl=");
        g10.append(str);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Input;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", HammersV3BodyDTO.PLACEHOLDER, "caption", "size", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Size;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Size;)V", "getValue", "()Ljava/lang/String;", "getPlaceholder", "getCaption", "getSize", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/data/RoleInvitationCreatorDTO$Size;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 0;
        private final String caption;
        private final String placeholder;
        private final Size size;
        private final String value;

        public Input(String str, String str2, String str3, Size size) {
            this.value = str;
            this.placeholder = str2;
            this.caption = str3;
            this.size = size;
        }

        public static /* synthetic */ Input copy$default(Input input, String str, String str2, String str3, Size size, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = input.value;
            }
            if ((i11 & 2) != 0) {
                str2 = input.placeholder;
            }
            if ((i11 & 4) != 0) {
                str3 = input.caption;
            }
            if ((i11 & 8) != 0) {
                size = input.size;
            }
            return input.copy(str, str2, str3, size);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCaption() {
            return this.caption;
        }

        /* renamed from: component4, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @NotNull
        public final Input copy(String value, String placeholder, String caption, Size size) {
            return new Input(value, placeholder, caption, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.value, input.value) && Intrinsics.d(this.placeholder, input.placeholder) && Intrinsics.d(this.caption, input.caption) && this.size == input.size;
        }

        public final String getCaption() {
            return this.caption;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Size getSize() {
            return this.size;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.placeholder;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.caption;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Size size = this.size;
            return hashCode3 + (size != null ? size.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.value;
            String str2 = this.placeholder;
            String str3 = this.caption;
            Size size = this.size;
            StringBuilder d11 = C3660k.d("Input(value=", str, ", placeholder=", str2, ", caption=");
            d11.append(str3);
            d11.append(", size=");
            d11.append(size);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ Input(String str, String str2, String str3, Size size, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? Size.SIZE_600 : size);
        }
    }

    public /* synthetic */ RoleInvitationCreatorDTO(TextDTO textDTO, TextDTO textDTO2, Field field, ButtonV3DTO buttonV3DTO, TextDTO textDTO3, String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, field, buttonV3DTO, textDTO3, str, (i11 & 64) != 0 ? null : map);
    }
}
