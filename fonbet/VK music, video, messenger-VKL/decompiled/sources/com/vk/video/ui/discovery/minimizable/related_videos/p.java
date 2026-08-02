package com.vk.video.ui.discovery.minimizable.related_videos;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.video.ui.discovery.minimizable.related_videos.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.dz5;
import xsna.g5g;
import xsna.i7o0;
import xsna.j5g;
import xsna.mct0;
import xsna.rbt0;
import xsna.zjs0;

/* compiled from: VideoRelatedVideosVideoQueuePagingState.kt */
/* loaded from: classes7.dex */
public final class p {
    public static final o.a a(o oVar, int i, rbt0 rbt0Var) {
        if (!(oVar instanceof o.a)) {
            throw new NoWhenBranchMatchedException();
        }
        List<mct0> list = ((o.a) oVar).a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (mct0 mct0Var : list) {
            if (mct0Var.a == i) {
                mct0Var = dz5.s(mct0Var, rbt0Var, null, null);
            }
            arrayList.add(mct0Var);
        }
        return new o.a(arrayList);
    }

    public static final o.a b(o oVar, int i, rbt0 rbt0Var) {
        if (!(oVar instanceof o.a)) {
            throw new NoWhenBranchMatchedException();
        }
        List<mct0> list = ((o.a) oVar).a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (mct0 mct0Var : list) {
            if (mct0Var.a == i) {
                mct0Var = dz5.w(mct0Var, rbt0Var);
            }
            arrayList.add(mct0Var);
        }
        return new o.a(arrayList);
    }

    public static final int c(o oVar, VideoFile videoFile) {
        if (!(oVar instanceof o.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator<T> it = ((o.a) oVar).a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int b = ((mct0) it.next()).b(videoFile);
            if (b > -1) {
                i = b;
            }
        }
        return i;
    }

    public static final VideoFile d(o oVar, VideoFile videoFile) {
        rbt0 rbt0Var;
        List<VideoFile> list;
        VideoFile d;
        if (!(oVar instanceof o.a)) {
            throw new NoWhenBranchMatchedException();
        }
        List<mct0> list2 = ((o.a) oVar).a;
        Iterator<mct0> it = list2.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().b(videoFile) > -1) {
                break;
            }
            i++;
        }
        mct0 mct0Var = (mct0) j5g.b0(i, list2);
        if (mct0Var != null && (d = mct0Var.d(videoFile)) != null) {
            return d;
        }
        mct0 mct0Var2 = (mct0) j5g.b0(i + 1, list2);
        if (mct0Var2 != null && (rbt0Var = (rbt0) j5g.a0(mct0Var2.e)) != null) {
            if (rbt0Var.a != 0) {
                rbt0Var = null;
            }
            if (rbt0Var != null && (list = rbt0Var.d) != null) {
                return (VideoFile) j5g.a0(list);
            }
        }
        return null;
    }

    public static final mct0 e(o oVar, int i) {
        Object obj;
        if (!(oVar instanceof o.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator<T> it = ((o.a) oVar).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mct0) obj).a == i) {
                break;
            }
        }
        return (mct0) obj;
    }

    public static final mct0 f(o oVar, VideoFile videoFile) {
        Object obj;
        if (!(oVar instanceof o.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator<T> it = ((o.a) oVar).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mct0) obj).b(videoFile) > -1) {
                break;
            }
        }
        return (mct0) obj;
    }

    public static final VideoFile g(o oVar, VideoFile videoFile) {
        VideoFile videoFile2;
        VideoRestriction O;
        if (!(oVar instanceof o.a)) {
            throw new NoWhenBranchMatchedException();
        }
        List<mct0> list = ((o.a) oVar).a;
        Iterator<mct0> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().b(videoFile) > -1) {
                break;
            }
            i++;
        }
        mct0 mct0Var = (mct0) j5g.b0(i, list);
        if (mct0Var != null) {
            List<rbt0> list2 = mct0Var.e;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                g5g.y(((rbt0) it2.next()).d, arrayList);
            }
            Integer g = i7o0.g(arrayList, new zjs0(1, videoFile));
            if (g != null) {
                int intValue = g.intValue();
                if (mct0Var.c) {
                    while (intValue > 0) {
                        intValue--;
                        videoFile2 = (VideoFile) j5g.b0(intValue, arrayList);
                        if (videoFile2 == null || (O = videoFile2.O()) == null || O.f) {
                            break;
                        }
                    }
                } else {
                    videoFile2 = (VideoFile) j5g.b0(intValue - 1, arrayList);
                }
                return videoFile2;
            }
            videoFile2 = null;
            return videoFile2;
        }
        mct0 mct0Var2 = (mct0) j5g.b0(i - 1, list);
        if (mct0Var2 != null) {
            return mct0Var2.c();
        }
        return null;
    }
}
