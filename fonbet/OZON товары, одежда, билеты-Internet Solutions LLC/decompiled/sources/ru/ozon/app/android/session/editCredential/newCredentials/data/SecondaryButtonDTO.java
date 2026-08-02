package ru.ozon.app.android.session.editCredential.newCredentials.data;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/data/SecondaryButtonDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SecondaryButtonDTO {
    public static final int $stable = 0;

    @NotNull
    private final String deeplink;

    @NotNull
    private final String title;

    public SecondaryButtonDTO(@NotNull String title, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.title = title;
        this.deeplink = deeplink;
    }

    public static /* synthetic */ SecondaryButtonDTO copy$default(SecondaryButtonDTO secondaryButtonDTO, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = secondaryButtonDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = secondaryButtonDTO.deeplink;
        }
        return secondaryButtonDTO.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final SecondaryButtonDTO copy(@NotNull String title, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new SecondaryButtonDTO(title, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondaryButtonDTO)) {
            return false;
        }
        SecondaryButtonDTO secondaryButtonDTO = (SecondaryButtonDTO) other;
        return Intrinsics.d(this.title, secondaryButtonDTO.title) && Intrinsics.d(this.deeplink, secondaryButtonDTO.deeplink);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.deeplink.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("SecondaryButtonDTO(title=", this.title, ", deeplink=", this.deeplink, ")");
    }
}
