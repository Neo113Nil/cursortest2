package ru.ozon.app.android.abtool;

import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/abtool/Experiment;", "", "id", "", "variantId", "alias", "", "<init>", "(IILjava/lang/String;)V", "getId", "()I", "getVariantId", "getAlias", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "toString", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Experiment {

    @NotNull
    private final String alias;
    private final int id;
    private final int variantId;

    public Experiment(int i11, int i12, @NotNull String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.id = i11;
        this.variantId = i12;
        this.alias = alias;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Experiment.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.abtool.Experiment");
        Experiment experiment = (Experiment) other;
        return this.id == experiment.id && this.variantId == experiment.variantId && Intrinsics.d(this.alias, experiment.alias);
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
        return this.alias.hashCode() + (((this.id * 31) + this.variantId) * 31);
    }

    @NotNull
    public String toString() {
        String name = Experiment.class.getName();
        int i11 = this.id;
        int i12 = this.variantId;
        String str = this.alias;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("(id=");
        sb2.append(i11);
        sb2.append(", variantId=");
        sb2.append(i12);
        return C6594f.a(", alias='", str, "')", sb2);
    }
}
