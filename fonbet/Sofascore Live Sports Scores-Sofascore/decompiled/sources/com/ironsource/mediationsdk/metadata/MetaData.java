package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MetaData {
    private String a;
    private List<String> b;
    private List<MetaDataValueTypes> c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.a = str;
        this.b = list;
        this.c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public String getMetaDataKey() {
        return this.a;
    }

    public List<String> getMetaDataValue() {
        return this.b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.c;
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }
}
