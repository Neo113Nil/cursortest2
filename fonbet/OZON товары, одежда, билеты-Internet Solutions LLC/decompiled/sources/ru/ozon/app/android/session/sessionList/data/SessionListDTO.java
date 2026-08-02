package ru.ozon.app.android.session.sessionList.data;

import G.g;
import I1.w;
import K1.G;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002+,BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J_\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lru/ozon/app/android/session/sessionList/data/SessionListDTO;", "", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "listTitle", "", "listSubtitle", "currentSession", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO$CurrentSessionDTO;", "sessionsTitle", "sessions", "", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO$SessionDTO;", "logoutOnAll", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/session/sessionList/data/SessionListDTO$CurrentSessionDTO;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getListTitle", "()Ljava/lang/String;", "getListSubtitle", "getCurrentSession", "()Lru/ozon/app/android/session/sessionList/data/SessionListDTO$CurrentSessionDTO;", "getSessionsTitle", "getSessions", "()Ljava/util/List;", "getLogoutOnAll", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "CurrentSessionDTO", "SessionDTO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SessionListDTO {
    public static final int $stable = 8;
    private final DisclaimerAtom annotation;
    private final CurrentSessionDTO currentSession;

    @NotNull
    private final String listSubtitle;

    @NotNull
    private final String listTitle;
    private final ButtonV3Atom.LargeButton logoutOnAll;
    private final List<SessionDTO> sessions;
    private final String sessionsTitle;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/sessionList/data/SessionListDTO$CurrentSessionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "data", "Lru/ozon/app/android/session/sessionList/data/SessionListDTO$SessionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/session/sessionList/data/SessionListDTO$SessionDTO;)V", "getTitle", "()Ljava/lang/String;", "getData", "()Lru/ozon/app/android/session/sessionList/data/SessionListDTO$SessionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CurrentSessionDTO {
        public static final int $stable = 0;

        @NotNull
        private final SessionDTO data;

        @NotNull
        private final String title;

        public CurrentSessionDTO(@NotNull String title, @NotNull SessionDTO data) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(data, "data");
            this.title = title;
            this.data = data;
        }

        public static /* synthetic */ CurrentSessionDTO copy$default(CurrentSessionDTO currentSessionDTO, String str, SessionDTO sessionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = currentSessionDTO.title;
            }
            if ((i11 & 2) != 0) {
                sessionDTO = currentSessionDTO.data;
            }
            return currentSessionDTO.copy(str, sessionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SessionDTO getData() {
            return this.data;
        }

        @NotNull
        public final CurrentSessionDTO copy(@NotNull String title, @NotNull SessionDTO data) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(data, "data");
            return new CurrentSessionDTO(title, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurrentSessionDTO)) {
                return false;
            }
            CurrentSessionDTO currentSessionDTO = (CurrentSessionDTO) other;
            return Intrinsics.d(this.title, currentSessionDTO.title) && Intrinsics.d(this.data, currentSessionDTO.data);
        }

        @NotNull
        public final SessionDTO getData() {
            return this.data;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.data.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CurrentSessionDTO(title=" + this.title + ", data=" + this.data + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/sessionList/data/SessionListDTO$SessionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SessionDTO {
        public static final int $stable = 0;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;

        public SessionDTO(@NotNull String title, @NotNull String subtitle, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.subtitle = subtitle;
            this.action = action;
        }

        public static /* synthetic */ SessionDTO copy$default(SessionDTO sessionDTO, String str, String str2, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sessionDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = sessionDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = sessionDTO.action;
            }
            return sessionDTO.copy(str, str2, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final SessionDTO copy(@NotNull String title, @NotNull String subtitle, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(action, "action");
            return new SessionDTO(title, subtitle, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionDTO)) {
                return false;
            }
            SessionDTO sessionDTO = (SessionDTO) other;
            return Intrinsics.d(this.title, sessionDTO.title) && Intrinsics.d(this.subtitle, sessionDTO.subtitle) && Intrinsics.d(this.action, sessionDTO.action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.action.hashCode() + g.a(this.title.hashCode() * 31, 31, this.subtitle);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return G.c(C3660k.d("SessionDTO(title=", str, ", subtitle=", str2, ", action="), this.action, ")");
        }
    }

    public SessionListDTO(DisclaimerAtom disclaimerAtom, @NotNull String listTitle, @NotNull String listSubtitle, CurrentSessionDTO currentSessionDTO, String str, List<SessionDTO> list, ButtonV3Atom.LargeButton largeButton) {
        Intrinsics.checkNotNullParameter(listTitle, "listTitle");
        Intrinsics.checkNotNullParameter(listSubtitle, "listSubtitle");
        this.annotation = disclaimerAtom;
        this.listTitle = listTitle;
        this.listSubtitle = listSubtitle;
        this.currentSession = currentSessionDTO;
        this.sessionsTitle = str;
        this.sessions = list;
        this.logoutOnAll = largeButton;
    }

    public static /* synthetic */ SessionListDTO copy$default(SessionListDTO sessionListDTO, DisclaimerAtom disclaimerAtom, String str, String str2, CurrentSessionDTO currentSessionDTO, String str3, List list, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclaimerAtom = sessionListDTO.annotation;
        }
        if ((i11 & 2) != 0) {
            str = sessionListDTO.listTitle;
        }
        if ((i11 & 4) != 0) {
            str2 = sessionListDTO.listSubtitle;
        }
        if ((i11 & 8) != 0) {
            currentSessionDTO = sessionListDTO.currentSession;
        }
        if ((i11 & 16) != 0) {
            str3 = sessionListDTO.sessionsTitle;
        }
        if ((i11 & 32) != 0) {
            list = sessionListDTO.sessions;
        }
        if ((i11 & 64) != 0) {
            largeButton = sessionListDTO.logoutOnAll;
        }
        List list2 = list;
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        String str4 = str3;
        String str5 = str2;
        return sessionListDTO.copy(disclaimerAtom, str, str5, currentSessionDTO, str4, list2, largeButton2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getListTitle() {
        return this.listTitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getListSubtitle() {
        return this.listSubtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final CurrentSessionDTO getCurrentSession() {
        return this.currentSession;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSessionsTitle() {
        return this.sessionsTitle;
    }

    public final List<SessionDTO> component6() {
        return this.sessions;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.LargeButton getLogoutOnAll() {
        return this.logoutOnAll;
    }

    @NotNull
    public final SessionListDTO copy(DisclaimerAtom annotation, @NotNull String listTitle, @NotNull String listSubtitle, CurrentSessionDTO currentSession, String sessionsTitle, List<SessionDTO> sessions, ButtonV3Atom.LargeButton logoutOnAll) {
        Intrinsics.checkNotNullParameter(listTitle, "listTitle");
        Intrinsics.checkNotNullParameter(listSubtitle, "listSubtitle");
        return new SessionListDTO(annotation, listTitle, listSubtitle, currentSession, sessionsTitle, sessions, logoutOnAll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionListDTO)) {
            return false;
        }
        SessionListDTO sessionListDTO = (SessionListDTO) other;
        return Intrinsics.d(this.annotation, sessionListDTO.annotation) && Intrinsics.d(this.listTitle, sessionListDTO.listTitle) && Intrinsics.d(this.listSubtitle, sessionListDTO.listSubtitle) && Intrinsics.d(this.currentSession, sessionListDTO.currentSession) && Intrinsics.d(this.sessionsTitle, sessionListDTO.sessionsTitle) && Intrinsics.d(this.sessions, sessionListDTO.sessions) && Intrinsics.d(this.logoutOnAll, sessionListDTO.logoutOnAll);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final CurrentSessionDTO getCurrentSession() {
        return this.currentSession;
    }

    @NotNull
    public final String getListSubtitle() {
        return this.listSubtitle;
    }

    @NotNull
    public final String getListTitle() {
        return this.listTitle;
    }

    public final ButtonV3Atom.LargeButton getLogoutOnAll() {
        return this.logoutOnAll;
    }

    public final List<SessionDTO> getSessions() {
        return this.sessions;
    }

    public final String getSessionsTitle() {
        return this.sessionsTitle;
    }

    public int hashCode() {
        DisclaimerAtom disclaimerAtom = this.annotation;
        int a11 = g.a(g.a((disclaimerAtom == null ? 0 : disclaimerAtom.hashCode()) * 31, 31, this.listTitle), 31, this.listSubtitle);
        CurrentSessionDTO currentSessionDTO = this.currentSession;
        int hashCode = (a11 + (currentSessionDTO == null ? 0 : currentSessionDTO.hashCode())) * 31;
        String str = this.sessionsTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<SessionDTO> list = this.sessions;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.logoutOnAll;
        return hashCode3 + (largeButton != null ? largeButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisclaimerAtom disclaimerAtom = this.annotation;
        String str = this.listTitle;
        String str2 = this.listSubtitle;
        CurrentSessionDTO currentSessionDTO = this.currentSession;
        String str3 = this.sessionsTitle;
        List<SessionDTO> list = this.sessions;
        ButtonV3Atom.LargeButton largeButton = this.logoutOnAll;
        StringBuilder sb2 = new StringBuilder("SessionListDTO(annotation=");
        sb2.append(disclaimerAtom);
        sb2.append(", listTitle=");
        sb2.append(str);
        sb2.append(", listSubtitle=");
        sb2.append(str2);
        sb2.append(", currentSession=");
        sb2.append(currentSessionDTO);
        sb2.append(", sessionsTitle=");
        w.d(str3, ", sessions=", ", logoutOnAll=", sb2, list);
        sb2.append(largeButton);
        sb2.append(")");
        return sb2.toString();
    }
}
