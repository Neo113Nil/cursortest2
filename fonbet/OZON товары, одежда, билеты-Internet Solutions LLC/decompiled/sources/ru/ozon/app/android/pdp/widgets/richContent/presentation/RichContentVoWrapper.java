package ru.ozon.app.android.pdp.widgets.richContent.presentation;

import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVoWrapper;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "getPosition", "()I", "position", "", "isExpanded", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RichContentVoWrapper extends TabEmbeddedViewObject, c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Integer getScrollWidgetKey(@NotNull RichContentVoWrapper richContentVoWrapper) {
            return TabEmbeddedViewObject.DefaultImpls.getScrollWidgetKey(richContentVoWrapper);
        }

        public static int getViewItemKey(@NotNull RichContentVoWrapper richContentVoWrapper) {
            return TabEmbeddedViewObject.DefaultImpls.getViewItemKey(richContentVoWrapper);
        }
    }

    int getPosition();

    boolean isExpanded();
}
