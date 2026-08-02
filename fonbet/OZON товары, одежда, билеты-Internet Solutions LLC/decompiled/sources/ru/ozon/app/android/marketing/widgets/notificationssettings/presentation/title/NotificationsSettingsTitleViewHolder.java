package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.title;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.databinding.WidgetNotificationsSettingsTitleBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/title/NotificationsSettingsTitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/title/NotificationsSettingsTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/marketing/databinding/WidgetNotificationsSettingsTitleBinding;", "binding", "<init>", "(Lru/ozon/app/android/marketing/databinding/WidgetNotificationsSettingsTitleBinding;)V", "item", "", "bindTitle", "(Lru/ozon/app/android/marketing/databinding/WidgetNotificationsSettingsTitleBinding;Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/title/NotificationsSettingsTitleVO;)V", "bindSubtitle", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/title/NotificationsSettingsTitleVO;Ll20/d;)V", "Lru/ozon/app/android/marketing/databinding/WidgetNotificationsSettingsTitleBinding;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsTitleViewHolder extends k<NotificationsSettingsTitleVO> {

    @NotNull
    private final WidgetNotificationsSettingsTitleBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NotificationsSettingsTitleViewHolder(@NotNull WidgetNotificationsSettingsTitleBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    private final void bindSubtitle(WidgetNotificationsSettingsTitleBinding widgetNotificationsSettingsTitleBinding, NotificationsSettingsTitleVO notificationsSettingsTitleVO) {
        String subtitle = notificationsSettingsTitleVO.getSubtitle();
        if (subtitle == null) {
            TextView subtitleTv = widgetNotificationsSettingsTitleBinding.subtitleTv;
            Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
            ViewExtKt.gone(subtitleTv);
        } else {
            widgetNotificationsSettingsTitleBinding.subtitleTv.setText(subtitle);
            TextView subtitleTv2 = widgetNotificationsSettingsTitleBinding.subtitleTv;
            Intrinsics.checkNotNullExpressionValue(subtitleTv2, "subtitleTv");
            ViewExtKt.show(subtitleTv2);
        }
    }

    private final void bindTitle(WidgetNotificationsSettingsTitleBinding widgetNotificationsSettingsTitleBinding, NotificationsSettingsTitleVO notificationsSettingsTitleVO) {
        widgetNotificationsSettingsTitleBinding.titleTv.setText(notificationsSettingsTitleVO.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NotificationsSettingsTitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetNotificationsSettingsTitleBinding widgetNotificationsSettingsTitleBinding = this.binding;
        bindTitle(widgetNotificationsSettingsTitleBinding, item);
        bindSubtitle(widgetNotificationsSettingsTitleBinding, item);
    }
}
