package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation;

import Nh.a;
import T7.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent;", "", "", "itemIndex", "<init>", "(I)V", "I", "getItemIndex", "()I", "Buffering", "ItemLoaded", "Error", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent$Buffering;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent$Error;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent$ItemLoaded;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class StoryItemEvent {
    private final int itemIndex;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent$Buffering;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent;", "", "itemIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getItemIndex", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Buffering extends StoryItemEvent {
        private final int itemIndex;

        public Buffering(int i11) {
            super(i11, null);
            this.itemIndex = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Buffering) && this.itemIndex == ((Buffering) other).itemIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.itemIndex);
        }

        @NotNull
        public String toString() {
            return E.a(this.itemIndex, "Buffering(itemIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent$Error;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent;", "", "itemIndex", "", "errorString", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getItemIndex", "Ljava/lang/String;", "getErrorString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends StoryItemEvent {

        @NotNull
        private final String errorString;
        private final int itemIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(int i11, @NotNull String errorString) {
            super(i11, null);
            Intrinsics.checkNotNullParameter(errorString, "errorString");
            this.itemIndex = i11;
            this.errorString = errorString;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.itemIndex == error.itemIndex && Intrinsics.d(this.errorString, error.errorString);
        }

        @NotNull
        public final String getErrorString() {
            return this.errorString;
        }

        public int hashCode() {
            return this.errorString.hashCode() + (Integer.hashCode(this.itemIndex) * 31);
        }

        @NotNull
        public String toString() {
            return a.c(this.itemIndex, "Error(itemIndex=", ", errorString=", this.errorString, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent$ItemLoaded;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/StoryItemEvent;", "", "itemIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getItemIndex", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemLoaded extends StoryItemEvent {
        private final int itemIndex;

        public ItemLoaded(int i11) {
            super(i11, null);
            this.itemIndex = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ItemLoaded) && this.itemIndex == ((ItemLoaded) other).itemIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.itemIndex);
        }

        @NotNull
        public String toString() {
            return E.a(this.itemIndex, "ItemLoaded(itemIndex=", ")");
        }
    }

    public /* synthetic */ StoryItemEvent(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    private StoryItemEvent(int i11) {
        this.itemIndex = i11;
    }
}
