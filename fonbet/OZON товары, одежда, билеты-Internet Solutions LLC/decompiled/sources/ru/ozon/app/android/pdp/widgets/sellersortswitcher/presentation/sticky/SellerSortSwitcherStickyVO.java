package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky;

import Ak.C2436a;
import D40.a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "imageUrl", "text", "", "isStickyVisible", "<init>", "(JLjava/lang/String;Ljava/lang/String;Z)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Z)Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImageUrl", "getText", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerSortSwitcherStickyVO implements c {
    private final long id;

    @NotNull
    private final String imageUrl;
    private final boolean isStickyVisible;

    @NotNull
    private final String text;

    public SellerSortSwitcherStickyVO(long j11, @NotNull String imageUrl, @NotNull String text, boolean z11) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.imageUrl = imageUrl;
        this.text = text;
        this.isStickyVisible = z11;
    }

    public static /* synthetic */ SellerSortSwitcherStickyVO copy$default(SellerSortSwitcherStickyVO sellerSortSwitcherStickyVO, long j11, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = sellerSortSwitcherStickyVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = sellerSortSwitcherStickyVO.imageUrl;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = sellerSortSwitcherStickyVO.text;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            z11 = sellerSortSwitcherStickyVO.isStickyVisible;
        }
        return sellerSortSwitcherStickyVO.copy(j12, str3, str4, z11);
    }

    @NotNull
    public final SellerSortSwitcherStickyVO copy(long id2, @NotNull String imageUrl, @NotNull String text, boolean isStickyVisible) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(text, "text");
        return new SellerSortSwitcherStickyVO(id2, imageUrl, text, isStickyVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerSortSwitcherStickyVO)) {
            return false;
        }
        SellerSortSwitcherStickyVO sellerSortSwitcherStickyVO = (SellerSortSwitcherStickyVO) other;
        return this.id == sellerSortSwitcherStickyVO.id && Intrinsics.d(this.imageUrl, sellerSortSwitcherStickyVO.imageUrl) && Intrinsics.d(this.text, sellerSortSwitcherStickyVO.text) && this.isStickyVisible == sellerSortSwitcherStickyVO.isStickyVisible;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.isStickyVisible) + g.a(g.a(Long.hashCode(this.id) * 31, 31, this.imageUrl), 31, this.text);
    }

    /* renamed from: isStickyVisible, reason: from getter */
    public final boolean getIsStickyVisible() {
        return this.isStickyVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.imageUrl;
        String str2 = this.text;
        boolean z11 = this.isStickyVisible;
        StringBuilder c11 = C2436a.c(j11, "SellerSortSwitcherStickyVO(id=", ", imageUrl=", str);
        a.g(", text=", str2, ", isStickyVisible=", c11, z11);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ SellerSortSwitcherStickyVO(long j11, String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, str2, (i11 & 8) != 0 ? false : z11);
    }
}
