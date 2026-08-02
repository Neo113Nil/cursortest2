package ru.ozon.app.android.tabbar.feature.tab.profile;

import Sc.s;
import Wc.a;
import fd.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.tabbar.feature.tab.profile.ProfileViewModelImpl;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;", "isAuth", "", "ordersCount", "", "isUnauthorizedIndicatorEnabled", "wasAlreadyShown"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.tabbar.feature.tab.profile.ProfileViewModelImpl$badgeState$1", f = "ProfileTabViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ProfileViewModelImpl$badgeState$1 extends j implements p<Boolean, Integer, Boolean, Boolean, d<? super ProfileViewModelImpl.BadgeVariant>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;

    ProfileViewModelImpl$badgeState$1(d<? super ProfileViewModelImpl$badgeState$1> dVar) {
        super(5, dVar);
    }

    @Override // fd.p
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Integer num, Boolean bool2, Boolean bool3, d<? super ProfileViewModelImpl.BadgeVariant> dVar) {
        return invoke(bool.booleanValue(), num.intValue(), bool2.booleanValue(), bool3.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        int i11 = this.I$0;
        return (!this.Z$1 || this.Z$2 || z11) ? (i11 <= 0 || !z11) ? ProfileViewModelImpl.BadgeVariant.None.INSTANCE : new ProfileViewModelImpl.BadgeVariant.Orders(i11) : ProfileViewModelImpl.BadgeVariant.UnAuthorized.INSTANCE;
    }

    public final Object invoke(boolean z11, int i11, boolean z12, boolean z13, d<? super ProfileViewModelImpl.BadgeVariant> dVar) {
        ProfileViewModelImpl$badgeState$1 profileViewModelImpl$badgeState$1 = new ProfileViewModelImpl$badgeState$1(dVar);
        profileViewModelImpl$badgeState$1.Z$0 = z11;
        profileViewModelImpl$badgeState$1.I$0 = i11;
        profileViewModelImpl$badgeState$1.Z$1 = z12;
        profileViewModelImpl$badgeState$1.Z$2 = z13;
        return profileViewModelImpl$badgeState$1.invokeSuspend(Unit.f71690a);
    }
}
