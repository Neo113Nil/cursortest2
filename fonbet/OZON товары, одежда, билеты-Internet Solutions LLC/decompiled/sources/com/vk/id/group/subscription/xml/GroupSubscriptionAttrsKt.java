package com.vk.id.group.subscription.xml;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.vk.id.group.subscription.common.style.GroupSubscriptionButtonsCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionButtonsSizeStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionSheetCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.xml.GroupSubscriptionAttrsKt;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a3\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0014\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/content/res/TypedArray;", "", "vkidInternalGetGroupId", "(Landroid/content/res/TypedArray;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Lkotlin/Function3;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "vkidInternalGetGroupSubscriptionStyleConstructor", "(Landroid/content/res/TypedArray;Landroid/content/Context;)Lfd/n;", "", "vkidInternalGetGroupSubscriptionCornerRadius", "(Landroid/content/res/TypedArray;Landroid/content/Context;)F", "vkidInternalGetGroupSubscriptionButtonCornerRadius", "vkidInternalGetGroupSubscriptionButtonSize", "(Landroid/content/res/TypedArray;)Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "dp", "dpToPixels", "(Landroid/content/Context;F)F", "group-subscription-xml_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GroupSubscriptionAttrsKt {
    private static final float dpToPixels(Context context, float f7) {
        return TypedValue.applyDimension(1, f7, context.getResources().getDisplayMetrics());
    }

    public static final String vkidInternalGetGroupId(@NotNull TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        return typedArray.getString(R$styleable.vkid_GroupSubscription_vkid_groupId);
    }

    public static final float vkidInternalGetGroupSubscriptionButtonCornerRadius(@NotNull TypedArray typedArray, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return typedArray.getDimension(R$styleable.vkid_GroupSubscription_vkid_groupSubscriptionButtonCorners, dpToPixels(context, GroupSubscriptionButtonsCornersStyle.Default.INSTANCE.getRadiusDp()));
    }

    @NotNull
    public static final GroupSubscriptionButtonsSizeStyle vkidInternalGetGroupSubscriptionButtonSize(@NotNull TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        switch (typedArray.getInt(R$styleable.vkid_GroupSubscription_vkid_groupSubscriptionButtonSize, 0)) {
            case 1:
                return GroupSubscriptionButtonsSizeStyle.SMALL_32;
            case 2:
                return GroupSubscriptionButtonsSizeStyle.SMALL_34;
            case 3:
                return GroupSubscriptionButtonsSizeStyle.SMALL_36;
            case 4:
                return GroupSubscriptionButtonsSizeStyle.SMALL_38;
            case 5:
                return GroupSubscriptionButtonsSizeStyle.MEDIUM_40;
            case 6:
                return GroupSubscriptionButtonsSizeStyle.MEDIUM_42;
            case 7:
                return GroupSubscriptionButtonsSizeStyle.MEDIUM_44;
            case 8:
                return GroupSubscriptionButtonsSizeStyle.MEDIUM_46;
            case 9:
                return GroupSubscriptionButtonsSizeStyle.LARGE_48;
            case 10:
                return GroupSubscriptionButtonsSizeStyle.LARGE_50;
            case 11:
                return GroupSubscriptionButtonsSizeStyle.LARGE_52;
            case 12:
                return GroupSubscriptionButtonsSizeStyle.LARGE_54;
            case 13:
                return GroupSubscriptionButtonsSizeStyle.LARGE_56;
            default:
                return GroupSubscriptionButtonsSizeStyle.DEFAULT;
        }
    }

    public static final float vkidInternalGetGroupSubscriptionCornerRadius(@NotNull TypedArray typedArray, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return typedArray.getDimension(R$styleable.vkid_GroupSubscription_vkid_groupSubscriptionCorners, dpToPixels(context, GroupSubscriptionSheetCornersStyle.Default.INSTANCE.getRadiusDp()));
    }

    @NotNull
    public static final InterfaceC6511n<GroupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle, GroupSubscriptionStyle> vkidInternalGetGroupSubscriptionStyleConstructor(@NotNull TypedArray typedArray, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = typedArray.getInt(R$styleable.vkid_GroupSubscription_vkid_groupSubscriptionStyle, 0);
        return i11 != 1 ? i11 != 2 ? GroupSubscriptionAttrsKt$vkidInternalGetGroupSubscriptionStyleConstructor$3.INSTANCE : new InterfaceC6511n() { // from class: la.a
            @Override // fd.InterfaceC6511n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                GroupSubscriptionStyle vkidInternalGetGroupSubscriptionStyleConstructor$lambda$0;
                vkidInternalGetGroupSubscriptionStyleConstructor$lambda$0 = GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionStyleConstructor$lambda$0(context, (GroupSubscriptionSheetCornersStyle) obj, (GroupSubscriptionButtonsCornersStyle) obj2, (GroupSubscriptionButtonsSizeStyle) obj3);
                return vkidInternalGetGroupSubscriptionStyleConstructor$lambda$0;
            }
        } : GroupSubscriptionAttrsKt$vkidInternalGetGroupSubscriptionStyleConstructor$1.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroupSubscriptionStyle vkidInternalGetGroupSubscriptionStyleConstructor$lambda$0(Context context, GroupSubscriptionSheetCornersStyle cornersStyle, GroupSubscriptionButtonsCornersStyle buttonsCornersStyle, GroupSubscriptionButtonsSizeStyle buttonsSizeStyle) {
        Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
        Intrinsics.checkNotNullParameter(buttonsCornersStyle, "buttonsCornersStyle");
        Intrinsics.checkNotNullParameter(buttonsSizeStyle, "buttonsSizeStyle");
        return GroupSubscriptionStyle.INSTANCE.system(context, cornersStyle, buttonsCornersStyle, buttonsSizeStyle);
    }
}
