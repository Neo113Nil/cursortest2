package ru.ozon.app.android.fresh.feature.b2b.widgets.bannerEdo.data;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/data/BannerEdoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "list", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/data/BannerEdoDTO$ListItemDTO;", "imageSrc", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getList", "()Ljava/util/List;", "getImageSrc", "()Ljava/lang/String;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ListItemDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BannerEdoDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.SmallButton button;

    @NotNull
    private final String imageSrc;

    @NotNull
    private final List<ListItemDTO> list;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/data/BannerEdoDTO$ListItemDTO;", "", "icon", "", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getIcon", "()Ljava/lang/String;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ListItemDTO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom description;

        @NotNull
        private final String icon;

        public ListItemDTO(@NotNull String icon, @NotNull TextAtom description) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(description, "description");
            this.icon = icon;
            this.description = description;
        }

        public static /* synthetic */ ListItemDTO copy$default(ListItemDTO listItemDTO, String str, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = listItemDTO.icon;
            }
            if ((i11 & 2) != 0) {
                textAtom = listItemDTO.description;
            }
            return listItemDTO.copy(str, textAtom);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final ListItemDTO copy(@NotNull String icon, @NotNull TextAtom description) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(description, "description");
            return new ListItemDTO(icon, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListItemDTO)) {
                return false;
            }
            ListItemDTO listItemDTO = (ListItemDTO) other;
            return Intrinsics.d(this.icon, listItemDTO.icon) && Intrinsics.d(this.description, listItemDTO.description);
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.description.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ListItemDTO(icon=" + this.icon + ", description=" + this.description + ")";
        }
    }

    public BannerEdoDTO(@NotNull TextAtom title, @NotNull List<ListItemDTO> list, @NotNull String imageSrc, @NotNull ButtonV3Atom.SmallButton button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(imageSrc, "imageSrc");
        Intrinsics.checkNotNullParameter(button, "button");
        this.title = title;
        this.list = list;
        this.imageSrc = imageSrc;
        this.button = button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerEdoDTO copy$default(BannerEdoDTO bannerEdoDTO, TextAtom textAtom, List list, String str, ButtonV3Atom.SmallButton smallButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = bannerEdoDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = bannerEdoDTO.list;
        }
        if ((i11 & 4) != 0) {
            str = bannerEdoDTO.imageSrc;
        }
        if ((i11 & 8) != 0) {
            smallButton = bannerEdoDTO.button;
        }
        return bannerEdoDTO.copy(textAtom, list, str, smallButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<ListItemDTO> component2() {
        return this.list;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageSrc() {
        return this.imageSrc;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    @NotNull
    public final BannerEdoDTO copy(@NotNull TextAtom title, @NotNull List<ListItemDTO> list, @NotNull String imageSrc, @NotNull ButtonV3Atom.SmallButton button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(imageSrc, "imageSrc");
        Intrinsics.checkNotNullParameter(button, "button");
        return new BannerEdoDTO(title, list, imageSrc, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerEdoDTO)) {
            return false;
        }
        BannerEdoDTO bannerEdoDTO = (BannerEdoDTO) other;
        return Intrinsics.d(this.title, bannerEdoDTO.title) && Intrinsics.d(this.list, bannerEdoDTO.list) && Intrinsics.d(this.imageSrc, bannerEdoDTO.imageSrc) && Intrinsics.d(this.button, bannerEdoDTO.button);
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    @NotNull
    public final String getImageSrc() {
        return this.imageSrc;
    }

    @NotNull
    public final List<ListItemDTO> getList() {
        return this.list;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.button.hashCode() + g.a(g.b(this.title.hashCode() * 31, 31, this.list), 31, this.imageSrc);
    }

    @NotNull
    public String toString() {
        return "BannerEdoDTO(title=" + this.title + ", list=" + this.list + ", imageSrc=" + this.imageSrc + ", button=" + this.button + ")";
    }
}
