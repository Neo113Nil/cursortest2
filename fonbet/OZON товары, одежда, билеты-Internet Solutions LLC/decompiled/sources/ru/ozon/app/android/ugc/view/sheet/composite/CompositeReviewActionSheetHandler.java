package ru.ozon.app.android.ugc.view.sheet.composite;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.view.sheet.bind.ActionSheetInfo;
import ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/view/sheet/composite/CompositeReviewActionSheetHandler;", "T", "Lru/ozon/app/android/ugc/view/sheet/bind/ActionSheetInfo;", "Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;", "set", "", "<init>", "(Ljava/util/Set;)V", "bind", "", "item", "(Lru/ozon/app/android/ugc/view/sheet/bind/ActionSheetInfo;)V", "handle", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositeReviewActionSheetHandler<T extends ActionSheetInfo> extends ReviewActionSheetHandler<T> {

    @NotNull
    private final Set<ReviewActionSheetHandler<T>> set;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeReviewActionSheetHandler(@NotNull Set<? extends ReviewActionSheetHandler<T>> set) {
        Intrinsics.checkNotNullParameter(set, "set");
        this.set = set;
    }

    @Override // ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler
    public void bind(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        Iterator<T> it = this.set.iterator();
        while (it.hasNext()) {
            ((ReviewActionSheetHandler) it.next()).bind(item);
        }
    }

    @Override // ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler
    public boolean handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Set<ReviewActionSheetHandler<T>> set = this.set;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (((ReviewActionSheetHandler) it.next()).handle(action)) {
                return true;
            }
        }
        return false;
    }
}
