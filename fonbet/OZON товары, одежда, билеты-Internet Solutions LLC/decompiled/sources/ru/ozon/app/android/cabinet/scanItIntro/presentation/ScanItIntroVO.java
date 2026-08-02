package ru.ozon.app.android.cabinet.scanItIntro.presentation;

import Lh.b;
import N3.C3660k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO$Page;", "pages", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "Page", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ScanItIntroVO implements c {
    private final long id;

    @NotNull
    private final List<Page> pages;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO$Page;", "", "", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "Lru/ozon/uni/atoms/data/deprecated/Button;", "firstButton", "secondButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/deprecated/Button;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getTitle", "getDescription", "Lru/ozon/uni/atoms/data/deprecated/Button;", "getFirstButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "getSecondButton", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Page {
        private final String description;
        private final Button firstButton;

        @NotNull
        private final String image;
        private final Button secondButton;
        private final String title;

        public Page(@NotNull String image, String str, String str2, Button button, Button button2) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.title = str;
            this.description = str2;
            this.firstButton = button;
            this.secondButton = button2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Page)) {
                return false;
            }
            Page page = (Page) other;
            return Intrinsics.d(this.image, page.image) && Intrinsics.d(this.title, page.title) && Intrinsics.d(this.description, page.description) && Intrinsics.d(this.firstButton, page.firstButton) && Intrinsics.d(this.secondButton, page.secondButton);
        }

        public final String getDescription() {
            return this.description;
        }

        public final Button getFirstButton() {
            return this.firstButton;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final Button getSecondButton() {
            return this.secondButton;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Button button = this.firstButton;
            int hashCode4 = (hashCode3 + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondButton;
            return hashCode4 + (button2 != null ? button2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.title;
            String str3 = this.description;
            Button button = this.firstButton;
            Button button2 = this.secondButton;
            StringBuilder d11 = C3660k.d("Page(image=", str, ", title=", str2, ", description=");
            d11.append(str3);
            d11.append(", firstButton=");
            d11.append(button);
            d11.append(", secondButton=");
            d11.append(button2);
            d11.append(")");
            return d11.toString();
        }
    }

    public ScanItIntroVO(long j11, @NotNull List<Page> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.id = j11;
        this.pages = pages;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanItIntroVO)) {
            return false;
        }
        ScanItIntroVO scanItIntroVO = (ScanItIntroVO) other;
        return this.id == scanItIntroVO.id && Intrinsics.d(this.pages, scanItIntroVO.pages);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Page> getPages() {
        return this.pages;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.pages.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.id, "ScanItIntroVO(id=", ", pages=", this.pages);
        b11.append(")");
        return b11.toString();
    }
}
