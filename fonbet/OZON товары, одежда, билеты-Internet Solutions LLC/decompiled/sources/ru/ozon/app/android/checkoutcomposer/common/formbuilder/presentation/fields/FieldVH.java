package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields;

import Cm.RunnableC2781a;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00020\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\u0002H\u0004¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldVH;", "Ljk0/j;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "formConfig", "<init>", "(Landroid/view/View;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "item", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;)V", "showKeyboardDelayed", "(Landroid/view/View;)V", "removeKeyboardCallbacks", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "getFormConfig", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "Ljava/lang/Runnable;", "keyboardShowRunnable", "Ljava/lang/Runnable;", "Companion", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class FieldVH extends j {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FormConfig formConfig;
    private Runnable keyboardShowRunnable;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldVH$Companion;", "", "<init>", "()V", "SHOW_KEYBOARD_DELAY", "", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldVH(@NotNull View containerView, @NotNull FormConfig formConfig) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(formConfig, "formConfig");
        this.formConfig = formConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showKeyboardDelayed$lambda$0(FieldVH fieldVH, View view) {
        fieldVH.keyboardShowRunnable = null;
        view.requestFocus();
        KeyboardUtilsKt.showKeyboard(view);
    }

    public abstract void bind(@NotNull FormBuilderBlockVO.Field item);

    @NotNull
    protected final FormConfig getFormConfig() {
        return this.formConfig;
    }

    protected final void removeKeyboardCallbacks(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Runnable runnable = this.keyboardShowRunnable;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        this.keyboardShowRunnable = null;
    }

    protected final void showKeyboardDelayed(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Runnable runnable = this.keyboardShowRunnable;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        RunnableC2781a runnableC2781a = new RunnableC2781a(5, this, view);
        this.keyboardShowRunnable = runnableC2781a;
        view.postDelayed(runnableC2781a, 100L);
    }
}
