package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.m9h0;
import xsna.ms9;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeSuperappSectionItem implements SchemeStat$TypeView.b {
    public final transient String a;

    @pmi0("uid")
    private final FilteredString filteredUid;

    @pmi0("id")
    private final Id id;

    @pmi0("items")
    private final List<SchemeStat$TypeSuperappWidgetItem> items;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class Id {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Id[] $VALUES;

        @pmi0("section_poster")
        public static final Id SECTION_POSTER;

        @pmi0("section_scroll")
        public static final Id SECTION_SCROLL;

        @pmi0("section_video_banner")
        public static final Id SECTION_VIDEO_BANNER;

        static {
            Id id = new Id("SECTION_SCROLL", 0);
            SECTION_SCROLL = id;
            Id id2 = new Id("SECTION_POSTER", 1);
            SECTION_POSTER = id2;
            Id id3 = new Id("SECTION_VIDEO_BANNER", 2);
            SECTION_VIDEO_BANNER = id3;
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
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeSuperappSectionItem>, a9y<SchemeStat$TypeSuperappSectionItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("id");
            Object obj = null;
            Id id = (Id) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Id.class));
            String C = fai.C(x9yVar, "uid");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("items");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(x9yVar.q("items").k(), new m9h0().getType());
            }
            return new SchemeStat$TypeSuperappSectionItem(id, C, (List) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeSuperappSectionItem schemeStat$TypeSuperappSectionItem = (SchemeStat$TypeSuperappSectionItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("id", tru.a().toJson(schemeStat$TypeSuperappSectionItem.a()));
            x9yVar.o("uid", schemeStat$TypeSuperappSectionItem.a);
            x9yVar.o("items", tru.a().toJson(schemeStat$TypeSuperappSectionItem.b()));
            return x9yVar;
        }
    }

    public SchemeStat$TypeSuperappSectionItem() {
        this(null, null, null, 7, null);
    }

    public final Id a() {
        return this.id;
    }

    public final List<SchemeStat$TypeSuperappWidgetItem> b() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeSuperappSectionItem)) {
            return false;
        }
        SchemeStat$TypeSuperappSectionItem schemeStat$TypeSuperappSectionItem = (SchemeStat$TypeSuperappSectionItem) obj;
        return this.id == schemeStat$TypeSuperappSectionItem.id && epx.f(this.a, schemeStat$TypeSuperappSectionItem.a) && epx.f(this.items, schemeStat$TypeSuperappSectionItem.items);
    }

    public final int hashCode() {
        Id id = this.id;
        int hashCode = (id == null ? 0 : id.hashCode()) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<SchemeStat$TypeSuperappWidgetItem> list = this.items;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSuperappSectionItem(id=");
        sb.append(this.id);
        sb.append(", uid=");
        sb.append(this.a);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    public SchemeStat$TypeSuperappSectionItem(Id id, String str, List<SchemeStat$TypeSuperappWidgetItem> list) {
        this.id = id;
        this.a = str;
        this.items = list;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredUid = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ SchemeStat$TypeSuperappSectionItem(Id id, String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : id, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
