package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.model;

import D40.a;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState;", "", "Idle", "Content", "Error", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState$Content;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState$Error;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState$Idle;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RateItemsV2ViewState {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState$Content;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "data", "<init>", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;)V", "copy", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;)Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState$Content;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "getData", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "getCurrentItem", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "currentItem", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCurrentHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "currentHeader", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content implements RateItemsV2ViewState {

        @NotNull
        private final RateItemsV2VO data;

        public Content(@NotNull RateItemsV2VO data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        @NotNull
        public final Content copy(@NotNull RateItemsV2VO data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Content(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Content) && Intrinsics.d(this.data, ((Content) other).data);
        }

        public final TextDTO getCurrentHeader() {
            TextDTO headerTitle;
            RateItemsV2VO.RateItemVO currentItem = getCurrentItem();
            RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO = currentItem instanceof RateItemsV2VO.RateItemVO.RateProductItemVO ? (RateItemsV2VO.RateItemVO.RateProductItemVO) currentItem : null;
            if (rateProductItemVO != null && (headerTitle = rateProductItemVO.getHeaderTitle()) != null) {
                return headerTitle;
            }
            RateItemsV2VO.RateItemsHeaderVO header = this.data.getHeader();
            if (header != null) {
                return header.getTitle();
            }
            return null;
        }

        public final RateItemsV2VO.RateItemVO getCurrentItem() {
            return (RateItemsV2VO.RateItemVO) C7714v.M(this.data.getItems());
        }

        @NotNull
        public final RateItemsV2VO getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "Content(data=" + this.data + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState$Error;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements RateItemsV2ViewState {
        private final Throwable throwable;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.d(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            Throwable th2 = this.throwable;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @NotNull
        public String toString() {
            return a.c("Error(throwable=", ")", this.throwable);
        }

        public Error(Throwable th2) {
            this.throwable = th2;
        }

        public /* synthetic */ Error(Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : th2);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState$Idle;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Idle implements RateItemsV2ViewState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Idle);
        }

        public int hashCode() {
            return -1966509972;
        }

        @NotNull
        public String toString() {
            return "Idle";
        }
    }
}
