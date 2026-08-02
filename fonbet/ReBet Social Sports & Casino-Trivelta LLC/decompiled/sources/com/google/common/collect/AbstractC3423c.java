package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.collect.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3423c extends AbstractC3424d implements K {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractC3423c(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractC3424d
    public Collection B(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractC3424d
    public Collection C(Object obj, Collection collection) {
        return D(obj, (List) collection, null);
    }

    @Override // com.google.common.collect.AbstractC3424d, com.google.common.collect.O
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    public Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractC3426f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC3424d, com.google.common.collect.O
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }
}
