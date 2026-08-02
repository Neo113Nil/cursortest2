package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.gzs;

/* compiled from: FieldOrOneOfBinding.kt */
/* loaded from: classes14.dex */
public abstract class FieldOrOneOfBinding<M, B> {
    private final Lazy adapter$delegate = new bpn0(new gzs<ProtoAdapter<Object>>(this) { // from class: com.squareup.wire.internal.FieldOrOneOfBinding$adapter$2
        final /* synthetic */ FieldOrOneOfBinding<M, B> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.gzs
        public final ProtoAdapter<Object> invoke() {
            return this.this$0.isMap() ? ProtoAdapter.Companion.newMapAdapter(this.this$0.getKeyAdapter(), this.this$0.getSingleAdapter()) : this.this$0.getSingleAdapter().withLabel$wire_runtime(this.this$0.getLabel());
        }
    });

    private final boolean omitIdentity(Syntax syntax) {
        if (getWriteIdentityValues()) {
            return false;
        }
        if (getLabel() == WireField.Label.OMIT_IDENTITY) {
            return true;
        }
        if (getLabel().isRepeated() && syntax == Syntax.PROTO_3) {
            return true;
        }
        return isMap() && syntax == Syntax.PROTO_3;
    }

    public abstract Object get(M m);

    public final ProtoAdapter<Object> getAdapter() {
        return (ProtoAdapter) this.adapter$delegate.getValue();
    }

    public abstract String getDeclaredName();

    public abstract Object getFromBuilder(B b);

    public abstract ProtoAdapter<?> getKeyAdapter();

    public abstract WireField.Label getLabel();

    public abstract String getName();

    public abstract boolean getRedacted();

    public abstract ProtoAdapter<?> getSingleAdapter();

    public abstract int getTag();

    public abstract String getWireFieldJsonName();

    public abstract boolean getWriteIdentityValues();

    public abstract boolean isMap();

    public abstract boolean isMessage();

    public final boolean omitFromJson(Syntax syntax, Object obj) {
        if (obj == null) {
            return true;
        }
        return omitIdentity(syntax) && obj.equals(getAdapter().getIdentity());
    }

    public abstract void set(B b, Object obj);

    public abstract void value(B b, Object obj);
}
