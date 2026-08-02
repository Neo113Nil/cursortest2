package ru.ozon.app.android.storefront.widgets.videoScroll.presentation;

import D3.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/VideoScrollVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Header;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Item;", "items", "<init>", "(JLru/ozon/app/android/storefront/widgets/videoScroll/presentation/Header;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Header;", "getHeader", "()Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Header;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoScrollVO implements c {
    private final Header header;
    private final long id;

    @NotNull
    private final List<Item> items;

    public VideoScrollVO(long j11, Header header, @NotNull List<Item> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.header = header;
        this.items = items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoScrollVO)) {
            return false;
        }
        VideoScrollVO videoScrollVO = (VideoScrollVO) other;
        return this.id == videoScrollVO.id && Intrinsics.d(this.header, videoScrollVO.header) && Intrinsics.d(this.items, videoScrollVO.items);
    }

    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
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
        int hashCode = Long.hashCode(this.id) * 31;
        Header header = this.header;
        return this.items.hashCode() + ((hashCode + (header == null ? 0 : header.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Header header = this.header;
        List<Item> list = this.items;
        StringBuilder sb2 = new StringBuilder("VideoScrollVO(id=");
        sb2.append(j11);
        sb2.append(", header=");
        sb2.append(header);
        return h.c(sb2, ", items=", list, ")");
    }
}
