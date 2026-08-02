package ru.ozon.app.android.abtool.data.repository;

import Am.C2438a;
import R2.InterfaceC3917k;
import V2.b;
import W2.f;
import android.content.Context;
import id.e;
import kotlin.Metadata;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroid/content/Context;", "LR2/k;", "LW2/f;", "dataStore$delegate", "Lid/e;", "getDataStore", "(Landroid/content/Context;)LR2/k;", "dataStore", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbVariantsDataSourceKt {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AbVariantsDataSourceKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};

    @NotNull
    private static final e dataStore$delegate = b.a("ab_variants_data_store", null, null, null, 14);

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3917k<f> getDataStore(Context context) {
        return (InterfaceC3917k) dataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }
}
