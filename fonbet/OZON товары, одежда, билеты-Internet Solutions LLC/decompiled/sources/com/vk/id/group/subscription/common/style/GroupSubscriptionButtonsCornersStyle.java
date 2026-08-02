package com.vk.id.group.subscription.common.style;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0003\n\u000b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "", "", "radiusDp", "<init>", "(F)V", "F", "getRadiusDp", "()F", "Companion", "Default", "Custom", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle$Custom;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle$Default;", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class GroupSubscriptionButtonsCornersStyle {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final float radiusDp;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle$Companion;", "", "<init>", "()V", "ROUNDED_RADIUS_DP", "", "NONE_RADIUS_DP", "ROUND_RADIUS_DP", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle$Custom;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "radiusDp", "", "<init>", "(F)V", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Custom extends GroupSubscriptionButtonsCornersStyle {
        public Custom(float f7) {
            super(f7, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle$Default;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "<init>", "()V", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default extends GroupSubscriptionButtonsCornersStyle {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
            super(8.0f, null);
        }
    }

    public /* synthetic */ GroupSubscriptionButtonsCornersStyle(float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7);
    }

    public final float getRadiusDp() {
        return this.radiusDp;
    }

    private GroupSubscriptionButtonsCornersStyle(float f7) {
        this.radiusDp = f7;
    }
}
