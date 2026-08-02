package ru.ozon.app.android.marketing.widgets.notificationssettings.core.selector;

import android.view.View;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetNotificationsSettingsSelectorBinding;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModel;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModelImpl;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorBinder;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NotificationsSettingsSelectorViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, NotificationsSettingsSelectorViewHolder> {
    final /* synthetic */ NotificationsSettingsSelectorViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsSettingsSelectorViewMapper$holderProducer$1(NotificationsSettingsSelectorViewMapper notificationsSettingsSelectorViewMapper) {
        super(2);
        this.this$0 = notificationsSettingsSelectorViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final NotificationsSettingsSelectorViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetNotificationsSettingsSelectorBinding bind = WidgetNotificationsSettingsSelectorBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        NotificationsSettingsSelectorViewHolder notificationsSettingsSelectorViewHolder = new NotificationsSettingsSelectorViewHolder(bind, refs);
        final NotificationsSettingsSelectorViewMapper notificationsSettingsSelectorViewMapper = this.this$0;
        NotificationsSettingsCellViewModel notificationsSettingsCellViewModel = (NotificationsSettingsCellViewModel) new z0(refs.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.notificationssettings.core.selector.NotificationsSettingsSelectorViewMapper$holderProducer$1$invoke$lambda$1$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new NotificationsSettingsCellViewModelImpl(NotificationsSettingsSelectorViewMapper.this.component().getNotificationsSettingsApi());
            }
        }).a(NotificationsSettingsCellViewModelImpl.class);
        J viewLifecycleOwner = refs.getContainer().j().getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        new NotificationsSettingsSelectorBinder(notificationsSettingsSelectorViewHolder, notificationsSettingsCellViewModel, viewLifecycleOwner);
        return notificationsSettingsSelectorViewHolder;
    }
}
