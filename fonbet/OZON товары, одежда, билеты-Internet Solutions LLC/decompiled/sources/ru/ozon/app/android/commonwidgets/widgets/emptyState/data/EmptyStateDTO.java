package ru.ozon.app.android.commonwidgets.widgets.emptyState.data;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/emptyState/data/EmptyStateDTO;", "", "action", "", "deeplink", "message", SelectionItemFormDTO.TITLE_FIELD_NAME, "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getDeeplink", "getMessage", "getTitle", "getImage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EmptyStateDTO {
    private final String action;
    private final String deeplink;
    private final String image;
    private final String message;

    @NotNull
    private final String title;

    public EmptyStateDTO(String str, String str2, String str3, @NotNull String title, String str4) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.action = str;
        this.deeplink = str2;
        this.message = str3;
        this.title = title;
        this.image = str4;
    }

    public static /* synthetic */ EmptyStateDTO copy$default(EmptyStateDTO emptyStateDTO, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = emptyStateDTO.action;
        }
        if ((i11 & 2) != 0) {
            str2 = emptyStateDTO.deeplink;
        }
        if ((i11 & 4) != 0) {
            str3 = emptyStateDTO.message;
        }
        if ((i11 & 8) != 0) {
            str4 = emptyStateDTO.title;
        }
        if ((i11 & 16) != 0) {
            str5 = emptyStateDTO.image;
        }
        String str6 = str5;
        String str7 = str3;
        return emptyStateDTO.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final EmptyStateDTO copy(String action, String deeplink, String message, @NotNull String title, String image) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new EmptyStateDTO(action, deeplink, message, title, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateDTO)) {
            return false;
        }
        EmptyStateDTO emptyStateDTO = (EmptyStateDTO) other;
        return Intrinsics.d(this.action, emptyStateDTO.action) && Intrinsics.d(this.deeplink, emptyStateDTO.deeplink) && Intrinsics.d(this.message, emptyStateDTO.message) && Intrinsics.d(this.title, emptyStateDTO.title) && Intrinsics.d(this.image, emptyStateDTO.image);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deeplink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int a11 = g.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.title);
        String str4 = this.image;
        return a11 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.deeplink;
        String str3 = this.message;
        String str4 = this.title;
        String str5 = this.image;
        StringBuilder d11 = C3660k.d("EmptyStateDTO(action=", str, ", deeplink=", str2, ", message=");
        a.h(d11, str3, ", title=", str4, ", image=");
        return o0.c(d11, str5, ")");
    }
}
