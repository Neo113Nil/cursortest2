package com.vk.newsfeed.impl.data.network.dto.mappers;

import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppTypeDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonContextDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselItemDescriptionTypeDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselItemDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselObjectsTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedDzenCompilationDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedDzenCompilationInfoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedDzenCompilationInfoPopupDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedDzenStoryNewsBlockDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedDzenStoryNewsBlockItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedDzenTopStoriesBlockHeaderDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedDzenTopStoriesBlockHeaderInfoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedDzenTopStoryItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemDebugInfoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemDigestButtonDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemDigestFooterDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemDigestHeaderDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemDigestItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemPhotoPhotosDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemPhotoTagPhotoTagsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemPromoButtonActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemPromoButtonImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemCaptionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderImageDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.wall.dto.WallPostTypeDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionCloseWebApp;
import com.vk.dto.common.actions.ActionEmpty;
import com.vk.dto.common.actions.ActionEnableTopNews;
import com.vk.dto.common.actions.ActionOpenAdvUrl;
import com.vk.dto.common.actions.ActionOpenInternalVkUi;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.CarouselDescription;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.RecommendedMiniAppEntry;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.feed.core.models.DebugInfo;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.channels.ChannelsRecommendations;
import com.vk.feed.core.models.dzen.DzenFooter;
import com.vk.feed.core.models.dzen.DzenInfo;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenNewsItem;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.core.models.dzen.DzenTopStoriesHeader;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.info.InfoButton;
import com.vk.feed.core.models.info.InfoPopup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.feed.core.models.news.PromoButton;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.an60;
import xsna.bpn0;
import xsna.c5g;
import xsna.chx0;
import xsna.cn60;
import xsna.cqm0;
import xsna.en60;
import xsna.epx;
import xsna.f540;
import xsna.fn60;
import xsna.hn60;
import xsna.im60;
import xsna.kn60;
import xsna.ln60;
import xsna.mn60;
import xsna.ne6;
import xsna.nn60;
import xsna.oym;
import xsna.p4g;
import xsna.pax0;
import xsna.pm01;
import xsna.pwu;
import xsna.qh60;
import xsna.qz2;
import xsna.re3;
import xsna.rh60;
import xsna.s1n;
import xsna.sd9;
import xsna.sh60;
import xsna.skd;
import xsna.sv1;
import xsna.th60;
import xsna.tm60;
import xsna.um60;
import xsna.ut60;
import xsna.vm60;
import xsna.x550;
import xsna.xa4;
import xsna.xfa0;
import xsna.zm60;

/* compiled from: NewsfeedItemMapper.kt */
/* loaded from: classes4.dex */
public final class NewsfeedItemMapper {
    public final mn60 a;
    public final xa4 b;
    public final tm60 c;
    public final ut60 d;
    public final im60 e;
    public final cn60 f;
    public final fn60 g;
    public final ln60 h;
    public final en60 i;
    public final kn60 j;
    public final th60 k;
    public final qh60 l;

    /* compiled from: NewsfeedItemMapper.kt */
    public static final class CodeGenStub extends NewsEntry {
        public static final Serializer.c<CodeGenStub> CREATOR = new a();
        public final String i;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<CodeGenStub> {
            @Override // com.vk.core.serialize.Serializer.c
            public final CodeGenStub a(Serializer serializer) {
                return new CodeGenStub(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CodeGenStub[i];
            }
        }

        public CodeGenStub(String str) {
            this.i = str;
        }

        @Override // com.vk.feed.core.models.news.NewsEntry
        public final String Db() {
            String str = this.i;
            return str == null ? "null" : str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.i);
        }

        @Override // com.vk.feed.core.models.news.NewsEntry
        public final int zb() {
            return -1;
        }
    }

    public NewsfeedItemMapper(bpn0 bpn0Var) {
        hn60 hn60Var = new hn60();
        bpn0 bpn0Var2 = new bpn0(new f540(bpn0Var, 5));
        pm01 pm01Var = new pm01(new bpn0(new x550(bpn0Var, 5)));
        sv1 sv1Var = new sv1(17);
        mn60 mn60Var = new mn60();
        this.a = mn60Var;
        this.b = new xa4(17);
        this.c = new tm60(bpn0Var2, sv1Var, mn60Var);
        this.d = new ut60(bpn0Var2, sv1Var, this, hn60Var);
        this.e = new im60(sv1Var);
        this.f = new cn60(sv1Var);
        this.g = new fn60();
        this.h = new ln60(sv1Var, pm01Var);
        this.i = new en60();
        this.j = new kn60(sv1Var, pm01Var);
        sd9 sd9Var = new sd9();
        sh60 sh60Var = new sh60();
        um60 um60Var = new um60();
        rh60 rh60Var = new rh60();
        this.k = new th60(sv1Var, sd9Var, sh60Var, um60Var, rh60Var);
        this.l = new qh60(sv1Var, um60Var, rh60Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x031e, code lost:
    
        if (r12.equals("games_carousel") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0329, code lost:
    
        r5 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0327, code lost:
    
        if (r12.equals("mini_apps_carousel") != false) goto L135;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v52, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v54, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NewsEntry a(NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto, LinkedHashMap linkedHashMap) {
        ArrayList arrayList;
        String e;
        Image image;
        Action action;
        Action actionEmpty;
        Action action2;
        String str;
        ActionOpenUrl.Target target;
        ActionOpenUrl.Target target2;
        List<PhotosPhotoDto> list;
        DebugInfo debugInfo;
        Integer d;
        List<PhotosPhotoDto> list2;
        DebugInfo debugInfo2;
        Integer d2;
        String str2;
        Digest.Header header;
        Digest.Footer footer;
        List list3;
        Object obj;
        Object obj2;
        Object obj3;
        Attachment attachment;
        String str3;
        LinkButton linkButton;
        Digest.Button button;
        LinkButton linkButton2;
        int i;
        s1n s1nVar;
        ApiApplication apiApplication;
        Object obj4;
        DzenTopStoriesHeader.DzenImage dzenImage;
        DzenFooter dzenFooter;
        NewsfeedDzenCompilationInfoPopupDto d3;
        ?? r15;
        ?? r8;
        int i2 = 10;
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedDzenStoryNewsBlockDto) {
            NewsfeedNewsfeedItemDto.NewsfeedDzenStoryNewsBlockDto newsfeedDzenStoryNewsBlockDto = (NewsfeedNewsfeedItemDto.NewsfeedDzenStoryNewsBlockDto) newsfeedNewsfeedItemDto;
            qh60 qh60Var = this.l;
            qh60Var.getClass();
            NewsfeedItemDigestHeaderDto f = newsfeedDzenStoryNewsBlockDto.f();
            DzenStory.Header header2 = new DzenStory.Header(f != null ? f.getTitle() : null, f != null ? f.g() : null);
            List<NewsfeedDzenStoryNewsBlockItemDto> g = newsfeedDzenStoryNewsBlockDto.g();
            if (g != null) {
                List<NewsfeedDzenStoryNewsBlockItemDto> list4 = g;
                r8 = new ArrayList(c5g.u(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    r8.add(qh60Var.a.a((NewsfeedDzenStoryNewsBlockItemDto) it.next(), linkedHashMap));
                }
            } else {
                r8 = EmptyList.b;
            }
            DzenStory dzenStory = new DzenStory(header2, r8, newsfeedDzenStoryNewsBlockDto.r());
            Boolean i3 = newsfeedDzenStoryNewsBlockDto.i();
            Boolean bool = Boolean.TRUE;
            dzenStory.c = epx.f(i3, bool);
            dzenStory.e = epx.f(newsfeedDzenStoryNewsBlockDto.k(), bool);
            NewsfeedItemWallpostFeedbackDto e2 = newsfeedDzenStoryNewsBlockDto.e();
            dzenStory.g = e2 != null ? nn60.a(e2) : null;
            NewsfeedItemDebugInfoDto d4 = newsfeedDzenStoryNewsBlockDto.d();
            dzenStory.h = d4 != null ? sv1.w(d4) : null;
            return dzenStory;
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedDzenTopStoriesBlockDto) {
            NewsfeedNewsfeedItemDto.NewsfeedDzenTopStoriesBlockDto newsfeedDzenTopStoriesBlockDto = (NewsfeedNewsfeedItemDto.NewsfeedDzenTopStoriesBlockDto) newsfeedNewsfeedItemDto;
            th60 th60Var = this.k;
            sd9 sd9Var = th60Var.a;
            NewsfeedDzenTopStoriesBlockHeaderDto g2 = newsfeedDzenTopStoriesBlockDto.g();
            NewsfeedNewsfeedItemHeaderImageDto e3 = g2.e();
            if (e3 != null) {
                List<PhotosPhotoSizesDto> g3 = e3.g();
                dzenImage = new DzenTopStoriesHeader.DzenImage(g3 != null ? qz2.a(g3) : null, e3.e(), e3.f());
            } else {
                dzenImage = null;
            }
            String title = g2.getTitle();
            String description = g2.getDescription();
            NewsfeedDzenTopStoriesBlockHeaderInfoDto f2 = g2.f();
            DzenInfo dzenInfo = f2 != null ? new DzenInfo(new InfoPopup(f2.d().f(), sd9.o(f2.d().e(), linkedHashMap), new InfoButton(f2.d().d().e()))) : null;
            Boolean d5 = g2.d();
            boolean booleanValue = d5 != null ? d5.booleanValue() : false;
            Boolean g4 = g2.g();
            DzenTopStoriesHeader dzenTopStoriesHeader = new DzenTopStoriesHeader(dzenImage, title, description, dzenInfo, booleanValue, g4 != null ? g4.booleanValue() : false);
            List<NewsfeedDzenTopStoryItemDto> i4 = newsfeedDzenTopStoriesBlockDto.i();
            ArrayList arrayList2 = new ArrayList(c5g.u(i4, 10));
            for (NewsfeedDzenTopStoryItemDto newsfeedDzenTopStoryItemDto : i4) {
                ImagePhoto o = sd9.o(newsfeedDzenTopStoryItemDto.f(), linkedHashMap);
                DzenNews.ItemHeader a = sh60.a(newsfeedDzenTopStoryItemDto.i());
                String e4 = newsfeedDzenTopStoryItemDto.e();
                NewsfeedDzenStoryNewsBlockDto g5 = newsfeedDzenTopStoryItemDto.g();
                NewsfeedItemDigestHeaderDto d6 = g5.d();
                DzenStory.Header header3 = new DzenStory.Header(d6 != null ? d6.getTitle() : null, d6 != null ? d6.g() : null);
                List<NewsfeedDzenStoryNewsBlockItemDto> e5 = g5.e();
                if (e5 != null) {
                    List<NewsfeedDzenStoryNewsBlockItemDto> list5 = e5;
                    r15 = new ArrayList(c5g.u(list5, i2));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        r15.add(th60Var.b.a((NewsfeedDzenStoryNewsBlockItemDto) it2.next(), linkedHashMap));
                    }
                } else {
                    r15 = EmptyList.b;
                }
                DzenStory dzenStory2 = new DzenStory(header3, r15, g5.r());
                String r = newsfeedDzenTopStoryItemDto.r();
                Integer d7 = newsfeedDzenTopStoryItemDto.d();
                arrayList2.add(new DzenNewsItem(o, a, e4, dzenStory2, r, d7 != null ? d7.intValue() : 0));
                i2 = 10;
            }
            int n = newsfeedDzenTopStoriesBlockDto.n();
            int k = newsfeedDzenTopStoriesBlockDto.k();
            String l = newsfeedDzenTopStoriesBlockDto.l();
            NewsfeedDzenCompilationDto e6 = newsfeedDzenTopStoriesBlockDto.e();
            if (e6 != null) {
                NewsfeedDzenCompilationInfoDto d8 = e6.d();
                dzenFooter = new DzenFooter(e6.getDescription(), (d8 == null || (d3 = d8.d()) == null) ? null : new InfoPopup(d3.f(), sd9.o(d3.e(), linkedHashMap), new InfoButton(d3.d().e())));
            } else {
                dzenFooter = null;
            }
            DzenNews dzenNews = new DzenNews(dzenTopStoriesHeader, arrayList2, n, k, l, dzenFooter, newsfeedDzenTopStoriesBlockDto.r());
            Boolean j = newsfeedDzenTopStoriesBlockDto.j();
            Boolean bool2 = Boolean.TRUE;
            dzenNews.c = epx.f(j, bool2);
            dzenNews.e = epx.f(newsfeedDzenTopStoriesBlockDto.p(), bool2);
            NewsfeedItemWallpostFeedbackDto f3 = newsfeedDzenTopStoriesBlockDto.f();
            dzenNews.g = f3 != null ? nn60.a(f3) : null;
            NewsfeedItemDebugInfoDto d9 = newsfeedDzenTopStoriesBlockDto.d();
            dzenNews.h = d9 != null ? sv1.w(d9) : null;
            return dzenNews;
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedInfoBlockDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedInfoBlockDto) newsfeedNewsfeedItemDto).d().i());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemAchievementGameBlockDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemAchievementGameBlockDto) newsfeedNewsfeedItemDto).d().i());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemAdsBlockDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemAdsBlockDto) newsfeedNewsfeedItemDto).d().i());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemAnimatedBlockDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemAnimatedBlockDto) newsfeedNewsfeedItemDto).d().i());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemAppsCarouselDto) {
            NewsfeedNewsfeedItemDto.NewsfeedItemAppsCarouselDto newsfeedItemAppsCarouselDto = (NewsfeedNewsfeedItemDto.NewsfeedItemAppsCarouselDto) newsfeedNewsfeedItemDto;
            im60 im60Var = this.e;
            s1n s1nVar2 = im60Var.b;
            List<AppsAppDto> j2 = newsfeedItemAppsCarouselDto.j();
            String i5 = newsfeedItemAppsCarouselDto.l().i();
            if (newsfeedItemAppsCarouselDto.d().d().e() != null) {
                DiscoverCarouselButtonDto d10 = newsfeedItemAppsCarouselDto.d();
                s1nVar2.getClass();
                linkButton2 = s1n.a(d10);
            } else {
                linkButton2 = null;
            }
            DiscoverCarouselObjectsTypeDto k2 = newsfeedItemAppsCarouselDto.k();
            String i6 = k2 != null ? k2.i() : null;
            String title2 = newsfeedItemAppsCarouselDto.getTitle();
            String r2 = newsfeedItemAppsCarouselDto.r();
            int hashCode = i5.hashCode();
            if (hashCode != 79592101) {
                if (hashCode != 122611998) {
                    if (hashCode == 415799170 && i5.equals("recommended_games_carousel")) {
                        i = 63;
                    }
                }
                i = 23;
            }
            int i7 = i;
            List<DiscoverCarouselItemDto> g6 = newsfeedItemAppsCarouselDto.g();
            ArrayList arrayList3 = new ArrayList(c5g.u(g6, 10));
            for (DiscoverCarouselItemDto discoverCarouselItemDto : g6) {
                DiscoverCarouselButtonContextDto d11 = discoverCarouselItemDto.d().d().d();
                Integer valueOf = d11 != null ? Integer.valueOf(d11.d()) : null;
                String title3 = discoverCarouselItemDto.getTitle();
                ne6 ne6Var = im60Var.c;
                List<BaseImageDto> f4 = discoverCarouselItemDto.f();
                ne6Var.getClass();
                Image a2 = ne6.a(f4);
                DiscoverCarouselButtonDto d12 = discoverCarouselItemDto.d();
                s1nVar2.getClass();
                LinkButton a3 = s1n.a(d12);
                NewsfeedNewsfeedItemDto.NewsfeedItemAppsCarouselDto newsfeedItemAppsCarouselDto2 = newsfeedItemAppsCarouselDto;
                String d13 = discoverCarouselItemDto.e().d();
                DiscoverCarouselItemDescriptionTypeDto e7 = discoverCarouselItemDto.e().e();
                CarouselDescription carouselDescription = new CarouselDescription(d13, e7 != null ? e7.i() : null);
                if (j2 != null) {
                    Iterator it3 = j2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            s1nVar = s1nVar2;
                            obj4 = null;
                            break;
                        }
                        obj4 = it3.next();
                        Iterator it4 = it3;
                        int id = ((AppsAppDto) obj4).getId();
                        s1nVar = s1nVar2;
                        if (valueOf != null && id == valueOf.intValue()) {
                            break;
                        }
                        it3 = it4;
                        s1nVar2 = s1nVar;
                    }
                    AppsAppDto appsAppDto = (AppsAppDto) obj4;
                    if (appsAppDto != null) {
                        AppsAppDto a4 = AppsAppDto.a(appsAppDto, AppsAppTypeDto.APP);
                        im60Var.a.getClass();
                        apiApplication = re3.b(a4);
                        arrayList3.add(new AppCarouselItem(title3, a2, a3, carouselDescription, apiApplication));
                        newsfeedItemAppsCarouselDto = newsfeedItemAppsCarouselDto2;
                        s1nVar2 = s1nVar;
                    }
                } else {
                    s1nVar = s1nVar2;
                }
                apiApplication = null;
                arrayList3.add(new AppCarouselItem(title3, a2, a3, carouselDescription, apiApplication));
                newsfeedItemAppsCarouselDto = newsfeedItemAppsCarouselDto2;
                s1nVar2 = s1nVar;
            }
            NewsfeedNewsfeedItemDto.NewsfeedItemAppsCarouselDto newsfeedItemAppsCarouselDto3 = newsfeedItemAppsCarouselDto;
            AppCarousel appCarousel = new AppCarousel(linkButton2, i6, title2, r2, i7, i5, arrayList3);
            appCarousel.r = newsfeedItemAppsCarouselDto3.getTitle();
            Boolean i8 = newsfeedItemAppsCarouselDto3.i();
            Boolean bool3 = Boolean.TRUE;
            appCarousel.c = epx.f(i8, bool3);
            appCarousel.e = epx.f(newsfeedItemAppsCarouselDto3.n(), bool3);
            NewsfeedItemWallpostFeedbackDto f5 = newsfeedItemAppsCarouselDto3.f();
            appCarousel.g = f5 != null ? nn60.a(f5) : null;
            NewsfeedItemDebugInfoDto e8 = newsfeedItemAppsCarouselDto3.e();
            appCarousel.h = e8 != null ? sv1.w(e8) : null;
            return appCarousel;
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemClipsAutoplayBlockDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemClipsAutoplayBlockDto) newsfeedNewsfeedItemDto).d().i());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemClipsChallengesBlockUmbrellaDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemClipsChallengesBlockUmbrellaDto) newsfeedNewsfeedItemDto).d().i());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemDigestDto) {
            NewsfeedNewsfeedItemDto.NewsfeedItemDigestDto newsfeedItemDigestDto = (NewsfeedNewsfeedItemDto.NewsfeedItemDigestDto) newsfeedNewsfeedItemDto;
            tm60 tm60Var = this.c;
            tm60Var.getClass();
            NewsfeedNewsfeedItemDto.NewsfeedItemDigestDto.TemplateDto o2 = newsfeedItemDigestDto.o();
            if (o2 == null || (str2 = o2.i()) == null) {
                str2 = "";
            }
            String a5 = cqm0.a(newsfeedItemDigestDto.f());
            NewsfeedItemDigestHeaderDto j3 = newsfeedItemDigestDto.j();
            if (j3 != null) {
                String i9 = j3.f().i();
                String title4 = j3.getTitle();
                String d14 = j3.d();
                String g7 = j3.g();
                NewsfeedItemDigestButtonDto e9 = j3.e();
                if (e9 != null) {
                    String title5 = e9.getTitle();
                    BaseOwnerButtonActionDto d15 = e9.d();
                    button = new Digest.Button(title5, d15 != null ? tm60.a(d15) : null);
                } else {
                    button = null;
                }
                header = new Digest.Header(i9, title4, d14, g7, button);
            } else {
                header = null;
            }
            NewsfeedItemDigestFooterDto i10 = newsfeedItemDigestDto.i();
            if (i10 != null) {
                String i11 = i10.f().i();
                String g8 = i10.g();
                NewsfeedItemDigestButtonDto d16 = i10.d();
                if (d16 != null) {
                    BaseOwnerButtonActionDto d17 = d16.d();
                    Action a6 = d17 != null ? tm60.a(d17) : new ActionEmpty();
                    String title6 = d16.getTitle();
                    NewsfeedItemDigestButtonDto.StyleDto e10 = d16.e();
                    linkButton = new LinkButton(title6, a6, e10 != null ? e10.i() : null);
                } else {
                    linkButton = null;
                }
                footer = new Digest.Footer(i11, g8, linkButton, i10.e());
            } else {
                footer = null;
            }
            List<String> n2 = newsfeedItemDigestDto.n();
            if (n2 == null) {
                n2 = EmptyList.b;
            }
            List<NewsfeedItemDigestItemDto> k3 = newsfeedItemDigestDto.k();
            if (k3 != null) {
                List<NewsfeedItemDigestItemDto> list6 = k3;
                list3 = new ArrayList(c5g.u(list6, 10));
                for (NewsfeedItemDigestItemDto newsfeedItemDigestItemDto : list6) {
                    NewsfeedItemWallpostDto g9 = newsfeedItemDigestItemDto.g();
                    UserId q = g9.q();
                    if (q == null) {
                        q = g9.k();
                    }
                    UserId userId = q;
                    Integer f6 = g9.f();
                    int intValue = (f6 == null && (f6 = g9.g()) == null) ? -1 : f6.intValue();
                    Flags flags = new Flags(0L, 1, null);
                    Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                    UserId userId2 = UserId.d;
                    int e11 = g9.e();
                    String l2 = g9.l();
                    String str4 = l2 == null ? "" : l2;
                    WallPostTypeDto i12 = g9.i();
                    String i13 = i12 != null ? i12.i() : null;
                    EntryHeader a7 = pwu.a();
                    ArrayList arrayList4 = new ArrayList();
                    Counters counters = new Counters(0, 0, 0, 0, 0, 0, 63, null);
                    NewsEntry.TrackData trackData = new NewsEntry.TrackData(g9.r(), 0, 0L, false, false, null, null, 0, 254, null);
                    Float j4 = g9.j();
                    NewsEntryWithAttachments.Cut cut = new NewsEntryWithAttachments.Cut(-1, -1, j4 != null ? j4.floatValue() : 1.0f, false, 8, null);
                    Integer d18 = g9.d();
                    Post post = new Post(flags, userId, intValue, owner, userId2, null, e11, str4, i13, null, null, false, null, a7, arrayList4, null, null, null, null, counters, false, null, null, null, false, null, trackData, null, cut, null, null, null, null, d18 != null ? d18.intValue() : 0, g9.n(), null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 65416, null);
                    pax0 pax0Var = (pax0) tm60Var.a.getValue();
                    if (pax0Var != null) {
                        WallWallpostAttachmentDto d19 = newsfeedItemDigestItemDto.d();
                        attachment = d19 != null ? pax0Var.a(d19, linkedHashMap) : null;
                    } else {
                        attachment = null;
                    }
                    Integer e12 = newsfeedItemDigestItemDto.e();
                    int intValue2 = e12 != null ? e12.intValue() : -1;
                    boolean contains = n2.contains(post.Ab());
                    NewsfeedItemDigestItemDto.StyleDto j5 = newsfeedItemDigestItemDto.j();
                    if (j5 == null || (str3 = j5.i()) == null) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    list3.add(new DigestItem(str3, newsfeedItemDigestItemDto.i(), cqm0.a(newsfeedItemDigestItemDto.k()), attachment, intValue2, post, contains, cqm0.a(newsfeedItemDigestItemDto.f())));
                }
            } else {
                list3 = EmptyList.b;
            }
            if (str2.equals("grid")) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    oym oymVar = new oym(it5);
                    if (oymVar.a.size() == 3) {
                        arrayList5.add(oymVar);
                    }
                }
                if (!arrayList5.isEmpty() && !arrayList5.isEmpty()) {
                    Iterator it6 = arrayList5.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        if (!((oym) it6.next()).b()) {
                            Iterator it7 = arrayList5.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it7.next();
                                if (((oym) obj).a()) {
                                    break;
                                }
                            }
                            oym oymVar2 = (oym) obj;
                            while (oymVar2 != null) {
                                ArrayList<DigestItem> arrayList6 = oymVar2.a;
                                Iterator it8 = arrayList5.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it8.next();
                                    if (!((oym) obj2).b()) {
                                        break;
                                    }
                                }
                                oym oymVar3 = (oym) obj2;
                                if (oymVar3 == null) {
                                    break;
                                }
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= 3) {
                                        break;
                                    }
                                    ArrayList<DigestItem> arrayList7 = oymVar3.a;
                                    if (arrayList7.get(i14).h) {
                                        DigestItem digestItem = arrayList7.get(i14);
                                        arrayList7.set(i14, arrayList6.get(i14));
                                        arrayList6.set(i14, digestItem);
                                        break;
                                    }
                                    i14++;
                                }
                                Iterator it9 = arrayList5.iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it9.next();
                                    if (((oym) obj3).a()) {
                                        break;
                                    }
                                }
                                oymVar2 = (oym) obj3;
                            }
                        }
                    }
                }
                list3 = new ArrayList();
                Iterator it10 = arrayList5.iterator();
                while (it10.hasNext()) {
                    oym oymVar4 = (oym) it10.next();
                    ArrayList<DigestItem> arrayList8 = oymVar4.a;
                    if (arrayList8.get(2).h) {
                        Collections.swap(arrayList8, 1, 2);
                    }
                    if (oymVar4.b()) {
                        list3.addAll(oymVar4.a);
                    }
                }
            }
            Serializer.c<Digest> cVar = Digest.CREATOR;
            Boolean d20 = newsfeedItemDigestDto.d();
            Boolean bool4 = Boolean.TRUE;
            Digest digest = new Digest(str2, a5, header, footer, list3, epx.f(d20, bool4) ? 1 : 0, newsfeedItemDigestDto.r(), null, 128, null);
            digest.c = epx.f(newsfeedItemDigestDto.l(), bool4);
            digest.e = epx.f(newsfeedItemDigestDto.u(), bool4);
            NewsfeedItemWallpostFeedbackDto g10 = newsfeedItemDigestDto.g();
            digest.g = g10 != null ? nn60.a(g10) : null;
            NewsfeedItemDebugInfoDto e13 = newsfeedItemDigestDto.e();
            digest.h = e13 != null ? sv1.w(e13) : null;
            return digest;
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemExpertCardWidgetDto) {
            NewsfeedNewsfeedItemDto.NewsfeedItemExpertCardWidgetDto.TypeDto d21 = ((NewsfeedNewsfeedItemDto.NewsfeedItemExpertCardWidgetDto) newsfeedNewsfeedItemDto).d();
            return new CodeGenStub(d21 != null ? d21.i() : null);
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemFeedbackPollDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemFeedbackPollDto) newsfeedNewsfeedItemDto).d().i());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemFriendsEntrypointsBlockDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemFriendsEntrypointsBlockDto) newsfeedNewsfeedItemDto).getType());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemFriendsRecommendBlockDto) {
            return vm60.a((NewsfeedNewsfeedItemDto.NewsfeedItemFriendsRecommendBlockDto) newsfeedNewsfeedItemDto);
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemFriendsRecommendationsGroupsBlockDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemFriendsRecommendationsGroupsBlockDto) newsfeedNewsfeedItemDto).d().i());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemMarketCarouselBlockDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemMarketCarouselBlockDto) newsfeedNewsfeedItemDto).d().i());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemMarketItemDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemMarketItemDto) newsfeedNewsfeedItemDto).d().i());
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemMusicSelectionsBlockDto) {
            return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemMusicSelectionsBlockDto) newsfeedNewsfeedItemDto).d().i());
        }
        boolean z = newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemPhotoDto;
        xa4 xa4Var = this.b;
        if (z) {
            NewsfeedNewsfeedItemDto.NewsfeedItemPhotoDto newsfeedItemPhotoDto = (NewsfeedNewsfeedItemDto.NewsfeedItemPhotoDto) newsfeedNewsfeedItemDto;
            NewsfeedItemPhotoPhotosDto j6 = newsfeedItemPhotoDto.j();
            if (j6 == null || (list2 = j6.e()) == null) {
                list2 = EmptyList.b;
            }
            int i15 = zm60.$EnumSwitchMapping$0[newsfeedItemPhotoDto.o().ordinal()];
            int i16 = i15 != 1 ? i15 != 2 ? 1 : 9 : 7;
            Integer k4 = newsfeedItemPhotoDto.k();
            int intValue3 = k4 != null ? k4.intValue() : 0;
            long j7 = newsfeedItemPhotoDto.l().b;
            Owner owner2 = (Owner) linkedHashMap.get(newsfeedItemPhotoDto.l());
            int d22 = newsfeedItemPhotoDto.d();
            List<PhotosPhotoDto> list7 = list2;
            ArrayList arrayList9 = new ArrayList(c5g.u(list7, 10));
            for (PhotosPhotoDto photosPhotoDto : list7) {
                xa4Var.getClass();
                arrayList9.add(new EntryAttachment(new PhotoAttachment(xfa0.a(photosPhotoDto), linkedHashMap), null, null, null, 14, null));
            }
            ArrayList q2 = p4g.q(arrayList9);
            NewsfeedItemPhotoPhotosDto j8 = newsfeedItemPhotoDto.j();
            int size = (j8 == null || (d2 = j8.d()) == null) ? list2.size() : d2.intValue();
            Float n3 = newsfeedItemPhotoDto.n();
            NewsfeedNewsfeedItemHeaderDto g11 = newsfeedItemPhotoDto.g();
            Photos photos = new Photos(i16, intValue3, j7, owner2, d22, q2, size, n3, g11 != null ? skd.j(g11, linkedHashMap) : pwu.b((Owner) linkedHashMap.get(newsfeedItemPhotoDto.l())), new ArrayList(), new NewsEntryWithAttachments.Cut(1, 1, 1.0f, false, 8, null), new NewsEntry.TrackData(newsfeedItemPhotoDto.r(), 0, 0L, false, false, null, null, 0, 254, null));
            photos.c = epx.f(newsfeedItemPhotoDto.i(), Boolean.TRUE);
            NewsfeedItemDebugInfoDto e14 = newsfeedItemPhotoDto.e();
            if (e14 != null) {
                String d23 = e14.d();
                bpn0 bpn0Var = cqm0.a;
                if (d23 == null) {
                    d23 = "";
                }
                String description2 = e14.getDescription();
                debugInfo2 = new DebugInfo(d23, description2 != null ? description2 : "");
            } else {
                debugInfo2 = null;
            }
            photos.h = debugInfo2;
            NewsfeedItemWallpostFeedbackDto f7 = newsfeedItemPhotoDto.f();
            photos.g = f7 != null ? nn60.a(f7) : null;
            return photos;
        }
        if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemPhotoTagDto) {
            NewsfeedNewsfeedItemDto.NewsfeedItemPhotoTagDto newsfeedItemPhotoTagDto = (NewsfeedNewsfeedItemDto.NewsfeedItemPhotoTagDto) newsfeedNewsfeedItemDto;
            NewsfeedItemPhotoTagPhotoTagsDto j9 = newsfeedItemPhotoTagDto.j();
            if (j9 == null || (list = j9.e()) == null) {
                list = EmptyList.b;
            }
            int i17 = an60.$EnumSwitchMapping$0[newsfeedItemPhotoTagDto.o().ordinal()];
            int i18 = i17 != 1 ? i17 != 2 ? 1 : 9 : 7;
            Integer k5 = newsfeedItemPhotoTagDto.k();
            int intValue4 = k5 != null ? k5.intValue() : 0;
            long j10 = newsfeedItemPhotoTagDto.l().b;
            Owner owner3 = (Owner) linkedHashMap.get(newsfeedItemPhotoTagDto.l());
            int d24 = newsfeedItemPhotoTagDto.d();
            List<PhotosPhotoDto> list8 = list;
            ArrayList arrayList10 = new ArrayList(c5g.u(list8, 10));
            for (PhotosPhotoDto photosPhotoDto2 : list8) {
                xa4Var.getClass();
                arrayList10.add(new EntryAttachment(new PhotoAttachment(xfa0.a(photosPhotoDto2), linkedHashMap), null, null, null, 14, null));
            }
            ArrayList q3 = p4g.q(arrayList10);
            NewsfeedItemPhotoTagPhotoTagsDto j11 = newsfeedItemPhotoTagDto.j();
            int size2 = (j11 == null || (d = j11.d()) == null) ? list.size() : d.intValue();
            Float n4 = newsfeedItemPhotoTagDto.n();
            NewsfeedNewsfeedItemHeaderDto g12 = newsfeedItemPhotoTagDto.g();
            Photos photos2 = new Photos(i18, intValue4, j10, owner3, d24, q3, size2, n4, g12 != null ? skd.j(g12, linkedHashMap) : pwu.b((Owner) linkedHashMap.get(newsfeedItemPhotoTagDto.l())), new ArrayList(), new NewsEntryWithAttachments.Cut(1, 1, 1.0f, false, 8, null), new NewsEntry.TrackData(newsfeedItemPhotoTagDto.r(), 0, 0L, false, false, null, null, 0, 254, null));
            photos2.c = epx.f(newsfeedItemPhotoTagDto.i(), Boolean.TRUE);
            NewsfeedItemDebugInfoDto e15 = newsfeedItemPhotoTagDto.e();
            if (e15 != null) {
                String d25 = e15.d();
                bpn0 bpn0Var2 = cqm0.a;
                if (d25 == null) {
                    d25 = "";
                }
                String description3 = e15.getDescription();
                debugInfo = new DebugInfo(d25, description3 != null ? description3 : "");
            } else {
                debugInfo = null;
            }
            photos2.h = debugInfo;
            NewsfeedItemWallpostFeedbackDto f8 = newsfeedItemPhotoTagDto.f();
            photos2.g = f8 != null ? nn60.a(f8) : null;
            return photos2;
        }
        if (!(newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemPromoButtonDto)) {
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecognizeBlockDto) {
                return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemRecognizeBlockDto) newsfeedNewsfeedItemDto).d().i());
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedAppBlockDto) {
                NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedAppBlockDto newsfeedItemRecommendedAppBlockDto = (NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedAppBlockDto) newsfeedNewsfeedItemDto;
                cn60 cn60Var = this.f;
                cn60Var.getClass();
                AppsAppDto a8 = AppsAppDto.a(newsfeedItemRecommendedAppBlockDto.d(), AppsAppTypeDto.APP);
                cn60Var.a.getClass();
                WebApiApplication c = chx0.c(re3.b(a8));
                List<BaseImageDto> e16 = newsfeedItemRecommendedAppBlockDto.e();
                cn60Var.b.getClass();
                Image a9 = ne6.a(e16);
                List<List<BaseImageDto>> k6 = newsfeedItemRecommendedAppBlockDto.k();
                if (k6 != null) {
                    List<List<BaseImageDto>> list9 = k6;
                    ArrayList arrayList11 = new ArrayList(c5g.u(list9, 10));
                    Iterator it11 = list9.iterator();
                    while (it11.hasNext()) {
                        arrayList11.add(ne6.a((List) it11.next()));
                    }
                    arrayList = arrayList11;
                } else {
                    arrayList = null;
                }
                NewsfeedNewsfeedItemCaptionDto g13 = newsfeedItemRecommendedAppBlockDto.g();
                RecommendedMiniAppEntry recommendedMiniAppEntry = new RecommendedMiniAppEntry(newsfeedItemRecommendedAppBlockDto.o().i(), newsfeedItemRecommendedAppBlockDto.getTitle(), newsfeedItemRecommendedAppBlockDto.f(), newsfeedItemRecommendedAppBlockDto.l(), c, arrayList, a9, newsfeedItemRecommendedAppBlockDto.r(), (g13 == null || (e = g13.e()) == null) ? null : new ActionOpenUrl(e, null, 2, null));
                Boolean n5 = newsfeedItemRecommendedAppBlockDto.n();
                Boolean bool5 = Boolean.TRUE;
                recommendedMiniAppEntry.c = epx.f(n5, bool5);
                recommendedMiniAppEntry.e = epx.f(newsfeedItemRecommendedAppBlockDto.p(), bool5);
                NewsfeedItemWallpostFeedbackDto j12 = newsfeedItemRecommendedAppBlockDto.j();
                recommendedMiniAppEntry.g = j12 != null ? nn60.a(j12) : null;
                NewsfeedItemDebugInfoDto i19 = newsfeedItemRecommendedAppBlockDto.i();
                recommendedMiniAppEntry.h = i19 != null ? sv1.w(i19) : null;
                return recommendedMiniAppEntry;
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedArtistsBlockDto) {
                return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedArtistsBlockDto) newsfeedNewsfeedItemDto).d().i());
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedAudiosBlockDto) {
                return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedAudiosBlockDto) newsfeedNewsfeedItemDto).d().i());
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedChannelsBlockDto) {
                NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedChannelsBlockDto newsfeedItemRecommendedChannelsBlockDto = (NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedChannelsBlockDto) newsfeedNewsfeedItemDto;
                this.i.getClass();
                ChannelsRecommendations channelsRecommendations = new ChannelsRecommendations(null, new ArrayList(), null, newsfeedItemRecommendedChannelsBlockDto.r());
                Boolean f9 = newsfeedItemRecommendedChannelsBlockDto.f();
                Boolean bool6 = Boolean.TRUE;
                channelsRecommendations.c = epx.f(f9, bool6);
                channelsRecommendations.e = epx.f(newsfeedItemRecommendedChannelsBlockDto.i(), bool6);
                NewsfeedItemWallpostFeedbackDto e17 = newsfeedItemRecommendedChannelsBlockDto.e();
                channelsRecommendations.g = e17 != null ? nn60.a(e17) : null;
                NewsfeedItemDebugInfoDto d26 = newsfeedItemRecommendedChannelsBlockDto.d();
                channelsRecommendations.h = d26 != null ? sv1.w(d26) : null;
                return channelsRecommendations;
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedGroupsBlockDto) {
                return this.g.a((NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedGroupsBlockDto) newsfeedNewsfeedItemDto);
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemStoriesInterestingBlockDto) {
                return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemStoriesInterestingBlockDto) newsfeedNewsfeedItemDto).d().i());
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemTopicDto) {
                return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemTopicDto) newsfeedNewsfeedItemDto).d().i());
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemUxpollBlockDto) {
                return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemUxpollBlockDto) newsfeedNewsfeedItemDto).d().i());
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemVideoDto) {
                return this.j.a((NewsfeedNewsfeedItemDto.NewsfeedItemVideoDto) newsfeedNewsfeedItemDto, linkedHashMap);
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemVideoPostcardBlockDto) {
                return new CodeGenStub(((NewsfeedNewsfeedItemDto.NewsfeedItemVideoPostcardBlockDto) newsfeedNewsfeedItemDto).d().i());
            }
            if (newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemVideosForYouBlockDto) {
                return this.h.a((NewsfeedNewsfeedItemDto.NewsfeedItemVideosForYouBlockDto) newsfeedNewsfeedItemDto, linkedHashMap);
            }
            if (!(newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedItemWallpostDto)) {
                return newsfeedNewsfeedItemDto instanceof NewsfeedNewsfeedItemDto.NewsfeedMediaDiscoverBlockDto ? this.d.a((NewsfeedNewsfeedItemDto.NewsfeedMediaDiscoverBlockDto) newsfeedNewsfeedItemDto, linkedHashMap) : new CodeGenStub("null");
            }
            this.a.getClass();
            return mn60.a((NewsfeedNewsfeedItemDto.NewsfeedItemWallpostDto) newsfeedNewsfeedItemDto);
        }
        NewsfeedNewsfeedItemDto.NewsfeedItemPromoButtonDto newsfeedItemPromoButtonDto = (NewsfeedNewsfeedItemDto.NewsfeedItemPromoButtonDto) newsfeedNewsfeedItemDto;
        String title7 = newsfeedItemPromoButtonDto.getTitle();
        String f10 = newsfeedItemPromoButtonDto.f();
        List<NewsfeedItemPromoButtonImageDto> e18 = newsfeedItemPromoButtonDto.e();
        if (e18 != null) {
            List<NewsfeedItemPromoButtonImageDto> list10 = e18;
            ArrayList arrayList12 = new ArrayList(c5g.u(list10, 10));
            for (NewsfeedItemPromoButtonImageDto newsfeedItemPromoButtonImageDto : list10) {
                String url = newsfeedItemPromoButtonImageDto.getUrl();
                Integer e19 = newsfeedItemPromoButtonImageDto.e();
                int intValue5 = e19 != null ? e19.intValue() : 0;
                Integer d27 = newsfeedItemPromoButtonImageDto.d();
                arrayList12.add(new ImageSize(url, intValue5, d27 != null ? d27.intValue() : 0, null, (char) 0, false, 56, null));
            }
            image = new Image(arrayList12);
        } else {
            image = null;
        }
        NewsfeedItemPromoButtonActionDto d28 = newsfeedItemPromoButtonDto.d();
        if (d28 != null) {
            String type = d28.getType();
            if (type != null) {
                switch (type.hashCode()) {
                    case -1209156902:
                        if (type.equals("groups_advertisement")) {
                            String url2 = d28.getUrl();
                            str = url2 != null ? url2 : "";
                            Iterator it12 = ActionOpenUrl.Target.h().iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    ?? next = it12.next();
                                    if (epx.f(((ActionOpenUrl.Target) next).name(), d28.d())) {
                                        target = next;
                                    }
                                } else {
                                    target = null;
                                }
                            }
                            ActionOpenUrl.Target target3 = target;
                            if (target3 == null) {
                                target3 = ActionOpenUrl.Target.f30default;
                            }
                            actionEmpty = new ActionOpenAdvUrl(str, target3);
                            action2 = actionEmpty;
                            break;
                        }
                        break;
                    case -504306182:
                        if (type.equals("open_url")) {
                            String url3 = d28.getUrl();
                            str = url3 != null ? url3 : "";
                            Iterator it13 = ActionOpenUrl.Target.h().iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    ?? next2 = it13.next();
                                    if (epx.f(((ActionOpenUrl.Target) next2).name(), d28.d())) {
                                        target2 = next2;
                                    }
                                } else {
                                    target2 = null;
                                }
                            }
                            ActionOpenUrl.Target target4 = target2;
                            if (target4 == null) {
                                target4 = ActionOpenUrl.Target.f30default;
                            }
                            actionEmpty = new ActionOpenUrl(str, target4);
                            action2 = actionEmpty;
                            break;
                        }
                        break;
                    case 474265455:
                        if (type.equals("close_web_app")) {
                            actionEmpty = new ActionCloseWebApp();
                            action2 = actionEmpty;
                            break;
                        }
                        break;
                    case 1361543127:
                        if (type.equals("enable_top_newsfeed")) {
                            actionEmpty = new ActionEnableTopNews();
                            action2 = actionEmpty;
                            break;
                        }
                        break;
                    case 1586893590:
                        if (type.equals("open_internal_vkui")) {
                            String url4 = d28.getUrl();
                            action2 = new ActionOpenInternalVkUi(url4 != null ? url4 : "");
                            break;
                        }
                        break;
                }
                action = action2;
            }
            actionEmpty = new ActionEmpty();
            action2 = actionEmpty;
            action = action2;
        } else {
            action = null;
        }
        return new PromoButton(title7, f10, image, action, newsfeedItemPromoButtonDto.r(), null, 32, null);
    }
}
