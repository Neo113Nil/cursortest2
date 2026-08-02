package com.sofascore.model.newNetwork.post;

import defpackage.lkb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJJ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001e¨\u00062"}, d2 = {"Lcom/sofascore/model/newNetwork/post/UserPurchasePostBody;", "", "", "receipt", "packageId", "offerId", "", "offerStartTimestamp", "offerEndTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/post/UserPurchasePostBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Long;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/sofascore/model/newNetwork/post/UserPurchasePostBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReceipt", "getPackageId", "getOfferId", "Ljava/lang/Long;", "getOfferStartTimestamp", "getOfferEndTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserPurchasePostBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long offerEndTimestamp;

    @Nullable
    private final String offerId;

    @Nullable
    private final Long offerStartTimestamp;

    @Nullable
    private final String packageId;

    @NotNull
    private final String receipt;

    public /* synthetic */ UserPurchasePostBody(int i, String str, String str2, String str3, Long l, Long l2, t5h t5hVar) {
        if (1 != (i & 1)) {
            oea.z(i, 1, UserPurchasePostBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.receipt = str;
        if ((i & 2) == 0) {
            this.packageId = null;
        } else {
            this.packageId = str2;
        }
        if ((i & 4) == 0) {
            this.offerId = null;
        } else {
            this.offerId = str3;
        }
        if ((i & 8) == 0) {
            this.offerStartTimestamp = null;
        } else {
            this.offerStartTimestamp = l;
        }
        if ((i & 16) == 0) {
            this.offerEndTimestamp = null;
        } else {
            this.offerEndTimestamp = l2;
        }
    }

    public static /* synthetic */ UserPurchasePostBody copy$default(UserPurchasePostBody userPurchasePostBody, String str, String str2, String str3, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userPurchasePostBody.receipt;
        }
        if ((i & 2) != 0) {
            str2 = userPurchasePostBody.packageId;
        }
        if ((i & 4) != 0) {
            str3 = userPurchasePostBody.offerId;
        }
        if ((i & 8) != 0) {
            l = userPurchasePostBody.offerStartTimestamp;
        }
        if ((i & 16) != 0) {
            l2 = userPurchasePostBody.offerEndTimestamp;
        }
        Long l3 = l2;
        String str4 = str3;
        return userPurchasePostBody.copy(str, str2, str4, l, l3);
    }

    public static final /* synthetic */ void write$Self$model_release(UserPurchasePostBody self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.receipt);
        if (output.o(serialDesc) || self.packageId != null) {
            output.h(serialDesc, 1, uhi.a, self.packageId);
        }
        if (output.o(serialDesc) || self.offerId != null) {
            output.h(serialDesc, 2, uhi.a, self.offerId);
        }
        if (output.o(serialDesc) || self.offerStartTimestamp != null) {
            output.h(serialDesc, 3, lkb.a, self.offerStartTimestamp);
        }
        if (!output.o(serialDesc) && self.offerEndTimestamp == null) {
            return;
        }
        output.h(serialDesc, 4, lkb.a, self.offerEndTimestamp);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReceipt() {
        return this.receipt;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getOfferStartTimestamp() {
        return this.offerStartTimestamp;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getOfferEndTimestamp() {
        return this.offerEndTimestamp;
    }

    @NotNull
    public final UserPurchasePostBody copy(@NotNull String receipt, @Nullable String packageId, @Nullable String offerId, @Nullable Long offerStartTimestamp, @Nullable Long offerEndTimestamp) {
        receipt.getClass();
        return new UserPurchasePostBody(receipt, packageId, offerId, offerStartTimestamp, offerEndTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPurchasePostBody)) {
            return false;
        }
        UserPurchasePostBody userPurchasePostBody = (UserPurchasePostBody) other;
        return Intrinsics.c(this.receipt, userPurchasePostBody.receipt) && Intrinsics.c(this.packageId, userPurchasePostBody.packageId) && Intrinsics.c(this.offerId, userPurchasePostBody.offerId) && Intrinsics.c(this.offerStartTimestamp, userPurchasePostBody.offerStartTimestamp) && Intrinsics.c(this.offerEndTimestamp, userPurchasePostBody.offerEndTimestamp);
    }

    @Nullable
    public final Long getOfferEndTimestamp() {
        return this.offerEndTimestamp;
    }

    @Nullable
    public final String getOfferId() {
        return this.offerId;
    }

    @Nullable
    public final Long getOfferStartTimestamp() {
        return this.offerStartTimestamp;
    }

    @Nullable
    public final String getPackageId() {
        return this.packageId;
    }

    @NotNull
    public final String getReceipt() {
        return this.receipt;
    }

    public int hashCode() {
        int hashCode = this.receipt.hashCode() * 31;
        String str = this.packageId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.offerId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.offerStartTimestamp;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.offerEndTimestamp;
        return hashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.receipt;
        String str2 = this.packageId;
        String str3 = this.offerId;
        Long l = this.offerStartTimestamp;
        Long l2 = this.offerEndTimestamp;
        StringBuilder s = mz1.s("UserPurchasePostBody(receipt=", str, ", packageId=", str2, ", offerId=");
        s.append(str3);
        s.append(", offerStartTimestamp=");
        s.append(l);
        s.append(", offerEndTimestamp=");
        s.append(l2);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/post/UserPurchasePostBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/post/UserPurchasePostBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UserPurchasePostBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserPurchasePostBody(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable Long l2) {
        str.getClass();
        this.receipt = str;
        this.packageId = str2;
        this.offerId = str3;
        this.offerStartTimestamp = l;
        this.offerEndTimestamp = l2;
    }

    public /* synthetic */ UserPurchasePostBody(String str, String str2, String str3, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2);
    }
}
