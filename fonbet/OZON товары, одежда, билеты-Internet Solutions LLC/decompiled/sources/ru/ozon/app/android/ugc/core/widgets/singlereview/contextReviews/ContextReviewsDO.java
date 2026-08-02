package ru.ozon.app.android.ugc.core.widgets.singlereview.contextReviews;

import B0.C2454a;
import G.g;
import Tl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/contextReviews/ContextReviewsDO;", "", "", "uuid", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "contextReviews", "backgroundColor", "", "topPadding", "bottomPadding", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Ljava/util/List;", "getContextReviews", "()Ljava/util/List;", "getBackgroundColor", "I", "getTopPadding", "getBottomPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ContextReviewsDO {
    private final String backgroundColor;
    private final int bottomPadding;

    @NotNull
    private final List<TextDTO> contextReviews;
    private final int topPadding;

    @NotNull
    private final String uuid;

    public ContextReviewsDO(@NotNull String uuid, @NotNull List<TextDTO> contextReviews, String str, int i11, int i12) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(contextReviews, "contextReviews");
        this.uuid = uuid;
        this.contextReviews = contextReviews;
        this.backgroundColor = str;
        this.topPadding = i11;
        this.bottomPadding = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextReviewsDO)) {
            return false;
        }
        ContextReviewsDO contextReviewsDO = (ContextReviewsDO) other;
        return Intrinsics.d(this.uuid, contextReviewsDO.uuid) && Intrinsics.d(this.contextReviews, contextReviewsDO.contextReviews) && Intrinsics.d(this.backgroundColor, contextReviewsDO.backgroundColor) && this.topPadding == contextReviewsDO.topPadding && this.bottomPadding == contextReviewsDO.bottomPadding;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final List<TextDTO> getContextReviews() {
        return this.contextReviews;
    }

    public final int getTopPadding() {
        return this.topPadding;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int b11 = g.b(this.uuid.hashCode() * 31, 31, this.contextReviews);
        String str = this.backgroundColor;
        return Integer.hashCode(this.bottomPadding) + C2454a.a(this.topPadding, (b11 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        List<TextDTO> list = this.contextReviews;
        String str2 = this.backgroundColor;
        int i11 = this.topPadding;
        int i12 = this.bottomPadding;
        StringBuilder f7 = b.f("ContextReviewsDO(uuid=", str, ", contextReviews=", ", backgroundColor=", list);
        Pk0.g.d(i11, str2, ", topPadding=", ", bottomPadding=", f7);
        return K00.b.e(i12, ")", f7);
    }
}
