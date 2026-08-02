package com.sports.insider.data.room.general.table;

import androidx.annotation.Keep;
import d9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vb.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b%\b\u0081\b\u0018\u0000 L2\u00020\u0001:\u0001MB\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJª\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010/R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010,\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010/R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010,\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010/R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010,\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010/R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u00109R\"\u0010\t\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u00109R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010,\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010,\u001a\u0004\b>\u0010\u0015\"\u0004\b?\u0010/R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010,\u001a\u0004\b@\u0010\u0015\"\u0004\bA\u0010/R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\bB\u0010\u0015\"\u0004\bC\u0010/R\"\u0010\u000e\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u00106\u001a\u0004\bD\u0010\u001a\"\u0004\bE\u00109R\"\u0010\u000f\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u00106\u001a\u0004\bF\u0010\u001a\"\u0004\bG\u00109R\"\u0010\u0010\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u00109R\"\u0010\u0011\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u00106\u001a\u0004\bJ\u0010\u001a\"\u0004\bK\u00109¨\u0006N"}, d2 = {"Lcom/sports/insider/data/room/general/table/AccountTable;", "", "", AccountTable.idUserColumn, AccountTable.tokenColumn, AccountTable.oldDeviceIdColumn, AccountTable.deviceIdColumn, "", AccountTable.countPremiumColumn, AccountTable.countExpressColumn, AccountTable.emailColumn, "name", AccountTable.surnameColumn, AccountTable.avatarColumn, AccountTable.endTimeLiveColumn, AccountTable.endTimePremiumColumn, AccountTable.endTimeExpressColumn, AccountTable.endTimeDiamondColumn, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)Lcom/sports/insider/data/room/general/table/AccountTable;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdUser", "setIdUser", "(Ljava/lang/String;)V", "getToken", "setToken", "getOldDeviceId", "setOldDeviceId", "getDeviceId", "setDeviceId", "I", "getCountPremium", "setCountPremium", "(I)V", "getCountExpress", "setCountExpress", "getEmail", "setEmail", "getName", "setName", "getSurname", "setSurname", "getAvatar", "setAvatar", "getEndTimeLive", "setEndTimeLive", "getEndTimePremium", "setEndTimePremium", "getEndTimeExpress", "setEndTimeExpress", "getEndTimeDiamond", "setEndTimeDiamond", "AccountTableNamed", "vb/a", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AccountTable {

    @NotNull
    public static final a AccountTableNamed = new a();

    @NotNull
    public static final String avatarColumn = "avatar";

    @NotNull
    public static final String countExpressColumn = "countExpress";

    @NotNull
    public static final String countPremiumColumn = "countPremium";

    @NotNull
    public static final String deviceIdColumn = "deviceId";

    @NotNull
    public static final String emailColumn = "email";

    @NotNull
    public static final String endTimeDiamondColumn = "endTimeDiamond";

    @NotNull
    public static final String endTimeExpressColumn = "endTimeExpress";

    @NotNull
    public static final String endTimeLiveColumn = "endTimeLive";

    @NotNull
    public static final String endTimePremiumColumn = "endTimePremium";

    @NotNull
    public static final String idUserColumn = "idUser";

    @NotNull
    public static final String nameColumn = "name";

    @NotNull
    public static final String oldDeviceIdColumn = "oldDeviceId";

    @NotNull
    public static final String surnameColumn = "surname";

    @NotNull
    public static final String tableName = "account_table";

    @NotNull
    public static final String tokenColumn = "token";

    @Nullable
    private String avatar;
    private int countExpress;
    private int countPremium;

    @Nullable
    private String deviceId;

    @Nullable
    private String email;
    private int endTimeDiamond;
    private int endTimeExpress;
    private int endTimeLive;
    private int endTimePremium;

    @NotNull
    private String idUser;

    @Nullable
    private String name;

    @Nullable
    private String oldDeviceId;

    @Nullable
    private String surname;

    @Nullable
    private String token;

    public AccountTable(@NotNull String idUser, @Nullable String str, @Nullable String str2, @Nullable String str3, int i5, int i10, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(idUser, "idUser");
        this.idUser = idUser;
        this.token = str;
        this.oldDeviceId = str2;
        this.deviceId = str3;
        this.countPremium = i5;
        this.countExpress = i10;
        this.email = str4;
        this.name = str5;
        this.surname = str6;
        this.avatar = str7;
        this.endTimeLive = i11;
        this.endTimePremium = i12;
        this.endTimeExpress = i13;
        this.endTimeDiamond = i14;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIdUser() {
        return this.idUser;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component11, reason: from getter */
    public final int getEndTimeLive() {
        return this.endTimeLive;
    }

    /* renamed from: component12, reason: from getter */
    public final int getEndTimePremium() {
        return this.endTimePremium;
    }

    /* renamed from: component13, reason: from getter */
    public final int getEndTimeExpress() {
        return this.endTimeExpress;
    }

    /* renamed from: component14, reason: from getter */
    public final int getEndTimeDiamond() {
        return this.endTimeDiamond;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getOldDeviceId() {
        return this.oldDeviceId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCountPremium() {
        return this.countPremium;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCountExpress() {
        return this.countExpress;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    @NotNull
    public final AccountTable copy(@NotNull String idUser, @Nullable String token, @Nullable String oldDeviceId, @Nullable String deviceId, int countPremium, int countExpress, @Nullable String email, @Nullable String name, @Nullable String surname, @Nullable String avatar, int endTimeLive, int endTimePremium, int endTimeExpress, int endTimeDiamond) {
        Intrinsics.checkNotNullParameter(idUser, "idUser");
        return new AccountTable(idUser, token, oldDeviceId, deviceId, countPremium, countExpress, email, name, surname, avatar, endTimeLive, endTimePremium, endTimeExpress, endTimeDiamond);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountTable)) {
            return false;
        }
        AccountTable accountTable = (AccountTable) other;
        return Intrinsics.areEqual(this.idUser, accountTable.idUser) && Intrinsics.areEqual(this.token, accountTable.token) && Intrinsics.areEqual(this.oldDeviceId, accountTable.oldDeviceId) && Intrinsics.areEqual(this.deviceId, accountTable.deviceId) && this.countPremium == accountTable.countPremium && this.countExpress == accountTable.countExpress && Intrinsics.areEqual(this.email, accountTable.email) && Intrinsics.areEqual(this.name, accountTable.name) && Intrinsics.areEqual(this.surname, accountTable.surname) && Intrinsics.areEqual(this.avatar, accountTable.avatar) && this.endTimeLive == accountTable.endTimeLive && this.endTimePremium == accountTable.endTimePremium && this.endTimeExpress == accountTable.endTimeExpress && this.endTimeDiamond == accountTable.endTimeDiamond;
    }

    @Nullable
    public String getAvatar() {
        return this.avatar;
    }

    public int getCountExpress() {
        return this.countExpress;
    }

    public int getCountPremium() {
        return this.countPremium;
    }

    @Nullable
    public String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    public int getEndTimeDiamond() {
        return this.endTimeDiamond;
    }

    public int getEndTimeExpress() {
        return this.endTimeExpress;
    }

    public int getEndTimeLive() {
        return this.endTimeLive;
    }

    public int getEndTimePremium() {
        return this.endTimePremium;
    }

    @NotNull
    public final String getIdUser() {
        return this.idUser;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    @Nullable
    public String getOldDeviceId() {
        return this.oldDeviceId;
    }

    @Nullable
    public String getSurname() {
        return this.surname;
    }

    @Nullable
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = this.idUser.hashCode() * 31;
        String str = this.token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.oldDeviceId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceId;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.countPremium) * 31) + this.countExpress) * 31;
        String str4 = this.email;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.surname;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.avatar;
        return ((((((((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.endTimeLive) * 31) + this.endTimePremium) * 31) + this.endTimeExpress) * 31) + this.endTimeDiamond;
    }

    public void setAvatar(@Nullable String str) {
        this.avatar = str;
    }

    public void setCountExpress(int i5) {
        this.countExpress = i5;
    }

    public void setCountPremium(int i5) {
        this.countPremium = i5;
    }

    public void setDeviceId(@Nullable String str) {
        this.deviceId = str;
    }

    public void setEmail(@Nullable String str) {
        this.email = str;
    }

    public void setEndTimeDiamond(int i5) {
        this.endTimeDiamond = i5;
    }

    public void setEndTimeExpress(int i5) {
        this.endTimeExpress = i5;
    }

    public void setEndTimeLive(int i5) {
        this.endTimeLive = i5;
    }

    public void setEndTimePremium(int i5) {
        this.endTimePremium = i5;
    }

    public final void setIdUser(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idUser = str;
    }

    public void setName(@Nullable String str) {
        this.name = str;
    }

    public void setOldDeviceId(@Nullable String str) {
        this.oldDeviceId = str;
    }

    public void setSurname(@Nullable String str) {
        this.surname = str;
    }

    public void setToken(@Nullable String str) {
        this.token = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AccountTable(idUser=");
        sb2.append(this.idUser);
        sb2.append(", token=");
        sb2.append(this.token);
        sb2.append(", oldDeviceId=");
        sb2.append(this.oldDeviceId);
        sb2.append(", deviceId=");
        sb2.append(this.deviceId);
        sb2.append(", countPremium=");
        sb2.append(this.countPremium);
        sb2.append(", countExpress=");
        sb2.append(this.countExpress);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", surname=");
        sb2.append(this.surname);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", endTimeLive=");
        sb2.append(this.endTimeLive);
        sb2.append(", endTimePremium=");
        sb2.append(this.endTimePremium);
        sb2.append(", endTimeExpress=");
        sb2.append(this.endTimeExpress);
        sb2.append(", endTimeDiamond=");
        return e.i(sb2, this.endTimeDiamond, ')');
    }

    public /* synthetic */ AccountTable(String str, String str2, String str3, String str4, int i5, int i10, String str5, String str6, String str7, String str8, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i15 & 16) != 0 ? 0 : i5, (i15 & 32) != 0 ? 0 : i10, str5, str6, str7, str8, (i15 & Segment.SHARE_MINIMUM) != 0 ? 0 : i11, (i15 & 2048) != 0 ? 0 : i12, (i15 & 4096) != 0 ? 0 : i13, (i15 & Segment.SIZE) != 0 ? 0 : i14);
    }
}
