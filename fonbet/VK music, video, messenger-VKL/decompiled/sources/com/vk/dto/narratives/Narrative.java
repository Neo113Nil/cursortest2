package com.vk.dto.narratives;

import android.graphics.RectF;
import android.util.ArrayMap;
import androidx.annotation.CheckResult;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.dz5;
import xsna.epx;
import xsna.f370;
import xsna.gmq;
import xsna.jgp;
import xsna.ms9;

/* compiled from: Narrative.kt */
/* loaded from: classes18.dex */
public final class Narrative extends Serializer.StreamParcelableAdapter implements gmq {
    public static final Serializer.c<Narrative> CREATOR = new b();
    public final int b;
    public final UserId c;
    public final String d;
    public final HighlightCover e;
    public final Owner f;
    public final List<StoryEntry> g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public boolean k;
    public final List<Integer> l;

    /* compiled from: Narrative.kt */
    public static final class a {
        @CheckResult
        public static Narrative a(int i, UserId userId) {
            EmptyList emptyList = EmptyList.b;
            return new Narrative(i, userId, "", null, null, emptyList, false, true, true, false, emptyList);
        }

        @CheckResult
        public static String b(Narrative narrative, int i) {
            HighlightCover highlightCover = narrative.e;
            if (highlightCover != null) {
                return highlightCover.e(i);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
        @CheckResult
        public static Narrative c(JSONObject jSONObject, Owner owner, ArrayMap arrayMap) {
            ?? r4;
            HighlightCover highlightCover;
            List list;
            RectF rectF;
            HighlightCover highlightRemoteCustomCover;
            HighlightCover highlightCover2;
            Object obj;
            JSONArray optJSONArray = jSONObject.optJSONArray("stories");
            if (optJSONArray != null) {
                r4 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        r4.add(new StoryEntry(optJSONObject, null, null, arrayMap == null ? jgp.b : arrayMap));
                    }
                }
            } else {
                r4 = EmptyList.b;
            }
            List list2 = r4;
            int i2 = jSONObject.getInt("id");
            UserId userId = new UserId(jSONObject.getLong("owner_id"));
            String string = jSONObject.getString("title");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("cover");
            if (optJSONObject2 != null) {
                if (optJSONObject2.has("crop_x")) {
                    float f = (float) optJSONObject2.getDouble("crop_x");
                    float f2 = (float) optJSONObject2.getDouble("crop_y");
                    rectF = new RectF(f, f2, ((float) optJSONObject2.getDouble("crop_width")) + f, ((float) optJSONObject2.getDouble("crop_height")) + f2);
                } else {
                    rectF = null;
                }
                JSONArray jSONArray = optJSONObject2.getJSONArray("cropped_sizes");
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length2 = jSONArray.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    arrayList.add(new ImageSize(jSONObject2.getString("url"), jSONObject2.getInt("width"), jSONObject2.getInt("height"), null, (char) 0, false, 56, null));
                }
                Image image = new Image(arrayList);
                Integer x = f370.x(optJSONObject2, "cover_story_id");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("custom_photo");
                if (rectF == null && image.b.isEmpty() && x == null && optJSONObject3 == null) {
                    highlightCover2 = null;
                } else {
                    if (x != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((StoryEntry) obj).c == x.intValue()) {
                                break;
                            }
                        }
                        highlightRemoteCustomCover = new HighlightRemoteStoryCover(image, (StoryEntry) obj, x.intValue(), rectF);
                    } else {
                        highlightRemoteCustomCover = new HighlightRemoteCustomCover(image, optJSONObject3 != null ? new Photo(optJSONObject3) : null, rectF);
                    }
                    highlightCover2 = highlightRemoteCustomCover;
                }
                highlightCover = highlightCover2;
            } else {
                highlightCover = null;
            }
            boolean optBoolean = jSONObject.optBoolean("is_delete", false);
            boolean optBoolean2 = jSONObject.optBoolean("can_see", true);
            boolean optBoolean3 = jSONObject.optBoolean("can_delete", false);
            boolean optBoolean4 = jSONObject.optBoolean("is_favorite", false);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("story_ids");
            if (optJSONArray2 == null || (list = dz5.E(optJSONArray2)) == null) {
                list = EmptyList.b;
            }
            return new Narrative(i2, userId, string, highlightCover, owner, list2, optBoolean, optBoolean2, optBoolean3, optBoolean4, list);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Narrative> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Narrative a(Serializer serializer) {
            int u = serializer.u();
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            String H = serializer.H();
            HighlightCover highlightCover = (HighlightCover) serializer.G(HighlightCover.class.getClassLoader());
            Owner owner = (Owner) serializer.G(Owner.class.getClassLoader());
            ArrayList k = serializer.k(StoryEntry.class);
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            boolean m3 = serializer.m();
            boolean m4 = serializer.m();
            List d = serializer.d();
            if (d == null) {
                d = EmptyList.b;
            }
            return new Narrative(u, userId, H, highlightCover, owner, k, m, m2, m3, m4, d);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Narrative[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Narrative(int i, UserId userId, String str, HighlightCover highlightCover, Owner owner, List<? extends StoryEntry> list, boolean z, boolean z2, boolean z3, boolean z4, List<Integer> list2) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = highlightCover;
        this.f = owner;
        this.g = list;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = list2;
    }

    public static Narrative zb(Narrative narrative, Owner owner, int i) {
        int i2 = narrative.b;
        UserId userId = narrative.c;
        String str = narrative.d;
        HighlightCover highlightCover = narrative.e;
        if ((i & 16) != 0) {
            owner = narrative.f;
        }
        List<StoryEntry> list = narrative.g;
        boolean z = narrative.h;
        boolean z2 = narrative.i;
        boolean z3 = narrative.j;
        boolean z4 = narrative.k;
        List<Integer> list2 = narrative.l;
        narrative.getClass();
        return new Narrative(i2, userId, str, highlightCover, owner, list, z, z2, z3, z4, list2);
    }

    public final boolean Ab() {
        return !this.h && this.i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.W(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.U(this.l);
    }

    @Override // xsna.gmq
    public final boolean X() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Narrative.class.equals(obj.getClass())) {
            Narrative narrative = (Narrative) obj;
            if (this.b == narrative.b && epx.f(this.c, narrative.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c);
    }

    @Override // xsna.gmq
    public final void s0(boolean z) {
        this.k = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Narrative(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", cover=");
        sb.append(this.e);
        sb.append(", owner=");
        sb.append(this.f);
        sb.append(", stories=");
        sb.append(this.g);
        sb.append(", isDeleted=");
        sb.append(this.h);
        sb.append(", canSee=");
        sb.append(this.i);
        sb.append(", canDelete=");
        sb.append(this.j);
        sb.append(", isFavorite=");
        sb.append(this.k);
        sb.append(", storyIds=");
        return ms9.a(')', sb, this.l);
    }
}
