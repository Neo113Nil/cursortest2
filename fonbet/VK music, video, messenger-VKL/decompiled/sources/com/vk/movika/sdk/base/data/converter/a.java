package com.vk.movika.sdk.base.data.converter;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.movika.sdk.base.data.dto.BranchDto;
import com.vk.movika.sdk.base.data.dto.ChapterDto;
import com.vk.movika.sdk.base.data.dto.ContainerDto;
import com.vk.movika.sdk.base.data.dto.ControlDto;
import com.vk.movika.sdk.base.data.dto.EventDto;
import com.vk.movika.sdk.base.data.dto.LayoutDto;
import com.vk.movika.sdk.base.data.dto.LayoutParamsDto;
import com.vk.movika.sdk.base.data.dto.ManifestDto;
import com.vk.movika.sdk.base.data.dto.MediaDto;
import com.vk.movika.sdk.base.data.dto.MetadataDto;
import com.vk.movika.sdk.base.data.dto.VideoDto;
import com.vk.movika.sdk.base.data.dto.VideoVariantDto;
import com.vk.movika.sdk.base.data.dto.actions.BranchActionArgsDto;
import com.vk.movika.sdk.base.data.dto.actions.ContinuePlaybackActionDto;
import com.vk.movika.sdk.base.data.dto.actions.ExpectActionDto;
import com.vk.movika.sdk.base.data.dto.actions.NoBranchActionArgsDto;
import com.vk.movika.sdk.base.data.dto.actions.OpenURIActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetDefaultBranchActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetMaxWeightBranchActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetMinWeightBranchActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetNextBranchActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetRandomBranchActionDto;
import com.vk.movika.sdk.base.data.dto.actions.SetWeightlessRandomBranchActionDto;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.LayoutParams;
import com.vk.movika.sdk.base.model.VideoVariant;
import com.vk.movika.sdk.base.model.actions.d;
import com.vk.movika.sdk.base.model.actions.e;
import com.vk.movika.sdk.base.model.f;
import com.vk.movika.sdk.base.model.g;
import com.vk.movika.sdk.base.model.j;
import com.vk.movika.sdk.base.model.r;
import com.vk.movika.sdk.base.model.s;
import com.vk.movika.sdk.base.model.u;
import com.vk.movika.sdk.base.model.v;
import com.vk.movika.sdk.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.brm0;
import xsna.c5g;
import xsna.drm0;
import xsna.e43;
import xsna.fpf0;
import xsna.go9;
import xsna.j5g;
import xsna.pzl;

/* loaded from: classes3.dex */
public final class a {
    public static final C1290a Companion = new C1290a();

    /* renamed from: com.vk.movika.sdk.base.data.converter.a$a, reason: collision with other inner class name */
    public static final class C1290a {
    }

    public static f a(String str, ContainerDto containerDto) {
        String str2;
        LayoutParams.InnerSizesDependOn innerSizesDependOn;
        LayoutParams layoutParams;
        String str3 = containerDto.a;
        long j = containerDto.b;
        Long l = containerDto.f;
        LayoutDto layoutDto = containerDto.d;
        r rVar = layoutDto == null ? null : new r(layoutDto.a);
        if (rVar == null) {
            rVar = new r("relative");
        }
        String str4 = containerDto.c;
        List<ControlDto> list = containerDto.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (ControlDto controlDto : list) {
            String str5 = containerDto.a;
            String str6 = controlDto.a;
            String str7 = controlDto.b;
            String str8 = controlDto.c;
            if (str8 == null) {
                str8 = "";
            }
            LayoutParamsDto layoutParamsDto = controlDto.d;
            if (layoutParamsDto == null) {
                str2 = str3;
                layoutParams = null;
            } else {
                str2 = str3;
                Double d = layoutParamsDto.a;
                Double d2 = layoutParamsDto.b;
                Double d3 = layoutParamsDto.c;
                Double d4 = layoutParamsDto.d;
                Double d5 = layoutParamsDto.e;
                String str9 = layoutParamsDto.h;
                if (h.a(str9, "video")) {
                    innerSizesDependOn = LayoutParams.InnerSizesDependOn.VIDEO;
                } else {
                    h.a(str9, "self");
                    innerSizesDependOn = LayoutParams.InnerSizesDependOn.SELF;
                }
                layoutParams = new LayoutParams(d, d2, d3, d4, d5, innerSizesDependOn);
            }
            arrayList.add(new g(str6, str5, str7, str8, layoutParams, c(controlDto.e), controlDto.f));
            str3 = str2;
        }
        String str10 = str3;
        com.vk.movika.sdk.base.data.dto.actions.a aVar = containerDto.g;
        return new f(str10, str, j, l, rVar, str4, arrayList, aVar != null ? b(aVar) : null, containerDto.h, c(containerDto.i));
    }

    public static com.vk.movika.sdk.base.model.actions.a b(com.vk.movika.sdk.base.data.dto.actions.a aVar) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        if (aVar instanceof ContinuePlaybackActionDto) {
            ContinuePlaybackActionDto.ContinuePlaybackActionArgsDto continuePlaybackActionArgsDto = ((ContinuePlaybackActionDto) aVar).a;
            if (continuePlaybackActionArgsDto != null && (bool11 = continuePlaybackActionArgsDto.a) != null) {
                r1 = bool11.booleanValue();
            }
            return new com.vk.movika.sdk.base.model.actions.b(r1);
        }
        if (aVar instanceof OpenURIActionDto) {
            OpenURIActionDto.ArgsDto argsDto = ((OpenURIActionDto) aVar).a;
            return new d(argsDto.a, argsDto.b);
        }
        if (aVar instanceof SetDefaultBranchActionDto) {
            SetDefaultBranchActionDto setDefaultBranchActionDto = (SetDefaultBranchActionDto) aVar;
            NoBranchActionArgsDto noBranchActionArgsDto = setDefaultBranchActionDto.a;
            boolean booleanValue = (noBranchActionArgsDto == null || (bool10 = noBranchActionArgsDto.a) == null) ? true : bool10.booleanValue();
            NoBranchActionArgsDto noBranchActionArgsDto2 = setDefaultBranchActionDto.a;
            if (noBranchActionArgsDto2 != null && (bool9 = noBranchActionArgsDto2.b) != null) {
                r1 = bool9.booleanValue();
            }
            return new e.a(booleanValue, Boolean.valueOf(r1));
        }
        if (aVar instanceof SetMaxWeightBranchActionDto) {
            SetMaxWeightBranchActionDto setMaxWeightBranchActionDto = (SetMaxWeightBranchActionDto) aVar;
            NoBranchActionArgsDto noBranchActionArgsDto3 = setMaxWeightBranchActionDto.a;
            boolean booleanValue2 = (noBranchActionArgsDto3 == null || (bool8 = noBranchActionArgsDto3.a) == null) ? true : bool8.booleanValue();
            NoBranchActionArgsDto noBranchActionArgsDto4 = setMaxWeightBranchActionDto.a;
            if (noBranchActionArgsDto4 != null && (bool7 = noBranchActionArgsDto4.b) != null) {
                r1 = bool7.booleanValue();
            }
            return new e.c(booleanValue2, Boolean.valueOf(r1));
        }
        if (aVar instanceof SetMinWeightBranchActionDto) {
            SetMinWeightBranchActionDto setMinWeightBranchActionDto = (SetMinWeightBranchActionDto) aVar;
            NoBranchActionArgsDto noBranchActionArgsDto5 = setMinWeightBranchActionDto.a;
            boolean booleanValue3 = (noBranchActionArgsDto5 == null || (bool6 = noBranchActionArgsDto5.a) == null) ? true : bool6.booleanValue();
            NoBranchActionArgsDto noBranchActionArgsDto6 = setMinWeightBranchActionDto.a;
            if (noBranchActionArgsDto6 != null && (bool5 = noBranchActionArgsDto6.b) != null) {
                r1 = bool5.booleanValue();
            }
            return new e.d(booleanValue3, Boolean.valueOf(r1));
        }
        if (aVar instanceof SetRandomBranchActionDto) {
            SetRandomBranchActionDto setRandomBranchActionDto = (SetRandomBranchActionDto) aVar;
            NoBranchActionArgsDto noBranchActionArgsDto7 = setRandomBranchActionDto.a;
            boolean booleanValue4 = (noBranchActionArgsDto7 == null || (bool4 = noBranchActionArgsDto7.a) == null) ? true : bool4.booleanValue();
            NoBranchActionArgsDto noBranchActionArgsDto8 = setRandomBranchActionDto.a;
            if (noBranchActionArgsDto8 != null && (bool3 = noBranchActionArgsDto8.b) != null) {
                r1 = bool3.booleanValue();
            }
            return new e.C1305e(booleanValue4, Boolean.valueOf(r1));
        }
        if (aVar instanceof SetNextBranchActionDto) {
            SetNextBranchActionDto setNextBranchActionDto = (SetNextBranchActionDto) aVar;
            BranchActionArgsDto branchActionArgsDto = setNextBranchActionDto.a;
            String str = branchActionArgsDto.a;
            Boolean bool12 = branchActionArgsDto.b;
            boolean booleanValue5 = bool12 != null ? bool12.booleanValue() : true;
            Boolean bool13 = setNextBranchActionDto.a.c;
            return new e.b(booleanValue5, Boolean.valueOf(bool13 != null ? bool13.booleanValue() : true), str);
        }
        if (!(aVar instanceof SetWeightlessRandomBranchActionDto)) {
            if (aVar instanceof ExpectActionDto) {
                return new com.vk.movika.sdk.base.model.actions.c();
            }
            throw new IllegalArgumentException(go9.b("Unsupported action type ", fpf0.a(aVar.getClass()).l()));
        }
        SetWeightlessRandomBranchActionDto setWeightlessRandomBranchActionDto = (SetWeightlessRandomBranchActionDto) aVar;
        NoBranchActionArgsDto noBranchActionArgsDto9 = setWeightlessRandomBranchActionDto.a;
        boolean booleanValue6 = (noBranchActionArgsDto9 == null || (bool2 = noBranchActionArgsDto9.a) == null) ? true : bool2.booleanValue();
        NoBranchActionArgsDto noBranchActionArgsDto10 = setWeightlessRandomBranchActionDto.a;
        if (noBranchActionArgsDto10 != null && (bool = noBranchActionArgsDto10.b) != null) {
            r1 = bool.booleanValue();
        }
        return new e.f(booleanValue6, Boolean.valueOf(r1));
    }

    public static List c(List list) {
        if (list == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EventDto eventDto = (EventDto) it.next();
            arrayList.add(new j(eventDto.a, b(eventDto.b)));
        }
        return arrayList;
    }

    public final s d(ManifestDto manifestDto, MediaDto mediaDto) throws IllegalArgumentException {
        VideoVariant.Type type;
        VideoVariant.Type type2;
        VideoVariant videoVariant;
        Iterator it;
        String str;
        Long valueOf;
        Long l;
        ArrayList a;
        Object next;
        MetadataDto metadataDto = manifestDto.a;
        List<ChapterDto> list = manifestDto.b;
        String str2 = metadataDto.a;
        String str3 = metadataDto.b;
        Integer num = metadataDto.c;
        String str4 = metadataDto.d;
        String str5 = metadataDto.e;
        String str6 = metadataDto.f;
        if (str6 == null) {
            ChapterDto chapterDto = (ChapterDto) j5g.a0(list);
            str6 = chapterDto != null ? chapterDto.a : null;
            if (str6 == null) {
                throw new IllegalArgumentException("No initChapterId");
            }
        }
        u uVar = new u(num, str2, str3, str4, str5, str6);
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (ChapterDto chapterDto2 : list) {
            List<ContainerDto> list2 = chapterDto2.c;
            String str7 = chapterDto2.a;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a(str7, (ContainerDto) it2.next()));
            }
            List<f> D0 = j5g.D0(new b(), arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (f fVar : D0) {
                ArrayList arrayList4 = (ArrayList) j5g.k0(arrayList3);
                if (arrayList4 == null) {
                    a = e43.a(fVar);
                } else {
                    Iterator it3 = arrayList4.iterator();
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (it3.hasNext()) {
                            Long l2 = ((f) next).d;
                            long longValue = l2 != null ? l2.longValue() : Long.MAX_VALUE;
                            do {
                                Object next2 = it3.next();
                                Long l3 = ((f) next2).d;
                                long longValue2 = l3 != null ? l3.longValue() : Long.MAX_VALUE;
                                if (longValue < longValue2) {
                                    longValue = longValue2;
                                    next = next2;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    f fVar2 = (f) next;
                    if (fVar2 != null) {
                        Long l4 = fVar2.d;
                        if ((l4 != null ? l4.longValue() : Long.MAX_VALUE) >= fVar.c) {
                            arrayList4.add(fVar);
                        } else {
                            a = e43.a(fVar);
                        }
                    }
                }
                arrayList3.add(a);
            }
            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                List list3 = (List) it4.next();
                f fVar3 = (f) j5g.a0(list3);
                if (fVar3 == null || (str = fVar3.a) == null) {
                    str = "";
                }
                String str8 = str;
                ArrayList arrayList6 = new ArrayList(c5g.u(list3, 10));
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((f) it5.next()).a);
                }
                Iterator it6 = list3.iterator();
                if (it6.hasNext()) {
                    valueOf = Long.valueOf(((f) it6.next()).c);
                    while (it6.hasNext()) {
                        Long valueOf2 = Long.valueOf(((f) it6.next()).c);
                        if (valueOf.compareTo(valueOf2) > 0) {
                            valueOf = valueOf2;
                        }
                    }
                } else {
                    valueOf = null;
                }
                long longValue3 = valueOf != null ? valueOf.longValue() : 0L;
                Iterator it7 = list3.iterator();
                if (it7.hasNext()) {
                    Long l5 = ((f) it7.next()).d;
                    Long valueOf3 = Long.valueOf(l5 != null ? l5.longValue() : Long.MAX_VALUE);
                    while (it7.hasNext()) {
                        Long l6 = ((f) it7.next()).d;
                        Long valueOf4 = Long.valueOf(l6 != null ? l6.longValue() : Long.MAX_VALUE);
                        if (valueOf3.compareTo(valueOf4) < 0) {
                            valueOf3 = valueOf4;
                        }
                    }
                    l = valueOf3;
                } else {
                    l = null;
                }
                arrayList5.add(new com.vk.movika.sdk.base.model.h(str8, arrayList6, longValue3, l));
            }
            String str9 = chapterDto2.a;
            String str10 = chapterDto2.b;
            String str11 = chapterDto2.f;
            Chapter.Order order = h.a(str11, "start") ? Chapter.Order.START : h.a(str11, TtmlNode.END) ? Chapter.Order.END : Chapter.Order.SIMPLE;
            List<ContainerDto> list4 = chapterDto2.c;
            ArrayList arrayList7 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it8 = list4.iterator();
            while (it8.hasNext()) {
                arrayList7.add(a(str7, (ContainerDto) it8.next()));
            }
            List<BranchDto> list5 = chapterDto2.d;
            ArrayList arrayList8 = new ArrayList(c5g.u(list5, 10));
            for (BranchDto branchDto : list5) {
                String str12 = chapterDto2.a;
                String str13 = branchDto.a;
                String str14 = branchDto.b;
                Double d = branchDto.c;
                double doubleValue = d != null ? d.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                String str15 = branchDto.d;
                Boolean bool = branchDto.e;
                arrayList8.add(new com.vk.movika.sdk.base.model.a(doubleValue, str13, str12, str14, str15, bool != null ? bool.booleanValue() : false));
            }
            arrayList.add(new Chapter(str9, str10, arrayList5, arrayList7, arrayList8, c(chapterDto2.e), order));
        }
        List<VideoDto> list6 = mediaDto.a;
        ArrayList arrayList9 = new ArrayList(c5g.u(list6, 10));
        Iterator it9 = list6.iterator();
        while (it9.hasNext()) {
            VideoDto videoDto = (VideoDto) it9.next();
            List<VideoVariantDto> list7 = videoDto.d;
            String str16 = videoDto.a;
            ArrayList arrayList10 = new ArrayList();
            for (VideoVariantDto videoVariantDto : list7) {
                String lowerCase = drm0.p0(videoVariantDto.b).toString().toLowerCase(Locale.ROOT);
                int hashCode = lowerCase.hashCode();
                if (hashCode == -1349088399) {
                    if (lowerCase.equals("custom")) {
                        type = VideoVariant.Type.CUSTOM;
                        type2 = type;
                    }
                    type2 = null;
                } else if (hashCode == 103407) {
                    if (lowerCase.equals("hls")) {
                        type = VideoVariant.Type.HLS;
                        type2 = type;
                    }
                    type2 = null;
                } else if (hashCode != 108273) {
                    if (hashCode == 3075986 && lowerCase.equals("dash")) {
                        type = VideoVariant.Type.DASH;
                        type2 = type;
                    }
                    type2 = null;
                } else {
                    if (lowerCase.equals("mp4")) {
                        type = VideoVariant.Type.MP4;
                        type2 = type;
                    }
                    type2 = null;
                }
                if (type2 == null) {
                    it = it9;
                    videoVariant = null;
                } else {
                    String str17 = videoVariantDto.a;
                    if (str17 == null) {
                        it = it9;
                        str17 = null;
                    } else {
                        String obj = drm0.p0(str17).toString();
                        it = it9;
                        List l7 = e43.l("http://", "https://", "file://", DomExceptionUtils.SEPARATOR);
                        if (!(l7 instanceof Collection) || !l7.isEmpty()) {
                            Iterator it10 = l7.iterator();
                            while (it10.hasNext()) {
                                if (brm0.B(obj, (String) it10.next(), true)) {
                                }
                            }
                        }
                        str17 = pzl.b(null, DomExceptionUtils.SEPARATOR, drm0.p0(str17).toString());
                        videoVariant = new VideoVariant(str17, type2, videoVariantDto.d, videoVariantDto.e, videoVariantDto.c, videoVariantDto.f, videoVariantDto.g, videoVariantDto.h, videoVariantDto.i);
                    }
                    videoVariant = new VideoVariant(str17, type2, videoVariantDto.d, videoVariantDto.e, videoVariantDto.c, videoVariantDto.f, videoVariantDto.g, videoVariantDto.h, videoVariantDto.i);
                }
                if (videoVariant != null) {
                    arrayList10.add(videoVariant);
                }
                it9 = it;
            }
            Iterator it11 = it9;
            if (arrayList10.isEmpty()) {
                throw new IllegalArgumentException(go9.b("No supported video formats for video with id ", str16));
            }
            arrayList9.add(new v(str16, videoDto.b, arrayList10));
            it9 = it11;
        }
        return new s(uVar, arrayList, arrayList9);
    }
}
