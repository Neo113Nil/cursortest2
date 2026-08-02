package com.squareup.wire.internal;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import xsna.dcy;
import xsna.tby;

/* compiled from: OneOfBinding.kt */
/* loaded from: classes14.dex */
public final class OneOfBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {
    private final Field builderField;
    private final OneOf.Key<?> key;
    private final Field messageField;
    private final boolean writeIdentityValues;

    public OneOfBinding(Field field, Class<B> cls, OneOf.Key<?> key, boolean z) {
        this.messageField = field;
        this.key = key;
        this.writeIdentityValues = z;
        this.builderField = cls.getDeclaredField(field.getName());
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getDeclaredName() {
        return this.key.getDeclaredName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public /* bridge */ /* synthetic */ ProtoAdapter getKeyAdapter() {
        return (ProtoAdapter) m42getKeyAdapter();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public WireField.Label getLabel() {
        return WireField.Label.OPTIONAL;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getName() {
        return this.key.getDeclaredName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.key.getRedacted();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<Object> getSingleAdapter() {
        return this.key.getAdapter();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.key.getTag();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getWireFieldJsonName() {
        return this.key.getJsonName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getWriteIdentityValues() {
        return this.writeIdentityValues;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMap() {
        return false;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMessage() {
        dcy<?> type = getSingleAdapter().getType();
        return Message.class.isAssignableFrom(type == null ? null : tby.e(type));
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object get(M m) {
        OneOf oneOf = (OneOf) this.messageField.get(m);
        if (oneOf == null) {
            return null;
        }
        return oneOf.getOrNull(this.key);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object getFromBuilder(B b) {
        OneOf oneOf = (OneOf) this.builderField.get(b);
        if (oneOf == null) {
            return null;
        }
        return oneOf.getOrNull(this.key);
    }

    /* renamed from: getKeyAdapter, reason: collision with other method in class */
    public Void m42getKeyAdapter() {
        throw new IllegalStateException("not a map");
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(B b, Object obj) {
        this.builderField.set(b, new OneOf(this.key, obj));
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(B b, Object obj) {
        set((OneOfBinding<M, B>) b, obj);
    }
}
