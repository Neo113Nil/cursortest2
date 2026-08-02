package ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.core;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.data.UnreadMessageIndicatorDTO;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.di.UnreadMessageIndicatorComponent;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation.HasUnreadMessageUpdateKey;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation.UnreadMessageIndicatorVI;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation.UnreadMessageIndicatorViewHolder;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR(\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/core/UnreadMessageIndicatorViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/di/UnreadMessageIndicatorComponent;", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/data/UnreadMessageIndicatorDTO;", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorVI;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorVI;)Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorVI;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lk20/g;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/core/UnreadMessageIndicatorMapper;", "getMapper", "()Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/core/UnreadMessageIndicatorMapper;", "mapper", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnreadMessageIndicatorViewMapper extends WidgetViewMapper2<UnreadMessageIndicatorComponent, UnreadMessageIndicatorDTO, UnreadMessageIndicatorVI> {

    @NotNull
    private final Function2<View, ComposerReferences, UnreadMessageIndicatorViewHolder> holderProducer = new UnreadMessageIndicatorViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(HasUnreadMessageUpdateKey.class);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, UnreadMessageIndicatorViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<UnreadMessageIndicatorComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return UnreadMessageIndicatorComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public IconButtonV3View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new IconButtonV3View(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public UnreadMessageIndicatorMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public UnreadMessageIndicatorVI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull UnreadMessageIndicatorVI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof HasUnreadMessageUpdateKey)) {
            return null;
        }
        HasUnreadMessageUpdateKey hasUnreadMessageUpdateKey = (HasUnreadMessageUpdateKey) update;
        if (oldItem.getHasUnreadMessages() != hasUnreadMessageUpdateKey.getHasUnreadMessages()) {
            return UnreadMessageIndicatorVI.copy$default(oldItem, 0L, null, null, hasUnreadMessageUpdateKey.getHasUnreadMessages(), null, null, null, 119, null);
        }
        return null;
    }
}
