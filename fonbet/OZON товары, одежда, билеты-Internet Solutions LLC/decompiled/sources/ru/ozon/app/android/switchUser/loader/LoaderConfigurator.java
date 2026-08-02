package ru.ozon.app.android.switchUser.loader;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import i10.l;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.switchUser.loader.LoaderEventBus;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u0003R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/switchUser/loader/LoaderConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Lru/ozon/app/android/switchUser/loader/LoaderEventBus$Event;", "event", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "", "onLoaderEvent", "(Lru/ozon/app/android/switchUser/loader/LoaderEventBus$Event;Ll10/b;)V", "onComposerInitialized", "Li10/l$a$b;", "loaderType$delegate", "LSc/j;", "getLoaderType", "()Li10/l$a$b;", "loaderType", "switch-user_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoaderConfigurator extends ComposerScreenConfig.PageConfigurator {

    /* renamed from: loaderType$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j loaderType = k.b(LoaderConfigurator$loaderType$2.INSTANCE);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoaderEventBus.Event.values().length];
            try {
                iArr[LoaderEventBus.Event.SHOW_LOADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoaderEventBus.Event.HIDE_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final l.a.b getLoaderType() {
        return (l.a.b) this.loaderType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoaderEvent(LoaderEventBus.Event event, InterfaceC7851b controller) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            controller.e(getLoaderType());
        } else {
            if (i11 != 2) {
                throw new o();
            }
            controller.hideLoader();
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        C2399j.C(C5427n.a(new C2408n0(LoaderEventBus.INSTANCE.getFlow(), new LoaderConfigurator$onComposerInitialized$1(this, references.getController(), null)), getOwner().getLifecycle(), AbstractC5434v.b.STARTED), K.a(getOwner()));
    }
}
