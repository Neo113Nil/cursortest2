package ru.ozon.app.android.account.orders.orderlist.v2.data.dto;

import B0.A0;
import G.g;
import N3.C3660k;
import T7.E;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003 !\"B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO;", "", "deeplink", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Header;", "sections", "", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO;", "progressiveDiscount", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Header;Ljava/util/List;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount;)V", "getDeeplink", "()Ljava/lang/String;", "getHeader", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Header;", "getSections", "()Ljava/util/List;", "getProgressiveDiscount", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Header", "ProgressiveDiscount", "Progress", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderDTO {
    public static final int $stable = 8;

    @NotNull
    private final String deeplink;

    @NotNull
    private final Header header;
    private final ProgressiveDiscount progressiveDiscount;
    private final List<SectionDTO> sections;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Header;", "", "number", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "icon", "status", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Header$Status;", "subtitle", "Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;", "orderProgress", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Progress;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Header$Status;Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Progress;)V", "getNumber", "()Ljava/lang/String;", "getTitle", "getIcon", "getStatus", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Header$Status;", "getSubtitle", "()Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;", "getOrderProgress", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Progress;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Header {
        public static final int $stable = 8;
        private final String icon;

        @NotNull
        private final String number;
        private final Progress orderProgress;
        private final Status status;
        private final CommonText.TextMedium subtitle;

        @NotNull
        private final String title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Header$Status;", "", "color", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Status {
            public static final int $stable = 0;

            @NotNull
            private final String color;

            @NotNull
            private final String name;

            public Status(@NotNull String color, @NotNull String name) {
                Intrinsics.checkNotNullParameter(color, "color");
                Intrinsics.checkNotNullParameter(name, "name");
                this.color = color;
                this.name = name;
            }

            public static /* synthetic */ Status copy$default(Status status, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = status.color;
                }
                if ((i11 & 2) != 0) {
                    str2 = status.name;
                }
                return status.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final Status copy(@NotNull String color, @NotNull String name) {
                Intrinsics.checkNotNullParameter(color, "color");
                Intrinsics.checkNotNullParameter(name, "name");
                return new Status(color, name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Status)) {
                    return false;
                }
                Status status = (Status) other;
                return Intrinsics.d(this.color, status.color) && Intrinsics.d(this.name, status.name);
            }

            @NotNull
            public final String getColor() {
                return this.color;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode() + (this.color.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("Status(color=", this.color, ", name=", this.name, ")");
            }
        }

        public Header(@NotNull String number, @NotNull String title, String str, Status status, CommonText.TextMedium textMedium, Progress progress) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(title, "title");
            this.number = number;
            this.title = title;
            this.icon = str;
            this.status = status;
            this.subtitle = textMedium;
            this.orderProgress = progress;
        }

        public static /* synthetic */ Header copy$default(Header header, String str, String str2, String str3, Status status, CommonText.TextMedium textMedium, Progress progress, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = header.number;
            }
            if ((i11 & 2) != 0) {
                str2 = header.title;
            }
            if ((i11 & 4) != 0) {
                str3 = header.icon;
            }
            if ((i11 & 8) != 0) {
                status = header.status;
            }
            if ((i11 & 16) != 0) {
                textMedium = header.subtitle;
            }
            if ((i11 & 32) != 0) {
                progress = header.orderProgress;
            }
            CommonText.TextMedium textMedium2 = textMedium;
            Progress progress2 = progress;
            return header.copy(str, str2, str3, status, textMedium2, progress2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getNumber() {
            return this.number;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final CommonText.TextMedium getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component6, reason: from getter */
        public final Progress getOrderProgress() {
            return this.orderProgress;
        }

        @NotNull
        public final Header copy(@NotNull String number, @NotNull String title, String icon, Status status, CommonText.TextMedium subtitle, Progress orderProgress) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Header(number, title, icon, status, subtitle, orderProgress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.number, header.number) && Intrinsics.d(this.title, header.title) && Intrinsics.d(this.icon, header.icon) && Intrinsics.d(this.status, header.status) && Intrinsics.d(this.subtitle, header.subtitle) && Intrinsics.d(this.orderProgress, header.orderProgress);
        }

        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getNumber() {
            return this.number;
        }

        public final Progress getOrderProgress() {
            return this.orderProgress;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final CommonText.TextMedium getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(this.number.hashCode() * 31, 31, this.title);
            String str = this.icon;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            Status status = this.status;
            int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
            CommonText.TextMedium textMedium = this.subtitle;
            int hashCode3 = (hashCode2 + (textMedium == null ? 0 : textMedium.hashCode())) * 31;
            Progress progress = this.orderProgress;
            return hashCode3 + (progress != null ? progress.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.number;
            String str2 = this.title;
            String str3 = this.icon;
            Status status = this.status;
            CommonText.TextMedium textMedium = this.subtitle;
            Progress progress = this.orderProgress;
            StringBuilder d11 = C3660k.d("Header(number=", str, ", title=", str2, ", icon=");
            d11.append(str3);
            d11.append(", status=");
            d11.append(status);
            d11.append(", subtitle=");
            d11.append(textMedium);
            d11.append(", orderProgress=");
            d11.append(progress);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Progress;", "", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "progressBar", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/progress/ProgressBar;)V", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getProgressBar", "()Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Progress {
        public static final int $stable = 8;

        @NotNull
        private final TextAtom description;

        @NotNull
        private final ProgressBar progressBar;

        public Progress(@NotNull TextAtom description, @NotNull ProgressBar progressBar) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            this.description = description;
            this.progressBar = progressBar;
        }

        public static /* synthetic */ Progress copy$default(Progress progress, TextAtom textAtom, ProgressBar progressBar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = progress.description;
            }
            if ((i11 & 2) != 0) {
                progressBar = progress.progressBar;
            }
            return progress.copy(textAtom, progressBar);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ProgressBar getProgressBar() {
            return this.progressBar;
        }

        @NotNull
        public final Progress copy(@NotNull TextAtom description, @NotNull ProgressBar progressBar) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            return new Progress(description, progressBar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return Intrinsics.d(this.description, progress.description) && Intrinsics.d(this.progressBar, progress.progressBar);
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final ProgressBar getProgressBar() {
            return this.progressBar;
        }

        public int hashCode() {
            return this.progressBar.hashCode() + (this.description.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Progress(description=" + this.description + ", progressBar=" + this.progressBar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount;", "", "originalPrice", "", "discountPrice", "scale", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount$Scale;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount$Scale;)V", "getOriginalPrice", "()Ljava/lang/String;", "getDiscountPrice", "getScale", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount$Scale;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Scale", "Item", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ProgressiveDiscount {
        public static final int $stable = 8;
        private final String discountPrice;

        @NotNull
        private final String originalPrice;
        private final Scale scale;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount$Item;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Index", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Item {
            public static final int $stable = 0;

            @NotNull
            private final String text;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount$Item$Index;", "", "index", "", "<init>", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Index {
                public static final int $stable = 0;
                private final int index;

                public Index(int i11) {
                    this.index = i11;
                }

                public static /* synthetic */ Index copy$default(Index index, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i11 = index.index;
                    }
                    return index.copy(i11);
                }

                /* renamed from: component1, reason: from getter */
                public final int getIndex() {
                    return this.index;
                }

                @NotNull
                public final Index copy(int index) {
                    return new Index(index);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Index) && this.index == ((Index) other).index;
                }

                public final int getIndex() {
                    return this.index;
                }

                public int hashCode() {
                    return Integer.hashCode(this.index);
                }

                @NotNull
                public String toString() {
                    return E.a(this.index, "Index(index=", ")");
                }
            }

            public Item(@NotNull String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public static /* synthetic */ Item copy$default(Item item, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = item.text;
                }
                return item.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @NotNull
            public final Item copy(@NotNull String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Item(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Item) && Intrinsics.d(this.text, ((Item) other).text);
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Item(text=", this.text, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount$Scale;", "", "items", "", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount$Item;", "selectedItemIndex", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount$Item$Index;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount$Item$Index;)V", "getItems", "()Ljava/util/List;", "getSelectedItemIndex", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount$Item$Index;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Scale {
            public static final int $stable = 8;

            @NotNull
            private final List<Item> items;
            private final Item.Index selectedItemIndex;

            public Scale(@NotNull List<Item> items, Item.Index index) {
                Intrinsics.checkNotNullParameter(items, "items");
                this.items = items;
                this.selectedItemIndex = index;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Scale copy$default(Scale scale, List list, Item.Index index, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = scale.items;
                }
                if ((i11 & 2) != 0) {
                    index = scale.selectedItemIndex;
                }
                return scale.copy(list, index);
            }

            @NotNull
            public final List<Item> component1() {
                return this.items;
            }

            /* renamed from: component2, reason: from getter */
            public final Item.Index getSelectedItemIndex() {
                return this.selectedItemIndex;
            }

            @NotNull
            public final Scale copy(@NotNull List<Item> items, Item.Index selectedItemIndex) {
                Intrinsics.checkNotNullParameter(items, "items");
                return new Scale(items, selectedItemIndex);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Scale)) {
                    return false;
                }
                Scale scale = (Scale) other;
                return Intrinsics.d(this.items, scale.items) && Intrinsics.d(this.selectedItemIndex, scale.selectedItemIndex);
            }

            @NotNull
            public final List<Item> getItems() {
                return this.items;
            }

            public final Item.Index getSelectedItemIndex() {
                return this.selectedItemIndex;
            }

            public int hashCode() {
                int hashCode = this.items.hashCode() * 31;
                Item.Index index = this.selectedItemIndex;
                return hashCode + (index == null ? 0 : index.hashCode());
            }

            @NotNull
            public String toString() {
                return "Scale(items=" + this.items + ", selectedItemIndex=" + this.selectedItemIndex + ")";
            }
        }

        public ProgressiveDiscount(@NotNull String originalPrice, String str, Scale scale) {
            Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
            this.originalPrice = originalPrice;
            this.discountPrice = str;
            this.scale = scale;
        }

        public static /* synthetic */ ProgressiveDiscount copy$default(ProgressiveDiscount progressiveDiscount, String str, String str2, Scale scale, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = progressiveDiscount.originalPrice;
            }
            if ((i11 & 2) != 0) {
                str2 = progressiveDiscount.discountPrice;
            }
            if ((i11 & 4) != 0) {
                scale = progressiveDiscount.scale;
            }
            return progressiveDiscount.copy(str, str2, scale);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getOriginalPrice() {
            return this.originalPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDiscountPrice() {
            return this.discountPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final Scale getScale() {
            return this.scale;
        }

        @NotNull
        public final ProgressiveDiscount copy(@NotNull String originalPrice, String discountPrice, Scale scale) {
            Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
            return new ProgressiveDiscount(originalPrice, discountPrice, scale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressiveDiscount)) {
                return false;
            }
            ProgressiveDiscount progressiveDiscount = (ProgressiveDiscount) other;
            return Intrinsics.d(this.originalPrice, progressiveDiscount.originalPrice) && Intrinsics.d(this.discountPrice, progressiveDiscount.discountPrice) && Intrinsics.d(this.scale, progressiveDiscount.scale);
        }

        public final String getDiscountPrice() {
            return this.discountPrice;
        }

        @NotNull
        public final String getOriginalPrice() {
            return this.originalPrice;
        }

        public final Scale getScale() {
            return this.scale;
        }

        public int hashCode() {
            int hashCode = this.originalPrice.hashCode() * 31;
            String str = this.discountPrice;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Scale scale = this.scale;
            return hashCode2 + (scale != null ? scale.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.originalPrice;
            String str2 = this.discountPrice;
            Scale scale = this.scale;
            StringBuilder d11 = C3660k.d("ProgressiveDiscount(originalPrice=", str, ", discountPrice=", str2, ", scale=");
            d11.append(scale);
            d11.append(")");
            return d11.toString();
        }
    }

    public OrderDTO(@NotNull String deeplink, @NotNull Header header, List<SectionDTO> list, ProgressiveDiscount progressiveDiscount) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(header, "header");
        this.deeplink = deeplink;
        this.header = header;
        this.sections = list;
        this.progressiveDiscount = progressiveDiscount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderDTO copy$default(OrderDTO orderDTO, String str, Header header, List list, ProgressiveDiscount progressiveDiscount, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderDTO.deeplink;
        }
        if ((i11 & 2) != 0) {
            header = orderDTO.header;
        }
        if ((i11 & 4) != 0) {
            list = orderDTO.sections;
        }
        if ((i11 & 8) != 0) {
            progressiveDiscount = orderDTO.progressiveDiscount;
        }
        return orderDTO.copy(str, header, list, progressiveDiscount);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    public final List<SectionDTO> component3() {
        return this.sections;
    }

    /* renamed from: component4, reason: from getter */
    public final ProgressiveDiscount getProgressiveDiscount() {
        return this.progressiveDiscount;
    }

    @NotNull
    public final OrderDTO copy(@NotNull String deeplink, @NotNull Header header, List<SectionDTO> sections, ProgressiveDiscount progressiveDiscount) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(header, "header");
        return new OrderDTO(deeplink, header, sections, progressiveDiscount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDTO)) {
            return false;
        }
        OrderDTO orderDTO = (OrderDTO) other;
        return Intrinsics.d(this.deeplink, orderDTO.deeplink) && Intrinsics.d(this.header, orderDTO.header) && Intrinsics.d(this.sections, orderDTO.sections) && Intrinsics.d(this.progressiveDiscount, orderDTO.progressiveDiscount);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    public final ProgressiveDiscount getProgressiveDiscount() {
        return this.progressiveDiscount;
    }

    public final List<SectionDTO> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int hashCode = (this.header.hashCode() + (this.deeplink.hashCode() * 31)) * 31;
        List<SectionDTO> list = this.sections;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ProgressiveDiscount progressiveDiscount = this.progressiveDiscount;
        return hashCode2 + (progressiveDiscount != null ? progressiveDiscount.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderDTO(deeplink=" + this.deeplink + ", header=" + this.header + ", sections=" + this.sections + ", progressiveDiscount=" + this.progressiveDiscount + ")";
    }
}
