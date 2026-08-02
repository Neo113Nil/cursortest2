package ru.ozon.app.android.session.userAdultModalMobile.data.models;

import T7.P;
import Tl.b;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO;", "", "subtitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "input", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO$Input;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "termsOfUse", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO$Input;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;)V", "getSubtitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInput", "()Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO$Input;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTermsOfUse", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Input", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserAdultModalDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final Input input;

    @NotNull
    private final TextAtom subtitle;
    private final TextAtom termsOfUse;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO$Input;", "", HammersV3BodyDTO.PLACEHOLDER, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 0;

        @NotNull
        private final String placeholder;

        @NotNull
        private final String value;

        public Input(@NotNull String placeholder, @NotNull String value) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.placeholder = placeholder;
            this.value = value;
        }

        public static /* synthetic */ Input copy$default(Input input, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = input.placeholder;
            }
            if ((i11 & 2) != 0) {
                str2 = input.value;
            }
            return input.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Input copy(@NotNull String placeholder, @NotNull String value) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Input(placeholder, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.placeholder, input.placeholder) && Intrinsics.d(this.value, input.value);
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.placeholder.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Input(placeholder=", this.placeholder, ", value=", this.value, ")");
        }
    }

    public UserAdultModalDTO(@NotNull TextAtom subtitle, Input input, @NotNull ButtonV3Atom.LargeButton button, TextAtom textAtom, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button, "button");
        this.subtitle = subtitle;
        this.input = input;
        this.button = button;
        this.termsOfUse = textAtom;
        this.trackingInfo = map;
    }

    public static /* synthetic */ UserAdultModalDTO copy$default(UserAdultModalDTO userAdultModalDTO, TextAtom textAtom, Input input, ButtonV3Atom.LargeButton largeButton, TextAtom textAtom2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = userAdultModalDTO.subtitle;
        }
        if ((i11 & 2) != 0) {
            input = userAdultModalDTO.input;
        }
        if ((i11 & 4) != 0) {
            largeButton = userAdultModalDTO.button;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = userAdultModalDTO.termsOfUse;
        }
        if ((i11 & 16) != 0) {
            map = userAdultModalDTO.trackingInfo;
        }
        Map map2 = map;
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        return userAdultModalDTO.copy(textAtom, input, largeButton2, textAtom2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getTermsOfUse() {
        return this.termsOfUse;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final UserAdultModalDTO copy(@NotNull TextAtom subtitle, Input input, @NotNull ButtonV3Atom.LargeButton button, TextAtom termsOfUse, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button, "button");
        return new UserAdultModalDTO(subtitle, input, button, termsOfUse, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAdultModalDTO)) {
            return false;
        }
        UserAdultModalDTO userAdultModalDTO = (UserAdultModalDTO) other;
        return Intrinsics.d(this.subtitle, userAdultModalDTO.subtitle) && Intrinsics.d(this.input, userAdultModalDTO.input) && Intrinsics.d(this.button, userAdultModalDTO.button) && Intrinsics.d(this.termsOfUse, userAdultModalDTO.termsOfUse) && Intrinsics.d(this.trackingInfo, userAdultModalDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final Input getInput() {
        return this.input;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTermsOfUse() {
        return this.termsOfUse;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.subtitle.hashCode() * 31;
        Input input = this.input;
        int a11 = b.a(this.button, (hashCode + (input == null ? 0 : input.hashCode())) * 31, 31);
        TextAtom textAtom = this.termsOfUse;
        int hashCode2 = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.subtitle;
        Input input = this.input;
        ButtonV3Atom.LargeButton largeButton = this.button;
        TextAtom textAtom2 = this.termsOfUse;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("UserAdultModalDTO(subtitle=");
        sb2.append(textAtom);
        sb2.append(", input=");
        sb2.append(input);
        sb2.append(", button=");
        sb2.append(largeButton);
        sb2.append(", termsOfUse=");
        sb2.append(textAtom2);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
