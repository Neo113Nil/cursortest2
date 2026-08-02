package com.vk.ecomm.cart.impl.cart.feature.state;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CartState.kt */
/* loaded from: classes18.dex */
public final class ExternalOrderState implements Parcelable {
    public static final Parcelable.Creator<ExternalOrderState> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final NavigateTo d;

    /* compiled from: CartState.kt */
    public static final class MiniAppOrderResponse {

        @pmi0("destination")
        private final String destination;

        @pmi0("status")
        private final int status;

        public MiniAppOrderResponse(int i, String str) {
            this.status = i;
            this.destination = str;
        }

        public final String a() {
            return this.destination;
        }

        public final int b() {
            return this.status;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MiniAppOrderResponse)) {
                return false;
            }
            MiniAppOrderResponse miniAppOrderResponse = (MiniAppOrderResponse) obj;
            return this.status == miniAppOrderResponse.status && epx.f(this.destination, miniAppOrderResponse.destination);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.status) * 31;
            String str = this.destination;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MiniAppOrderResponse(status=");
            sb.append(this.status);
            sb.append(", destination=");
            return ho8.a(sb, this.destination, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CartState.kt */
    public static final class NavigateTo {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NavigateTo[] $VALUES;
        public static final NavigateTo BACK;
        public static final NavigateTo MARKET_MAIN;
        public static final NavigateTo ORDERS;

        static {
            NavigateTo navigateTo = new NavigateTo("MARKET_MAIN", 0);
            MARKET_MAIN = navigateTo;
            NavigateTo navigateTo2 = new NavigateTo("ORDERS", 1);
            ORDERS = navigateTo2;
            NavigateTo navigateTo3 = new NavigateTo("BACK", 2);
            BACK = navigateTo3;
            NavigateTo[] navigateToArr = {navigateTo, navigateTo2, navigateTo3};
            $VALUES = navigateToArr;
            $ENTRIES = new asp(navigateToArr);
        }

        public NavigateTo() {
            throw null;
        }

        public static NavigateTo valueOf(String str) {
            return (NavigateTo) Enum.valueOf(NavigateTo.class, str);
        }

        public static NavigateTo[] values() {
            return (NavigateTo[]) $VALUES.clone();
        }
    }

    /* compiled from: CartState.kt */
    public static final class a implements Parcelable.Creator<ExternalOrderState> {
        @Override // android.os.Parcelable.Creator
        public final ExternalOrderState createFromParcel(Parcel parcel) {
            return new ExternalOrderState(parcel.readInt() != 0, parcel.readInt() != 0, NavigateTo.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExternalOrderState[] newArray(int i) {
            return new ExternalOrderState[i];
        }
    }

    public ExternalOrderState() {
        this(false, false, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalOrderState)) {
            return false;
        }
        ExternalOrderState externalOrderState = (ExternalOrderState) obj;
        return this.b == externalOrderState.b && this.c == externalOrderState.c && this.d == externalOrderState.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return "ExternalOrderState(isCreated=" + this.b + ", isPaid=" + this.c + ", destination=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d.name());
    }

    public ExternalOrderState(boolean z, boolean z2, NavigateTo navigateTo) {
        this.b = z;
        this.c = z2;
        this.d = navigateTo;
    }

    public /* synthetic */ ExternalOrderState(boolean z, boolean z2, NavigateTo navigateTo, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? NavigateTo.BACK : navigateTo);
    }
}
