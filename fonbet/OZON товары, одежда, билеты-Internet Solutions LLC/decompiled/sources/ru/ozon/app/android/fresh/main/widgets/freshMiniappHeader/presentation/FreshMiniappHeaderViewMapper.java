package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation;

import A00.a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.data.FreshMiniappHeaderDTO;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di.FreshMiniappHeaderComponent;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/di/FreshMiniappHeaderComponent;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/data/FreshMiniappHeaderDTO;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/data/FreshMiniappHeaderDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderVO;)Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderVO;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderStateUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderMapper;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderMapper;", "mapper", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshMiniappHeaderViewMapper extends WidgetViewMapper2<FreshMiniappHeaderComponent, FreshMiniappHeaderDTO, FreshMiniappHeaderVO> {
    private final int layout = R$layout.widget_fresh_miniapp_header;

    @NotNull
    private final Function2<View, ComposerReferences, FreshMiniappHeaderHolder> holderProducer = new FreshMiniappHeaderViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<FreshMiniappHeaderStateUpdate>> supportedUpdates = C7714v.a0(FreshMiniappHeaderStateUpdate.class);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, FreshMiniappHeaderHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<FreshMiniappHeaderStateUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FreshMiniappHeaderComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return FreshMiniappHeaderComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public FreshMiniappHeaderMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public FreshMiniappHeaderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FreshMiniappHeaderVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof FreshMiniappHeaderStateUpdate) {
            return ((FreshMiniappHeaderStateUpdate) update).getState();
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, m20.InterfaceC8046a
    @NotNull
    public List<FreshMiniappHeaderVO> map(@NotNull FreshMiniappHeaderDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
