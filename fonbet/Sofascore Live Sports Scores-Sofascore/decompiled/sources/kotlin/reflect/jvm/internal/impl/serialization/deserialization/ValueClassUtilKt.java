package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ValueClassUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    @Nullable
    public static final <T extends SimpleTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(@NotNull ProtoBuf.Class r5, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull Function1<? super ProtoBuf.Type, ? extends T> function1, @NotNull Function1<? super Name, ? extends T> function12) {
        SimpleTypeMarker simpleTypeMarker;
        ?? multiFieldValueClassUnderlyingTypeList;
        r5.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        function1.getClass();
        function12.getClass();
        if (r5.getMultiFieldValueClassUnderlyingNameCount() <= 0) {
            if (!r5.hasInlineClassUnderlyingPropertyName()) {
                return null;
            }
            Name name = NameResolverUtilKt.getName(nameResolver, r5.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type inlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r5, typeTable);
            if ((inlineClassUnderlyingType != null && (simpleTypeMarker = (SimpleTypeMarker) function1.invoke(inlineClassUnderlyingType)) != null) || (simpleTypeMarker = (SimpleTypeMarker) function12.invoke(name)) != null) {
                return new InlineClassRepresentation(name, simpleTypeMarker);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver, r5.getFqName()) + " with property " + name).toString());
        }
        List<Integer> multiFieldValueClassUnderlyingNameList = r5.getMultiFieldValueClassUnderlyingNameList();
        multiFieldValueClassUnderlyingNameList.getClass();
        ArrayList arrayList = new ArrayList(k13.r(multiFieldValueClassUnderlyingNameList, 10));
        for (Integer num : multiFieldValueClassUnderlyingNameList) {
            num.getClass();
            arrayList.add(NameResolverUtilKt.getName(nameResolver, num.intValue()));
        }
        Pair pair = new Pair(Integer.valueOf(r5.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r5.getMultiFieldValueClassUnderlyingTypeCount()));
        if (pair.equals(new Pair(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = r5.getMultiFieldValueClassUnderlyingTypeIdList();
            multiFieldValueClassUnderlyingTypeIdList.getClass();
            multiFieldValueClassUnderlyingTypeList = new ArrayList(k13.r(multiFieldValueClassUnderlyingTypeIdList, 10));
            for (Integer num2 : multiFieldValueClassUnderlyingTypeIdList) {
                num2.getClass();
                multiFieldValueClassUnderlyingTypeList.add(typeTable.get(num2.intValue()));
            }
        } else {
            if (!pair.equals(new Pair(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtilKt.getName(nameResolver, r5.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = r5.getMultiFieldValueClassUnderlyingTypeList();
        }
        multiFieldValueClassUnderlyingTypeList.getClass();
        ArrayList arrayList2 = new ArrayList(k13.r(multiFieldValueClassUnderlyingTypeList, 10));
        Iterator it = multiFieldValueClassUnderlyingTypeList.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        return new MultiFieldValueClassRepresentation(CollectionsKt.Y0(arrayList, arrayList2));
    }
}
