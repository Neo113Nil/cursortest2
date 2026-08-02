package com.vk.clips.sdk.shared.api.routing.models;

import android.os.Parcel;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationPaginationKey;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.asp;
import xsna.bh10;
import xsna.cjl0;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.iq;
import xsna.jgp;
import xsna.qoy;
import xsna.ur;
import xsna.urd0;
import xsna.wp50;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ClipFeedTab.kt */
/* loaded from: classes17.dex */
public abstract class ClipFeedTab extends Serializer.StreamParcelableAdapter {

    /* compiled from: ClipFeedTab.kt */
    public static abstract class CatalogClip<T extends ClipFeedTab> extends ClipFeedTab {
        public static final Serializer.c<CatalogClip<? extends ClipFeedTab>> CREATOR = new b();
        public final String b;
        public final Type c;
        public final T d;

        /* compiled from: ClipFeedTab.kt */
        public static final class CompilationCatalogClip extends CatalogClip<Compilation> {
            public final String e;
            public final Compilation f;

            public CompilationCatalogClip(String str, Compilation compilation) {
                super(str, Type.COMPILATION, compilation, null);
                this.e = str;
                this.f = compilation;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final Compilation Fb() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CompilationCatalogClip)) {
                    return false;
                }
                CompilationCatalogClip compilationCatalogClip = (CompilationCatalogClip) obj;
                return epx.f(this.e, compilationCatalogClip.e) && epx.f(this.f, compilationCatalogClip.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + (this.e.hashCode() * 31);
            }

            public final String toString() {
                return "CompilationCatalogClip(blockId=" + this.e + ", baseTab=" + this.f + ')';
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final String w() {
                return this.e;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class HashtagCatalogClip extends CatalogClip<Hashtag> {
            public final String e;
            public final Hashtag f;

            public HashtagCatalogClip(String str, Hashtag hashtag) {
                super(str, Type.HASHTAG, hashtag, null);
                this.e = str;
                this.f = hashtag;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final Hashtag Fb() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HashtagCatalogClip)) {
                    return false;
                }
                HashtagCatalogClip hashtagCatalogClip = (HashtagCatalogClip) obj;
                return epx.f(this.e, hashtagCatalogClip.e) && epx.f(this.f, hashtagCatalogClip.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + (this.e.hashCode() * 31);
            }

            public final String toString() {
                return "HashtagCatalogClip(blockId=" + this.e + ", baseTab=" + this.f + ')';
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final String w() {
                return this.e;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class MaskCatalogClip extends CatalogClip<Mask> {
            public final String e;
            public final Mask f;

            public MaskCatalogClip(String str, Mask mask) {
                super(str, Type.MASK, mask, null);
                this.e = str;
                this.f = mask;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final Mask Fb() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MaskCatalogClip)) {
                    return false;
                }
                MaskCatalogClip maskCatalogClip = (MaskCatalogClip) obj;
                return epx.f(this.e, maskCatalogClip.e) && epx.f(this.f, maskCatalogClip.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + (this.e.hashCode() * 31);
            }

            public final String toString() {
                return "MaskCatalogClip(blockId=" + this.e + ", baseTab=" + this.f + ')';
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final String w() {
                return this.e;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class MusicCatalogClip extends CatalogClip<Music> {
            public final String e;
            public final Music f;

            public MusicCatalogClip(String str, Music music) {
                super(str, Type.MUSIC, music, null);
                this.e = str;
                this.f = music;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final Music Fb() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MusicCatalogClip)) {
                    return false;
                }
                MusicCatalogClip musicCatalogClip = (MusicCatalogClip) obj;
                return epx.f(this.e, musicCatalogClip.e) && epx.f(this.f, musicCatalogClip.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + (this.e.hashCode() * 31);
            }

            public final String toString() {
                return "MusicCatalogClip(blockId=" + this.e + ", baseTab=" + this.f + ')';
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final String w() {
                return this.e;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class MusicTemplateCatalogClip extends CatalogClip<MusicTemplate> {
            public final String e;
            public final MusicTemplate f;

            public MusicTemplateCatalogClip(String str, MusicTemplate musicTemplate) {
                super(str, Type.MUSIC_TEMPLATE, musicTemplate, null);
                this.e = str;
                this.f = musicTemplate;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final MusicTemplate Fb() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MusicTemplateCatalogClip)) {
                    return false;
                }
                MusicTemplateCatalogClip musicTemplateCatalogClip = (MusicTemplateCatalogClip) obj;
                return epx.f(this.e, musicTemplateCatalogClip.e) && epx.f(this.f, musicTemplateCatalogClip.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + (this.e.hashCode() * 31);
            }

            public final String toString() {
                return "MusicTemplateCatalogClip(blockId=" + this.e + ", baseTab=" + this.f + ')';
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final String w() {
                return this.e;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class ProfileCatalogClip extends CatalogClip<Profile> {
            public final String e;
            public final Profile f;

            public ProfileCatalogClip(String str, Profile profile) {
                super(str, Type.PROFILE, profile, null);
                this.e = str;
                this.f = profile;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final Profile Fb() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ProfileCatalogClip)) {
                    return false;
                }
                ProfileCatalogClip profileCatalogClip = (ProfileCatalogClip) obj;
                return epx.f(this.e, profileCatalogClip.e) && epx.f(this.f, profileCatalogClip.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + (this.e.hashCode() * 31);
            }

            public final String toString() {
                return "ProfileCatalogClip(blockId=" + this.e + ", baseTab=" + this.f + ')';
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final String w() {
                return this.e;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class SearchCatalogClip extends CatalogClip<Search> {
            public final String e;
            public final Search f;

            public SearchCatalogClip(String str, Search search) {
                super(str, Type.SEARCH, search, null);
                this.e = str;
                this.f = search;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final Search Fb() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchCatalogClip)) {
                    return false;
                }
                SearchCatalogClip searchCatalogClip = (SearchCatalogClip) obj;
                return epx.f(this.e, searchCatalogClip.e) && epx.f(this.f, searchCatalogClip.f);
            }

            public final int hashCode() {
                return this.f.b.hashCode() + (this.e.hashCode() * 31);
            }

            public final String toString() {
                return "SearchCatalogClip(blockId=" + this.e + ", baseTab=" + this.f + ')';
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final String w() {
                return this.e;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class TrendingHashtagCatalogClip extends CatalogClip<Hashtag> {
            public final String e;
            public final Hashtag f;

            public TrendingHashtagCatalogClip(String str, Hashtag hashtag) {
                super(str, Type.TRENDING_HASHTAG, hashtag, null);
                this.e = str;
                this.f = hashtag;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final Hashtag Fb() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TrendingHashtagCatalogClip)) {
                    return false;
                }
                TrendingHashtagCatalogClip trendingHashtagCatalogClip = (TrendingHashtagCatalogClip) obj;
                return epx.f(this.e, trendingHashtagCatalogClip.e) && epx.f(this.f, trendingHashtagCatalogClip.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + (this.e.hashCode() * 31);
            }

            public final String toString() {
                return "TrendingHashtagCatalogClip(blockId=" + this.e + ", baseTab=" + this.f + ')';
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final String w() {
                return this.e;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class TrendingMusicCatalogClip extends CatalogClip<Music> {
            public final String e;
            public final Music f;

            public TrendingMusicCatalogClip(String str, Music music) {
                super(str, Type.TRENDING_MUSIC, music, null);
                this.e = str;
                this.f = music;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final Music Fb() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TrendingMusicCatalogClip)) {
                    return false;
                }
                TrendingMusicCatalogClip trendingMusicCatalogClip = (TrendingMusicCatalogClip) obj;
                return epx.f(this.e, trendingMusicCatalogClip.e) && epx.f(this.f, trendingMusicCatalogClip.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + (this.e.hashCode() * 31);
            }

            public final String toString() {
                return "TrendingMusicCatalogClip(blockId=" + this.e + ", baseTab=" + this.f + ')';
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final String w() {
                return this.e;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipFeedTab.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type COMPILATION;
            public static final a Companion;
            public static final Type HASHTAG;
            public static final Type MASK;
            public static final Type MUSIC;
            public static final Type MUSIC_TEMPLATE;
            public static final Type PROFILE;
            public static final Type SEARCH;
            public static final Type TRENDING_HASHTAG;
            public static final Type TRENDING_MUSIC;
            public static final Type UNKNOWN;
            private final String key;

            /* compiled from: ClipFeedTab.kt */
            public static final class a {
            }

            static {
                Type type = new Type("HASHTAG", 0, "hashtag");
                HASHTAG = type;
                Type type2 = new Type("TRENDING_HASHTAG", 1, "trending_hashtag");
                TRENDING_HASHTAG = type2;
                Type type3 = new Type("COMPILATION", 2, "compilation");
                COMPILATION = type3;
                Type type4 = new Type("MUSIC", 3, "music");
                MUSIC = type4;
                Type type5 = new Type("TRENDING_MUSIC", 4, "trending_music");
                TRENDING_MUSIC = type5;
                Type type6 = new Type("MASK", 5, "mask");
                MASK = type6;
                Type type7 = new Type("MUSIC_TEMPLATE", 6, "music_template");
                MUSIC_TEMPLATE = type7;
                Type type8 = new Type("SEARCH", 7, "search");
                SEARCH = type8;
                Type type9 = new Type("PROFILE", 8, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
                PROFILE = type9;
                Type type10 = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 9, "unknown");
                UNKNOWN = type10;
                Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
                Companion = new a();
            }

            public Type(String str, int i, String str2) {
                this.key = str2;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            public final String h() {
                return this.key;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class UnknownCatalogClip extends CatalogClip<SingleClip> {
            public final String e;
            public final SingleClip f;

            public UnknownCatalogClip(String str, SingleClip singleClip) {
                super(str, Type.UNKNOWN, singleClip, null);
                this.e = str;
                this.f = singleClip;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final SingleClip Fb() {
                return this.f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnknownCatalogClip)) {
                    return false;
                }
                UnknownCatalogClip unknownCatalogClip = (UnknownCatalogClip) obj;
                return epx.f(this.e, unknownCatalogClip.e) && epx.f(this.f, unknownCatalogClip.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + (this.e.hashCode() * 31);
            }

            public final String toString() {
                return "UnknownCatalogClip(blockId=" + this.e + ", baseTab=" + this.f + ')';
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.CatalogClip
            public final String w() {
                return this.e;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.HASHTAG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.TRENDING_HASHTAG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Type.COMPILATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Type.MUSIC.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Type.TRENDING_MUSIC.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Type.MASK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Type.SEARCH.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Type.MUSIC_TEMPLATE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Type.PROFILE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Type.UNKNOWN.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<CatalogClip<? extends ClipFeedTab>> {
            @Override // com.vk.core.serialize.Serializer.c
            public final CatalogClip<? extends ClipFeedTab> a(Serializer serializer) {
                Type type;
                Type.a aVar = Type.Companion;
                String H = serializer.H();
                aVar.getClass();
                Type[] values = Type.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        type = null;
                        break;
                    }
                    type = values[i];
                    if (epx.f(type.h(), H)) {
                        break;
                    }
                    i++;
                }
                if (type == null) {
                    throw new IllegalArgumentException("Unknown clips catalog type ".concat(H));
                }
                String H2 = serializer.H();
                switch (a.$EnumSwitchMapping$0[type.ordinal()]) {
                    case 1:
                        return new HashtagCatalogClip(H2, (Hashtag) serializer.G(Hashtag.class.getClassLoader()));
                    case 2:
                        return new TrendingHashtagCatalogClip(H2, (Hashtag) serializer.G(Hashtag.class.getClassLoader()));
                    case 3:
                        return new CompilationCatalogClip(H2, (Compilation) serializer.G(Compilation.class.getClassLoader()));
                    case 4:
                        return new MusicCatalogClip(H2, (Music) serializer.G(Music.class.getClassLoader()));
                    case 5:
                        return new TrendingMusicCatalogClip(H2, (Music) serializer.G(Music.class.getClassLoader()));
                    case 6:
                        return new MaskCatalogClip(H2, (Mask) serializer.G(Mask.class.getClassLoader()));
                    case 7:
                        return new SearchCatalogClip(H2, (Search) serializer.G(Search.class.getClassLoader()));
                    case 8:
                        return new MusicTemplateCatalogClip(H2, (MusicTemplate) serializer.G(MusicTemplate.class.getClassLoader()));
                    case 9:
                        return new ProfileCatalogClip(H2, (Profile) serializer.G(Profile.class.getClassLoader()));
                    case 10:
                        return new UnknownCatalogClip(H2, (SingleClip) serializer.G(SingleClip.class.getClassLoader()));
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CatalogClip[i];
            }
        }

        public CatalogClip() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CatalogClip(String str, Type type, ClipFeedTab clipFeedTab, zcl zclVar) {
            super(null);
            this.b = str;
            this.c = type;
            this.d = clipFeedTab;
        }

        public T Fb() {
            return this.d;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c.h());
            serializer.j0(w());
            serializer.i0(Fb());
        }

        public String w() {
            return this.b;
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static abstract class ClipsFromShopsSource extends ClipFeedTab {
        public final SourceType b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipFeedTab.kt */
        public static final class SourceType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ SourceType[] $VALUES;
            public static final SourceType DEEPLINK;
            public static final SourceType SHOPS_GRID_BLOCK;
            public static final SourceType SHOPS_MORE_BUTTON;
            public static final SourceType TAB;

            static {
                SourceType sourceType = new SourceType("DEEPLINK", 0);
                DEEPLINK = sourceType;
                SourceType sourceType2 = new SourceType("SHOPS_GRID_BLOCK", 1);
                SHOPS_GRID_BLOCK = sourceType2;
                SourceType sourceType3 = new SourceType("SHOPS_MORE_BUTTON", 2);
                SHOPS_MORE_BUTTON = sourceType3;
                SourceType sourceType4 = new SourceType("TAB", 3);
                TAB = sourceType4;
                SourceType[] sourceTypeArr = {sourceType, sourceType2, sourceType3, sourceType4};
                $VALUES = sourceTypeArr;
                $ENTRIES = new asp(sourceTypeArr);
            }

            public SourceType() {
                throw null;
            }

            public static SourceType valueOf(String str) {
                return (SourceType) Enum.valueOf(SourceType.class, str);
            }

            public static SourceType[] values() {
                return (SourceType[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class Top extends ClipsFromShopsSource implements WithPayload {
            public static final Serializer.c<Top> CREATOR = new a();
            public final SourceType c;
            public final WithPayload.Payload d;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Top> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Top a(Serializer serializer) {
                    SourceType sourceType = (SourceType) serializer.C();
                    if (sourceType == null) {
                        sourceType = SourceType.DEEPLINK;
                    }
                    return new Top(sourceType, (WithPayload.Payload) serializer.G(WithPayload.Payload.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Top[i];
                }
            }

            public /* synthetic */ Top(SourceType sourceType, WithPayload.Payload payload, int i, zcl zclVar) {
                this(sourceType, (i & 2) != 0 ? null : payload);
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.ClipsFromShopsSource
            public final SourceType Fb() {
                return this.c;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.g0(this.c);
                serializer.i0(this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Top)) {
                    return false;
                }
                Top top = (Top) obj;
                return this.c == top.c && epx.f(this.d, top.d);
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.WithPayload
            public final WithPayload.Payload getPayload() {
                return this.d;
            }

            public final int hashCode() {
                int hashCode = this.c.hashCode() * 31;
                WithPayload.Payload payload = this.d;
                return hashCode + (payload == null ? 0 : payload.b.hashCode());
            }

            public final String toString() {
                return "Top(sourceType=" + this.c + ", payload=" + this.d + ')';
            }

            public Top(SourceType sourceType, WithPayload.Payload payload) {
                super(sourceType, null);
                this.c = sourceType;
                this.d = payload;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class WithVideo extends ClipsFromShopsSource implements c {
            public static final Serializer.c<WithVideo> CREATOR = new a();
            public final SdkVideoFile c;
            public final SourceType d;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<WithVideo> {
                @Override // com.vk.core.serialize.Serializer.c
                public final WithVideo a(Serializer serializer) {
                    SdkVideoFile sdkVideoFile = (SdkVideoFile) serializer.G(SdkVideoFile.class.getClassLoader());
                    SourceType sourceType = (SourceType) serializer.C();
                    if (sourceType == null) {
                        sourceType = SourceType.DEEPLINK;
                    }
                    return new WithVideo(sdkVideoFile, sourceType);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithVideo[i];
                }
            }

            public WithVideo(SdkVideoFile sdkVideoFile, SourceType sourceType) {
                super(sourceType, null);
                this.c = sdkVideoFile;
                this.d = sourceType;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.c
            public final SdkVideoFile A() {
                return this.c;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.ClipsFromShopsSource
            public final SourceType Fb() {
                return this.d;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.i0(this.c);
                serializer.g0(this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WithVideo)) {
                    return false;
                }
                WithVideo withVideo = (WithVideo) obj;
                return epx.f(this.c, withVideo.c) && this.d == withVideo.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "WithVideo(videoFile=" + this.c + ", sourceType=" + this.d + ')';
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class WithVideoTrackCode extends ClipsFromShopsSource {
            public static final Serializer.c<WithVideoTrackCode> CREATOR = new a();
            public final String c;
            public final String d;
            public final SourceType e;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<WithVideoTrackCode> {
                @Override // com.vk.core.serialize.Serializer.c
                public final WithVideoTrackCode a(Serializer serializer) {
                    String H = serializer.H();
                    String H2 = serializer.H();
                    if (H2 == null) {
                        H2 = "";
                    }
                    SourceType sourceType = (SourceType) serializer.C();
                    if (sourceType == null) {
                        sourceType = SourceType.DEEPLINK;
                    }
                    return new WithVideoTrackCode(H, H2, sourceType);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WithVideoTrackCode[i];
                }
            }

            public WithVideoTrackCode(String str, String str2, SourceType sourceType) {
                super(sourceType, null);
                this.c = str;
                this.d = str2;
                this.e = sourceType;
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.ClipsFromShopsSource
            public final SourceType Fb() {
                return this.e;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.c);
                serializer.j0(this.d);
                serializer.g0(this.e);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WithVideoTrackCode)) {
                    return false;
                }
                WithVideoTrackCode withVideoTrackCode = (WithVideoTrackCode) obj;
                return epx.f(this.c, withVideoTrackCode.c) && epx.f(this.d, withVideoTrackCode.d) && this.e == withVideoTrackCode.e;
            }

            public final int hashCode() {
                String str = this.c;
                return this.e.hashCode() + urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d);
            }

            public final String toString() {
                return "WithVideoTrackCode(trackCode=" + this.c + ", videoId=" + this.d + ", sourceType=" + this.e + ')';
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SourceType.values().length];
                try {
                    iArr[SourceType.DEEPLINK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SourceType.SHOPS_GRID_BLOCK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SourceType.SHOPS_MORE_BUTTON.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SourceType.TAB.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public ClipsFromShopsSource(SourceType sourceType, zcl zclVar) {
            super(null);
            this.b = sourceType;
        }

        public SourceType Fb() {
            return this.b;
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static abstract class ClipsFromTrendsSource extends ClipFeedTab {
        public final SourceType b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipFeedTab.kt */
        public static final class SourceType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ SourceType[] $VALUES;
            public static final SourceType DEEPLINK;
            public static final SourceType TAB;

            static {
                SourceType sourceType = new SourceType("DEEPLINK", 0);
                DEEPLINK = sourceType;
                SourceType sourceType2 = new SourceType("TAB", 1);
                TAB = sourceType2;
                SourceType[] sourceTypeArr = {sourceType, sourceType2};
                $VALUES = sourceTypeArr;
                $ENTRIES = new asp(sourceTypeArr);
            }

            public SourceType() {
                throw null;
            }

            public static SourceType valueOf(String str) {
                return (SourceType) Enum.valueOf(SourceType.class, str);
            }

            public static SourceType[] values() {
                return (SourceType[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class Top extends ClipsFromTrendsSource implements WithPayload {
            public static final Serializer.c<Top> CREATOR = new a();
            public final SourceType c;
            public final WithPayload.Payload d;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Top> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Top a(Serializer serializer) {
                    SourceType sourceType = (SourceType) serializer.C();
                    if (sourceType == null) {
                        sourceType = SourceType.DEEPLINK;
                    }
                    return new Top(sourceType, (WithPayload.Payload) serializer.G(WithPayload.Payload.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Top[i];
                }
            }

            public /* synthetic */ Top(SourceType sourceType, WithPayload.Payload payload, int i, zcl zclVar) {
                this(sourceType, (i & 2) != 0 ? null : payload);
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.ClipsFromTrendsSource
            public final SourceType Fb() {
                return this.c;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.g0(this.c);
                serializer.i0(this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Top)) {
                    return false;
                }
                Top top = (Top) obj;
                return this.c == top.c && epx.f(this.d, top.d);
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.WithPayload
            public final WithPayload.Payload getPayload() {
                return this.d;
            }

            public final int hashCode() {
                int hashCode = this.c.hashCode() * 31;
                WithPayload.Payload payload = this.d;
                return hashCode + (payload == null ? 0 : payload.b.hashCode());
            }

            public final String toString() {
                return "Top(sourceType=" + this.c + ", payload=" + this.d + ')';
            }

            public Top(SourceType sourceType, WithPayload.Payload payload) {
                super(sourceType, null);
                this.c = sourceType;
                this.d = payload;
            }
        }

        public ClipsFromTrendsSource(SourceType sourceType, zcl zclVar) {
            super(null);
            this.b = sourceType;
        }

        public SourceType Fb() {
            return this.b;
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class CoauthorInvitations extends ClipFeedTab {
        public static final Serializer.c<CoauthorInvitations> CREATOR = new a();
        public final UserId b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<CoauthorInvitations> {
            @Override // com.vk.core.serialize.Serializer.c
            public final CoauthorInvitations a(Serializer serializer) {
                return new CoauthorInvitations(new UserId(serializer.w()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoauthorInvitations[i];
            }
        }

        public CoauthorInvitations(UserId userId) {
            super(null);
            this.b = userId;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.Y(this.b.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CoauthorInvitations) && epx.f(this.b, ((CoauthorInvitations) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("CoauthorInvitations(forUserId="), this.b, ')');
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class Compilation extends ClipFeedTab {
        public static final Serializer.c<Compilation> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Compilation> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Compilation a(Serializer serializer) {
                return new Compilation(serializer.H(), serializer.H(), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Compilation[i];
            }
        }

        public /* synthetic */ Compilation(String str, String str2, String str3, String str4, int i, zcl zclVar) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Compilation)) {
                return false;
            }
            Compilation compilation = (Compilation) obj;
            return epx.f(this.b, compilation.b) && epx.f(this.c, compilation.c) && epx.f(this.d, compilation.d) && epx.f(this.e, compilation.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Compilation(id=");
            sb.append(this.b);
            sb.append(", icon=");
            sb.append(this.c);
            sb.append(", name=");
            sb.append(this.d);
            sb.append(", customRequestRef=");
            return ho8.a(sb, this.e, ')');
        }

        public Compilation(String str, String str2, String str3, String str4) {
            super(null);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class FavoriteFolder extends ClipFeedTab {
        public static final Serializer.c<FavoriteFolder> CREATOR = new a();
        public final FavoriteFolderId b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<FavoriteFolder> {
            @Override // com.vk.core.serialize.Serializer.c
            public final FavoriteFolder a(Serializer serializer) {
                return new FavoriteFolder((FavoriteFolderId) serializer.A(FavoriteFolderId.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FavoriteFolder[i];
            }
        }

        public FavoriteFolder(FavoriteFolderId favoriteFolderId) {
            super(null);
            this.b = favoriteFolderId;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FavoriteFolder) && epx.f(this.b, ((FavoriteFolder) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FavoriteFolder(folderId=" + this.b + ')';
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class Hashtag extends ClipFeedTab {
        public static final Serializer.c<Hashtag> CREATOR = new a();
        public final String b;
        public final boolean c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Hashtag> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Hashtag a(Serializer serializer) {
                return new Hashtag(serializer.H(), serializer.m(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hashtag[i];
            }
        }

        public /* synthetic */ Hashtag(String str, boolean z, String str2, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.L(this.c ? (byte) 1 : (byte) 0);
            serializer.j0(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Hashtag)) {
                return false;
            }
            Hashtag hashtag = (Hashtag) obj;
            return epx.f(this.b, hashtag.b) && this.c == hashtag.c && epx.f(this.d, hashtag.d);
        }

        public final int hashCode() {
            int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Hashtag(tag=");
            sb.append(this.b);
            sb.append(", isTrend=");
            sb.append(this.c);
            sb.append(", customRequestRef=");
            return ho8.a(sb, this.d, ')');
        }

        public Hashtag(String str, boolean z, String str2) {
            super(null);
            this.b = str;
            this.c = z;
            this.d = str2;
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class Mask extends ClipFeedTab {
        public static final Serializer.c<Mask> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Mask> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Mask a(Serializer serializer) {
                return new Mask(serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Mask[i];
            }
        }

        public Mask(String str, String str2) {
            super(null);
            this.b = str;
            this.c = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mask)) {
                return false;
            }
            Mask mask = (Mask) obj;
            return epx.f(this.b, mask.b) && epx.f(this.c, mask.c);
        }

        public final int hashCode() {
            String str = this.b;
            return this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Mask(name=");
            sb.append(this.b);
            sb.append(", id=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class Music extends ClipFeedTab {
        public static final Serializer.c<Music> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Music> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Music a(Serializer serializer) {
                return new Music(serializer.H(), serializer.H(), serializer.H(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Music[i];
            }
        }

        public Music(String str, String str2, String str3, boolean z) {
            super(null);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.L(this.e ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Music)) {
                return false;
            }
            Music music = (Music) obj;
            return epx.f(this.b, music.b) && epx.f(this.c, music.c) && epx.f(this.d, music.d) && this.e == music.e;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            return Boolean.hashCode(this.e) + urd0.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Music(name=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", id=");
            sb.append(this.d);
            sb.append(", isTrend=");
            return q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class MusicTemplate extends ClipFeedTab {
        public static final Serializer.c<MusicTemplate> CREATOR = new b();
        public final String b;
        public final String c;
        public final IdType d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipFeedTab.kt */
        public static final class IdType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ IdType[] $VALUES;
            public static final IdType AudioId;
            public static final IdType ClipId;
            private final String key;

            static {
                IdType idType = new IdType("AudioId", 0, "audio_id");
                AudioId = idType;
                IdType idType2 = new IdType("ClipId", 1, "clip_id");
                ClipId = idType2;
                IdType[] idTypeArr = {idType, idType2};
                $VALUES = idTypeArr;
                $ENTRIES = new asp(idTypeArr);
            }

            public IdType(String str, int i, String str2) {
                this.key = str2;
            }

            public static IdType valueOf(String str) {
                return (IdType) Enum.valueOf(IdType.class, str);
            }

            public static IdType[] values() {
                return (IdType[]) $VALUES.clone();
            }

            public final String h() {
                return this.key;
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class a {
            public static MusicTemplate a(String str) {
                Serializer.c<MusicTemplate> cVar = MusicTemplate.CREATOR;
                return new MusicTemplate(str, null, IdType.AudioId);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<MusicTemplate> {
            @Override // com.vk.core.serialize.Serializer.c
            public final MusicTemplate a(Serializer serializer) {
                String H = serializer.H();
                String H2 = serializer.H();
                String H3 = serializer.H();
                for (IdType idType : IdType.values()) {
                    if (epx.f(idType.h(), H3)) {
                        return new MusicTemplate(H, H2, idType);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MusicTemplate[i];
            }
        }

        public MusicTemplate(String str, String str2, IdType idType) {
            super(null);
            this.b = str;
            this.c = str2;
            this.d = idType;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d.h());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicTemplate)) {
                return false;
            }
            MusicTemplate musicTemplate = (MusicTemplate) obj;
            return epx.f(this.b, musicTemplate.b) && epx.f(this.c, musicTemplate.c) && this.d == musicTemplate.d;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "MusicTemplate(id=" + this.b + ", hashTag=" + this.c + ", idType=" + this.d + ')';
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class MyClips extends ClipFeedTab {
        public static final Serializer.c<MyClips> CREATOR = new a();
        public final UserId b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<MyClips> {
            @Override // com.vk.core.serialize.Serializer.c
            public final MyClips a(Serializer serializer) {
                return new MyClips((UserId) serializer.A(UserId.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MyClips[i];
            }
        }

        public MyClips(UserId userId) {
            super(null);
            this.b = userId;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MyClips) && epx.f(this.b, ((MyClips) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("MyClips(id="), this.b, ')');
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class NewsfeedDiscoverMedia extends ClipFeedTab implements c, WithPayload {
        public static final Serializer.c<NewsfeedDiscoverMedia> CREATOR = new a();
        public final SdkVideoFile b;
        public final String c;
        public final String d;
        public final boolean e;
        public final WithPayload.Payload f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<NewsfeedDiscoverMedia> {
            @Override // com.vk.core.serialize.Serializer.c
            public final NewsfeedDiscoverMedia a(Serializer serializer) {
                return new NewsfeedDiscoverMedia((SdkVideoFile) serializer.G(SdkVideoFile.class.getClassLoader()), serializer.H(), serializer.H(), false, (WithPayload.Payload) serializer.G(WithPayload.Payload.class.getClassLoader()), 8, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewsfeedDiscoverMedia[i];
            }
        }

        public /* synthetic */ NewsfeedDiscoverMedia(SdkVideoFile sdkVideoFile, String str, String str2, boolean z, WithPayload.Payload payload, int i, zcl zclVar) {
            this(sdkVideoFile, str, str2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : payload);
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.c
        public final SdkVideoFile A() {
            return this.b;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.i0(this.f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedDiscoverMedia)) {
                return false;
            }
            NewsfeedDiscoverMedia newsfeedDiscoverMedia = (NewsfeedDiscoverMedia) obj;
            return epx.f(this.b, newsfeedDiscoverMedia.b) && epx.f(this.c, newsfeedDiscoverMedia.c) && epx.f(this.d, newsfeedDiscoverMedia.d) && this.e == newsfeedDiscoverMedia.e && epx.f(this.f, newsfeedDiscoverMedia.f);
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.WithPayload
        public final WithPayload.Payload getPayload() {
            return this.f;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int b = qoy.b(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
            WithPayload.Payload payload = this.f;
            return b + (payload != null ? payload.b.hashCode() : 0);
        }

        public final String toString() {
            return "NewsfeedDiscoverMedia(videoFile=" + this.b + ", title=" + this.c + ", requestRef=" + this.d + ", update=" + this.e + ", payload=" + this.f + ')';
        }

        public NewsfeedDiscoverMedia(SdkVideoFile sdkVideoFile, String str, String str2, boolean z, WithPayload.Payload payload) {
            super(null);
            this.b = sdkVideoFile;
            this.c = str;
            this.d = str2;
            this.e = z;
            this.f = payload;
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class Place extends ClipFeedTab {
        public static final Serializer.c<Place> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Place> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Place a(Serializer serializer) {
                return new Place(serializer.u(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Place[i];
            }
        }

        public Place(int i, String str) {
            super(null);
            this.b = i;
            this.c = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Place)) {
                return false;
            }
            Place place = (Place) obj;
            return this.b == place.b && epx.f(this.c, place.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Place(placeId=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static abstract class Playlist extends ClipFeedTab {

        /* compiled from: ClipFeedTab.kt */
        public static final class FromBeginning extends Playlist {
            public static final Serializer.c<FromBeginning> CREATOR = new a();
            public final ClipsPlaylist b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<FromBeginning> {
                @Override // com.vk.core.serialize.Serializer.c
                public final FromBeginning a(Serializer serializer) {
                    return new FromBeginning((ClipsPlaylist) serializer.G(ClipsPlaylist.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FromBeginning[i];
                }
            }

            public FromBeginning(ClipsPlaylist clipsPlaylist) {
                super(null);
                this.b = clipsPlaylist;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.i0(this.b);
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.Playlist
            public final ClipsPlaylist Z0() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FromBeginning) && epx.f(this.b, ((FromBeginning) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "FromBeginning(playlist=" + this.b + ')';
            }
        }

        /* compiled from: ClipFeedTab.kt */
        public static final class FromMiddle extends Playlist {
            public static final Serializer.c<FromMiddle> CREATOR = new a();
            public final ClipsPlaylist b;
            public final String c;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<FromMiddle> {
                @Override // com.vk.core.serialize.Serializer.c
                public final FromMiddle a(Serializer serializer) {
                    return new FromMiddle((ClipsPlaylist) serializer.G(ClipsPlaylist.class.getClassLoader()), serializer.H());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FromMiddle[i];
                }
            }

            public FromMiddle(ClipsPlaylist clipsPlaylist, String str) {
                super(null);
                this.b = clipsPlaylist;
                this.c = str;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.i0(this.b);
                serializer.j0(this.c);
            }

            @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.Playlist
            public final ClipsPlaylist Z0() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FromMiddle)) {
                    return false;
                }
                FromMiddle fromMiddle = (FromMiddle) obj;
                return epx.f(this.b, fromMiddle.b) && epx.f(this.c, fromMiddle.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FromMiddle(playlist=");
                sb.append(this.b);
                sb.append(", fromVideoId=");
                return ho8.a(sb, this.c, ')');
            }
        }

        public /* synthetic */ Playlist(zcl zclVar) {
            this();
        }

        public abstract ClipsPlaylist Z0();

        public Playlist() {
            super(null);
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class Profile extends ClipFeedTab implements b {
        public static final Serializer.c<Profile> CREATOR = new a();
        public final String b;
        public final UserId c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Profile> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Profile a(Serializer serializer) {
                return new Profile(serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Profile[i];
            }
        }

        public Profile(String str, UserId userId) {
            super(null);
            this.b = str;
            this.c = userId;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.e0(this.c);
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.b
        public final UserId Y9() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) obj;
            return epx.f(this.b, profile.b) && epx.f(this.c, profile.c);
        }

        public final int hashCode() {
            String str = this.b;
            return Long.hashCode(this.c.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Profile(name=");
            sb.append(this.b);
            sb.append(", id=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class ProfileLives extends ClipFeedTab {
        public static final Serializer.c<ProfileLives> CREATOR = new a();
        public final UserId b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ProfileLives> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ProfileLives a(Serializer serializer) {
                return new ProfileLives((UserId) serializer.A(UserId.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProfileLives[i];
            }
        }

        public ProfileLives(UserId userId) {
            super(null);
            this.b = userId;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfileLives) && epx.f(this.b, ((ProfileLives) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ProfileLives(id="), this.b, ')');
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class Search extends ClipFeedTab {
        public static final Serializer.c<Search> CREATOR = new a();
        public final String b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Search> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Search a(Serializer serializer) {
                return new Search(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Search[i];
            }
        }

        public Search(String str) {
            super(null);
            this.b = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Search) && epx.f(this.b, ((Search) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Search(blockId="), this.b, ')');
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class SingleAdv extends ClipFeedTab implements c {
        public static final Serializer.c<SingleAdv> CREATOR = new a();
        public final SdkVideoFile b;
        public final wp50 c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SingleAdv> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.vk.core.serialize.Serializer.c
            public final SingleAdv a(Serializer serializer) {
                return new SingleAdv((SdkVideoFile) serializer.G(SdkVideoFile.class.getClassLoader()), null, 2, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleAdv[i];
            }
        }

        public /* synthetic */ SingleAdv(SdkVideoFile sdkVideoFile, wp50 wp50Var, int i, zcl zclVar) {
            this(sdkVideoFile, (i & 2) != 0 ? null : wp50Var);
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.c
        public final SdkVideoFile A() {
            return this.b;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleAdv)) {
                return false;
            }
            SingleAdv singleAdv = (SingleAdv) obj;
            return epx.f(this.b, singleAdv.b) && epx.f(this.c, singleAdv.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            wp50 wp50Var = this.c;
            return hashCode + (wp50Var == null ? 0 : wp50Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SingleAdv(videoFile=");
            sb.append(this.b);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.c, ')');
        }

        public SingleAdv(SdkVideoFile sdkVideoFile, wp50 wp50Var) {
            super(null);
            this.b = sdkVideoFile;
            this.c = wp50Var;
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class SingleClip extends ClipFeedTab implements c, b, a, WithPayload {
        public static final Serializer.c<SingleClip> CREATOR = new a();
        public final SdkVideoFile b;
        public final String c;
        public final String d;
        public final boolean e;
        public final boolean f;
        public final UserId g;
        public final WithPayload.Payload h;
        public final Set<Object> i;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SingleClip> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SingleClip a(Serializer serializer) {
                return new SingleClip((SdkVideoFile) serializer.G(SdkVideoFile.class.getClassLoader()), serializer.H(), serializer.H(), false, serializer.m(), (UserId) serializer.A(UserId.class.getClassLoader()), (WithPayload.Payload) serializer.G(WithPayload.Payload.class.getClassLoader()), null, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleClip[i];
            }
        }

        public SingleClip(SdkVideoFile sdkVideoFile, String str, String str2, boolean z) {
            this(sdkVideoFile, str, str2, z, false, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.c
        public final SdkVideoFile A() {
            return this.b;
        }

        public final boolean Fb() {
            return this.f;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.L(this.f ? (byte) 1 : (byte) 0);
            serializer.e0(this.g);
            serializer.i0(this.h);
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.a
        public final Set<Object> R() {
            return this.i;
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.b
        public final UserId Y9() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleClip)) {
                return false;
            }
            SingleClip singleClip = (SingleClip) obj;
            return epx.f(this.b, singleClip.b) && epx.f(this.c, singleClip.c) && epx.f(this.d, singleClip.d) && this.e == singleClip.e && this.f == singleClip.f && epx.f(this.g, singleClip.g) && epx.f(this.h, singleClip.h) && epx.f(this.i, singleClip.i);
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.WithPayload
        public final WithPayload.Payload getPayload() {
            return this.h;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int b = qoy.b(qoy.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
            UserId userId = this.g;
            int hashCode3 = (b + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            WithPayload.Payload payload = this.h;
            return this.i.hashCode() + ((hashCode3 + (payload != null ? payload.b.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SingleClip(videoFile=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", requestRef=");
            sb.append(this.d);
            sb.append(", update=");
            sb.append(this.e);
            sb.append(", isFromNewsFeed=");
            sb.append(this.f);
            sb.append(", contextualUserId=");
            sb.append(this.g);
            sb.append(", payload=");
            sb.append(this.h);
            sb.append(", features=");
            return ur.c(sb, this.i, ')');
        }

        public SingleClip(SdkVideoFile sdkVideoFile, String str, String str2, boolean z, boolean z2, UserId userId, WithPayload.Payload payload, Set set, int i, zcl zclVar) {
            this(sdkVideoFile, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : userId, (i & 64) != 0 ? null : payload, (i & 128) != 0 ? EmptySet.b : set);
        }

        public SingleClip(SdkVideoFile sdkVideoFile, String str, String str2, boolean z, boolean z2, UserId userId, WithPayload.Payload payload, Set<Object> set) {
            super(null);
            this.b = sdkVideoFile;
            this.c = str;
            this.d = str2;
            this.e = z;
            this.f = z2;
            this.g = userId;
            this.h = payload;
            this.i = set;
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class SingleClipByVideoId extends ClipFeedTab {
        public static final Serializer.c<SingleClipByVideoId> CREATOR = new a();
        public final int b;
        public final UserId c;
        public final String d;
        public final String e;
        public final String f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SingleClipByVideoId> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SingleClipByVideoId a(Serializer serializer) {
                return new SingleClipByVideoId(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleClipByVideoId[i];
            }
        }

        public SingleClipByVideoId(int i, UserId userId, String str, String str2, String str3) {
            super(null);
            this.b = i;
            this.c = userId;
            this.d = str;
            this.e = str2;
            this.f = str3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.e0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.f);
            serializer.j0(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleClipByVideoId)) {
                return false;
            }
            SingleClipByVideoId singleClipByVideoId = (SingleClipByVideoId) obj;
            return this.b == singleClipByVideoId.b && epx.f(this.c, singleClipByVideoId.c) && epx.f(this.d, singleClipByVideoId.d) && epx.f(this.e, singleClipByVideoId.e) && epx.f(this.f, singleClipByVideoId.f);
        }

        public final int hashCode() {
            int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
            String str = this.d;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SingleClipByVideoId(videoId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", trackCode=");
            sb.append(this.e);
            sb.append(", requestRef=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class SingleClipFromBlock extends ClipFeedTab implements c {
        public static final Serializer.c<SingleClipFromBlock> CREATOR = new a();
        public final SdkVideoFile b;
        public final String c;
        public final SourceBlockType d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipFeedTab.kt */
        public static final class SourceBlockType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ SourceBlockType[] $VALUES;
            public static final SourceBlockType OZON;
            public static final SourceBlockType RECOMMENDATION;
            public static final SourceBlockType RETENTION;
            public static final SourceBlockType SHOPS;

            static {
                SourceBlockType sourceBlockType = new SourceBlockType("RETENTION", 0);
                RETENTION = sourceBlockType;
                SourceBlockType sourceBlockType2 = new SourceBlockType("RECOMMENDATION", 1);
                RECOMMENDATION = sourceBlockType2;
                SourceBlockType sourceBlockType3 = new SourceBlockType("OZON", 2);
                OZON = sourceBlockType3;
                SourceBlockType sourceBlockType4 = new SourceBlockType("SHOPS", 3);
                SHOPS = sourceBlockType4;
                SourceBlockType[] sourceBlockTypeArr = {sourceBlockType, sourceBlockType2, sourceBlockType3, sourceBlockType4};
                $VALUES = sourceBlockTypeArr;
                $ENTRIES = new asp(sourceBlockTypeArr);
            }

            public SourceBlockType() {
                throw null;
            }

            public static SourceBlockType valueOf(String str) {
                return (SourceBlockType) Enum.valueOf(SourceBlockType.class, str);
            }

            public static SourceBlockType[] values() {
                return (SourceBlockType[]) $VALUES.clone();
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SingleClipFromBlock> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SingleClipFromBlock a(Serializer serializer) {
                SdkVideoFile sdkVideoFile = (SdkVideoFile) serializer.G(SdkVideoFile.class.getClassLoader());
                String H = serializer.H();
                SourceBlockType sourceBlockType = (SourceBlockType) serializer.C();
                if (sourceBlockType == null) {
                    sourceBlockType = SourceBlockType.RETENTION;
                }
                return new SingleClipFromBlock(sdkVideoFile, H, sourceBlockType);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleClipFromBlock[i];
            }
        }

        public SingleClipFromBlock(SdkVideoFile sdkVideoFile, String str, SourceBlockType sourceBlockType) {
            super(null);
            this.b = sdkVideoFile;
            this.c = str;
            this.d = sourceBlockType;
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.c
        public final SdkVideoFile A() {
            return this.b;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.j0(this.c);
            serializer.g0(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleClipFromBlock)) {
                return false;
            }
            SingleClipFromBlock singleClipFromBlock = (SingleClipFromBlock) obj;
            return epx.f(this.b, singleClipFromBlock.b) && epx.f(this.c, singleClipFromBlock.c) && this.d == singleClipFromBlock.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "SingleClipFromBlock(videoFile=" + this.b + ", blockTrackCode=" + this.c + ", sourceBlockType=" + this.d + ')';
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class TopVideo extends ClipFeedTab implements a, WithPayload {
        public static final Serializer.c<TopVideo> CREATOR = new a();
        public final Mode b;
        public final String c;
        public final String d;
        public final String e;
        public final WithPayload.Payload f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipFeedTab.kt */
        public static final class Mode {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Mode[] $VALUES;
            public static final Mode DEFAULT;
            public static final Mode FROM_RETENTION_BLOCK;

            static {
                Mode mode = new Mode("DEFAULT", 0);
                DEFAULT = mode;
                Mode mode2 = new Mode("FROM_RETENTION_BLOCK", 1);
                FROM_RETENTION_BLOCK = mode2;
                Mode[] modeArr = {mode, mode2};
                $VALUES = modeArr;
                $ENTRIES = new asp(modeArr);
            }

            public Mode() {
                throw null;
            }

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) $VALUES.clone();
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<TopVideo> {
            @Override // com.vk.core.serialize.Serializer.c
            public final TopVideo a(Serializer serializer) {
                Mode mode = (Mode) serializer.C();
                if (mode == null) {
                    mode = Mode.DEFAULT;
                }
                return new TopVideo(mode, serializer.H(), serializer.H(), serializer.H(), (WithPayload.Payload) serializer.G(WithPayload.Payload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopVideo[i];
            }
        }

        public TopVideo() {
            this(null, null, null, null, null, 31, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.g0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.i0(this.f);
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.a
        public final Set<Object> R() {
            return Collections.singleton(com.vk.clips.sdk.shared.api.routing.models.a.a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopVideo)) {
                return false;
            }
            TopVideo topVideo = (TopVideo) obj;
            return this.b == topVideo.b && epx.f(this.c, topVideo.c) && epx.f(this.d, topVideo.d) && epx.f(this.e, topVideo.e) && epx.f(this.f, topVideo.f);
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.WithPayload
        public final WithPayload.Payload getPayload() {
            return this.f;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            WithPayload.Payload payload = this.f;
            return hashCode4 + (payload != null ? payload.b.hashCode() : 0);
        }

        public final String toString() {
            return "TopVideo(mode=" + this.b + ", customRequestRef=" + this.c + ", trackCode=" + this.d + ", productData=" + this.e + ", payload=" + this.f + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ TopVideo(com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.TopVideo.Mode r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.WithPayload.Payload r6, int r7, xsna.zcl r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab$TopVideo$Mode r2 = com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.TopVideo.Mode.DEFAULT
            L6:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Lc
                r3 = r0
            Lc:
                r8 = r7 & 4
                if (r8 == 0) goto L11
                r4 = r0
            L11:
                r8 = r7 & 8
                if (r8 == 0) goto L16
                r5 = r0
            L16:
                r7 = r7 & 16
                if (r7 == 0) goto L21
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L27
            L21:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L27:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.TopVideo.<init>(com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab$TopVideo$Mode, java.lang.String, java.lang.String, java.lang.String, com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab$WithPayload$Payload, int, xsna.zcl):void");
        }

        public TopVideo(Mode mode, String str, String str2, String str3, WithPayload.Payload payload) {
            super(null);
            this.b = mode;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = payload;
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public interface WithPayload {

        /* compiled from: ClipFeedTab.kt */
        public static final class Payload implements Serializer.StreamParcelable {
            public static final Serializer.c<Payload> CREATOR = new a();
            public final Map<String, String> b;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Payload> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Payload a(Serializer serializer) {
                    Map map;
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    try {
                        int u = serializer.u();
                        if (u >= 0) {
                            map = new LinkedHashMap();
                            for (int i = 0; i < u; i++) {
                                String H = serializer.H();
                                String H2 = serializer.H();
                                if (H != null && H2 != null) {
                                    map.put(H, H2);
                                }
                            }
                        } else {
                            map = jgp.b;
                        }
                        if (map.isEmpty()) {
                            map = null;
                        }
                        if (map != null) {
                            return new Payload(map);
                        }
                        return null;
                    } finally {
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Payload[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Payload() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                Map<String, String> map = this.b;
                if (map == null) {
                    serializer.S(-1);
                    return;
                }
                Iterator c = n.c(serializer, map);
                while (c.hasNext()) {
                    Map.Entry entry = (Map.Entry) c.next();
                    serializer.j0((String) entry.getKey());
                    serializer.j0((String) entry.getValue());
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Payload) && epx.f(this.b, ((Payload) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return cjl0.a(new StringBuilder("Payload(data="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this, parcel);
            }

            public Payload(Map<String, String> map) {
                this.b = map;
            }

            public /* synthetic */ Payload(Map map, int i, zcl zclVar) {
                this((i & 1) != 0 ? new HashMap() : map);
            }
        }

        Payload getPayload();
    }

    /* compiled from: ClipFeedTab.kt */
    public interface a {
        Set<Object> R();
    }

    /* compiled from: ClipFeedTab.kt */
    public interface b {
        UserId Y9();
    }

    /* compiled from: ClipFeedTab.kt */
    public interface c {
        SdkVideoFile A();
    }

    public /* synthetic */ ClipFeedTab(zcl zclVar) {
        this();
    }

    public static boolean Ab(ClipFeedTab clipFeedTab) {
        return clipFeedTab instanceof Hashtag ? ((Hashtag) clipFeedTab).c : clipFeedTab instanceof Music ? ((Music) clipFeedTab).e : clipFeedTab instanceof CatalogClip.TrendingHashtagCatalogClip ? ((CatalogClip.TrendingHashtagCatalogClip) clipFeedTab).f.c : clipFeedTab instanceof CatalogClip.TrendingMusicCatalogClip ? ((CatalogClip.TrendingMusicCatalogClip) clipFeedTab).f.e : clipFeedTab instanceof CatalogClip.HashtagCatalogClip ? ((CatalogClip.HashtagCatalogClip) clipFeedTab).f.c : clipFeedTab instanceof CatalogClip.MusicCatalogClip ? ((CatalogClip.MusicCatalogClip) clipFeedTab).f.e : (clipFeedTab instanceof SingleClipFromBlock) && ((SingleClipFromBlock) clipFeedTab).d == SingleClipFromBlock.SourceBlockType.RETENTION;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String Eb(ClipFeedTab clipFeedTab) {
        WithPayload.Payload payload;
        Map<String, String> map;
        WithPayload withPayload = clipFeedTab instanceof WithPayload ? (WithPayload) clipFeedTab : null;
        if (withPayload == null || (payload = withPayload.getPayload()) == null || (map = payload.b) == null) {
            return null;
        }
        return map.get("entry_service");
    }

    public final boolean Bb() {
        return ((this instanceof Discover) || (this instanceof MyClips) || (this instanceof MusicTemplate) || (this instanceof CatalogClip.TrendingHashtagCatalogClip) || (this instanceof CatalogClip.TrendingMusicCatalogClip) || (this instanceof CatalogClip.MusicTemplateCatalogClip)) ? false : true;
    }

    public final boolean Cb() {
        if ((this instanceof SingleClip) || (this instanceof SingleClipByVideoId) || (this instanceof SingleClipWithDecoration) || (this instanceof SingleClipFromBlock) || (this instanceof ClipsFromShopsSource) || (this instanceof ClipsFromTrendsSource) || (this instanceof TopVideo) || equals(UserSubscriptions.b) || (this instanceof NewsfeedDiscoverMedia) || (this instanceof Compilation)) {
            return true;
        }
        if ((this instanceof CatalogClip.CompilationCatalogClip) || (this instanceof CatalogClip.HashtagCatalogClip) || (this instanceof CatalogClip.TrendingHashtagCatalogClip) || (this instanceof CatalogClip.MaskCatalogClip) || (this instanceof CatalogClip.MusicCatalogClip) || (this instanceof CatalogClip.TrendingMusicCatalogClip) || (this instanceof CatalogClip.SearchCatalogClip) || (this instanceof CatalogClip.ProfileCatalogClip) || (this instanceof CatalogClip.UnknownCatalogClip) || (this instanceof Hashtag) || (this instanceof Mask) || (this instanceof Music) || (this instanceof Place) || (this instanceof CoauthorInvitations) || equals(Discover.b) || (this instanceof FavoriteFolder) || equals(LikedClips.b) || equals(LivesTop.b) || (this instanceof CatalogClip.MusicTemplateCatalogClip) || (this instanceof MusicTemplate) || (this instanceof MyClips) || (this instanceof NewsMonotheme) || (this instanceof Playlist.FromBeginning) || (this instanceof Playlist.FromMiddle) || (this instanceof Profile) || (this instanceof ProfileLives) || (this instanceof Search) || (this instanceof SingleAdv)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean Db() {
        boolean z = this instanceof SingleClipFromBlock;
        return (z && ((SingleClipFromBlock) this).d == SingleClipFromBlock.SourceBlockType.SHOPS) || (this instanceof ClipsFromShopsSource) || (z && ((SingleClipFromBlock) this).d == SingleClipFromBlock.SourceBlockType.OZON);
    }

    public final boolean zb() {
        if ((this instanceof TopVideo) || (this instanceof SingleClip) || (this instanceof SingleClipByVideoId) || (this instanceof SingleClipWithDecoration) || (this instanceof SingleClipFromBlock) || (this instanceof ClipsFromShopsSource) || (this instanceof ClipsFromTrendsSource) || (this instanceof Profile) || (this instanceof UserSubscriptions) || (this instanceof Search) || (this instanceof Hashtag) || (this instanceof Mask) || (this instanceof Music) || (this instanceof NewsfeedDiscoverMedia) || (this instanceof Compilation) || (this instanceof NewsMonotheme)) {
            return true;
        }
        if ((this instanceof CatalogClip.TrendingMusicCatalogClip) || (this instanceof CatalogClip.TrendingHashtagCatalogClip)) {
            return false;
        }
        if (this instanceof CatalogClip) {
            return ((CatalogClip) this).Fb().zb();
        }
        if ((this instanceof CoauthorInvitations) || (this instanceof Discover) || (this instanceof FavoriteFolder) || (this instanceof LikedClips) || (this instanceof LivesTop) || (this instanceof MusicTemplate) || (this instanceof MyClips) || (this instanceof Place) || (this instanceof Playlist.FromBeginning) || (this instanceof Playlist.FromMiddle) || (this instanceof ProfileLives) || (this instanceof SingleAdv)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class NewsMonotheme extends ClipFeedTab {
        public static final Serializer.c<NewsMonotheme> CREATOR = new a();
        public final String b;
        public final String c;
        public final SdkVideoFile d;
        public final String e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<NewsMonotheme> {
            @Override // com.vk.core.serialize.Serializer.c
            public final NewsMonotheme a(Serializer serializer) {
                return new NewsMonotheme(serializer.H(), serializer.H(), (SdkVideoFile) serializer.G(SdkVideoFile.class.getClassLoader()), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewsMonotheme[i];
            }
        }

        public /* synthetic */ NewsMonotheme(String str, String str2, SdkVideoFile sdkVideoFile, String str3, int i, zcl zclVar) {
            this(str, str2, (i & 4) != 0 ? null : sdkVideoFile, (i & 8) != 0 ? "clips_monotheme" : str3);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.i0(this.d);
            serializer.j0(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsMonotheme)) {
                return false;
            }
            NewsMonotheme newsMonotheme = (NewsMonotheme) obj;
            return epx.f(this.b, newsMonotheme.b) && epx.f(this.c, newsMonotheme.c) && epx.f(this.d, newsMonotheme.d) && epx.f(this.e, newsMonotheme.e);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
            SdkVideoFile sdkVideoFile = this.d;
            return this.e.hashCode() + ((a2 + (sdkVideoFile == null ? 0 : sdkVideoFile.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsMonotheme(monothemeObjectId=");
            sb.append(this.b);
            sb.append(", header=");
            sb.append(this.c);
            sb.append(", clipVideoFile=");
            sb.append(this.d);
            sb.append(", requestRef=");
            return ho8.a(sb, this.e, ')');
        }

        public NewsMonotheme(String str, String str2, SdkVideoFile sdkVideoFile, String str3) {
            super(null);
            this.b = str;
            this.c = str2;
            this.d = sdkVideoFile;
            this.e = str3;
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class SingleClipWithDecoration extends ClipFeedTab implements c {
        public static final Serializer.c<SingleClipWithDecoration> CREATOR = new a();
        public final SdkVideoFile b;
        public final String c;
        public final String d;
        public final ClipsDecorationKey e;
        public final ClipsFeedDecorationPayload f;
        public final ClipsDecorationPaginationKey g;
        public final ClipsDecorationPaginationKey h;
        public final FeedType i;
        public final String j;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipFeedTab.kt */
        public static final class FeedType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ FeedType[] $VALUES;
            public static final a Companion;
            public static final FeedType RecomOnly;
            public static final FeedType SingleClipWithRecom;

            /* compiled from: ClipFeedTab.kt */
            public static final class a {
            }

            static {
                FeedType feedType = new FeedType("SingleClipWithRecom", 0);
                SingleClipWithRecom = feedType;
                FeedType feedType2 = new FeedType("RecomOnly", 1);
                RecomOnly = feedType2;
                FeedType[] feedTypeArr = {feedType, feedType2};
                $VALUES = feedTypeArr;
                $ENTRIES = new asp(feedTypeArr);
                Companion = new a();
            }

            public FeedType() {
                throw null;
            }

            public static zrp<FeedType> h() {
                return $ENTRIES;
            }

            public static FeedType valueOf(String str) {
                return (FeedType) Enum.valueOf(FeedType.class, str);
            }

            public static FeedType[] values() {
                return (FeedType[]) $VALUES.clone();
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SingleClipWithDecoration> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SingleClipWithDecoration a(Serializer serializer) {
                FeedType feedType;
                Object obj;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) serializer.G(SdkVideoFile.class.getClassLoader());
                String H = serializer.H();
                String H2 = serializer.H();
                ClipsDecorationKey clipsDecorationKey = (ClipsDecorationKey) serializer.A(ClipsDecorationKey.class.getClassLoader());
                ClipsFeedDecorationPayload clipsFeedDecorationPayload = (ClipsFeedDecorationPayload) serializer.A(ClipsFeedDecorationPayload.class.getClassLoader());
                ClipsDecorationPaginationKey clipsDecorationPaginationKey = (ClipsDecorationPaginationKey) serializer.A(ClipsDecorationPaginationKey.class.getClassLoader());
                ClipsDecorationPaginationKey clipsDecorationPaginationKey2 = (ClipsDecorationPaginationKey) serializer.A(ClipsDecorationPaginationKey.class.getClassLoader());
                FeedType.a aVar = FeedType.Companion;
                String H3 = serializer.H();
                aVar.getClass();
                if (H3 != null) {
                    Iterator<E> it = FeedType.h().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (epx.f(((FeedType) obj).name(), H3)) {
                            break;
                        }
                    }
                    feedType = (FeedType) obj;
                    if (feedType == null) {
                        feedType = FeedType.SingleClipWithRecom;
                    }
                } else {
                    feedType = FeedType.SingleClipWithRecom;
                }
                return new SingleClipWithDecoration(sdkVideoFile, H, H2, clipsDecorationKey, clipsFeedDecorationPayload, clipsDecorationPaginationKey, clipsDecorationPaginationKey2, feedType, serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleClipWithDecoration[i];
            }
        }

        public /* synthetic */ SingleClipWithDecoration(SdkVideoFile sdkVideoFile, String str, String str2, ClipsDecorationKey clipsDecorationKey, ClipsFeedDecorationPayload clipsFeedDecorationPayload, ClipsDecorationPaginationKey clipsDecorationPaginationKey, ClipsDecorationPaginationKey clipsDecorationPaginationKey2, FeedType feedType, String str3, int i, zcl zclVar) {
            this(sdkVideoFile, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : clipsDecorationKey, (i & 16) != 0 ? null : clipsFeedDecorationPayload, (i & 32) != 0 ? null : clipsDecorationPaginationKey, (i & 64) != 0 ? null : clipsDecorationPaginationKey2, (i & 128) != 0 ? FeedType.SingleClipWithRecom : feedType, (i & 256) != 0 ? null : str3);
        }

        @Override // com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.c
        public final SdkVideoFile A() {
            return this.b;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.e0(this.e);
            serializer.e0(this.f);
            serializer.e0(this.g);
            serializer.e0(this.h);
            serializer.j0(this.i.name());
            serializer.j0(this.j);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleClipWithDecoration)) {
                return false;
            }
            SingleClipWithDecoration singleClipWithDecoration = (SingleClipWithDecoration) obj;
            return epx.f(this.b, singleClipWithDecoration.b) && epx.f(this.c, singleClipWithDecoration.c) && epx.f(this.d, singleClipWithDecoration.d) && epx.f(this.e, singleClipWithDecoration.e) && epx.f(this.f, singleClipWithDecoration.f) && epx.f(this.g, singleClipWithDecoration.g) && epx.f(this.h, singleClipWithDecoration.h) && this.i == singleClipWithDecoration.i && epx.f(this.j, singleClipWithDecoration.j);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ClipsDecorationKey clipsDecorationKey = this.e;
            int hashCode4 = (hashCode3 + (clipsDecorationKey == null ? 0 : clipsDecorationKey.hashCode())) * 31;
            ClipsFeedDecorationPayload clipsFeedDecorationPayload = this.f;
            int hashCode5 = (hashCode4 + (clipsFeedDecorationPayload == null ? 0 : clipsFeedDecorationPayload.hashCode())) * 31;
            ClipsDecorationPaginationKey clipsDecorationPaginationKey = this.g;
            int hashCode6 = (hashCode5 + (clipsDecorationPaginationKey == null ? 0 : clipsDecorationPaginationKey.hashCode())) * 31;
            ClipsDecorationPaginationKey clipsDecorationPaginationKey2 = this.h;
            int hashCode7 = (this.i.hashCode() + ((hashCode6 + (clipsDecorationPaginationKey2 == null ? 0 : clipsDecorationPaginationKey2.hashCode())) * 31)) * 31;
            String str3 = this.j;
            return hashCode7 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SingleClipWithDecoration(videoFile=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", requestRef=");
            sb.append(this.d);
            sb.append(", decorationKey=");
            sb.append(this.e);
            sb.append(", decorationPayload=");
            sb.append(this.f);
            sb.append(", decorationPaginationKeyForward=");
            sb.append(this.g);
            sb.append(", decorationPaginationKeyBackward=");
            sb.append(this.h);
            sb.append(", feedType=");
            sb.append(this.i);
            sb.append(", recomClipsContextPayload=");
            return ho8.a(sb, this.j, ')');
        }

        public SingleClipWithDecoration(SdkVideoFile sdkVideoFile, String str, String str2, ClipsDecorationKey clipsDecorationKey, ClipsFeedDecorationPayload clipsFeedDecorationPayload, ClipsDecorationPaginationKey clipsDecorationPaginationKey, ClipsDecorationPaginationKey clipsDecorationPaginationKey2, FeedType feedType, String str3) {
            super(null);
            this.b = sdkVideoFile;
            this.c = str;
            this.d = str2;
            this.e = clipsDecorationKey;
            this.f = clipsFeedDecorationPayload;
            this.g = clipsDecorationPaginationKey;
            this.h = clipsDecorationPaginationKey2;
            this.i = feedType;
            this.j = str3;
        }
    }

    public ClipFeedTab() {
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class Discover extends ClipFeedTab {
        public static final Discover b = new Discover();
        public static final Serializer.c<Discover> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Discover> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Discover a(Serializer serializer) {
                return Discover.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discover[i];
            }
        }

        public Discover() {
            super(null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class LikedClips extends ClipFeedTab {
        public static final LikedClips b = new LikedClips(null);
        public static final Serializer.c<LikedClips> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<LikedClips> {
            @Override // com.vk.core.serialize.Serializer.c
            public final LikedClips a(Serializer serializer) {
                return LikedClips.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LikedClips[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class LivesTop extends ClipFeedTab {
        public static final LivesTop b = new LivesTop(null);
        public static final Serializer.c<LivesTop> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<LivesTop> {
            @Override // com.vk.core.serialize.Serializer.c
            public final LivesTop a(Serializer serializer) {
                return LivesTop.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LivesTop[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: ClipFeedTab.kt */
    public static final class UserSubscriptions extends ClipFeedTab {
        public static final UserSubscriptions b = new UserSubscriptions();
        public static final Serializer.c<UserSubscriptions> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<UserSubscriptions> {
            @Override // com.vk.core.serialize.Serializer.c
            public final UserSubscriptions a(Serializer serializer) {
                return UserSubscriptions.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserSubscriptions[i];
            }
        }

        public UserSubscriptions() {
            super(null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
