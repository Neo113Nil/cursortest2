package defpackage;

import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class g75 {
    public static final pm0 a;
    public static final pm0 b;
    public static final mqi c;
    public static final sx2 d;

    static {
        KType kType;
        KType kType2;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Unit.class);
        KType kType3 = null;
        try {
            kType = duf.b(Unit.class);
        } catch (Throwable unused) {
            kType = null;
        }
        a = new pm0("SkipSaveBody", new h5k(orCreateKotlinClass, kType));
        KClass orCreateKotlinClass2 = duf.a.getOrCreateKotlinClass(Unit.class);
        try {
            kType2 = duf.b(Unit.class);
        } catch (Throwable unused2) {
            kType2 = null;
        }
        b = new pm0("ResponseBodySaved", new h5k(orCreateKotlinClass2, kType2));
        c = ypa.b(new wc4(17));
        d = new sx2("SaveBody", (Function0) new t63(19), (Function1) new qz4(16));
        int i = f75.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(tx2.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KTypeParameter typeParameter = fufVar.typeParameter(fufVar.getOrCreateKotlinClass(sx2.class), "PluginConfigT", KVariance.INVARIANT, false);
            fufVar.setUpperBounds(typeParameter, Collections.singletonList(duf.b(Object.class)));
            kType3 = duf.c(tx2.class, companion.invariant(fufVar.typeOf(typeParameter, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused3) {
        }
        new pm0("DoubleReceivePlugin", new h5k(orCreateKotlinClass3, kType3));
    }
}
