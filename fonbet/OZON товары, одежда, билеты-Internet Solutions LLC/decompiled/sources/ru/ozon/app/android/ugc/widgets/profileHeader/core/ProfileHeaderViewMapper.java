package ru.ozon.app.android.ugc.widgets.profileHeader.core;

import A00.a;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorBaseKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.app.android.ugc.widgets.profileHeader.data.ProfileHeaderDTO;
import ru.ozon.app.android.ugc.widgets.profileHeader.di.ProfileHeaderComponent;
import ru.ozon.app.android.ugc.widgets.profileHeader.presentation.ProfileHeaderVO;
import ru.ozon.app.android.ugc.widgets.profileHeader.presentation.ProfileHeaderViewHolder;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002/0B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R,\u0010'\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/profileHeader/di/ProfileHeaderComponent;", "Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO;", "Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;)Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/updateKeys/SubscribeAuthorBaseKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderMapper;", "mapper", "Companion", "ProfileHeaderPayload", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileHeaderViewMapper extends WidgetViewMapper2<ProfileHeaderComponent, ProfileHeaderDTO, ProfileHeaderVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int layout = R$layout.widget_profile_header;

    @NotNull
    private final List<Class<? extends SubscribeAuthorBaseKey>> supportedUpdates = C7714v.b0(SubscribeAuthorUpdateKey.class, UnsubscribeAuthorUpdateKey.class);

    @NotNull
    private final Function2<View, ComposerReferences, ProfileHeaderViewHolder> holderProducer = new ProfileHeaderViewMapper$holderProducer$1(this);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$Companion;", "", "<init>", "()V", "PARAM_AUTHOR_ID", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload;", "", "<init>", "()V", "AvatarChanged", "LeftCountChanged", "MiddleCountChanged", "RightCountChanged", "SubscribedStateChanged", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload$AvatarChanged;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload$LeftCountChanged;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload$MiddleCountChanged;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload$RightCountChanged;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload$SubscribedStateChanged;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class ProfileHeaderPayload {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload$AvatarChanged;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AvatarChanged extends ProfileHeaderPayload {

            @NotNull
            public static final AvatarChanged INSTANCE = new AvatarChanged();

            private AvatarChanged() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AvatarChanged);
            }

            public int hashCode() {
                return 1329924653;
            }

            @NotNull
            public String toString() {
                return "AvatarChanged";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload$LeftCountChanged;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LeftCountChanged extends ProfileHeaderPayload {

            @NotNull
            public static final LeftCountChanged INSTANCE = new LeftCountChanged();

            private LeftCountChanged() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LeftCountChanged);
            }

            public int hashCode() {
                return 893567994;
            }

            @NotNull
            public String toString() {
                return "LeftCountChanged";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload$MiddleCountChanged;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MiddleCountChanged extends ProfileHeaderPayload {

            @NotNull
            public static final MiddleCountChanged INSTANCE = new MiddleCountChanged();

            private MiddleCountChanged() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof MiddleCountChanged);
            }

            public int hashCode() {
                return 40363272;
            }

            @NotNull
            public String toString() {
                return "MiddleCountChanged";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload$RightCountChanged;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RightCountChanged extends ProfileHeaderPayload {

            @NotNull
            public static final RightCountChanged INSTANCE = new RightCountChanged();

            private RightCountChanged() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RightCountChanged);
            }

            public int hashCode() {
                return -193563405;
            }

            @NotNull
            public String toString() {
                return "RightCountChanged";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload$SubscribedStateChanged;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderViewMapper$ProfileHeaderPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SubscribedStateChanged extends ProfileHeaderPayload {

            @NotNull
            public static final SubscribedStateChanged INSTANCE = new SubscribedStateChanged();

            private SubscribedStateChanged() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SubscribedStateChanged);
            }

            public int hashCode() {
                return 2100955019;
            }

            @NotNull
            public String toString() {
                return "SubscribedStateChanged";
            }
        }

        public /* synthetic */ ProfileHeaderPayload(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ProfileHeaderPayload() {
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ProfileHeaderViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends SubscribeAuthorBaseKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ProfileHeaderComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ProfileHeaderComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ProfileHeaderMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull ProfileHeaderVO oldItem, @NotNull ProfileHeaderVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (oldItem.getIsSubscribeState() != newItem.getIsSubscribeState() || !Intrinsics.d(oldItem.getSubscribeButton(), newItem.getSubscribeButton()) || !Intrinsics.d(oldItem.getUnsubscribeButton(), newItem.getUnsubscribeButton())) {
            arrayList.add(ProfileHeaderPayload.SubscribedStateChanged.INSTANCE);
        }
        if (!Intrinsics.d(oldItem.getAvatar(), newItem.getAvatar())) {
            arrayList.add(ProfileHeaderPayload.AvatarChanged.INSTANCE);
        }
        if (!Intrinsics.d(oldItem.getLeftCount(), newItem.getLeftCount())) {
            arrayList.add(ProfileHeaderPayload.LeftCountChanged.INSTANCE);
        }
        if (!Intrinsics.d(oldItem.getMiddleCount(), newItem.getMiddleCount())) {
            arrayList.add(ProfileHeaderPayload.MiddleCountChanged.INSTANCE);
        }
        if (!Intrinsics.d(oldItem.getRightCount(), newItem.getRightCount())) {
            arrayList.add(ProfileHeaderPayload.RightCountChanged.INSTANCE);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public ProfileHeaderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ProfileHeaderVO oldItem) {
        ProfileHeaderVO copy;
        ProfileHeaderVO copy2;
        AtomActionDTO action;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof SubscribeAuthorBaseKey)) {
            return oldItem;
        }
        CommonControlSettings common = oldItem.getSubscribeButton().getCommon();
        SubscribeAuthorBaseKey subscribeAuthorBaseKey = (SubscribeAuthorBaseKey) update;
        if (Intrinsics.d((common == null || (action = common.getAction()) == null || (params = action.getParams()) == null) ? null : params.get("authorId"), subscribeAuthorBaseKey.getAuthorId())) {
            if (subscribeAuthorBaseKey instanceof SubscribeAuthorUpdateKey) {
                copy2 = oldItem.copy((r29 & 1) != 0 ? oldItem.id : 0L, (r29 & 2) != 0 ? oldItem.avatar : null, (r29 & 4) != 0 ? oldItem.avatarAction : null, (r29 & 8) != 0 ? oldItem.avatarTokenizedEvent : null, (r29 & 16) != 0 ? oldItem.leftCount : null, (r29 & 32) != 0 ? oldItem.middleCount : null, (r29 & 64) != 0 ? oldItem.rightCount : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.shareButton : null, (r29 & 256) != 0 ? oldItem.settingsButton : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.isSubscribeState : true, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.subscribeButton : null, (r29 & 2048) != 0 ? oldItem.unsubscribeButton : null, (r29 & 4096) != 0 ? oldItem.tokenizedEvent : null);
                return copy2;
            }
            if (subscribeAuthorBaseKey instanceof UnsubscribeAuthorUpdateKey) {
                copy = oldItem.copy((r29 & 1) != 0 ? oldItem.id : 0L, (r29 & 2) != 0 ? oldItem.avatar : null, (r29 & 4) != 0 ? oldItem.avatarAction : null, (r29 & 8) != 0 ? oldItem.avatarTokenizedEvent : null, (r29 & 16) != 0 ? oldItem.leftCount : null, (r29 & 32) != 0 ? oldItem.middleCount : null, (r29 & 64) != 0 ? oldItem.rightCount : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.shareButton : null, (r29 & 256) != 0 ? oldItem.settingsButton : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.isSubscribeState : false, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.subscribeButton : null, (r29 & 2048) != 0 ? oldItem.unsubscribeButton : null, (r29 & 4096) != 0 ? oldItem.tokenizedEvent : null);
                return copy;
            }
        }
        return oldItem;
    }
}
