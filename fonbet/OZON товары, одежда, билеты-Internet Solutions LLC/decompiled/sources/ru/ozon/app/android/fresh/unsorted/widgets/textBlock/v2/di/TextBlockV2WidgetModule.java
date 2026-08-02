package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.di;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.data.TextBlockV2Config;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.presentation.TextBlockV2ViewMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/di/TextBlockV2WidgetModule;", "", "<init>", "()V", "Ln20/i;", "provideWidget", "()Ln20/i;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextBlockV2WidgetModule {

    @NotNull
    public static final TextBlockV2WidgetModule INSTANCE = new TextBlockV2WidgetModule();

    private TextBlockV2WidgetModule() {
    }

    @NotNull
    public final i provideWidget() {
        final long[] jArr = {2};
        final String str = "express";
        final String str2 = "textBlock";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.di.TextBlockV2WidgetModule$provideWidget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TextBlockV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TextBlockV2ViewMapper[]{new TextBlockV2ViewMapper((TextBlockV2Component) storage.getComponent(TextBlockV2Component.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TextBlockV2Component.Companion.create(storage)};
            }
        };
    }
}
