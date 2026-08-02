package com.vk.superapp.vksteps.utils;

import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class DataTypeInfo {

    @pmi0("aggregateType")
    private final String aggregateType;

    @pmi0("fields")
    private final List<FieldInfo> fields;

    @pmi0("name")
    private final String name;

    public DataTypeInfo(String str, String str2, List<FieldInfo> list) {
        this.name = str;
        this.aggregateType = str2;
        this.fields = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataTypeInfo)) {
            return false;
        }
        DataTypeInfo dataTypeInfo = (DataTypeInfo) obj;
        return epx.f(this.name, dataTypeInfo.name) && epx.f(this.aggregateType, dataTypeInfo.aggregateType) && epx.f(this.fields, dataTypeInfo.fields);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.aggregateType;
        return this.fields.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataTypeInfo(name=");
        sb.append(this.name);
        sb.append(", aggregateType=");
        sb.append(this.aggregateType);
        sb.append(", fields=");
        return ms9.a(')', sb, this.fields);
    }
}
