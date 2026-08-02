package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryComposerAction;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel;", "", "", "hasAudio", "", "hasAudioChanged", "(Z)V", "videoFinished", "()V", "onRenderedFirstFrame", "isVisible", "visibilityChanged", "contentIsLoaded", "ActionResult", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ReviewGalleryV2ViewModel {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel$ActionResult;", "", "<init>", "()V", "Success", "Error", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel$ActionResult$Error;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel$ActionResult$Success;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ActionResult {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel$ActionResult$Error;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel$ActionResult;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction;", "action", "", "message", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction;Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction;", "getAction", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction;", "Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/Throwable;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends ActionResult {

            @NotNull
            private final ReviewGalleryComposerAction action;

            @NotNull
            private final Throwable message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull ReviewGalleryComposerAction action, @NotNull Throwable message) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(message, "message");
                this.action = action;
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return this.action == error.action && Intrinsics.d(this.message, error.message);
            }

            @NotNull
            public final Throwable getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode() + (this.action.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Error(action=" + this.action + ", message=" + this.message + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel$ActionResult$Success;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel$ActionResult;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction;", "action", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction;", "getAction", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryComposerAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends ActionResult {

            @NotNull
            private final ReviewGalleryComposerAction action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull ReviewGalleryComposerAction action) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && this.action == ((Success) other).action;
            }

            @NotNull
            public final ReviewGalleryComposerAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(action=" + this.action + ")";
            }
        }

        public /* synthetic */ ActionResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionResult() {
        }
    }

    void contentIsLoaded();

    void hasAudioChanged(boolean hasAudio);

    void onRenderedFirstFrame();

    void videoFinished();

    void visibilityChanged(boolean isVisible);
}
