package com.vk.stat.scheme;

import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeSuperappRecsItem {
    public final transient String a;
    public final transient String b;

    @pmi0("app_id")
    private final FilteredString filteredAppId;

    @pmi0("uid")
    private final FilteredString filteredUid;

    @pmi0("id")
    private final Id id;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class Id {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Id[] $VALUES;

        @pmi0("game")
        public static final Id GAME;

        @pmi0("group")
        public static final Id GROUP;

        @pmi0("mini_app")
        public static final Id MINI_APP;

        static {
            Id id = new Id("GROUP", 0);
            GROUP = id;
            Id id2 = new Id("MINI_APP", 1);
            MINI_APP = id2;
            Id id3 = new Id("GAME", 2);
            GAME = id3;
            Id[] idArr = {id, id2, id3};
            $VALUES = idArr;
            $ENTRIES = new asp(idArr);
        }

        private Id(String str, int i) {
        }

        public static Id valueOf(String str) {
            return (Id) Enum.valueOf(Id.class, str);
        }

        public static Id[] values() {
            return (Id[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeSuperappRecsItem>, a9y<SchemeStat$TypeSuperappRecsItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new SchemeStat$TypeSuperappRecsItem((Id) dq.f(x9yVar, "id", tru.a(), Id.class), fai.s(x9yVar, "app_id"), fai.C(x9yVar, "uid"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeSuperappRecsItem schemeStat$TypeSuperappRecsItem = (SchemeStat$TypeSuperappRecsItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("id", tru.a().toJson(schemeStat$TypeSuperappRecsItem.a()));
            x9yVar.o("app_id", schemeStat$TypeSuperappRecsItem.a);
            x9yVar.o("uid", schemeStat$TypeSuperappRecsItem.b);
            return x9yVar;
        }
    }

    public SchemeStat$TypeSuperappRecsItem(Id id, String str, String str2) {
        this.id = id;
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(64));
        this.filteredAppId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(512));
        this.filteredUid = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final Id a() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeSuperappRecsItem)) {
            return false;
        }
        SchemeStat$TypeSuperappRecsItem schemeStat$TypeSuperappRecsItem = (SchemeStat$TypeSuperappRecsItem) obj;
        return this.id == schemeStat$TypeSuperappRecsItem.id && epx.f(this.a, schemeStat$TypeSuperappRecsItem.a) && epx.f(this.b, schemeStat$TypeSuperappRecsItem.b);
    }

    public final int hashCode() {
        int a = urd0.a(this.id.hashCode() * 31, 31, this.a);
        String str = this.b;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSuperappRecsItem(id=");
        sb.append(this.id);
        sb.append(", appId=");
        sb.append(this.a);
        sb.append(", uid=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ SchemeStat$TypeSuperappRecsItem(Id id, String str, String str2, int i, zcl zclVar) {
        this(id, str, (i & 4) != 0 ? null : str2);
    }
}
