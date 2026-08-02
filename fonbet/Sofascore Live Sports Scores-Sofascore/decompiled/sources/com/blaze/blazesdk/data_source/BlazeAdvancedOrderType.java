package com.blaze.blazesdk.data_source;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;", "", "LiveFirst", "Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType$LiveFirst;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlazeAdvancedOrderType {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType$LiveFirst;", "Lcom/blaze/blazesdk/data_source/BlazeAdvancedOrderType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveFirst implements BlazeAdvancedOrderType {
        public static final int $stable = 0;

        @NotNull
        public static final LiveFirst INSTANCE = new LiveFirst();

        private LiveFirst() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof LiveFirst);
        }

        public int hashCode() {
            return 1949466997;
        }

        @NotNull
        public String toString() {
            return "LiveFirst";
        }
    }
}
