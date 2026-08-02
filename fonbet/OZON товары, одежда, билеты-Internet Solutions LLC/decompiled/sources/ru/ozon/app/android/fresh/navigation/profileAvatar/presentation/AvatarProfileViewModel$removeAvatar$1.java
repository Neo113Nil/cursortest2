package ru.ozon.app.android.fresh.navigation.profileAvatar.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepository;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.C10727i;
import xe.I;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.navigation.profileAvatar.presentation.AvatarProfileViewModel$removeAvatar$1", f = "AvatarProfileViewModel.kt", l = {62, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 68, 74}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AvatarProfileViewModel$removeAvatar$1 extends j implements Function2<M, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AvatarProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarProfileViewModel$removeAvatar$1(AvatarProfileViewModel avatarProfileViewModel, d<? super AvatarProfileViewModel$removeAvatar$1> dVar) {
        super(2, dVar);
        this.this$0 = avatarProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AvatarProfileViewModel$removeAvatar$1 avatarProfileViewModel$removeAvatar$1 = new AvatarProfileViewModel$removeAvatar$1(this.this$0, dVar);
        avatarProfileViewModel$removeAvatar$1.L$0 = obj;
        return avatarProfileViewModel$removeAvatar$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
    
        if (xe.C10727i.f(r3, r4, r8) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (xe.C10727i.f(r4, r5, r8) == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        CoroutineDispatcherProvider coroutineDispatcherProvider;
        Throwable b11;
        CoroutineDispatcherProvider coroutineDispatcherProvider2;
        AvatarProfileViewModel avatarProfileViewModel;
        CoroutineDispatcherProvider coroutineDispatcherProvider3;
        AvatarRepository avatarRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            avatarProfileViewModel = this.this$0;
            r.Companion companion2 = r.INSTANCE;
            coroutineDispatcherProvider3 = avatarProfileViewModel.dispatcherProvider;
            I main = coroutineDispatcherProvider3.getMain();
            AvatarProfileViewModel$removeAvatar$1$1$1 avatarProfileViewModel$removeAvatar$1$1$1 = new AvatarProfileViewModel$removeAvatar$1$1$1(avatarProfileViewModel, null);
            this.L$0 = avatarProfileViewModel;
            this.label = 1;
            if (C10727i.f(main, avatarProfileViewModel$removeAvatar$1$1$1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    s.b(obj);
                    a11 = Unit.f71690a;
                    r.Companion companion3 = r.INSTANCE;
                    obj2 = a11;
                    AvatarProfileViewModel avatarProfileViewModel2 = this.this$0;
                    if (!(obj2 instanceof r.b)) {
                        coroutineDispatcherProvider = avatarProfileViewModel2.dispatcherProvider;
                        I main2 = coroutineDispatcherProvider.getMain();
                        AvatarProfileViewModel$removeAvatar$1$2$1 avatarProfileViewModel$removeAvatar$1$2$1 = new AvatarProfileViewModel$removeAvatar$1$2$1(avatarProfileViewModel2, null);
                        this.L$0 = obj2;
                        this.label = 3;
                    }
                    AvatarProfileViewModel avatarProfileViewModel3 = this.this$0;
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                obj2 = this.L$0;
                s.b(obj);
                AvatarProfileViewModel avatarProfileViewModel32 = this.this$0;
                b11 = r.b(obj2);
                if (b11 != null) {
                    Lm0.a.f17149a.e(b11);
                    coroutineDispatcherProvider2 = avatarProfileViewModel32.dispatcherProvider;
                    I main3 = coroutineDispatcherProvider2.getMain();
                    AvatarProfileViewModel$removeAvatar$1$3$1 avatarProfileViewModel$removeAvatar$1$3$1 = new AvatarProfileViewModel$removeAvatar$1$3$1(avatarProfileViewModel32, null);
                    this.L$0 = obj2;
                    this.label = 4;
                }
                return Unit.f71690a;
            }
            avatarProfileViewModel = (AvatarProfileViewModel) this.L$0;
            s.b(obj);
        }
        avatarRepository = avatarProfileViewModel.repository;
        this.L$0 = null;
        this.label = 2;
        if (avatarRepository.removeAvatar(this) == aVar) {
            return aVar;
        }
        a11 = Unit.f71690a;
        r.Companion companion32 = r.INSTANCE;
        obj2 = a11;
        AvatarProfileViewModel avatarProfileViewModel22 = this.this$0;
        if (!(obj2 instanceof r.b)) {
        }
        AvatarProfileViewModel avatarProfileViewModel322 = this.this$0;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AvatarProfileViewModel$removeAvatar$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
