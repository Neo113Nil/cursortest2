package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain;

import N3.C3660k;
import T7.P;
import WZ.t;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003()*B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Field;", "field", "agreement", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Field;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Field;", "getField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Field;", "getAgreement", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Field", "Input", "Size", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RoleInvitationCreatorContentVO implements c {
    private final TextDTO agreement;

    @NotNull
    private final Field field;
    private final long id;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Field;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Input;", "input", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "deleteInputButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "addInputButton", "", "maxEmailCount", "", "", "lexemes", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Input;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Integer;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Input;", "getInput", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Input;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDeleteInputButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddInputButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/Integer;", "getMaxEmailCount", "()Ljava/lang/Integer;", "Ljava/util/Map;", "getLexemes", "()Ljava/util/Map;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Field {
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Input;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "caption", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Size;", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Size;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getPlaceholder", "getCaption", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Size;", "getSize", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Size;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        private final String caption;
        private final String placeholder;

        @NotNull
        private final Size size;
        private final String value;

        public Input(String str, String str2, String str3, @NotNull Size size) {
            Intrinsics.checkNotNullParameter(size, "size");
            this.value = str;
            this.placeholder = str2;
            this.caption = str3;
            this.size = size;
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

        @NotNull
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
            return this.size.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorContentVO$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_500", "SIZE_600", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public RoleInvitationCreatorContentVO(long j11, TextDTO textDTO, TextDTO textDTO2, @NotNull Field field, TextDTO textDTO3, t tVar) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.id = j11;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.field = field;
        this.agreement = textDTO3;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoleInvitationCreatorContentVO)) {
            return false;
        }
        RoleInvitationCreatorContentVO roleInvitationCreatorContentVO = (RoleInvitationCreatorContentVO) other;
        return this.id == roleInvitationCreatorContentVO.id && Intrinsics.d(this.title, roleInvitationCreatorContentVO.title) && Intrinsics.d(this.subtitle, roleInvitationCreatorContentVO.subtitle) && Intrinsics.d(this.field, roleInvitationCreatorContentVO.field) && Intrinsics.d(this.agreement, roleInvitationCreatorContentVO.agreement) && Intrinsics.d(this.tokenizedEvent, roleInvitationCreatorContentVO.tokenizedEvent);
    }

    public final TextDTO getAgreement() {
        return this.agreement;
    }

    @NotNull
    public final Field getField() {
        return this.field;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

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
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode3 = (this.field.hashCode() + ((hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31)) * 31;
        TextDTO textDTO3 = this.agreement;
        int hashCode4 = (hashCode3 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        Field field = this.field;
        TextDTO textDTO3 = this.agreement;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = TY.a.b("RoleInvitationCreatorContentVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", field=");
        b11.append(field);
        b11.append(", agreement=");
        b11.append(textDTO3);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
