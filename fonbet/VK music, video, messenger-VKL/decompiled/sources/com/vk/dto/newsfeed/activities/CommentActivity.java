package com.vk.dto.newsfeed.activities;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.jgp;

/* compiled from: CommentActivity.kt */
/* loaded from: classes18.dex */
public final class CommentActivity extends Activity {
    public static final Serializer.c<CommentActivity> CREATOR = new a();
    public final ArrayList<Comment> d;
    public final Map<UserId, Owner> e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommentActivity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommentActivity a(Serializer serializer) {
            Map map;
            ArrayList j = serializer.j(Comment.CREATOR);
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
                        Serializer.StreamParcelable G = serializer.G(Owner.class.getClassLoader());
                        if (G == null) {
                            throw new IllegalArgumentException("Can't get value!");
                        }
                        Owner owner = (Owner) G;
                        if (userId != null) {
                            map.put(userId, owner);
                        }
                    }
                } else {
                    map = jgp.b;
                }
                return new CommentActivity(j, map, serializer.h());
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommentActivity[i];
        }
    }

    public CommentActivity(ArrayList<Comment> arrayList, Map<UserId, Owner> map, ArrayList<String> arrayList2) {
        super(1, arrayList2);
        this.d = arrayList;
        this.e = map;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.d);
        Map<UserId, Owner> map = this.e;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c = n.c(serializer, map);
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                serializer.e0((UserId) entry.getKey());
                serializer.i0((Owner) entry.getValue());
            }
        }
        serializer.l0(this.c);
    }
}
