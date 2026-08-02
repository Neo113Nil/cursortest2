package ru.ozon.app.android.marketing.widgets.notificationssettings.core.selector;

import A00.a;
import C.C2702w;
import P4.f;
import android.content.Context;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsSelectorDTO;
import ru.ozon.app.android.marketing.widgets.notificationssettings.di.NotificationSettingsComponent;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorDecoration;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorVO;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorViewHolder;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00013B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R.\u0010-\u001a\u0016\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R0\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060/j\u0002`0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010%¨\u00064"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/core/selector/NotificationsSettingsSelectorViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/di/NotificationSettingsComponent;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/core/selector/NotificationsSettingsSelectorViewMapper$SelectorItemUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "LA00/a$J$a;", "updateConsumer", "getUpdateConsumer", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "SelectorItemUpdate", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationsSettingsSelectorViewMapper extends WidgetViewMapper2<NotificationSettingsComponent, NotificationsSettingsSelectorDTO, NotificationsSettingsSelectorVO> {
    private final int layout = R$layout.widget_notifications_settings_selector;

    @NotNull
    private final Function2<View, ComposerReferences, NotificationsSettingsSelectorViewHolder> holderProducer = new NotificationsSettingsSelectorViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<SelectorItemUpdate>> supportedUpdates = C7714v.a0(SelectorItemUpdate.class);

    @NotNull
    private final Function2<a.J.InterfaceC0007a, NotificationsSettingsSelectorVO, NotificationsSettingsSelectorVO> updateConsumer = NotificationsSettingsSelectorViewMapper$updateConsumer$1.INSTANCE;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/core/selector/NotificationsSettingsSelectorViewMapper$SelectorItemUpdate;", "LA00/a$J$a;", "", "id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getValue", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectorItemUpdate implements a.J.InterfaceC0007a {
        private final long id;
        private final long value;

        public SelectorItemUpdate(long j11, long j12) {
            this.id = j11;
            this.value = j12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectorItemUpdate)) {
                return false;
            }
            SelectorItemUpdate selectorItemUpdate = (SelectorItemUpdate) other;
            return this.id == selectorItemUpdate.id && this.value == selectorItemUpdate.value;
        }

        public final long getId() {
            return this.id;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return Long.hashCode(this.value) + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return f.a(this.value, ")", C2702w.d(this.id, "SelectorItemUpdate(id=", ", value="));
        }
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<NotificationsSettingsSelectorDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new NotificationsSettingsSelectorDecoration());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, NotificationsSettingsSelectorViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<NotificationsSettingsSelectorDTO, d, List<NotificationsSettingsSelectorVO>> getMapper() {
        return component().getSelectorMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<SelectorItemUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, NotificationsSettingsSelectorVO, NotificationsSettingsSelectorVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<NotificationSettingsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return NotificationSettingsComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull NotificationsSettingsSelectorVO oldItem, @NotNull NotificationsSettingsSelectorVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Boolean.valueOf(oldItem.getId() == newItem.getId());
    }
}
