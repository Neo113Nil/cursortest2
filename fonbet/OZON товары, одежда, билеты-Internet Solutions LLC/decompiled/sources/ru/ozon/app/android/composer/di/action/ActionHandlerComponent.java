package ru.ozon.app.android.composer.di.action;

import C.C2699t;
import Sc.InterfaceC4008j;
import Sc.k;
import Ug.a;
import Vg.b;
import WZ.l;
import Wg.d;
import a00.C4911f;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/composer/di/action/ActionHandlerComponent;", "LUg/a;", "Lk20/g;", "storage", "<init>", "(Lk20/g;)V", "LVg/b;", "getActionNavigatorFactory", "()LVg/b;", "Ll10/b;", "getController", "()Ll10/b;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "getWidgetComponentStorage", "()Lk20/g;", "Lk20/g;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponent$delegate", "LSc/j;", "getRetainComposerComponent", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponent", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionHandlerComponent implements a {

    /* renamed from: retainComposerComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j retainComposerComponent;

    @NotNull
    private final C7475g storage;

    public ActionHandlerComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
        this.retainComposerComponent = k.b(new ActionHandlerComponent$retainComposerComponent$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tg.a getActionNavigatorFactory$lambda$0(final ComposerNavigator composerNavigator, final ActionHandlerComponent actionHandlerComponent, C4911f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Tg.a() { // from class: ru.ozon.app.android.composer.di.action.ActionHandlerComponent$getActionNavigatorFactory$1$1
            @Override // Tg.a
            public void dismiss() {
                ComposerNavigator.this.popBackStack();
            }

            @Override // Tg.a
            public QZ.a<? extends C7854a> getComposer() {
                C7475g c7475g;
                c7475g = actionHandlerComponent.storage;
                return ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getComposer();
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

    private final RetainComposerComponentApi getRetainComposerComponent() {
        return (RetainComposerComponentApi) this.retainComposerComponent.getValue();
    }

    @Override // Ug.a
    @NotNull
    public b getActionNavigatorFactory() {
        return new C2699t(getRetainComposerComponent().getComposerNavigator(), this);
    }

    @Override // Ug.a
    @NotNull
    public InterfaceC7851b getController() {
        return getRetainComposerComponent().getComposerController();
    }

    @Override // Ug.a
    @NotNull
    public l getTokenizedAnalytics() {
        return getRetainComposerComponent().getTokenizedAnalytics();
    }

    @Override // Ug.a
    @NotNull
    /* renamed from: getWidgetComponentStorage, reason: from getter */
    public C7475g getStorage() {
        return this.storage;
    }
}
