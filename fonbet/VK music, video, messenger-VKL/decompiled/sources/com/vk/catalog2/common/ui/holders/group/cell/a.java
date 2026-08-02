package com.vk.catalog2.common.ui.holders.group.cell;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellViewState$Avatar;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import kotlin.NoWhenBranchMatchedException;
import xsna.gsg;
import xsna.js5;
import xsna.lsg;
import xsna.ndu0;
import xsna.odu0;
import xsna.wh6;

/* compiled from: GroupCellVh.kt */
/* loaded from: classes16.dex */
public final class a implements VkCell.d {
    public final VkAvatar a;

    /* compiled from: GroupCellVh.kt */
    /* renamed from: com.vk.catalog2.common.ui.holders.group.cell.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0485a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupCellViewState$Avatar.State.values().length];
            try {
                iArr[GroupCellViewState$Avatar.State.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupCellViewState$Avatar.State.NewStory.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupCellViewState$Avatar.State.Live.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(Context context) {
        this.a = new VkAvatar(context, null, 6, 0);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        lsg lsgVar = fVar instanceof lsg ? (lsg) fVar : null;
        if (lsgVar == null) {
            return;
        }
        GroupCellViewState$Avatar groupCellViewState$Avatar = lsgVar.a;
        String a = js5.a(200, groupCellViewState$Avatar.a);
        if (a == null) {
            a = "";
        }
        VkAvatar vkAvatar = this.a;
        vkAvatar.s0(a);
        vkAvatar.setOnClickListener(new gsg(lsgVar.b, this));
        vkAvatar.setImportantForAccessibility(2);
        GroupCellViewState$Avatar.State state = groupCellViewState$Avatar.b;
        vkAvatar.S0();
        int i = C0485a.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            vkAvatar.W0(null, false);
            return;
        }
        if (i == 2) {
            vkAvatar.W0(new odu0(), false);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            vkAvatar.W0(new ndu0(), true);
            vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.b(null, true, new wh6(15), null, 19));
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
