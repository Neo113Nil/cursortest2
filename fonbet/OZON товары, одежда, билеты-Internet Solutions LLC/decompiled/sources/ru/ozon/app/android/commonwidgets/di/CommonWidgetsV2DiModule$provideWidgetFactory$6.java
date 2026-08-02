package ru.ozon.app.android.commonwidgets.di;

import Sc.InterfaceC4008j;
import Tg.a;
import Wg.d;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk20/g;", "LTg/a;", "invoke", "(Lk20/g;)LTg/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CommonWidgetsV2DiModule$provideWidgetFactory$6 extends AbstractC7737t implements Function1<C7475g, a> {
    public static final CommonWidgetsV2DiModule$provideWidgetFactory$6 INSTANCE = new CommonWidgetsV2DiModule$provideWidgetFactory$6();

    CommonWidgetsV2DiModule$provideWidgetFactory$6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final a invoke(C7475g commonButtonStackWidget) {
        Intrinsics.checkNotNullParameter(commonButtonStackWidget, "$this$commonButtonStackWidget");
        RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) commonButtonStackWidget.getComponent(RetainComposerComponentApi.class);
        final ComposerNavigator composerNavigator = retainComposerComponentApi.getComposerNavigator();
        final QZ.a<? extends C7854a> composer = retainComposerComponentApi.getComposer();
        return new a() { // from class: ru.ozon.app.android.commonwidgets.di.CommonWidgetsV2DiModule$provideWidgetFactory$6.1
            @Override // Tg.a
            public void dismiss() {
                ComposerNavigator.this.popBackStack();
            }

            @Override // Tg.a
            public QZ.a<? extends C7854a> getComposer() {
                return composer;
            }

            @Override // Tg.a
            /* renamed from: getScrollPositionConverter */
            public d get$converter() {
                InterfaceC4008j interfaceC4008j;
                interfaceC4008j = d.f33848d;
                return (d) interfaceC4008j.getValue();
            }

            @Override // Tg.a
            public void navigateTo(String link) {
                if (link != null) {
                    ComposerNavigator.DefaultImpls.openDeeplink$default(ComposerNavigator.this, link, null, 2, null);
                }
            }
        };
    }
}
