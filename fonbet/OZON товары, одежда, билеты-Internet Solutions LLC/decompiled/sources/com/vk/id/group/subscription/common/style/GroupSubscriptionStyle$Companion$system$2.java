package com.vk.id.group.subscription.common.style;

import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class GroupSubscriptionStyle$Companion$system$2 extends C7735q implements InterfaceC6511n<GroupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle, GroupSubscriptionStyle.Light> {
    public static final GroupSubscriptionStyle$Companion$system$2 INSTANCE = new GroupSubscriptionStyle$Companion$system$2();

    GroupSubscriptionStyle$Companion$system$2() {
        super(3, GroupSubscriptionStyle.Light.class, "<init>", "<init>(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public final GroupSubscriptionStyle.Light invoke(GroupSubscriptionSheetCornersStyle p02, GroupSubscriptionButtonsCornersStyle p12, GroupSubscriptionButtonsSizeStyle p22) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        return new GroupSubscriptionStyle.Light(p02, p12, p22);
    }
}
