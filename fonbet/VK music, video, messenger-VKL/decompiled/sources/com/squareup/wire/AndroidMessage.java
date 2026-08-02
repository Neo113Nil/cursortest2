package com.squareup.wire;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.lang.reflect.Array;
import okio.ByteString;
import xsna.dcy;
import xsna.tby;
import xsna.zcl;

/* compiled from: AndroidMessage.kt */
/* loaded from: classes14.dex */
public abstract class AndroidMessage<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message<M, B> implements Parcelable {
    public static final Companion Companion = new Companion(null);

    /* compiled from: AndroidMessage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> protoAdapter) {
            return new ProtoAdapterCreator(protoAdapter);
        }

        private Companion() {
        }
    }

    /* compiled from: AndroidMessage.kt */
    public static final class ProtoAdapterCreator<M> implements Parcelable.Creator<M> {
        private final ProtoAdapter<M> adapter;

        public ProtoAdapterCreator(ProtoAdapter<M> protoAdapter) {
            this.adapter = protoAdapter;
        }

        @Override // android.os.Parcelable.Creator
        public M createFromParcel(Parcel parcel) {
            return this.adapter.decode(parcel.createByteArray());
        }

        @Override // android.os.Parcelable.Creator
        public M[] newArray(int i) {
            dcy<?> type = this.adapter.getType();
            Object newInstance = Array.newInstance((Class<?>) (type == null ? null : tby.e(type)), i);
            if (newInstance != null) {
                return (M[]) ((Object[]) newInstance);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<M of com.squareup.wire.AndroidMessage.ProtoAdapterCreator>");
        }
    }

    public AndroidMessage(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        super(protoAdapter, byteString);
    }

    public static final <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> protoAdapter) {
        return Companion.newCreator(protoAdapter);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(encode());
    }
}
