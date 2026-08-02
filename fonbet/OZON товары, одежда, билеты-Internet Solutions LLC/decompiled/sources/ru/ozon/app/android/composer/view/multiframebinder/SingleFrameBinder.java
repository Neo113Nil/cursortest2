package ru.ozon.app.android.composer.view.multiframebinder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/view/multiframebinder/SingleFrameBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "<init>", "()V", "bind", "", "steps", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "composerVoObjHashCode", "", "onAttach", "action", "Lkotlin/Function0;", "onOffscreenPositionChanged", "offscreenOffsetPercent", "", "onDetach", "onRecycle", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SingleFrameBinder implements FrameBinder {
    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void applyRecycler(RecyclerView recyclerView) {
        FrameBinder.DefaultImpls.applyRecycler(this, recyclerView);
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void bind(@NotNull List<? extends BindStep> steps, int composerVoObjHashCode) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Iterator<T> it = steps.iterator();
        while (it.hasNext()) {
            ((BindStep) it.next()).invoke();
        }
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void init(@NotNull View view) {
        FrameBinder.DefaultImpls.init(this, view);
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void onAttach(Function0<Unit> action) {
        if (action != null) {
            action.invoke();
        }
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void onDetach() {
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.FrameBinder
    public void onRecycle() {
    }
}
