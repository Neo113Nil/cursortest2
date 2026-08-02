package com.vk.dto.stories.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.stickers.ISerializableStickerSDK;
import com.vk.log.L;
import com.vk.movika.sdk.base.logic.interactor.d;
import com.vk.movika.sdk.base.logic.interactor.e;
import com.vk.superapp.api.dto.story.WebSticker;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.WebTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.c5g;
import xsna.d370;
import xsna.drm0;
import xsna.epx;
import xsna.f370;
import xsna.i35;
import xsna.q500;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CanvasStickerDraft.kt */
/* loaded from: classes18.dex */
public abstract class CanvasStickerDraft implements Serializer.StreamParcelable, bxx, ISerializableStickerSDK {
    public static final b d = new b();
    public final WebTransform b;
    public final q500 c;

    /* compiled from: CanvasStickerDraft.kt */
    public static final class LoadableCanvasStickerDraft extends CanvasStickerDraft {
        public static final Serializer.c<LoadableCanvasStickerDraft> CREATOR = new b();
        public static final a i = new a();
        public final String e;
        public final WebStickerType f;
        public final String g;
        public final String h;

        /* compiled from: JsonParser.kt */
        public static final class a extends aay<LoadableCanvasStickerDraft> {
            @Override // xsna.aay
            public final LoadableCanvasStickerDraft a(JSONObject jSONObject) {
                return new LoadableCanvasStickerDraft(jSONObject);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<LoadableCanvasStickerDraft> {
            @Override // com.vk.core.serialize.Serializer.c
            public final LoadableCanvasStickerDraft a(Serializer serializer) {
                WebTransform webTransform = (WebTransform) serializer.G(WebTransform.class.getClassLoader());
                b bVar = CanvasStickerDraft.d;
                long w = serializer.w();
                long w2 = serializer.w();
                q500 q500Var = (w2 == 0 && w == 0) ? null : new q500(w, w2);
                String H = serializer.H();
                WebStickerType.a aVar = WebStickerType.Companion;
                String H2 = serializer.H();
                aVar.getClass();
                return new LoadableCanvasStickerDraft(webTransform, q500Var, H, WebStickerType.a.a(H2), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoadableCanvasStickerDraft[i];
            }
        }

        public /* synthetic */ LoadableCanvasStickerDraft(WebTransform webTransform, q500 q500Var, String str, WebStickerType webStickerType, String str2, String str3, int i2, zcl zclVar) {
            this(webTransform, q500Var, str, webStickerType, str2, (i2 & 32) != 0 ? null : str3);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            q500 q500Var = this.c;
            serializer.Y(q500Var != null ? q500Var.b : 0L);
            serializer.Y(q500Var != null ? q500Var.c : 0L);
            serializer.j0(this.e);
            serializer.j0(this.f.i());
            serializer.j0(this.g);
            serializer.j0(this.h);
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            return d370.C(new d(this, 20));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!LoadableCanvasStickerDraft.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            LoadableCanvasStickerDraft loadableCanvasStickerDraft = (LoadableCanvasStickerDraft) obj;
            return epx.f(this.e, loadableCanvasStickerDraft.e) && this.f == loadableCanvasStickerDraft.f && epx.f(this.g, loadableCanvasStickerDraft.g) && epx.f(this.b, loadableCanvasStickerDraft.b) && epx.f(this.c, loadableCanvasStickerDraft.c) && epx.f(this.h, loadableCanvasStickerDraft.h);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + urd0.a((this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31, this.g)) * 31;
            q500 q500Var = this.c;
            int hashCode2 = (hashCode + (q500Var != null ? q500Var.hashCode() : 0)) * 31;
            String str = this.h;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public LoadableCanvasStickerDraft(WebTransform webTransform, q500 q500Var, String str, WebStickerType webStickerType, String str2, String str3) {
            super(webTransform, q500Var, null);
            this.e = str;
            this.f = webStickerType;
            this.g = str2;
            this.h = str3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public LoadableCanvasStickerDraft(JSONObject jSONObject) {
            this(r2, r3, r4, WebStickerType.a.a(r1), jSONObject.getString("meta_info"), f370.D(jSONObject, "preview_url"));
            Serializer.c<WebTransform> cVar = WebTransform.CREATOR;
            WebTransform a2 = WebTransform.a.a(jSONObject.getJSONObject("transform"));
            q500 a3 = a.a(jSONObject.optString("range"));
            String string = jSONObject.getString("url");
            WebStickerType.a aVar = WebStickerType.Companion;
            String string2 = jSONObject.getString("type");
            aVar.getClass();
        }
    }

    /* compiled from: CanvasStickerDraft.kt */
    public static final class a {
        public static final q500 a(String str) {
            b bVar = CanvasStickerDraft.d;
            if (str == null) {
                return null;
            }
            try {
                List c0 = drm0.c0(str, new String[]{".."}, 0, 6);
                ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
                }
                return new q500(((Number) arrayList.get(0)).longValue(), ((Number) arrayList.get(1)).longValue());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<CanvasStickerDraft> {
        @Override // xsna.aay
        public final CanvasStickerDraft a(JSONObject jSONObject) {
            try {
                String optString = jSONObject.optString("class_id");
                if (epx.f(optString, "loadable_sticker")) {
                    LoadableCanvasStickerDraft.i.getClass();
                    return new LoadableCanvasStickerDraft(jSONObject);
                }
                if (!epx.f(optString, "native_sticker")) {
                    return null;
                }
                NativeCanvasStickerDraft.f.getClass();
                return new NativeCanvasStickerDraft(jSONObject);
            } catch (Throwable th) {
                L.i(th);
                return null;
            }
        }
    }

    public CanvasStickerDraft(WebTransform webTransform, q500 q500Var, zcl zclVar) {
        this.b = webTransform;
        this.c = q500Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* compiled from: CanvasStickerDraft.kt */
    public static final class NativeCanvasStickerDraft extends CanvasStickerDraft {
        public static final Serializer.c<NativeCanvasStickerDraft> CREATOR = new b();
        public static final a f = new a();
        public final WebSticker e;

        /* compiled from: JsonParser.kt */
        public static final class a extends aay<NativeCanvasStickerDraft> {
            @Override // xsna.aay
            public final NativeCanvasStickerDraft a(JSONObject jSONObject) {
                return new NativeCanvasStickerDraft(jSONObject);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<NativeCanvasStickerDraft> {
            @Override // com.vk.core.serialize.Serializer.c
            public final NativeCanvasStickerDraft a(Serializer serializer) {
                WebSticker webSticker = (WebSticker) serializer.G(WebSticker.class.getClassLoader());
                b bVar = CanvasStickerDraft.d;
                long w = serializer.w();
                long w2 = serializer.w();
                return new NativeCanvasStickerDraft(webSticker, (w2 == 0 && w == 0) ? null : new q500(w, w2));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NativeCanvasStickerDraft[i];
            }
        }

        public NativeCanvasStickerDraft(WebSticker webSticker, q500 q500Var) {
            super(webSticker.zb(), q500Var, null);
            this.e = webSticker;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.e);
            q500 q500Var = this.c;
            serializer.Y(q500Var != null ? q500Var.b : 0L);
            serializer.Y(q500Var != null ? q500Var.c : 0L);
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            return d370.C(new e(this, 9));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!NativeCanvasStickerDraft.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            NativeCanvasStickerDraft nativeCanvasStickerDraft = (NativeCanvasStickerDraft) obj;
            return epx.f(this.e, nativeCanvasStickerDraft.e) && epx.f(this.c, nativeCanvasStickerDraft.c);
        }

        public final int hashCode() {
            int hashCode = this.e.hashCode() * 31;
            q500 q500Var = this.c;
            return hashCode + (q500Var != null ? q500Var.hashCode() : 0);
        }

        public final String toString() {
            return "stickerData = " + this.e + ", visibleRange=" + this.c;
        }

        public NativeCanvasStickerDraft(JSONObject jSONObject) {
            this(i35.j(jSONObject.getJSONObject("web_sticker")), a.a(jSONObject.optString("range")));
        }
    }
}
