package ru.ozon.app.android.widgets.debug.di;

import c20.r;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.widgets.debug.coloredlifecyclewidget.ColoredLifecycleConfig;
import ru.ozon.app.android.widgets.debug.coloredlifecyclewidget.ColoredLifecycleViewMapper;
import ru.ozon.app.android.widgets.debug.coloredlifecyclewidget.di.ColoredLifecycleComponent;
import ru.ozon.app.android.widgets.debug.matchparentwidget.MatchParentWidgetConfig;
import ru.ozon.app.android.widgets.debug.matchparentwidget.MatchParentWidgetViewMapper;
import ru.ozon.app.android.widgets.debug.transparenttopwidget.TransparentBottomPlaceholderNoUiViewMapper;
import ru.ozon.app.android.widgets.debug.transparenttopwidget.TransparentPlaceholderConfig;
import ru.ozon.app.android.widgets.debug.transparenttopwidget.TransparentPlaceholderMapper;
import ru.ozon.app.android.widgets.debug.transparenttopwidget.TransparentTopPlaceholderNoUiViewMapper;
import ru.ozon.app.android.widgets.designSystemAtoms.core.DesignSystemAtomsConfig;
import ru.ozon.app.android.widgets.designSystemAtoms.core.DsAtomsViewMapper;
import ru.ozon.app.android.widgets.designSystemAtoms.core.TextAreaViewMapper;
import ru.ozon.app.android.widgets.designSystemAtoms.core.aspect.AspectViewMapper;
import ru.ozon.composer.ui.widget.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/widgets/debug/di/DebugWidgetsModule;", "", "<init>", "()V", "", "Ln20/i;", "provideWidgets$widgets_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideWidgets", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugWidgetsModule {
    @NotNull
    public final Set<i> provideWidgets$widgets_prodGoogleAllVendorsRelease() {
        final long[] b11 = j.b();
        final String str = "debug";
        final String str2 = "coloredLifecycle";
        i iVar = new i(str, str2, b11) { // from class: ru.ozon.app.android.widgets.debug.di.DebugWidgetsModule$provideWidgets$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ColoredLifecycleConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ColoredLifecycleViewMapper[]{new ColoredLifecycleViewMapper((ColoredLifecycleComponent) storage.getComponent(ColoredLifecycleComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{ColoredLifecycleComponent.Companion.invoke(storage)};
            }
        };
        final long[] b12 = j.b();
        final String str3 = "transparentPlaceholder";
        i iVar2 = new i(str, str3, b12) { // from class: ru.ozon.app.android.widgets.debug.di.DebugWidgetsModule$provideWidgets$$inlined$WidgetFactory$default$2
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TransparentPlaceholderConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                TransparentPlaceholderMapper transparentPlaceholderMapper = new TransparentPlaceholderMapper();
                return new r[]{new TransparentTopPlaceholderNoUiViewMapper(transparentPlaceholderMapper), new TransparentBottomPlaceholderNoUiViewMapper(transparentPlaceholderMapper)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        final long[] b13 = j.b();
        final String str4 = "matchParent";
        i iVar3 = new i(str, str4, b13) { // from class: ru.ozon.app.android.widgets.debug.di.DebugWidgetsModule$provideWidgets$$inlined$WidgetFactory$default$3
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new MatchParentWidgetConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new MatchParentWidgetViewMapper[]{new MatchParentWidgetViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        final long[] b14 = j.b();
        final String str5 = "common";
        final String str6 = "designSystemAtoms";
        i[] elements = {iVar, iVar2, iVar3, new i(str5, str6, b14) { // from class: ru.ozon.app.android.widgets.debug.di.DebugWidgetsModule$provideWidgets$$inlined$WidgetFactory$default$4
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new DesignSystemAtomsConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new g[]{new DsAtomsViewMapper(), new AspectViewMapper(), new TextAreaViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
