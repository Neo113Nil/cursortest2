package ru.ozon.app.android.atoms.parsing.adapter;

import Nk.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oi.C8737a;
import oi.C8738b;
import oi.C8739c;
import oi.C8740d;
import oi.C8741e;
import oi.InterfaceC8742f;
import oi.g;
import org.jetbrains.annotations.NotNull;
import pi.k;
import pi.l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/parsing/adapter/DsTokenJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Loi/f;", "Ljava/lang/Class;", "clazz", "<init>", "(Ljava/lang/Class;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Loi/f;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Loi/f;)V", "Ljava/lang/Class;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DsTokenJsonAdapter extends JsonAdapter<InterfaceC8742f> {
    public static final int $stable = 8;

    @NotNull
    private final Class<?> clazz;

    public DsTokenJsonAdapter(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.clazz = clazz;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InterfaceC8742f fromJson(@NotNull n reader) {
        l f7;
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.p() == n.b.NULL) {
            reader.m();
            return null;
        }
        String nextString = reader.nextString();
        Class<?> cls = this.clazz;
        if (Intrinsics.d(cls, C8737a.class)) {
            f7 = k.a();
        } else if (Intrinsics.d(cls, C8740d.class)) {
            f7 = k.d();
        } else if (Intrinsics.d(cls, C8741e.class)) {
            f7 = k.e();
        } else if (Intrinsics.d(cls, C8738b.class)) {
            f7 = k.b();
        } else if (Intrinsics.d(cls, C8739c.class)) {
            f7 = k.c();
        } else {
            if (!Intrinsics.d(cls, g.class)) {
                throw new com.squareup.moshi.k(a.b("unknown type of token ", nextString));
            }
            f7 = k.f();
        }
        Intrinsics.f(nextString);
        InterfaceC8742f byId = f7.getById(nextString);
        if (byId != null) {
            return byId;
        }
        throw new com.squareup.moshi.k("unknown token ".concat(nextString));
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InterfaceC8742f value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.R(value != null ? value.getId() : null);
    }
}
