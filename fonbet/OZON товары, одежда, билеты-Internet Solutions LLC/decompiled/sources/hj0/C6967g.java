package hj0;

import Am.C2438a;
import R2.InterfaceC3917k;
import android.content.Context;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* renamed from: hj0.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6967g {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f65625a = {C2438a.c(C6967g.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final V2.e f65626b = V2.b.a("tracker_configurations", null, null, null, 14);

    public static final InterfaceC3917k a(Context context) {
        return f65626b.getValue(context, f65625a[0]);
    }
}
