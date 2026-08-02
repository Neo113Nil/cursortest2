package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.a70;
import defpackage.tub;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class MultiFieldValueClassRepresentation<Type extends SimpleTypeMarker> extends ValueClassRepresentation<Type> {

    @NotNull
    private final Map<Name, Type> map;

    @NotNull
    private final List<Pair<Name, Type>> underlyingPropertyNamesToTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiFieldValueClassRepresentation(@NotNull List<? extends Pair<Name, ? extends Type>> list) {
        super(null);
        list.getClass();
        this.underlyingPropertyNamesToTypes = list;
        Map<Name, Type> o = tub.o(getUnderlyingPropertyNamesToTypes());
        if (o.size() == getUnderlyingPropertyNamesToTypes().size()) {
            this.map = o;
        } else {
            a70.p("Some properties have the same names");
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean containsPropertyWithName(@NotNull Name name) {
        name.getClass();
        return this.map.containsKey(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    @NotNull
    public List<Pair<Name, Type>> getUnderlyingPropertyNamesToTypes() {
        return this.underlyingPropertyNamesToTypes;
    }

    @NotNull
    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + getUnderlyingPropertyNamesToTypes() + ')';
    }
}
