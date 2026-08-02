package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.manager.ExoManager;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy;", "", "<init>", "()V", "BindBeforeLoadStarted", "BindAfterLoadStarted", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy$BindAfterLoadStarted;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy$BindBeforeLoadStarted;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PlayerViewBindStrategy {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy$BindAfterLoadStarted;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy;", "Lru/ozon/app/android/video/manager/ExoManager;", "exoManager", "<init>", "(Lru/ozon/app/android/video/manager/ExoManager;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/video/manager/ExoManager;", "getExoManager", "()Lru/ozon/app/android/video/manager/ExoManager;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BindAfterLoadStarted extends PlayerViewBindStrategy {

        @NotNull
        private final ExoManager exoManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindAfterLoadStarted(@NotNull ExoManager exoManager) {
            super(null);
            Intrinsics.checkNotNullParameter(exoManager, "exoManager");
            this.exoManager = exoManager;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindAfterLoadStarted) && Intrinsics.d(this.exoManager, ((BindAfterLoadStarted) other).exoManager);
        }

        @NotNull
        public final ExoManager getExoManager() {
            return this.exoManager;
        }

        public int hashCode() {
            return this.exoManager.hashCode();
        }

        @NotNull
        public String toString() {
            return "BindAfterLoadStarted(exoManager=" + this.exoManager + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy$BindBeforeLoadStarted;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BindBeforeLoadStarted extends PlayerViewBindStrategy {

        @NotNull
        public static final BindBeforeLoadStarted INSTANCE = new BindBeforeLoadStarted();

        private BindBeforeLoadStarted() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BindBeforeLoadStarted);
        }

        public int hashCode() {
            return 1496978767;
        }

        @NotNull
        public String toString() {
            return "BindBeforeLoadStarted";
        }
    }

    public /* synthetic */ PlayerViewBindStrategy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PlayerViewBindStrategy() {
    }
}
