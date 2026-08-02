package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/ViewIntent;", "", "AddressInputUpdated", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/ViewIntent$AddressInputUpdated;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ViewIntent {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/ViewIntent$AddressInputUpdated;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/ViewIntent;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "text", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getText", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddressInputUpdated implements ViewIntent {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;

        @NotNull
        private final String text;

        public AddressInputUpdated(AtomAction atomAction, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.action = atomAction;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressInputUpdated)) {
                return false;
            }
            AddressInputUpdated addressInputUpdated = (AddressInputUpdated) other;
            return Intrinsics.d(this.action, addressInputUpdated.action) && Intrinsics.d(this.text, addressInputUpdated.text);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            AtomAction atomAction = this.action;
            return this.text.hashCode() + ((atomAction == null ? 0 : atomAction.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "AddressInputUpdated(action=" + this.action + ", text=" + this.text + ")";
        }
    }
}
