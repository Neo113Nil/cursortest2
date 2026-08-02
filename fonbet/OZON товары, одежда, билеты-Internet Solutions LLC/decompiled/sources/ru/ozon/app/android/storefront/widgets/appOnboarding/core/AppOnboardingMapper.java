package ru.ozon.app.android.storefront.widgets.appOnboarding.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.appOnboarding.data.AppOnboardingDTO;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/core/AppOnboardingMapper;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;", "state", "Ll20/d;", "info", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;", "invoke", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;Ll20/d;)Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;", "Landroid/content/Context;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppOnboardingMapper {

    @NotNull
    private final Context context;

    public AppOnboardingMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final AppOnboardingVI invoke(@NotNull AppOnboardingDTO state, @NotNull d info) {
        AppOnboardingVI.Content.UnderImage underImage;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        AppOnboardingVI.Header header = new AppOnboardingVI.Header(state.getLogoImage().getTop(), new AppOnboardingVI.Header.SkipTitle(state.getSkipButton().getTitle(), state.getSkipButton().getAction(), state.getSkipButton().getTrackingInfo()));
        if (state.getShapeImage() != null) {
            String shapeImage = state.getShapeImage();
            List<AppOnboardingDTO.PageItem> pages = state.getPages();
            ArrayList arrayList = new ArrayList(C7714v.z(pages, 10));
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                AppOnboardingDTO.PageItem.Gradient gradient = ((AppOnboardingDTO.PageItem) it.next()).getGradient();
                StyleParser styleParser = StyleParser.INSTANCE;
                Integer parseColor = styleParser.parseColor(this.context, gradient != null ? gradient.getStartColor() : null);
                int intValue = parseColor != null ? parseColor.intValue() : UniColors.CLEAR_LIGHT_KEY_0.getResId();
                Integer parseColor2 = styleParser.parseColor(this.context, gradient != null ? gradient.getEndColor() : null);
                arrayList.add(C7714v.b0(C7807Z.m(C7811b0.b(intValue)), C7807Z.m(C7811b0.b(parseColor2 != null ? parseColor2.intValue() : UniColors.CLEAR_LIGHT_KEY_0.getResId()))));
            }
            underImage = new AppOnboardingVI.Content.UnderImage(shapeImage, arrayList);
        } else {
            underImage = null;
        }
        List<AppOnboardingDTO.PageItem> pages2 = state.getPages();
        ArrayList arrayList2 = new ArrayList(C7714v.z(pages2, 10));
        for (AppOnboardingDTO.PageItem pageItem : pages2) {
            String image = pageItem.getImage();
            TextDTO title = pageItem.getTitle();
            TextDTO subtitle = pageItem.getSubtitle();
            Map<String, TokenizedTrackingInfo> trackingInfo = pageItem.getTrackingInfo();
            arrayList2.add(new AppOnboardingVI.Content.Page(image, title, subtitle, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
        }
        AppOnboardingVI.Content content = new AppOnboardingVI.Content(underImage, arrayList2);
        AppOnboardingDTO.PageControls pageControls = state.getPageControls();
        List<AppOnboardingDTO.PageItem> pages3 = state.getPages();
        ArrayList arrayList3 = new ArrayList(C7714v.z(pages3, 10));
        Iterator<T> it2 = pages3.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AppOnboardingDTO.PageItem) it2.next()).getActionButton());
        }
        return new AppOnboardingVI(hashCode, header, content, new AppOnboardingVI.Footer(pageControls, arrayList3, state.getLogoImage().getBottom()));
    }
}
