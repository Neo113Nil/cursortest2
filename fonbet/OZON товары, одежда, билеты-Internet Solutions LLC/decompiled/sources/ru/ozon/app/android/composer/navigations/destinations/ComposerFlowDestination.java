package ru.ozon.app.android.composer.navigations.destinations;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.C9010b;
import qZ.C9011c;
import qZ.InterfaceC9014f;
import rZ.C9237b;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.FlowTag;
import sZ.c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/navigations/destinations/ComposerFlowDestination;", "LrZ/b;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "Lru/ozon/app/android/composer/navigations/destinations/ComposerScreenContainer;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "", "deeplink", "", "requestCode", "LqZ/b;", "flowConfig", "", "addFragmentToBackStack", "<init>", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Ljava/lang/String;Ljava/lang/Integer;LqZ/b;Z)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposerFlowDestination extends C9237b<ComposerFragment> implements ComposerScreenContainer {

    @NotNull
    private final ComposerScreenConfig screenConfig;

    public /* synthetic */ ComposerFlowDestination(ComposerScreenConfig composerScreenConfig, String str, Integer num, C9010b c9010b, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerScreenConfig, str, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? new C9010b(null, 15) : c9010b, (i11 & 16) != 0 ? true : z11);
    }

    @Override // ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer
    @NotNull
    public ComposerScreenConfig getScreenConfig() {
        return this.screenConfig;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ComposerFlowDestination(@NotNull ComposerScreenConfig screenConfig, @NotNull String deeplink, Integer num, @NotNull C9010b flowConfig, boolean z11) {
        super(num, r13, r14, new ComposerFragmentDestination(screenConfig, deeplink, null, false, z11, null, !Intrinsics.d(r1, r5.getABSENT()), !Intrinsics.d(flowConfig.a(), r5.getABSENT()), null, 300, null));
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        InterfaceC9014f a11 = flowConfig.a();
        String name = flowConfig.a().getName();
        C9011c.INSTANCE.getClass();
        c cVar = new c(name, C9011c.Companion.a(flowConfig), null, false, false, null, false, false, false, 508, null);
        InterfaceC9014f a12 = flowConfig.a();
        FlowTag.Companion companion = FlowTag.INSTANCE;
        this.screenConfig = screenConfig;
    }
}
