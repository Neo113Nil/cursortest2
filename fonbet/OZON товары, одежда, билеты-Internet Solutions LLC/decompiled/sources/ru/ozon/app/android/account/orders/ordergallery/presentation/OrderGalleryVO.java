package ru.ozon.app.android.account.orders.ordergallery.presentation;

import Ak.C2436a;
import B6.b;
import G.g;
import N3.C3660k;
import Nh.a;
import T7.P;
import V.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\"#$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO;", "Ll20/c;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$PostingVO;", "postings", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "downloadAllAction", "<init>", "(JLjava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getPostings", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getDownloadAllAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "PostingVO", "CopyItemVO", "CopyActionVO", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderGalleryVO implements c {
    private final ButtonV3Atom.LargeButton downloadAllAction;
    private final long id;

    @NotNull
    private final List<PostingVO> postings;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyActionVO;", "", "", "clipboardText", "restrictionMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClipboardText", "getRestrictionMessage", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CopyActionVO {

        @NotNull
        private final String clipboardText;

        @NotNull
        private final String restrictionMessage;

        public CopyActionVO(@NotNull String clipboardText, @NotNull String restrictionMessage) {
            Intrinsics.checkNotNullParameter(clipboardText, "clipboardText");
            Intrinsics.checkNotNullParameter(restrictionMessage, "restrictionMessage");
            this.clipboardText = clipboardText;
            this.restrictionMessage = restrictionMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyActionVO)) {
                return false;
            }
            CopyActionVO copyActionVO = (CopyActionVO) other;
            return Intrinsics.d(this.clipboardText, copyActionVO.clipboardText) && Intrinsics.d(this.restrictionMessage, copyActionVO.restrictionMessage);
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
            return e.a("CopyActionVO(clipboardText=", this.clipboardText, ", restrictionMessage=", this.restrictionMessage, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyItemVO;", "", "", "icon", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyActionVO;", "copyAction", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyActionVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyActionVO;", "getCopyAction", "()Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyActionVO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CopyItemVO {

        @NotNull
        private final CopyActionVO copyAction;

        @NotNull
        private final String icon;

        public CopyItemVO(@NotNull String icon, @NotNull CopyActionVO copyAction) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(copyAction, "copyAction");
            this.icon = icon;
            this.copyAction = copyAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyItemVO)) {
                return false;
            }
            CopyItemVO copyItemVO = (CopyItemVO) other;
            return Intrinsics.d(this.icon, copyItemVO.icon) && Intrinsics.d(this.copyAction, copyItemVO.copyAction);
        }

        @NotNull
        public final CopyActionVO getCopyAction() {
            return this.copyAction;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.copyAction.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CopyItemVO(icon=" + this.icon + ", copyAction=" + this.copyAction + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$PostingVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "image", "iconImage", "description", "descriptionTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "hint", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "downloadAction", "", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "imageUrls", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyItemVO;", "copyItem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyItemVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getImage", "getIconImage", "getDescription", "getDescriptionTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getHint", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getDownloadAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/List;", "getImageUrls", "()Ljava/util/List;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyItemVO;", "getCopyItem", "()Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyItemVO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostingVO {
        private final CopyItemVO copyItem;
        private final String description;
        private final String descriptionTitle;
        private final ButtonV3Atom.LargeButton downloadAction;

        @NotNull
        private final OzonSpannableString hint;
        private final String iconImage;
        private final String image;
        private final List<GalleryRequest.GalleryItem> imageUrls;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public PostingVO(String str, String str2, String str3, String str4, String str5, @NotNull OzonSpannableString hint, ButtonV3Atom.LargeButton largeButton, List<? extends GalleryRequest.GalleryItem> list, CopyItemVO copyItemVO) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.title = str;
            this.image = str2;
            this.iconImage = str3;
            this.description = str4;
            this.descriptionTitle = str5;
            this.hint = hint;
            this.downloadAction = largeButton;
            this.imageUrls = list;
            this.copyItem = copyItemVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostingVO)) {
                return false;
            }
            PostingVO postingVO = (PostingVO) other;
            return Intrinsics.d(this.title, postingVO.title) && Intrinsics.d(this.image, postingVO.image) && Intrinsics.d(this.iconImage, postingVO.iconImage) && Intrinsics.d(this.description, postingVO.description) && Intrinsics.d(this.descriptionTitle, postingVO.descriptionTitle) && Intrinsics.d(this.hint, postingVO.hint) && Intrinsics.d(this.downloadAction, postingVO.downloadAction) && Intrinsics.d(this.imageUrls, postingVO.imageUrls) && Intrinsics.d(this.copyItem, postingVO.copyItem);
        }

        public final CopyItemVO getCopyItem() {
            return this.copyItem;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDescriptionTitle() {
            return this.descriptionTitle;
        }

        public final ButtonV3Atom.LargeButton getDownloadAction() {
            return this.downloadAction;
        }

        @NotNull
        public final OzonSpannableString getHint() {
            return this.hint;
        }

        public final String getIconImage() {
            return this.iconImage;
        }

        public final String getImage() {
            return this.image;
        }

        public final List<GalleryRequest.GalleryItem> getImageUrls() {
            return this.imageUrls;
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
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.description;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.descriptionTitle;
            int c11 = P.c(this.hint, (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
            ButtonV3Atom.LargeButton largeButton = this.downloadAction;
            int hashCode5 = (c11 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
            List<GalleryRequest.GalleryItem> list = this.imageUrls;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            CopyItemVO copyItemVO = this.copyItem;
            return hashCode6 + (copyItemVO != null ? copyItemVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.image;
            String str3 = this.iconImage;
            String str4 = this.description;
            String str5 = this.descriptionTitle;
            OzonSpannableString ozonSpannableString = this.hint;
            ButtonV3Atom.LargeButton largeButton = this.downloadAction;
            List<GalleryRequest.GalleryItem> list = this.imageUrls;
            CopyItemVO copyItemVO = this.copyItem;
            StringBuilder d11 = C3660k.d("PostingVO(title=", str, ", image=", str2, ", iconImage=");
            a.h(d11, str3, ", description=", str4, ", descriptionTitle=");
            b.c(str5, ", hint=", ", downloadAction=", d11, ozonSpannableString);
            d11.append(largeButton);
            d11.append(", imageUrls=");
            d11.append(list);
            d11.append(", copyItem=");
            d11.append(copyItemVO);
            d11.append(")");
            return d11.toString();
        }
    }

    public OrderGalleryVO(long j11, @NotNull String title, @NotNull List<PostingVO> postings, ButtonV3Atom.LargeButton largeButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(postings, "postings");
        this.id = j11;
        this.title = title;
        this.postings = postings;
        this.downloadAllAction = largeButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderGalleryVO)) {
            return false;
        }
        OrderGalleryVO orderGalleryVO = (OrderGalleryVO) other;
        return this.id == orderGalleryVO.id && Intrinsics.d(this.title, orderGalleryVO.title) && Intrinsics.d(this.postings, orderGalleryVO.postings) && Intrinsics.d(this.downloadAllAction, orderGalleryVO.downloadAllAction);
    }

    public final ButtonV3Atom.LargeButton getDownloadAllAction() {
        return this.downloadAllAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PostingVO> getPostings() {
        return this.postings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.postings);
        ButtonV3Atom.LargeButton largeButton = this.downloadAllAction;
        return b11 + (largeButton == null ? 0 : largeButton.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        List<PostingVO> list = this.postings;
        ButtonV3Atom.LargeButton largeButton = this.downloadAllAction;
        StringBuilder c11 = C2436a.c(j11, "OrderGalleryVO(id=", ", title=", str);
        c11.append(", postings=");
        c11.append(list);
        c11.append(", downloadAllAction=");
        c11.append(largeButton);
        c11.append(")");
        return c11.toString();
    }
}
