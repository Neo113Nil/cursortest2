package ru.ozon.app.android.widgets.debug.coloredlifecyclewidget;

import Sc.InterfaceC4008j;
import Sc.k;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.debug.coloredlifecyclewidget.di.ColoredLifecycleComponent;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleDTO;", "Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleVO;", "Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/di/ColoredLifecycleComponent;", "component", "<init>", "(Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/di/ColoredLifecycleComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/di/ColoredLifecycleComponent;", "Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/ColoredLifecycleMapper;", "mapper", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColoredLifecycleViewMapper extends g<ColoredLifecycleDTO, ColoredLifecycleVO> {

    @NotNull
    private final ColoredLifecycleComponent component;
    private final Void layout;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    public ColoredLifecycleViewMapper(@NotNull ColoredLifecycleComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = k.b(ColoredLifecycleViewMapper$mapper$2.INSTANCE);
    }

    private final ColoredLifecycleMapper getMapper() {
        return (ColoredLifecycleMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public ru.ozon.composer.ui.widget.k<ColoredLifecycleVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new ColoredLifecycleViewHolder(view, container, this.component.getStorage(), this.component.getCustomActionHandlersStoreFactory());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AppCompatTextView appCompatTextView = new AppCompatTextView(parent.getContext());
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, UiExtKt.toPx(40)));
        appCompatTextView.setGravity(17);
        appCompatTextView.setTypeface(Typeface.DEFAULT, 1);
        appCompatTextView.setTextColor(-16777216);
        return appCompatTextView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ColoredLifecycleVO> map(@NotNull ColoredLifecycleDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
