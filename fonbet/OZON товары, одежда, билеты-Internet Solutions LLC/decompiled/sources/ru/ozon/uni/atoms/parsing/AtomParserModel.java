package ru.ozon.uni.atoms.parsing;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/parsing/AtomParserModel;", "", "", "label", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/data/AtomDTO;", "model", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "Ljava/lang/Class;", "getModel", "()Ljava/lang/Class;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AtomParserModel {

    @NotNull
    private final String label;

    @NotNull
    private final Class<? extends AtomDTO> model;

    public AtomParserModel(@NotNull String label, @NotNull Class<? extends AtomDTO> model) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(model, "model");
        this.label = label;
        this.model = model;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtomParserModel)) {
            return false;
        }
        AtomParserModel atomParserModel = (AtomParserModel) other;
        return Intrinsics.d(this.label, atomParserModel.label) && Intrinsics.d(this.model, atomParserModel.model);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final Class<? extends AtomDTO> getModel() {
        return this.model;
    }

    public int hashCode() {
        return this.model.hashCode() + (this.label.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AtomParserModel(label=" + this.label + ", model=" + this.model + ")";
    }
}
