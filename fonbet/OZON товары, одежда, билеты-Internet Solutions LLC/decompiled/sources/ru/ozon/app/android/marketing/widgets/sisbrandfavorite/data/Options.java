package ru.ozon.app.android.marketing.widgets.sisbrandfavorite.data;

import Kk.c;
import T7.Z;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;", "", "marginLeft", "", "marginTop", "marginRight", "marginBottom", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMarginLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginTop", "getMarginRight", "getMarginBottom", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;", "equals", "", "other", "hashCode", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Options {
    public static final int $stable = 0;
    private final Integer marginBottom;
    private final Integer marginLeft;
    private final Integer marginRight;
    private final Integer marginTop;

    public Options(Integer num, Integer num2, Integer num3, Integer num4) {
        this.marginLeft = num;
        this.marginTop = num2;
        this.marginRight = num3;
        this.marginBottom = num4;
    }

    public static /* synthetic */ Options copy$default(Options options, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = options.marginLeft;
        }
        if ((i11 & 2) != 0) {
            num2 = options.marginTop;
        }
        if ((i11 & 4) != 0) {
            num3 = options.marginRight;
        }
        if ((i11 & 8) != 0) {
            num4 = options.marginBottom;
        }
        return options.copy(num, num2, num3, num4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getMarginLeft() {
        return this.marginLeft;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMarginTop() {
        return this.marginTop;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMarginRight() {
        return this.marginRight;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    @NotNull
    public final Options copy(Integer marginLeft, Integer marginTop, Integer marginRight, Integer marginBottom) {
        return new Options(marginLeft, marginTop, marginRight, marginBottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Options)) {
            return false;
        }
        Options options = (Options) other;
        return Intrinsics.d(this.marginLeft, options.marginLeft) && Intrinsics.d(this.marginTop, options.marginTop) && Intrinsics.d(this.marginRight, options.marginRight) && Intrinsics.d(this.marginBottom, options.marginBottom);
    }

    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    public final Integer getMarginLeft() {
        return this.marginLeft;
    }

    public final Integer getMarginRight() {
        return this.marginRight;
    }

    public final Integer getMarginTop() {
        return this.marginTop;
    }

    public int hashCode() {
        Integer num = this.marginLeft;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.marginTop;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.marginRight;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.marginBottom;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.marginLeft;
        Integer num2 = this.marginTop;
        return Z.c(c.f("Options(marginLeft=", ", marginTop=", num, num2, ", marginRight="), this.marginRight, ", marginBottom=", this.marginBottom, ")");
    }
}
