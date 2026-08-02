package io.intercom.android.sdk.m5.components.avatar;

import androidx.compose.runtime.Composer;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.messaging.Constants;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AvatarIcon.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "isBot", "", "<init>", "(Lio/intercom/android/sdk/models/Avatar;Z)V", "getAvatar", "()Lio/intercom/android/sdk/models/Avatar;", "()Z", "initials", "", "getInitials", "()Ljava/lang/String;", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "getImageUrl", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AvatarWrapper {
    public static final int $stable = 8;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final AvatarWrapper NULL;
    private final Avatar avatar;
    private final String initials;
    private final boolean isBot;
    private final String label;

    public static /* synthetic */ AvatarWrapper copy$default(AvatarWrapper avatarWrapper, Avatar avatar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            avatar = avatarWrapper.avatar;
        }
        if ((i & 2) != 0) {
            z = avatarWrapper.isBot;
        }
        return avatarWrapper.copy(avatar, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Avatar getAvatar() {
        return this.avatar;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBot() {
        return this.isBot;
    }

    public final AvatarWrapper copy(Avatar avatar, boolean isBot) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new AvatarWrapper(avatar, isBot);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarWrapper)) {
            return false;
        }
        AvatarWrapper avatarWrapper = (AvatarWrapper) other;
        return Intrinsics.areEqual(this.avatar, avatarWrapper.avatar) && this.isBot == avatarWrapper.isBot;
    }

    public int hashCode() {
        return (this.avatar.hashCode() * 31) + Boolean.hashCode(this.isBot);
    }

    public String toString() {
        return "AvatarWrapper(avatar=" + this.avatar + ", isBot=" + this.isBot + ')';
    }

    public AvatarWrapper(Avatar avatar, boolean z) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.avatar = avatar;
        this.isBot = z;
        String initials = avatar.getInitials();
        Intrinsics.checkNotNullExpressionValue(initials, "getInitials(...)");
        this.initials = initials;
        String label = avatar.getLabel();
        Intrinsics.checkNotNullExpressionValue(label, "getLabel(...)");
        this.label = label;
    }

    public /* synthetic */ AvatarWrapper(Avatar avatar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(avatar, (i & 2) != 0 ? false : z);
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final boolean isBot() {
        return this.isBot;
    }

    public final String getInitials() {
        return this.initials;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getImageUrl(Composer composer, int i) {
        composer.startReplaceGroup(1575443384);
        String selectUrlForThemeCompose$intercom_sdk_base_release = ThemeUtils.INSTANCE.selectUrlForThemeCompose$intercom_sdk_base_release(this.avatar.getImageUrl(), this.avatar.getImageDarkUrl(), composer, 384);
        if (selectUrlForThemeCompose$intercom_sdk_base_release == null) {
            selectUrlForThemeCompose$intercom_sdk_base_release = "";
        }
        composer.endReplaceGroup();
        return selectUrlForThemeCompose$intercom_sdk_base_release;
    }

    /* compiled from: AvatarIcon.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getNULL", "()Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AvatarWrapper getNULL() {
            return AvatarWrapper.NULL;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        Avatar NULL2 = Avatar.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL2, "NULL");
        NULL = new AvatarWrapper(NULL2, false, 2, defaultConstructorMarker);
    }
}
