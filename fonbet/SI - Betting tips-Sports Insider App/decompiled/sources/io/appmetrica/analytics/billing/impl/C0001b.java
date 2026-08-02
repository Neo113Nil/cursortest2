package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.billing.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001b implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final i f11412a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0001b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d fromModel(@NotNull C0000a c0000a) {
        d dVar = new d();
        List list = c0000a.f11410a;
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f11412a.fromModel((BillingInfo) it.next()));
        }
        Object[] array = arrayList.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        dVar.f11423a = (c[]) array;
        dVar.f11424b = c0000a.f11411b;
        return dVar;
    }

    public C0001b(@NotNull i iVar) {
        this.f11412a = iVar;
    }

    public /* synthetic */ C0001b(i iVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new i() : iVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0000a toModel(@NotNull d dVar) {
        c[] cVarArr = dVar.f11423a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList.add(this.f11412a.toModel(cVar));
        }
        return new C0000a(arrayList, dVar.f11424b);
    }
}
