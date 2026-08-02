package r20;

import androidx.activity.ActivityC5043j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: r20.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9166c {
    private I20.b reloadActionsReceiver;

    public static /* synthetic */ void reloadGroup$default(AbstractC9166c abstractC9166c, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reloadGroup");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        abstractC9166c.reloadGroup(str);
    }

    public void onActivityCreated(@NotNull ActivityC5043j activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityDestroyed(@NotNull ActivityC5043j activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @NotNull
    public abstract U20.a provide();

    protected final void reloadGroup(String str) {
        if (str != null) {
            I20.b bVar = this.reloadActionsReceiver;
            if (bVar != null) {
                bVar.b(str);
                return;
            }
            return;
        }
        I20.b bVar2 = this.reloadActionsReceiver;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public final void setReloadActionsReceiver$ozon_debug_menu_release(@NotNull I20.b receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.reloadActionsReceiver = receiver;
    }
}
