package com.vk.sharing.api.dto;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;

/* loaded from: classes5.dex */
public final class AttachmentInfo extends Serializer.StreamParcelableAdapter implements Parcelable {
    public static final Serializer.c<AttachmentInfo> CREATOR = new a();
    public final int b;
    public final long c;
    public final long d;

    @Nullable
    public final String e;

    @NonNull
    public final Bundle f;

    public class a extends Serializer.c<AttachmentInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        @Nullable
        public final AttachmentInfo a(Serializer serializer) {
            return new AttachmentInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachmentInfo[i];
        }
    }

    public static final class b {
        public final int a;
        public long b;
        public long c;

        @Nullable
        public String d;

        @NonNull
        public final Bundle e = new Bundle();

        public b(int i) {
            this.a = i;
        }

        @NonNull
        public final AttachmentInfo a() {
            return new AttachmentInfo(this.a, this.b, this.c, this.d, this.e);
        }

        @NonNull
        public final void b(@NonNull String str, @Nullable Serializer.StreamParcelableAdapter streamParcelableAdapter) {
            this.e.putParcelable(str, streamParcelableAdapter);
        }

        @NonNull
        public final void c(@NonNull String str, @Nullable String str2) {
            this.e.putString(str, str2);
        }
    }

    public AttachmentInfo(int i, long j, long j2, String str, Bundle bundle) {
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = bundle;
    }

    public final void Ab(@Nullable String str) {
        Bundle bundle = this.f;
        if (bundle.containsKey("trackCode") || TextUtils.isEmpty(str)) {
            return;
        }
        bundle.putString("trackCode", str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.Y(this.c);
        serializer.Y(this.d);
        serializer.j0(this.e);
        serializer.K(this.f);
    }

    @Nullable
    public final String r() {
        return this.f.getString("trackCode");
    }

    @Nullable
    public final String zb() {
        return this.f.getString("link");
    }

    public AttachmentInfo(Serializer serializer) {
        this.b = serializer.u();
        this.c = serializer.w();
        this.d = serializer.w();
        this.e = serializer.H();
        Bundle o = serializer.o(AttachmentInfo.class.getClassLoader());
        this.f = o == null ? Bundle.EMPTY : o;
    }
}
