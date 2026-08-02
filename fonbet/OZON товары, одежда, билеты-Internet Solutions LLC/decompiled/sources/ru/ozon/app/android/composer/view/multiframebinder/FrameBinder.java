package ru.ozon.app.android.composer.view.multiframebinder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH&J\u001a\u0010\f\u001a\u00020\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "", "init", "", "itemView", "Landroid/view/View;", "bind", "steps", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "composerVoObjHashCode", "", "onAttach", "action", "Lkotlin/Function0;", "onOffscreenPositionChanged", "offscreenOffsetPercent", "", "onDetach", "onRecycle", "applyRecycler", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FrameBinder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static void applyRecycler(@NotNull FrameBinder frameBinder, RecyclerView recyclerView) {
        }

        public static void init(@NotNull FrameBinder frameBinder, @NotNull View itemView) {
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onAttach$default(FrameBinder frameBinder, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAttach");
            }
            if ((i11 & 1) != 0) {
                function0 = null;
            }
            frameBinder.onAttach(function0);
        }
    }

    void applyRecycler(RecyclerView recyclerView);

    void bind(@NotNull List<? extends BindStep> steps, int composerVoObjHashCode);

    void init(@NotNull View itemView);

    void onAttach(Function0<Unit> action);

    void onDetach();

    void onOffscreenPositionChanged(float offscreenOffsetPercent);

    void onRecycle();
}
