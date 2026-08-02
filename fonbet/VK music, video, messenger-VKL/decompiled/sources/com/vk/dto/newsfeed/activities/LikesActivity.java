package com.vk.dto.newsfeed.activities;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.reactions.ReactionSet;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.zcl;
import xsna.zrp;

/* compiled from: LikesActivity.kt */
/* loaded from: classes18.dex */
public final class LikesActivity extends Activity {
    public static final Serializer.c<LikesActivity> CREATOR = new a();
    public final String d;
    public final List<Owner> e;
    public final Position f;
    public final ReactionSet g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LikesActivity.kt */
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
    public static final class a extends Serializer.c<LikesActivity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LikesActivity a(Serializer serializer) {
            String H = serializer.H();
            ArrayList<String> h = serializer.h();
            ArrayList B = serializer.B(Owner.class.getClassLoader());
            Position position = (Position) serializer.C();
            if (position == null) {
                position = Position.DEFAULT;
            }
            return new LikesActivity(H, h, B, position, (ReactionSet) serializer.G(ReactionSet.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LikesActivity[i];
        }
    }

    public LikesActivity(String str, ArrayList<String> arrayList, List<Owner> list, Position position, ReactionSet reactionSet) {
        super(0, arrayList);
        this.d = str;
        this.e = list;
        this.f = position;
        this.g = reactionSet;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.d);
        serializer.l0(this.c);
        serializer.W(this.e);
        serializer.g0(this.f);
        serializer.i0(this.g);
    }

    public LikesActivity(String str, ArrayList arrayList, List list, Position position, ReactionSet reactionSet, int i, zcl zclVar) {
        this(str, arrayList, (i & 4) != 0 ? EmptyList.b : list, (i & 8) != 0 ? Position.DEFAULT : position, (i & 16) != 0 ? null : reactionSet);
    }
}
