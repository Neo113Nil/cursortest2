package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import B90.RunnableC2599a;
import Jk0.a;
import android.os.Handler;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"ru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchTopFiltersFragment$setUpKeyboardAnimationCallback$1$1", "Landroid/view/WindowInsetsAnimation$Callback;", "onProgress", "Landroid/view/WindowInsets;", "insets", "runningAnimations", "", "Landroid/view/WindowInsetsAnimation;", "onEnd", "", "animation", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogSearchTopFiltersFragment$setUpKeyboardAnimationCallback$1$1 extends WindowInsetsAnimation$Callback {
    final /* synthetic */ AppCompatEditText $this_with;
    final /* synthetic */ DialogSearchTopFiltersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchTopFiltersFragment$setUpKeyboardAnimationCallback$1$1(AppCompatEditText appCompatEditText, DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment) {
        super(0);
        this.$this_with = appCompatEditText;
        this.this$0 = dialogSearchTopFiltersFragment;
    }

    public void onEnd(WindowInsetsAnimation animation) {
        Handler handler;
        Handler handler2;
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onEnd(animation);
        if (this.$this_with.getRootWindowInsets().isVisible(WindowInsets.Type.ime())) {
            handler2 = this.this$0.mHandler;
            handler2.post(new a(this.$this_with, 1));
        } else {
            handler = this.this$0.mHandler;
            handler.post(new RunnableC2599a(this.$this_with, 7));
        }
    }

    public WindowInsets onProgress(WindowInsets insets, List<WindowInsetsAnimation> runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        return insets;
    }
}
