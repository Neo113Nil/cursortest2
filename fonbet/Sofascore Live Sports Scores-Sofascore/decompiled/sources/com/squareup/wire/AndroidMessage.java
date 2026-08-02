package com.squareup.wire;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.L6;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import defpackage.gc2;
import defpackage.sha;
import java.lang.reflect.Array;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u0015*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00012\u00020\u0005:\u0002\u0016\u0015B\u001f\b\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/wire/Message;", PlayerKt.FOOTBALL_MIDFIELDER, "Lcom/squareup/wire/Message$Builder;", "B", "Landroid/os/Parcelable;", "Lcom/squareup/wire/ProtoAdapter;", L6.G1, "Lgc2;", "unknownFields", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lgc2;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "ProtoAdapterCreator", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AndroidMessage<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message<M, B> implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/wire/AndroidMessage$ProtoAdapterCreator;", PlayerKt.FOOTBALL_MIDFIELDER, "Landroid/os/Parcelable$Creator;", L6.G1, "Lcom/squareup/wire/ProtoAdapter;", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "createFromParcel", "input", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)Ljava/lang/Object;", "newArray", "", "size", "", "(I)[Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProtoAdapterCreator<M> implements Parcelable.Creator<M> {

        @NotNull
        private final ProtoAdapter<M> adapter;

        public ProtoAdapterCreator(@NotNull ProtoAdapter<M> protoAdapter) {
            protoAdapter.getClass();
            this.adapter = protoAdapter;
        }

        @Override // android.os.Parcelable.Creator
        public M createFromParcel(@NotNull Parcel input) {
            input.getClass();
            ProtoAdapter<M> protoAdapter = this.adapter;
            byte[] createByteArray = input.createByteArray();
            createByteArray.getClass();
            return protoAdapter.decode(createByteArray);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public M[] newArray(int size) {
            KClass<?> type = this.adapter.getType();
            Object newInstance = Array.newInstance((Class<?>) (type != null ? sha.y(type) : null), size);
            newInstance.getClass();
            return (M[]) ((Object[]) newInstance);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMessage(@NotNull ProtoAdapter<M> protoAdapter, @NotNull gc2 gc2Var) {
        super(protoAdapter, gc2Var);
        protoAdapter.getClass();
        gc2Var.getClass();
    }

    @NotNull
    public static final <E> Parcelable.Creator<E> newCreator(@NotNull ProtoAdapter<E> protoAdapter) {
        return INSTANCE.newCreator(protoAdapter);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeByteArray(encode());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0002\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0007¨\u0006\t"}, d2 = {"Lcom/squareup/wire/AndroidMessage$Companion;", "", "<init>", "()V", "newCreator", "Landroid/os/Parcelable$Creator;", "E", L6.G1, "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <E> Parcelable.Creator<E> newCreator(@NotNull ProtoAdapter<E> adapter) {
            adapter.getClass();
            return new ProtoAdapterCreator(adapter);
        }

        private Companion() {
        }
    }
}
