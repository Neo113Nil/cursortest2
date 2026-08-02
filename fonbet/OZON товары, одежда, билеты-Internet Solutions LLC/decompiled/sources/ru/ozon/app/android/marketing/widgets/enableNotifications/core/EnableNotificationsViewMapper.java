package ru.ozon.app.android.marketing.widgets.enableNotifications.core;

import A00.a;
import android.view.View;
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
import ru.ozon.app.android.marketing.utils.MarketingNotificationHelper;
import ru.ozon.app.android.marketing.widgets.enableNotifications.data.EnableNotificationsDTO;
import ru.ozon.app.android.marketing.widgets.enableNotifications.di.EnableNotificationsComponent;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsVO;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewHolder;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R,\u0010(\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR0\u0010-\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060*j\u0002`+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/core/EnableNotificationsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/di/EnableNotificationsComponent;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/core/EnableNotificationsViewMapper$UpdateAllowPushState;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "LA00/a$J$a;", "updateConsumer", "Lkotlin/jvm/functions/Function2;", "getUpdateConsumer", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewHolder;", "holderProducer", "getHolderProducer", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "UpdateAllowPushState", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnableNotificationsViewMapper extends WidgetViewMapper2<EnableNotificationsComponent, EnableNotificationsDTO, EnableNotificationsVO> {

    @NotNull
    private final List<Class<UpdateAllowPushState>> supportedUpdates = C7714v.a0(UpdateAllowPushState.class);

    @NotNull
    private final Function2<a.J.InterfaceC0007a, EnableNotificationsVO, EnableNotificationsVO> updateConsumer = EnableNotificationsViewMapper$updateConsumer$1.INSTANCE;
    private final int layout = R$layout.widget_allow_push;

    @NotNull
    private final Function2<View, ComposerReferences, EnableNotificationsViewHolder> holderProducer = new EnableNotificationsViewMapper$holderProducer$1(this);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/core/EnableNotificationsViewMapper$UpdateAllowPushState;", "LA00/a$J$a;", "", "id", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;", "stateToShow", "<init>", "(JLru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;", "getStateToShow", "()Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$StateToShow;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateAllowPushState implements a.J.InterfaceC0007a {
        private final long id;

        @NotNull
        private final EnableNotificationsVO.StateToShow stateToShow;

        public UpdateAllowPushState(long j11, @NotNull EnableNotificationsVO.StateToShow stateToShow) {
            Intrinsics.checkNotNullParameter(stateToShow, "stateToShow");
            this.id = j11;
            this.stateToShow = stateToShow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateAllowPushState)) {
                return false;
            }
            UpdateAllowPushState updateAllowPushState = (UpdateAllowPushState) other;
            return this.id == updateAllowPushState.id && Intrinsics.d(this.stateToShow, updateAllowPushState.stateToShow);
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final EnableNotificationsVO.StateToShow getStateToShow() {
            return this.stateToShow;
        }

        public int hashCode() {
            return this.stateToShow.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateAllowPushState(id=" + this.id + ", stateToShow=" + this.stateToShow + ")";
        }
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        boolean isSystemNotificationsTurnedOn = MarketingNotificationHelper.INSTANCE.isSystemNotificationsTurnedOn(component().getContext());
        EnableNotificationsDTO enableNotificationsDTO = state instanceof EnableNotificationsDTO ? (EnableNotificationsDTO) state : null;
        return !isSystemNotificationsTurnedOn || ((enableNotificationsDTO != null ? enableNotificationsDTO.getApiSettingsState() : null) != null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, EnableNotificationsViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<EnableNotificationsDTO, d, List<EnableNotificationsVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<UpdateAllowPushState>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, EnableNotificationsVO, EnableNotificationsVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<EnableNotificationsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return EnableNotificationsComponent.INSTANCE.create(storage);
    }
}
