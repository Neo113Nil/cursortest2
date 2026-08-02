package ru.ozon.app.android.storefront.widgets.cms.navtitle;

import android.content.Context;
import androidx.core.content.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavTitleMapper implements Function2<NavTitleDTO, d, List<? extends NavTitleVO>> {

    @NotNull
    private final Context context;

    public NavTitleMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NavTitleVO> invoke(@NotNull NavTitleDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        a.getColor(this.context, R$color.oz_semantic_text_primary);
        long j11 = -2147144939;
        NavTitleAlign align = dto.getAlign();
        NavTitleAlign navTitleAlign = NavTitleAlign.LEFT;
        return C7714v.a0(align == navTitleAlign ? new NavTitleOtherVO(j11, dto.getTitle(), dto.getSubtitle(), dto.getTitleColor(), dto.getSubtitleColor(), navTitleAlign) : new NavTitleCenterVO(j11, dto.getTitle(), dto.getSubtitle(), dto.getTitleColor(), dto.getSubtitleColor(), NavTitleAlign.CENTER));
    }
}
