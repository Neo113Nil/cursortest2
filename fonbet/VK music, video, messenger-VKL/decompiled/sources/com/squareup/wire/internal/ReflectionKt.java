package com.squareup.wire.internal;

import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Result;
import xsna.epx;
import xsna.fpf0;
import xsna.gzs;

/* compiled from: reflection.kt */
/* loaded from: classes14.dex */
public final class ReflectionKt {
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(final Class<M> cls, String str, Syntax syntax, boolean z) {
        boolean z2;
        Class cls2;
        Class<M> cls3;
        final Class builderType = getBuilderType(cls);
        gzs<B> gzsVar = new gzs<B>() { // from class: com.squareup.wire.internal.ReflectionKt$createRuntimeMessageAdapter$newBuilderInstance$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TB; */
            @Override // xsna.gzs
            public final Message.Builder invoke() {
                return builderType.isAssignableFrom(KotlinConstructorBuilder.class) ? new KotlinConstructorBuilder(cls) : (Message.Builder) builderType.newInstance();
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            int i2 = i + 1;
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                z2 = z;
                cls2 = builderType;
                cls3 = cls;
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, cls3, field, cls2, z2));
            } else {
                z2 = z;
                cls2 = builderType;
                cls3 = cls;
                if (epx.f(field.getType(), OneOf.class)) {
                    for (OneOf.Key<?> key : getKeys(field)) {
                        linkedHashMap.put(Integer.valueOf(key.getTag()), new OneOfBinding(field, cls2, key, z2));
                    }
                }
            }
            cls = cls3;
            builderType = cls2;
            z = z2;
            i = i2;
        }
        return new RuntimeMessageAdapter<>(new RuntimeMessageBinding(fpf0.a(cls), builderType, gzsVar, Collections.unmodifiableMap(linkedHashMap), str, syntax));
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, String str, Syntax syntax, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return createRuntimeMessageAdapter(cls, str, syntax, z);
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        Object failure;
        try {
            failure = Class.forName(epx.j("$Builder", cls.getName()));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Class<B> cls2 = (Class) failure;
        return cls2 == null ? KotlinConstructorBuilder.class : cls2;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Set<OneOf.Key<?>> getKeys(Field field) {
        Field declaredField = field.getDeclaringClass().getDeclaredField(Internal.boxedOneOfKeysFieldName(field.getName()));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        if (obj != null) {
            return (Set) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<com.squareup.wire.OneOf.Key<*>>");
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(Class<M> cls, boolean z) {
        ProtoAdapter protoAdapter = ProtoAdapter.Companion.get(cls);
        return createRuntimeMessageAdapter(cls, protoAdapter.getTypeUrl(), protoAdapter.getSyntax(), z);
    }
}
