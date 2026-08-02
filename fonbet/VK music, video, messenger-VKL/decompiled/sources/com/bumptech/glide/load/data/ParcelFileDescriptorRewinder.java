package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.a;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class ParcelFileDescriptorRewinder implements com.bumptech.glide.load.data.a<ParcelFileDescriptor> {
    public final InternalRewinder a;

    public static final class InternalRewinder {
        public final ParcelFileDescriptor a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.a;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public static final class a implements a.InterfaceC0098a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0098a
        @NonNull
        public final Class<ParcelFileDescriptor> b() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0098a
        @NonNull
        public final com.bumptech.glide.load.data.a<ParcelFileDescriptor> build(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.a
    @NonNull
    public final ParcelFileDescriptor b() throws IOException {
        return this.a.rewind();
    }

    @NonNull
    public final ParcelFileDescriptor c() throws IOException {
        return this.a.rewind();
    }

    @Override // com.bumptech.glide.load.data.a
    public final void a() {
    }
}
