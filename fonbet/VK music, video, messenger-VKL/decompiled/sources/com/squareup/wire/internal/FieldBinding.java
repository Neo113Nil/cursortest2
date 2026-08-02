package com.squareup.wire.internal;

import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Regex;
import xsna.dcy;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.tby;
import xsna.ttp0;
import xsna.wzs;
import xsna.zcl;

/* compiled from: FieldBinding.kt */
/* loaded from: classes14.dex */
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {
    public static final Companion Companion = new Companion(null);
    private static final Regex IS_GETTER_FIELD_NAME_REGEX = new Regex("^is[^a-z].*$");
    private final String adapterString;
    private final izs<B, Object> builderGetter;
    private final wzs<B, Object, s3q0> builderSetter;
    private final String declaredName;
    private final izs<M, Object> instanceGetter;
    private final String keyAdapterString;
    private final WireField.Label label;
    private final Field messageField;
    private final String name;
    private final boolean redacted;
    private final int tag;
    private final String wireFieldJsonName;
    private final boolean writeIdentityValues;

    /* compiled from: FieldBinding.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public FieldBinding(WireField wireField, Class<M> cls, Field field, Class<B> cls2, boolean z) {
        this.messageField = field;
        this.writeIdentityValues = z;
        this.label = wireField.label();
        this.name = field.getName();
        this.wireFieldJsonName = wireField.jsonName();
        this.declaredName = wireField.declaredName().length() == 0 ? field.getName() : wireField.declaredName();
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.builderSetter = getBuilderSetter(cls2, wireField);
        this.builderGetter = getBuilderGetter(cls2, wireField);
        this.instanceGetter = getInstanceGetter(cls);
    }

    private final izs<B, Object> getBuilderGetter(Class<?> cls, final WireField wireField) {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return (izs<B, Object>) new izs<B, Object>() { // from class: com.squareup.wire.internal.FieldBinding$getBuilderGetter$1
                {
                    super(1);
                }

                /* JADX WARN: Incorrect types in method signature: (TB;)Ljava/lang/Object; */
                @Override // xsna.izs
                public final Object invoke(Message.Builder builder) {
                    return ((KotlinConstructorBuilder) builder).get(WireField.this);
                }
            };
        }
        try {
            final Field field = cls.getField(getName());
            return (izs<B, Object>) new izs<B, Object>() { // from class: com.squareup.wire.internal.FieldBinding$getBuilderGetter$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Incorrect types in method signature: (TB;)Ljava/lang/Object; */
                @Override // xsna.izs
                public final Object invoke(Message.Builder builder) {
                    return field.get(builder);
                }
            };
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + ((Object) cls.getName()) + JwtParser.SEPARATOR_CHAR + getName());
        }
    }

    private final wzs<B, Object, s3q0> getBuilderSetter(Class<?> cls, final WireField wireField) {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return (wzs<B, Object, s3q0>) new wzs<B, Object, s3q0>() { // from class: com.squareup.wire.internal.FieldBinding$getBuilderSetter$1
                {
                    super(2);
                }

                @Override // xsna.wzs
                public /* bridge */ /* synthetic */ s3q0 invoke(Object obj, Object obj2) {
                    invoke((Message.Builder) obj, obj2);
                    return s3q0.a;
                }

                /* JADX WARN: Incorrect types in method signature: (TB;Ljava/lang/Object;)V */
                public final void invoke(Message.Builder builder, Object obj) {
                    ((KotlinConstructorBuilder) builder).set(WireField.this, obj);
                }
            };
        }
        if (!wireField.label().isOneOf()) {
            try {
                final Field field = cls.getField(getName());
                return (wzs<B, Object, s3q0>) new wzs<B, Object, s3q0>() { // from class: com.squareup.wire.internal.FieldBinding$getBuilderSetter$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // xsna.wzs
                    public /* bridge */ /* synthetic */ s3q0 invoke(Object obj, Object obj2) {
                        invoke((Message.Builder) obj, obj2);
                        return s3q0.a;
                    }

                    /* JADX WARN: Incorrect types in method signature: (TB;Ljava/lang/Object;)V */
                    public final void invoke(Message.Builder builder, Object obj) {
                        field.set(builder, obj);
                    }
                };
            } catch (NoSuchFieldException unused) {
                throw new AssertionError("No builder field " + ((Object) cls.getName()) + JwtParser.SEPARATOR_CHAR + getName());
            }
        }
        Class<?> type = this.messageField.getType();
        try {
            final Method method = cls.getMethod(getName(), type);
            return (wzs<B, Object, s3q0>) new wzs<B, Object, s3q0>() { // from class: com.squareup.wire.internal.FieldBinding$getBuilderSetter$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // xsna.wzs
                public /* bridge */ /* synthetic */ s3q0 invoke(Object obj, Object obj2) {
                    invoke((Message.Builder) obj, obj2);
                    return s3q0.a;
                }

                /* JADX WARN: Incorrect types in method signature: (TB;Ljava/lang/Object;)V */
                public final void invoke(Message.Builder builder, Object obj) {
                    method.invoke(builder, obj);
                }
            };
        } catch (NoSuchMethodException unused2) {
            throw new AssertionError("No builder method " + ((Object) cls.getName()) + JwtParser.SEPARATOR_CHAR + getName() + '(' + ((Object) type.getName()) + ')');
        }
    }

    private final izs<M, Object> getInstanceGetter(Class<M> cls) {
        if (!Modifier.isPrivate(this.messageField.getModifiers())) {
            return (izs<M, Object>) new izs<M, Object>(this) { // from class: com.squareup.wire.internal.FieldBinding$getInstanceGetter$2
                final /* synthetic */ FieldBinding<M, B> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX WARN: Incorrect types in method signature: (TM;)Ljava/lang/Object; */
                @Override // xsna.izs
                public final Object invoke(Message message) {
                    Field field;
                    field = ((FieldBinding) this.this$0).messageField;
                    return field.get(message);
                }
            };
        }
        String name = this.messageField.getName();
        if (!IS_GETTER_FIELD_NAME_REGEX.f(name)) {
            if (name.length() > 0) {
                name = ((Object) String.valueOf(name.charAt(0)).toUpperCase(Locale.ROOT)) + name.substring(1);
            }
            name = epx.j(name, "get");
        }
        final Method method = cls.getMethod(name, null);
        return (izs<M, Object>) new izs<M, Object>() { // from class: com.squareup.wire.internal.FieldBinding$getInstanceGetter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TM;)Ljava/lang/Object; */
            @Override // xsna.izs
            public final Object invoke(Message message) {
                return method.invoke(message, null);
            }
        };
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getDeclaredName() {
        return this.declaredName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getKeyAdapter() {
        return ProtoAdapter.Companion.get(this.keyAdapterString);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public WireField.Label getLabel() {
        return this.label;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getName() {
        return this.name;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.redacted;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getSingleAdapter() {
        return ProtoAdapter.Companion.get(this.adapterString);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.tag;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getWireFieldJsonName() {
        return this.wireFieldJsonName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getWriteIdentityValues() {
        return this.writeIdentityValues;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMap() {
        return this.keyAdapterString.length() > 0;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMessage() {
        dcy<?> type = getSingleAdapter().getType();
        return Message.class.isAssignableFrom(type == null ? null : tby.e(type));
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object get(M m) {
        return this.instanceGetter.invoke(m);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object getFromBuilder(B b) {
        return this.builderGetter.invoke(b);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(B b, Object obj) {
        this.builderSetter.invoke(b, obj);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(B b, Object obj) {
        if (getLabel().isRepeated()) {
            Object fromBuilder = getFromBuilder((FieldBinding<M, B>) b);
            if (ttp0.f(fromBuilder)) {
                if (fromBuilder == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
                }
                ttp0.b(fromBuilder).add(obj);
                return;
            } else if (fromBuilder instanceof List) {
                ArrayList arrayList = new ArrayList((Collection) fromBuilder);
                arrayList.add(obj);
                set((FieldBinding<M, B>) b, (Object) arrayList);
                return;
            } else {
                throw new ClassCastException("Expected a list type, got " + (fromBuilder != null ? fromBuilder.getClass() : null) + JwtParser.SEPARATOR_CHAR);
            }
        }
        if (this.keyAdapterString.length() <= 0) {
            set((FieldBinding<M, B>) b, obj);
            return;
        }
        Object fromBuilder2 = getFromBuilder((FieldBinding<M, B>) b);
        if (ttp0.g(fromBuilder2)) {
            ((Map) fromBuilder2).putAll((Map) obj);
            return;
        }
        if (fromBuilder2 instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) fromBuilder2);
            linkedHashMap.putAll((Map) obj);
            set((FieldBinding<M, B>) b, (Object) linkedHashMap);
        } else {
            throw new ClassCastException("Expected a map type, got " + (fromBuilder2 != null ? fromBuilder2.getClass() : null) + JwtParser.SEPARATOR_CHAR);
        }
    }
}
