package ru.ozon.app.android.fresh.navigation.profileAvatar.presentation;

import Nh.a;
import Sc.o;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepository;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001eB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarRepository;", "repository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer", "<init>", "(Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarRepository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/platform/image/ImageResizer;)V", "Landroid/net/Uri;", "fileUri", "", "uploadAvatar", "(Landroid/net/Uri;)V", "removeAvatar", "()V", "Landroid/content/Intent;", "data", "onActivityResult", "(Landroid/content/Intent;)V", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarRepository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/platform/image/ImageResizer;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action;", "singleAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getSingleAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Action", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AvatarProfileViewModel extends w0 {

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    @NotNull
    private final ImageResizer imageResizer;

    @NotNull
    private final AvatarRepository repository;

    @NotNull
    private final SingleLiveEvent<Action> singleAction;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action;", "", "<init>", "()V", "Loading", "Error", "Success", "Notification", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action$Error;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action$Loading;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action$Notification;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action$Success;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action$Error;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return 1344143159;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action$Loading;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return 752058027;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action$Notification;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action$Success;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return -1451762318;
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

    public AvatarProfileViewModel(@NotNull AvatarRepository repository, @NotNull CoroutineDispatcherProvider dispatcherProvider, @NotNull ImageResizer imageResizer) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        this.repository = repository;
        this.dispatcherProvider = dispatcherProvider;
        this.imageResizer = imageResizer;
        this.singleAction = new SingleLiveEvent<>();
    }

    private final void removeAvatar() {
        C10727i.c(x0.a(this), this.dispatcherProvider.getIO(), null, new AvatarProfileViewModel$removeAvatar$1(this, null), 2);
    }

    private final void uploadAvatar(Uri fileUri) {
        C10727i.c(x0.a(this), this.dispatcherProvider.getIO(), null, new AvatarProfileViewModel$uploadAvatar$1(this, fileUri, null), 2);
    }

    @NotNull
    public final SingleLiveEvent<Action> getSingleAction() {
        return this.singleAction;
    }

    public final void onActivityResult(Intent data) {
        Uri uri;
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        if (data != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra2 = data.getParcelableExtra("ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.AvatarProfileViewModel.KEY_IMAGE_URI", Uri.class);
                parcelableExtra = (Parcelable) parcelableExtra2;
            } else {
                parcelableExtra = data.getParcelableExtra("ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.AvatarProfileViewModel.KEY_IMAGE_URI");
            }
            uri = (Uri) parcelableExtra;
        } else {
            uri = null;
        }
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
