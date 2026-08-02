package ru.ozon.app.android.product.common;

import DF.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0010\b\u0000\u0010\u0004*\u00020\u0001*\u00060\u0002j\u0002`\u00032\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0006B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0019\u0010\u0017R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\"\u0010\r\u001a\u00028\u00008\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0010R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/product/common/AdultWidgetViewHolder;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "T", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "adultDelegate", "<init>", "(Landroid/view/View;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;)V", "item", "", "bindAdultContent", "(Lru/ozon/app/android/account/adult/presenter/AdultVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/account/adult/presenter/AdultVO;Ll20/d;)V", "onAttach", "()V", "onDetach", "onRecycle", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "getItem", "()Lru/ozon/app/android/account/adult/presenter/AdultVO;", "setItem", "Lnc/b;", "disposable", "Lnc/b;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AdultWidgetViewHolder<T extends AdultVO & c> extends k<T> {

    @NotNull
    private final AdultDelegate<T> adultDelegate;
    private InterfaceC8487b disposable;
    protected T item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdultWidgetViewHolder(@NotNull View containerView, @NotNull AdultDelegate<T> adultDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        this.adultDelegate = adultDelegate;
    }

    public abstract void bindAdultContent(@NotNull T item);

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final T getItem() {
        T t2 = this.item;
        if (t2 != null) {
            return t2;
        }
        Intrinsics.n("item");
        throw null;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        if (getItem().getIsAdult()) {
            this.disposable = this.adultDelegate.observeItem().subscribe(new a(new AdultWidgetViewHolder$onAttach$1(this), 0));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.adultDelegate.clear();
    }

    protected final void setItem(@NotNull T t2) {
        Intrinsics.checkNotNullParameter(t2, "<set-?>");
        this.item = t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull T item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setItem(item);
        if (item.getIsAdult()) {
            this.adultDelegate.bindItem(item);
        } else {
            bindAdultContent(item);
        }
    }
}
