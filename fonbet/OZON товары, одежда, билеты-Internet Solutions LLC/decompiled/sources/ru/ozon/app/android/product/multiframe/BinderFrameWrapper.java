package ru.ozon.app.android.product.multiframe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u0019*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004:\u0001\u0019B\u001f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/product/multiframe/BinderFrameWrapper;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Product", "", "", "frameOrder", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "binder", "<init>", "(ILru/ozon/app/android/product/binders/ProductPropertyBinder;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getFrameOrder", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "getBinder", "()Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BinderFrameWrapper<Product extends c> {

    @NotNull
    private final ProductPropertyBinder<Product> binder;
    private final int frameOrder;

    public BinderFrameWrapper(int i11, @NotNull ProductPropertyBinder<Product> binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.frameOrder = i11;
        this.binder = binder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinderFrameWrapper)) {
            return false;
        }
        BinderFrameWrapper binderFrameWrapper = (BinderFrameWrapper) other;
        return this.frameOrder == binderFrameWrapper.frameOrder && Intrinsics.d(this.binder, binderFrameWrapper.binder);
    }

    @NotNull
    public final ProductPropertyBinder<Product> getBinder() {
        return this.binder;
    }

    public final int getFrameOrder() {
        return this.frameOrder;
    }

    public int hashCode() {
        return this.binder.hashCode() + (Integer.hashCode(this.frameOrder) * 31);
    }

    @NotNull
    public String toString() {
        return "BinderFrameWrapper(frameOrder=" + this.frameOrder + ", binder=" + this.binder + ")";
    }
}
