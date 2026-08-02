package td;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ne.h;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9816G<Type extends ne.h> extends n0<Type> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f99363a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<Sd.f, Type> f99364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9816G(@NotNull ArrayList underlyingPropertyNamesToTypes) {
        super(0);
        Intrinsics.checkNotNullParameter(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f99363a = underlyingPropertyNamesToTypes;
        Map<Sd.f, Type> s11 = kotlin.collections.U.s(underlyingPropertyNamesToTypes);
        if (s11.size() != underlyingPropertyNamesToTypes.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f99364b = s11;
    }

    @Override // td.n0
    public final boolean a(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f99364b.containsKey(name);
    }

    @NotNull
    public final List<Pair<Sd.f, Type>> b() {
        return this.f99363a;
    }

    @NotNull
    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f99363a + ')';
    }
}
