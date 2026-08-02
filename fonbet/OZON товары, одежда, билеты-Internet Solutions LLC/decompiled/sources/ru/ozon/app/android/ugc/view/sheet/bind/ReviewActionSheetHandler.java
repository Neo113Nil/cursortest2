package ru.ozon.app.android.ugc.view.sheet.bind;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.view.sheet.bind.ActionSheetInfo;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;", "Lru/ozon/app/android/ugc/view/sheet/bind/ActionSheetInfo;", "T", "", "<init>", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "item", "", "bind", "(Lru/ozon/app/android/ugc/view/sheet/bind/ActionSheetInfo;)V", "Lru/ozon/app/android/ugc/view/sheet/bind/ActionSheetInfo;", "getItem", "()Lru/ozon/app/android/ugc/view/sheet/bind/ActionSheetInfo;", "setItem", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ReviewActionSheetHandler<T extends ActionSheetInfo> {
    private T item;

    public void bind(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
    }

    protected final T getItem() {
        return this.item;
    }

    public abstract boolean handle(@NotNull AtomAction action);
}
