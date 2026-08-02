package ru.ozon.app.android.travel.utils.helpers;

import androidx.activity.C;
import androidx.activity.J;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/utils/helpers/BackPressedHelper;", "", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/fragment/app/r;", "activity", "Landroidx/lifecycle/J;", "viewOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/r;Landroidx/lifecycle/J;)V", "action", "addCallback", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "removeCallback", "()V", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/J;", "Landroidx/activity/J;", "onBackPressedDispatcher", "Landroidx/activity/J;", "Landroidx/activity/C;", "onBackPressedCallback", "Landroidx/activity/C;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BackPressedHelper {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private C onBackPressedCallback;
    private final J onBackPressedDispatcher;

    @NotNull
    private final androidx.lifecycle.J viewOwner;

    /* JADX WARN: Multi-variable type inference failed */
    public BackPressedHelper(@NotNull Function1<? super AtomAction, Unit> actionHandler, r rVar, @NotNull androidx.lifecycle.J viewOwner) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        this.actionHandler = actionHandler;
        this.viewOwner = viewOwner;
        this.onBackPressedDispatcher = rVar != null ? rVar.getOnBackPressedDispatcher() : null;
    }

    public final void addCallback(final AtomAction action) {
        removeCallback();
        if (action == null) {
            return;
        }
        C c11 = new C() { // from class: ru.ozon.app.android.travel.utils.helpers.BackPressedHelper$addCallback$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                Function1 function1;
                function1 = BackPressedHelper.this.actionHandler;
                function1.invoke(action);
                setEnabled(false);
            }
        };
        this.onBackPressedCallback = c11;
        J j11 = this.onBackPressedDispatcher;
        if (j11 != null) {
            j11.h(this.viewOwner, c11);
        }
    }

    public final void removeCallback() {
        C c11 = this.onBackPressedCallback;
        if (c11 != null) {
            c11.remove();
        }
        this.onBackPressedCallback = null;
    }
}
