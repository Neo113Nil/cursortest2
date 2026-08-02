package com.sports.insider.data.repository.room.billing;

import a2.q;
import db.c;
import eb.e;
import gf.k;
import gf.t;
import j1.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k2.i;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/data/repository/room/billing/BillingDatabase_Impl;", "Lcom/sports/insider/data/repository/room/billing/BillingDatabase;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BillingDatabase_Impl extends BillingDatabase {

    /* renamed from: n, reason: collision with root package name */
    public final t f6841n = k.b(new q(11, this));

    @Override // k2.w
    public final List c(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // k2.w
    public final i d() {
        return new i(this, new LinkedHashMap(), new LinkedHashMap(), "sku_details_table", PurchaseSubsTable.tableName, PricesTable.tableName, SkuIdContentTypeTable.tableName);
    }

    @Override // k2.w
    public final f e() {
        return new c(this);
    }

    @Override // k2.w
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // k2.w
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(e.class), e0.f19204a);
        return linkedHashMap;
    }

    @Override // com.sports.insider.data.repository.room.billing.BillingDatabase
    public final e t() {
        return (e) this.f6841n.getValue();
    }
}
