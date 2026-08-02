package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlockAnchorInfo;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.api.video.ShowcaseListItem;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoEpisode;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.author.VideoPinType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.d1a;
import xsna.dfp0;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.i7o0;
import xsna.jq;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: UIBlockVideo.kt */
/* loaded from: classes16.dex */
public final class UIBlockVideo extends UIBlock implements d1a, dfp0 {
    public static final Serializer.c<UIBlockVideo> CREATOR = new b();
    public final List<CatalogBlockAnchorInfo> A;
    public final VideoFile B;
    public final boolean C;
    public final List<String> D;
    public final VideoPinType E;
    public final ItemViewContentDescription F;
    public final ShowcaseListItem G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final String K;
    public final boolean L;
    public UserId M;
    public Integer N;
    public final DynamicPollData O;
    public final String y;
    public final String z;

    /* compiled from: UIBlockVideo.kt */
    public static final class DynamicPollData extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<DynamicPollData> CREATOR = new a();
        public final String b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<DynamicPollData> {
            @Override // com.vk.core.serialize.Serializer.c
            public final DynamicPollData a(Serializer serializer) {
                return new DynamicPollData(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DynamicPollData[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DynamicPollData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.m0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DynamicPollData) && epx.f(this.b, ((DynamicPollData) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("DynamicPollData(trigger="), this.b, ')');
        }

        public /* synthetic */ DynamicPollData(String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str);
        }

        public DynamicPollData(String str) {
            this.b = str;
        }

        public DynamicPollData(Serializer serializer, zcl zclVar) {
            this(serializer.I());
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UIBlockVideo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockVideo a(Serializer serializer) {
            return new UIBlockVideo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockVideo[i];
        }
    }

    public /* synthetic */ UIBlockVideo(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List list, Set set, UIBlockHint uIBlockHint, a aVar, CatalogViewStyle catalogViewStyle, int i, zcl zclVar) {
        this(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, aVar, (i & 512) != 0 ? null : catalogViewStyle);
    }

    public final VideoFile A() {
        return this.B;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final boolean Bb(Object obj) {
        if (!super.Bb(obj) || !(obj instanceof UIBlockVideo)) {
            return false;
        }
        UIBlockVideo uIBlockVideo = (UIBlockVideo) obj;
        return epx.f(this.B.a1(), uIBlockVideo.B.a1()) && epx.f(this.y, uIBlockVideo.y) && this.H == uIBlockVideo.H && this.I == uIBlockVideo.I && this.J == uIBlockVideo.J && epx.f(this.K, uIBlockVideo.K) && this.L == uIBlockVideo.L;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.B.a1();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.B);
        serializer.j0(this.y);
        serializer.j0(this.z);
        serializer.L(this.H ? (byte) 1 : (byte) 0);
        serializer.L(this.I ? (byte) 1 : (byte) 0);
        serializer.L(this.J ? (byte) 1 : (byte) 0);
        serializer.j0(this.K);
        serializer.i0(this.F);
        serializer.L(this.L ? (byte) 1 : (byte) 0);
        serializer.L(this.C ? (byte) 1 : (byte) 0);
        serializer.l0(this.D);
        serializer.i0(this.G);
        serializer.f0(this.A);
        serializer.e0(this.E);
        serializer.i0(this.O);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Pb, reason: merged with bridge method [inline-methods] */
    public final UIBlockVideo zb() {
        VideoFileOld copy = this.B.copy();
        ItemViewContentDescription itemViewContentDescription = this.F;
        ItemViewContentDescription itemViewContentDescription2 = itemViewContentDescription != null ? new ItemViewContentDescription(itemViewContentDescription.b, itemViewContentDescription.c) : null;
        List<String> list = this.D;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        ShowcaseListItem showcaseListItem = this.G;
        ShowcaseListItem showcaseListItem2 = showcaseListItem != null ? new ShowcaseListItem(showcaseListItem.b, showcaseListItem.c, showcaseListItem.d, showcaseListItem.e, showcaseListItem.f) : null;
        ArrayList a2 = i7o0.a(this.A);
        DynamicPollData dynamicPollData = this.O;
        a aVar = new a(this.y, copy, this.z, this.H, this.I, this.J, this.K, itemViewContentDescription2, this.L, this.C, arrayList, showcaseListItem2, a2, this.E, dynamicPollData != null ? new DynamicPollData(dynamicPollData.b) : null);
        UserId a3 = UserId.a(this.g);
        ArrayList a4 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it2 = Db.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        CatalogViewStyle catalogViewStyle = this.l;
        UIBlockVideo uIBlockVideo = new UIBlockVideo(this.b, this.d, this.e, this.f, a3, a4, hashSet, zb, aVar, catalogViewStyle != null ? catalogViewStyle.copy() : null);
        uIBlockVideo.N = this.N;
        uIBlockVideo.M = this.M;
        return uIBlockVideo;
    }

    public final Integer Qb() {
        return this.N;
    }

    public final VideoPinType Rb() {
        return this.E;
    }

    public final String Sb() {
        return this.K;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockVideo) && UIBlock.a.b(this, (UIBlock) obj)) {
            UIBlockVideo uIBlockVideo = (UIBlockVideo) obj;
            VideoFile videoFile = uIBlockVideo.B;
            VideoFile videoFile2 = uIBlockVideo.B;
            VideoFile videoFile3 = this.B;
            if (epx.f(videoFile3, videoFile) && epx.f(videoFile3.getTitle(), videoFile2.getTitle()) && videoFile3.getTimestamp() == videoFile2.getTimestamp() && epx.f(this.y, uIBlockVideo.y) && this.H == uIBlockVideo.H && this.I == uIBlockVideo.I && this.J == uIBlockVideo.J && epx.f(this.K, uIBlockVideo.K) && epx.f(this.F, uIBlockVideo.F) && this.L == uIBlockVideo.L) {
                boolean z = uIBlockVideo.C;
                List<String> list = uIBlockVideo.D;
                if (this.C == z && videoFile3.Y3().size() == videoFile2.Y3().size()) {
                    List<String> list2 = this.D;
                    if (list2.size() == list.size()) {
                        Iterator<T> it = videoFile3.Y3().iterator();
                        int i = 0;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (!epx.f((VideoEpisode) next, videoFile2.Y3().get(i))) {
                                    break;
                                }
                                i = i2;
                            } else {
                                Iterator<T> it2 = list2.iterator();
                                int i3 = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        if (!epx.f(this.G, uIBlockVideo.G) || !epx.f(this.A, uIBlockVideo.A) || this.E != uIBlockVideo.E || !epx.f(this.O, uIBlockVideo.O)) {
                                            break;
                                        }
                                        return true;
                                    }
                                    Object next2 = it2.next();
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    if (!epx.f((String) next2, list.get(i3))) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.B, this.y, Boolean.valueOf(this.H), Boolean.valueOf(this.I), Boolean.valueOf(this.J), this.K, this.F, Boolean.valueOf(this.L), this.G, this.A, this.E, this.O);
    }

    @Override // xsna.d1a
    public final VideoFile m7() {
        return this.B;
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.B.r();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "Video[" + this.B.getTitle() + ']';
    }

    public UIBlockVideo(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, a aVar, CatalogViewStyle catalogViewStyle) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, null, null, null, null, null, 32000, null);
        this.N = 0;
        this.y = aVar.a;
        this.z = aVar.c;
        this.B = aVar.b;
        this.H = aVar.d;
        this.I = aVar.e;
        this.J = aVar.f;
        this.K = aVar.g;
        this.F = aVar.h;
        this.L = aVar.i;
        this.C = aVar.j;
        this.D = aVar.k;
        this.G = aVar.l;
        this.A = aVar.m;
        this.E = aVar.n;
        this.O = aVar.o;
    }

    /* compiled from: UIBlockVideo.kt */
    public static final class ItemViewContentDescription extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<ItemViewContentDescription> CREATOR = new a();
        public final int b;
        public final List<String> c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ItemViewContentDescription> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ItemViewContentDescription a(Serializer serializer) {
                return new ItemViewContentDescription(serializer, (zcl) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemViewContentDescription[i];
            }
        }

        public ItemViewContentDescription(int i, List<String> list) {
            this.b = i;
            this.c = list;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.l0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemViewContentDescription)) {
                return false;
            }
            ItemViewContentDescription itemViewContentDescription = (ItemViewContentDescription) obj;
            return this.b == itemViewContentDescription.b && epx.f(this.c, itemViewContentDescription.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            List<String> list = this.c;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemViewContentDescription(stringRes=");
            sb.append(this.b);
            sb.append(", args=");
            return ms9.a(')', sb, this.c);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ItemViewContentDescription(Serializer serializer, zcl zclVar) {
            this(r4, r0);
            ArrayList arrayList;
            int u = serializer.u();
            ArrayList<String> h = serializer.h();
            if (h != null) {
                arrayList = new ArrayList(c5g.u(h, 10));
                Iterator<String> it = h.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (next == null) {
                        next = "";
                    }
                    arrayList.add(next);
                }
            } else {
                arrayList = null;
            }
        }
    }

    /* compiled from: UIBlockVideo.kt */
    public static final class a {
        public final String a;
        public final VideoFile b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final String g;
        public final ItemViewContentDescription h;
        public final boolean i;
        public final boolean j;
        public final List<String> k;
        public final ShowcaseListItem l;
        public final List<CatalogBlockAnchorInfo> m;
        public final VideoPinType n;
        public final DynamicPollData o;

        public a(String str, VideoFile videoFile, String str2, boolean z, boolean z2, boolean z3, String str3, ItemViewContentDescription itemViewContentDescription, boolean z4, boolean z5, List<String> list, ShowcaseListItem showcaseListItem, List<CatalogBlockAnchorInfo> list2, VideoPinType videoPinType, DynamicPollData dynamicPollData) {
            this.a = str;
            this.b = videoFile;
            this.c = str2;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = str3;
            this.h = itemViewContentDescription;
            this.i = z4;
            this.j = z5;
            this.k = list;
            this.l = showcaseListItem;
            this.m = list2;
            this.n = videoPinType;
            this.o = dynamicPollData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && this.n == aVar.n && epx.f(this.o, aVar.o);
        }

        public final int hashCode() {
            String str = this.a;
            int b = jq.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.c;
            int a = urd0.a(qoy.b(qoy.b(qoy.b((b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            ItemViewContentDescription itemViewContentDescription = this.h;
            int a2 = fw3.a(qoy.b(qoy.b((a + (itemViewContentDescription == null ? 0 : itemViewContentDescription.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
            ShowcaseListItem showcaseListItem = this.l;
            int a3 = fw3.a((a2 + (showcaseListItem == null ? 0 : showcaseListItem.hashCode())) * 31, 31, this.m);
            VideoPinType videoPinType = this.n;
            int hashCode = (a3 + (videoPinType == null ? 0 : videoPinType.hashCode())) * 31;
            DynamicPollData dynamicPollData = this.o;
            return hashCode + (dynamicPollData != null ? dynamicPollData.hashCode() : 0);
        }

        public final String toString() {
            return "VideoBlockParams(title=" + this.a + ", videoFile=" + this.b + ", nextFrom=" + this.c + ", isFromViewHistory=" + this.d + ", isFromMyVideos=" + this.e + ", isFromMyLiked=" + this.f + ", urlToBlock=" + this.g + ", itemViewContentDescription=" + this.h + ", isFave=" + this.i + ", hasEpisodes=" + this.j + ", marks=" + this.k + ", showcaseInfo=" + this.l + ", anchorInfo=" + this.m + ", pinnedType=" + this.n + ", dynamicPollData=" + this.o + ')';
        }

        public a(String str, VideoFile videoFile, boolean z, String str2, boolean z2, List list, ShowcaseListItem showcaseListItem, DynamicPollData dynamicPollData, int i) {
            this(str, videoFile, null, (i & 8) != 0 ? false : z, false, false, (i & 64) != 0 ? "" : str2, null, false, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? EmptyList.b : list, (i & 2048) != 0 ? null : showcaseListItem, EmptyList.b, null, (i & 16384) != 0 ? null : dynamicPollData);
        }
    }

    public UIBlockVideo(Serializer serializer) {
        super(serializer);
        this.N = 0;
        this.B = (VideoFile) serializer.G(VideoFile.class.getClassLoader());
        this.y = serializer.H();
        this.z = serializer.H();
        this.H = serializer.m();
        this.I = serializer.m();
        this.J = serializer.m();
        String H = serializer.H();
        this.K = H == null ? "" : H;
        this.F = (ItemViewContentDescription) serializer.G(ItemViewContentDescription.class.getClassLoader());
        this.L = serializer.m();
        this.C = serializer.m();
        this.D = com.vk.core.serialize.a.a(serializer);
        this.G = (ShowcaseListItem) serializer.G(ShowcaseListItem.class.getClassLoader());
        this.A = serializer.B(CatalogBlockAnchorInfo.class.getClassLoader());
        this.E = (VideoPinType) serializer.A(VideoPinType.class.getClassLoader());
        this.O = (DynamicPollData) serializer.G(DynamicPollData.class.getClassLoader());
    }
}
