package com.vk.profile.core.tabs.ui.clips;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsTabCollectionDto;
import com.vk.api.generated.users.dto.UsersTabCollectionDto;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.group.GroupContentTabCollectionType;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.c5g;
import xsna.cvd0;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: Clips.kt */
/* loaded from: classes5.dex */
public final class Clips extends CommunityProfileContentItem {
    public final boolean A;
    public final boolean B;
    public final cvd0.f j;
    public final List<ClipsPlaylist> k;
    public final CommunityProfileContentItem.ContentType l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final CommunityProfileContentItem.b q;
    public final CommunityProfileContentItem.c r;
    public final CommunityProfileContentItem.State s;
    public final CommunityProfileContentItem.d t;
    public final CommunityProfileContentItem.State u;
    public final CommunityProfileContentItem.State v;
    public final boolean w;
    public final CommunityProfileContentItem.e x;
    public final List<ContentTabCollection> y;
    public final Integer z;

    /* compiled from: Clips.kt */
    public static final class ContentTabCollection {
        public final ContentTabCollectionType a;
        public final int b;
        public final List<ContentTabCollectionImage> c;

        /* compiled from: Clips.kt */
        public static final class ContentTabCollectionImage {
            public final String a;
            public final int b;
            public final int c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: Clips.kt */
            public static final class Theme {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Theme[] $VALUES;
                public static final a Companion;
                public static final Theme DARK;
                public static final Theme LIGHT;
                private final String id;

                /* compiled from: Clips.kt */
                public static final class a {

                    /* compiled from: Clips.kt */
                    /* renamed from: com.vk.profile.core.tabs.ui.clips.Clips$ContentTabCollection$ContentTabCollectionImage$Theme$a$a, reason: collision with other inner class name */
                    public static final /* synthetic */ class C1644a {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[GroupContentTabSetting.GroupContentTabCollectionImage.Theme.values().length];
                            try {
                                iArr[GroupContentTabSetting.GroupContentTabCollectionImage.Theme.LIGHT.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[GroupContentTabSetting.GroupContentTabCollectionImage.Theme.DARK.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }
                }

                static {
                    Theme theme = new Theme("LIGHT", 0, "light");
                    LIGHT = theme;
                    Theme theme2 = new Theme("DARK", 1, "dark");
                    DARK = theme2;
                    Theme[] themeArr = {theme, theme2};
                    $VALUES = themeArr;
                    $ENTRIES = new asp(themeArr);
                    Companion = new a();
                }

                public Theme(String str, int i, String str2) {
                    this.id = str2;
                }

                public static zrp<Theme> h() {
                    return $ENTRIES;
                }

                public static Theme valueOf(String str) {
                    return (Theme) Enum.valueOf(Theme.class, str);
                }

                public static Theme[] values() {
                    return (Theme[]) $VALUES.clone();
                }

                public final String getId() {
                    return this.id;
                }
            }

            /* compiled from: Clips.kt */
            public static final class a {
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
                
                    if (r4 == null) goto L17;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static ContentTabCollectionImage a(BaseImageDto baseImageDto) {
                    String j;
                    Object obj;
                    String url = baseImageDto.getUrl();
                    int width = baseImageDto.getWidth();
                    int height = baseImageDto.getHeight();
                    BaseImageDto.ThemeDto d = baseImageDto.d();
                    if (d != null && (j = d.j()) != null) {
                        Theme.Companion.getClass();
                        Iterator<E> it = Theme.h().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (epx.f(((Theme) obj).getId(), j)) {
                                break;
                            }
                        }
                        Theme theme = (Theme) obj;
                        if (theme == null) {
                            theme = Theme.LIGHT;
                        }
                    }
                    Theme.a aVar = Theme.Companion;
                    return new ContentTabCollectionImage(url, width, height);
                }
            }

            public ContentTabCollectionImage(String str, int i, int i2) {
                this.a = str;
                this.b = i;
                this.c = i2;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Clips.kt */
        public static final class ContentTabCollectionType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ContentTabCollectionType[] $VALUES;
            public static final a Companion;
            public static final ContentTabCollectionType SCHEDULED;
            public static final ContentTabCollectionType UNKNOWN;
            private final String id;

            /* compiled from: Clips.kt */
            public static final class a {

                /* compiled from: Clips.kt */
                /* renamed from: com.vk.profile.core.tabs.ui.clips.Clips$ContentTabCollection$ContentTabCollectionType$a$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C1645a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[GroupContentTabCollectionType.values().length];
                        try {
                            iArr[GroupContentTabCollectionType.UNKNOWN.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[GroupContentTabCollectionType.SCHEDULED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public static ContentTabCollectionType a(String str) {
                    Object obj;
                    Iterator<E> it = ContentTabCollectionType.h().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (epx.f(((ContentTabCollectionType) obj).getId(), str)) {
                            break;
                        }
                    }
                    ContentTabCollectionType contentTabCollectionType = (ContentTabCollectionType) obj;
                    return contentTabCollectionType == null ? ContentTabCollectionType.UNKNOWN : contentTabCollectionType;
                }
            }

            static {
                ContentTabCollectionType contentTabCollectionType = new ContentTabCollectionType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "");
                UNKNOWN = contentTabCollectionType;
                ContentTabCollectionType contentTabCollectionType2 = new ContentTabCollectionType("SCHEDULED", 1, "scheduled");
                SCHEDULED = contentTabCollectionType2;
                ContentTabCollectionType[] contentTabCollectionTypeArr = {contentTabCollectionType, contentTabCollectionType2};
                $VALUES = contentTabCollectionTypeArr;
                $ENTRIES = new asp(contentTabCollectionTypeArr);
                Companion = new a();
            }

            public ContentTabCollectionType(String str, int i, String str2) {
                this.id = str2;
            }

            public static zrp<ContentTabCollectionType> h() {
                return $ENTRIES;
            }

            public static ContentTabCollectionType valueOf(String str) {
                return (ContentTabCollectionType) Enum.valueOf(ContentTabCollectionType.class, str);
            }

            public static ContentTabCollectionType[] values() {
                return (ContentTabCollectionType[]) $VALUES.clone();
            }

            public final String getId() {
                return this.id;
            }
        }

        public ContentTabCollection(ContentTabCollectionType contentTabCollectionType, int i, List<ContentTabCollectionImage> list) {
            this.a = contentTabCollectionType;
            this.b = i;
            this.c = list;
        }
    }

    /* compiled from: Clips.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
        
            if (r0 == null) goto L6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ContentTabCollection a(GroupsTabCollectionDto groupsTabCollectionDto) {
            ContentTabCollection.ContentTabCollectionType contentTabCollectionType;
            ?? r2;
            String d = groupsTabCollectionDto.d();
            if (d != null) {
                ContentTabCollection.ContentTabCollectionType.Companion.getClass();
                contentTabCollectionType = ContentTabCollection.ContentTabCollectionType.a.a(d);
            }
            contentTabCollectionType = ContentTabCollection.ContentTabCollectionType.UNKNOWN;
            Integer e = groupsTabCollectionDto.e();
            int intValue = e != null ? e.intValue() : 0;
            List<BaseImageDto> f = groupsTabCollectionDto.f();
            if (f != null) {
                List<BaseImageDto> list = f;
                r2 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r2.add(ContentTabCollection.ContentTabCollectionImage.a.a((BaseImageDto) it.next()));
                }
            } else {
                r2 = EmptyList.b;
            }
            return new ContentTabCollection(contentTabCollectionType, intValue, r2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
        
            if (r0 == null) goto L6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ContentTabCollection b(UsersTabCollectionDto usersTabCollectionDto) {
            ContentTabCollection.ContentTabCollectionType contentTabCollectionType;
            ?? r2;
            String d = usersTabCollectionDto.d();
            if (d != null) {
                ContentTabCollection.ContentTabCollectionType.Companion.getClass();
                contentTabCollectionType = ContentTabCollection.ContentTabCollectionType.a.a(d);
            }
            contentTabCollectionType = ContentTabCollection.ContentTabCollectionType.UNKNOWN;
            Integer e = usersTabCollectionDto.e();
            int intValue = e != null ? e.intValue() : 0;
            List<BaseImageDto> f = usersTabCollectionDto.f();
            if (f != null) {
                List<BaseImageDto> list = f;
                r2 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r2.add(ContentTabCollection.ContentTabCollectionImage.a.a((BaseImageDto) it.next()));
                }
            } else {
                r2 = EmptyList.b;
            }
            return new ContentTabCollection(contentTabCollectionType, intValue, r2);
        }

        public static ContentTabCollection c(GroupContentTabSetting.GroupContentTabCollection groupContentTabCollection) {
            ContentTabCollection.ContentTabCollectionType contentTabCollectionType;
            ContentTabCollection.ContentTabCollectionType.a aVar = ContentTabCollection.ContentTabCollectionType.Companion;
            GroupContentTabCollectionType groupContentTabCollectionType = groupContentTabCollection.b;
            aVar.getClass();
            int i = ContentTabCollection.ContentTabCollectionType.a.C1645a.$EnumSwitchMapping$0[groupContentTabCollectionType.ordinal()];
            if (i == 1) {
                contentTabCollectionType = ContentTabCollection.ContentTabCollectionType.UNKNOWN;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                contentTabCollectionType = ContentTabCollection.ContentTabCollectionType.SCHEDULED;
            }
            int i2 = groupContentTabCollection.c;
            List<GroupContentTabSetting.GroupContentTabCollectionImage> list = groupContentTabCollection.d;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (GroupContentTabSetting.GroupContentTabCollectionImage groupContentTabCollectionImage : list) {
                String str = groupContentTabCollectionImage.b;
                int i3 = groupContentTabCollectionImage.c;
                int i4 = groupContentTabCollectionImage.d;
                ContentTabCollection.ContentTabCollectionImage.Theme.a aVar2 = ContentTabCollection.ContentTabCollectionImage.Theme.Companion;
                GroupContentTabSetting.GroupContentTabCollectionImage.Theme theme = groupContentTabCollectionImage.f;
                aVar2.getClass();
                int i5 = ContentTabCollection.ContentTabCollectionImage.Theme.a.C1644a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i5 != 1 && i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new ContentTabCollection.ContentTabCollectionImage(str, i3, i4));
            }
            return new ContentTabCollection(contentTabCollectionType, i2, arrayList);
        }
    }

    public /* synthetic */ Clips(CommunityProfileContentItem.ContentType contentType, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2, CommunityProfileContentItem.State state3, boolean z, ArrayList arrayList, Integer num, boolean z2, int i) {
        this(null, null, contentType, null, false, false, null, bVar, cVar, state, dVar, state2, state3, (i & 8192) != 0 ? false : z, null, arrayList, num, z2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Clips i(Clips clips, cvd0.f fVar, ArrayList arrayList, CommunityProfileContentItem.ContentType contentType, String str, boolean z, boolean z2, String str2, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, CommunityProfileContentItem.State state3, Integer num, boolean z3, int i) {
        cvd0.f fVar2 = (i & 1) != 0 ? clips.j : fVar;
        List list = (i & 2) != 0 ? clips.k : arrayList;
        CommunityProfileContentItem.ContentType contentType2 = (i & 4) != 0 ? clips.l : contentType;
        String str3 = (i & 8) != 0 ? clips.m : str;
        boolean z4 = (i & 16) != 0 ? clips.n : z;
        boolean z5 = (i & 32) != 0 ? clips.o : z2;
        String str4 = (i & 64) != 0 ? clips.p : str2;
        CommunityProfileContentItem.b bVar2 = (i & 128) != 0 ? clips.q : bVar;
        CommunityProfileContentItem.c cVar = clips.r;
        CommunityProfileContentItem.State state4 = (i & 512) != 0 ? clips.s : state;
        CommunityProfileContentItem.d dVar = clips.t;
        CommunityProfileContentItem.State state5 = (i & 2048) != 0 ? clips.u : state2;
        CommunityProfileContentItem.State state6 = (i & 4096) != 0 ? clips.v : state3;
        boolean z6 = clips.w;
        CommunityProfileContentItem.e eVar = (i & 16384) != 0 ? clips.x : null;
        List<ContentTabCollection> list2 = clips.y;
        Integer num2 = (i & 65536) != 0 ? clips.z : num;
        boolean z7 = clips.A;
        boolean z8 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? clips.B : z3;
        clips.getClass();
        return new Clips(fVar2, list, contentType2, str3, z4, z5, str4, bVar2, cVar, state4, dVar, state5, state6, z6, eVar, list2, num2, z7, z8);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.b a() {
        return this.q;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.c b() {
        return this.r;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.d c() {
        return this.t;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State d() {
        return this.u;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.e e() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Clips)) {
            return false;
        }
        Clips clips = (Clips) obj;
        return epx.f(this.j, clips.j) && epx.f(this.k, clips.k) && this.l == clips.l && epx.f(this.m, clips.m) && this.n == clips.n && this.o == clips.o && epx.f(this.p, clips.p) && epx.f(this.q, clips.q) && epx.f(this.r, clips.r) && this.s == clips.s && epx.f(this.t, clips.t) && this.u == clips.u && this.v == clips.v && this.w == clips.w && epx.f(this.x, clips.x) && epx.f(this.y, clips.y) && epx.f(this.z, clips.z) && this.A == clips.A && this.B == clips.B;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.s;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final boolean g() {
        return this.w;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final int h() {
        int h = super.h() * 31;
        cvd0.f fVar = this.j;
        int hashCode = (h + (fVar != null ? fVar.a.hashCode() : 0)) * 31;
        Integer num = this.z;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        List<ClipsPlaylist> list = this.k;
        return this.v.hashCode() + qoy.b((intValue + (list != null ? list.hashCode() : 0)) * 31, 31, this.o);
    }

    public final int hashCode() {
        cvd0.f fVar = this.j;
        int hashCode = (fVar == null ? 0 : fVar.a.hashCode()) * 31;
        List<ClipsPlaylist> list = this.k;
        int hashCode2 = (this.l.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str = this.m;
        int b = qoy.b(qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.n), 31, this.o);
        String str2 = this.p;
        int a2 = j.a(this.s, shy.a(this.r.a, (this.q.hashCode() + ((b + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31);
        CommunityProfileContentItem.d dVar = this.t;
        int b2 = qoy.b(j.a(this.v, j.a(this.u, (a2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31, this.w);
        CommunityProfileContentItem.e eVar = this.x;
        int hashCode3 = (b2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<ContentTabCollection> list2 = this.y;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.z;
        return Boolean.hashCode(this.B) + qoy.b((hashCode4 + (num != null ? num.hashCode() : 0)) * 31, 31, this.A);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Clips(clips=");
        sb.append(this.j);
        sb.append(", clipsPlaylists=");
        sb.append(this.k);
        sb.append(", contentType=");
        sb.append(this.l);
        sb.append(", playlistsNextFrom=");
        sb.append(this.m);
        sb.append(", hasMore=");
        sb.append(this.n);
        sb.append(", hasMorePlaylists=");
        sb.append(this.o);
        sb.append(", nextFrom=");
        sb.append(this.p);
        sb.append(", empty=");
        sb.append(this.q);
        sb.append(", error=");
        sb.append(this.r);
        sb.append(", state=");
        sb.append(this.s);
        sb.append(", fabState=");
        sb.append(this.t);
        sb.append(", loadMoreState=");
        sb.append(this.u);
        sb.append(", loadMorePlaylistsState=");
        sb.append(this.v);
        sb.append(", isPinned=");
        sb.append(this.w);
        sb.append(", onboardingState=");
        sb.append(this.x);
        sb.append(", collections=");
        sb.append(this.y);
        sb.append(", coOwnerInvitationsCount=");
        sb.append(this.z);
        sb.append(", hasAdminRights=");
        sb.append(this.A);
        sb.append(", quickReload=");
        return q0.a(sb, this.B, ')');
    }

    public Clips(cvd0.f fVar, List<ClipsPlaylist> list, CommunityProfileContentItem.ContentType contentType, String str, boolean z, boolean z2, String str2, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2, CommunityProfileContentItem.State state3, boolean z3, CommunityProfileContentItem.e eVar, List<ContentTabCollection> list2, Integer num, boolean z4, boolean z5) {
        super(new ContentTab.Clip(z3, 2), fVar != null ? fVar.a.size() : 0, bVar, cVar, state, dVar, state2, 7, eVar, 512);
        this.j = fVar;
        this.k = list;
        this.l = contentType;
        this.m = str;
        this.n = z;
        this.o = z2;
        this.p = str2;
        this.q = bVar;
        this.r = cVar;
        this.s = state;
        this.t = dVar;
        this.u = state2;
        this.v = state3;
        this.w = z3;
        this.x = eVar;
        this.y = list2;
        this.z = num;
        this.A = z4;
        this.B = z5;
    }
}
