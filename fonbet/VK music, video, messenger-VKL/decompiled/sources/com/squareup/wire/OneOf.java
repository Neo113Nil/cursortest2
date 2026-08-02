package com.squareup.wire;

import com.ironsource.B5;
import com.squareup.wire.OneOf.Key;
import com.squareup.wire.internal.Internal;
import xsna.epx;
import xsna.zcl;

/* compiled from: OneOf.kt */
/* loaded from: classes14.dex */
public final class OneOf<K extends Key<T>, T> {
    private final K key;
    private final T value;

    public OneOf(K k, T t) {
        this.key = k;
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneOf copy$default(OneOf oneOf, Key key, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            key = oneOf.key;
        }
        if ((i & 2) != 0) {
            obj = oneOf.value;
        }
        return oneOf.copy(key, obj);
    }

    public final K component1() {
        return this.key;
    }

    public final T component2() {
        return this.value;
    }

    public final OneOf<K, T> copy(K k, T t) {
        return new OneOf<>(k, t);
    }

    public final void encodeWithTag(ProtoWriter protoWriter) {
        this.key.getAdapter().encodeWithTag(protoWriter, this.key.getTag(), (int) this.value);
    }

    public final int encodedSizeWithTag() {
        return this.key.getAdapter().encodedSizeWithTag(this.key.getTag(), this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneOf)) {
            return false;
        }
        OneOf oneOf = (OneOf) obj;
        return epx.f(this.key, oneOf.key) && epx.f(this.value, oneOf.value);
    }

    public final K getKey() {
        return this.key;
    }

    public final <X> X getOrNull(Key<X> key) {
        if (epx.f(this.key, key)) {
            return this.value;
        }
        return null;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        T t = this.value;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        ProtoAdapter<T> adapter = this.key.getAdapter();
        return this.key.getDeclaredName() + B5.U + (epx.f(adapter, ProtoAdapter.STRING) ? true : epx.f(adapter, ProtoAdapter.STRING_VALUE) ? Internal.sanitize(String.valueOf(this.value)) : String.valueOf(this.value));
    }

    public final void encodeWithTag(ReverseProtoWriter reverseProtoWriter) {
        this.key.getAdapter().encodeWithTag(reverseProtoWriter, this.key.getTag(), (int) this.value);
    }

    /* compiled from: OneOf.kt */
    public static abstract class Key<T> {
        private final ProtoAdapter<T> adapter;
        private final String declaredName;
        private final String jsonName;
        private final boolean redacted;
        private final int tag;

        public Key(int i, ProtoAdapter<T> protoAdapter, String str, boolean z, String str2) {
            this.tag = i;
            this.adapter = protoAdapter;
            this.declaredName = str;
            this.redacted = z;
            this.jsonName = str2;
        }

        public final ProtoAdapter<T> getAdapter() {
            return this.adapter;
        }

        public final String getDeclaredName() {
            return this.declaredName;
        }

        public final String getJsonName() {
            return this.jsonName;
        }

        public final boolean getRedacted() {
            return this.redacted;
        }

        public final int getTag() {
            return this.tag;
        }

        public /* synthetic */ Key(int i, ProtoAdapter protoAdapter, String str, boolean z, String str2, int i2, zcl zclVar) {
            this(i, protoAdapter, str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? "" : str2);
        }
    }
}
