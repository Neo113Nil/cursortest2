package com.sports.insider.data.room.general;

import com.sports.insider.data.room.general.AppDatabase_Impl;
import com.sports.insider.data.room.general.table.AccountTable;
import com.sports.insider.data.room.general.table.OrdersTable;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import db.c;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/data/room/general/AppDatabase_Impl;", "Lcom/sports/insider/data/room/general/AppDatabase;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: n, reason: collision with root package name */
    public final t f6868n;

    /* renamed from: o, reason: collision with root package name */
    public final t f6869o;

    public AppDatabase_Impl() {
        final int i5 = 0;
        this.f6868n = k.b(new Function0(this) { // from class: sb.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f23405b;

            {
                this.f23405b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new tb.f(this.f23405b);
                    default:
                        return new ub.f(this.f23405b);
                }
            }
        });
        final int i10 = 1;
        this.f6869o = k.b(new Function0(this) { // from class: sb.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f23405b;

            {
                this.f23405b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new tb.f(this.f23405b);
                    default:
                        return new ub.f(this.f23405b);
                }
            }
        });
    }

    @Override // k2.w
    public final List c(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // k2.w
    public final i d() {
        return new i(this, new LinkedHashMap(), new LinkedHashMap(), AccountTable.tableName, OrdersTable.tableName, "request_update_table", "prediction_kind_table", "favorite_table", "table_prediction_preview", "prediction_meeting_table", PredictionTable.tableName);
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
        ag.c orCreateKotlinClass = Reflection.getOrCreateKotlinClass(tb.f.class);
        e0 e0Var = e0.f19204a;
        linkedHashMap.put(orCreateKotlinClass, e0Var);
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(ub.f.class), e0Var);
        return linkedHashMap;
    }

    @Override // com.sports.insider.data.room.general.AppDatabase
    public final tb.f t() {
        return (tb.f) this.f6868n.getValue();
    }

    @Override // com.sports.insider.data.room.general.AppDatabase
    public final ub.f u() {
        return (ub.f) this.f6869o.getValue();
    }
}
