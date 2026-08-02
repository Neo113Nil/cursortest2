package ru.ozon.app.android.favorites.deeplink;

import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.accesscontrol.AccessControlConfigurator;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "deeplink", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ListAccessControlDeeplinkHandler$getDestination$1 extends AbstractC7737t implements Function2<String, Boolean, ComposerScreenConfig> {
    public static final ListAccessControlDeeplinkHandler$getDestination$1 INSTANCE = new ListAccessControlDeeplinkHandler$getDestination$1();

    ListAccessControlDeeplinkHandler$getDestination$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ ComposerScreenConfig invoke(String str, Boolean bool) {
        return invoke(str, bool.booleanValue());
    }

    public final ComposerScreenConfig invoke(String deeplink, boolean z11) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new ComposerScreenConfig(new h.c.a(deeplink, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, e0.h(AccessControlConfigurator.class), null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, false, false, null, null, 16740350, null);
    }
}
