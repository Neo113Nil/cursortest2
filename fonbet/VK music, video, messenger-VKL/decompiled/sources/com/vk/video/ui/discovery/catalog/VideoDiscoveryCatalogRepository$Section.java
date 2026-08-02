package com.vk.video.ui.discovery.catalog;

import com.vk.dto.uxpolls.UxPoll;
import com.vk.dto.video.Doc2DocItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: VideoDiscoveryCatalogRepository.kt */
/* loaded from: classes7.dex */
public final class VideoDiscoveryCatalogRepository$Section {
    public final String a;
    public final String b;
    public final String c;
    public final List<Doc2DocItem> d;
    public final SectionType e;
    public final boolean f;
    public final String g;
    public final List<UxPoll> h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDiscoveryCatalogRepository.kt */
    public static final class SectionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SectionType[] $VALUES;
        public static final SectionType Author;
        public static final a Companion;
        public static final SectionType ContinueWatch;
        public static final SectionType ForYou;
        public static final SectionType MusicMix;
        public static final SectionType Similar;
        private final String sourceBlock;

        /* compiled from: VideoDiscoveryCatalogRepository.kt */
        public static final class a {
            public static SectionType a(String str) {
                Object obj;
                Iterator<E> it = SectionType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (str.equals(((SectionType) obj).sourceBlock)) {
                        break;
                    }
                }
                return (SectionType) obj;
            }
        }

        static {
            SectionType sectionType = new SectionType("Similar", 0, "similar_videos");
            Similar = sectionType;
            SectionType sectionType2 = new SectionType("ForYou", 1, "video_for_you");
            ForYou = sectionType2;
            SectionType sectionType3 = new SectionType("Author", 2, "owner_videos");
            Author = sectionType3;
            SectionType sectionType4 = new SectionType("ContinueWatch", 3, "continue_watch");
            ContinueWatch = sectionType4;
            SectionType sectionType5 = new SectionType("MusicMix", 4, "music_mix");
            MusicMix = sectionType5;
            SectionType[] sectionTypeArr = {sectionType, sectionType2, sectionType3, sectionType4, sectionType5};
            $VALUES = sectionTypeArr;
            $ENTRIES = new asp(sectionTypeArr);
            Companion = new a();
        }

        public SectionType(String str, int i, String str2) {
            this.sourceBlock = str2;
        }

        public static zrp<SectionType> h() {
            return $ENTRIES;
        }

        public static SectionType valueOf(String str) {
            return (SectionType) Enum.valueOf(SectionType.class, str);
        }

        public static SectionType[] values() {
            return (SectionType[]) $VALUES.clone();
        }
    }

    public VideoDiscoveryCatalogRepository$Section(String str, String str2, String str3, ArrayList arrayList, boolean z, String str4, List list, int i) {
        this(str, str2, str3, arrayList, (SectionType) null, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str4, (List<UxPoll>) ((i & 128) != 0 ? EmptyList.b : list));
    }

    public static VideoDiscoveryCatalogRepository$Section a(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section, List list) {
        String str = videoDiscoveryCatalogRepository$Section.a;
        String str2 = videoDiscoveryCatalogRepository$Section.b;
        String str3 = videoDiscoveryCatalogRepository$Section.c;
        SectionType sectionType = videoDiscoveryCatalogRepository$Section.e;
        boolean z = videoDiscoveryCatalogRepository$Section.f;
        String str4 = videoDiscoveryCatalogRepository$Section.g;
        List<UxPoll> list2 = videoDiscoveryCatalogRepository$Section.h;
        videoDiscoveryCatalogRepository$Section.getClass();
        return new VideoDiscoveryCatalogRepository$Section(str, str2, str3, (List<? extends Doc2DocItem>) list, sectionType, z, str4, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDiscoveryCatalogRepository$Section)) {
            return false;
        }
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = (VideoDiscoveryCatalogRepository$Section) obj;
        return epx.f(this.a, videoDiscoveryCatalogRepository$Section.a) && epx.f(this.b, videoDiscoveryCatalogRepository$Section.b) && epx.f(this.c, videoDiscoveryCatalogRepository$Section.c) && epx.f(this.d, videoDiscoveryCatalogRepository$Section.d) && this.e == videoDiscoveryCatalogRepository$Section.e && this.f == videoDiscoveryCatalogRepository$Section.f && epx.f(this.g, videoDiscoveryCatalogRepository$Section.g) && epx.f(this.h, videoDiscoveryCatalogRepository$Section.h);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        List<Doc2DocItem> list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        SectionType sectionType = this.e;
        int b = qoy.b((hashCode2 + (sectionType == null ? 0 : sectionType.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        return this.h.hashCode() + ((b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Section(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", nextFrom=");
        sb.append(this.c);
        sb.append(", doc2DocItems=");
        sb.append(this.d);
        sb.append(", sectionType=");
        sb.append(this.e);
        sb.append(", canShowAdBanner=");
        sb.append(this.f);
        sb.append(", payload=");
        sb.append(this.g);
        sb.append(", polls=");
        return ms9.a(')', sb, this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoDiscoveryCatalogRepository$Section(String str, String str2, String str3, List<? extends Doc2DocItem> list, SectionType sectionType, boolean z, String str4, List<UxPoll> list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = sectionType;
        this.f = z;
        this.g = str4;
        this.h = list2;
    }
}
