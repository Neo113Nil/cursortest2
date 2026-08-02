package com.squareup.wire.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.WireField;
import defpackage.ct8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000f\u0018\u0000 H*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001HB%\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0017J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%JW\u0010-\u001a\u00020\u0013\"\u0004\b\u0002\u0010&2\b\u0010'\u001a\u0004\u0018\u00018\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00020(2\b\u0010*\u001a\u0004\u0018\u00018\u00022 \u0010,\u001a\u001c\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00130+¢\u0006\u0004\b-\u0010.R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u001c\u00102\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u0000018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R/\u00106\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R)\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001050:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001f0(8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001f\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0(8\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u001d\u0010G\u001a\u00020\u001f*\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003058F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "", PlayerKt.FOOTBALL_MIDFIELDER, "B", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/internal/MessageBinding;", "binding", "", "preservingProtoFieldNames", "<init>", "(Lcom/squareup/wire/internal/MessageBinding;Z)V", "newBuilder", "()Ljava/lang/Object;", U3.i.X, "", "encodedSize", "(Ljava/lang/Object;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "", "encode", "(Lcom/squareup/wire/ProtoWriter;Ljava/lang/Object;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "redact", "(Ljava/lang/Object;)Ljava/lang/Object;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Object;", "A", PglCryptUtils.KEY_MESSAGE, "", "jsonAdapters", "redactedFieldsAdapter", "Lkotlin/Function3;", "encodeValue", "writeAllFields", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lct8;)V", "Lcom/squareup/wire/internal/MessageBinding;", "Z", "Lkotlin/reflect/KClass;", "messageType", "Lkotlin/reflect/KClass;", "", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "fields", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "", "fieldBindingsArray", "[Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "getFieldBindingsArray", "()[Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "jsonNames", "Ljava/util/List;", "getJsonNames", "()Ljava/util/List;", "jsonAlternateNames", "getJsonAlternateNames", "getJsonName", "(Lcom/squareup/wire/internal/FieldOrOneOfBinding;)Ljava/lang/String;", "jsonName", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RuntimeMessageAdapter<M, B> extends ProtoAdapter<M> {

    @NotNull
    private static final String REDACTED = "██";

    @NotNull
    private final MessageBinding<M, B> binding;

    @NotNull
    private final FieldOrOneOfBinding<M, B>[] fieldBindingsArray;

    @NotNull
    private final Map<Integer, FieldOrOneOfBinding<M, B>> fields;

    @NotNull
    private final List<String> jsonAlternateNames;

    @NotNull
    private final List<String> jsonNames;

    @NotNull
    private final KClass<? super M> messageType;
    private final boolean preservingProtoFieldNames;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeMessageAdapter(@NotNull MessageBinding<M, B> messageBinding, boolean z) {
        super(FieldEncoding.LENGTH_DELIMITED, messageBinding.getMessageType(), messageBinding.getTypeUrl(), messageBinding.getSyntax(), null, null, 48, null);
        String str;
        messageBinding.getClass();
        this.binding = messageBinding;
        this.preservingProtoFieldNames = z;
        this.messageType = messageBinding.getMessageType();
        Map<Integer, FieldOrOneOfBinding<M, B>> fields = messageBinding.getFields();
        this.fields = fields;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) fields.values().toArray(new FieldOrOneOfBinding[0]);
        this.fieldBindingsArray = fieldOrOneOfBindingArr;
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            arrayList.add(getJsonName(fieldOrOneOfBinding));
        }
        this.jsonNames = arrayList;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr2 = this.fieldBindingsArray;
        ArrayList arrayList2 = new ArrayList(fieldOrOneOfBindingArr2.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding2 : fieldOrOneOfBindingArr2) {
            arrayList2.add(getJsonName(fieldOrOneOfBinding2));
        }
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr3 = this.fieldBindingsArray;
        ArrayList arrayList3 = new ArrayList(fieldOrOneOfBindingArr3.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding3 : fieldOrOneOfBindingArr3) {
            if (!Intrinsics.c(getJsonName(fieldOrOneOfBinding3), fieldOrOneOfBinding3.getDeclaredName())) {
                str = fieldOrOneOfBinding3.getDeclaredName();
            } else if (Intrinsics.c(getJsonName(fieldOrOneOfBinding3), fieldOrOneOfBinding3.getName())) {
                String camelCase$default = _PlatformKt.camelCase$default(fieldOrOneOfBinding3.getDeclaredName(), false, 2, null);
                str = (Intrinsics.c(getJsonName(fieldOrOneOfBinding3), camelCase$default) || arrayList2.contains(camelCase$default)) ? null : camelCase$default;
            } else {
                str = fieldOrOneOfBinding3.getName();
            }
            arrayList3.add(str);
        }
        this.jsonAlternateNames = arrayList3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public M decode(@NotNull ProtoReader reader) {
        reader.getClass();
        B newBuilder = newBuilder();
        long beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                reader.endMessageAndGetUnknownFields(beginMessage);
                return this.binding.build(newBuilder);
            }
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fields.get(Integer.valueOf(nextTag));
            if (fieldOrOneOfBinding != null) {
                try {
                    Object decode = (fieldOrOneOfBinding.isMap() ? fieldOrOneOfBinding.getAdapter() : fieldOrOneOfBinding.getSingleAdapter()).decode(reader);
                    decode.getClass();
                    fieldOrOneOfBinding.value(newBuilder, decode);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    this.binding.addUnknownField(newBuilder, nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                FieldEncoding nextFieldEncoding = reader.getNextFieldEncoding();
                nextFieldEncoding.getClass();
                this.binding.addUnknownField(newBuilder, nextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(reader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ProtoWriter writer, @NotNull M value) {
        writer.getClass();
        value.getClass();
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(writer, fieldOrOneOfBinding.getTag(), (int) obj);
            }
        }
        writer.writeBytes(this.binding.unknownFields(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(@NotNull M value) {
        value.getClass();
        int cachedSerializedSize = this.binding.getCachedSerializedSize(value);
        if (cachedSerializedSize != 0) {
            return cachedSerializedSize;
        }
        int i = 0;
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                i += fieldOrOneOfBinding.getAdapter().encodedSizeWithTag(fieldOrOneOfBinding.getTag(), obj);
            }
        }
        int h = this.binding.unknownFields(value).h() + i;
        this.binding.setCachedSerializedSize(value, h);
        return h;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof RuntimeMessageAdapter) && Intrinsics.c(((RuntimeMessageAdapter) other).messageType, this.messageType);
    }

    @NotNull
    public final FieldOrOneOfBinding<M, B>[] getFieldBindingsArray() {
        return this.fieldBindingsArray;
    }

    @NotNull
    public final Map<Integer, FieldOrOneOfBinding<M, B>> getFields() {
        return this.fields;
    }

    @NotNull
    public final List<String> getJsonAlternateNames() {
        return this.jsonAlternateNames;
    }

    @NotNull
    public final String getJsonName(@NotNull FieldOrOneOfBinding<?, ?> fieldOrOneOfBinding) {
        fieldOrOneOfBinding.getClass();
        return (fieldOrOneOfBinding.getWireFieldJsonName().length() == 0 || this.preservingProtoFieldNames) ? fieldOrOneOfBinding.getDeclaredName() : fieldOrOneOfBinding.getWireFieldJsonName();
    }

    @NotNull
    public final List<String> getJsonNames() {
        return this.jsonNames;
    }

    public int hashCode() {
        return this.messageType.hashCode();
    }

    @NotNull
    public final B newBuilder() {
        return this.binding.newBuilder();
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public M redact(@NotNull M value) {
        value.getClass();
        B newBuilder = this.binding.newBuilder();
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            if (fieldOrOneOfBinding.getRedacted() && fieldOrOneOfBinding.getLabel() == WireField.Label.REQUIRED) {
                throw new UnsupportedOperationException("Field '" + fieldOrOneOfBinding.getName() + "' in " + getType() + " is required and cannot be redacted.");
            }
            boolean isMessage = fieldOrOneOfBinding.isMessage();
            if (fieldOrOneOfBinding.getRedacted() || (isMessage && !fieldOrOneOfBinding.getLabel().isRepeated())) {
                Object fromBuilder = fieldOrOneOfBinding.getFromBuilder(newBuilder);
                if (fromBuilder != null) {
                    fieldOrOneOfBinding.set(newBuilder, fieldOrOneOfBinding.getAdapter().redact(fromBuilder));
                }
            } else if (isMessage && fieldOrOneOfBinding.getLabel().isRepeated()) {
                Object fromBuilder2 = fieldOrOneOfBinding.getFromBuilder(newBuilder);
                fromBuilder2.getClass();
                ProtoAdapter<?> singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
                singleAdapter.getClass();
                fieldOrOneOfBinding.set(newBuilder, Internal.m717redactElements((List) fromBuilder2, singleAdapter));
            }
        }
        this.binding.clearUnknownFields(newBuilder);
        return this.binding.build(newBuilder);
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public String toString(@NotNull M value) {
        value.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(this.messageType.getSimpleName());
        sb.append('{');
        boolean z = true;
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(fieldOrOneOfBinding.getName());
                sb.append(C4427z5.U);
                if (fieldOrOneOfBinding.getRedacted()) {
                    obj = REDACTED;
                }
                sb.append(obj);
                z = false;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final <A> void writeAllFields(@Nullable M message, @NotNull List<? extends A> jsonAdapters, @Nullable A redactedFieldsAdapter, @NotNull ct8 encodeValue) {
        jsonAdapters.getClass();
        encodeValue.getClass();
        int length = this.fieldBindingsArray.length;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fieldBindingsArray[i];
            message.getClass();
            Object obj = fieldOrOneOfBinding.get(message);
            if (!fieldOrOneOfBinding.omitFromJson(getSyntax(), obj)) {
                if (!fieldOrOneOfBinding.getRedacted() || redactedFieldsAdapter == null || obj == null) {
                    encodeValue.invoke(this.jsonNames.get(i), obj, jsonAdapters.get(i));
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(this.jsonNames.get(i));
                }
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return;
        }
        redactedFieldsAdapter.getClass();
        encodeValue.invoke("__redacted_fields", arrayList, redactedFieldsAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ReverseProtoWriter writer, @NotNull M value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(this.binding.unknownFields(value));
        int length = this.fieldBindingsArray.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            }
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fieldBindingsArray[length];
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(writer, fieldOrOneOfBinding.getTag(), (int) obj);
            }
        }
    }

    public /* synthetic */ RuntimeMessageAdapter(MessageBinding messageBinding, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageBinding, (i & 2) != 0 ? false : z);
    }
}
