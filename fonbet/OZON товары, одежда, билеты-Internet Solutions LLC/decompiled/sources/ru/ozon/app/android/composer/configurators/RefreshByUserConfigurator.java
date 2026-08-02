package ru.ozon.app.android.composer.configurators;

import A00.a;
import Sc.o;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import i10.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.authEvents.AlreadyAuthEvents;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import xe.C10720e0;
import xe.C10727i;
import zb0.f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/composer/configurators/RefreshByUserConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "ozonIdCookieEvents", "", "scrollToTop", "", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$RefreshByAuthConfig$Enabled$ReasonRefresh;", "refreshReasons", "Lru/ozon/app/android/account/authEvents/AlreadyAuthEvents;", "alreadyAuthEvents", "<init>", "(Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;ZLjava/util/Set;Lru/ozon/app/android/account/authEvents/AlreadyAuthEvents;)V", "", "refreshPage", "()V", "", "Lzb0/f$b;", "mapReasonRefreshToOzonIdAuthEvent", "(Ljava/util/Set;)Ljava/util/List;", "onComposerInitialized", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "Z", "Ljava/util/Set;", "Lru/ozon/app/android/account/authEvents/AlreadyAuthEvents;", "Lzb0/f;", "prevAuthCookieEvent", "Lzb0/f;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshByUserConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final AlreadyAuthEvents alreadyAuthEvents;

    @NotNull
    private final OzonIdCookieEvents ozonIdCookieEvents;
    private f prevAuthCookieEvent;

    @NotNull
    private final Set<ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh> refreshReasons;
    private final boolean scrollToTop;

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshByUserConfigurator(@NotNull OzonIdCookieEvents ozonIdCookieEvents, boolean z11, @NotNull Set<? extends ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh> refreshReasons, @NotNull AlreadyAuthEvents alreadyAuthEvents) {
        Intrinsics.checkNotNullParameter(ozonIdCookieEvents, "ozonIdCookieEvents");
        Intrinsics.checkNotNullParameter(refreshReasons, "refreshReasons");
        Intrinsics.checkNotNullParameter(alreadyAuthEvents, "alreadyAuthEvents");
        this.ozonIdCookieEvents = ozonIdCookieEvents;
        this.scrollToTop = z11;
        this.refreshReasons = refreshReasons;
        this.alreadyAuthEvents = alreadyAuthEvents;
        this.prevAuthCookieEvent = ozonIdCookieEvents.getLast();
    }

    private final List<f.b> mapReasonRefreshToOzonIdAuthEvent(Set<? extends ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh> set) {
        f.b bVar;
        Set<? extends ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh> set2 = set;
        ArrayList arrayList = new ArrayList(C7714v.z(set2, 10));
        for (ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh reasonRefresh : set2) {
            if (Intrinsics.d(reasonRefresh, ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh.Login.INSTANCE)) {
                bVar = f.b.Login;
            } else if (Intrinsics.d(reasonRefresh, ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh.Logout.INSTANCE)) {
                bVar = f.b.Logout;
            } else {
                if (!Intrinsics.d(reasonRefresh, ComposerScreenConfig.RefreshByAuthConfig.Enabled.ReasonRefresh.SwitchUser.INSTANCE)) {
                    throw new o();
                }
                bVar = f.b.SwitchUser;
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshPage() {
        InterfaceC7851b controller;
        h.b bVar = this.scrollToTop ? new h.b(new a.C.C0000a(), null, 2) : null;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, bVar, 7);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        List<f.b> mapReasonRefreshToOzonIdAuthEvent = mapReasonRefreshToOzonIdAuthEvent(this.refreshReasons);
        D a11 = K.a(getOwner());
        C10727i.c(a11, C10720e0.a(), null, new RefreshByUserConfigurator$onComposerInitialized$1$1(this, mapReasonRefreshToOzonIdAuthEvent, null), 2);
        C10727i.c(a11, C10720e0.a(), null, new RefreshByUserConfigurator$onComposerInitialized$1$2(this, null), 2);
    }
}
