package ru.ozon.app.android.universalwidgets.messenger.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0004R$\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/util/DataBinder;", "T", "", "<init>", "()V", "data", "", "bind", "(Ljava/lang/Object;)V", "onClear", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "setData", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class DataBinder<T> {
    private T data;

    public void bind(T data) {
        this.data = data;
    }

    protected final T getData() {
        return this.data;
    }

    public final void onClear() {
        this.data = null;
    }
}
