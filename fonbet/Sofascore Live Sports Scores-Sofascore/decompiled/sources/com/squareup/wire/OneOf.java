package com.squareup.wire;

import com.ironsource.C4427z5;
import com.ironsource.L6;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.OneOf.Key;
import com.squareup.wire.internal.Internal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0010\b\u0000\u0010\u0001 \u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001#B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0002\u0010\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u001c\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0004HÖ\u0003J\t\u0010\"\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006$"}, d2 = {"Lcom/squareup/wire/OneOf;", PlayerKt.AMERICAN_FOOTBALL_KICKER, "Lcom/squareup/wire/OneOf$Key;", "T", "", U3.i.W, U3.i.X, "<init>", "(Lcom/squareup/wire/OneOf$Key;Ljava/lang/Object;)V", "getKey", "()Lcom/squareup/wire/OneOf$Key;", "Lcom/squareup/wire/OneOf$Key;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getOrNull", "X", "(Lcom/squareup/wire/OneOf$Key;)Ljava/lang/Object;", "toString", "", "encodedSizeWithTag", "", "encodeWithTag", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "component1", "component2", "copy", "(Lcom/squareup/wire/OneOf$Key;Ljava/lang/Object;)Lcom/squareup/wire/OneOf;", "equals", "", "other", "hashCode", "Key", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OneOf<K extends Key<T>, T> {

    @NotNull
    private final K key;
    private final T value;

    public OneOf(@NotNull K k, T t) {
        k.getClass();
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

    @NotNull
    public final K component1() {
        return this.key;
    }

    public final T component2() {
        return this.value;
    }

    @NotNull
    public final OneOf<K, T> copy(@NotNull K key, T value) {
        key.getClass();
        return new OneOf<>(key, value);
    }

    public final void encodeWithTag(@NotNull ProtoWriter writer) {
        writer.getClass();
        this.key.getAdapter().encodeWithTag(writer, this.key.getTag(), (int) this.value);
    }

    public final int encodedSizeWithTag() {
        return this.key.getAdapter().encodedSizeWithTag(this.key.getTag(), this.value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneOf)) {
            return false;
        }
        OneOf oneOf = (OneOf) other;
        return Intrinsics.c(this.key, oneOf.key) && Intrinsics.c(this.value, oneOf.value);
    }

    @NotNull
    public final K getKey() {
        return this.key;
    }

    @Nullable
    public final <X> X getOrNull(@NotNull Key<X> key) {
        key.getClass();
        if (Intrinsics.c(this.key, key)) {
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

    @NotNull
    public String toString() {
        ProtoAdapter<T> adapter = this.key.getAdapter();
        return this.key.getDeclaredName() + C4427z5.U + ((Intrinsics.c(adapter, ProtoAdapter.STRING) || Intrinsics.c(adapter, ProtoAdapter.STRING_VALUE)) ? Internal.sanitize(String.valueOf(this.value)) : String.valueOf(this.value));
    }

    public final void encodeWithTag(@NotNull ReverseProtoWriter writer) {
        writer.getClass();
        this.key.getAdapter().encodeWithTag(writer, this.key.getTag(), (int) this.value);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/squareup/wire/OneOf$Key;", "T", "", "tag", "", L6.G1, "Lcom/squareup/wire/ProtoAdapter;", "declaredName", "", "redacted", "", "jsonName", "<init>", "(ILcom/squareup/wire/ProtoAdapter;Ljava/lang/String;ZLjava/lang/String;)V", "getTag", "()I", "getAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "getDeclaredName", "()Ljava/lang/String;", "getRedacted", "()Z", "getJsonName", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Key<T> {

        @NotNull
        private final ProtoAdapter<T> adapter;

        @NotNull
        private final String declaredName;

        @NotNull
        private final String jsonName;
        private final boolean redacted;
        private final int tag;

        public Key(int i, @NotNull ProtoAdapter<T> protoAdapter, @NotNull String str, boolean z, @NotNull String str2) {
            protoAdapter.getClass();
            str.getClass();
            str2.getClass();
            this.tag = i;
            this.adapter = protoAdapter;
            this.declaredName = str;
            this.redacted = z;
            this.jsonName = str2;
        }

        @NotNull
        public final ProtoAdapter<T> getAdapter() {
            return this.adapter;
        }

        @NotNull
        public final String getDeclaredName() {
            return this.declaredName;
        }

        @NotNull
        public final String getJsonName() {
            return this.jsonName;
        }

        public final boolean getRedacted() {
            return this.redacted;
        }

        public final int getTag() {
            return this.tag;
        }

        public /* synthetic */ Key(int i, ProtoAdapter protoAdapter, String str, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, protoAdapter, str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? "" : str2);
        }
    }
}
