package ru.ozon.app.android.account.adult.ui;

import BF.a;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/adult/ui/AdultViewHolder;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "T", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "adultDelegate", "<init>", "(Landroid/view/View;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;)V", "item", "", "bindAdultContent", "(Lru/ozon/app/android/account/adult/presenter/AdultVO;)V", "onDetach", "()V", "onAttach", "onRecycle", "bind", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lnc/b;", "disposable", "Lnc/b;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AdultViewHolder<T extends AdultVO> extends j {

    @NotNull
    private final AdultDelegate<T> adultDelegate;
    private InterfaceC8487b disposable;
    private T item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdultViewHolder(@NotNull View containerView, @NotNull AdultDelegate<T> adultDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        this.adultDelegate = adultDelegate;
    }

    public void bind(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        if (item.getIsAdult()) {
            this.adultDelegate.bindItem(item);
        } else {
            bindAdultContent(item);
        }
    }

    public abstract void bindAdultContent(@NotNull T item);

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        T t2 = this.item;
        if (t2 == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (t2.getIsAdult()) {
            this.disposable = this.adultDelegate.observeItem().subscribe(new a(new AdultViewHolder$onAttach$1(this), 5));
        }
    }

    @Override // jk0.j
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
}
