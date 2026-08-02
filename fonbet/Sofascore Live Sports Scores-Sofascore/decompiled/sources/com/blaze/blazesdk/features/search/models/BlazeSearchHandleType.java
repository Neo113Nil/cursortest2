package com.blaze.blazesdk.features.search.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/features/search/models/BlazeSearchHandleType;", "", "BySDK", "ByApp", "Lcom/blaze/blazesdk/features/search/models/BlazeSearchHandleType$ByApp;", "Lcom/blaze/blazesdk/features/search/models/BlazeSearchHandleType$BySDK;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlazeSearchHandleType {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/blaze/blazesdk/features/search/models/BlazeSearchHandleType$ByApp;", "Lcom/blaze/blazesdk/features/search/models/BlazeSearchHandleType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ByApp implements BlazeSearchHandleType {
        public static final int $stable = 0;

        @NotNull
        public static final ByApp INSTANCE = new ByApp();

        private ByApp() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ByApp);
        }

        public int hashCode() {
            return -2108209418;
        }

        @NotNull
        public String toString() {
            return "ByApp";
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/features/search/models/BlazeSearchHandleType$BySDK;", "Lcom/blaze/blazesdk/features/search/models/BlazeSearchHandleType;", "searchScreenParams", "Lcom/blaze/blazesdk/features/search/models/BlazeSearchScreenParams;", "<init>", "(Lcom/blaze/blazesdk/features/search/models/BlazeSearchScreenParams;)V", "getSearchScreenParams", "()Lcom/blaze/blazesdk/features/search/models/BlazeSearchScreenParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BySDK implements BlazeSearchHandleType {
        public static final int $stable = 0;

        @NotNull
        private final BlazeSearchScreenParams searchScreenParams;

        public BySDK(@NotNull BlazeSearchScreenParams blazeSearchScreenParams) {
            blazeSearchScreenParams.getClass();
            this.searchScreenParams = blazeSearchScreenParams;
        }

        public static /* synthetic */ BySDK copy$default(BySDK bySDK, BlazeSearchScreenParams blazeSearchScreenParams, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeSearchScreenParams = bySDK.searchScreenParams;
            }
            return bySDK.copy(blazeSearchScreenParams);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BlazeSearchScreenParams getSearchScreenParams() {
            return this.searchScreenParams;
        }

        @NotNull
        public final BySDK copy(@NotNull BlazeSearchScreenParams searchScreenParams) {
            searchScreenParams.getClass();
            return new BySDK(searchScreenParams);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BySDK) && Intrinsics.c(this.searchScreenParams, ((BySDK) other).searchScreenParams);
        }

        @NotNull
        public final BlazeSearchScreenParams getSearchScreenParams() {
            return this.searchScreenParams;
        }

        public int hashCode() {
            return this.searchScreenParams.hashCode();
        }

        @NotNull
        public String toString() {
            return "BySDK(searchScreenParams=" + this.searchScreenParams + ')';
        }
    }
}
