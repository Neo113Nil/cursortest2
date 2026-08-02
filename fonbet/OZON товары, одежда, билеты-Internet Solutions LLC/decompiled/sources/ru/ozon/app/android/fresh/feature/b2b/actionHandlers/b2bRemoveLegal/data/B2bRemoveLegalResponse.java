package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.data;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse;", "", "data", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse$Data;", "isSuccess", "", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse$Data;Z)V", "getData", "()Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse$Data;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Data", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bRemoveLegalResponse {
    public static final int $stable = 0;
    private final Data data;
    private final boolean isSuccess;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse$Data;", "", "button", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getButton", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {
        public static final int $stable = 0;

        @NotNull
        private final String button;

        @NotNull
        private final String text;

        public Data(@NotNull String button, @NotNull String text) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(text, "text");
            this.button = button;
            this.text = text;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = data.button;
            }
            if ((i11 & 2) != 0) {
                str2 = data.text;
            }
            return data.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getButton() {
            return this.button;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Data copy(@NotNull String button, @NotNull String text) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Data(button, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.d(this.button, data.button) && Intrinsics.d(this.text, data.text);
        }

        @NotNull
        public final String getButton() {
            return this.button;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.button.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Data(button=", this.button, ", text=", this.text, ")");
        }
    }

    public B2bRemoveLegalResponse(Data data, boolean z11) {
        this.data = data;
        this.isSuccess = z11;
    }

    public static /* synthetic */ B2bRemoveLegalResponse copy$default(B2bRemoveLegalResponse b2bRemoveLegalResponse, Data data, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            data = b2bRemoveLegalResponse.data;
        }
        if ((i11 & 2) != 0) {
            z11 = b2bRemoveLegalResponse.isSuccess;
        }
        return b2bRemoveLegalResponse.copy(data, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public final B2bRemoveLegalResponse copy(Data data, boolean isSuccess) {
        return new B2bRemoveLegalResponse(data, isSuccess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bRemoveLegalResponse)) {
            return false;
        }
        B2bRemoveLegalResponse b2bRemoveLegalResponse = (B2bRemoveLegalResponse) other;
        return Intrinsics.d(this.data, b2bRemoveLegalResponse.data) && this.isSuccess == b2bRemoveLegalResponse.isSuccess;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        Data data = this.data;
        return Boolean.hashCode(this.isSuccess) + ((data == null ? 0 : data.hashCode()) * 31);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "B2bRemoveLegalResponse(data=" + this.data + ", isSuccess=" + this.isSuccess + ")";
    }
}
