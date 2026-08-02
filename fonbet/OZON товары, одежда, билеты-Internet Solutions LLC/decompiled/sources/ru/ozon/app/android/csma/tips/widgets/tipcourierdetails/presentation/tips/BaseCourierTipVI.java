package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips;

import B6.b;
import Kk.C3532b;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI;", "", "<init>", "()V", "CourierTipVariant", "CourierTipInputStub", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI$CourierTipInputStub;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI$CourierTipVariant;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseCourierTipVI {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI$CourierTipInputStub;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CourierTipInputStub extends BaseCourierTipVI {
        public CourierTipInputStub() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return CourierTipInputStub.class.equals(other != null ? other.getClass() : null);
        }

        public int hashCode() {
            return CourierTipInputStub.class.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI$CourierTipVariant;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI;", "", "text", "", "isSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CourierTipVariant extends BaseCourierTipVI {
        private final AtomAction action;
        private final boolean isSelected;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CourierTipVariant(@NotNull String text, boolean z11, AtomAction atomAction) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isSelected = z11;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CourierTipVariant)) {
                return false;
            }
            CourierTipVariant courierTipVariant = (CourierTipVariant) other;
            return Intrinsics.d(this.text, courierTipVariant.text) && this.isSelected == courierTipVariant.isSelected && Intrinsics.d(this.action, courierTipVariant.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.text.hashCode() * 31, 31, this.isSelected);
            AtomAction atomAction = this.action;
            return a11 + (atomAction == null ? 0 : atomAction.hashCode());
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.text;
            boolean z11 = this.isSelected;
            return b.b(C4636t5.b("CourierTipVariant(text=", str, ", isSelected=", ", action=", z11), this.action, ")");
        }
    }

    public /* synthetic */ BaseCourierTipVI(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BaseCourierTipVI() {
    }
}
