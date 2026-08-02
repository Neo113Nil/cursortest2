package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import defpackage.a70;
import defpackage.k13;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ProtoTypeTableUtilKt {
    @Nullable
    public static final ProtoBuf.Type abbreviatedType(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        type.getClass();
        typeTable.getClass();
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return typeTable.get(type.getAbbreviatedTypeId());
        }
        return null;
    }

    @NotNull
    public static final List<ProtoBuf.Type> contextReceiverTypes(@NotNull ProtoBuf.Class r2, @NotNull TypeTable typeTable) {
        r2.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = r2.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = r2.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(k13.r(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    @NotNull
    public static final ProtoBuf.Type expandedType(@NotNull ProtoBuf.TypeAlias typeAlias, @NotNull TypeTable typeTable) {
        typeAlias.getClass();
        typeTable.getClass();
        if (typeAlias.hasExpandedType()) {
            ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            expandedType.getClass();
            return expandedType;
        }
        if (typeAlias.hasExpandedTypeId()) {
            return typeTable.get(typeAlias.getExpandedTypeId());
        }
        a70.r("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type flexibleUpperBound(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        type.getClass();
        typeTable.getClass();
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return typeTable.get(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean hasReceiver(@NotNull ProtoBuf.Function function) {
        function.getClass();
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    @Nullable
    public static final ProtoBuf.Type inlineClassUnderlyingType(@NotNull ProtoBuf.Class r1, @NotNull TypeTable typeTable) {
        r1.getClass();
        typeTable.getClass();
        if (r1.hasInlineClassUnderlyingType()) {
            return r1.getInlineClassUnderlyingType();
        }
        if (r1.hasInlineClassUnderlyingTypeId()) {
            return typeTable.get(r1.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type outerType(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        type.getClass();
        typeTable.getClass();
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return typeTable.get(type.getOuterTypeId());
        }
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type receiverType(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.get(function.getReceiverTypeId());
        }
        return null;
    }

    @NotNull
    public static final ProtoBuf.Type returnType(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        if (function.hasReturnType()) {
            ProtoBuf.Type returnType = function.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (function.hasReturnTypeId()) {
            return typeTable.get(function.getReturnTypeId());
        }
        a70.r("No returnType in ProtoBuf.Function");
        return null;
    }

    @NotNull
    public static final List<ProtoBuf.Type> supertypes(@NotNull ProtoBuf.Class r2, @NotNull TypeTable typeTable) {
        r2.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> supertypeList = r2.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = r2.getSupertypeIdList();
            supertypeIdList.getClass();
            supertypeList = new ArrayList<>(k13.r(supertypeIdList, 10));
            for (Integer num : supertypeIdList) {
                num.getClass();
                supertypeList.add(typeTable.get(num.intValue()));
            }
        }
        return supertypeList;
    }

    @NotNull
    public static final ProtoBuf.Type type(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        valueParameter.getClass();
        typeTable.getClass();
        if (valueParameter.hasType()) {
            ProtoBuf.Type type = valueParameter.getType();
            type.getClass();
            return type;
        }
        if (valueParameter.hasTypeId()) {
            return typeTable.get(valueParameter.getTypeId());
        }
        a70.r("No type in ProtoBuf.ValueParameter");
        return null;
    }

    @NotNull
    public static final ProtoBuf.Type underlyingType(@NotNull ProtoBuf.TypeAlias typeAlias, @NotNull TypeTable typeTable) {
        typeAlias.getClass();
        typeTable.getClass();
        if (typeAlias.hasUnderlyingType()) {
            ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            underlyingType.getClass();
            return underlyingType;
        }
        if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.get(typeAlias.getUnderlyingTypeId());
        }
        a70.r("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    @NotNull
    public static final List<ProtoBuf.Type> upperBounds(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull TypeTable typeTable) {
        typeParameter.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            upperBoundIdList.getClass();
            upperBoundList = new ArrayList<>(k13.r(upperBoundIdList, 10));
            for (Integer num : upperBoundIdList) {
                num.getClass();
                upperBoundList.add(typeTable.get(num.intValue()));
            }
        }
        return upperBoundList;
    }

    @Nullable
    public static final ProtoBuf.Type varargElementType(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        valueParameter.getClass();
        typeTable.getClass();
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.get(valueParameter.getVarargElementTypeId());
        }
        return null;
    }

    public static final boolean hasReceiver(@NotNull ProtoBuf.Property property) {
        property.getClass();
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    @Nullable
    public static final ProtoBuf.Type receiverType(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.get(property.getReceiverTypeId());
        }
        return null;
    }

    @NotNull
    public static final ProtoBuf.Type returnType(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        if (property.hasReturnType()) {
            ProtoBuf.Type returnType = property.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (property.hasReturnTypeId()) {
            return typeTable.get(property.getReturnTypeId());
        }
        a70.r("No returnType in ProtoBuf.Property");
        return null;
    }

    @Nullable
    public static final ProtoBuf.Type type(@NotNull ProtoBuf.Type.Argument argument, @NotNull TypeTable typeTable) {
        argument.getClass();
        typeTable.getClass();
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.get(argument.getTypeId());
        }
        return null;
    }

    @NotNull
    public static final List<ProtoBuf.Type> contextReceiverTypes(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = function.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(k13.r(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    @NotNull
    public static final List<ProtoBuf.Type> contextReceiverTypes(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = property.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(k13.r(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }
}
