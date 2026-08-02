package ru.ozon.app.android.domain.session.api.auth.models;

import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/BiometryPermission;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "subtitleSystem", "titleOnForbid", "subtitleOnForbid", "successMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSubtitleSystem", "getTitleOnForbid", "getSubtitleOnForbid", "getSuccessMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BiometryPermission {

    @NotNull
    private final String subtitle;

    @NotNull
    private final String subtitleOnForbid;

    @NotNull
    private final String subtitleSystem;

    @NotNull
    private final String successMessage;

    @NotNull
    private final String title;

    @NotNull
    private final String titleOnForbid;

    public BiometryPermission(@NotNull String title, @NotNull String subtitle, @NotNull String subtitleSystem, @NotNull String titleOnForbid, @NotNull String subtitleOnForbid, @NotNull String successMessage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(subtitleSystem, "subtitleSystem");
        Intrinsics.checkNotNullParameter(titleOnForbid, "titleOnForbid");
        Intrinsics.checkNotNullParameter(subtitleOnForbid, "subtitleOnForbid");
        Intrinsics.checkNotNullParameter(successMessage, "successMessage");
        this.title = title;
        this.subtitle = subtitle;
        this.subtitleSystem = subtitleSystem;
        this.titleOnForbid = titleOnForbid;
        this.subtitleOnForbid = subtitleOnForbid;
        this.successMessage = successMessage;
    }

    public static /* synthetic */ BiometryPermission copy$default(BiometryPermission biometryPermission, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = biometryPermission.title;
        }
        if ((i11 & 2) != 0) {
            str2 = biometryPermission.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = biometryPermission.subtitleSystem;
        }
        if ((i11 & 8) != 0) {
            str4 = biometryPermission.titleOnForbid;
        }
        if ((i11 & 16) != 0) {
            str5 = biometryPermission.subtitleOnForbid;
        }
        if ((i11 & 32) != 0) {
            str6 = biometryPermission.successMessage;
        }
        String str7 = str5;
        String str8 = str6;
        return biometryPermission.copy(str, str2, str3, str4, str7, str8);
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
    public final String getSubtitleSystem() {
        return this.subtitleSystem;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTitleOnForbid() {
        return this.titleOnForbid;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSubtitleOnForbid() {
        return this.subtitleOnForbid;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    @NotNull
    public final BiometryPermission copy(@NotNull String title, @NotNull String subtitle, @NotNull String subtitleSystem, @NotNull String titleOnForbid, @NotNull String subtitleOnForbid, @NotNull String successMessage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(subtitleSystem, "subtitleSystem");
        Intrinsics.checkNotNullParameter(titleOnForbid, "titleOnForbid");
        Intrinsics.checkNotNullParameter(subtitleOnForbid, "subtitleOnForbid");
        Intrinsics.checkNotNullParameter(successMessage, "successMessage");
        return new BiometryPermission(title, subtitle, subtitleSystem, titleOnForbid, subtitleOnForbid, successMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometryPermission)) {
            return false;
        }
        BiometryPermission biometryPermission = (BiometryPermission) other;
        return Intrinsics.d(this.title, biometryPermission.title) && Intrinsics.d(this.subtitle, biometryPermission.subtitle) && Intrinsics.d(this.subtitleSystem, biometryPermission.subtitleSystem) && Intrinsics.d(this.titleOnForbid, biometryPermission.titleOnForbid) && Intrinsics.d(this.subtitleOnForbid, biometryPermission.subtitleOnForbid) && Intrinsics.d(this.successMessage, biometryPermission.successMessage);
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getSubtitleOnForbid() {
        return this.subtitleOnForbid;
    }

    @NotNull
    public final String getSubtitleSystem() {
        return this.subtitleSystem;
    }

    @NotNull
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTitleOnForbid() {
        return this.titleOnForbid;
    }

    public int hashCode() {
        return this.successMessage.hashCode() + g.a(g.a(g.a(g.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.subtitleSystem), 31, this.titleOnForbid), 31, this.subtitleOnForbid);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.subtitleSystem;
        String str4 = this.titleOnForbid;
        String str5 = this.subtitleOnForbid;
        String str6 = this.successMessage;
        StringBuilder d11 = C3660k.d("BiometryPermission(title=", str, ", subtitle=", str2, ", subtitleSystem=");
        a.h(d11, str3, ", titleOnForbid=", str4, ", subtitleOnForbid=");
        return C3173b.c(d11, str5, ", successMessage=", str6, ")");
    }
}
