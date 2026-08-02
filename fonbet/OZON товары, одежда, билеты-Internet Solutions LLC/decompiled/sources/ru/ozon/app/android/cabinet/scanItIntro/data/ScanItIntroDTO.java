package ru.ozon.app.android.cabinet.scanItIntro.data;

import C.o0;
import H3.c;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO;", "", "pages", "", "Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Page;", "<init>", "(Ljava/util/List;)V", "getPages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Page", "Button", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ScanItIntroDTO {

    @NotNull
    private final List<Page> pages;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Button;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "style", "Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "action", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/deprecated/Button$Style;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getStyle", "()Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "getAction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {

        @NotNull
        private final String action;

        @NotNull
        private final Button.Style style;

        @NotNull
        private final String title;

        public Button(@NotNull String title, @NotNull Button.Style style, @NotNull String action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.style = style;
            this.action = action;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, Button.Style style, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = button.title;
            }
            if ((i11 & 2) != 0) {
                style = button.style;
            }
            if ((i11 & 4) != 0) {
                str2 = button.action;
            }
            return button.copy(str, style, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Button.Style getStyle() {
            return this.style;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final Button copy(@NotNull String title, @NotNull Button.Style style, @NotNull String action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Button(title, style, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.title, button.title) && this.style == button.style && Intrinsics.d(this.action, button.action);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final Button.Style getStyle() {
            return this.style;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.action.hashCode() + ((this.style.hashCode() + (this.title.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            Button.Style style = this.style;
            String str2 = this.action;
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(str);
            sb2.append(", style=");
            sb2.append(style);
            sb2.append(", action=");
            return o0.c(sb2, str2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Page;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "firstButton", "Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Button;", "secondButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Button;Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Button;)V", "getImage", "()Ljava/lang/String;", "getTitle", "getDescription", "getFirstButton", "()Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Button;", "getSecondButton", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public static /* synthetic */ Page copy$default(Page page, String str, String str2, String str3, Button button, Button button2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = page.image;
            }
            if ((i11 & 2) != 0) {
                str2 = page.title;
            }
            if ((i11 & 4) != 0) {
                str3 = page.description;
            }
            if ((i11 & 8) != 0) {
                button = page.firstButton;
            }
            if ((i11 & 16) != 0) {
                button2 = page.secondButton;
            }
            Button button3 = button2;
            String str4 = str3;
            return page.copy(str, str2, str4, button, button3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final Button getFirstButton() {
            return this.firstButton;
        }

        /* renamed from: component5, reason: from getter */
        public final Button getSecondButton() {
            return this.secondButton;
        }

        @NotNull
        public final Page copy(@NotNull String image, String title, String description, Button firstButton, Button secondButton) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new Page(image, title, description, firstButton, secondButton);
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

    public ScanItIntroDTO(@NotNull List<Page> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.pages = pages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScanItIntroDTO copy$default(ScanItIntroDTO scanItIntroDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = scanItIntroDTO.pages;
        }
        return scanItIntroDTO.copy(list);
    }

    @NotNull
    public final List<Page> component1() {
        return this.pages;
    }

    @NotNull
    public final ScanItIntroDTO copy(@NotNull List<Page> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new ScanItIntroDTO(pages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ScanItIntroDTO) && Intrinsics.d(this.pages, ((ScanItIntroDTO) other).pages);
    }

    @NotNull
    public final List<Page> getPages() {
        return this.pages;
    }

    public int hashCode() {
        return this.pages.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("ScanItIntroDTO(pages=", ")", this.pages);
    }
}
