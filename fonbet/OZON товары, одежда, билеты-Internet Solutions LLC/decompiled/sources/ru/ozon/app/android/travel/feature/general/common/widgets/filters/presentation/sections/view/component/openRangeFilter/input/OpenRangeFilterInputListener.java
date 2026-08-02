package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputListener;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/widget/TextView$OnEditorActionListener;", "callback", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputListener$Callback;", "type", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputListener$Callback;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;)V", "isAlreadyFocused", "", "onFocusChange", "", "view", "Landroid/view/View;", "hasFocus", "onEditorAction", "Landroid/widget/TextView;", "actionId", "", "event", "Landroid/view/KeyEvent;", "Callback", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OpenRangeFilterInputListener implements View.OnFocusChangeListener, TextView.OnEditorActionListener {

    @NotNull
    private final Callback callback;
    private boolean isAlreadyFocused;

    @NotNull
    private final OpenRangeFilterInputType type;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputListener$Callback;", "", "onFocusGained", "", "type", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;", "onFocusLost", "onDoneClicked", "view", "Landroid/view/View;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Callback {
        void onDoneClicked(@NotNull View view, @NotNull OpenRangeFilterInputType type);

        void onFocusGained(@NotNull OpenRangeFilterInputType type);

        void onFocusLost(@NotNull OpenRangeFilterInputType type);
    }

    public OpenRangeFilterInputListener(@NotNull Callback callback, @NotNull OpenRangeFilterInputType type) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(type, "type");
        this.callback = callback;
        this.type = type;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(@NotNull TextView view, int actionId, KeyEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z11 = actionId == 6;
        if (z11) {
            this.callback.onDoneClicked(view, this.type);
            this.isAlreadyFocused = false;
        }
        return z11;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(@NotNull View view, boolean hasFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (hasFocus) {
            this.callback.onFocusGained(this.type);
        }
        if (this.isAlreadyFocused && !hasFocus) {
            this.isAlreadyFocused = false;
            this.callback.onFocusLost(this.type);
        }
        this.isAlreadyFocused = hasFocus;
    }
}
