package com.squareup.wire.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import defpackage.sha;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B3\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u00102\u001a\u0002032\u0006\u00104\u001a\u00028\u00012\u0006\u00102\u001a\u00020-H\u0016¢\u0006\u0002\u00105J\u001f\u00106\u001a\u0002032\u0006\u00104\u001a\u00028\u00012\b\u00102\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0002\u00105J\u0018\u00107\u001a\u0004\u0018\u00010-2\u0006\u00108\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00109J\u0017\u0010:\u001a\u0004\u0018\u00010-2\u0006\u00104\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010;R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0014\u0010%\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u0014\u0010&\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0011R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R \u0010+\u001a\b\u0012\u0004\u0012\u00020-0,8VX\u0096\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u0006<"}, d2 = {"Lcom/squareup/wire/internal/OneOfBinding;", PlayerKt.FOOTBALL_MIDFIELDER, "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "messageField", "Ljava/lang/reflect/Field;", "builderType", "Ljava/lang/Class;", U3.i.W, "Lcom/squareup/wire/OneOf$Key;", "writeIdentityValues", "", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Class;Lcom/squareup/wire/OneOf$Key;Z)V", "getWriteIdentityValues", "()Z", "builderField", "tag", "", "getTag", "()I", "label", "Lcom/squareup/wire/WireField$Label;", "getLabel", "()Lcom/squareup/wire/WireField$Label;", "redacted", "getRedacted", "wireFieldJsonName", "", "getWireFieldJsonName", "()Ljava/lang/String;", "name", "getName", "declaredName", "getDeclaredName", "isMap", "isMessage", "keyAdapter", "", "getKeyAdapter", "()Ljava/lang/Void;", "singleAdapter", "Lcom/squareup/wire/ProtoAdapter;", "", "getSingleAdapter$annotations", "()V", "getSingleAdapter", "()Lcom/squareup/wire/ProtoAdapter;", U3.i.X, "", "builder", "(Lcom/squareup/wire/Message$Builder;Ljava/lang/Object;)V", "set", "get", PglCryptUtils.KEY_MESSAGE, "(Lcom/squareup/wire/Message;)Ljava/lang/Object;", "getFromBuilder", "(Lcom/squareup/wire/Message$Builder;)Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneOfBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {

    @NotNull
    private final Field builderField;

    @NotNull
    private final OneOf.Key<?> key;

    @NotNull
    private final Field messageField;
    private final boolean writeIdentityValues;

    public OneOfBinding(@NotNull Field field, @NotNull Class<B> cls, @NotNull OneOf.Key<?> key, boolean z) {
        field.getClass();
        cls.getClass();
        key.getClass();
        this.messageField = field;
        this.key = key;
        this.writeIdentityValues = z;
        Field declaredField = cls.getDeclaredField(field.getName());
        declaredField.getClass();
        this.builderField = declaredField;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @Nullable
    public Object get(@NotNull M message) {
        message.getClass();
        OneOf oneOf = (OneOf) this.messageField.get(message);
        if (oneOf != null) {
            return oneOf.getOrNull(this.key);
        }
        return null;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
    public String getDeclaredName() {
        return this.key.getDeclaredName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @Nullable
    public Object getFromBuilder(@NotNull B builder) {
        builder.getClass();
        OneOf oneOf = (OneOf) this.builderField.get(builder);
        if (oneOf != null) {
            return oneOf.getOrNull(this.key);
        }
        return null;
    }

    @NotNull
    /* renamed from: getKeyAdapter, reason: collision with other method in class */
    public Void m721getKeyAdapter() {
        throw new IllegalStateException("not a map");
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
    public WireField.Label getLabel() {
        return WireField.Label.OPTIONAL;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
    public String getName() {
        return this.key.getDeclaredName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.key.getRedacted();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
    public ProtoAdapter<Object> getSingleAdapter() {
        ProtoAdapter<?> adapter = this.key.getAdapter();
        adapter.getClass();
        return adapter;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.key.getTag();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    @NotNull
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
        KClass<?> type = getSingleAdapter().getType();
        return Message.class.isAssignableFrom(type != null ? sha.y(type) : null);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(@NotNull B builder, @Nullable Object value) {
        builder.getClass();
        Field field = this.builderField;
        OneOf.Key<?> key = this.key;
        key.getClass();
        value.getClass();
        field.set(builder, new OneOf(key, value));
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(@NotNull B builder, @NotNull Object value) {
        builder.getClass();
        value.getClass();
        set((OneOfBinding<M, B>) builder, value);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public /* bridge */ /* synthetic */ ProtoAdapter getKeyAdapter() {
        return (ProtoAdapter) m721getKeyAdapter();
    }

    public static /* synthetic */ void getSingleAdapter$annotations() {
    }
}
