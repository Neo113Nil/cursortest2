package ru.ozon.app.android.search.catalog.components.meta;

import G.g;
import android.text.Spanned;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0013B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/catalog/components/meta/MetaDO;", "Ll20/d;", "", "Lru/ozon/app/android/search/catalog/components/meta/MetaVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Landroid/text/Spanned;", "description", "", "isLessThanLimit", "(Landroid/text/Spanned;)Z", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/catalog/components/meta/MetaDO;Ll20/d;)Ljava/util/List;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetaWidgetMapper implements Function2<MetaDO, d, List<? extends MetaVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetMapper$Companion;", "", "<init>", "()V", "MAX_CHARS_SHORT_DESC", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean isLessThanLimit(Spanned description) {
        return description.length() <= 140;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MetaVO> invoke(@NotNull MetaDO state, @NotNull d widgetInfo) {
        String str;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long id2 = state.getId();
        String name = state.getName();
        String image = state.getImage();
        OzonSpannableString description = state.getDescription();
        DesignType designType = Intrinsics.d(state.getDesignType(), "portrait") ? DesignType.PORTRAIT : DesignType.LANDSCAPE;
        boolean z11 = state.getDescription() != null ? !isLessThanLimit(r13) : false;
        ShareData shareData = state.getShareData();
        if (shareData != null) {
            String text = shareData.getText();
            String link = shareData.getLink();
            if (link == null) {
                link = "";
            }
            String c11 = g.c(text, " ", link);
            if (c11 != null) {
                str = c11;
                return C7714v.a0(new MetaVO(id2, name, image, description, designType, z11, state.getFavoriteEntityButton(), str));
            }
        }
        str = "";
        return C7714v.a0(new MetaVO(id2, name, image, description, designType, z11, state.getFavoriteEntityButton(), str));
    }
}
