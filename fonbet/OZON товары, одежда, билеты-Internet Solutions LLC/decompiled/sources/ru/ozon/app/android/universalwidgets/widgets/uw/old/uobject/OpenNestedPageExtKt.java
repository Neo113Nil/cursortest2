package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject;

import G.g;
import Sc.o;
import android.net.Uri;
import i10.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0006¨\u0006\u000b"}, d2 = {"navigate", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/UWDeeplink;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "widgetSource", "", "properties", "", "", "toUWDeeplink", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OpenNestedPageExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UWDeeplink.Behaviour.values().length];
            try {
                iArr[UWDeeplink.Behaviour.COMPOSER_NESTED_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UWDeeplink.Behaviour.REDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UWDeeplink.Behaviour.DISMISS_AND_REDIRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void navigate(@NotNull UWDeeplink uWDeeplink, @NotNull ComposerReferences ref, @NotNull String widgetSource, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(uWDeeplink, "<this>");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(widgetSource, "widgetSource");
        Intrinsics.checkNotNullParameter(properties, "properties");
        int i11 = WhenMappings.$EnumSwitchMapping$0[uWDeeplink.getBehaviour().ordinal()];
        int i12 = 2;
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new o();
            }
            ref.getNavigator().openDeeplink(uWDeeplink.getLink(), properties);
            return;
        }
        ComposerNavigator.DefaultImpls.openBottomSheet$default(ref.getNavigator(), g.c(widgetSource, ProductContainerDTO.RATIO_DELIMITER, uWDeeplink.getLink()), new ComposerScreenConfig(new h.c.a(uWDeeplink.getLink(), (String) null, (String) (0 == true ? 1 : 0), 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, null, null, 61, null), 0, i12, 0 == true ? 1 : 0), false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777212, null), null, null, null, 28, null);
    }

    public static /* synthetic */ void navigate$default(UWDeeplink uWDeeplink, ComposerReferences composerReferences, String str, Map map, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            map = U.c();
        }
        navigate(uWDeeplink, composerReferences, str, map);
    }

    public static final UWDeeplink toUWDeeplink(String str) {
        if (str == null) {
            return null;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("behavior");
        return new UWDeeplink(str, Intrinsics.d(queryParameter, "composerNestedPage") ? UWDeeplink.Behaviour.COMPOSER_NESTED_PAGE : Intrinsics.d(queryParameter, "dismissAndRedirect") ? UWDeeplink.Behaviour.DISMISS_AND_REDIRECT : UWDeeplink.Behaviour.REDIRECT);
    }
}
