package ru.ozon.app.android.commonwidgets.widgets.restrictions.core;

import Sc.o;
import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.RestrictionsDTO;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.presentation.RestrictionsVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/core/RestrictionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$RestrictionVO;", "widget", "Lru/ozon/uni/android/flashbar/model/Restriction;", "mapToRestriction", "(Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$RestrictionVO;)Lru/ozon/uni/android/flashbar/model/Restriction;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RestrictionsMapper implements Function2<RestrictionsDTO, d, List<? extends RestrictionsVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestrictionsDTO.ShowOnceStrategy.Lifetime.values().length];
            try {
                iArr[RestrictionsDTO.ShowOnceStrategy.Lifetime.PER_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictionsDTO.ShowOnceStrategy.Lifetime.PER_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final Restriction mapToRestriction(@NotNull RestrictionsVO.RestrictionVO widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        return new Restriction(widget.getTitle(), widget.getMessage(), widget.getImage(), widget.getImageTintColor(), widget.getType(), widget.getLifetime(), widget.getActionButton(), widget.getAction(), widget.getContext(), widget.getProgress(), null, null, 3072, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RestrictionsVO> invoke(@NotNull RestrictionsDTO dto, @NotNull d widgetInfo) {
        RestrictionsVO.ShowOnceStrategy showOnceStrategy;
        RestrictionsVO.ShowOnceStrategy.Lifetime lifetime;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<RestrictionsDTO.WidgetRestrictionDTO> restrictions = dto.getRestrictions();
        ArrayList arrayList = new ArrayList(C7714v.z(restrictions, 10));
        Iterator<T> it = restrictions.iterator();
        while (true) {
            showOnceStrategy = null;
            t tVar = null;
            if (!it.hasNext()) {
                break;
            }
            RestrictionsDTO.WidgetRestrictionDTO widgetRestrictionDTO = (RestrictionsDTO.WidgetRestrictionDTO) it.next();
            String title = widgetRestrictionDTO.getTitle();
            String message = widgetRestrictionDTO.getMessage();
            String image = widgetRestrictionDTO.getImage();
            String imageTintColor = widgetRestrictionDTO.getImageTintColor();
            String type = widgetRestrictionDTO.getType();
            String lifetime2 = widgetRestrictionDTO.getLifetime();
            Restriction.Action action = widgetRestrictionDTO.getAction();
            String context = widgetRestrictionDTO.getContext();
            Restriction.Progress progress = widgetRestrictionDTO.getProgress();
            Map<String, TokenizedTrackingInfo> trackingInfo = widgetRestrictionDTO.getTrackingInfo();
            if (trackingInfo != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            }
            arrayList.add(new RestrictionsVO.RestrictionVO(title, message, image, imageTintColor, type, lifetime2, null, action, context, progress, tVar, 64, null));
        }
        RestrictionsDTO.ShowOnceStrategy showOnceStrategy2 = dto.getShowOnceStrategy();
        if (showOnceStrategy2 != null) {
            String token = showOnceStrategy2.getToken();
            int i11 = WhenMappings.$EnumSwitchMapping$0[showOnceStrategy2.getLifetime().ordinal()];
            if (i11 == 1) {
                lifetime = RestrictionsVO.ShowOnceStrategy.Lifetime.PER_APP;
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                lifetime = RestrictionsVO.ShowOnceStrategy.Lifetime.PER_SCREEN;
            }
            showOnceStrategy = new RestrictionsVO.ShowOnceStrategy(token, (RestrictionsVO.ShowOnceStrategy.Lifetime) WhenExtKt.getExhaustive(lifetime));
        }
        return C7714v.a0(new RestrictionsVO(hashCode, arrayList, showOnceStrategy));
    }
}
