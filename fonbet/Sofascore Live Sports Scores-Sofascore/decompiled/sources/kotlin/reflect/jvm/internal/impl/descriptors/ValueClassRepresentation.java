package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.k13;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class ValueClassRepresentation<Type extends SimpleTypeMarker> {
    public /* synthetic */ ValueClassRepresentation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean containsPropertyWithName(@NotNull Name name);

    @NotNull
    public abstract List<Pair<Name, Type>> getUnderlyingPropertyNamesToTypes();

    @NotNull
    public final <Other extends SimpleTypeMarker> ValueClassRepresentation<Other> mapUnderlyingType(@NotNull Function1<? super Type, ? extends Other> function1) {
        function1.getClass();
        if (this instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) this;
            return new InlineClassRepresentation(inlineClassRepresentation.getUnderlyingPropertyName(), (SimpleTypeMarker) function1.invoke(inlineClassRepresentation.getUnderlyingType()));
        }
        if (!(this instanceof MultiFieldValueClassRepresentation)) {
            zzl.b();
            return null;
        }
        List<Pair<Name, Type>> underlyingPropertyNamesToTypes = getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList(k13.r(underlyingPropertyNamesToTypes, 10));
        Iterator<T> it = underlyingPropertyNamesToTypes.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new Pair((Name) pair.a, function1.invoke((SimpleTypeMarker) pair.b)));
        }
        return new MultiFieldValueClassRepresentation(arrayList);
    }

    private ValueClassRepresentation() {
    }
}
