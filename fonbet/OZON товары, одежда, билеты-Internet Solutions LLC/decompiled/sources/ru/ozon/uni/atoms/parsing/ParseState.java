package ru.ozon.uni.atoms.parsing;

import com.squareup.moshi.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.Unsupported;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R+\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00038\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/uni/atoms/parsing/ParseState;", "", "", "", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/data/AtomDTO;", "types", "labels", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getTypes", "()Ljava/util/Map;", "getLabels", "Lru/ozon/uni/atoms/data/Unsupported;", "defaultType", "Lru/ozon/uni/atoms/data/Unsupported;", "getDefaultType", "()Lru/ozon/uni/atoms/data/Unsupported;", "labelKey", "Ljava/lang/String;", "getLabelKey", "Lcom/squareup/moshi/n$a;", "moshiOptions", "Lcom/squareup/moshi/n$a;", "getMoshiOptions", "()Lcom/squareup/moshi/n$a;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ParseState {

    @NotNull
    private final Unsupported defaultType;

    @NotNull
    private final String labelKey;

    @NotNull
    private final Map<Class<? extends AtomDTO>, String> labels;

    @NotNull
    private final n.a moshiOptions;

    @NotNull
    private final Map<String, Class<? extends AtomDTO>> types;

    /* JADX WARN: Multi-variable type inference failed */
    public ParseState(@NotNull Map<String, ? extends Class<? extends AtomDTO>> types, @NotNull Map<Class<? extends AtomDTO>, String> labels) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.types = types;
        this.labels = labels;
        this.defaultType = Unsupported.INSTANCE;
        this.labelKey = "type";
        n.a a11 = n.a.C0918a.a("type");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.moshiOptions = a11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParseState)) {
            return false;
        }
        ParseState parseState = (ParseState) other;
        return Intrinsics.d(this.types, parseState.types) && Intrinsics.d(this.labels, parseState.labels);
    }

    @NotNull
    public final Unsupported getDefaultType() {
        return this.defaultType;
    }

    @NotNull
    public final String getLabelKey() {
        return this.labelKey;
    }

    @NotNull
    public final Map<Class<? extends AtomDTO>, String> getLabels() {
        return this.labels;
    }

    @NotNull
    public final n.a getMoshiOptions() {
        return this.moshiOptions;
    }

    @NotNull
    public final Map<String, Class<? extends AtomDTO>> getTypes() {
        return this.types;
    }

    public int hashCode() {
        return this.labels.hashCode() + (this.types.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ParseState(types=" + this.types + ", labels=" + this.labels + ")";
    }
}
