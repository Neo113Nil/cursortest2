package com.squareup.wire.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import defpackage.eia;
import defpackage.hl7;
import defpackage.i5k;
import defpackage.iia;
import defpackage.sha;
import defpackage.yx7;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 D*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001DBI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J0\u00108\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020,0*2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J*\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010+0.2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J$\u0010:\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010+0.2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u001d\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00028\u00012\u0006\u0010;\u001a\u00020+H\u0016¢\u0006\u0002\u0010=J\u001f\u0010>\u001a\u00020,2\u0006\u0010<\u001a\u00028\u00012\b\u0010;\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0002\u0010=J\u0018\u0010?\u001a\u0004\u0018\u00010+2\u0006\u0010@\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010AJ\u0017\u0010B\u001a\u0004\u0018\u00010+2\u0006\u0010<\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010CR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\"\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020,0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010+0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010+0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00100\u001a\u0006\u0012\u0002\b\u0003018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u0006\u0012\u0002\b\u0003018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u0014\u00106\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0014R\u0014\u00107\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0014¨\u0006E"}, d2 = {"Lcom/squareup/wire/internal/FieldBinding;", PlayerKt.FOOTBALL_MIDFIELDER, "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "wireField", "Lcom/squareup/wire/WireField;", "messageType", "Ljava/lang/Class;", "messageField", "Ljava/lang/reflect/Field;", "builderType", "writeIdentityValues", "", "classLoader", "Ljava/lang/ClassLoader;", "<init>", "(Lcom/squareup/wire/WireField;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/Class;ZLjava/lang/ClassLoader;)V", "getWriteIdentityValues", "()Z", "label", "Lcom/squareup/wire/WireField$Label;", "getLabel", "()Lcom/squareup/wire/WireField$Label;", "name", "", "getName", "()Ljava/lang/String;", "wireFieldJsonName", "getWireFieldJsonName", "declaredName", "getDeclaredName", "tag", "", "getTag", "()I", "keyAdapterString", "adapterString", "redacted", "getRedacted", "builderSetter", "Lkotlin/Function2;", "", "", "builderGetter", "Lkotlin/Function1;", "instanceGetter", "keyAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getKeyAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "singleAdapter", "getSingleAdapter", "isMap", "isMessage", "getBuilderSetter", "getBuilderGetter", "getInstanceGetter", U3.i.X, "builder", "(Lcom/squareup/wire/Message$Builder;Ljava/lang/Object;)V", "set", "get", PglCryptUtils.KEY_MESSAGE, "(Lcom/squareup/wire/Message;)Ljava/lang/Object;", "getFromBuilder", "(Lcom/squareup/wire/Message$Builder;)Ljava/lang/Object;", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {

    @NotNull
    private static final Regex IS_GETTER_FIELD_NAME_REGEX = new Regex("^is[^a-z].*$");

    @NotNull
    private final String adapterString;

    @NotNull
    private final Function1<B, Object> builderGetter;

    @NotNull
    private final Function2<B, Object, Unit> builderSetter;

    @Nullable
    private final ClassLoader classLoader;

    @NotNull
    private final String declaredName;

    @NotNull
    private final Function1<M, Object> instanceGetter;

    @NotNull
    private final String keyAdapterString;

    @NotNull
    private final WireField.Label label;

    @NotNull
    private final Field messageField;

    @NotNull
    private final String name;
    private final boolean redacted;
    private final int tag;

    @NotNull
    private final String wireFieldJsonName;
    private final boolean writeIdentityValues;

    public FieldBinding(@NotNull WireField wireField, @NotNull Class<M> cls, @NotNull Field field, @NotNull Class<B> cls2, boolean z, @Nullable ClassLoader classLoader) {
        String declaredName;
        wireField.getClass();
        cls.getClass();
        field.getClass();
        cls2.getClass();
        this.messageField = field;
        this.writeIdentityValues = z;
        this.classLoader = classLoader;
        this.label = wireField.label();
        String name = field.getName();
        name.getClass();
        this.name = name;
        this.wireFieldJsonName = wireField.jsonName();
        if (wireField.declaredName().length() == 0) {
            declaredName = field.getName();
            declaredName.getClass();
        } else {
            declaredName = wireField.declaredName();
        }
        this.declaredName = declaredName;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.builderSetter = getBuilderSetter(cls2, wireField);
        this.builderGetter = getBuilderGetter(cls2, wireField);
        this.instanceGetter = getInstanceGetter(cls);
    }

    private final Function1<B, Object> getBuilderGetter(Class<?> builderType, WireField wireField) {
        if (builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new yx7(wireField, 4);
        }
        try {
            return new yx7(builderType.getField(getName()), 5);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + builderType.getName() + '.' + this.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$0(WireField wireField, Message.Builder builder) {
        builder.getClass();
        return ((KotlinConstructorBuilder) builder).get(wireField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$1(Field field, Message.Builder builder) {
        builder.getClass();
        return field.get(builder);
    }

    private final Function2<B, Object, Unit> getBuilderSetter(Class<?> builderType, WireField wireField) {
        if (builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new hl7(wireField, 13);
        }
        if (!wireField.label().isOneOf()) {
            try {
                return new hl7(builderType.getField(getName()), 15);
            } catch (NoSuchFieldException unused) {
                throw new AssertionError("No builder field " + builderType.getName() + '.' + this.getName());
            }
        }
        Class<?> type = this.messageField.getType();
        try {
            return new hl7(builderType.getMethod(getName(), type), 14);
        } catch (NoSuchMethodException unused2) {
            throw new AssertionError("No builder method " + builderType.getName() + '.' + this.getName() + '(' + type.getName() + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$0(WireField wireField, Message.Builder builder, Object obj) {
        builder.getClass();
        ((KotlinConstructorBuilder) builder).set(wireField, obj);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$1(Method method, Message.Builder builder, Object obj) {
        builder.getClass();
        method.invoke(builder, obj);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$2(Field field, Message.Builder builder, Object obj) {
        builder.getClass();
        field.set(builder, obj);
        return Unit.a;
    }

    private final Function1<M, Object> getInstanceGetter(Class<M> messageType) {
        if (!Modifier.isPrivate(this.messageField.getModifiers())) {
            return new yx7(this, 7);
        }
        String name = this.messageField.getName();
        Regex regex = IS_GETTER_FIELD_NAME_REGEX;
        name.getClass();
        if (!regex.f(name)) {
            if (name.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String valueOf = String.valueOf(name.charAt(0));
                valueOf.getClass();
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb.append((Object) upperCase);
                sb.append(name.substring(1));
                name = sb.toString();
            }
            name = "get".concat(name);
        }
        return new yx7(messageType.getMethod(name, null), 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$1(Method method, Message message) {
        message.getClass();
        return method.invoke(message, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$2(FieldBinding fieldBinding, Message message) {
        message.getClass();
        return fieldBinding.messageField.get(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @Nullable
    public Object get(@NotNull M message) {
        message.getClass();
        return this.instanceGetter.invoke(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
    public String getDeclaredName() {
        return this.declaredName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @Nullable
    public Object getFromBuilder(@NotNull B builder) {
        builder.getClass();
        return this.builderGetter.invoke(builder);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
    public ProtoAdapter<?> getKeyAdapter() {
        return ProtoAdapter.INSTANCE.get(this.keyAdapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
    public WireField.Label getLabel() {
        return this.label;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.redacted;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
    public ProtoAdapter<?> getSingleAdapter() {
        return ProtoAdapter.INSTANCE.get(this.adapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.tag;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
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
        KClass<?> type = getSingleAdapter().getType();
        Class y = type != null ? sha.y(type) : null;
        y.getClass();
        return Message.class.isAssignableFrom(y);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(@NotNull B builder, @Nullable Object value) {
        builder.getClass();
        this.builderSetter.invoke(builder, value);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(@NotNull B builder, @NotNull Object value) {
        builder.getClass();
        value.getClass();
        if (getLabel().isRepeated()) {
            Object fromBuilder = getFromBuilder((FieldBinding<M, B>) builder);
            if (i5k.g(fromBuilder)) {
                fromBuilder.getClass();
                i5k.b(fromBuilder).add(value);
                return;
            } else if (fromBuilder instanceof List) {
                ArrayList arrayList = new ArrayList((Collection) fromBuilder);
                arrayList.add(value);
                set((FieldBinding<M, B>) builder, (Object) arrayList);
                return;
            } else {
                throw new ClassCastException("Expected a list type, got " + (fromBuilder != null ? fromBuilder.getClass() : null) + '.');
            }
        }
        if (this.keyAdapterString.length() <= 0) {
            set((FieldBinding<M, B>) builder, value);
            return;
        }
        Object fromBuilder2 = getFromBuilder((FieldBinding<M, B>) builder);
        boolean z = fromBuilder2 instanceof Map;
        if (z && (!(fromBuilder2 instanceof eia) || (fromBuilder2 instanceof iia))) {
            ((Map) fromBuilder2).putAll((Map) value);
            return;
        }
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) fromBuilder2);
            linkedHashMap.putAll((Map) value);
            set((FieldBinding<M, B>) builder, (Object) linkedHashMap);
        } else {
            throw new ClassCastException("Expected a map type, got " + (fromBuilder2 != null ? fromBuilder2.getClass() : null) + '.');
        }
    }

    public /* synthetic */ FieldBinding(WireField wireField, Class cls, Field field, Class cls2, boolean z, ClassLoader classLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireField, cls, field, cls2, z, (i & 32) != 0 ? cls.getClassLoader() : classLoader);
    }
}
