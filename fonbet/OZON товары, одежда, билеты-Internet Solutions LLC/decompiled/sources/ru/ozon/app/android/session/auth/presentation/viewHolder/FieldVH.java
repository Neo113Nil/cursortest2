package ru.ozon.app.android.session.auth.presentation.viewHolder;

import C.T;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.auth.data.AuthVO;
import ru.ozon.app.android.session.auth.data.FieldAction;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\b*\u00020\u0002H\u0004¢\u0006\u0004\b\u0012\u0010\u0005R@\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/viewHolder/FieldVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "item", "", "bind", "(Lru/ozon/app/android/session/auth/data/AuthVO$Input;)V", "Lkotlin/Function1;", "Lru/ozon/app/android/session/auth/data/FieldAction;", "newOnAction", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "clearOnAction", "()V", "showKeyboardDelayed", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "Ljava/lang/Runnable;", "keyboardShowRunnable", "Ljava/lang/Runnable;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FieldVH extends RecyclerView.C {
    private Runnable keyboardShowRunnable;
    private Function1<? super FieldAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldVH(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showKeyboardDelayed$lambda$0(FieldVH fieldVH, View view) {
        fieldVH.keyboardShowRunnable = null;
        view.requestFocus();
        KeyboardUtilsKt.showKeyboard(view);
    }

    public abstract void bind(@NotNull AuthVO.Input item);

    public final void clearOnAction() {
        this.onAction = null;
    }

    protected final Function1<FieldAction, Unit> getOnAction() {
        return this.onAction;
    }

    public final void setOnAction(@NotNull Function1<? super FieldAction, Unit> newOnAction) {
        Intrinsics.checkNotNullParameter(newOnAction, "newOnAction");
        this.onAction = newOnAction;
    }

    protected final void showKeyboardDelayed(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Runnable runnable = this.keyboardShowRunnable;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        T t2 = new T(2, this, view);
        this.keyboardShowRunnable = t2;
        view.postDelayed(t2, 100L);
    }
}
