package ru.ozon.app.android.abtool.data.local.entity;

import Am.C2438a;
import B0.C2454a;
import C.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/abtool/data/local/entity/ExperimentEntity;", "", "", "id", "variantId", "", "alias", "<init>", "(IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getVariantId", "Ljava/lang/String;", "getAlias", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ExperimentEntity {

    @NotNull
    private final String alias;
    private final int id;
    private final int variantId;

    public ExperimentEntity(int i11, int i12, @NotNull String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.id = i11;
        this.variantId = i12;
        this.alias = alias;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperimentEntity)) {
            return false;
        }
        ExperimentEntity experimentEntity = (ExperimentEntity) other;
        return this.id == experimentEntity.id && this.variantId == experimentEntity.variantId && Intrinsics.d(this.alias, experimentEntity.alias);
    }

    @NotNull
    public final String getAlias() {
        return this.alias;
    }

    public final int getId() {
        return this.id;
    }

    public final int getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        return this.alias.hashCode() + C2454a.a(this.variantId, Integer.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        int i12 = this.variantId;
        return o0.c(C2438a.a("ExperimentEntity(id=", i11, ", variantId=", ", alias=", i12), this.alias, ")");
    }
}
