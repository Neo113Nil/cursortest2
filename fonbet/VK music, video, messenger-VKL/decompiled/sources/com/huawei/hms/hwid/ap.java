package com.huawei.hms.hwid;

import java.util.Collection;

/* compiled from: CollectionUtil.java */
/* loaded from: classes13.dex */
public class ap {
    public static Boolean a(Collection collection) {
        return (collection == null || collection.size() == 0) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Boolean b(Collection collection) {
        return Boolean.valueOf(!a(collection).booleanValue());
    }
}
