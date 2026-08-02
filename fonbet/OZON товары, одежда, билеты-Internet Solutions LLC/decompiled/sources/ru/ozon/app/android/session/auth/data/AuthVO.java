package ru.ozon.app.android.session.auth.data;

import Ak.C2436a;
import B0.C2454a;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.session.auth.data.AuthDTO;
import ru.ozon.app.android.session.auth.data.alertentry.AlertEntryVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003JKLB\u008b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ®\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b/\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b0\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b:\u00103R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "origin", "", "Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "inputs", "Lru/ozon/app/android/session/auth/data/AuthVO$Advertisement;", "advertisement", "Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;", "submitButton", "Lru/ozon/app/android/session/auth/data/AuthDTO$HintButton;", "hintButtons", "Lru/ozon/app/android/session/auth/data/AuthVO$SberButtonVO;", "loginBySberIdButton", "Lru/ozon/app/android/session/auth/data/alertentry/AlertEntryVO;", "alertEntry", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "termsOfUseText", "Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes;", "translationLexemes", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/session/auth/data/AuthVO$Advertisement;Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;Ljava/util/List;Lru/ozon/app/android/session/auth/data/AuthVO$SberButtonVO;Lru/ozon/app/android/session/auth/data/alertentry/AlertEntryVO;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/session/auth/data/AuthVO$Advertisement;Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;Ljava/util/List;Lru/ozon/app/android/session/auth/data/AuthVO$SberButtonVO;Lru/ozon/app/android/session/auth/data/alertentry/AlertEntryVO;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes;)Lru/ozon/app/android/session/auth/data/AuthVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "getOrigin", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "Lru/ozon/app/android/session/auth/data/AuthVO$Advertisement;", "getAdvertisement", "()Lru/ozon/app/android/session/auth/data/AuthVO$Advertisement;", "Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;", "getSubmitButton", "()Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;", "getHintButtons", "Lru/ozon/app/android/session/auth/data/AuthVO$SberButtonVO;", "getLoginBySberIdButton", "()Lru/ozon/app/android/session/auth/data/AuthVO$SberButtonVO;", "Lru/ozon/app/android/session/auth/data/alertentry/AlertEntryVO;", "getAlertEntry", "()Lru/ozon/app/android/session/auth/data/alertentry/AlertEntryVO;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTermsOfUseText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes;", "getTranslationLexemes", "()Lru/ozon/app/android/session/auth/data/AuthDTO$TranslationLexemes;", "Input", "Advertisement", "SberButtonVO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AuthVO implements c {
    private final Advertisement advertisement;
    private final AlertEntryVO alertEntry;
    private final DisclaimerAtom annotation;

    @NotNull
    private final List<AuthDTO.HintButton> hintButtons;
    private final long id;

    @NotNull
    private final List<Input> inputs;
    private final SberButtonVO loginBySberIdButton;
    private final String origin;
    private final AuthDTO.SubmitButton submitButton;
    private final String subtitle;
    private final TextAtom termsOfUseText;

    @NotNull
    private final String title;

    @NotNull
    private final AuthDTO.TranslationLexemes translationLexemes;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthVO$Advertisement;", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "atom", "", "paramKey", "", "isLocalUpdate", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;Ljava/lang/String;Z)V", "copy", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;Ljava/lang/String;Z)Lru/ozon/app/android/session/auth/data/AuthVO$Advertisement;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "getAtom", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "Ljava/lang/String;", "getParamKey", "Z", "()Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Advertisement {

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio atom;
        private final boolean isLocalUpdate;

        @NotNull
        private final String paramKey;

        public Advertisement(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio atom, @NotNull String paramKey, boolean z11) {
            Intrinsics.checkNotNullParameter(atom, "atom");
            Intrinsics.checkNotNullParameter(paramKey, "paramKey");
            this.atom = atom;
            this.paramKey = paramKey;
            this.isLocalUpdate = z11;
        }

        public static /* synthetic */ Advertisement copy$default(Advertisement advertisement, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellWithSubtitleCheckboxRadio = advertisement.atom;
            }
            if ((i11 & 2) != 0) {
                str = advertisement.paramKey;
            }
            if ((i11 & 4) != 0) {
                z11 = advertisement.isLocalUpdate;
            }
            return advertisement.copy(cellWithSubtitleCheckboxRadio, str, z11);
        }

        @NotNull
        public final Advertisement copy(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio atom, @NotNull String paramKey, boolean isLocalUpdate) {
            Intrinsics.checkNotNullParameter(atom, "atom");
            Intrinsics.checkNotNullParameter(paramKey, "paramKey");
            return new Advertisement(atom, paramKey, isLocalUpdate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Advertisement)) {
                return false;
            }
            Advertisement advertisement = (Advertisement) other;
            return Intrinsics.d(this.atom, advertisement.atom) && Intrinsics.d(this.paramKey, advertisement.paramKey) && this.isLocalUpdate == advertisement.isLocalUpdate;
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio getAtom() {
            return this.atom;
        }

        @NotNull
        public final String getParamKey() {
            return this.paramKey;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocalUpdate) + g.a(this.atom.hashCode() * 31, 31, this.paramKey);
        }

        /* renamed from: isLocalUpdate, reason: from getter */
        public final boolean getIsLocalUpdate() {
            return this.isLocalUpdate;
        }

        @NotNull
        public String toString() {
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio = this.atom;
            String str = this.paramKey;
            boolean z11 = this.isLocalUpdate;
            StringBuilder sb2 = new StringBuilder("Advertisement(atom=");
            sb2.append(cellWithSubtitleCheckboxRadio);
            sb2.append(", paramKey=");
            sb2.append(str);
            sb2.append(", isLocalUpdate=");
            return a.a(")", sb2, z11);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthVO$SberButtonVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "authUriAction", "redirectUriAction", "origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getAuthUriAction", "getRedirectUriAction", "getOrigin", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SberButtonVO {

        @NotNull
        private final String authUriAction;
        private final String origin;

        @NotNull
        private final String redirectUriAction;

        @NotNull
        private final String title;

        public SberButtonVO(@NotNull String title, @NotNull String authUriAction, @NotNull String redirectUriAction, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(authUriAction, "authUriAction");
            Intrinsics.checkNotNullParameter(redirectUriAction, "redirectUriAction");
            this.title = title;
            this.authUriAction = authUriAction;
            this.redirectUriAction = redirectUriAction;
            this.origin = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SberButtonVO)) {
                return false;
            }
            SberButtonVO sberButtonVO = (SberButtonVO) other;
            return Intrinsics.d(this.title, sberButtonVO.title) && Intrinsics.d(this.authUriAction, sberButtonVO.authUriAction) && Intrinsics.d(this.redirectUriAction, sberButtonVO.redirectUriAction) && Intrinsics.d(this.origin, sberButtonVO.origin);
        }

        @NotNull
        public final String getAuthUriAction() {
            return this.authUriAction;
        }

        public final String getOrigin() {
            return this.origin;
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
            int a11 = g.a(g.a(this.title.hashCode() * 31, 31, this.authUriAction), 31, this.redirectUriAction);
            String str = this.origin;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.authUriAction;
            return C3173b.c(C3660k.d("SberButtonVO(title=", str, ", authUriAction=", str2, ", redirectUriAction="), this.redirectUriAction, ", origin=", this.origin, ")");
        }
    }

    public AuthVO(long j11, @NotNull String title, String str, String str2, @NotNull List<Input> inputs, Advertisement advertisement, AuthDTO.SubmitButton submitButton, @NotNull List<AuthDTO.HintButton> hintButtons, SberButtonVO sberButtonVO, AlertEntryVO alertEntryVO, DisclaimerAtom disclaimerAtom, TextAtom textAtom, @NotNull AuthDTO.TranslationLexemes translationLexemes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(hintButtons, "hintButtons");
        Intrinsics.checkNotNullParameter(translationLexemes, "translationLexemes");
        this.id = j11;
        this.title = title;
        this.subtitle = str;
        this.origin = str2;
        this.inputs = inputs;
        this.advertisement = advertisement;
        this.submitButton = submitButton;
        this.hintButtons = hintButtons;
        this.loginBySberIdButton = sberButtonVO;
        this.alertEntry = alertEntryVO;
        this.annotation = disclaimerAtom;
        this.termsOfUseText = textAtom;
        this.translationLexemes = translationLexemes;
    }

    @NotNull
    public final AuthVO copy(long id2, @NotNull String title, String subtitle, String origin, @NotNull List<Input> inputs, Advertisement advertisement, AuthDTO.SubmitButton submitButton, @NotNull List<AuthDTO.HintButton> hintButtons, SberButtonVO loginBySberIdButton, AlertEntryVO alertEntry, DisclaimerAtom annotation, TextAtom termsOfUseText, @NotNull AuthDTO.TranslationLexemes translationLexemes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(hintButtons, "hintButtons");
        Intrinsics.checkNotNullParameter(translationLexemes, "translationLexemes");
        return new AuthVO(id2, title, subtitle, origin, inputs, advertisement, submitButton, hintButtons, loginBySberIdButton, alertEntry, annotation, termsOfUseText, translationLexemes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthVO)) {
            return false;
        }
        AuthVO authVO = (AuthVO) other;
        return this.id == authVO.id && Intrinsics.d(this.title, authVO.title) && Intrinsics.d(this.subtitle, authVO.subtitle) && Intrinsics.d(this.origin, authVO.origin) && Intrinsics.d(this.inputs, authVO.inputs) && Intrinsics.d(this.advertisement, authVO.advertisement) && Intrinsics.d(this.submitButton, authVO.submitButton) && Intrinsics.d(this.hintButtons, authVO.hintButtons) && Intrinsics.d(this.loginBySberIdButton, authVO.loginBySberIdButton) && Intrinsics.d(this.alertEntry, authVO.alertEntry) && Intrinsics.d(this.annotation, authVO.annotation) && Intrinsics.d(this.termsOfUseText, authVO.termsOfUseText) && Intrinsics.d(this.translationLexemes, authVO.translationLexemes);
    }

    public final Advertisement getAdvertisement() {
        return this.advertisement;
    }

    public final AlertEntryVO getAlertEntry() {
        return this.alertEntry;
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    @NotNull
    public final List<AuthDTO.HintButton> getHintButtons() {
        return this.hintButtons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Input> getInputs() {
        return this.inputs;
    }

    public final SberButtonVO getLoginBySberIdButton() {
        return this.loginBySberIdButton;
    }

    public final String getOrigin() {
        return this.origin;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final AuthDTO.SubmitButton getSubmitButton() {
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
    public final AuthDTO.TranslationLexemes getTranslationLexemes() {
        return this.translationLexemes;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.origin;
        int b11 = g.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.inputs);
        Advertisement advertisement = this.advertisement;
        int hashCode2 = (b11 + (advertisement == null ? 0 : advertisement.hashCode())) * 31;
        AuthDTO.SubmitButton submitButton = this.submitButton;
        int b12 = g.b((hashCode2 + (submitButton == null ? 0 : submitButton.hashCode())) * 31, 31, this.hintButtons);
        SberButtonVO sberButtonVO = this.loginBySberIdButton;
        int hashCode3 = (b12 + (sberButtonVO == null ? 0 : sberButtonVO.hashCode())) * 31;
        AlertEntryVO alertEntryVO = this.alertEntry;
        int hashCode4 = (hashCode3 + (alertEntryVO == null ? 0 : alertEntryVO.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.annotation;
        int hashCode5 = (hashCode4 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        TextAtom textAtom = this.termsOfUseText;
        return this.translationLexemes.hashCode() + ((hashCode5 + (textAtom != null ? textAtom.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.origin;
        List<Input> list = this.inputs;
        Advertisement advertisement = this.advertisement;
        AuthDTO.SubmitButton submitButton = this.submitButton;
        List<AuthDTO.HintButton> list2 = this.hintButtons;
        SberButtonVO sberButtonVO = this.loginBySberIdButton;
        AlertEntryVO alertEntryVO = this.alertEntry;
        DisclaimerAtom disclaimerAtom = this.annotation;
        TextAtom textAtom = this.termsOfUseText;
        AuthDTO.TranslationLexemes translationLexemes = this.translationLexemes;
        StringBuilder c11 = C2436a.c(j11, "AuthVO(id=", ", title=", str);
        Nh.a.h(c11, ", subtitle=", str2, ", origin=", str3);
        c11.append(", inputs=");
        c11.append(list);
        c11.append(", advertisement=");
        c11.append(advertisement);
        c11.append(", submitButton=");
        c11.append(submitButton);
        c11.append(", hintButtons=");
        c11.append(list2);
        c11.append(", loginBySberIdButton=");
        c11.append(sberButtonVO);
        c11.append(", alertEntry=");
        c11.append(alertEntryVO);
        c11.append(", annotation=");
        c11.append(disclaimerAtom);
        c11.append(", termsOfUseText=");
        c11.append(textAtom);
        c11.append(", translationLexemes=");
        c11.append(translationLexemes);
        c11.append(")");
        return c11.toString();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010Jn\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b!\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b\u000e\u0010%¨\u0006)"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "", "Lru/ozon/app/android/session/auth/data/AuthVO$Input$ViewType;", "viewType", "", AppMeasurementSdk.ConditionalUserProperty.NAME, HammersV3BodyDTO.PLACEHOLDER, "type", AppMeasurementSdk.ConditionalUserProperty.VALUE, "error", "", "requestFocus", "", "imeOptions", "isVisible", "<init>", "(Lru/ozon/app/android/session/auth/data/AuthVO$Input$ViewType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIZ)V", "copy", "(Lru/ozon/app/android/session/auth/data/AuthVO$Input$ViewType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIZ)Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/session/auth/data/AuthVO$Input$ViewType;", "getViewType", "()Lru/ozon/app/android/session/auth/data/AuthVO$Input$ViewType;", "Ljava/lang/String;", "getName", "getPlaceholder", "getType", "getValue", "getError", "Z", "getRequestFocus", "()Z", "I", "getImeOptions", "ViewType", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        private final String error;
        private final int imeOptions;
        private final boolean isVisible;

        @NotNull
        private final String name;

        @NotNull
        private final String placeholder;
        private final boolean requestFocus;

        @NotNull
        private final String type;
        private final String value;

        @NotNull
        private final ViewType viewType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/session/auth/data/AuthVO$Input$ViewType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "INPUT", "PASSWORD", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ViewType {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ ViewType[] $VALUES;
            public static final ViewType INPUT = new ViewType("INPUT", 0, 1);
            public static final ViewType PASSWORD = new ViewType("PASSWORD", 1, 2);
            private final int id;

            private static final /* synthetic */ ViewType[] $values() {
                return new ViewType[]{INPUT, PASSWORD};
            }

            static {
                ViewType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ViewType(String str, int i11, int i12) {
                this.id = i12;
            }

            public static ViewType valueOf(String str) {
                return (ViewType) Enum.valueOf(ViewType.class, str);
            }

            public static ViewType[] values() {
                return (ViewType[]) $VALUES.clone();
            }

            public final int getId() {
                return this.id;
            }
        }

        public Input(@NotNull ViewType viewType, @NotNull String name, @NotNull String placeholder, @NotNull String type, String str, String str2, boolean z11, int i11, boolean z12) {
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(type, "type");
            this.viewType = viewType;
            this.name = name;
            this.placeholder = placeholder;
            this.type = type;
            this.value = str;
            this.error = str2;
            this.requestFocus = z11;
            this.imeOptions = i11;
            this.isVisible = z12;
        }

        public static /* synthetic */ Input copy$default(Input input, ViewType viewType, String str, String str2, String str3, String str4, String str5, boolean z11, int i11, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                viewType = input.viewType;
            }
            if ((i12 & 2) != 0) {
                str = input.name;
            }
            if ((i12 & 4) != 0) {
                str2 = input.placeholder;
            }
            if ((i12 & 8) != 0) {
                str3 = input.type;
            }
            if ((i12 & 16) != 0) {
                str4 = input.value;
            }
            if ((i12 & 32) != 0) {
                str5 = input.error;
            }
            if ((i12 & 64) != 0) {
                z11 = input.requestFocus;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                i11 = input.imeOptions;
            }
            if ((i12 & 256) != 0) {
                z12 = input.isVisible;
            }
            int i13 = i11;
            boolean z13 = z12;
            String str6 = str5;
            boolean z14 = z11;
            String str7 = str4;
            String str8 = str2;
            return input.copy(viewType, str, str8, str3, str7, str6, z14, i13, z13);
        }

        @NotNull
        public final Input copy(@NotNull ViewType viewType, @NotNull String name, @NotNull String placeholder, @NotNull String type, String value, String error, boolean requestFocus, int imeOptions, boolean isVisible) {
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Input(viewType, name, placeholder, type, value, error, requestFocus, imeOptions, isVisible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return this.viewType == input.viewType && Intrinsics.d(this.name, input.name) && Intrinsics.d(this.placeholder, input.placeholder) && Intrinsics.d(this.type, input.type) && Intrinsics.d(this.value, input.value) && Intrinsics.d(this.error, input.error) && this.requestFocus == input.requestFocus && this.imeOptions == input.imeOptions && this.isVisible == input.isVisible;
        }

        public final String getError() {
            return this.error;
        }

        public final int getImeOptions() {
            return this.imeOptions;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final boolean getRequestFocus() {
            return this.requestFocus;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final ViewType getViewType() {
            return this.viewType;
        }

        public int hashCode() {
            int a11 = g.a(g.a(g.a(this.viewType.hashCode() * 31, 31, this.name), 31, this.placeholder), 31, this.type);
            String str = this.value;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.error;
            return Boolean.hashCode(this.isVisible) + C2454a.a(this.imeOptions, C3532b.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.requestFocus), 31);
        }

        /* renamed from: isVisible, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public String toString() {
            ViewType viewType = this.viewType;
            String str = this.name;
            String str2 = this.placeholder;
            String str3 = this.type;
            String str4 = this.value;
            String str5 = this.error;
            boolean z11 = this.requestFocus;
            int i11 = this.imeOptions;
            boolean z12 = this.isVisible;
            StringBuilder sb2 = new StringBuilder("Input(viewType=");
            sb2.append(viewType);
            sb2.append(", name=");
            sb2.append(str);
            sb2.append(", placeholder=");
            Nh.a.h(sb2, str2, ", type=", str3, ", value=");
            Nh.a.h(sb2, str4, ", error=", str5, ", requestFocus=");
            sb2.append(z11);
            sb2.append(", imeOptions=");
            sb2.append(i11);
            sb2.append(", isVisible=");
            return a.a(")", sb2, z12);
        }

        public /* synthetic */ Input(ViewType viewType, String str, String str2, String str3, String str4, String str5, boolean z11, int i11, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewType, str, str2, str3, str4, str5, z11, i11, (i12 & 256) != 0 ? true : z12);
        }
    }
}
