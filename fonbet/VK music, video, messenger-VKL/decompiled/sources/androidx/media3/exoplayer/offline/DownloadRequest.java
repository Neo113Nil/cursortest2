package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.fxc0;
import xsna.io20;
import xsna.kr10;
import xsna.vr10;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();
    public final String b;
    public final Uri c;

    @Nullable
    public final String d;
    public final List<StreamKey> e;

    @Nullable
    public final byte[] f;

    @Nullable
    public final String g;
    public final byte[] h;

    @Nullable
    public final ByteRange i;

    @Nullable
    public final TimeRange j;

    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new a();
        public final long b;
        public final long c;

        public class a implements Parcelable.Creator<ByteRange> {
            @Override // android.os.Parcelable.Creator
            public final ByteRange createFromParcel(Parcel parcel) {
                return new ByteRange(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final ByteRange[] newArray(int i) {
                return new ByteRange[i];
            }
        }

        public ByteRange(long j, long j2) {
            fxc0.p(j >= 0);
            fxc0.p(j2 >= 0 || j2 == -1);
            this.b = j;
            this.c = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.b == byteRange.b && this.c == byteRange.c;
        }

        public final int hashCode() {
            return (((int) this.b) * 961) + ((int) this.c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }
    }

    public static final class TimeRange implements Parcelable {
        public static final Parcelable.Creator<TimeRange> CREATOR = new a();
        public final long b;
        public final long c;

        public class a implements Parcelable.Creator<TimeRange> {
            @Override // android.os.Parcelable.Creator
            public final TimeRange createFromParcel(Parcel parcel) {
                return new TimeRange(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final TimeRange[] newArray(int i) {
                return new TimeRange[i];
            }
        }

        public TimeRange(long j, long j2) {
            fxc0.p(j2 >= 0 || j2 == C.TIME_UNSET);
            this.b = j;
            this.c = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof TimeRange)) {
                return false;
            }
            TimeRange timeRange = (TimeRange) obj;
            return this.b == timeRange.b && this.c == timeRange.c;
        }

        public final int hashCode() {
            return (((int) this.b) * 961) + ((int) this.c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }
    }

    public static class UnsupportedRequestException extends IOException {
    }

    public class a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public static class b {
        public final String a;
        public final Uri b;

        @Nullable
        public String c;

        @Nullable
        public List<StreamKey> d;

        @Nullable
        public byte[] e;

        @Nullable
        public String f;

        @Nullable
        public byte[] g;

        @Nullable
        public ByteRange h = null;

        @Nullable
        public TimeRange i = null;

        public b(String str, Uri uri) {
            this.a = str;
            this.b = uri;
        }

        public final DownloadRequest a() {
            String str = this.c;
            List list = this.d;
            if (list == null) {
                ImmutableList.b bVar = ImmutableList.c;
                list = g.f;
            }
            return new DownloadRequest(this.a, this.b, str, list, this.e, this.f, this.g, this.h, this.i);
        }

        public final void b(@Nullable String str) {
            this.f = str;
        }

        public final void c(@Nullable byte[] bArr) {
            this.g = bArr;
        }

        public final void d(@Nullable byte[] bArr) {
            this.e = bArr;
        }

        public final void e(@Nullable String str) {
            this.c = io20.q(str);
        }

        public final void f(@Nullable List list) {
            this.d = list;
        }
    }

    public DownloadRequest(String str, Uri uri, @Nullable String str2, List<StreamKey> list, @Nullable byte[] bArr, @Nullable String str3, @Nullable byte[] bArr2, @Nullable ByteRange byteRange, @Nullable TimeRange timeRange) {
        int J = y2r0.J(uri, str2);
        if (J == 0 || J == 2 || J == 1) {
            fxc0.l(J, "customCacheKey must be null for type: %s", str3 == null);
            this.i = null;
            this.j = timeRange;
        } else {
            this.i = byteRange;
            this.j = null;
        }
        this.b = str;
        this.c = uri;
        this.d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.e = Collections.unmodifiableList(arrayList);
        this.f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.g = str3;
        this.h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : y2r0.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public final DownloadRequest a(DownloadRequest downloadRequest) {
        ?? r2;
        String str = downloadRequest.b;
        List<StreamKey> list = downloadRequest.e;
        fxc0.p(this.b.equals(str));
        List<StreamKey> list2 = this.e;
        if (list2.isEmpty() || list.isEmpty()) {
            r2 = Collections.EMPTY_LIST;
        } else {
            r2 = new ArrayList(list2);
            for (int i = 0; i < list.size(); i++) {
                StreamKey streamKey = list.get(i);
                if (!r2.contains(streamKey)) {
                    r2.add(streamKey);
                }
            }
        }
        List list3 = r2;
        return new DownloadRequest(this.b, downloadRequest.c, downloadRequest.d, list3, downloadRequest.f, downloadRequest.g, downloadRequest.h, downloadRequest.i, downloadRequest.j);
    }

    public final kr10 d() {
        kr10.b.a aVar = new kr10.b.a();
        new kr10.d.a();
        List list = Collections.EMPTY_LIST;
        g gVar = g.f;
        kr10.e.a aVar2 = new kr10.e.a();
        kr10.g gVar2 = kr10.g.a;
        String str = this.b;
        str.getClass();
        List<StreamKey> list2 = this.e;
        List unmodifiableList = (list2 == null || list2.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list2));
        Uri uri = this.c;
        return new kr10(str, new kr10.c(aVar), uri != null ? new kr10.f(uri, this.d, null, unmodifiableList, this.g, gVar, C.TIME_UNSET) : null, new kr10.e(aVar2), vr10.B, gVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.b.equals(downloadRequest.b) && this.c.equals(downloadRequest.c) && Objects.equals(this.d, downloadRequest.d) && this.e.equals(downloadRequest.e) && Arrays.equals(this.f, downloadRequest.f) && Objects.equals(this.g, downloadRequest.g) && Arrays.equals(this.h, downloadRequest.h) && Objects.equals(this.i, downloadRequest.i) && Objects.equals(this.j, downloadRequest.j);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 961)) * 31;
        String str = this.d;
        int hashCode2 = (Arrays.hashCode(this.f) + ((this.e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.g;
        int hashCode3 = (Arrays.hashCode(this.h) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        ByteRange byteRange = this.i;
        int hashCode4 = (hashCode3 + (byteRange != null ? byteRange.hashCode() : 0)) * 31;
        TimeRange timeRange = this.j;
        return hashCode4 + (timeRange != null ? timeRange.hashCode() : 0);
    }

    public final String toString() {
        return this.d + StringUtils.PROCESS_POSTFIX_DELIMITER + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c.toString());
        parcel.writeString(this.d);
        List<StreamKey> list = this.e;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable(list.get(i2), 0);
        }
        parcel.writeByteArray(this.f);
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.j, 0);
    }

    public DownloadRequest(Parcel parcel) {
        String readString = parcel.readString();
        String str = y2r0.a;
        this.b = readString;
        this.c = Uri.parse(parcel.readString());
        this.d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.e = Collections.unmodifiableList(arrayList);
        this.f = parcel.createByteArray();
        this.g = parcel.readString();
        this.h = parcel.createByteArray();
        this.i = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
        this.j = (TimeRange) parcel.readParcelable(TimeRange.class.getClassLoader());
    }
}
