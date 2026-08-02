package ru.ozon.app.android.fresh.unsorted.liveActivity.click;

import G.g;
import N3.C3660k;
import Nh.a;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO;", "", "logo", "", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "widgetLink", "callButton", "Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO$Button;", "addButton", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO$Button;Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO$Button;Ljava/lang/String;)V", "getLogo", "()Ljava/lang/String;", "getImage", "getTitle", "getSubtitle", "getWidgetLink", "getCallButton", "()Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO$Button;", "getAddButton", "getKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Button", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ClickLiveActivityStateDTO {
    public static final int $stable = 0;

    @NotNull
    private final Button addButton;

    @NotNull
    private final Button callButton;

    @NotNull
    private final String image;

    @NotNull
    private final String key;

    @NotNull
    private final String logo;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    @NotNull
    private final String widgetLink;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO$Button;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getLink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 0;

        @NotNull
        private final String link;

        @NotNull
        private final String title;

        public Button(@NotNull String title, @NotNull String link) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(link, "link");
            this.title = title;
            this.link = link;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = button.title;
            }
            if ((i11 & 2) != 0) {
                str2 = button.link;
            }
            return button.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final Button copy(@NotNull String title, @NotNull String link) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(link, "link");
            return new Button(title, link);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.title, button.title) && Intrinsics.d(this.link, button.link);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.link.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Button(title=", this.title, ", link=", this.link, ")");
        }
    }

    public ClickLiveActivityStateDTO(@NotNull String logo, @NotNull String image, @NotNull String title, @NotNull String subtitle, @NotNull String widgetLink, @NotNull Button callButton, @NotNull Button addButton, @NotNull String key) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(widgetLink, "widgetLink");
        Intrinsics.checkNotNullParameter(callButton, "callButton");
        Intrinsics.checkNotNullParameter(addButton, "addButton");
        Intrinsics.checkNotNullParameter(key, "key");
        this.logo = logo;
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.widgetLink = widgetLink;
        this.callButton = callButton;
        this.addButton = addButton;
        this.key = key;
    }

    public static /* synthetic */ ClickLiveActivityStateDTO copy$default(ClickLiveActivityStateDTO clickLiveActivityStateDTO, String str, String str2, String str3, String str4, String str5, Button button, Button button2, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = clickLiveActivityStateDTO.logo;
        }
        if ((i11 & 2) != 0) {
            str2 = clickLiveActivityStateDTO.image;
        }
        if ((i11 & 4) != 0) {
            str3 = clickLiveActivityStateDTO.title;
        }
        if ((i11 & 8) != 0) {
            str4 = clickLiveActivityStateDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            str5 = clickLiveActivityStateDTO.widgetLink;
        }
        if ((i11 & 32) != 0) {
            button = clickLiveActivityStateDTO.callButton;
        }
        if ((i11 & 64) != 0) {
            button2 = clickLiveActivityStateDTO.addButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str6 = clickLiveActivityStateDTO.key;
        }
        Button button3 = button2;
        String str7 = str6;
        String str8 = str5;
        Button button4 = button;
        return clickLiveActivityStateDTO.copy(str, str2, str3, str4, str8, button4, button3, str7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getWidgetLink() {
        return this.widgetLink;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Button getCallButton() {
        return this.callButton;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Button getAddButton() {
        return this.addButton;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final ClickLiveActivityStateDTO copy(@NotNull String logo, @NotNull String image, @NotNull String title, @NotNull String subtitle, @NotNull String widgetLink, @NotNull Button callButton, @NotNull Button addButton, @NotNull String key) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(widgetLink, "widgetLink");
        Intrinsics.checkNotNullParameter(callButton, "callButton");
        Intrinsics.checkNotNullParameter(addButton, "addButton");
        Intrinsics.checkNotNullParameter(key, "key");
        return new ClickLiveActivityStateDTO(logo, image, title, subtitle, widgetLink, callButton, addButton, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickLiveActivityStateDTO)) {
            return false;
        }
        ClickLiveActivityStateDTO clickLiveActivityStateDTO = (ClickLiveActivityStateDTO) other;
        return Intrinsics.d(this.logo, clickLiveActivityStateDTO.logo) && Intrinsics.d(this.image, clickLiveActivityStateDTO.image) && Intrinsics.d(this.title, clickLiveActivityStateDTO.title) && Intrinsics.d(this.subtitle, clickLiveActivityStateDTO.subtitle) && Intrinsics.d(this.widgetLink, clickLiveActivityStateDTO.widgetLink) && Intrinsics.d(this.callButton, clickLiveActivityStateDTO.callButton) && Intrinsics.d(this.addButton, clickLiveActivityStateDTO.addButton) && Intrinsics.d(this.key, clickLiveActivityStateDTO.key);
    }

    @NotNull
    public final Button getAddButton() {
        return this.addButton;
    }

    @NotNull
    public final Button getCallButton() {
        return this.callButton;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getWidgetLink() {
        return this.widgetLink;
    }

    public int hashCode() {
        return this.key.hashCode() + ((this.addButton.hashCode() + ((this.callButton.hashCode() + g.a(g.a(g.a(g.a(this.logo.hashCode() * 31, 31, this.image), 31, this.title), 31, this.subtitle), 31, this.widgetLink)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.logo;
        String str2 = this.image;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.widgetLink;
        Button button = this.callButton;
        Button button2 = this.addButton;
        String str6 = this.key;
        StringBuilder d11 = C3660k.d("ClickLiveActivityStateDTO(logo=", str, ", image=", str2, ", title=");
        a.h(d11, str3, ", subtitle=", str4, ", widgetLink=");
        d11.append(str5);
        d11.append(", callButton=");
        d11.append(button);
        d11.append(", addButton=");
        d11.append(button2);
        d11.append(", key=");
        d11.append(str6);
        d11.append(")");
        return d11.toString();
    }
}
