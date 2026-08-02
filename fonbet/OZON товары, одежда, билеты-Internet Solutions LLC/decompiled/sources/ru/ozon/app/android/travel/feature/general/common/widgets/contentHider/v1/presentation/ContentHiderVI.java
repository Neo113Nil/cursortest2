package ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.presentation;

import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/presentation/ContentHiderVI;", "Ll20/c;", "", "id", "", "topOpticalPartHeight", "bottomOpticalPartHeight", "", "opticalPartColor", "<init>", "(JIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getTopOpticalPartHeight", "getBottomOpticalPartHeight", "Ljava/lang/String;", "getOpticalPartColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentHiderVI implements c {
    private final int bottomOpticalPartHeight;
    private final long id;

    @NotNull
    private final String opticalPartColor;
    private final int topOpticalPartHeight;

    public ContentHiderVI(long j11, int i11, int i12, @NotNull String opticalPartColor) {
        Intrinsics.checkNotNullParameter(opticalPartColor, "opticalPartColor");
        this.id = j11;
        this.topOpticalPartHeight = i11;
        this.bottomOpticalPartHeight = i12;
        this.opticalPartColor = opticalPartColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentHiderVI)) {
            return false;
        }
        ContentHiderVI contentHiderVI = (ContentHiderVI) other;
        return this.id == contentHiderVI.id && this.topOpticalPartHeight == contentHiderVI.topOpticalPartHeight && this.bottomOpticalPartHeight == contentHiderVI.bottomOpticalPartHeight && Intrinsics.d(this.opticalPartColor, contentHiderVI.opticalPartColor);
    }

    public final int getBottomOpticalPartHeight() {
        return this.bottomOpticalPartHeight;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getOpticalPartColor() {
        return this.opticalPartColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getTopOpticalPartHeight() {
        return this.topOpticalPartHeight;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.opticalPartColor.hashCode() + C2454a.a(this.bottomOpticalPartHeight, C2454a.a(this.topOpticalPartHeight, Long.hashCode(this.id) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.topOpticalPartHeight;
        int i12 = this.bottomOpticalPartHeight;
        String str = this.opticalPartColor;
        StringBuilder b11 = Ql.c.b(j11, "ContentHiderVI(id=", i11, ", topOpticalPartHeight=");
        b11.append(", bottomOpticalPartHeight=");
        b11.append(i12);
        b11.append(", opticalPartColor=");
        b11.append(str);
        b11.append(")");
        return b11.toString();
    }
}
