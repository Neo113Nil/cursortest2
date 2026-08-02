package com.vk.catalog2.common.dto.ui;

import android.os.Parcel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.VideoFeatures;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.d1a;
import xsna.dfp0;
import xsna.e43;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.iq;
import xsna.j5g;
import xsna.ms9;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UIBlockTopshelf.kt */
/* loaded from: classes16.dex */
public final class UIBlockTopshelf extends UIBlock implements d1a, dfp0 {
    public static final Serializer.c<UIBlockTopshelf> CREATOR = new b();
    public final List<TopshelfItem> y;

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfImage implements Serializable {
        private final Long duration;
        private final String url;

        public TopshelfImage(String str, Long l) {
            this.url = str;
            this.duration = l;
        }

        public final Long d() {
            return this.duration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopshelfImage)) {
                return false;
            }
            TopshelfImage topshelfImage = (TopshelfImage) obj;
            return epx.f(this.url, topshelfImage.url) && epx.f(this.duration, topshelfImage.duration);
        }

        public final String g() {
            return this.url;
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.duration;
            return hashCode + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopshelfImage(url=");
            sb.append(this.url);
            sb.append(", duration=");
            return iq.b(sb, this.duration, ')');
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static abstract class TopshelfItem implements Serializer.StreamParcelable {
        public final String b;
        public final VideoFile c;
        public final a d;
        public final Boolean e;
        public final Integer f;
        public final String g;

        public TopshelfItem(String str, VideoFile videoFile, a aVar, Boolean bool, Integer num, String str2, zcl zclVar) {
            this.b = str;
            this.c = videoFile;
            this.d = aVar;
            this.e = bool;
            this.f = num;
            this.g = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.e0(this.c);
            a aVar = this.d;
            serializer.g0(aVar.a);
            serializer.g0(aVar.b);
            serializer.g0(aVar.c);
            serializer.g0(aVar.d);
            serializer.g0(aVar.e);
            serializer.g0(aVar.f);
            Boolean bool = this.e;
            serializer.L(bool != null ? bool.booleanValue() : (byte) 0);
            Integer num = this.f;
            serializer.S(num != null ? num.intValue() : 0);
            serializer.j0(this.g);
        }

        public abstract TopshelfItem d();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof TopshelfItem)) {
                return false;
            }
            TopshelfItem topshelfItem = (TopshelfItem) obj;
            if (epx.f(this.b, topshelfItem.b) && epx.f(this.c, topshelfItem.c)) {
                a aVar = this.d;
                if (epx.f(aVar.a, topshelfItem.d.a) && epx.f(aVar.b, topshelfItem.d.b) && epx.f(aVar.c, topshelfItem.d.c) && epx.f(aVar.d, topshelfItem.d.d) && epx.f(aVar.e, topshelfItem.d.e) && epx.f(aVar.f, topshelfItem.d.f) && epx.f(this.e, topshelfItem.e) && epx.f(this.f, topshelfItem.f) && epx.f(this.g, topshelfItem.g)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            VideoFile videoFile = this.c;
            int hashCode2 = (hashCode + (videoFile != null ? videoFile.hashCode() : 0)) * 31;
            a aVar = this.d;
            TopshelfImage topshelfImage = aVar.a;
            int hashCode3 = (hashCode2 + (topshelfImage != null ? topshelfImage.hashCode() : 0)) * 31;
            TopshelfTrackCodes topshelfTrackCodes = aVar.b;
            int hashCode4 = (hashCode3 + (topshelfTrackCodes != null ? topshelfTrackCodes.hashCode() : 0)) * 31;
            TopshelfTexts topshelfTexts = aVar.c;
            int hashCode5 = (hashCode4 + (topshelfTexts != null ? topshelfTexts.hashCode() : 0)) * 31;
            TopshelfMeta topshelfMeta = aVar.d;
            int hashCode6 = (hashCode5 + (topshelfMeta != null ? topshelfMeta.hashCode() : 0)) * 31;
            TopshelfLiveInfo topshelfLiveInfo = aVar.e;
            int hashCode7 = (hashCode6 + (topshelfLiveInfo != null ? topshelfLiveInfo.hashCode() : 0)) * 31;
            TopshelfTrailer topshelfTrailer = aVar.f;
            int hashCode8 = (hashCode7 + (topshelfTrailer != null ? topshelfTrailer.hashCode() : 0)) * 31;
            Boolean bool = this.e;
            int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
            Integer num = this.f;
            int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
            String str2 = this.g;
            return hashCode10 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfKids extends TopshelfItem {
        public TopshelfKids(String str, a aVar, String str2) {
            super(str, null, aVar, null, null, str2, null);
        }

        @Override // com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfItem
        public final TopshelfItem d() {
            return new TopshelfKids(this.b, this.d, this.g);
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfLive extends TopshelfItem {
        public TopshelfLive(String str, VideoFile videoFile, a aVar, Boolean bool, Integer num) {
            super(str, videoFile, aVar, bool, num, null, null);
        }

        @Override // com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfItem
        public final TopshelfItem d() {
            return new TopshelfLive(this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfLiveInfo implements Serializable {
        private final List<Info> info;

        /* compiled from: UIBlockTopshelf.kt */
        public static final class Icon implements Serializable {
            private final Integer height;
            private final String url;
            private final Integer width;

            public Icon(String str, Integer num, Integer num2) {
                this.url = str;
                this.width = num;
                this.height = num2;
            }

            public final String d() {
                return this.url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return epx.f(this.url, icon.url) && epx.f(this.width, icon.width) && epx.f(this.height, icon.height);
            }

            public final int hashCode() {
                String str = this.url;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.width;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.height;
                return hashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(url=");
                sb.append(this.url);
                sb.append(", width=");
                sb.append(this.width);
                sb.append(", height=");
                return uqi.b(sb, this.height, ')');
            }
        }

        /* compiled from: UIBlockTopshelf.kt */
        public static final class Info implements Serializable {
            private final List<Icon> icon;
            private final String text;

            public Info(String str, ArrayList arrayList) {
                this.icon = arrayList;
                this.text = str;
            }

            public final List<Icon> d() {
                return this.icon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Info)) {
                    return false;
                }
                Info info = (Info) obj;
                return epx.f(this.icon, info.icon) && epx.f(this.text, info.text);
            }

            public final String g() {
                return this.text;
            }

            public final int hashCode() {
                List<Icon> list = this.icon;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                String str = this.text;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Info(icon=");
                sb.append(this.icon);
                sb.append(", text=");
                return ho8.a(sb, this.text, ')');
            }
        }

        public TopshelfLiveInfo(ArrayList arrayList) {
            this.info = arrayList;
        }

        public final List<Info> d() {
            return this.info;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TopshelfLiveInfo) && epx.f(this.info, ((TopshelfLiveInfo) obj).info);
        }

        public final int hashCode() {
            List<Info> list = this.info;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("TopshelfLiveInfo(info="), this.info);
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfMeta implements Serializable {
        private final String ageRating;
        private final List<String> genres;
        private final String year;

        public TopshelfMeta(String str, String str2, List<String> list) {
            this.year = str;
            this.ageRating = str2;
            this.genres = list;
        }

        public final String d() {
            return this.ageRating;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopshelfMeta)) {
                return false;
            }
            TopshelfMeta topshelfMeta = (TopshelfMeta) obj;
            return epx.f(this.year, topshelfMeta.year) && epx.f(this.ageRating, topshelfMeta.ageRating) && epx.f(this.genres, topshelfMeta.genres);
        }

        public final List<String> g() {
            return this.genres;
        }

        public final String h() {
            return this.year;
        }

        public final int hashCode() {
            String str = this.year;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.ageRating;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.genres;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopshelfMeta(year=");
            sb.append(this.year);
            sb.append(", ageRating=");
            sb.append(this.ageRating);
            sb.append(", genres=");
            return ms9.a(')', sb, this.genres);
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfNews extends TopshelfItem {
        public final ClipVideoFile h;

        public TopshelfNews(ClipVideoFile clipVideoFile, String str, a aVar) {
            super(str, clipVideoFile, aVar, null, null, null, null);
            this.h = clipVideoFile;
        }

        @Override // com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfItem
        public final TopshelfItem d() {
            return new TopshelfNews(this.h, this.b, this.d);
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfPlaylist extends TopshelfItem {
        public TopshelfPlaylist(String str, VideoFile videoFile, a aVar, Boolean bool, Integer num) {
            super(str, videoFile, aVar, bool, num, null, null);
        }

        @Override // com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfItem
        public final TopshelfItem d() {
            return new TopshelfPlaylist(this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfTexts implements Serializable {
        private final String text;
        private final String title;

        public TopshelfTexts(String str, String str2) {
            this.title = str;
            this.text = str2;
        }

        public final String d() {
            return this.text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopshelfTexts)) {
                return false;
            }
            TopshelfTexts topshelfTexts = (TopshelfTexts) obj;
            return epx.f(this.title, topshelfTexts.title) && epx.f(this.text, topshelfTexts.text);
        }

        public final String g() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopshelfTexts(title=");
            sb.append(this.title);
            sb.append(", text=");
            return ho8.a(sb, this.text, ')');
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfTrackCodes implements Serializable {
        private final String topshelfTrackCode;
        private final String trailerTrackCode;

        public TopshelfTrackCodes(String str, String str2) {
            this.topshelfTrackCode = str;
            this.trailerTrackCode = str2;
        }

        public final String d() {
            return this.topshelfTrackCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopshelfTrackCodes)) {
                return false;
            }
            TopshelfTrackCodes topshelfTrackCodes = (TopshelfTrackCodes) obj;
            return epx.f(this.topshelfTrackCode, topshelfTrackCodes.topshelfTrackCode) && epx.f(this.trailerTrackCode, topshelfTrackCodes.trailerTrackCode);
        }

        public final int hashCode() {
            String str = this.topshelfTrackCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.trailerTrackCode;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopshelfTrackCodes(topshelfTrackCode=");
            sb.append(this.topshelfTrackCode);
            sb.append(", trailerTrackCode=");
            return ho8.a(sb, this.trailerTrackCode, ')');
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfTrailer implements Serializable {
        private final Long duration;
        private final Map<String, String> files;

        public TopshelfTrailer(Map<String, String> map, Long l) {
            this.files = map;
            this.duration = l;
        }

        public final Long d() {
            return this.duration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopshelfTrailer)) {
                return false;
            }
            TopshelfTrailer topshelfTrailer = (TopshelfTrailer) obj;
            return epx.f(this.files, topshelfTrailer.files) && epx.f(this.duration, topshelfTrailer.duration);
        }

        public final Map<String, String> g() {
            return this.files;
        }

        public final int hashCode() {
            Map<String, String> map = this.files;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Long l = this.duration;
            return hashCode + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopshelfTrailer(files=");
            sb.append(this.files);
            sb.append(", duration=");
            return iq.b(sb, this.duration, ')');
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class TopshelfVideo extends TopshelfItem {
        public TopshelfVideo(String str, VideoFile videoFile, a aVar, Boolean bool, Integer num) {
            super(str, videoFile, aVar, bool, num, null, null);
        }

        @Override // com.vk.catalog2.common.dto.ui.UIBlockTopshelf.TopshelfItem
        public final TopshelfItem d() {
            return new TopshelfVideo(this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* compiled from: UIBlockTopshelf.kt */
    public static final class a {
        public final TopshelfImage a;
        public final TopshelfTrackCodes b;
        public final TopshelfTexts c;
        public final TopshelfMeta d;
        public final TopshelfLiveInfo e;
        public final TopshelfTrailer f;

        public a(TopshelfImage topshelfImage, TopshelfTrackCodes topshelfTrackCodes, TopshelfTexts topshelfTexts, TopshelfMeta topshelfMeta, TopshelfLiveInfo topshelfLiveInfo, TopshelfTrailer topshelfTrailer) {
            this.a = topshelfImage;
            this.b = topshelfTrackCodes;
            this.c = topshelfTexts;
            this.d = topshelfMeta;
            this.e = topshelfLiveInfo;
            this.f = topshelfTrailer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            TopshelfImage topshelfImage = this.a;
            int hashCode = (topshelfImage == null ? 0 : topshelfImage.hashCode()) * 31;
            TopshelfTrackCodes topshelfTrackCodes = this.b;
            int hashCode2 = (hashCode + (topshelfTrackCodes == null ? 0 : topshelfTrackCodes.hashCode())) * 31;
            TopshelfTexts topshelfTexts = this.c;
            int hashCode3 = (hashCode2 + (topshelfTexts == null ? 0 : topshelfTexts.hashCode())) * 31;
            TopshelfMeta topshelfMeta = this.d;
            int hashCode4 = (hashCode3 + (topshelfMeta == null ? 0 : topshelfMeta.hashCode())) * 31;
            TopshelfLiveInfo topshelfLiveInfo = this.e;
            int hashCode5 = (hashCode4 + (topshelfLiveInfo == null ? 0 : topshelfLiveInfo.hashCode())) * 31;
            TopshelfTrailer topshelfTrailer = this.f;
            return hashCode5 + (topshelfTrailer != null ? topshelfTrailer.hashCode() : 0);
        }

        public final String toString() {
            return "TopshelfData(topshelfImage=" + this.a + ", topshelfTrackCodes=" + this.b + ", topshelfTexts=" + this.c + ", topshelfMeta=" + this.d + ", topshelfLiveInfo=" + this.e + ", topshelfTrailer=" + this.f + ')';
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UIBlockTopshelf> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockTopshelf a(Serializer serializer) {
            return new UIBlockTopshelf(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockTopshelf[i];
        }
    }

    public /* synthetic */ UIBlockTopshelf(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List list, Set set, UIBlockHint uIBlockHint, CatalogViewStyle catalogViewStyle, List list2, int i, zcl zclVar) {
        this(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, (i & 256) != 0 ? null : catalogViewStyle, list2);
    }

    public static boolean Pb(UIBlockTopshelf uIBlockTopshelf, UIBlockTopshelf uIBlockTopshelf2) {
        List<TopshelfItem> list = uIBlockTopshelf.y;
        if (list.size() == uIBlockTopshelf2.y.size()) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f((TopshelfItem) obj, uIBlockTopshelf2.y.get(i))) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final boolean Bb(Object obj) {
        if (!super.Bb(obj) || !(obj instanceof UIBlockTopshelf)) {
            return false;
        }
        UIBlockTopshelf uIBlockTopshelf = (UIBlockTopshelf) obj;
        uIBlockTopshelf.getClass();
        return Pb(this, uIBlockTopshelf);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_RDSGN_TOPSHELF;
        videoFeatures.getClass();
        return com.vk.toggle.b.A.a(videoFeatures) ? this.b : UUID.randomUUID().toString();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(null);
        serializer.W(this.y);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockTopshelf) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockTopshelf uIBlockTopshelf = (UIBlockTopshelf) obj;
        uIBlockTopshelf.getClass();
        return Pb(this, uIBlockTopshelf);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), null, this.y);
    }

    @Override // xsna.d1a
    public final VideoFile m7() {
        return null;
    }

    @Override // xsna.dfp0
    public final String r() {
        return null;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "Topshelf[null]";
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        CatalogViewStyle catalogViewStyle = this.l;
        CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
        List<TopshelfItem> list = this.y;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((TopshelfItem) it2.next()).d());
        }
        return new UIBlockTopshelf(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, copy, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockTopshelf(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, CatalogViewStyle catalogViewStyle, List<? extends TopshelfItem> list2) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, null, null, null, null, null, 32000, null);
        this.y = list2;
    }

    public UIBlockTopshelf(Serializer serializer) {
        super(serializer);
        List<TopshelfItem> O0;
        ArrayList k = serializer.k(TopshelfItem.class);
        this.y = (k == null || (O0 = j5g.O0(k)) == null) ? EmptyList.b : O0;
    }
}
