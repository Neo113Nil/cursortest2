package ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel;

import AF.d;
import AF.g;
import Bc.m;
import Bc.r;
import Fn.C3055d;
import Fn.C3056e;
import Nh.a;
import Sc.o;
import Tm.C4047b;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.w0;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.cabinet.profileAvatar.data.repository.AvatarRepository;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel.AvatarViewModel;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import uc.i;
import vc.l;
import vc.n;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarRepository;", "repository", "Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer", "<init>", "(Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarRepository;Lru/ozon/app/android/platform/image/ImageResizer;)V", "Landroid/net/Uri;", "fileUri", "", "uploadAvatar", "(Landroid/net/Uri;)V", "removeAvatar", "()V", "Landroid/content/Intent;", "data", "onActivityResult", "(Landroid/content/Intent;)V", "Lru/ozon/app/android/cabinet/profileAvatar/data/repository/AvatarRepository;", "Lru/ozon/app/android/platform/image/ImageResizer;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action;", "singleAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getSingleAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Action", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvatarViewModel extends w0 {

    @NotNull
    private final ImageResizer imageResizer;

    @NotNull
    private final AvatarRepository repository;

    @NotNull
    private final SingleLiveEvent<Action> singleAction;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action;", "", "<init>", "()V", "Loading", "Error", "Success", "Notification", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action$Error;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action$Loading;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action$Notification;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action$Success;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action$Error;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 1323501162;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action$Loading;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends Action {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1905031906;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action$Notification;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Notification extends Action {

            @NotNull
            private final NotificationDTO notification;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Notification(@NotNull NotificationDTO notification) {
                super(null);
                Intrinsics.checkNotNullParameter(notification, "notification");
                this.notification = notification;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Notification) && Intrinsics.d(this.notification, ((Notification) other).notification);
            }

            @NotNull
            public final NotificationDTO getNotification() {
                return this.notification;
            }

            public int hashCode() {
                return this.notification.hashCode();
            }

            @NotNull
            public String toString() {
                return a.e("Notification(notification=", ")", this.notification);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action$Success;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return 186115045;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public AvatarViewModel(@NotNull AvatarRepository repository, @NotNull ImageResizer imageResizer) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        this.repository = repository;
        this.imageResizer = imageResizer;
        this.singleAction = new SingleLiveEvent<>();
    }

    private final void removeAvatar() {
        C8486a a11 = C5415f.a(this);
        n f7 = new l(this.repository.removeAvatar().k(Mc.a.b()), C8125a.a()).f(new AF.a(new AvatarViewModel$removeAvatar$1(this), 5));
        i iVar = new i(new C3055d(new AvatarViewModel$removeAvatar$3(this), 6), new InterfaceC9019a() { // from class: Tm.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                AvatarViewModel.removeAvatar$lambda$10(AvatarViewModel.this);
            }
        });
        f7.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(a11, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeAvatar$lambda$10(AvatarViewModel avatarViewModel) {
        avatarViewModel.singleAction.setValue(Action.Success.INSTANCE);
    }

    private final void uploadAvatar(Uri fileUri) {
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b h11 = new Bc.i(new m(new r(y.f(fileUri), new d(new AvatarViewModel$uploadAvatar$1(this), 5)), new C3056e(new AvatarViewModel$uploadAvatar$2(this), 4)).j(Mc.a.b()).g(C8125a.a()), new HC.a(new AvatarViewModel$uploadAvatar$3(this), 2)).h(new g(new AvatarViewModel$uploadAvatar$4(this), 3), new C4047b(new AvatarViewModel$uploadAvatar$5(this), 0));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String uploadAvatar$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (String) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadAvatar$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    @NotNull
    public final SingleLiveEvent<Action> getSingleAction() {
        return this.singleAction;
    }

    public final void onActivityResult(Intent data) {
        Uri uri = data != null ? (Uri) data.getParcelableExtra("ru.ozon.app.android.cabinet.profileAvatar.ProfileAvatarViewHolder.KEY_IMAGE_URI") : null;
        boolean z11 = uri != null;
        if (z11) {
            uploadAvatar(uri);
        } else {
            if (z11) {
                throw new o();
            }
            removeAvatar();
        }
    }
}
