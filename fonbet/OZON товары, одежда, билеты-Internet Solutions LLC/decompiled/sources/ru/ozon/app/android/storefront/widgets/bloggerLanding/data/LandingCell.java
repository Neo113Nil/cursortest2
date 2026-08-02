package ru.ozon.app.android.storefront.widgets.bloggerLanding.data;

import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/bloggerLanding/data/LandingCell;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "socialIcons", "", "", "iconsColor", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSocialIcons", "()Ljava/util/List;", "getIconsColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LandingCell {
    public static final int $stable = 8;

    @NotNull
    private final IconDTO icon;
    private final String iconsColor;
    private final List<String> socialIcons;

    @NotNull
    private final TextDTO title;

    public LandingCell(@NotNull IconDTO icon, @NotNull TextDTO title, List<String> list, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = icon;
        this.title = title;
        this.socialIcons = list;
        this.iconsColor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LandingCell copy$default(LandingCell landingCell, IconDTO iconDTO, TextDTO textDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = landingCell.icon;
        }
        if ((i11 & 2) != 0) {
            textDTO = landingCell.title;
        }
        if ((i11 & 4) != 0) {
            list = landingCell.socialIcons;
        }
        if ((i11 & 8) != 0) {
            str = landingCell.iconsColor;
        }
        return landingCell.copy(iconDTO, textDTO, list, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final List<String> component3() {
        return this.socialIcons;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconsColor() {
        return this.iconsColor;
    }

    @NotNull
    public final LandingCell copy(@NotNull IconDTO icon, @NotNull TextDTO title, List<String> socialIcons, String iconsColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        return new LandingCell(icon, title, socialIcons, iconsColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingCell)) {
            return false;
        }
        LandingCell landingCell = (LandingCell) other;
        return Intrinsics.d(this.icon, landingCell.icon) && Intrinsics.d(this.title, landingCell.title) && Intrinsics.d(this.socialIcons, landingCell.socialIcons) && Intrinsics.d(this.iconsColor, landingCell.iconsColor);
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final String getIconsColor() {
        return this.iconsColor;
    }

    public final List<String> getSocialIcons() {
        return this.socialIcons;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
        List<String> list = this.socialIcons;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.iconsColor;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.title;
        List<String> list = this.socialIcons;
        String str = this.iconsColor;
        StringBuilder i11 = Bi.b.i("LandingCell(icon=", ", title=", ", socialIcons=", iconDTO, textDTO);
        i11.append(list);
        i11.append(", iconsColor=");
        i11.append(str);
        i11.append(")");
        return i11.toString();
    }
}
