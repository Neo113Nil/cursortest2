package ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState;", "", "Initial", "Error", "Progress", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState$Error;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState$Initial;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState$Progress;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PromptStatusState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState$Error;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements PromptStatusState {

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 1002005865;
        }

        @NotNull
        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState$Initial;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initial implements PromptStatusState {

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Initial);
        }

        public int hashCode() {
            return -12675483;
        }

        @NotNull
        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState$Progress;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "loadingIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "loadingTitle", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getLoadingIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLoadingTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Progress implements PromptStatusState {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO loadingIcon;

        @NotNull
        private final TextDTO loadingTitle;

        public Progress(@NotNull IconDTO loadingIcon, @NotNull TextDTO loadingTitle) {
            Intrinsics.checkNotNullParameter(loadingIcon, "loadingIcon");
            Intrinsics.checkNotNullParameter(loadingTitle, "loadingTitle");
            this.loadingIcon = loadingIcon;
            this.loadingTitle = loadingTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return Intrinsics.d(this.loadingIcon, progress.loadingIcon) && Intrinsics.d(this.loadingTitle, progress.loadingTitle);
        }

        @NotNull
        public final IconDTO getLoadingIcon() {
            return this.loadingIcon;
        }

        @NotNull
        public final TextDTO getLoadingTitle() {
            return this.loadingTitle;
        }

        public int hashCode() {
            return this.loadingTitle.hashCode() + (this.loadingIcon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Progress(loadingIcon=" + this.loadingIcon + ", loadingTitle=" + this.loadingTitle + ")";
        }
    }
}
