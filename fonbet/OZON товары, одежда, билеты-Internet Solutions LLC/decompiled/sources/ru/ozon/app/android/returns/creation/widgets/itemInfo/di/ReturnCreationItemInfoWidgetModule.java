package ru.ozon.app.android.returns.creation.widgets.itemInfo.di;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.core.ReturnCreationItemInfoConfig;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.scrollable.ScrollableItemWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky.ItemWidgetViewMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/di/ReturnCreationItemInfoWidgetModule;", "", "<init>", "()V", "Ln20/i;", "provideWidget", "()Ln20/i;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationItemInfoWidgetModule {
    @NotNull
    public final i provideWidget() {
        final long[] b11 = j.b();
        final String str = "rms";
        final String str2 = "returnCreationItemInfo";
        return new i(str, str2, b11) { // from class: ru.ozon.app.android.returns.creation.widgets.itemInfo.di.ReturnCreationItemInfoWidgetModule$provideWidget$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ReturnCreationItemInfoConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                ItemComponent itemComponent = (ItemComponent) storage.getComponent(ItemComponent.class);
                ItemWidgetViewMapper itemWidgetViewMapper = new ItemWidgetViewMapper();
                itemWidgetViewMapper.linkComponent(itemComponent);
                ScrollableItemWidgetViewMapper scrollableItemWidgetViewMapper = new ScrollableItemWidgetViewMapper();
                scrollableItemWidgetViewMapper.linkComponent(itemComponent);
                return new InterfaceC8046a[]{itemWidgetViewMapper, scrollableItemWidgetViewMapper};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
    }
}
