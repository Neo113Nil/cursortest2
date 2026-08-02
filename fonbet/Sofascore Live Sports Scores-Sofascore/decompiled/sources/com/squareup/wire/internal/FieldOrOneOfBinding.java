package com.squareup.wire.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.L6;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.joa;
import defpackage.qo6;
import defpackage.ypa;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\u000eJ!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00028\u0001H&¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015R'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0014\u00101\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0018\u00103\u001a\u0006\u0012\u0002\b\u00030\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001aR\u0018\u00105\u001a\u0006\u0012\u0002\b\u00030\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001aR\u0014\u00107\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010&¨\u00068"}, d2 = {"Lcom/squareup/wire/internal/FieldOrOneOfBinding;", PlayerKt.FOOTBALL_MIDFIELDER, "B", "", "<init>", "()V", "Lcom/squareup/wire/Syntax;", "syntax", "", "omitIdentity", "(Lcom/squareup/wire/Syntax;)Z", "builder", U3.i.X, "", "(Ljava/lang/Object;Ljava/lang/Object;)V", "set", PglCryptUtils.KEY_MESSAGE, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getFromBuilder", "omitFromJson", "(Lcom/squareup/wire/Syntax;Ljava/lang/Object;)Z", "Lcom/squareup/wire/ProtoAdapter;", "adapter$delegate", "Ljoa;", "getAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "getAdapter$annotations", L6.G1, "", "getTag", "()I", "tag", "Lcom/squareup/wire/WireField$Label;", "getLabel", "()Lcom/squareup/wire/WireField$Label;", "label", "getRedacted", "()Z", "redacted", "isMap", "isMessage", "", "getName", "()Ljava/lang/String;", "name", "getDeclaredName", "declaredName", "getWireFieldJsonName", "wireFieldJsonName", "getKeyAdapter", "keyAdapter", "getSingleAdapter", "singleAdapter", "getWriteIdentityValues", "writeIdentityValues", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FieldOrOneOfBinding<M, B> {

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa adapter = ypa.b(new qo6(this, 25));

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter adapter_delegate$lambda$0(FieldOrOneOfBinding fieldOrOneOfBinding) {
        if (!fieldOrOneOfBinding.isMap()) {
            ProtoAdapter<?> withLabel$wire_runtime = fieldOrOneOfBinding.getSingleAdapter().withLabel$wire_runtime(fieldOrOneOfBinding.getLabel());
            withLabel$wire_runtime.getClass();
            return withLabel$wire_runtime;
        }
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<?> keyAdapter = fieldOrOneOfBinding.getKeyAdapter();
        keyAdapter.getClass();
        ProtoAdapter<?> singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
        singleAdapter.getClass();
        ProtoAdapter newMapAdapter = companion.newMapAdapter(keyAdapter, singleAdapter);
        newMapAdapter.getClass();
        return newMapAdapter;
    }

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

    @Nullable
    public abstract Object get(M message);

    @NotNull
    public final ProtoAdapter<Object> getAdapter() {
        return (ProtoAdapter) this.adapter.getValue();
    }

    @NotNull
    public abstract String getDeclaredName();

    @Nullable
    public abstract Object getFromBuilder(B builder);

    @NotNull
    public abstract ProtoAdapter<?> getKeyAdapter();

    @NotNull
    public abstract WireField.Label getLabel();

    @NotNull
    public abstract String getName();

    public abstract boolean getRedacted();

    @NotNull
    public abstract ProtoAdapter<?> getSingleAdapter();

    public abstract int getTag();

    @NotNull
    public abstract String getWireFieldJsonName();

    public abstract boolean getWriteIdentityValues();

    public abstract boolean isMap();

    public abstract boolean isMessage();

    public final boolean omitFromJson(@NotNull Syntax syntax, @Nullable Object value) {
        syntax.getClass();
        if (value == null) {
            return true;
        }
        return omitIdentity(syntax) && value.equals(getAdapter().getIdentity());
    }

    public abstract void set(B builder, @Nullable Object value);

    public abstract void value(B builder, @NotNull Object value);

    public static /* synthetic */ void getAdapter$annotations() {
    }
}
