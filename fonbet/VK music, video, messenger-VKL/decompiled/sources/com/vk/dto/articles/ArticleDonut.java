package com.vk.dto.articles;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import java.util.HashMap;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: ArticleDonut.kt */
/* loaded from: classes18.dex */
public final class ArticleDonut implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ArticleDonut> CREATOR = new a();
    public final boolean b;
    public final Placeholder c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ArticleDonut> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ArticleDonut a(Serializer serializer) {
            return new ArticleDonut(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ArticleDonut[i];
        }
    }

    public ArticleDonut(boolean z, Placeholder placeholder) {
        this.b = z;
        this.c = placeholder;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.i0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.b(Boolean.valueOf(this.b), "is_donat");
        w9yVar.g("placeholder", this.c);
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleDonut)) {
            return false;
        }
        ArticleDonut articleDonut = (ArticleDonut) obj;
        return this.b == articleDonut.b && epx.f(this.c, articleDonut.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Placeholder placeholder = this.c;
        return hashCode + (placeholder != null ? placeholder.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.b.h(this, parcel);
    }

    /* compiled from: ArticleDonut.kt */
    public static final class Placeholder implements Serializer.StreamParcelable, bxx {
        public static final Serializer.c<Placeholder> CREATOR = new a();
        public final String b;
        public final String c;
        public final LinkButton d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Placeholder> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Placeholder a(Serializer serializer) {
                return new Placeholder(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Placeholder[i];
            }
        }

        public Placeholder(String str, String str2, LinkButton linkButton) {
            this.b = str;
            this.c = str2;
            this.d = linkButton;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.i0(this.d);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            w9y w9yVar = new w9y();
            w9yVar.e(this.b, "text");
            w9yVar.e(this.c, "description");
            w9yVar.g("button", this.d);
            s3q0 s3q0Var = s3q0.a;
            return w9yVar.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Placeholder)) {
                return false;
            }
            Placeholder placeholder = (Placeholder) obj;
            return epx.f(this.b, placeholder.b) && epx.f(this.c, placeholder.c) && epx.f(this.d, placeholder.d);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            LinkButton linkButton = this.d;
            return hashCode2 + (linkButton != null ? linkButton.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            Serializer.b.h(this, parcel);
        }

        public Placeholder(Serializer serializer) {
            this(serializer.H(), serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()));
        }
    }

    public ArticleDonut(Serializer serializer) {
        this(serializer.m(), (Placeholder) serializer.G(Placeholder.class.getClassLoader()));
    }
}
