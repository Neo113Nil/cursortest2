package com.vk.newsfeed.impl.requests;

import androidx.core.app.NotificationCompat;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.awi;
import xsna.bjl0;
import xsna.c5g;
import xsna.epx;
import xsna.fo20;
import xsna.go9;
import xsna.j5g;
import xsna.l7r0;
import xsna.ly80;
import xsna.ms9;
import xsna.oey;
import xsna.pyh0;
import xsna.qyh0;
import xsna.tav0;
import xsna.tfx;
import xsna.yfb;
import xsna.yr00;

/* compiled from: SearchGetHintsWithAttachments.kt */
/* loaded from: classes4.dex */
public final class SearchGetHintsWithAttachments extends awi<Response> {
    public final String s;
    public final int t;
    public final List<String> u;

    /* compiled from: SearchGetHintsWithAttachments.kt */
    public static final class Response extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Response> CREATOR = new a();
        public final VkPaginationList<UserProfile> b;
        public final List<Attachment> c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Response> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Response a(Serializer serializer) {
                return new Response((VkPaginationList) serializer.G(VkPaginationList.class.getClassLoader()), serializer.l(Attachment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Response[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Response(VkPaginationList<UserProfile> vkPaginationList, List<? extends Attachment> list) {
            this.b = vkPaginationList;
            this.c = list;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.o0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Response)) {
                return false;
            }
            Response response = (Response) obj;
            return epx.f(this.b, response.b) && epx.f(this.c, response.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            List<Attachment> list = this.c;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Response(hints=");
            sb.append(this.b);
            sb.append(", attachments=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: SearchGetHintsWithAttachments.kt */
    public static final class a {
        public static Response a(JSONObject jSONObject) {
            JSONArray optJSONArray;
            JSONArray optJSONArray2;
            ArrayList arrayList = null;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("hints") : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            VkPaginationList a = tav0.a(optJSONObject, new yr00(linkedHashMap, 27));
            if (jSONObject != null && (optJSONArray2 = jSONObject.optJSONArray("profiles")) != null) {
                int length = optJSONArray2.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                    Serializer.c<Owner> cVar = Owner.CREATOR;
                    Owner f = Owner.a.f(jSONObject2);
                    linkedHashMap.put(f.b, f);
                }
            }
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("attachments")) != null) {
                ArrayList arrayList2 = new ArrayList(optJSONArray.length());
                int length2 = optJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                    if (optJSONObject2 != null) {
                        arrayList2.add(com.vkontakte.android.attachments.a.c(optJSONObject2, linkedHashMap, null));
                    }
                }
                arrayList = arrayList2;
            }
            return new Response(a, arrayList);
        }
    }

    public SearchGetHintsWithAttachments(String str, int i, List<String> list) {
        this.s = str;
        this.t = i;
        this.u = list;
    }

    public final JSONObject F0(l7r0 l7r0Var) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = (JSONObject) yfb.z(pyh0.c(new qyh0(), this.s, Integer.valueOf(this.t), this.u, 42), new fo20(18)).f(l7r0Var);
        jSONObject.put("hints", jSONObject2);
        JSONArray jSONArray = jSONObject2.getJSONArray("items");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            String str = null;
            if (epx.f(jSONObject3.optString("type"), "group")) {
                JSONObject optJSONObject = jSONObject3.optJSONObject("group");
                if (epx.f(optJSONObject != null ? optJSONObject.optString("type") : null, NotificationCompat.CATEGORY_EVENT)) {
                    str = go9.b(NotificationCompat.CATEGORY_EVENT, jSONObject3.getJSONObject("group").getString("id"));
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        List O0 = j5g.O0(arrayList);
        if (!O0.isEmpty()) {
            List singletonList = Collections.singletonList(BaseUserGroupFieldsDto.PHOTO_BASE);
            tfx tfxVar = new tfx("wall.convertLink", new ly80(13), new bjl0(7));
            tfxVar.i("urls", O0);
            tfxVar.j("extended", true);
            List list = singletonList;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
            tfxVar.i("fields", arrayList2);
            JSONObject jSONObject4 = (JSONObject) yfb.z(tfxVar, new oey(25)).f(l7r0Var);
            JSONArray optJSONArray = jSONObject4.optJSONArray("data");
            if (optJSONArray != null) {
                jSONObject.put("attachments", optJSONArray);
            }
            JSONArray optJSONArray2 = jSONObject4.optJSONArray("profiles");
            if (optJSONArray2 != null) {
                jSONObject.put("profiles", optJSONArray2);
            }
        }
        return jSONObject;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        return a.a(F0(l7r0Var));
    }
}
