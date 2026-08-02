package com.vk.libvideo.impl.di;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c5g;
import xsna.c8m;
import xsna.cdt0;
import xsna.fgj0;
import xsna.fkq0;
import xsna.fpf0;
import xsna.g8m;
import xsna.izs;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.rst0;
import xsna.u35;
import xsna.ums0;
import xsna.yzs;

/* compiled from: VideoApiHelperComponentImpl.kt */
/* loaded from: classes.dex */
public final class VideoApiHelperComponentImpl implements VideoApiHelperComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new u35(14));

    /* compiled from: VideoApiHelperComponentImpl.kt */
    public static final class a implements c8m<VideoApiHelperComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VideoApiHelperComponentImpl();
        }
    }

    /* compiled from: VideoApiHelperComponentImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<VideoGetResponseDto, List<? extends VideoFile>> {
        @Override // xsna.izs
        public final List<? extends VideoFile> invoke(VideoGetResponseDto videoGetResponseDto) {
            VideoGetResponseDto videoGetResponseDto2 = videoGetResponseDto;
            ((cdt0) this.receiver).getClass();
            return ums0.e(ums0.a, videoGetResponseDto2.e(), videoGetResponseDto2.g(), videoGetResponseDto2.d(), false, 52);
        }
    }

    /* compiled from: VideoApiHelperComponentImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ShortVideoGetResponseDto, ClipVideoFile> {
        @Override // xsna.izs
        public final ClipVideoFile invoke(ShortVideoGetResponseDto shortVideoGetResponseDto) {
            ((fgj0) this.receiver).getClass();
            return fgj0.a(shortVideoGetResponseDto);
        }
    }

    /* compiled from: VideoApiHelperComponentImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements yzs<List<? extends VideoVideoFullDto>, List<? extends UsersUserFullDto>, List<? extends GroupsGroupFullDto>, List<? extends VideoFile>> {
        @Override // xsna.yzs
        public final List<? extends VideoFile> invoke(List<? extends VideoVideoFullDto> list, List<? extends UsersUserFullDto> list2, List<? extends GroupsGroupFullDto> list3) {
            List<? extends VideoVideoFullDto> list4 = list;
            List<? extends UsersUserFullDto> list5 = list2;
            List<? extends GroupsGroupFullDto> list6 = list3;
            ((rst0) this.receiver).getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (UsersUserFullDto usersUserFullDto : list5) {
                UserId s1 = usersUserFullDto.s1();
                linkedHashMap.put(s1, usersUserFullDto.D0() + ' ' + usersUserFullDto.x1());
                linkedHashMap2.put(s1, usersUserFullDto.r2());
            }
            for (GroupsGroupFullDto groupsGroupFullDto : list6) {
                UserId e = fkq0.e(groupsGroupFullDto.P0());
                linkedHashMap.put(e, groupsGroupFullDto.y1());
                linkedHashMap2.put(e, groupsGroupFullDto.V1());
            }
            List<VideoFile> e2 = ums0.e(ums0.a, list4, list5, list6, false, 52);
            ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
            for (VideoFile videoFile : e2) {
                UserId I0 = videoFile.I0();
                videoFile.N8((String) linkedHashMap.get(I0));
                videoFile.F9((String) linkedHashMap2.get(I0));
                arrayList.add(videoFile);
            }
            return arrayList;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoApiHelperComponentImpl.class, "videoApiHelperRepository", "getVideoApiHelperRepository()Lcom/vk/libvideo/repositories/VideoApiHelperRepository;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.libvideo.api.di.VideoApiHelperComponent
    public final VideoApiHelperRepository N4() {
        qcy<Object> qcyVar = b[0];
        return (VideoApiHelperRepository) this.a.c();
    }
}
