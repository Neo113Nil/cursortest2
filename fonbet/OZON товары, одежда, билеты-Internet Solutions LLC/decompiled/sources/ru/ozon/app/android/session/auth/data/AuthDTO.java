package ru.ozon.app.android.session.auth.data;

import C.o0;
import G.g;
import GR.b;
import I1.w;
import N3.C3660k;
import Pk0.a;
import T7.P;
import V.e;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.session.auth.data.alertentry.AlertEntry;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0006CDEFGHB\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010;\u001a\u00020\u0018HÆ\u0003J\u009f\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006I"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "origin", "subtitle", "inputs", "", "Lru/ozon/app/android/session/auth/data/AuthDTO$Input;", "submitButton", "Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;", "advertisement", "Lru/ozon/app/android/session/auth/data/AuthDTO$Advertisement;", "hintButtons", "Lru/ozon/app/android/session/auth/data/AuthDTO$HintButton;", "loginBySberIdButton", "Lru/ozon/app/android/session/auth/data/AuthDTO$SberIdButton;", "alertEntry", "Lru/ozon/app/android/session/auth/data/alertentry/AlertEntry;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "termsOfUseText", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "translationLexemes", "Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;Lru/ozon/app/android/session/auth/data/AuthDTO$Advertisement;Ljava/util/List;Lru/ozon/app/android/session/auth/data/AuthDTO$SberIdButton;Lru/ozon/app/android/session/auth/data/alertentry/AlertEntry;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes;)V", "getTitle", "()Ljava/lang/String;", "getOrigin", "getSubtitle", "getInputs", "()Ljava/util/List;", "getSubmitButton", "()Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;", "getAdvertisement", "()Lru/ozon/app/android/session/auth/data/AuthDTO$Advertisement;", "getHintButtons", "getLoginBySberIdButton", "()Lru/ozon/app/android/session/auth/data/AuthDTO$SberIdButton;", "getAlertEntry", "()Lru/ozon/app/android/session/auth/data/alertentry/AlertEntry;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getTermsOfUseText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTranslationLexemes", "()Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "TranslationLexemes", "Input", "SubmitButton", "Advertisement", "HintButton", "SberIdButton", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AuthDTO {
    public static final int $stable = 8;
    private final Advertisement advertisement;
    private final AlertEntry alertEntry;
    private final DisclaimerAtom disclaimer;

    @NotNull
    private final List<HintButton> hintButtons;
    private final List<Input> inputs;
    private final SberIdButton loginBySberIdButton;
    private final String origin;
    private final SubmitButton submitButton;
    private final String subtitle;
    private final TextAtom termsOfUseText;

    @NotNull
    private final String title;

    @NotNull
    private final TranslationLexemes translationLexemes;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthDTO$Advertisement;", "", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "checked", "", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Z)V", "getPlaceholder", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getName", "()Ljava/lang/String;", "getChecked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Advertisement {
        public static final int $stable = OzonSpannableString.$stable;
        private final boolean checked;

        @NotNull
        private final String name;

        @NotNull
        private final OzonSpannableString placeholder;

        public Advertisement(@NotNull OzonSpannableString placeholder, @NotNull String name, boolean z11) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(name, "name");
            this.placeholder = placeholder;
            this.name = name;
            this.checked = z11;
        }

        public static /* synthetic */ Advertisement copy$default(Advertisement advertisement, OzonSpannableString ozonSpannableString, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = advertisement.placeholder;
            }
            if ((i11 & 2) != 0) {
                str = advertisement.name;
            }
            if ((i11 & 4) != 0) {
                z11 = advertisement.checked;
            }
            return advertisement.copy(ozonSpannableString, str, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getChecked() {
            return this.checked;
        }

        @NotNull
        public final Advertisement copy(@NotNull OzonSpannableString placeholder, @NotNull String name, boolean checked) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Advertisement(placeholder, name, checked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Advertisement)) {
                return false;
            }
            Advertisement advertisement = (Advertisement) other;
            return Intrinsics.d(this.placeholder, advertisement.placeholder) && Intrinsics.d(this.name, advertisement.name) && this.checked == advertisement.checked;
        }

        public final boolean getChecked() {
            return this.checked;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final OzonSpannableString getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked) + g.a(this.placeholder.hashCode() * 31, 31, this.name);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.placeholder;
            String str = this.name;
            return a.a(")", b.f("Advertisement(placeholder=", ozonSpannableString, ", name=", str, ", checked="), this.checked);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003JM\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthDTO$HintButton;", "", "deeplink", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "type", "action", "data", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getDeeplink", "()Ljava/lang/String;", "getTitle", "getType", "getAction", "getData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HintButton {
        public static final int $stable = 8;
        private final String action;
        private final Map<String, Object> data;
        private final String deeplink;

        @NotNull
        private final String title;

        @NotNull
        private final String type;

        public HintButton(String str, @NotNull String title, @NotNull String type, String str2, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            this.deeplink = str;
            this.title = title;
            this.type = type;
            this.action = str2;
            this.data = map;
        }

        public static /* synthetic */ HintButton copy$default(HintButton hintButton, String str, String str2, String str3, String str4, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = hintButton.deeplink;
            }
            if ((i11 & 2) != 0) {
                str2 = hintButton.title;
            }
            if ((i11 & 4) != 0) {
                str3 = hintButton.type;
            }
            if ((i11 & 8) != 0) {
                str4 = hintButton.action;
            }
            if ((i11 & 16) != 0) {
                map = hintButton.data;
            }
            Map map2 = map;
            String str5 = str3;
            return hintButton.copy(str, str2, str5, str4, map2);
        }

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
        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final Map<String, Object> component5() {
            return this.data;
        }

        @NotNull
        public final HintButton copy(String deeplink, @NotNull String title, @NotNull String type, String action, Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            return new HintButton(deeplink, title, type, action, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintButton)) {
                return false;
            }
            HintButton hintButton = (HintButton) other;
            return Intrinsics.d(this.deeplink, hintButton.deeplink) && Intrinsics.d(this.title, hintButton.title) && Intrinsics.d(this.type, hintButton.type) && Intrinsics.d(this.action, hintButton.action) && Intrinsics.d(this.data, hintButton.data);
        }

        public final String getAction() {
            return this.action;
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.deeplink;
            int a11 = g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.type);
            String str2 = this.action;
            int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, Object> map = this.data;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.deeplink;
            String str2 = this.title;
            String str3 = this.type;
            String str4 = this.action;
            Map<String, Object> map = this.data;
            StringBuilder d11 = C3660k.d("HintButton(deeplink=", str, ", title=", str2, ", type=");
            Nh.a.h(d11, str3, ", action=", str4, ", data=");
            return P.f(d11, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthDTO$Input;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", HammersV3BodyDTO.PLACEHOLDER, "type", AppMeasurementSdk.ConditionalUserProperty.VALUE, "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPlaceholder", "getType", "getValue", "getError", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 0;
        private final String error;

        @NotNull
        private final String name;

        @NotNull
        private final String placeholder;

        @NotNull
        private final String type;
        private final String value;

        public Input(@NotNull String name, @NotNull String placeholder, @NotNull String type, String str, String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(type, "type");
            this.name = name;
            this.placeholder = placeholder;
            this.type = type;
            this.value = str;
            this.error = str2;
        }

        public static /* synthetic */ Input copy$default(Input input, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = input.name;
            }
            if ((i11 & 2) != 0) {
                str2 = input.placeholder;
            }
            if ((i11 & 4) != 0) {
                str3 = input.type;
            }
            if ((i11 & 8) != 0) {
                str4 = input.value;
            }
            if ((i11 & 16) != 0) {
                str5 = input.error;
            }
            String str6 = str5;
            String str7 = str3;
            return input.copy(str, str2, str7, str4, str6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component5, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        public final Input copy(@NotNull String name, @NotNull String placeholder, @NotNull String type, String value, String error) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Input(name, placeholder, type, value, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.name, input.name) && Intrinsics.d(this.placeholder, input.placeholder) && Intrinsics.d(this.type, input.type) && Intrinsics.d(this.value, input.value) && Intrinsics.d(this.error, input.error);
        }

        public final String getError() {
            return this.error;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.name.hashCode() * 31, 31, this.placeholder), 31, this.type);
            String str = this.value;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.error;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.placeholder;
            String str3 = this.type;
            String str4 = this.value;
            String str5 = this.error;
            StringBuilder d11 = C3660k.d("Input(name=", str, ", placeholder=", str2, ", type=");
            Nh.a.h(d11, str3, ", value=", str4, ", error=");
            return o0.c(d11, str5, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthDTO$SberIdButton;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "authUriAction", "redirectUriAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getAuthUriAction", "getRedirectUriAction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SberIdButton {
        public static final int $stable = 0;

        @NotNull
        private final String authUriAction;

        @NotNull
        private final String redirectUriAction;

        @NotNull
        private final String title;

        public SberIdButton(@NotNull String title, @NotNull String authUriAction, @NotNull String redirectUriAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(authUriAction, "authUriAction");
            Intrinsics.checkNotNullParameter(redirectUriAction, "redirectUriAction");
            this.title = title;
            this.authUriAction = authUriAction;
            this.redirectUriAction = redirectUriAction;
        }

        public static /* synthetic */ SberIdButton copy$default(SberIdButton sberIdButton, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sberIdButton.title;
            }
            if ((i11 & 2) != 0) {
                str2 = sberIdButton.authUriAction;
            }
            if ((i11 & 4) != 0) {
                str3 = sberIdButton.redirectUriAction;
            }
            return sberIdButton.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAuthUriAction() {
            return this.authUriAction;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getRedirectUriAction() {
            return this.redirectUriAction;
        }

        @NotNull
        public final SberIdButton copy(@NotNull String title, @NotNull String authUriAction, @NotNull String redirectUriAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(authUriAction, "authUriAction");
            Intrinsics.checkNotNullParameter(redirectUriAction, "redirectUriAction");
            return new SberIdButton(title, authUriAction, redirectUriAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SberIdButton)) {
                return false;
            }
            SberIdButton sberIdButton = (SberIdButton) other;
            return Intrinsics.d(this.title, sberIdButton.title) && Intrinsics.d(this.authUriAction, sberIdButton.authUriAction) && Intrinsics.d(this.redirectUriAction, sberIdButton.redirectUriAction);
        }

        @NotNull
        public final String getAuthUriAction() {
            return this.authUriAction;
        }

        @NotNull
        public final String getRedirectUriAction() {
            return this.redirectUriAction;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.redirectUriAction.hashCode() + g.a(this.title.hashCode() * 31, 31, this.authUriAction);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.authUriAction;
            return o0.c(C3660k.d("SberIdButton(title=", str, ", authUriAction=", str2, ", redirectUriAction="), this.redirectUriAction, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;", "", "action", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "data", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAction", "()Ljava/lang/String;", "getTitle", "getData", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitButton {
        public static final int $stable = 8;

        @NotNull
        private final String action;
        private final Map<String, Object> data;

        @NotNull
        private final String title;

        public SubmitButton(@NotNull String action, @NotNull String title, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(title, "title");
            this.action = action;
            this.title = title;
            this.data = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SubmitButton copy$default(SubmitButton submitButton, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = submitButton.action;
            }
            if ((i11 & 2) != 0) {
                str2 = submitButton.title;
            }
            if ((i11 & 4) != 0) {
                map = submitButton.data;
            }
            return submitButton.copy(str, str2, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, Object> component3() {
            return this.data;
        }

        @NotNull
        public final SubmitButton copy(@NotNull String action, @NotNull String title, Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(title, "title");
            return new SubmitButton(action, title, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitButton)) {
                return false;
            }
            SubmitButton submitButton = (SubmitButton) other;
            return Intrinsics.d(this.action, submitButton.action) && Intrinsics.d(this.title, submitButton.title) && Intrinsics.d(this.data, submitButton.data);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(this.action.hashCode() * 31, 31, this.title);
            Map<String, Object> map = this.data;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.action;
            String str2 = this.title;
            return P.f(C3660k.d("SubmitButton(action=", str, ", title=", str2, ", data="), this.data, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes;", "", "validationLexemes", "Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes$ValidationLexemes;", "<init>", "(Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes$ValidationLexemes;)V", "getValidationLexemes", "()Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes$ValidationLexemes;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ValidationLexemes", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TranslationLexemes {
        public static final int $stable = 8;

        @NotNull
        private final ValidationLexemes validationLexemes;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes$ValidationLexemes;", "", "isEmpty", "", "", "isInvalid", "Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes$ValidationLexemes$IsInvalid;", "<init>", "(Ljava/util/Map;Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes$ValidationLexemes$IsInvalid;)V", "()Ljava/util/Map;", "()Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes$ValidationLexemes$IsInvalid;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "IsInvalid", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class ValidationLexemes {
            public static final int $stable = 8;

            @NotNull
            private final Map<String, String> isEmpty;

            @NotNull
            private final IsInvalid isInvalid;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes$ValidationLexemes$IsInvalid;", "", Scopes.EMAIL, "", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPhone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class IsInvalid {
                public static final int $stable = 0;

                @NotNull
                private final String email;

                @NotNull
                private final String phone;

                public IsInvalid(@NotNull String email, @NotNull String phone) {
                    Intrinsics.checkNotNullParameter(email, "email");
                    Intrinsics.checkNotNullParameter(phone, "phone");
                    this.email = email;
                    this.phone = phone;
                }

                public static /* synthetic */ IsInvalid copy$default(IsInvalid isInvalid, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = isInvalid.email;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = isInvalid.phone;
                    }
                    return isInvalid.copy(str, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getEmail() {
                    return this.email;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getPhone() {
                    return this.phone;
                }

                @NotNull
                public final IsInvalid copy(@NotNull String email, @NotNull String phone) {
                    Intrinsics.checkNotNullParameter(email, "email");
                    Intrinsics.checkNotNullParameter(phone, "phone");
                    return new IsInvalid(email, phone);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof IsInvalid)) {
                        return false;
                    }
                    IsInvalid isInvalid = (IsInvalid) other;
                    return Intrinsics.d(this.email, isInvalid.email) && Intrinsics.d(this.phone, isInvalid.phone);
                }

                @NotNull
                public final String getEmail() {
                    return this.email;
                }

                @NotNull
                public final String getPhone() {
                    return this.phone;
                }

                public int hashCode() {
                    return this.phone.hashCode() + (this.email.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("IsInvalid(email=", this.email, ", phone=", this.phone, ")");
                }
            }

            public ValidationLexemes(@NotNull Map<String, String> isEmpty, @NotNull IsInvalid isInvalid) {
                Intrinsics.checkNotNullParameter(isEmpty, "isEmpty");
                Intrinsics.checkNotNullParameter(isInvalid, "isInvalid");
                this.isEmpty = isEmpty;
                this.isInvalid = isInvalid;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ValidationLexemes copy$default(ValidationLexemes validationLexemes, Map map, IsInvalid isInvalid, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    map = validationLexemes.isEmpty;
                }
                if ((i11 & 2) != 0) {
                    isInvalid = validationLexemes.isInvalid;
                }
                return validationLexemes.copy(map, isInvalid);
            }

            @NotNull
            public final Map<String, String> component1() {
                return this.isEmpty;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final IsInvalid getIsInvalid() {
                return this.isInvalid;
            }

            @NotNull
            public final ValidationLexemes copy(@NotNull Map<String, String> isEmpty, @NotNull IsInvalid isInvalid) {
                Intrinsics.checkNotNullParameter(isEmpty, "isEmpty");
                Intrinsics.checkNotNullParameter(isInvalid, "isInvalid");
                return new ValidationLexemes(isEmpty, isInvalid);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidationLexemes)) {
                    return false;
                }
                ValidationLexemes validationLexemes = (ValidationLexemes) other;
                return Intrinsics.d(this.isEmpty, validationLexemes.isEmpty) && Intrinsics.d(this.isInvalid, validationLexemes.isInvalid);
            }

            public int hashCode() {
                return this.isInvalid.hashCode() + (this.isEmpty.hashCode() * 31);
            }

            @NotNull
            public final Map<String, String> isEmpty() {
                return this.isEmpty;
            }

            @NotNull
            public final IsInvalid isInvalid() {
                return this.isInvalid;
            }

            @NotNull
            public String toString() {
                return "ValidationLexemes(isEmpty=" + this.isEmpty + ", isInvalid=" + this.isInvalid + ")";
            }
        }

        public TranslationLexemes(@NotNull ValidationLexemes validationLexemes) {
            Intrinsics.checkNotNullParameter(validationLexemes, "validationLexemes");
            this.validationLexemes = validationLexemes;
        }

        public static /* synthetic */ TranslationLexemes copy$default(TranslationLexemes translationLexemes, ValidationLexemes validationLexemes, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                validationLexemes = translationLexemes.validationLexemes;
            }
            return translationLexemes.copy(validationLexemes);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ValidationLexemes getValidationLexemes() {
            return this.validationLexemes;
        }

        @NotNull
        public final TranslationLexemes copy(@NotNull ValidationLexemes validationLexemes) {
            Intrinsics.checkNotNullParameter(validationLexemes, "validationLexemes");
            return new TranslationLexemes(validationLexemes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TranslationLexemes) && Intrinsics.d(this.validationLexemes, ((TranslationLexemes) other).validationLexemes);
        }

        @NotNull
        public final ValidationLexemes getValidationLexemes() {
            return this.validationLexemes;
        }

        public int hashCode() {
            return this.validationLexemes.hashCode();
        }

        @NotNull
        public String toString() {
            return "TranslationLexemes(validationLexemes=" + this.validationLexemes + ")";
        }
    }

    public AuthDTO(@NotNull String title, String str, String str2, List<Input> list, SubmitButton submitButton, Advertisement advertisement, @NotNull List<HintButton> hintButtons, SberIdButton sberIdButton, AlertEntry alertEntry, DisclaimerAtom disclaimerAtom, TextAtom textAtom, @NotNull TranslationLexemes translationLexemes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hintButtons, "hintButtons");
        Intrinsics.checkNotNullParameter(translationLexemes, "translationLexemes");
        this.title = title;
        this.origin = str;
        this.subtitle = str2;
        this.inputs = list;
        this.submitButton = submitButton;
        this.advertisement = advertisement;
        this.hintButtons = hintButtons;
        this.loginBySberIdButton = sberIdButton;
        this.alertEntry = alertEntry;
        this.disclaimer = disclaimerAtom;
        this.termsOfUseText = textAtom;
        this.translationLexemes = translationLexemes;
    }

    public static /* synthetic */ AuthDTO copy$default(AuthDTO authDTO, String str, String str2, String str3, List list, SubmitButton submitButton, Advertisement advertisement, List list2, SberIdButton sberIdButton, AlertEntry alertEntry, DisclaimerAtom disclaimerAtom, TextAtom textAtom, TranslationLexemes translationLexemes, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = authDTO.origin;
        }
        if ((i11 & 4) != 0) {
            str3 = authDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            list = authDTO.inputs;
        }
        if ((i11 & 16) != 0) {
            submitButton = authDTO.submitButton;
        }
        if ((i11 & 32) != 0) {
            advertisement = authDTO.advertisement;
        }
        if ((i11 & 64) != 0) {
            list2 = authDTO.hintButtons;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            sberIdButton = authDTO.loginBySberIdButton;
        }
        if ((i11 & 256) != 0) {
            alertEntry = authDTO.alertEntry;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            disclaimerAtom = authDTO.disclaimer;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            textAtom = authDTO.termsOfUseText;
        }
        if ((i11 & 2048) != 0) {
            translationLexemes = authDTO.translationLexemes;
        }
        TextAtom textAtom2 = textAtom;
        TranslationLexemes translationLexemes2 = translationLexemes;
        AlertEntry alertEntry2 = alertEntry;
        DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
        List list3 = list2;
        SberIdButton sberIdButton2 = sberIdButton;
        SubmitButton submitButton2 = submitButton;
        Advertisement advertisement2 = advertisement;
        return authDTO.copy(str, str2, str3, list, submitButton2, advertisement2, list3, sberIdButton2, alertEntry2, disclaimerAtom2, textAtom2, translationLexemes2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component11, reason: from getter */
    public final TextAtom getTermsOfUseText() {
        return this.termsOfUseText;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final TranslationLexemes getTranslationLexemes() {
        return this.translationLexemes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<Input> component4() {
        return this.inputs;
    }

    /* renamed from: component5, reason: from getter */
    public final SubmitButton getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component6, reason: from getter */
    public final Advertisement getAdvertisement() {
        return this.advertisement;
    }

    @NotNull
    public final List<HintButton> component7() {
        return this.hintButtons;
    }

    /* renamed from: component8, reason: from getter */
    public final SberIdButton getLoginBySberIdButton() {
        return this.loginBySberIdButton;
    }

    /* renamed from: component9, reason: from getter */
    public final AlertEntry getAlertEntry() {
        return this.alertEntry;
    }

    @NotNull
    public final AuthDTO copy(@NotNull String title, String origin, String subtitle, List<Input> inputs, SubmitButton submitButton, Advertisement advertisement, @NotNull List<HintButton> hintButtons, SberIdButton loginBySberIdButton, AlertEntry alertEntry, DisclaimerAtom disclaimer, TextAtom termsOfUseText, @NotNull TranslationLexemes translationLexemes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hintButtons, "hintButtons");
        Intrinsics.checkNotNullParameter(translationLexemes, "translationLexemes");
        return new AuthDTO(title, origin, subtitle, inputs, submitButton, advertisement, hintButtons, loginBySberIdButton, alertEntry, disclaimer, termsOfUseText, translationLexemes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthDTO)) {
            return false;
        }
        AuthDTO authDTO = (AuthDTO) other;
        return Intrinsics.d(this.title, authDTO.title) && Intrinsics.d(this.origin, authDTO.origin) && Intrinsics.d(this.subtitle, authDTO.subtitle) && Intrinsics.d(this.inputs, authDTO.inputs) && Intrinsics.d(this.submitButton, authDTO.submitButton) && Intrinsics.d(this.advertisement, authDTO.advertisement) && Intrinsics.d(this.hintButtons, authDTO.hintButtons) && Intrinsics.d(this.loginBySberIdButton, authDTO.loginBySberIdButton) && Intrinsics.d(this.alertEntry, authDTO.alertEntry) && Intrinsics.d(this.disclaimer, authDTO.disclaimer) && Intrinsics.d(this.termsOfUseText, authDTO.termsOfUseText) && Intrinsics.d(this.translationLexemes, authDTO.translationLexemes);
    }

    public final Advertisement getAdvertisement() {
        return this.advertisement;
    }

    public final AlertEntry getAlertEntry() {
        return this.alertEntry;
    }

    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final List<HintButton> getHintButtons() {
        return this.hintButtons;
    }

    public final List<Input> getInputs() {
        return this.inputs;
    }

    public final SberIdButton getLoginBySberIdButton() {
        return this.loginBySberIdButton;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final SubmitButton getSubmitButton() {
        return this.submitButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTermsOfUseText() {
        return this.termsOfUseText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final TranslationLexemes getTranslationLexemes() {
        return this.translationLexemes;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.origin;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Input> list = this.inputs;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SubmitButton submitButton = this.submitButton;
        int hashCode5 = (hashCode4 + (submitButton == null ? 0 : submitButton.hashCode())) * 31;
        Advertisement advertisement = this.advertisement;
        int b11 = g.b((hashCode5 + (advertisement == null ? 0 : advertisement.hashCode())) * 31, 31, this.hintButtons);
        SberIdButton sberIdButton = this.loginBySberIdButton;
        int hashCode6 = (b11 + (sberIdButton == null ? 0 : sberIdButton.hashCode())) * 31;
        AlertEntry alertEntry = this.alertEntry;
        int hashCode7 = (hashCode6 + (alertEntry == null ? 0 : alertEntry.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        int hashCode8 = (hashCode7 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        TextAtom textAtom = this.termsOfUseText;
        return this.translationLexemes.hashCode() + ((hashCode8 + (textAtom != null ? textAtom.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.origin;
        String str3 = this.subtitle;
        List<Input> list = this.inputs;
        SubmitButton submitButton = this.submitButton;
        Advertisement advertisement = this.advertisement;
        List<HintButton> list2 = this.hintButtons;
        SberIdButton sberIdButton = this.loginBySberIdButton;
        AlertEntry alertEntry = this.alertEntry;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        TextAtom textAtom = this.termsOfUseText;
        TranslationLexemes translationLexemes = this.translationLexemes;
        StringBuilder d11 = C3660k.d("AuthDTO(title=", str, ", origin=", str2, ", subtitle=");
        w.d(str3, ", inputs=", ", submitButton=", d11, list);
        d11.append(submitButton);
        d11.append(", advertisement=");
        d11.append(advertisement);
        d11.append(", hintButtons=");
        d11.append(list2);
        d11.append(", loginBySberIdButton=");
        d11.append(sberIdButton);
        d11.append(", alertEntry=");
        d11.append(alertEntry);
        d11.append(", disclaimer=");
        d11.append(disclaimerAtom);
        d11.append(", termsOfUseText=");
        d11.append(textAtom);
        d11.append(", translationLexemes=");
        d11.append(translationLexemes);
        d11.append(")");
        return d11.toString();
    }

    public AuthDTO(String str, String str2, String str3, List list, SubmitButton submitButton, Advertisement advertisement, List list2, SberIdButton sberIdButton, AlertEntry alertEntry, DisclaimerAtom disclaimerAtom, TextAtom textAtom, TranslationLexemes translationLexemes, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, submitButton, advertisement, (i11 & 64) != 0 ? K.f71697a : list2, sberIdButton, alertEntry, disclaimerAtom, textAtom, translationLexemes);
    }
}
