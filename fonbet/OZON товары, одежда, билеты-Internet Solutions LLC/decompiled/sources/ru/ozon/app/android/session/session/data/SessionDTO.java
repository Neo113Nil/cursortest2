package ru.ozon.app.android.session.session.data;

import G.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/session/session/data/SessionDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/session/session/data/SessionDTO$Header;", "sessionData", "", "Lru/ozon/app/android/session/session/data/SessionDTO$Data;", "logout", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/app/android/session/session/data/SessionDTO$Header;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getHeader", "()Lru/ozon/app/android/session/session/data/SessionDTO$Header;", "getSessionData", "()Ljava/util/List;", "getLogout", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Header", "Data", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SessionDTO {
    public static final int $stable = 8;

    @NotNull
    private final Header header;
    private final ButtonV3Atom.LargeButton logout;

    @NotNull
    private final List<Data> sessionData;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/session/data/SessionDTO$Data;", "", "description", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getDescription", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {
        public static final int $stable = OzonSpannableString.$stable;

        @NotNull
        private final OzonSpannableString description;

        @NotNull
        private final OzonSpannableString value;

        public Data(@NotNull OzonSpannableString description, @NotNull OzonSpannableString value) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(value, "value");
            this.description = description;
            this.value = value;
        }

        public static /* synthetic */ Data copy$default(Data data, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = data.description;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString2 = data.value;
            }
            return data.copy(ozonSpannableString, ozonSpannableString2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getDescription() {
            return this.description;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getValue() {
            return this.value;
        }

        @NotNull
        public final Data copy(@NotNull OzonSpannableString description, @NotNull OzonSpannableString value) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Data(description, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.d(this.description, data.description) && Intrinsics.d(this.value, data.value);
        }

        @NotNull
        public final OzonSpannableString getDescription() {
            return this.description;
        }

        @NotNull
        public final OzonSpannableString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.description.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Data(description=" + ((Object) this.description) + ", value=" + ((Object) this.value) + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/session/session/data/SessionDTO$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = OzonSpannableString.$stable;

        @NotNull
        private final OzonSpannableString title;

        public Header(@NotNull OzonSpannableString title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public static /* synthetic */ Header copy$default(Header header, OzonSpannableString ozonSpannableString, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = header.title;
            }
            return header.copy(ozonSpannableString);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        public final Header copy(@NotNull OzonSpannableString title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Header(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Header) && Intrinsics.d(this.title, ((Header) other).title);
        }

        @NotNull
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        @NotNull
        public String toString() {
            return "Header(title=" + ((Object) this.title) + ")";
        }
    }

    public SessionDTO(@NotNull Header header, @NotNull List<Data> sessionData, ButtonV3Atom.LargeButton largeButton) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        this.header = header;
        this.sessionData = sessionData;
        this.logout = largeButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionDTO copy$default(SessionDTO sessionDTO, Header header, List list, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = sessionDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = sessionDTO.sessionData;
        }
        if ((i11 & 4) != 0) {
            largeButton = sessionDTO.logout;
        }
        return sessionDTO.copy(header, list, largeButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final List<Data> component2() {
        return this.sessionData;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getLogout() {
        return this.logout;
    }

    @NotNull
    public final SessionDTO copy(@NotNull Header header, @NotNull List<Data> sessionData, ButtonV3Atom.LargeButton logout) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        return new SessionDTO(header, sessionData, logout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDTO)) {
            return false;
        }
        SessionDTO sessionDTO = (SessionDTO) other;
        return Intrinsics.d(this.header, sessionDTO.header) && Intrinsics.d(this.sessionData, sessionDTO.sessionData) && Intrinsics.d(this.logout, sessionDTO.logout);
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    public final ButtonV3Atom.LargeButton getLogout() {
        return this.logout;
    }

    @NotNull
    public final List<Data> getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        int b11 = g.b(this.header.hashCode() * 31, 31, this.sessionData);
        ButtonV3Atom.LargeButton largeButton = this.logout;
        return b11 + (largeButton == null ? 0 : largeButton.hashCode());
    }

    @NotNull
    public String toString() {
        return "SessionDTO(header=" + this.header + ", sessionData=" + this.sessionData + ", logout=" + this.logout + ")";
    }
}
