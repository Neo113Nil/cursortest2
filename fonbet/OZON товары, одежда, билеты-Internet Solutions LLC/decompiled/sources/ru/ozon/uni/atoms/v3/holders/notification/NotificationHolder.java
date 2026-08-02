package ru.ozon.uni.atoms.v3.holders.notification;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfigKt;
import ru.ozon.uni.android.atom.notification.view.NotificationBarConfiguratorKt;
import ru.ozon.uni.android.atom.notification.view.NotificationBarView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/notification/NotificationHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/android/atom/notification/view/NotificationBarView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/notification/view/NotificationBarView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "buttonAction", "Lru/ozon/uni/atoms/af/AtomAction;", "getButtonAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "commonAction", "getCommonAction", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationHolder extends AtomV3<NotificationDTO, NotificationBarView> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationDTO.RightContent.ButtonType.values().length];
            try {
                iArr[NotificationDTO.RightContent.ButtonType.DISCLOSURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationDTO.RightContent.ButtonType.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationHolder(@NotNull NotificationBarView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        NotificationBarView containerView = getContainerView();
        containerView.setOnButtonClickListener(new NotificationHolder$1$1(this));
        containerView.setOnCommonClickListener(new NotificationHolder$1$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AtomAction getButtonAction() {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CommonControlSettings common;
        AtomActionDTO action;
        CommonControlSettings common2;
        NotificationDTO.RightContent rightContent = ((NotificationDTO) getData()).getRightContent();
        NotificationDTO.RightContent.ButtonType buttonType = rightContent != null ? rightContent.getButtonType() : null;
        int i11 = buttonType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()];
        if (i11 == 1) {
            return getCommonAction();
        }
        if (i11 != 2) {
            return null;
        }
        ButtonV3DTO button = rightContent.getButton();
        if (button == null || (common2 = button.getCommon()) == null || (trackingInfo = common2.getTrackingInfo()) == null) {
            trackingInfo = ((NotificationDTO) getData()).getTrackingInfo();
        }
        ButtonV3DTO button2 = rightContent.getButton();
        if (button2 == null || (common = button2.getCommon()) == null || (action = common.getAction()) == null) {
            return null;
        }
        return AtomActionMapperKt.toAtomAction(action, trackingInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AtomAction getCommonAction() {
        AtomActionDTO action;
        CommonControlSettings common = ((NotificationDTO) getData()).getCommon();
        if (common == null || (action = common.getAction()) == null) {
            return null;
        }
        return AtomActionMapperKt.toAtomAction(action, ((NotificationDTO) getData()).getTrackingInfo());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull NotificationDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((NotificationHolder) item);
        NotificationBarConfiguratorKt.configure(getContainerView(), NotificationBarViewConfigKt.fromDto(item));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationHolder(@NotNull Context context, String str) {
        this(new NotificationBarView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
