package ru.ozon.app.android.checkoutcomposer.loader.presentation;

import Ak.C2436a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderSize;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/loader/presentation/LoaderVO;", "Ll20/c;", "", "id", "", "color", "Lru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;", "size", "<init>", "(JLjava/lang/String;Lru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getColor", "Lru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;", "getSize", "()Lru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LoaderVO implements c {
    private final String color;
    private final long id;

    @NotNull
    private final DsLoaderSize size;

    public LoaderVO(long j11, String str, @NotNull DsLoaderSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.id = j11;
        this.color = str;
        this.size = size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoaderVO)) {
            return false;
        }
        LoaderVO loaderVO = (LoaderVO) other;
        return this.id == loaderVO.id && Intrinsics.d(this.color, loaderVO.color) && this.size == loaderVO.size;
    }

    public final String getColor() {
        return this.color;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final DsLoaderSize getSize() {
        return this.size;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.color;
        return this.size.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.color;
        DsLoaderSize dsLoaderSize = this.size;
        StringBuilder c11 = C2436a.c(j11, "LoaderVO(id=", ", color=", str);
        c11.append(", size=");
        c11.append(dsLoaderSize);
        c11.append(")");
        return c11.toString();
    }
}
