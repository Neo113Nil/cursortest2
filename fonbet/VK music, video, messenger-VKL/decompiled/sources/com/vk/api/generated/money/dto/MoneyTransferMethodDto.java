package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: MoneyTransferMethodDto.kt */
/* loaded from: classes15.dex */
public final class MoneyTransferMethodDto implements Parcelable {
    public static final Parcelable.Creator<MoneyTransferMethodDto> CREATOR = new a();

    @pmi0("balance")
    private final Float balance;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final String currency;

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("max_amount")
    private final Float maxAmount;

    @pmi0("max_receive_amount")
    private final Float maxReceiveAmount;

    @pmi0("min_amount")
    private final Float minAmount;

    /* renamed from: receivers, reason: collision with root package name */
    @pmi0("receivers")
    private final List<MoneyTransferMethodDto> f77receivers;

    @pmi0("status")
    private final String status;

    @pmi0("type")
    private final String type;

    @pmi0("type_id")
    private final Integer typeId;

    /* compiled from: MoneyTransferMethodDto.kt */
    public static final class a implements Parcelable.Creator<MoneyTransferMethodDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyTransferMethodDto createFromParcel(Parcel parcel) {
            int i;
            String readString = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer num = valueOf;
            String readString3 = parcel.readString();
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(MoneyTransferMethodDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MoneyTransferMethodDto(readString, z, num, readString2, valueOf2, readString3, valueOf3, valueOf4, valueOf5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyTransferMethodDto[] newArray(int i) {
            return new MoneyTransferMethodDto[i];
        }
    }

    public MoneyTransferMethodDto(String str, boolean z, Integer num, String str2, Float f, String str3, Float f2, Float f3, Float f4, List<MoneyTransferMethodDto> list) {
        this.type = str;
        this.enabled = z;
        this.typeId = num;
        this.status = str2;
        this.balance = f;
        this.currency = str3;
        this.minAmount = f2;
        this.maxAmount = f3;
        this.maxReceiveAmount = f4;
        this.f77receivers = list;
    }

    public final boolean d() {
        return this.enabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferMethodDto)) {
            return false;
        }
        MoneyTransferMethodDto moneyTransferMethodDto = (MoneyTransferMethodDto) obj;
        return epx.f(this.type, moneyTransferMethodDto.type) && this.enabled == moneyTransferMethodDto.enabled && epx.f(this.typeId, moneyTransferMethodDto.typeId) && epx.f(this.status, moneyTransferMethodDto.status) && epx.f(this.balance, moneyTransferMethodDto.balance) && epx.f(this.currency, moneyTransferMethodDto.currency) && epx.f(this.minAmount, moneyTransferMethodDto.minAmount) && epx.f(this.maxAmount, moneyTransferMethodDto.maxAmount) && epx.f(this.maxReceiveAmount, moneyTransferMethodDto.maxReceiveAmount) && epx.f(this.f77receivers, moneyTransferMethodDto.f77receivers);
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int b = qoy.b(this.type.hashCode() * 31, 31, this.enabled);
        Integer num = this.typeId;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.status;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.balance;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.currency;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f2 = this.minAmount;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.maxAmount;
        int hashCode6 = (hashCode5 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.maxReceiveAmount;
        int hashCode7 = (hashCode6 + (f4 == null ? 0 : f4.hashCode())) * 31;
        List<MoneyTransferMethodDto> list = this.f77receivers;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyTransferMethodDto(type=");
        sb.append(this.type);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", typeId=");
        sb.append(this.typeId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", minAmount=");
        sb.append(this.minAmount);
        sb.append(", maxAmount=");
        sb.append(this.maxAmount);
        sb.append(", maxReceiveAmount=");
        sb.append(this.maxReceiveAmount);
        sb.append(", receivers=");
        return ms9.a(')', sb, this.f77receivers);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeInt(this.enabled ? 1 : 0);
        Integer num = this.typeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.status);
        Float f = this.balance;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.currency);
        Float f2 = this.minAmount;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Float f3 = this.maxAmount;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        Float f4 = this.maxReceiveAmount;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f4);
        }
        List<MoneyTransferMethodDto> list = this.f77receivers;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f5 = dn.f(parcel, list, 1);
        while (f5.hasNext()) {
            ((MoneyTransferMethodDto) f5.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MoneyTransferMethodDto(String str, boolean z, Integer num, String str2, Float f, String str3, Float f2, Float f3, Float f4, List list, int i, zcl zclVar) {
        this(str, z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : f2, (i & 128) != 0 ? null : f3, (i & 256) != 0 ? null : f4, (i & 512) != 0 ? null : list);
    }
}
