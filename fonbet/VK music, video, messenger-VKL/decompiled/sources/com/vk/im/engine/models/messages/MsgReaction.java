package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.c5g;
import xsna.drm0;
import xsna.f370;
import xsna.j5g;
import xsna.kvf;

/* compiled from: WithReactions.kt */
/* loaded from: classes2.dex */
public interface MsgReaction extends Serializer.StreamParcelable {

    /* compiled from: WithReactions.kt */
    public static final class a {
        public static String a(List list) {
            List<MsgReaction> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (MsgReaction msgReaction : list2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", msgReaction.getId());
                jSONObject.put("count", msgReaction.getCount());
                jSONObject.put("peerIds", kvf.a(msgReaction.u2()));
                arrayList.add(jSONObject);
            }
            return kvf.a(arrayList).toString();
        }

        public static List b(String str) {
            if (str != null) {
                try {
                    if (!drm0.N(str)) {
                        JSONArray jSONArray = new JSONArray(str);
                        ArrayList arrayList = new ArrayList(jSONArray.length());
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                arrayList.add(new MsgReactionImpl(optJSONObject.getInt("id"), f370.L(optJSONObject.getJSONArray("peerIds")), optJSONObject.getInt("count")));
                            }
                        }
                        return j5g.O0(arrayList);
                    }
                } catch (JSONException unused) {
                    return EmptyList.b;
                }
            }
            return EmptyList.b;
        }
    }

    int getCount();

    int getId();

    List<Long> u2();
}
