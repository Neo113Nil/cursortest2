package ru.ozon.app.android.account.orders.ordergallery.data;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Tl.b;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "postings", "", "Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$PostingDTO;", "downloadAllAction", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getTitle", "()Ljava/lang/String;", "getPostings", "()Ljava/util/List;", "getDownloadAllAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PostingDTO", "DownloadActionDTO", "CopyItemDTO", "CopyActionDTO", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderGalleryDTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.LargeButton downloadAllAction;

    @NotNull
    private final List<PostingDTO> postings;

    @NotNull
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyActionDTO;", "", "clipboardText", "", "restrictionMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getClipboardText", "()Ljava/lang/String;", "getRestrictionMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CopyActionDTO {
        public static final int $stable = 0;

        @NotNull
        private final String clipboardText;

        @NotNull
        private final String restrictionMessage;

        public CopyActionDTO(@NotNull String clipboardText, @NotNull String restrictionMessage) {
            Intrinsics.checkNotNullParameter(clipboardText, "clipboardText");
            Intrinsics.checkNotNullParameter(restrictionMessage, "restrictionMessage");
            this.clipboardText = clipboardText;
            this.restrictionMessage = restrictionMessage;
        }

        public static /* synthetic */ CopyActionDTO copy$default(CopyActionDTO copyActionDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = copyActionDTO.clipboardText;
            }
            if ((i11 & 2) != 0) {
                str2 = copyActionDTO.restrictionMessage;
            }
            return copyActionDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getClipboardText() {
            return this.clipboardText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRestrictionMessage() {
            return this.restrictionMessage;
        }

        @NotNull
        public final CopyActionDTO copy(@NotNull String clipboardText, @NotNull String restrictionMessage) {
            Intrinsics.checkNotNullParameter(clipboardText, "clipboardText");
            Intrinsics.checkNotNullParameter(restrictionMessage, "restrictionMessage");
            return new CopyActionDTO(clipboardText, restrictionMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyActionDTO)) {
                return false;
            }
            CopyActionDTO copyActionDTO = (CopyActionDTO) other;
            return Intrinsics.d(this.clipboardText, copyActionDTO.clipboardText) && Intrinsics.d(this.restrictionMessage, copyActionDTO.restrictionMessage);
        }

        @NotNull
        public final String getClipboardText() {
            return this.clipboardText;
        }

        @NotNull
        public final String getRestrictionMessage() {
            return this.restrictionMessage;
        }

        public int hashCode() {
            return this.restrictionMessage.hashCode() + (this.clipboardText.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("CopyActionDTO(clipboardText=", this.clipboardText, ", restrictionMessage=", this.restrictionMessage, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyItemDTO;", "", "icon", "", "action", "Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyActionDTO;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CopyItemDTO {
        public static final int $stable = 0;

        @NotNull
        private final CopyActionDTO action;

        @NotNull
        private final String icon;

        public CopyItemDTO(@NotNull String icon, @NotNull CopyActionDTO action) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = icon;
            this.action = action;
        }

        public static /* synthetic */ CopyItemDTO copy$default(CopyItemDTO copyItemDTO, String str, CopyActionDTO copyActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = copyItemDTO.icon;
            }
            if ((i11 & 2) != 0) {
                copyActionDTO = copyItemDTO.action;
            }
            return copyItemDTO.copy(str, copyActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CopyActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final CopyItemDTO copy(@NotNull String icon, @NotNull CopyActionDTO action) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            return new CopyItemDTO(icon, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyItemDTO)) {
                return false;
            }
            CopyItemDTO copyItemDTO = (CopyItemDTO) other;
            return Intrinsics.d(this.icon, copyItemDTO.icon) && Intrinsics.d(this.action, copyItemDTO.action);
        }

        @NotNull
        public final CopyActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CopyItemDTO(icon=" + this.icon + ", action=" + this.action + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$DownloadActionDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DownloadActionDTO {
        public static final int $stable = ButtonV3Atom.LargeButton.$stable;

        @NotNull
        private final ButtonV3Atom.LargeButton button;

        public DownloadActionDTO(@NotNull ButtonV3Atom.LargeButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
        }

        public static /* synthetic */ DownloadActionDTO copy$default(DownloadActionDTO downloadActionDTO, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                largeButton = downloadActionDTO.button;
            }
            return downloadActionDTO.copy(largeButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        @NotNull
        public final DownloadActionDTO copy(@NotNull ButtonV3Atom.LargeButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new DownloadActionDTO(button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DownloadActionDTO) && Intrinsics.d(this.button, ((DownloadActionDTO) other).button);
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        public int hashCode() {
            return this.button.hashCode();
        }

        @NotNull
        public String toString() {
            return "DownloadActionDTO(button=" + this.button + ")";
        }
    }

    public OrderGalleryDTO(@NotNull String title, @NotNull List<PostingDTO> postings, ButtonV3Atom.LargeButton largeButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(postings, "postings");
        this.title = title;
        this.postings = postings;
        this.downloadAllAction = largeButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderGalleryDTO copy$default(OrderGalleryDTO orderGalleryDTO, String str, List list, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderGalleryDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = orderGalleryDTO.postings;
        }
        if ((i11 & 4) != 0) {
            largeButton = orderGalleryDTO.downloadAllAction;
        }
        return orderGalleryDTO.copy(str, list, largeButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<PostingDTO> component2() {
        return this.postings;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getDownloadAllAction() {
        return this.downloadAllAction;
    }

    @NotNull
    public final OrderGalleryDTO copy(@NotNull String title, @NotNull List<PostingDTO> postings, ButtonV3Atom.LargeButton downloadAllAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(postings, "postings");
        return new OrderGalleryDTO(title, postings, downloadAllAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderGalleryDTO)) {
            return false;
        }
        OrderGalleryDTO orderGalleryDTO = (OrderGalleryDTO) other;
        return Intrinsics.d(this.title, orderGalleryDTO.title) && Intrinsics.d(this.postings, orderGalleryDTO.postings) && Intrinsics.d(this.downloadAllAction, orderGalleryDTO.downloadAllAction);
    }

    public final ButtonV3Atom.LargeButton getDownloadAllAction() {
        return this.downloadAllAction;
    }

    @NotNull
    public final List<PostingDTO> getPostings() {
        return this.postings;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = g.b(this.title.hashCode() * 31, 31, this.postings);
        ButtonV3Atom.LargeButton largeButton = this.downloadAllAction;
        return b11 + (largeButton == null ? 0 : largeButton.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<PostingDTO> list = this.postings;
        ButtonV3Atom.LargeButton largeButton = this.downloadAllAction;
        StringBuilder f7 = b.f("OrderGalleryDTO(title=", str, ", postings=", ", downloadAllAction=", list);
        f7.append(largeButton);
        f7.append(")");
        return f7.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Js\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$PostingDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "image", "iconImage", "canOpenGallery", "", "description", "descriptionTitle", "hint", "copyItem", "Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyItemDTO;", "downloadAction", "Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$DownloadActionDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyItemDTO;Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$DownloadActionDTO;)V", "getTitle", "()Ljava/lang/String;", "getImage", "getIconImage", "getCanOpenGallery", "()Z", "getDescription", "getDescriptionTitle", "getHint", "getCopyItem", "()Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyItemDTO;", "getDownloadAction", "()Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$DownloadActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostingDTO {
        public static final int $stable = ButtonV3Atom.LargeButton.$stable;
        private final boolean canOpenGallery;
        private final CopyItemDTO copyItem;
        private final String description;
        private final String descriptionTitle;
        private final DownloadActionDTO downloadAction;
        private final String hint;
        private final String iconImage;
        private final String image;
        private final String title;

        public PostingDTO(String str, String str2, String str3, boolean z11, String str4, String str5, String str6, CopyItemDTO copyItemDTO, DownloadActionDTO downloadActionDTO) {
            this.title = str;
            this.image = str2;
            this.iconImage = str3;
            this.canOpenGallery = z11;
            this.description = str4;
            this.descriptionTitle = str5;
            this.hint = str6;
            this.copyItem = copyItemDTO;
            this.downloadAction = downloadActionDTO;
        }

        public static /* synthetic */ PostingDTO copy$default(PostingDTO postingDTO, String str, String str2, String str3, boolean z11, String str4, String str5, String str6, CopyItemDTO copyItemDTO, DownloadActionDTO downloadActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = postingDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = postingDTO.image;
            }
            if ((i11 & 4) != 0) {
                str3 = postingDTO.iconImage;
            }
            if ((i11 & 8) != 0) {
                z11 = postingDTO.canOpenGallery;
            }
            if ((i11 & 16) != 0) {
                str4 = postingDTO.description;
            }
            if ((i11 & 32) != 0) {
                str5 = postingDTO.descriptionTitle;
            }
            if ((i11 & 64) != 0) {
                str6 = postingDTO.hint;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                copyItemDTO = postingDTO.copyItem;
            }
            if ((i11 & 256) != 0) {
                downloadActionDTO = postingDTO.downloadAction;
            }
            CopyItemDTO copyItemDTO2 = copyItemDTO;
            DownloadActionDTO downloadActionDTO2 = downloadActionDTO;
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            String str10 = str3;
            return postingDTO.copy(str, str2, str10, z11, str9, str7, str8, copyItemDTO2, downloadActionDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconImage() {
            return this.iconImage;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getCanOpenGallery() {
            return this.canOpenGallery;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDescriptionTitle() {
            return this.descriptionTitle;
        }

        /* renamed from: component7, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        /* renamed from: component8, reason: from getter */
        public final CopyItemDTO getCopyItem() {
            return this.copyItem;
        }

        /* renamed from: component9, reason: from getter */
        public final DownloadActionDTO getDownloadAction() {
            return this.downloadAction;
        }

        @NotNull
        public final PostingDTO copy(String title, String image, String iconImage, boolean canOpenGallery, String description, String descriptionTitle, String hint, CopyItemDTO copyItem, DownloadActionDTO downloadAction) {
            return new PostingDTO(title, image, iconImage, canOpenGallery, description, descriptionTitle, hint, copyItem, downloadAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostingDTO)) {
                return false;
            }
            PostingDTO postingDTO = (PostingDTO) other;
            return Intrinsics.d(this.title, postingDTO.title) && Intrinsics.d(this.image, postingDTO.image) && Intrinsics.d(this.iconImage, postingDTO.iconImage) && this.canOpenGallery == postingDTO.canOpenGallery && Intrinsics.d(this.description, postingDTO.description) && Intrinsics.d(this.descriptionTitle, postingDTO.descriptionTitle) && Intrinsics.d(this.hint, postingDTO.hint) && Intrinsics.d(this.copyItem, postingDTO.copyItem) && Intrinsics.d(this.downloadAction, postingDTO.downloadAction);
        }

        public final boolean getCanOpenGallery() {
            return this.canOpenGallery;
        }

        public final CopyItemDTO getCopyItem() {
            return this.copyItem;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDescriptionTitle() {
            return this.descriptionTitle;
        }

        public final DownloadActionDTO getDownloadAction() {
            return this.downloadAction;
        }

        public final String getHint() {
            return this.hint;
        }

        public final String getIconImage() {
            return this.iconImage;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.image;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconImage;
            int a11 = C3532b.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.canOpenGallery);
            String str4 = this.description;
            int hashCode3 = (a11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.descriptionTitle;
            int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.hint;
            int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
            CopyItemDTO copyItemDTO = this.copyItem;
            int hashCode6 = (hashCode5 + (copyItemDTO == null ? 0 : copyItemDTO.hashCode())) * 31;
            DownloadActionDTO downloadActionDTO = this.downloadAction;
            return hashCode6 + (downloadActionDTO != null ? downloadActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.image;
            String str3 = this.iconImage;
            boolean z11 = this.canOpenGallery;
            String str4 = this.description;
            String str5 = this.descriptionTitle;
            String str6 = this.hint;
            CopyItemDTO copyItemDTO = this.copyItem;
            DownloadActionDTO downloadActionDTO = this.downloadAction;
            StringBuilder d11 = C3660k.d("PostingDTO(title=", str, ", image=", str2, ", iconImage=");
            C2880a.c(str3, ", canOpenGallery=", ", description=", d11, z11);
            a.h(d11, str4, ", descriptionTitle=", str5, ", hint=");
            d11.append(str6);
            d11.append(", copyItem=");
            d11.append(copyItemDTO);
            d11.append(", downloadAction=");
            d11.append(downloadActionDTO);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ PostingDTO(String str, String str2, String str3, boolean z11, String str4, String str5, String str6, CopyItemDTO copyItemDTO, DownloadActionDTO downloadActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i11 & 8) != 0 ? false : z11, str4, str5, str6, copyItemDTO, downloadActionDTO);
        }
    }
}
