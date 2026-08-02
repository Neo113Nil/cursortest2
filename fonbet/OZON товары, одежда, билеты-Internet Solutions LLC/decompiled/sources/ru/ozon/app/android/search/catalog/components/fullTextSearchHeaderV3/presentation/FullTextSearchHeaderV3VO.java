package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.presentation;

import G.g;
import K00.b;
import Lh.a;
import N3.C3660k;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003+,-B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$ShareData;", "shareData", "", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$CrosslinksVO;", "crosslinks", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$Header;Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$ShareData;Ljava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$Header;", "getHeader", "()Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$Header;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$ShareData;", "getShareData", "()Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$ShareData;", "Ljava/util/List;", "getCrosslinks", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Header", "ShareData", "CrosslinksVO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FullTextSearchHeaderV3VO implements c {

    @NotNull
    private final List<CrosslinksVO> crosslinks;

    @NotNull
    private final Header header;
    private final long id;
    private final ShareData shareData;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$CrosslinksVO;", "", "", "isShowIcon", "", "text", "", "deeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(ZLjava/lang/CharSequence;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "Ljava/lang/String;", "getDeeplink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CrosslinksVO {

        @NotNull
        private final String deeplink;
        private final boolean isShowIcon;

        @NotNull
        private final CharSequence text;
        private final t tokenizedEvent;

        public CrosslinksVO(boolean z11, @NotNull CharSequence text, @NotNull String deeplink, t tVar) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.isShowIcon = z11;
            this.text = text;
            this.deeplink = deeplink;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrosslinksVO)) {
                return false;
            }
            CrosslinksVO crosslinksVO = (CrosslinksVO) other;
            return this.isShowIcon == crosslinksVO.isShowIcon && Intrinsics.d(this.text, crosslinksVO.text) && Intrinsics.d(this.deeplink, crosslinksVO.deeplink) && Intrinsics.d(this.tokenizedEvent, crosslinksVO.tokenizedEvent);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final CharSequence getText() {
            return this.text;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = g.a((this.text.hashCode() + (Boolean.hashCode(this.isShowIcon) * 31)) * 31, 31, this.deeplink);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        /* renamed from: isShowIcon, reason: from getter */
        public final boolean getIsShowIcon() {
            return this.isShowIcon;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isShowIcon;
            CharSequence charSequence = this.text;
            return "CrosslinksVO(isShowIcon=" + z11 + ", text=" + ((Object) charSequence) + ", deeplink=" + this.deeplink + ", tokenizedEvent=" + this.tokenizedEvent + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$Header;", "", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "style", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;LWZ/t;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "I", "getStyle", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        private final int style;

        @NotNull
        private final OzonSpannableString title;
        private final t tokenizedEvent;

        public Header(@NotNull OzonSpannableString title, t tVar, int i11) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.tokenizedEvent = tVar;
            this.style = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.tokenizedEvent, header.tokenizedEvent) && this.style == header.style;
        }

        public final int getStyle() {
            return this.style;
        }

        @NotNull
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            return Integer.hashCode(this.style) + ((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.title;
            t tVar = this.tokenizedEvent;
            int i11 = this.style;
            StringBuilder sb2 = new StringBuilder("Header(title=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", style=");
            return b.e(i11, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/presentation/FullTextSearchHeaderV3VO$ShareData;", "", "", "shareText", "shareLink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShareText", "getShareLink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShareData {

        @NotNull
        private final String shareLink;

        @NotNull
        private final String shareText;
        private final t tokenizedEvent;

        public ShareData(@NotNull String shareText, @NotNull String shareLink, t tVar) {
            Intrinsics.checkNotNullParameter(shareText, "shareText");
            Intrinsics.checkNotNullParameter(shareLink, "shareLink");
            this.shareText = shareText;
            this.shareLink = shareLink;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareData)) {
                return false;
            }
            ShareData shareData = (ShareData) other;
            return Intrinsics.d(this.shareText, shareData.shareText) && Intrinsics.d(this.shareLink, shareData.shareLink) && Intrinsics.d(this.tokenizedEvent, shareData.tokenizedEvent);
        }

        @NotNull
        public final String getShareLink() {
            return this.shareLink;
        }

        @NotNull
        public final String getShareText() {
            return this.shareText;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = g.a(this.shareText.hashCode() * 31, 31, this.shareLink);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.shareText;
            String str2 = this.shareLink;
            return Tl.b.d(C3660k.d("ShareData(shareText=", str, ", shareLink=", str2, ", tokenizedEvent="), this.tokenizedEvent, ")");
        }
    }

    public FullTextSearchHeaderV3VO(long j11, @NotNull Header header, ShareData shareData, @NotNull List<CrosslinksVO> crosslinks, t tVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(crosslinks, "crosslinks");
        this.id = j11;
        this.header = header;
        this.shareData = shareData;
        this.crosslinks = crosslinks;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullTextSearchHeaderV3VO)) {
            return false;
        }
        FullTextSearchHeaderV3VO fullTextSearchHeaderV3VO = (FullTextSearchHeaderV3VO) other;
        return this.id == fullTextSearchHeaderV3VO.id && Intrinsics.d(this.header, fullTextSearchHeaderV3VO.header) && Intrinsics.d(this.shareData, fullTextSearchHeaderV3VO.shareData) && Intrinsics.d(this.crosslinks, fullTextSearchHeaderV3VO.crosslinks) && Intrinsics.d(this.tokenizedEvent, fullTextSearchHeaderV3VO.tokenizedEvent);
    }

    @NotNull
    public final List<CrosslinksVO> getCrosslinks() {
        return this.crosslinks;
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ShareData getShareData() {
        return this.shareData;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.header.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        ShareData shareData = this.shareData;
        int b11 = g.b((hashCode + (shareData == null ? 0 : shareData.hashCode())) * 31, 31, this.crosslinks);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Header header = this.header;
        ShareData shareData = this.shareData;
        List<CrosslinksVO> list = this.crosslinks;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("FullTextSearchHeaderV3VO(id=");
        sb2.append(j11);
        sb2.append(", header=");
        sb2.append(header);
        sb2.append(", shareData=");
        sb2.append(shareData);
        sb2.append(", crosslinks=");
        sb2.append(list);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
