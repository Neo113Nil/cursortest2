package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation;

import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.domain.ProfileAvatarVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ProfileAvatarViewHolder$bind$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ProfileAvatarVO $item;
    final /* synthetic */ ProfileAvatarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileAvatarViewHolder$bind$1(ProfileAvatarVO profileAvatarVO, ProfileAvatarViewHolder profileAvatarViewHolder) {
        super(0);
        this.$item = profileAvatarVO;
        this.this$0 = profileAvatarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l lVar;
        if (this.$item.getIsAvatarChangeable()) {
            t tokenizedEvent = this.$item.getTokenizedEvent();
            if (tokenizedEvent != null) {
                lVar = this.this$0.tokenizedAnalytics;
                m.a(lVar, tokenizedEvent, null);
            }
            this.this$0.chooseAvatar(this.$item.getIsDefaultAvatar());
        }
    }
}
