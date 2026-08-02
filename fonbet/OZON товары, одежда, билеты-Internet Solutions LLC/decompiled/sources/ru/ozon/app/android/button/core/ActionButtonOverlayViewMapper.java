package ru.ozon.app.android.button.core;

import Gm.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.button.core.ActionButtonOverlayViewMapper;
import ru.ozon.app.android.button.data.ActionButtonDTO;
import ru.ozon.app.android.button.databinding.WidgetButtonBlockLayoutBinding;
import ru.ozon.app.android.button.di.ActionButtonComponent;
import ru.ozon.app.android.button.presentation.ActionButtonOverlayWidgetViewHolder;
import ru.ozon.app.android.button.presentation.ActionButtonVO;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001!B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/button/core/ActionButtonOverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/button/di/ActionButtonComponent;", "Lru/ozon/app/android/button/data/ActionButtonDTO;", "Lru/ozon/app/android/button/presentation/ActionButtonVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/button/data/ActionButtonDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Companion", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionButtonOverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<ActionButtonComponent, ActionButtonDTO, ActionButtonVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/button/core/ActionButtonOverlayViewMapper$Companion;", "", "<init>", "()V", "ACCEPTABLE_DISPLAY_STYLE", "", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(WidgetButtonBlockLayoutBinding widgetButtonBlockLayoutBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RecyclerView constraintLayout = widgetButtonBlockLayoutBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionButtonComponent widgetComponent$lambda$1(C7475g c7475g) {
        return ActionButtonComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        ActionButtonDTO actionButtonDTO = state instanceof ActionButtonDTO ? (ActionButtonDTO) state : null;
        return Intrinsics.d(actionButtonDTO != null ? actionButtonDTO.getDisplayStyle() : null, "overlay");
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ActionButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        final WidgetButtonBlockLayoutBinding inflate = WidgetButtonBlockLayoutBinding.inflate(LayoutInflater.from(container.L()), container.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ActionButtonOverlayWidgetViewHolder(inflate, component().getActions(), container, new InterfaceC6068e() { // from class: Jm.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$0;
                createHolder$lambda$0 = ActionButtonOverlayViewMapper.createHolder$lambda$0(WidgetButtonBlockLayoutBinding.this, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
            }
        });
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ActionButtonComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ActionButtonComponent.class), new a(storage, 1));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ActionButtonVO> map(@NotNull ActionButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
