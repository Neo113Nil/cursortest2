package ru.ozon.app.android.storefront.widgets.bloggerLanding.data;

import De.C2859b;
import G.g;
import N3.C3660k;
import Ns.b;
import Tl.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003JW\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/widgets/bloggerLanding/data/BloggerLandingDTO;", "", "backgroundImage", "", "accentImage", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "cells", "", "Lru/ozon/app/android/storefront/widgets/bloggerLanding/data/LandingCell;", "actionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getBackgroundImage", "()Ljava/lang/String;", "getAccentImage", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCells", "()Ljava/util/List;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BloggerLandingDTO {
    public static final int $stable = 8;

    @NotNull
    private final String accentImage;

    @NotNull
    private final ButtonV3DTO actionButton;

    @NotNull
    private final String backgroundImage;

    @NotNull
    private final List<LandingCell> cells;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BloggerLandingDTO(@NotNull String backgroundImage, @NotNull String accentImage, @NotNull TextDTO title, @NotNull List<LandingCell> cells, @NotNull ButtonV3DTO actionButton, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(accentImage, "accentImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        this.backgroundImage = backgroundImage;
        this.accentImage = accentImage;
        this.title = title;
        this.cells = cells;
        this.actionButton = actionButton;
        this.trackingInfo = trackingInfo;
    }

    public static /* synthetic */ BloggerLandingDTO copy$default(BloggerLandingDTO bloggerLandingDTO, String str, String str2, TextDTO textDTO, List list, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bloggerLandingDTO.backgroundImage;
        }
        if ((i11 & 2) != 0) {
            str2 = bloggerLandingDTO.accentImage;
        }
        if ((i11 & 4) != 0) {
            textDTO = bloggerLandingDTO.title;
        }
        if ((i11 & 8) != 0) {
            list = bloggerLandingDTO.cells;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = bloggerLandingDTO.actionButton;
        }
        if ((i11 & 32) != 0) {
            map = bloggerLandingDTO.trackingInfo;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        Map map2 = map;
        return bloggerLandingDTO.copy(str, str2, textDTO, list, buttonV3DTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAccentImage() {
        return this.accentImage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<LandingCell> component4() {
        return this.cells;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final BloggerLandingDTO copy(@NotNull String backgroundImage, @NotNull String accentImage, @NotNull TextDTO title, @NotNull List<LandingCell> cells, @NotNull ButtonV3DTO actionButton, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(accentImage, "accentImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        return new BloggerLandingDTO(backgroundImage, accentImage, title, cells, actionButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloggerLandingDTO)) {
            return false;
        }
        BloggerLandingDTO bloggerLandingDTO = (BloggerLandingDTO) other;
        return Intrinsics.d(this.backgroundImage, bloggerLandingDTO.backgroundImage) && Intrinsics.d(this.accentImage, bloggerLandingDTO.accentImage) && Intrinsics.d(this.title, bloggerLandingDTO.title) && Intrinsics.d(this.cells, bloggerLandingDTO.cells) && Intrinsics.d(this.actionButton, bloggerLandingDTO.actionButton) && Intrinsics.d(this.trackingInfo, bloggerLandingDTO.trackingInfo);
    }

    @NotNull
    public final String getAccentImage() {
        return this.accentImage;
    }

    @NotNull
    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final List<LandingCell> getCells() {
        return this.cells;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        return this.trackingInfo.hashCode() + C2859b.c(this.actionButton, g.b(b.a(this.title, g.a(this.backgroundImage.hashCode() * 31, 31, this.accentImage), 31), 31, this.cells), 31);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundImage;
        String str2 = this.accentImage;
        TextDTO textDTO = this.title;
        List<LandingCell> list = this.cells;
        ButtonV3DTO buttonV3DTO = this.actionButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("BloggerLandingDTO(backgroundImage=", str, ", accentImage=", str2, ", title=");
        a.e(d11, textDTO, ", cells=", list, ", actionButton=");
        d11.append(buttonV3DTO);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
