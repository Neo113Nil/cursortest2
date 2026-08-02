package ru.ozon.app.android.marketing.widgets.enableNotifications.data;

import B4.V;
import B90.C2618u;
import C.o0;
import G.g;
import Ih.a;
import Ql.c;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002%&Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003Js\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO;", "", "systemSettingsState", "Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$State;", "apiSettingsState", "closeButton", "Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$CloseButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "setTrackingInfo", "unsetTrackingInfo", "<init>", "(Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$State;Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$State;Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$CloseButton;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getSystemSettingsState", "()Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$State;", "getApiSettingsState", "getCloseButton", "()Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$CloseButton;", "getTrackingInfo", "()Ljava/util/Map;", "getSetTrackingInfo", "getUnsetTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "State", "CloseButton", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EnableNotificationsDTO {
    public static final int $stable = 8;
    private final State apiSettingsState;
    private final CloseButton closeButton;
    private final Map<String, TokenizedTrackingInfo> setTrackingInfo;

    @NotNull
    private final State systemSettingsState;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final Map<String, TokenizedTrackingInfo> unsetTrackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$CloseButton;", "", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseButton {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String icon;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CloseButton(@NotNull String icon, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = icon;
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CloseButton copy$default(CloseButton closeButton, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = closeButton.icon;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = closeButton.action;
            }
            if ((i11 & 4) != 0) {
                map = closeButton.trackingInfo;
            }
            return closeButton.copy(str, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final CloseButton copy(@NotNull String icon, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            return new CloseButton(icon, action, trackingInfo);
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
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.action, this.icon.hashCode() * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            return P.f(c.c("CloseButton(icon=", str, ", action=", atomActionDTO, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$State;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "successState", "", "errorMessage", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getSuccessState", "()Ljava/lang/String;", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable;

        @NotNull
        private final ButtonV3Atom.SmallButton button;

        @NotNull
        private final String errorMessage;
        private final TextAtom subtitle;

        @NotNull
        private final String successState;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = ButtonV3Atom.SmallButton.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | i12;
        }

        public State(@NotNull TextAtom title, TextAtom textAtom, @NotNull ButtonV3Atom.SmallButton button, @NotNull String successState, @NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(successState, "successState");
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.title = title;
            this.subtitle = textAtom;
            this.button = button;
            this.successState = successState;
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ State copy$default(State state, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallButton smallButton, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = state.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = state.subtitle;
            }
            if ((i11 & 4) != 0) {
                smallButton = state.button;
            }
            if ((i11 & 8) != 0) {
                str = state.successState;
            }
            if ((i11 & 16) != 0) {
                str2 = state.errorMessage;
            }
            String str3 = str2;
            ButtonV3Atom.SmallButton smallButton2 = smallButton;
            return state.copy(textAtom, textAtom2, smallButton2, str, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getSuccessState() {
            return this.successState;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final State copy(@NotNull TextAtom title, TextAtom subtitle, @NotNull ButtonV3Atom.SmallButton button, @NotNull String successState, @NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(successState, "successState");
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new State(title, subtitle, button, successState, errorMessage);
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

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getSuccessState() {
            return this.successState;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.subtitle;
            return this.errorMessage.hashCode() + g.a(C2618u.c(this.button, (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31), 31, this.successState);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            ButtonV3Atom.SmallButton smallButton = this.button;
            String str = this.successState;
            String str2 = this.errorMessage;
            StringBuilder a11 = HY.a.a("State(title=", textAtom, ", subtitle=", textAtom2, ", button=");
            a11.append(smallButton);
            a11.append(", successState=");
            a11.append(str);
            a11.append(", errorMessage=");
            return o0.c(a11, str2, ")");
        }
    }

    public EnableNotificationsDTO(@NotNull State systemSettingsState, State state, CloseButton closeButton, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
        Intrinsics.checkNotNullParameter(systemSettingsState, "systemSettingsState");
        this.systemSettingsState = systemSettingsState;
        this.apiSettingsState = state;
        this.closeButton = closeButton;
        this.trackingInfo = map;
        this.setTrackingInfo = map2;
        this.unsetTrackingInfo = map3;
    }

    public static /* synthetic */ EnableNotificationsDTO copy$default(EnableNotificationsDTO enableNotificationsDTO, State state, State state2, CloseButton closeButton, Map map, Map map2, Map map3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            state = enableNotificationsDTO.systemSettingsState;
        }
        if ((i11 & 2) != 0) {
            state2 = enableNotificationsDTO.apiSettingsState;
        }
        if ((i11 & 4) != 0) {
            closeButton = enableNotificationsDTO.closeButton;
        }
        if ((i11 & 8) != 0) {
            map = enableNotificationsDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            map2 = enableNotificationsDTO.setTrackingInfo;
        }
        if ((i11 & 32) != 0) {
            map3 = enableNotificationsDTO.unsetTrackingInfo;
        }
        Map map4 = map2;
        Map map5 = map3;
        return enableNotificationsDTO.copy(state, state2, closeButton, map, map4, map5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final State getSystemSettingsState() {
        return this.systemSettingsState;
    }

    /* renamed from: component2, reason: from getter */
    public final State getApiSettingsState() {
        return this.apiSettingsState;
    }

    /* renamed from: component3, reason: from getter */
    public final CloseButton getCloseButton() {
        return this.closeButton;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.setTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.unsetTrackingInfo;
    }

    @NotNull
    public final EnableNotificationsDTO copy(@NotNull State systemSettingsState, State apiSettingsState, CloseButton closeButton, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> setTrackingInfo, Map<String, TokenizedTrackingInfo> unsetTrackingInfo) {
        Intrinsics.checkNotNullParameter(systemSettingsState, "systemSettingsState");
        return new EnableNotificationsDTO(systemSettingsState, apiSettingsState, closeButton, trackingInfo, setTrackingInfo, unsetTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnableNotificationsDTO)) {
            return false;
        }
        EnableNotificationsDTO enableNotificationsDTO = (EnableNotificationsDTO) other;
        return Intrinsics.d(this.systemSettingsState, enableNotificationsDTO.systemSettingsState) && Intrinsics.d(this.apiSettingsState, enableNotificationsDTO.apiSettingsState) && Intrinsics.d(this.closeButton, enableNotificationsDTO.closeButton) && Intrinsics.d(this.trackingInfo, enableNotificationsDTO.trackingInfo) && Intrinsics.d(this.setTrackingInfo, enableNotificationsDTO.setTrackingInfo) && Intrinsics.d(this.unsetTrackingInfo, enableNotificationsDTO.unsetTrackingInfo);
    }

    public final State getApiSettingsState() {
        return this.apiSettingsState;
    }

    public final CloseButton getCloseButton() {
        return this.closeButton;
    }

    public final Map<String, TokenizedTrackingInfo> getSetTrackingInfo() {
        return this.setTrackingInfo;
    }

    @NotNull
    public final State getSystemSettingsState() {
        return this.systemSettingsState;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getUnsetTrackingInfo() {
        return this.unsetTrackingInfo;
    }

    public int hashCode() {
        int hashCode = this.systemSettingsState.hashCode() * 31;
        State state = this.apiSettingsState;
        int hashCode2 = (hashCode + (state == null ? 0 : state.hashCode())) * 31;
        CloseButton closeButton = this.closeButton;
        int hashCode3 = (hashCode2 + (closeButton == null ? 0 : closeButton.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.setTrackingInfo;
        int hashCode5 = (hashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.unsetTrackingInfo;
        return hashCode5 + (map3 != null ? map3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        State state = this.systemSettingsState;
        State state2 = this.apiSettingsState;
        CloseButton closeButton = this.closeButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.setTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.unsetTrackingInfo;
        StringBuilder sb2 = new StringBuilder("EnableNotificationsDTO(systemSettingsState=");
        sb2.append(state);
        sb2.append(", apiSettingsState=");
        sb2.append(state2);
        sb2.append(", closeButton=");
        sb2.append(closeButton);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", setTrackingInfo=");
        return V.c(sb2, map2, ", unsetTrackingInfo=", map3, ")");
    }
}
