package ru.ozon.app.android.cml.delivery.actionHandler.cellList.base;

import A00.a;
import Sc.o;
import Tg.b;
import Vg.f;
import a00.C4911f;
import androidx.lifecycle.K;
import java.util.List;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cml.delivery.R$string;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys.ButtonLoaderUpdateKey;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys.ButtonsUpdateKey;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys.CellListUpdateKey;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0015\u001a\u00020\r2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010#\u001a\u00020 8 X \u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/BaseToggleCellListActionHandler;", "LVg/f;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/ToggleCellListResponse;", "response", "", "itemId", "", "handleSuccess", "(Ll10/b;Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/ToggleCellListResponse;J)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "", "buttonId", "handleFailure", "(La00/f;Ll10/b;Ljava/lang/String;)V", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/AddStrategy;", "getAddStrategy$delivery_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/AddStrategy;", "addStrategy", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseToggleCellListActionHandler extends f {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/BaseToggleCellListActionHandler$Companion;", "", "<init>", "()V", "DEFAULT_ERROR", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddStrategy.values().length];
            try {
                iArr[AddStrategy.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddStrategy.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseToggleCellListActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFailure(C4911f container, InterfaceC7851b controller, String buttonId) {
        controller.update(new ButtonLoaderUpdateKey(buttonId, false));
        RestrictionsUtilsKt.showNotification$default(container, StringProvider.getString(R$string.delivery_parcel_photo_delete_error_title), NotificationDTO.Preset.NEGATIVE, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccess(InterfaceC7851b controller, ToggleCellListResponse response, long itemId) {
        a.J.InterfaceC0007a append;
        int i11 = WhenMappings.$EnumSwitchMapping$0[getAddStrategy().ordinal()];
        if (i11 == 1) {
            append = new CellListUpdateKey.Append(itemId, response.getCells());
        } else {
            if (i11 != 2) {
                throw new o();
            }
            append = new CellListUpdateKey.Replace(itemId, response.getCells());
        }
        controller.update(append);
        List<ButtonV3DTO> buttons = response.getButtons();
        if (buttons != null) {
            controller.update(new ButtonsUpdateKey(itemId, buttons));
        }
    }

    @NotNull
    /* renamed from: getAddStrategy$delivery_prodGoogleAllVendorsRelease */
    public abstract AddStrategy getAddStrategy();

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if (action instanceof AtomAction.ComposerAction) {
            C4911f a11 = widgetInfo.a();
            C10727i.c(K.a(a11.g()), null, null, new BaseToggleCellListActionHandler$processWidgetAction$1(action, ((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerController(), this, widgetInfo, widgetInfo.c().d().getId(), a11, null), 3);
        }
    }
}
