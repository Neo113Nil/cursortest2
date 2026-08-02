package com.vk.story.viewer.impl.presentation.stories.util.audio;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.afl0;
import xsna.ao4;
import xsna.m360;
import xsna.oa5;
import xsna.p1d0;

/* compiled from: StoryAudioHandler.kt */
/* loaded from: classes6.dex */
public final class StoryAudioHandler {
    public final p1d0 a;
    public final afl0 b;
    public final ao4 c;
    public final VolumeChangeListener d = new VolumeChangeListener(new m360(this, 20));
    public final RingerStateListener e = new RingerStateListener(new oa5(this, 11));
    public boolean f;
    public boolean g;

    /* compiled from: StoryAudioHandler.kt */
    public static final class TransferableState implements Parcelable {
        public static final Parcelable.Creator<TransferableState> CREATOR = new a();
        public final boolean b;
        public final boolean c;

        /* compiled from: StoryAudioHandler.kt */
        public static final class a implements Parcelable.Creator<TransferableState> {
            @Override // android.os.Parcelable.Creator
            public final TransferableState createFromParcel(Parcel parcel) {
                return new TransferableState(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final TransferableState[] newArray(int i) {
                return new TransferableState[i];
            }
        }

        public TransferableState(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransferableState)) {
                return false;
            }
            TransferableState transferableState = (TransferableState) obj;
            return this.b == transferableState.b && this.c == transferableState.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TransferableState(audioWasRequested=");
            sb.append(this.b);
            sb.append(", focusWasGranted=");
            return q0.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public StoryAudioHandler(p1d0 p1d0Var, afl0 afl0Var) {
        this.a = p1d0Var;
        this.b = afl0Var;
        this.c = new ao4(p1d0Var, afl0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if ((xsna.f5b0.a(r5).getRingerMode() == 2) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001d A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0001, B:9:0x0009, B:11:0x000f, B:15:0x0019, B:17:0x001d, B:21:0x0038, B:24:0x0032), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(Context context, TransferableState transferableState) {
        boolean z;
        try {
            if (this.f) {
                if (transferableState != null) {
                    boolean z2 = true;
                    if (!this.g && !transferableState.b) {
                        z = false;
                        this.g = z;
                        if (z) {
                            this.e.getClass();
                        }
                        if (transferableState.c) {
                            z2 = false;
                        }
                        b(context, z2);
                    }
                    z = true;
                    this.g = z;
                    if (z) {
                    }
                    if (transferableState.c) {
                    }
                    b(context, z2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context, boolean z) {
        ao4 ao4Var = this.c;
        if (z) {
            ao4Var.b(context);
        } else if (ao4Var.e) {
            this.a.invoke();
        } else {
            this.b.invoke();
        }
    }
}
