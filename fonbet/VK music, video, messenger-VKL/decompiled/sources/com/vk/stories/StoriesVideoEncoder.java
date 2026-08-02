package com.vk.stories;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.log.L;
import com.vk.media.pipeline.model.quality.MediaQuality;
import com.vk.media.pipeline.model.timeline.Timeline;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import xsna.ao;
import xsna.asu0;
import xsna.epx;
import xsna.fw3;
import xsna.gpa0;
import xsna.msy;
import xsna.nf0;
import xsna.nm60;
import xsna.pm0;
import xsna.uq10;
import xsna.vu5;
import xsna.w8i;

/* compiled from: StoriesVideoEncoder.kt */
/* loaded from: classes6.dex */
public final class StoriesVideoEncoder implements w8i {
    public final Context b;
    public final File c;
    public final StoriesEncoderParameters d;
    public final a e;
    public final String f;
    public final int g;
    public final Object h;
    public final Handler i;
    public final AtomicBoolean j;
    public final AtomicReference<gpa0> k;
    public Object l;

    /* compiled from: StoriesVideoEncoder.kt */
    public static final class StoriesEncoderParameters implements Parcelable {
        public static final Parcelable.Creator<StoriesEncoderParameters> CREATOR = new a();
        public final Timeline b;
        public final VideoOutputSettings c;
        public final MediaQuality d;
        public final List<Integer> e;
        public final File f;
        public final File g;

        /* compiled from: StoriesVideoEncoder.kt */
        public static final class VideoOutputSettings implements Parcelable {
            public static final Parcelable.Creator<VideoOutputSettings> CREATOR = new a();
            public final int b;
            public final int c;

            /* compiled from: StoriesVideoEncoder.kt */
            public static final class a implements Parcelable.Creator<VideoOutputSettings> {
                @Override // android.os.Parcelable.Creator
                public final VideoOutputSettings createFromParcel(Parcel parcel) {
                    return new VideoOutputSettings(parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final VideoOutputSettings[] newArray(int i) {
                    return new VideoOutputSettings[i];
                }
            }

            public VideoOutputSettings(int i, int i2) {
                this.b = i;
                this.c = i2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VideoOutputSettings)) {
                    return false;
                }
                VideoOutputSettings videoOutputSettings = (VideoOutputSettings) obj;
                return this.b == videoOutputSettings.b && this.c == videoOutputSettings.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VideoOutputSettings(targetWidth=");
                sb.append(this.b);
                sb.append(", targetHeight=");
                return vu5.b(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                parcel.writeInt(this.c);
            }
        }

        /* compiled from: StoriesVideoEncoder.kt */
        public static final class a implements Parcelable.Creator<StoriesEncoderParameters> {
            @Override // android.os.Parcelable.Creator
            public final StoriesEncoderParameters createFromParcel(Parcel parcel) {
                Timeline timeline = (Timeline) parcel.readParcelable(StoriesEncoderParameters.class.getClassLoader());
                VideoOutputSettings createFromParcel = VideoOutputSettings.CREATOR.createFromParcel(parcel);
                MediaQuality valueOf = MediaQuality.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
                return new StoriesEncoderParameters(timeline, createFromParcel, valueOf, arrayList, (File) parcel.readSerializable(), (File) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final StoriesEncoderParameters[] newArray(int i) {
                return new StoriesEncoderParameters[i];
            }
        }

        public StoriesEncoderParameters(Timeline timeline, VideoOutputSettings videoOutputSettings, MediaQuality mediaQuality, List<Integer> list, File file, File file2) {
            this.b = timeline;
            this.c = videoOutputSettings;
            this.d = mediaQuality;
            this.e = list;
            this.f = file;
            this.g = file2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoriesEncoderParameters)) {
                return false;
            }
            StoriesEncoderParameters storiesEncoderParameters = (StoriesEncoderParameters) obj;
            return epx.f(this.b, storiesEncoderParameters.b) && epx.f(this.c, storiesEncoderParameters.c) && this.d == storiesEncoderParameters.d && epx.f(this.e, storiesEncoderParameters.e) && epx.f(this.f, storiesEncoderParameters.f) && epx.f(this.g, storiesEncoderParameters.g);
        }

        public final int hashCode() {
            int a2 = fw3.a((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
            File file = this.f;
            int hashCode = (a2 + (file == null ? 0 : file.hashCode())) * 31;
            File file2 = this.g;
            return hashCode + (file2 != null ? file2.hashCode() : 0);
        }

        public final String toString() {
            return "StoriesEncoderParameters(timeline=" + this.b + ", outputVideoSettings=" + this.c + ", quality=" + this.d + ", layersIndices=" + this.e + ", previewFile=" + this.f + ", licensedMusicFile=" + this.g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            this.c.writeToParcel(parcel, i);
            parcel.writeString(this.d.name());
            Iterator a2 = ao.a(parcel, this.e);
            while (a2.hasNext()) {
                parcel.writeInt(((Number) a2.next()).intValue());
            }
            parcel.writeSerializable(this.f);
            parcel.writeSerializable(this.g);
        }
    }

    /* compiled from: StoriesVideoEncoder.kt */
    public interface a {
        void c(boolean z);

        void onCancel();

        void onError(Throwable th);

        void r(int i);

        void s(int i);
    }

    /* compiled from: StoriesVideoEncoder.kt */
    public final class b {
        public b() {
        }

        public final void a() {
            L.e("cancel encode");
            StoriesVideoEncoder storiesVideoEncoder = StoriesVideoEncoder.this;
            storiesVideoEncoder.j.set(true);
            gpa0 gpa0Var = storiesVideoEncoder.k.get();
            if (gpa0Var != null) {
                gpa0Var.cancel();
            } else {
                L.e("StoriesVideoEncoder", "try to cancel but encoder is NULL");
            }
        }

        public final File b() {
            return StoriesVideoEncoder.this.c;
        }
    }

    public StoriesVideoEncoder(Context context, File file, StoriesEncoderParameters storiesEncoderParameters, a aVar, String str, int i) {
        this.b = context;
        this.c = file;
        this.d = storiesEncoderParameters;
        this.e = aVar;
        this.f = str;
        this.g = i;
        this.h = msy.a(LazyThreadSafetyMode.NONE, new nm60(this, 21));
        this.i = new Handler(Looper.getMainLooper());
        this.j = new AtomicBoolean();
        this.k = new AtomicReference<>();
        this.l = EmptyList.b;
    }

    public final b a() {
        asu0.a.getClass();
        asu0.h().execute(new nf0(this, 14));
        return new b();
    }

    public final void b() {
        Iterator it = ((Iterable) this.l).iterator();
        while (it.hasNext()) {
            ((uq10) it.next()).e();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoriesVideoEncoder(Context context, File file, StoriesEncoderParameters storiesEncoderParameters, a aVar, String str) {
        this(context, file, storiesEncoderParameters, aVar, str, Random.c.j());
        Random.b.getClass();
    }
}
