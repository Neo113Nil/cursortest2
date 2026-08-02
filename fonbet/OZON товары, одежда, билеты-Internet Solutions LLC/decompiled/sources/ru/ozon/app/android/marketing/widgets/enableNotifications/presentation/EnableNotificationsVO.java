package ru.ozon.app.android.marketing.widgets.enableNotifications.presentation;

import B3.p;
import B90.C2618u;
import C.o0;
import G.g;
import T7.P;
import Ve.C4598rp;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003234Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u000e\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J|\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b-\u0010,R\u001f\u0010\u000e\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$State;", "systemSettingsState", "apiSettingsState", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$CloseButton;", "closeButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "setTrackingInfo", "unsetTrackingInfo", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;", "stateToShow", "<init>", "(JLru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$State;Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$State;Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$CloseButton;LWZ/t;LWZ/t;LWZ/t;Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;)V", "copy", "(JLru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$State;Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$State;Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$CloseButton;LWZ/t;LWZ/t;LWZ/t;Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;)Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$State;", "getSystemSettingsState", "()Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$State;", "getApiSettingsState", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$CloseButton;", "getCloseButton", "()Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$CloseButton;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "getSetTrackingInfo", "getUnsetTrackingInfo", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;", "getStateToShow", "()Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;", "State", "CloseButton", "StateToShow", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EnableNotificationsVO implements c {
    private final State apiSettingsState;
    private final CloseButton closeButton;
    private final long id;
    private final t setTrackingInfo;

    @NotNull
    private final StateToShow stateToShow;

    @NotNull
    private final State systemSettingsState;
    private final t trackingInfo;
    private final t unsetTrackingInfo;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$CloseButton;", "", "", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseButton {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final String icon;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CloseButton(@NotNull String icon, @NotNull AtomAction action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = icon;
            this.action = action;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CloseButton)) {
                return false;
            }
            CloseButton closeButton = (CloseButton) other;
            return Intrinsics.d(this.icon, closeButton.icon) && Intrinsics.d(this.action, closeButton.action) && Intrinsics.d(this.trackingInfo, closeButton.trackingInfo);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.action, this.icon.hashCode() * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            AtomAction atomAction = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("CloseButton(icon=");
            sb2.append(str);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$State;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "", "successState", "errorMessage", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Ljava/lang/String;", "getSuccessState", "getErrorMessage", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = ButtonV3Atom.SmallButton.$stable;

        @NotNull
        private final ButtonV3Atom.SmallButton button;

        @NotNull
        private final String errorMessage;
        private final TextDTO subtitle;

        @NotNull
        private final String successState;

        @NotNull
        private final TextDTO title;

        public State(@NotNull TextDTO title, TextDTO textDTO, @NotNull ButtonV3Atom.SmallButton button, @NotNull String successState, @NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(successState, "successState");
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.title = title;
            this.subtitle = textDTO;
            this.button = button;
            this.successState = successState;
            this.errorMessage = errorMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.d(this.title, state.title) && Intrinsics.d(this.subtitle, state.subtitle) && Intrinsics.d(this.button, state.button) && Intrinsics.d(this.successState, state.successState) && Intrinsics.d(this.errorMessage, state.errorMessage);
        }

        @NotNull
        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getSuccessState() {
            return this.successState;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            return this.errorMessage.hashCode() + g.a(C2618u.c(this.button, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31), 31, this.successState);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ButtonV3Atom.SmallButton smallButton = this.button;
            String str = this.successState;
            String str2 = this.errorMessage;
            StringBuilder g10 = D3.g.g("State(title=", textDTO, ", subtitle=", textDTO2, ", button=");
            g10.append(smallButton);
            g10.append(", successState=");
            g10.append(str);
            g10.append(", errorMessage=");
            return o0.c(g10, str2, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;", "", "<init>", "()V", "SystemState", "ApiSuccessState", "ApiState", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow$ApiState;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow$ApiSuccessState;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow$SystemState;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class StateToShow {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow$ApiState;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;", "", "turnOnAtStart", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getTurnOnAtStart", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ApiState extends StateToShow {
            private final boolean turnOnAtStart;

            public ApiState(boolean z11) {
                super(null);
                this.turnOnAtStart = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ApiState) && this.turnOnAtStart == ((ApiState) other).turnOnAtStart;
            }

            public final boolean getTurnOnAtStart() {
                return this.turnOnAtStart;
            }

            public int hashCode() {
                return Boolean.hashCode(this.turnOnAtStart);
            }

            @NotNull
            public String toString() {
                return C2618u.g("ApiState(turnOnAtStart=", ")", this.turnOnAtStart);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow$ApiSuccessState;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ApiSuccessState extends StateToShow {

            @NotNull
            public static final ApiSuccessState INSTANCE = new ApiSuccessState();

            private ApiSuccessState() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow$SystemState;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SystemState extends StateToShow {

            @NotNull
            public static final SystemState INSTANCE = new SystemState();

            private SystemState() {
                super(null);
            }
        }

        public /* synthetic */ StateToShow(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateToShow() {
        }
    }

    public EnableNotificationsVO(long j11, @NotNull State systemSettingsState, State state, CloseButton closeButton, t tVar, t tVar2, t tVar3, @NotNull StateToShow stateToShow) {
        Intrinsics.checkNotNullParameter(systemSettingsState, "systemSettingsState");
        Intrinsics.checkNotNullParameter(stateToShow, "stateToShow");
        this.id = j11;
        this.systemSettingsState = systemSettingsState;
        this.apiSettingsState = state;
        this.closeButton = closeButton;
        this.trackingInfo = tVar;
        this.setTrackingInfo = tVar2;
        this.unsetTrackingInfo = tVar3;
        this.stateToShow = stateToShow;
    }

    public static /* synthetic */ EnableNotificationsVO copy$default(EnableNotificationsVO enableNotificationsVO, long j11, State state, State state2, CloseButton closeButton, t tVar, t tVar2, t tVar3, StateToShow stateToShow, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = enableNotificationsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            state = enableNotificationsVO.systemSettingsState;
        }
        State state3 = state;
        if ((i11 & 4) != 0) {
            state2 = enableNotificationsVO.apiSettingsState;
        }
        State state4 = state2;
        if ((i11 & 8) != 0) {
            closeButton = enableNotificationsVO.closeButton;
        }
        return enableNotificationsVO.copy(j12, state3, state4, closeButton, (i11 & 16) != 0 ? enableNotificationsVO.trackingInfo : tVar, (i11 & 32) != 0 ? enableNotificationsVO.setTrackingInfo : tVar2, (i11 & 64) != 0 ? enableNotificationsVO.unsetTrackingInfo : tVar3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? enableNotificationsVO.stateToShow : stateToShow);
    }

    @NotNull
    public final EnableNotificationsVO copy(long id2, @NotNull State systemSettingsState, State apiSettingsState, CloseButton closeButton, t trackingInfo, t setTrackingInfo, t unsetTrackingInfo, @NotNull StateToShow stateToShow) {
        Intrinsics.checkNotNullParameter(systemSettingsState, "systemSettingsState");
        Intrinsics.checkNotNullParameter(stateToShow, "stateToShow");
        return new EnableNotificationsVO(id2, systemSettingsState, apiSettingsState, closeButton, trackingInfo, setTrackingInfo, unsetTrackingInfo, stateToShow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnableNotificationsVO)) {
            return false;
        }
        EnableNotificationsVO enableNotificationsVO = (EnableNotificationsVO) other;
        return this.id == enableNotificationsVO.id && Intrinsics.d(this.systemSettingsState, enableNotificationsVO.systemSettingsState) && Intrinsics.d(this.apiSettingsState, enableNotificationsVO.apiSettingsState) && Intrinsics.d(this.closeButton, enableNotificationsVO.closeButton) && Intrinsics.d(this.trackingInfo, enableNotificationsVO.trackingInfo) && Intrinsics.d(this.setTrackingInfo, enableNotificationsVO.setTrackingInfo) && Intrinsics.d(this.unsetTrackingInfo, enableNotificationsVO.unsetTrackingInfo) && Intrinsics.d(this.stateToShow, enableNotificationsVO.stateToShow);
    }

    public final State getApiSettingsState() {
        return this.apiSettingsState;
    }

    public final CloseButton getCloseButton() {
        return this.closeButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getSetTrackingInfo() {
        return this.setTrackingInfo;
    }

    @NotNull
    public final StateToShow getStateToShow() {
        return this.stateToShow;
    }

    @NotNull
    public final State getSystemSettingsState() {
        return this.systemSettingsState;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    public final t getUnsetTrackingInfo() {
        return this.unsetTrackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.systemSettingsState.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        State state = this.apiSettingsState;
        int hashCode2 = (hashCode + (state == null ? 0 : state.hashCode())) * 31;
        CloseButton closeButton = this.closeButton;
        int hashCode3 = (hashCode2 + (closeButton == null ? 0 : closeButton.hashCode())) * 31;
        t tVar = this.trackingInfo;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.setTrackingInfo;
        int hashCode5 = (hashCode4 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.unsetTrackingInfo;
        return this.stateToShow.hashCode() + ((hashCode5 + (tVar3 != null ? tVar3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        State state = this.systemSettingsState;
        State state2 = this.apiSettingsState;
        CloseButton closeButton = this.closeButton;
        t tVar = this.trackingInfo;
        t tVar2 = this.setTrackingInfo;
        t tVar3 = this.unsetTrackingInfo;
        StateToShow stateToShow = this.stateToShow;
        StringBuilder sb2 = new StringBuilder("EnableNotificationsVO(id=");
        sb2.append(j11);
        sb2.append(", systemSettingsState=");
        sb2.append(state);
        sb2.append(", apiSettingsState=");
        sb2.append(state2);
        sb2.append(", closeButton=");
        sb2.append(closeButton);
        p.d(sb2, ", trackingInfo=", tVar, ", setTrackingInfo=", tVar2);
        sb2.append(", unsetTrackingInfo=");
        sb2.append(tVar3);
        sb2.append(", stateToShow=");
        sb2.append(stateToShow);
        sb2.append(")");
        return sb2.toString();
    }
}
