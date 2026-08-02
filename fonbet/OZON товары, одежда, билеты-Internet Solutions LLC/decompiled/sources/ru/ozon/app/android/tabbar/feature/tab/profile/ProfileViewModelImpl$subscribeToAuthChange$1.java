package ru.ozon.app.android.tabbar.feature.tab.profile;

import Ae.x0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "isAuth", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.tabbar.feature.tab.profile.ProfileViewModelImpl$subscribeToAuthChange$1", f = "ProfileTabViewModel.kt", l = {116, 118}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ProfileViewModelImpl$subscribeToAuthChange$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfileViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileViewModelImpl$subscribeToAuthChange$1(ProfileViewModelImpl profileViewModelImpl, d<? super ProfileViewModelImpl$subscribeToAuthChange$1> dVar) {
        super(2, dVar);
        this.this$0 = profileViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ProfileViewModelImpl$subscribeToAuthChange$1 profileViewModelImpl$subscribeToAuthChange$1 = new ProfileViewModelImpl$subscribeToAuthChange$1(this.this$0, dVar);
        profileViewModelImpl$subscribeToAuthChange$1.L$0 = obj;
        return profileViewModelImpl$subscribeToAuthChange$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, d<? super Unit> dVar) {
        return ((ProfileViewModelImpl$subscribeToAuthChange$1) create(bool, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r6.emit(r4, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        x0 x0Var;
        x0 x0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            bool = (Boolean) this.L$0;
            if (!Intrinsics.d(bool, Boolean.TRUE)) {
                x0Var = this.this$0.unauthorizedIndicatorWasShownState;
                Boolean bool2 = Boolean.FALSE;
                this.L$0 = bool;
                this.label = 1;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            bool = (Boolean) this.L$0;
            s.b(obj);
        }
        x0Var2 = this.this$0.isAuthState;
        Boolean valueOf = Boolean.valueOf(Intrinsics.d(bool, Boolean.TRUE));
        this.L$0 = null;
        this.label = 2;
    }
}
