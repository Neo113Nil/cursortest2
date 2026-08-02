package ru.ozon.fintech.features.offline.data.model.transfer;

import C.o0;
import Ds.C2880a;
import G.g;
import I1.w;
import Kk.C3532b;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001d¨\u00062"}, d2 = {"Lru/ozon/fintech/features/offline/data/model/transfer/TransferData;", "", "clientPhone", "Lru/ozon/fintech/features/offline/data/model/transfer/ClientPhone;", "banks", "", "Lru/ozon/fintech/features/offline/data/model/transfer/BankInfo;", "commissions", "Lru/ozon/fintech/features/offline/data/model/transfer/Commissions;", "limitCents", "Lru/ozon/fintech/features/offline/data/model/transfer/LimitCents;", "transferPhone", "", "smsPaymentsFlagValue", "", "identificationLevel", "activeBlocks", "smsTemplate", "<init>", "(Lru/ozon/fintech/features/offline/data/model/transfer/ClientPhone;Ljava/util/List;Lru/ozon/fintech/features/offline/data/model/transfer/Commissions;Lru/ozon/fintech/features/offline/data/model/transfer/LimitCents;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getClientPhone", "()Lru/ozon/fintech/features/offline/data/model/transfer/ClientPhone;", "getBanks", "()Ljava/util/List;", "getCommissions", "()Lru/ozon/fintech/features/offline/data/model/transfer/Commissions;", "getLimitCents", "()Lru/ozon/fintech/features/offline/data/model/transfer/LimitCents;", "getTransferPhone", "()Ljava/lang/String;", "getSmsPaymentsFlagValue", "()Z", "getIdentificationLevel", "getActiveBlocks", "getSmsTemplate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferData {

    @i(name = "activeBlocks")
    @NotNull
    private final List<String> activeBlocks;

    @i(name = "banks")
    @NotNull
    private final List<BankInfo> banks;

    @i(name = "clientPhone")
    @NotNull
    private final ClientPhone clientPhone;

    @i(name = "commissions")
    @NotNull
    private final Commissions commissions;

    @i(name = "identificationLevel")
    @NotNull
    private final String identificationLevel;

    @i(name = "limitsCents")
    @NotNull
    private final LimitCents limitCents;

    @i(name = "smsPaymentsFlagValue")
    private final boolean smsPaymentsFlagValue;

    @i(name = "smsTemplate")
    private final String smsTemplate;

    @i(name = "transferPhone")
    @NotNull
    private final String transferPhone;

    public TransferData(@NotNull ClientPhone clientPhone, @NotNull List<BankInfo> banks, @NotNull Commissions commissions, @NotNull LimitCents limitCents, @NotNull String transferPhone, boolean z11, @NotNull String identificationLevel, @NotNull List<String> activeBlocks, String str) {
        Intrinsics.checkNotNullParameter(clientPhone, "clientPhone");
        Intrinsics.checkNotNullParameter(banks, "banks");
        Intrinsics.checkNotNullParameter(commissions, "commissions");
        Intrinsics.checkNotNullParameter(limitCents, "limitCents");
        Intrinsics.checkNotNullParameter(transferPhone, "transferPhone");
        Intrinsics.checkNotNullParameter(identificationLevel, "identificationLevel");
        Intrinsics.checkNotNullParameter(activeBlocks, "activeBlocks");
        this.clientPhone = clientPhone;
        this.banks = banks;
        this.commissions = commissions;
        this.limitCents = limitCents;
        this.transferPhone = transferPhone;
        this.smsPaymentsFlagValue = z11;
        this.identificationLevel = identificationLevel;
        this.activeBlocks = activeBlocks;
        this.smsTemplate = str;
    }

    public static /* synthetic */ TransferData copy$default(TransferData transferData, ClientPhone clientPhone, List list, Commissions commissions, LimitCents limitCents, String str, boolean z11, String str2, List list2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            clientPhone = transferData.clientPhone;
        }
        if ((i11 & 2) != 0) {
            list = transferData.banks;
        }
        if ((i11 & 4) != 0) {
            commissions = transferData.commissions;
        }
        if ((i11 & 8) != 0) {
            limitCents = transferData.limitCents;
        }
        if ((i11 & 16) != 0) {
            str = transferData.transferPhone;
        }
        if ((i11 & 32) != 0) {
            z11 = transferData.smsPaymentsFlagValue;
        }
        if ((i11 & 64) != 0) {
            str2 = transferData.identificationLevel;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list2 = transferData.activeBlocks;
        }
        if ((i11 & 256) != 0) {
            str3 = transferData.smsTemplate;
        }
        List list3 = list2;
        String str4 = str3;
        boolean z12 = z11;
        String str5 = str2;
        String str6 = str;
        Commissions commissions2 = commissions;
        return transferData.copy(clientPhone, list, commissions2, limitCents, str6, z12, str5, list3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ClientPhone getClientPhone() {
        return this.clientPhone;
    }

    @NotNull
    public final List<BankInfo> component2() {
        return this.banks;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Commissions getCommissions() {
        return this.commissions;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final LimitCents getLimitCents() {
        return this.limitCents;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTransferPhone() {
        return this.transferPhone;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSmsPaymentsFlagValue() {
        return this.smsPaymentsFlagValue;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getIdentificationLevel() {
        return this.identificationLevel;
    }

    @NotNull
    public final List<String> component8() {
        return this.activeBlocks;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSmsTemplate() {
        return this.smsTemplate;
    }

    @NotNull
    public final TransferData copy(@NotNull ClientPhone clientPhone, @NotNull List<BankInfo> banks, @NotNull Commissions commissions, @NotNull LimitCents limitCents, @NotNull String transferPhone, boolean smsPaymentsFlagValue, @NotNull String identificationLevel, @NotNull List<String> activeBlocks, String smsTemplate) {
        Intrinsics.checkNotNullParameter(clientPhone, "clientPhone");
        Intrinsics.checkNotNullParameter(banks, "banks");
        Intrinsics.checkNotNullParameter(commissions, "commissions");
        Intrinsics.checkNotNullParameter(limitCents, "limitCents");
        Intrinsics.checkNotNullParameter(transferPhone, "transferPhone");
        Intrinsics.checkNotNullParameter(identificationLevel, "identificationLevel");
        Intrinsics.checkNotNullParameter(activeBlocks, "activeBlocks");
        return new TransferData(clientPhone, banks, commissions, limitCents, transferPhone, smsPaymentsFlagValue, identificationLevel, activeBlocks, smsTemplate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferData)) {
            return false;
        }
        TransferData transferData = (TransferData) other;
        return Intrinsics.d(this.clientPhone, transferData.clientPhone) && Intrinsics.d(this.banks, transferData.banks) && Intrinsics.d(this.commissions, transferData.commissions) && Intrinsics.d(this.limitCents, transferData.limitCents) && Intrinsics.d(this.transferPhone, transferData.transferPhone) && this.smsPaymentsFlagValue == transferData.smsPaymentsFlagValue && Intrinsics.d(this.identificationLevel, transferData.identificationLevel) && Intrinsics.d(this.activeBlocks, transferData.activeBlocks) && Intrinsics.d(this.smsTemplate, transferData.smsTemplate);
    }

    @NotNull
    public final List<String> getActiveBlocks() {
        return this.activeBlocks;
    }

    @NotNull
    public final List<BankInfo> getBanks() {
        return this.banks;
    }

    @NotNull
    public final ClientPhone getClientPhone() {
        return this.clientPhone;
    }

    @NotNull
    public final Commissions getCommissions() {
        return this.commissions;
    }

    @NotNull
    public final String getIdentificationLevel() {
        return this.identificationLevel;
    }

    @NotNull
    public final LimitCents getLimitCents() {
        return this.limitCents;
    }

    public final boolean getSmsPaymentsFlagValue() {
        return this.smsPaymentsFlagValue;
    }

    public final String getSmsTemplate() {
        return this.smsTemplate;
    }

    @NotNull
    public final String getTransferPhone() {
        return this.transferPhone;
    }

    public int hashCode() {
        int b11 = g.b(g.a(C3532b.a(g.a((this.limitCents.hashCode() + ((this.commissions.hashCode() + g.b(this.clientPhone.hashCode() * 31, 31, this.banks)) * 31)) * 31, 31, this.transferPhone), 31, this.smsPaymentsFlagValue), 31, this.identificationLevel), 31, this.activeBlocks);
        String str = this.smsTemplate;
        return b11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        ClientPhone clientPhone = this.clientPhone;
        List<BankInfo> list = this.banks;
        Commissions commissions = this.commissions;
        LimitCents limitCents = this.limitCents;
        String str = this.transferPhone;
        boolean z11 = this.smsPaymentsFlagValue;
        String str2 = this.identificationLevel;
        List<String> list2 = this.activeBlocks;
        String str3 = this.smsTemplate;
        StringBuilder sb2 = new StringBuilder("TransferData(clientPhone=");
        sb2.append(clientPhone);
        sb2.append(", banks=");
        sb2.append(list);
        sb2.append(", commissions=");
        sb2.append(commissions);
        sb2.append(", limitCents=");
        sb2.append(limitCents);
        sb2.append(", transferPhone=");
        C2880a.c(str, ", smsPaymentsFlagValue=", ", identificationLevel=", sb2, z11);
        w.d(str2, ", activeBlocks=", ", smsTemplate=", sb2, list2);
        return o0.c(sb2, str3, ")");
    }

    public /* synthetic */ TransferData(ClientPhone clientPhone, List list, Commissions commissions, LimitCents limitCents, String str, boolean z11, String str2, List list2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientPhone, list, commissions, limitCents, str, z11, str2, list2, (i11 & 256) != 0 ? null : str3);
    }
}
