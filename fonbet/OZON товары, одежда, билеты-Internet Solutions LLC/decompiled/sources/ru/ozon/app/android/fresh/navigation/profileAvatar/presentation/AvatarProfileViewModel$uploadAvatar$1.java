package ru.ozon.app.android.fresh.navigation.profileAvatar.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import android.net.Uri;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepository;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.UploadAvatarResponse;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;
import xe.I;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.navigation.profileAvatar.presentation.AvatarProfileViewModel$uploadAvatar$1", f = "AvatarProfileViewModel.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 43, 47, 52}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AvatarProfileViewModel$uploadAvatar$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Uri $fileUri;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AvatarProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarProfileViewModel$uploadAvatar$1(AvatarProfileViewModel avatarProfileViewModel, Uri uri, d<? super AvatarProfileViewModel$uploadAvatar$1> dVar) {
        super(2, dVar);
        this.this$0 = avatarProfileViewModel;
        this.$fileUri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AvatarProfileViewModel$uploadAvatar$1 avatarProfileViewModel$uploadAvatar$1 = new AvatarProfileViewModel$uploadAvatar$1(this.this$0, this.$fileUri, dVar);
        avatarProfileViewModel$uploadAvatar$1.L$0 = obj;
        return avatarProfileViewModel$uploadAvatar$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cf, code lost:
    
        if (xe.C10727i.f(r3, r4, r9) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (xe.C10727i.f(r5, r7, r9) == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        CoroutineDispatcherProvider coroutineDispatcherProvider;
        CoroutineDispatcherProvider coroutineDispatcherProvider2;
        Uri uri;
        CoroutineDispatcherProvider coroutineDispatcherProvider3;
        AvatarProfileViewModel avatarProfileViewModel;
        ImageResizer imageResizer;
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
            AvatarProfileViewModel avatarProfileViewModel2 = this.this$0;
            uri = this.$fileUri;
            r.Companion companion2 = r.INSTANCE;
            coroutineDispatcherProvider3 = avatarProfileViewModel2.dispatcherProvider;
            I main = coroutineDispatcherProvider3.getMain();
            AvatarProfileViewModel$uploadAvatar$1$1$1 avatarProfileViewModel$uploadAvatar$1$1$1 = new AvatarProfileViewModel$uploadAvatar$1$1$1(avatarProfileViewModel2, null);
            this.L$0 = avatarProfileViewModel2;
            this.L$1 = uri;
            this.label = 1;
            if (C10727i.f(main, avatarProfileViewModel$uploadAvatar$1$1$1, this) == aVar) {
                return aVar;
            }
            avatarProfileViewModel = avatarProfileViewModel2;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    obj2 = this.L$0;
                    s.b(obj);
                    AvatarProfileViewModel avatarProfileViewModel3 = this.this$0;
                    if (r.b(obj2) != null) {
                        coroutineDispatcherProvider2 = avatarProfileViewModel3.dispatcherProvider;
                        I main2 = coroutineDispatcherProvider2.getMain();
                        AvatarProfileViewModel$uploadAvatar$1$3$1 avatarProfileViewModel$uploadAvatar$1$3$1 = new AvatarProfileViewModel$uploadAvatar$1$3$1(avatarProfileViewModel3, null);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 4;
                    }
                    return Unit.f71690a;
                }
                s.b(obj);
                a11 = (UploadAvatarResponse) obj;
                r.Companion companion3 = r.INSTANCE;
                obj2 = a11;
                AvatarProfileViewModel avatarProfileViewModel4 = this.this$0;
                if (!(obj2 instanceof r.b)) {
                    NotificationDTO errorNotificationBar = ((UploadAvatarResponse) obj2).getErrorNotificationBar();
                    coroutineDispatcherProvider = avatarProfileViewModel4.dispatcherProvider;
                    I main3 = coroutineDispatcherProvider.getMain();
                    AvatarProfileViewModel$uploadAvatar$1$2$1 avatarProfileViewModel$uploadAvatar$1$2$1 = new AvatarProfileViewModel$uploadAvatar$1$2$1(avatarProfileViewModel4, errorNotificationBar, null);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.label = 3;
                }
                AvatarProfileViewModel avatarProfileViewModel32 = this.this$0;
                if (r.b(obj2) != null) {
                }
                return Unit.f71690a;
            }
            uri = (Uri) this.L$1;
            avatarProfileViewModel = (AvatarProfileViewModel) this.L$0;
            s.b(obj);
        }
        imageResizer = avatarProfileViewModel.imageResizer;
        String resize$default = ImageResizer.DefaultImpls.resize$default(imageResizer, uri, 0.0f, 2, null);
        avatarRepository = avatarProfileViewModel.repository;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = avatarRepository.uploadAvatar(resize$default, this);
        if (obj == aVar) {
            return aVar;
        }
        a11 = (UploadAvatarResponse) obj;
        r.Companion companion32 = r.INSTANCE;
        obj2 = a11;
        AvatarProfileViewModel avatarProfileViewModel42 = this.this$0;
        if (!(obj2 instanceof r.b)) {
        }
        AvatarProfileViewModel avatarProfileViewModel322 = this.this$0;
        if (r.b(obj2) != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AvatarProfileViewModel$uploadAvatar$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
