package ru.ozon.app.android.storefront.stories.playstoriesv3.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import i10.l;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3Configurator;
import ru.ozon.uni.R$anim;
import ru.ozon.uni.core.R$color;
import sZ.c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/deeplink/StoryV3DeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoryV3DeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "story_redesign");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        Set h11 = e0.h(PlayStoriesV3Configurator.class);
        String str = null;
        h.c.a aVar = new h.c.a(a11, str, str, 14);
        int i11 = R$color.bg_dark_key;
        return new ComposerFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, h11, null, Integer.valueOf(i11), null, false, new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, null, 3)), null, null, false, false, null, null, 16623548, null), a11, null, false, false, null, false, false, new c.b(R$anim.mtrl_bottom_sheet_slide_in, 0, R$anim.mtrl_bottom_sheet_slide_out, 6, 0), 252, null);
    }
}
