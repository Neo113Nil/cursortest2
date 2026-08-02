package com.sports.insider.data.repository.room.billing;

import androidx.annotation.Keep;
import eb.p;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nc.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0001\u0018\u0000 72\u00020\u0001:\u00018Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001a\u0010\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010(R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010(R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010%\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010(R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010%\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010(R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010(R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010%\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010(R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010(R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010(¨\u00069"}, d2 = {"Lcom/sports/insider/data/repository/room/billing/PricesTable;", "Lnc/f;", "", PricesTable.typePriceColumn, "", "type", PricesTable.currentPriceColumn, PricesTable.standardPriceColumn, PricesTable.currentPlanIdColumn, PricesTable.standardPlanIdColumn, PricesTable.currentOfferIdColumn, PricesTable.standardOfferIdColumn, PricesTable.endTimeColumn, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "endTimeSecond", "()J", "", "expired", "()Z", "planId", "()Ljava/lang/String;", "offerId", "planIdStrike", "offerIdStrike", "productId", "productIdStrike", "", "reset", "()V", "timeNowSecond", "I", "getTypePrice", "()I", "setTypePrice", "(I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getCurrentPrice", "setCurrentPrice", "getStandardPrice", "setStandardPrice", "getCurrentPlanId", "setCurrentPlanId", "getStandardPlanId", "setStandardPlanId", "getCurrentOfferId", "setCurrentOfferId", "getStandardOfferId", "setStandardOfferId", "getEndTime", "setEndTime", "Companion", "eb/p", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPricesTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PricesTable.kt\ncom/sports/insider/data/repository/room/billing/PricesTable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
/* loaded from: classes.dex */
public final class PricesTable implements f {

    @NotNull
    public static final p Companion = new p();

    @NotNull
    public static final String currentOfferIdColumn = "currentOfferId";

    @NotNull
    public static final String currentPlanIdColumn = "currentPlanId";

    @NotNull
    public static final String currentPriceColumn = "currentPrice";

    @NotNull
    public static final String endTimeColumn = "endTime";

    @NotNull
    public static final String standardOfferIdColumn = "standardOfferId";

    @NotNull
    public static final String standardPlanIdColumn = "standardPlanId";

    @NotNull
    public static final String standardPriceColumn = "standardPrice";

    @NotNull
    public static final String tableName = "prices_table";

    @NotNull
    public static final String typeColumn = "type";

    @NotNull
    public static final String typePriceColumn = "typePrice";

    @Nullable
    private String currentOfferId;

    @Nullable
    private String currentPlanId;

    @Nullable
    private String currentPrice;

    @Nullable
    private String endTime;

    @Nullable
    private String standardOfferId;

    @Nullable
    private String standardPlanId;

    @Nullable
    private String standardPrice;

    @NotNull
    private String type;
    private int typePrice;

    public PricesTable(int i5, @NotNull String type, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.typePrice = i5;
        this.type = type;
        this.currentPrice = str;
        this.standardPrice = str2;
        this.currentPlanId = str3;
        this.standardPlanId = str4;
        this.currentOfferId = str5;
        this.standardOfferId = str6;
        this.endTime = str7;
    }

    private final void reset() {
        setType("standard");
        setEndTime(null);
        setCurrentPrice(null);
    }

    private final long timeNowSecond() {
        return Instant.now().getEpochSecond();
    }

    @Override // nc.f
    public long endTimeSecond() {
        if (getEndTime() == null) {
            return 0L;
        }
        return ZonedDateTime.parse(getEndTime(), DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond();
    }

    @Override // nc.f
    public boolean expired() {
        if (getEndTime() == null && Intrinsics.areEqual(getType(), "standard")) {
            return true;
        }
        if (getEndTime() == null || Intrinsics.areEqual(getType(), "standard")) {
            reset();
            return true;
        }
        boolean z5 = endTimeSecond() < timeNowSecond();
        if (z5) {
            reset();
        }
        return z5;
    }

    @Override // nc.f
    @Nullable
    public String getCurrentOfferId() {
        return this.currentOfferId;
    }

    @Override // nc.f
    @Nullable
    public String getCurrentPlanId() {
        return this.currentPlanId;
    }

    @Override // nc.f
    @Nullable
    public String getCurrentPrice() {
        return this.currentPrice;
    }

    @Override // nc.f
    @Nullable
    public String getEndTime() {
        return this.endTime;
    }

    @Override // nc.f
    @Nullable
    public String getStandardOfferId() {
        return this.standardOfferId;
    }

    @Override // nc.f
    @Nullable
    public String getStandardPlanId() {
        return this.standardPlanId;
    }

    @Override // nc.f
    @Nullable
    public String getStandardPrice() {
        return this.standardPrice;
    }

    @Override // nc.f
    @NotNull
    public String getType() {
        return this.type;
    }

    public final int getTypePrice() {
        return this.typePrice;
    }

    @Override // nc.f
    @Nullable
    public String offerId() {
        if (getEndTime() == null) {
            return getStandardOfferId();
        }
        String type = getType();
        if (!Intrinsics.areEqual(type, "upsale") && !Intrinsics.areEqual(type, "discount")) {
            return getStandardOfferId();
        }
        if (endTimeSecond() <= timeNowSecond()) {
            return getStandardOfferId();
        }
        String currentOfferId = getCurrentOfferId();
        return currentOfferId == null ? getStandardOfferId() : currentOfferId;
    }

    @Override // nc.f
    @Nullable
    public String offerIdStrike() {
        if (getEndTime() != null && getCurrentOfferId() != null && Intrinsics.areEqual(getType(), "discount") && endTimeSecond() > timeNowSecond()) {
            return getStandardOfferId();
        }
        return null;
    }

    @Override // nc.f
    @Nullable
    public String planId() {
        if (getEndTime() == null) {
            return getStandardPlanId();
        }
        String type = getType();
        if (!Intrinsics.areEqual(type, "upsale") && !Intrinsics.areEqual(type, "discount")) {
            return getStandardPlanId();
        }
        if (endTimeSecond() <= timeNowSecond()) {
            return getStandardPlanId();
        }
        String currentPlanId = getCurrentPlanId();
        return currentPlanId == null ? getStandardPlanId() : currentPlanId;
    }

    @Override // nc.f
    @Nullable
    public String planIdStrike() {
        if (getEndTime() != null && getCurrentPlanId() != null && Intrinsics.areEqual(getType(), "discount") && endTimeSecond() > timeNowSecond()) {
            return getStandardPlanId();
        }
        return null;
    }

    @Override // nc.f
    @NotNull
    public String productId() {
        if (getEndTime() == null) {
            String standardPrice = getStandardPrice();
            return standardPrice == null ? "" : standardPrice;
        }
        String type = getType();
        if (!Intrinsics.areEqual(type, "upsale") && !Intrinsics.areEqual(type, "discount")) {
            String standardPrice2 = getStandardPrice();
            return standardPrice2 == null ? "" : standardPrice2;
        }
        if (endTimeSecond() > timeNowSecond()) {
            String currentPrice = getCurrentPrice();
            return (currentPrice == null && (currentPrice = getStandardPrice()) == null) ? "" : currentPrice;
        }
        String standardPrice3 = getStandardPrice();
        return standardPrice3 == null ? "" : standardPrice3;
    }

    @Override // nc.f
    @Nullable
    public String productIdStrike() {
        if (getEndTime() != null && getCurrentPrice() != null && Intrinsics.areEqual(getType(), "discount") && endTimeSecond() > timeNowSecond()) {
            return getStandardPrice();
        }
        return null;
    }

    public void setCurrentOfferId(@Nullable String str) {
        this.currentOfferId = str;
    }

    public void setCurrentPlanId(@Nullable String str) {
        this.currentPlanId = str;
    }

    public void setCurrentPrice(@Nullable String str) {
        this.currentPrice = str;
    }

    public void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public void setStandardOfferId(@Nullable String str) {
        this.standardOfferId = str;
    }

    public void setStandardPlanId(@Nullable String str) {
        this.standardPlanId = str;
    }

    public void setStandardPrice(@Nullable String str) {
        this.standardPrice = str;
    }

    public void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setTypePrice(int i5) {
        this.typePrice = i5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ PricesTable(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 2
            if (r1 == 0) goto L8
            java.lang.String r12 = "standard"
        L8:
            r2 = r12
            r12 = r0 & 4
            r1 = 0
            if (r12 == 0) goto L10
            r3 = r1
            goto L11
        L10:
            r3 = r13
        L11:
            r12 = r0 & 16
            if (r12 == 0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r15
        L18:
            r12 = r0 & 64
            if (r12 == 0) goto L1e
            r7 = r1
            goto L20
        L1e:
            r7 = r17
        L20:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L2d
            r9 = r1
            r0 = r10
            r4 = r14
            r6 = r16
            r8 = r18
            r1 = r11
            goto L36
        L2d:
            r9 = r19
            r0 = r10
            r1 = r11
            r4 = r14
            r6 = r16
            r8 = r18
        L36:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sports.insider.data.repository.room.billing.PricesTable.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
