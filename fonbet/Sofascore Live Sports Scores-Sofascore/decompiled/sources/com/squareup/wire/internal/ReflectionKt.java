package com.squareup.wire.internal;

import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.duf;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.zbe;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a~\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u001aF\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001ah\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u001aH\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0002¨\u0006\u0017"}, d2 = {"createRuntimeMessageAdapter", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", PlayerKt.FOOTBALL_MIDFIELDER, "B", "Lcom/squareup/wire/Message;", "Lcom/squareup/wire/Message$Builder;", "messageType", "Ljava/lang/Class;", "typeUrl", "", "syntax", "Lcom/squareup/wire/Syntax;", "classLoader", "Ljava/lang/ClassLoader;", "writeIdentityValues", "", "preservingProtoFieldNames", "getKeys", "", "Lcom/squareup/wire/OneOf$Key;", "messageField", "Ljava/lang/reflect/Field;", "getBuilderType", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReflectionKt {
    @NotNull
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(@NotNull Class<M> cls, @Nullable String str, @NotNull Syntax syntax, @Nullable ClassLoader classLoader, boolean z, boolean z2) {
        Class cls2;
        cls.getClass();
        syntax.getClass();
        Class builderType = getBuilderType(cls);
        zbe zbeVar = new zbe(22, builderType, cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                cls2 = builderType;
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, cls, field, cls2, z, classLoader));
            } else {
                cls2 = builderType;
                if (Intrinsics.c(field.getType(), OneOf.class)) {
                    for (OneOf.Key<?> key : getKeys(field)) {
                        linkedHashMap.put(Integer.valueOf(key.getTag()), new OneOfBinding(field, cls2, key, z));
                    }
                }
            }
            i++;
            builderType = cls2;
        }
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(cls);
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return new RuntimeMessageAdapter<>(new RuntimeMessageBinding(orCreateKotlinClass, builderType, zbeVar, unmodifiableMap, str, syntax), z2);
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, String str, Syntax syntax, ClassLoader classLoader, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            classLoader = cls.getClassLoader();
        }
        return createRuntimeMessageAdapter(cls, str, syntax, classLoader, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message.Builder createRuntimeMessageAdapter$lambda$0(Class cls, Class cls2) {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new KotlinConstructorBuilder(cls2);
        }
        Object newInstance = cls.newInstance();
        newInstance.getClass();
        return (Message.Builder) newInstance;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = Class.forName(cls.getName().concat("$Builder"), false, cls.getClassLoader());
            u2gVar.getClass();
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        Class<B> cls2 = (Class) u2gVar;
        return cls2 == null ? KotlinConstructorBuilder.class : cls2;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Set<OneOf.Key<?>> getKeys(Field field) {
        Class<?> declaringClass = field.getDeclaringClass();
        String name = field.getName();
        name.getClass();
        Field declaredField = declaringClass.getDeclaredField(Internal.boxedOneOfKeysFieldName(name));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        obj.getClass();
        return (Set) obj;
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, boolean z, boolean z2, ClassLoader classLoader, int i, Object obj) {
        if ((i & 8) != 0) {
            classLoader = cls.getClassLoader();
        }
        return createRuntimeMessageAdapter(cls, z, z2, classLoader);
    }

    @NotNull
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(@NotNull Class<M> cls, boolean z, boolean z2, @Nullable ClassLoader classLoader) {
        cls.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INSTANCE.get(cls);
        return createRuntimeMessageAdapter(cls, protoAdapter.getTypeUrl(), protoAdapter.getSyntax(), classLoader, z, z2);
    }
}
