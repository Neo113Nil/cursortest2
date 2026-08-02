package com.squareup.wire.internal;

import com.ironsource.B5;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.dcy;
import xsna.epx;
import xsna.s3q0;
import xsna.yzs;
import xsna.zcl;

/* compiled from: RuntimeMessageAdapter.kt */
/* loaded from: classes14.dex */
public final class RuntimeMessageAdapter<M, B> extends ProtoAdapter<M> {
    public static final Companion Companion = new Companion(null);
    private static final String REDACTED = "██";
    private final MessageBinding<M, B> binding;
    private final FieldOrOneOfBinding<M, B>[] fieldBindingsArray;
    private final Map<Integer, FieldOrOneOfBinding<M, B>> fields;
    private final List<String> jsonAlternateNames;
    private final List<String> jsonNames;
    private final dcy<? super M> messageType;

    /* compiled from: RuntimeMessageAdapter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public RuntimeMessageAdapter(MessageBinding<M, B> messageBinding) {
        super(FieldEncoding.LENGTH_DELIMITED, messageBinding.getMessageType(), messageBinding.getTypeUrl(), messageBinding.getSyntax());
        this.binding = messageBinding;
        this.messageType = messageBinding.getMessageType();
        Map<Integer, FieldOrOneOfBinding<M, B>> fields = messageBinding.getFields();
        this.fields = fields;
        int i = 0;
        Object[] array = fields.values().toArray(new FieldOrOneOfBinding[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) array;
        this.fieldBindingsArray = fieldOrOneOfBindingArr;
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        int length = fieldOrOneOfBindingArr.length;
        int i2 = 0;
        while (i2 < length) {
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = fieldOrOneOfBindingArr[i2];
            i2++;
            arrayList.add(getJsonName(fieldOrOneOfBinding));
        }
        this.jsonNames = arrayList;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr2 = this.fieldBindingsArray;
        ArrayList arrayList2 = new ArrayList(fieldOrOneOfBindingArr2.length);
        int length2 = fieldOrOneOfBindingArr2.length;
        while (i < length2) {
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding2 = fieldOrOneOfBindingArr2[i];
            i++;
            arrayList2.add(!epx.f(getJsonName(fieldOrOneOfBinding2), fieldOrOneOfBinding2.getDeclaredName()) ? fieldOrOneOfBinding2.getDeclaredName() : !epx.f(getJsonName(fieldOrOneOfBinding2), fieldOrOneOfBinding2.getName()) ? fieldOrOneOfBinding2.getName() : null);
        }
        this.jsonAlternateNames = arrayList2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(ProtoReader protoReader) {
        B newBuilder = newBuilder();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                protoReader.endMessageAndGetUnknownFields(beginMessage);
                return this.binding.build(newBuilder);
            }
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fields.get(Integer.valueOf(nextTag));
            if (fieldOrOneOfBinding != null) {
                try {
                    fieldOrOneOfBinding.value(newBuilder, (fieldOrOneOfBinding.isMap() ? fieldOrOneOfBinding.getAdapter() : fieldOrOneOfBinding.getSingleAdapter()).decode(protoReader));
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    this.binding.addUnknownField(newBuilder, nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                this.binding.addUnknownField(newBuilder, nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, M m) {
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(m);
            if (obj != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(protoWriter, fieldOrOneOfBinding.getTag(), (int) obj);
            }
        }
        protoWriter.writeBytes(this.binding.unknownFields(m));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M m) {
        int cachedSerializedSize = this.binding.getCachedSerializedSize(m);
        if (cachedSerializedSize != 0) {
            return cachedSerializedSize;
        }
        int i = 0;
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(m);
            if (obj != null) {
                i += fieldOrOneOfBinding.getAdapter().encodedSizeWithTag(fieldOrOneOfBinding.getTag(), obj);
            }
        }
        int n = this.binding.unknownFields(m).n() + i;
        this.binding.setCachedSerializedSize(m, n);
        return n;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeMessageAdapter) && epx.f(((RuntimeMessageAdapter) obj).messageType, this.messageType);
    }

    public final FieldOrOneOfBinding<M, B>[] getFieldBindingsArray() {
        return this.fieldBindingsArray;
    }

    public final Map<Integer, FieldOrOneOfBinding<M, B>> getFields() {
        return this.fields;
    }

    public final List<String> getJsonAlternateNames() {
        return this.jsonAlternateNames;
    }

    public final String getJsonName(FieldOrOneOfBinding<?, ?> fieldOrOneOfBinding) {
        return fieldOrOneOfBinding.getWireFieldJsonName().length() == 0 ? fieldOrOneOfBinding.getDeclaredName() : fieldOrOneOfBinding.getWireFieldJsonName();
    }

    public final List<String> getJsonNames() {
        return this.jsonNames;
    }

    public int hashCode() {
        return this.messageType.hashCode();
    }

    public final B newBuilder() {
        return this.binding.newBuilder();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M m) {
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
                if (fromBuilder2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                }
                fieldOrOneOfBinding.set(newBuilder, Internal.m38redactElements((List) fromBuilder2, fieldOrOneOfBinding.getSingleAdapter()));
            }
        }
        this.binding.clearUnknownFields(newBuilder);
        return this.binding.build(newBuilder);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M m) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.messageType.l());
        sb.append('{');
        boolean z = true;
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : getFields().values()) {
            Object obj = fieldOrOneOfBinding.get(m);
            if (obj != null) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(fieldOrOneOfBinding.getName());
                sb.append(B5.U);
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

    public final <A> void writeAllFields(M m, List<? extends A> list, A a, yzs<? super String, Object, ? super A, s3q0> yzsVar) {
        int length = this.fieldBindingsArray.length;
        ArrayList arrayList = null;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fieldBindingsArray[i];
            Object obj = fieldOrOneOfBinding.get(m);
            if (!fieldOrOneOfBinding.omitFromJson(getSyntax(), obj)) {
                if (!fieldOrOneOfBinding.getRedacted() || a == null || obj == null) {
                    yzsVar.invoke(this.jsonNames.get(i), obj, list.get(i));
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(this.jsonNames.get(i));
                }
            }
            i = i2;
        }
        if (arrayList != null && (!arrayList.isEmpty())) {
            yzsVar.invoke("__redacted_fields", arrayList, a);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter reverseProtoWriter, M m) {
        reverseProtoWriter.writeBytes(this.binding.unknownFields(m));
        int length = this.fieldBindingsArray.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fieldBindingsArray[length];
            Object obj = fieldOrOneOfBinding.get(m);
            if (obj != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(reverseProtoWriter, fieldOrOneOfBinding.getTag(), (int) obj);
            }
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
