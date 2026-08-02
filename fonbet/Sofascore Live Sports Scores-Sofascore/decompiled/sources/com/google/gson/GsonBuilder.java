package com.google.gson;

import defpackage.b5k;
import defpackage.c5n;
import defpackage.euf;
import defpackage.ho4;
import defpackage.ih0;
import defpackage.io4;
import defpackage.is8;
import defpackage.kkb;
import defpackage.l0i;
import defpackage.m0i;
import defpackage.myj;
import defpackage.ne6;
import defpackage.oe6;
import defpackage.ppl;
import defpackage.u4k;
import defpackage.u5k;
import defpackage.ujj;
import defpackage.v4k;
import defpackage.x4k;
import defpackage.yz7;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private ne6 excluder;
    private final List<v4k> factories;
    private FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final List<v4k> hierarchyFactories;
    private final Map<Type, Object> instanceCreators;
    private boolean lenient;
    private kkb longSerializationPolicy;
    private ujj numberToNumberStrategy;
    private ujj objectToNumberStrategy;
    private boolean prettyPrinting;
    private final LinkedList<euf> reflectionFilters;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;
    private boolean useJdkUnsafe;

    public GsonBuilder(Gson gson) {
        this.excluder = ne6.g;
        this.longSerializationPolicy = kkb.a;
        this.fieldNamingPolicy = yz7.a;
        HashMap hashMap = new HashMap();
        this.instanceCreators = hashMap;
        ArrayList arrayList = new ArrayList();
        this.factories = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        LinkedList<euf> linkedList = new LinkedList<>();
        this.reflectionFilters = linkedList;
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        hashMap.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.prettyPrinting = gson.prettyPrinting;
        this.lenient = gson.lenient;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        arrayList.addAll(gson.builderFactories);
        arrayList2.addAll(gson.builderHierarchyFactories);
        this.useJdkUnsafe = gson.useJdkUnsafe;
        this.objectToNumberStrategy = gson.objectToNumberStrategy;
        this.numberToNumberStrategy = gson.numberToNumberStrategy;
        linkedList.addAll(gson.reflectionFilters);
    }

    private void addTypeAdaptersForDate(String str, int i, int i2, List<v4k> list) {
        x4k x4kVar;
        x4k x4kVar2;
        boolean z = m0i.a;
        ho4 ho4Var = io4.b;
        x4k x4kVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            ih0 ih0Var = new ih0(ho4Var, str);
            x4k x4kVar4 = b5k.a;
            x4kVar = new x4k(Date.class, ih0Var, 0);
            if (z) {
                l0i l0iVar = m0i.c;
                l0iVar.getClass();
                x4kVar3 = new x4k(l0iVar.a, new ih0(l0iVar, str), 0);
                l0i l0iVar2 = m0i.b;
                l0iVar2.getClass();
                x4kVar2 = new x4k(l0iVar2.a, new ih0(l0iVar2, str), 0);
            }
            x4kVar2 = null;
        } else {
            if (i == 2 || i2 == 2) {
                return;
            }
            ih0 ih0Var2 = new ih0(ho4Var, i, i2);
            x4k x4kVar5 = b5k.a;
            x4k x4kVar6 = new x4k(Date.class, ih0Var2, 0);
            if (z) {
                l0i l0iVar3 = m0i.c;
                l0iVar3.getClass();
                x4kVar3 = new x4k(l0iVar3.a, new ih0(l0iVar3, i, i2), 0);
                l0i l0iVar4 = m0i.b;
                l0iVar4.getClass();
                x4kVar2 = new x4k(l0iVar4.a, new ih0(l0iVar4, i, i2), 0);
                x4kVar = x4kVar6;
            } else {
                x4kVar = x4kVar6;
                x4kVar2 = null;
            }
        }
        list.add(x4kVar);
        if (z) {
            list.add(x4kVar3);
            list.add(x4kVar2);
        }
    }

    public GsonBuilder addDeserializationExclusionStrategy(oe6 oe6Var) {
        Objects.requireNonNull(oe6Var);
        this.excluder = this.excluder.f(false, true);
        return this;
    }

    public GsonBuilder addReflectionAccessFilter(euf eufVar) {
        Objects.requireNonNull(eufVar);
        this.reflectionFilters.addFirst(eufVar);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(oe6 oe6Var) {
        Objects.requireNonNull(oe6Var);
        this.excluder = this.excluder.f(true, false);
        return this;
    }

    public Gson create() {
        ArrayList arrayList = new ArrayList(this.hierarchyFactories.size() + this.factories.size() + 3);
        arrayList.addAll(this.factories);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.hierarchyFactories);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
        return new Gson(this.excluder, this.fieldNamingPolicy, new HashMap(this.instanceCreators), this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.useJdkUnsafe, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, new ArrayList(this.factories), new ArrayList(this.hierarchyFactories), arrayList, this.objectToNumberStrategy, this.numberToNumberStrategy, new ArrayList(this.reflectionFilters));
    }

    public GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization() {
        ne6 clone = this.excluder.clone();
        clone.c = false;
        this.excluder = clone;
        return this;
    }

    public GsonBuilder disableJdkUnsafe() {
        this.useJdkUnsafe = false;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        Objects.requireNonNull(iArr);
        ne6 clone = this.excluder.clone();
        clone.b = 0;
        for (int i : iArr) {
            clone.b = i | clone.b;
        }
        this.excluder = clone;
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        ne6 clone = this.excluder.clone();
        clone.d = true;
        this.excluder = clone;
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        Objects.requireNonNull(type);
        boolean z = obj instanceof ppl;
        c5n.w(z || (obj instanceof u4k));
        if (z) {
            u5k u5kVar = new u5k(type);
            this.factories.add(new myj(obj, u5kVar, u5kVar.b == u5kVar.a, null));
        }
        if (obj instanceof u4k) {
            x4k x4kVar = b5k.a;
            this.factories.add(new x4k(new u5k(type), (u4k) obj, 2));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(v4k v4kVar) {
        Objects.requireNonNull(v4kVar);
        this.factories.add(v4kVar);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        Objects.requireNonNull(cls);
        boolean z = obj instanceof ppl;
        c5n.w(z || (obj instanceof u4k));
        if (z) {
            this.hierarchyFactories.add(new myj(obj, null, false, cls));
        }
        if (obj instanceof u4k) {
            x4k x4kVar = b5k.a;
            this.factories.add(new x4k(cls, (u4k) obj, 1));
        }
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder setDateFormat(int i, int i2) {
        this.dateStyle = i;
        this.timeStyle = i2;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setExclusionStrategies(oe6... oe6VarArr) {
        Objects.requireNonNull(oe6VarArr);
        for (oe6 oe6Var : oe6VarArr) {
            this.excluder = this.excluder.f(true, true);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(yz7 yz7Var) {
        return setFieldNamingStrategy(yz7Var);
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        Objects.requireNonNull(fieldNamingStrategy);
        this.fieldNamingPolicy = fieldNamingStrategy;
        return this;
    }

    public GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(kkb kkbVar) {
        Objects.requireNonNull(kkbVar);
        this.longSerializationPolicy = kkbVar;
        return this;
    }

    public GsonBuilder setNumberToNumberStrategy(ujj ujjVar) {
        Objects.requireNonNull(ujjVar);
        this.numberToNumberStrategy = ujjVar;
        return this;
    }

    public GsonBuilder setObjectToNumberStrategy(ujj ujjVar) {
        Objects.requireNonNull(ujjVar);
        this.objectToNumberStrategy = ujjVar;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public GsonBuilder setVersion(double d) {
        if (Double.isNaN(d) || d < 0.0d) {
            is8.f("Invalid version: ", d);
            return null;
        }
        ne6 clone = this.excluder.clone();
        clone.a = d;
        this.excluder = clone;
        return this;
    }

    public GsonBuilder setDateFormat(int i) {
        this.dateStyle = i;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setDateFormat(String str) {
        this.datePattern = str;
        return this;
    }

    public GsonBuilder() {
        this.excluder = ne6.g;
        this.longSerializationPolicy = kkb.a;
        this.fieldNamingPolicy = yz7.a;
        this.instanceCreators = new HashMap();
        this.factories = new ArrayList();
        this.hierarchyFactories = new ArrayList();
        this.serializeNulls = false;
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.reflectionFilters = new LinkedList<>();
    }
}
