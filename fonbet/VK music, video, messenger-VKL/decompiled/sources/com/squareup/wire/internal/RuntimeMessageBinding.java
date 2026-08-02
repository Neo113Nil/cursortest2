package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.Syntax;
import java.util.Map;
import okio.ByteString;
import xsna.dcy;
import xsna.gzs;

/* compiled from: reflection.kt */
/* loaded from: classes14.dex */
final class RuntimeMessageBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> implements MessageBinding<M, B> {
    private final Class<B> builderType;
    private final gzs<B> createBuilder;
    private final Map<Integer, FieldOrOneOfBinding<M, B>> fields;
    private final dcy<M> messageType;
    private final Syntax syntax;
    private final String typeUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public RuntimeMessageBinding(dcy<M> dcyVar, Class<B> cls, gzs<? extends B> gzsVar, Map<Integer, ? extends FieldOrOneOfBinding<M, B>> map, String str, Syntax syntax) {
        this.messageType = dcyVar;
        this.builderType = cls;
        this.createBuilder = gzsVar;
        this.fields = map;
        this.typeUrl = str;
        this.syntax = syntax;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public Map<Integer, FieldOrOneOfBinding<M, B>> getFields() {
        return this.fields;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public dcy<M> getMessageType() {
        return this.messageType;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public Syntax getSyntax() {
        return this.syntax;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public String getTypeUrl() {
        return this.typeUrl;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void addUnknownField(B b, int i, FieldEncoding fieldEncoding, Object obj) {
        b.addUnknownField(i, fieldEncoding, obj);
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public M build(B b) {
        return (M) b.build();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void clearUnknownFields(B b) {
        b.clearUnknownFields();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public int getCachedSerializedSize(M m) {
        return m.getCachedSerializedSize$wire_runtime();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public B newBuilder() {
        return this.createBuilder.invoke();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void setCachedSerializedSize(M m, int i) {
        m.setCachedSerializedSize$wire_runtime(i);
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public ByteString unknownFields(M m) {
        return m.unknownFields();
    }
}
