package ru.ozon.id.switchUser.data;

import C.o0;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/id/switchUser/data/SwitchUserResultDTO;", "", "authToken", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/id/switchUser/data/SwitchUserResultDTO$Restriction;", "<init>", "(Ljava/lang/Object;Lru/ozon/id/switchUser/data/SwitchUserResultDTO$Restriction;)V", "getAuthToken", "()Ljava/lang/Object;", "getRestriction", "()Lru/ozon/id/switchUser/data/SwitchUserResultDTO$Restriction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Restriction", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SwitchUserResultDTO {
    private final Object authToken;
    private final Restriction restriction;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/id/switchUser/data/SwitchUserResultDTO$Restriction;", "", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Restriction {
        private final String icon;

        @NotNull
        private final String message;
        private final String title;

        public Restriction(String str, String str2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.icon = str;
            this.title = str2;
            this.message = message;
        }

        public static /* synthetic */ Restriction copy$default(Restriction restriction, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = restriction.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = restriction.title;
            }
            if ((i11 & 4) != 0) {
                str3 = restriction.message;
            }
            return restriction.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Restriction copy(String icon, String title, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Restriction(icon, title, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Restriction)) {
                return false;
            }
            Restriction restriction = (Restriction) other;
            return Intrinsics.d(this.icon, restriction.icon) && Intrinsics.d(this.title, restriction.title) && Intrinsics.d(this.message, restriction.message);
        }

        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.icon;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            return this.message.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.title;
            return o0.c(C3660k.d("Restriction(icon=", str, ", title=", str2, ", message="), this.message, ")");
        }
    }

    public SwitchUserResultDTO(Object obj, Restriction restriction) {
        this.authToken = obj;
        this.restriction = restriction;
    }

    public static /* synthetic */ SwitchUserResultDTO copy$default(SwitchUserResultDTO switchUserResultDTO, Object obj, Restriction restriction, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = switchUserResultDTO.authToken;
        }
        if ((i11 & 2) != 0) {
            restriction = switchUserResultDTO.restriction;
        }
        return switchUserResultDTO.copy(obj, restriction);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getAuthToken() {
        return this.authToken;
    }

    /* renamed from: component2, reason: from getter */
    public final Restriction getRestriction() {
        return this.restriction;
    }

    @NotNull
    public final SwitchUserResultDTO copy(Object authToken, Restriction restriction) {
        return new SwitchUserResultDTO(authToken, restriction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchUserResultDTO)) {
            return false;
        }
        SwitchUserResultDTO switchUserResultDTO = (SwitchUserResultDTO) other;
        return Intrinsics.d(this.authToken, switchUserResultDTO.authToken) && Intrinsics.d(this.restriction, switchUserResultDTO.restriction);
    }

    public final Object getAuthToken() {
        return this.authToken;
    }

    public final Restriction getRestriction() {
        return this.restriction;
    }

    public int hashCode() {
        Object obj = this.authToken;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Restriction restriction = this.restriction;
        return hashCode + (restriction != null ? restriction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SwitchUserResultDTO(authToken=" + this.authToken + ", restriction=" + this.restriction + ")";
    }
}
