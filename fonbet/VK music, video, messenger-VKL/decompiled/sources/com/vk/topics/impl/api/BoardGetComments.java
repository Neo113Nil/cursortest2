package com.vk.topics.impl.api;

import androidx.annotation.Nullable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.comments.core.BoardComment;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.log.L;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.fkq0;
import xsna.rsg0;

/* loaded from: classes6.dex */
public final class BoardGetComments extends rsg0<b> {
    public final int s;
    public final UserId t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PagingKey {
        private static final /* synthetic */ PagingKey[] $VALUES;
        public static final PagingKey offset;
        public static final PagingKey startCommentId;

        static {
            PagingKey pagingKey = new PagingKey(SignalingProtocol.KEY_OFFSET, 0);
            offset = pagingKey;
            PagingKey pagingKey2 = new PagingKey("startCommentId", 1);
            startCommentId = pagingKey2;
            $VALUES = new PagingKey[]{pagingKey, pagingKey2};
        }

        public PagingKey() {
            throw null;
        }

        public static PagingKey valueOf(String str) {
            return (PagingKey) Enum.valueOf(PagingKey.class, str);
        }

        public static PagingKey[] values() {
            return (PagingKey[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PagingKey.values().length];
            a = iArr;
            try {
                iArr[PagingKey.offset.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PagingKey.startCommentId.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {
        public ArrayList<BoardComment> a;
        public int b;

        @Nullable
        public PollAttachment c;
    }

    public BoardGetComments(UserId userId, int i, int i2, PagingKey pagingKey, int i3) {
        super("board.getComments");
        this.s = -1;
        this.t = userId;
        F(userId, "group_id");
        C(i, "topic_id");
        int i4 = a.a[pagingKey.ordinal()];
        if (i4 == 1) {
            C(i3, SignalingProtocol.KEY_OFFSET);
            this.s = i3;
        } else if (i4 == 2) {
            C(i3, "start_comment_id");
        }
        C(i2, "count");
        C(1, "extended");
        C(1, "photo_sizes");
        C(1, "need_likes");
        K("fields", "sex,online,online_info,screen_name,photo_base");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            ArrayList<BoardComment> arrayList = new ArrayList<>();
            HashMap hashMap = new HashMap();
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            JSONArray jSONArray = jSONObject2.getJSONArray("profiles");
            JSONArray jSONArray2 = jSONObject2.getJSONArray("groups");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                Serializer.c<Owner> cVar = Owner.CREATOR;
                Owner f = Owner.a.f(jSONObject3);
                hashMap.put(f.b, f);
            }
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                Serializer.c<Owner> cVar2 = Owner.CREATOR;
                Owner d = Owner.a.d(jSONObject4);
                hashMap.put(d.b, d);
            }
            int optInt = jSONObject2.optInt("real_offset", this.s);
            JSONArray jSONArray3 = jSONObject2.getJSONArray("items");
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                arrayList.add(new BoardComment(jSONArray3.getJSONObject(i3), hashMap, optInt + i3, fkq0.e(this.t), null));
            }
            b bVar = new b();
            bVar.a = arrayList;
            bVar.b = jSONObject2.getInt("count");
            if (jSONObject2.has("poll")) {
                bVar.c = new PollAttachment(jSONObject2.getJSONObject("poll"), hashMap);
            }
            return bVar;
        } catch (Exception e) {
            L.C("vk", e);
            return null;
        }
    }
}
