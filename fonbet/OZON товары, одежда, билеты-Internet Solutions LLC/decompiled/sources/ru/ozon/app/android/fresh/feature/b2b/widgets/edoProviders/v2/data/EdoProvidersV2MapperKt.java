package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.data.EdoProvidersV2DTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.domain.EdoProvidersV2VO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\t\u001a\u0013\u0010\u0005\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u0005\u0010\f\u001a\u0013\u0010\u0005\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u0005\u0010\u000f\u001a\u0013\u0010\u0005\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0005\u0010\u0012\u001a\u0013\u0010\u0005\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0005\u0010\u0015\u001a\u0013\u0010\u0005\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0005\u0010\u0018\u001a\u0013\u0010\u0005\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO;", "toVO", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO;Ll20/d;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Header;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Header;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Header;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Header;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Providers;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Providers;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Providers;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Providers;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Provider;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Provider;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Provider;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Provider;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$CustomCell;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$CustomCell;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$CustomCell;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$CustomCell;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Settings;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Settings;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Settings;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Settings;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$EmptyState;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$EmptyState;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$EmptyState;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$EmptyState;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Footer;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Footer;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Footer;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Footer;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EdoProvidersV2MapperKt {
    @NotNull
    public static final EdoProvidersV2VO toVO(@NotNull EdoProvidersV2DTO edoProvidersV2DTO, @NotNull d widgetInfo) {
        EdoProvidersV2DTO.EmptyState emptyState;
        EdoProvidersV2DTO.Providers providers;
        Intrinsics.checkNotNullParameter(edoProvidersV2DTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        EdoProvidersV2DTO.Header header = edoProvidersV2DTO.getHeader();
        EdoProvidersV2VO.Header vo = header != null ? toVO(header) : null;
        EdoProvidersV2DTO.Body body = edoProvidersV2DTO.getBody();
        EdoProvidersV2VO.Providers vo2 = (body == null || (providers = body.getProviders()) == null) ? null : toVO(providers);
        EdoProvidersV2DTO.Body body2 = edoProvidersV2DTO.getBody();
        EdoProvidersV2VO.Body body3 = new EdoProvidersV2VO.Body(vo2, (body2 == null || (emptyState = body2.getEmptyState()) == null) ? null : toVO(emptyState));
        EdoProvidersV2DTO.Footer footer = edoProvidersV2DTO.getFooter();
        return new EdoProvidersV2VO(hashCode, vo, body3, footer != null ? toVO(footer) : null);
    }

    private static final EdoProvidersV2VO.Header toVO(EdoProvidersV2DTO.Header header) {
        return new EdoProvidersV2VO.Header(header.getTitle(), header.getIconButton(), header.getDisclaimer());
    }

    private static final EdoProvidersV2VO.Providers toVO(EdoProvidersV2DTO.Providers providers) {
        List<EdoProvidersV2DTO.Provider> items = providers.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((EdoProvidersV2DTO.Provider) it.next()));
        }
        return new EdoProvidersV2VO.Providers(arrayList, providers.getMaxProviders(), providers.getMoreProviders(), providers.getCornerRadius());
    }

    private static final EdoProvidersV2VO.Provider toVO(EdoProvidersV2DTO.Provider provider) {
        CellDTO cell = provider.getCell();
        EdoProvidersV2DTO.CustomCell customCell = provider.getCustomCell();
        return new EdoProvidersV2VO.Provider(cell, customCell != null ? toVO(customCell) : null);
    }

    private static final EdoProvidersV2VO.CustomCell toVO(EdoProvidersV2DTO.CustomCell customCell) {
        TextDTO title = customCell.getTitle();
        TextDTO subtitle = customCell.getSubtitle();
        IconButtonV3DTO iconButton = customCell.getIconButton();
        List<BadgeDTO> badgeList = customCell.getBadgeList();
        EdoProvidersV2DTO.Settings settings = customCell.getSettings();
        return new EdoProvidersV2VO.CustomCell(title, subtitle, iconButton, badgeList, settings != null ? toVO(settings) : null);
    }

    private static final EdoProvidersV2VO.Settings toVO(EdoProvidersV2DTO.Settings settings) {
        Paddings topPadding = settings.getTopPadding();
        Paddings bottomPadding = settings.getBottomPadding();
        Paddings leftPadding = settings.getLeftPadding();
        Paddings rightPadding = settings.getRightPadding();
        Paddings titleSpaceBetween = settings.getTitleSpaceBetween();
        String backgroundColor = settings.getBackgroundColor();
        Boolean hideSeparator = settings.getHideSeparator();
        return new EdoProvidersV2VO.Settings(topPadding, bottomPadding, leftPadding, rightPadding, titleSpaceBetween, backgroundColor, hideSeparator != null ? hideSeparator.booleanValue() : false);
    }

    private static final EdoProvidersV2VO.EmptyState toVO(EdoProvidersV2DTO.EmptyState emptyState) {
        return new EdoProvidersV2VO.EmptyState(emptyState.getImageAtom(), emptyState.getTitle(), emptyState.getMessage());
    }

    private static final EdoProvidersV2VO.Footer toVO(EdoProvidersV2DTO.Footer footer) {
        return new EdoProvidersV2VO.Footer(footer.getButtons());
    }
}
