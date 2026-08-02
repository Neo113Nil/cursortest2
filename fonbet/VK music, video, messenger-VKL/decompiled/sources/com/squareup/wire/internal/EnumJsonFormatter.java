package com.squareup.wire.internal;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import com.vk.newsfeed.impl.data.database.entity.action.post.LikableItemTypeEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.pfc;

/* compiled from: EnumJsonFormatter.kt */
/* loaded from: classes14.dex */
public final class EnumJsonFormatter<E extends WireEnum> implements JsonFormatter<E> {
    private final Map<String, E> stringToValue;
    private final Map<E, String> valueToString;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumJsonFormatter(EnumAdapter<E> enumAdapter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Class<?> a = ((pfc) enumAdapter.getType()).a();
        WireEnum[] wireEnumArr = (WireEnum[]) a.getEnumConstants();
        int length = wireEnumArr.length;
        int i = 0;
        while (i < length) {
            LikableItemTypeEntity likableItemTypeEntity = wireEnumArr[i];
            i++;
            if (likableItemTypeEntity == 0) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Enum<*>");
            }
            String name = likableItemTypeEntity.name();
            linkedHashMap.put(name, likableItemTypeEntity);
            linkedHashMap.put(String.valueOf(likableItemTypeEntity.getValue()), likableItemTypeEntity);
            linkedHashMap2.put(likableItemTypeEntity, name);
            WireEnumConstant wireEnumConstant = (WireEnumConstant) a.getDeclaredField(name).getAnnotation(WireEnumConstant.class);
            if (wireEnumConstant != null && wireEnumConstant.declaredName().length() > 0) {
                linkedHashMap.put(wireEnumConstant.declaredName(), likableItemTypeEntity);
                linkedHashMap2.put(likableItemTypeEntity, wireEnumConstant.declaredName());
            }
        }
        this.stringToValue = linkedHashMap;
        this.valueToString = linkedHashMap2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public E fromString(String str) {
        return this.stringToValue.get(str);
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public String toStringOrNumber(E e) {
        return this.valueToString.get(e);
    }
}
