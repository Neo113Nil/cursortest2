package com.vk.dto.common.clips;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Good;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.onelog.NetworkClass;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: ClipsMarketAttachment.kt */
/* loaded from: classes18.dex */
public final class ClipsMarketAttachment implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ClipsMarketAttachment> CREATOR = new b();
    public static final a e = new a();
    public final Good b;
    public final List<Good> c;
    public final SnippetAttachment d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsMarketAttachment> {
        @Override // xsna.aay
        public final ClipsMarketAttachment a(JSONObject jSONObject) {
            return new ClipsMarketAttachment(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsMarketAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsMarketAttachment a(Serializer serializer) {
            return new ClipsMarketAttachment((Good) serializer.G(Good.class.getClassLoader()), serializer.B(Good.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsMarketAttachment[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipsMarketAttachment(Good good, List<? extends Good> list, SnippetAttachment snippetAttachment) {
        this.b = good;
        this.c = list;
        this.d = snippetAttachment;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.f0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.g(NetworkClass.GOOD, this.b);
        w9yVar.g("snippet", this.d);
        w9yVar.e(this.c, "goods");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ClipsMarketAttachment.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ClipsMarketAttachment clipsMarketAttachment = (ClipsMarketAttachment) obj;
        return epx.f(this.b, clipsMarketAttachment.b) && epx.f(this.c, clipsMarketAttachment.c) && epx.f(this.d, clipsMarketAttachment.d);
    }

    public final int hashCode() {
        Good good = this.b;
        int hashCode = (good != null ? good.hashCode() : 0) * 31;
        SnippetAttachment snippetAttachment = this.d;
        return hashCode + (snippetAttachment != null ? snippetAttachment.hashCode() : 0);
    }

    public final String toString() {
        return "ClipsMarketAttachment(good=" + this.b + ", goods=" + this.c + ", snippet=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsMarketAttachment(JSONObject jSONObject) {
        this(r1, r0, r2);
        Good.c cVar = Good.p0;
        Good good = (Good) aay.a.c(jSONObject, NetworkClass.GOOD, cVar);
        ArrayList a2 = aay.a.a(jSONObject, "goods", cVar);
        a2 = a2 == null ? new ArrayList() : a2;
        SnippetAttachment snippetAttachment = null;
        try {
            snippetAttachment = SnippetAttachment.Ib(jSONObject.getJSONObject("snippet"), null);
        } catch (Exception unused) {
        }
    }
}
