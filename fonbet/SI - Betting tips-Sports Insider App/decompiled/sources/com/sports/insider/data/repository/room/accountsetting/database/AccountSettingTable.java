package com.sports.insider.data.repository.room.accountsetting.database;

import androidx.annotation.Keep;
import d9.e;
import db.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/sports/insider/data/repository/room/accountsetting/database/AccountSettingTable;", "", "", "idNameSetting", "", "valueSetting", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/sports/insider/data/repository/room/accountsetting/database/AccountSettingTable;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdNameSetting", "setIdNameSetting", "(Ljava/lang/String;)V", "I", "getValueSetting", "setValueSetting", "(I)V", "AccountSettingTableNamed", "db/b", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AccountSettingTable {

    @NotNull
    public static final b AccountSettingTableNamed = new b();

    @NotNull
    public static final String idNameSettingColumn = "account_setting_id_name";

    @NotNull
    public static final String tableName = "account_setting_table";

    @NotNull
    public static final String valueSettingColumn = "account_setting_value_name";

    @NotNull
    private String idNameSetting;
    private int valueSetting;

    public AccountSettingTable(@NotNull String idNameSetting, int i5) {
        Intrinsics.checkNotNullParameter(idNameSetting, "idNameSetting");
        this.idNameSetting = idNameSetting;
        this.valueSetting = i5;
    }

    public static /* synthetic */ AccountSettingTable copy$default(AccountSettingTable accountSettingTable, String str, int i5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = accountSettingTable.idNameSetting;
        }
        if ((i10 & 2) != 0) {
            i5 = accountSettingTable.valueSetting;
        }
        return accountSettingTable.copy(str, i5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIdNameSetting() {
        return this.idNameSetting;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValueSetting() {
        return this.valueSetting;
    }

    @NotNull
    public final AccountSettingTable copy(@NotNull String idNameSetting, int valueSetting) {
        Intrinsics.checkNotNullParameter(idNameSetting, "idNameSetting");
        return new AccountSettingTable(idNameSetting, valueSetting);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSettingTable)) {
            return false;
        }
        AccountSettingTable accountSettingTable = (AccountSettingTable) other;
        return Intrinsics.areEqual(this.idNameSetting, accountSettingTable.idNameSetting) && this.valueSetting == accountSettingTable.valueSetting;
    }

    @NotNull
    public final String getIdNameSetting() {
        return this.idNameSetting;
    }

    public final int getValueSetting() {
        return this.valueSetting;
    }

    public int hashCode() {
        return (this.idNameSetting.hashCode() * 31) + this.valueSetting;
    }

    public final void setIdNameSetting(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNameSetting = str;
    }

    public final void setValueSetting(int i5) {
        this.valueSetting = i5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AccountSettingTable(idNameSetting=");
        sb2.append(this.idNameSetting);
        sb2.append(", valueSetting=");
        return e.i(sb2, this.valueSetting, ')');
    }

    public /* synthetic */ AccountSettingTable(String str, int i5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? 0 : i5);
    }
}
