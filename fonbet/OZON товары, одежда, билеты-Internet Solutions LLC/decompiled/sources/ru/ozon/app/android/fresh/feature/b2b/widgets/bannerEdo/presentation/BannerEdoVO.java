package ru.ozon.app.android.fresh.feature.b2b.widgets.bannerEdo.presentation;

import G.g;
import Ns.b;
import TY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001(B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/presentation/BannerEdoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/presentation/BannerEdoVO$ListItemVo;", "list", "", "imageSrc", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getList", "()Ljava/util/List;", "Ljava/lang/String;", "getImageSrc", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "ListItemVo", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BannerEdoVO implements c {

    @NotNull
    private final ButtonV3Atom.SmallButton button;
    private final long id;

    @NotNull
    private final String imageSrc;

    @NotNull
    private final List<ListItemVo> list;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/presentation/BannerEdoVO$ListItemVo;", "", "", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ListItemVo {

        @NotNull
        private final TextDTO description;

        @NotNull
        private final String icon;

        public ListItemVo(@NotNull String icon, @NotNull TextDTO description) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(description, "description");
            this.icon = icon;
            this.description = description;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListItemVo)) {
                return false;
            }
            ListItemVo listItemVo = (ListItemVo) other;
            return Intrinsics.d(this.icon, listItemVo.icon) && Intrinsics.d(this.description, listItemVo.description);
        }

        @NotNull
        public final TextDTO getDescription() {
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
            return "ListItemVo(icon=" + this.icon + ", description=" + this.description + ")";
        }
    }

    public BannerEdoVO(long j11, @NotNull TextDTO title, @NotNull List<ListItemVo> list, @NotNull String imageSrc, @NotNull ButtonV3Atom.SmallButton button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(imageSrc, "imageSrc");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.title = title;
        this.list = list;
        this.imageSrc = imageSrc;
        this.button = button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerEdoVO)) {
            return false;
        }
        BannerEdoVO bannerEdoVO = (BannerEdoVO) other;
        return this.id == bannerEdoVO.id && Intrinsics.d(this.title, bannerEdoVO.title) && Intrinsics.d(this.list, bannerEdoVO.list) && Intrinsics.d(this.imageSrc, bannerEdoVO.imageSrc) && Intrinsics.d(this.button, bannerEdoVO.button);
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImageSrc() {
        return this.imageSrc;
    }

    @NotNull
    public final List<ListItemVo> getList() {
        return this.list;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.button.hashCode() + g.a(g.b(b.a(this.title, Long.hashCode(this.id) * 31, 31), 31, this.list), 31, this.imageSrc);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<ListItemVo> list = this.list;
        String str = this.imageSrc;
        ButtonV3Atom.SmallButton smallButton = this.button;
        StringBuilder b11 = a.b("BannerEdoVO(id=", j11, ", title=", textDTO);
        b11.append(", list=");
        b11.append(list);
        b11.append(", imageSrc=");
        b11.append(str);
        b11.append(", button=");
        b11.append(smallButton);
        b11.append(")");
        return b11.toString();
    }
}
