package ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.button;

import AH.a;
import Dv.C2882a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.EmptyScreenDTO;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.di.EmptyScreenWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.button.EmptyScreenButtonVI;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.button.EmptyScreenButtonWidgetViewHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001eB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/core/button/EmptyScreenButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/di/EmptyScreenWidgetComponent;", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/EmptyScreenDTO;", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/button/EmptyScreenButtonVI;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/EmptyScreenDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmptyScreenButtonViewMapper extends OverlayWidgetScreenViewItemMapper2<EmptyScreenWidgetComponent, EmptyScreenDTO, EmptyScreenButtonVI> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;
    private static final int marginHorizontal = ResourceExtKt.toPx(12);
    private static final int marginBottom = ResourceExtKt.toPx(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(MorkovskShadowButton morkovskShadowButton, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return morkovskShadowButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmptyScreenWidgetComponent widgetComponent$lambda$3(C7475g c7475g) {
        return EmptyScreenWidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<EmptyScreenButtonVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        MorkovskShadowButton morkovskShadowButton = new MorkovskShadowButton(L11, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int i11 = marginHorizontal;
        marginLayoutParams.setMargins(i11, marginLayoutParams.topMargin, i11, marginBottom);
        morkovskShadowButton.setLayoutParams(marginLayoutParams);
        return new EmptyScreenButtonWidgetViewHolder(morkovskShadowButton, container, component().getDefaultActionHandlers(), new C2882a(morkovskShadowButton, 1));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<EmptyScreenWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(EmptyScreenWidgetComponent.class), new a(storage, 11));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<EmptyScreenButtonVI> map(@NotNull EmptyScreenDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getButtonMapper().invoke(state, info);
    }
}
