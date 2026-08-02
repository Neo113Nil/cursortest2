package com.vk.camera.clips.core.drafts;

import android.net.Uri;
import android.os.Parcel;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.log.L;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.izi0;
import xsna.j5g;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: ClipsDraftVk.kt */
/* loaded from: classes14.dex */
public final class ClipsDraftVk implements Serializer.StreamParcelable, bxx {
    public final ClipsDraftCommonData b;
    public final ClipsDraftVkExtraData c;
    public static final b d = new b();
    public static final Serializer.c<ClipsDraftVk> CREATOR = new c();

    /* compiled from: ClipsDraftVk.kt */
    public static final class a {
        public static ClipsDraftVk a(ClipsDraft clipsDraft) {
            JSONObject jSONObject = clipsDraft.c;
            ClipsDraftVkExtraData.l.getClass();
            return new ClipsDraftVk(clipsDraft.b, new ClipsDraftVkExtraData(jSONObject));
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<ClipsDraftVk> {
        @Override // xsna.aay
        public final ClipsDraftVk a(JSONObject jSONObject) {
            ClipsDraft clipsDraft;
            ClipsDraft.a aVar = ClipsDraft.d;
            if (jSONObject.has("draft")) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("draft");
                    aVar.getClass();
                    clipsDraft = new ClipsDraft(jSONObject2);
                } catch (JSONException e) {
                    L.i(e);
                }
                JSONObject jSONObject3 = clipsDraft.c;
                ClipsDraftVkExtraData.l.getClass();
                return new ClipsDraftVk(clipsDraft.b, new ClipsDraftVkExtraData(jSONObject3));
            }
            clipsDraft = null;
            JSONObject jSONObject32 = clipsDraft.c;
            ClipsDraftVkExtraData.l.getClass();
            return new ClipsDraftVk(clipsDraft.b, new ClipsDraftVkExtraData(jSONObject32));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<ClipsDraftVk> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsDraftVk a(Serializer serializer) {
            ClipsDraftVkExtraData clipsDraftVkExtraData;
            JSONObject jSONObject;
            ClipsDraft clipsDraft = (ClipsDraft) serializer.G(ClipsDraft.class.getClassLoader());
            if (clipsDraft == null || (jSONObject = clipsDraft.c) == null) {
                clipsDraftVkExtraData = null;
            } else {
                ClipsDraftVkExtraData.l.getClass();
                clipsDraftVkExtraData = new ClipsDraftVkExtraData(jSONObject);
            }
            return new ClipsDraftVk(clipsDraft != null ? clipsDraft.b : null, clipsDraftVkExtraData);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsDraftVk[i];
        }
    }

    public ClipsDraftVk(ClipsDraftCommonData clipsDraftCommonData, ClipsDraftVkExtraData clipsDraftVkExtraData) {
        this.b = clipsDraftCommonData;
        this.c = clipsDraftVkExtraData;
    }

    public static ClipsDraftVk a(ClipsDraftVk clipsDraftVk, ClipsDraftCommonData clipsDraftCommonData) {
        return new ClipsDraftVk(clipsDraftCommonData, clipsDraftVk.c);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(new ClipsDraft(this.b, this.c.e5()));
    }

    public final ClipsDraftCommonData d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ClipsDraftVkExtraData e() {
        return this.c;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.g("draft", new ClipsDraft(this.b, this.c.e5()));
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsDraftVk)) {
            return false;
        }
        ClipsDraftVk clipsDraftVk = (ClipsDraftVk) obj;
        return epx.f(this.b, clipsDraftVk.b) && epx.f(this.c, clipsDraftVk.c);
    }

    public final Set<File> f() {
        String path;
        ClipsEditorMusicInfo clipsEditorMusicInfo;
        String str;
        ClipsDraftMusicInfo clipsDraftMusicInfo = this.c.c;
        File file = (clipsDraftMusicInfo == null || (clipsEditorMusicInfo = clipsDraftMusicInfo.b) == null || (str = clipsEditorMusicInfo.g) == null) ? null : new File(str);
        HashSet hashSet = new HashSet();
        ClipsDraftCommonData clipsDraftCommonData = this.b;
        String str2 = clipsDraftCommonData.j;
        File file2 = (str2 == null || (path = Uri.parse(str2).getPath()) == null) ? null : new File(path);
        hashSet.add(file2 != null ? file2.toString() : null);
        List<? extends List<ClipsDraftMusicInfo>> list = clipsDraftCommonData.l;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    hashSet.add(((ClipsDraftMusicInfo) it2.next()).b.g);
                }
            }
        }
        HashSet hashSet2 = new HashSet();
        for (ClipsEditorInputVideoItem clipsEditorInputVideoItem : clipsDraftCommonData.d) {
            hashSet2.add(clipsEditorInputVideoItem.b);
            File file3 = clipsEditorInputVideoItem.g;
            if (file3 != null) {
                hashSet2.add(file3);
            }
        }
        List V = j5g.V(hashSet);
        ArrayList arrayList = new ArrayList(c5g.u(V, 10));
        Iterator it3 = V.iterator();
        while (it3.hasNext()) {
            arrayList.add(new File((String) it3.next()));
        }
        return izi0.j(izi0.j(hashSet2, j5g.R0(arrayList)), e43.m(file));
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ClipsDraftVk(base=" + this.b + ", extraData=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
