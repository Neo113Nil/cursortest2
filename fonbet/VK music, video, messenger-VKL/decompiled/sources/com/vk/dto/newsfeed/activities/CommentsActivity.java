package com.vk.dto.newsfeed.activities;

import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.asp;
import xsna.jgp;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommentsActivity.kt */
/* loaded from: classes18.dex */
public final class CommentsActivity extends Activity {
    public static final Serializer.c<CommentsActivity> CREATOR = new a();
    public final ArrayList<Comment> d;
    public final Map<UserId, Owner> e;
    public final UserId f;
    public final boolean g;
    public final Position h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommentsActivity.kt */
    public static final class Position {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position DEFAULT;
        public static final Position ON_CONTENT;

        static {
            Position position = new Position("DEFAULT", 0);
            DEFAULT = position;
            Position position2 = new Position("ON_CONTENT", 1);
            ON_CONTENT = position2;
            Position[] positionArr = {position, position2};
            $VALUES = positionArr;
            $ENTRIES = new asp(positionArr);
        }

        public Position() {
            throw null;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommentsActivity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommentsActivity a(Serializer serializer) {
            Map map;
            ArrayList j = serializer.j(Comment.CREATOR);
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        Parcelable A = serializer.A(UserId.class.getClassLoader());
                        Serializer.StreamParcelable G = serializer.G(Owner.class.getClassLoader());
                        if (A != null && G != null) {
                            map.put(A, G);
                        }
                    }
                } else {
                    map = jgp.b;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                ArrayList<String> h = serializer.h();
                UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
                boolean m = serializer.m();
                Position position = (Position) serializer.C();
                if (position == null) {
                    position = Position.DEFAULT;
                }
                return new CommentsActivity(j, linkedHashMap, h, userId, m, position);
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommentsActivity[i];
        }
    }

    public /* synthetic */ CommentsActivity(ArrayList arrayList, Map map, ArrayList arrayList2, UserId userId, boolean z, Position position, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : arrayList, map, arrayList2, userId, (i & 16) != 0 ? true : z, (i & 32) != 0 ? Position.DEFAULT : position);
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
                serializer.e0((Parcelable) entry.getKey());
                serializer.i0((Serializer.StreamParcelable) entry.getValue());
            }
        }
        serializer.l0(this.c);
        serializer.e0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.g0(this.h);
    }

    public CommentsActivity(ArrayList<Comment> arrayList, Map<UserId, Owner> map, ArrayList<String> arrayList2, UserId userId, boolean z, Position position) {
        super(2, arrayList2);
        this.d = arrayList;
        this.e = map;
        this.f = userId;
        this.g = z;
        this.h = position;
    }
}
