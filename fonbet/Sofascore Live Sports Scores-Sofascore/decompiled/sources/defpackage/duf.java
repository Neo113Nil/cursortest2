package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class duf {
    public static final fuf a;
    public static final KClass[] b;

    static {
        fuf fufVar = null;
        try {
            fufVar = (fuf) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (fufVar == null) {
            fufVar = new fuf();
        }
        a = fufVar;
        b = new KClass[0];
    }

    public static KClass a(Class cls) {
        return a.getOrCreateKotlinClass(cls);
    }

    public static KType b(Class cls) {
        fuf fufVar = a;
        return fufVar.typeOf(fufVar.getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, false);
    }

    public static KType c(Class cls, KTypeProjection kTypeProjection) {
        fuf fufVar = a;
        return fufVar.typeOf(fufVar.getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static KType d(Class cls, KTypeProjection... kTypeProjectionArr) {
        fuf fufVar = a;
        return fufVar.typeOf(fufVar.getOrCreateKotlinClass(cls), ph0.X(kTypeProjectionArr), false);
    }

    public static KType e(KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        fuf fufVar = a;
        return fufVar.typeOf(fufVar.getOrCreateKotlinClass(Map.class), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }
}
