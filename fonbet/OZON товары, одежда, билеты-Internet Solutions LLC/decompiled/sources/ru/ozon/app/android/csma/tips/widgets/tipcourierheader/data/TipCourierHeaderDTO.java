package ru.ozon.app.android.csma.tips.widgets.tipcourierheader.data;

import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/data/TipCourierHeaderDTO;", "", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "text", "showInFullScreen", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "getText", "getShowInFullScreen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/data/TipCourierHeaderDTO;", "equals", "other", "hashCode", "", "toString", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TipCourierHeaderDTO {
    private final String icon;
    private final Boolean showInFullScreen;
    private final String text;

    @NotNull
    private final String title;

    public TipCourierHeaderDTO(String str, @NotNull String title, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = str;
        this.title = title;
        this.text = str2;
        this.showInFullScreen = bool;
    }

    public static /* synthetic */ TipCourierHeaderDTO copy$default(TipCourierHeaderDTO tipCourierHeaderDTO, String str, String str2, String str3, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tipCourierHeaderDTO.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = tipCourierHeaderDTO.title;
        }
        if ((i11 & 4) != 0) {
            str3 = tipCourierHeaderDTO.text;
        }
        if ((i11 & 8) != 0) {
            bool = tipCourierHeaderDTO.showInFullScreen;
        }
        return tipCourierHeaderDTO.copy(str, str2, str3, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getShowInFullScreen() {
        return this.showInFullScreen;
    }

    @NotNull
    public final TipCourierHeaderDTO copy(String icon, @NotNull String title, String text, Boolean showInFullScreen) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TipCourierHeaderDTO(icon, title, text, showInFullScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipCourierHeaderDTO)) {
            return false;
        }
        TipCourierHeaderDTO tipCourierHeaderDTO = (TipCourierHeaderDTO) other;
        return Intrinsics.d(this.icon, tipCourierHeaderDTO.icon) && Intrinsics.d(this.title, tipCourierHeaderDTO.title) && Intrinsics.d(this.text, tipCourierHeaderDTO.text) && Intrinsics.d(this.showInFullScreen, tipCourierHeaderDTO.showInFullScreen);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final Boolean getShowInFullScreen() {
        return this.showInFullScreen;
    }

    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.icon;
        int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        String str2 = this.text;
        int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.showInFullScreen;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.text;
        Boolean bool = this.showInFullScreen;
        StringBuilder d11 = C3660k.d("TipCourierHeaderDTO(icon=", str, ", title=", str2, ", text=");
        d11.append(str3);
        d11.append(", showInFullScreen=");
        d11.append(bool);
        d11.append(")");
        return d11.toString();
    }
}
