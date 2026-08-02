package com.vk.storycamera.upload;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerAttachTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerCameraTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerEffectDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerLifetimeDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerMemoryTypeDto;
import com.vk.api.generated.stories.dto.StoriesUploadResultDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.entities.stat.StickersStatInfo;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.QuestionInfo;
import com.vk.dto.stories.model.StoriesInvolvementChoice;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.story.api.domain.interactor.upload.StoryTaskParams;
import com.vk.toggle.b;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.upload.core.utils.UploadException;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.afl0;
import xsna.asp;
import xsna.bem0;
import xsna.bpn0;
import xsna.c220;
import xsna.c5g;
import xsna.dq;
import xsna.dz2;
import xsna.e43;
import xsna.e8r;
import xsna.ekm0;
import xsna.epx;
import xsna.fv6;
import xsna.gbr;
import xsna.gcq0;
import xsna.ghn0;
import xsna.he40;
import xsna.ikm0;
import xsna.je40;
import xsna.jso0;
import xsna.ldq0;
import xsna.mdq0;
import xsna.n9b;
import xsna.ncq0;
import xsna.oqh0;
import xsna.orj0;
import xsna.qsl0;
import xsna.rf3;
import xsna.rsg0;
import xsna.rsu;
import xsna.s0q;
import xsna.s3q0;
import xsna.t33;
import xsna.tsl0;
import xsna.uvl0;
import xsna.vhk0;
import xsna.w8i;
import xsna.yfb;
import xsna.z6m0;
import xsna.zcq0;
import xsna.zrp;
import xsna.zul0;

/* compiled from: VideoStoryUploadTask.kt */
/* loaded from: classes11.dex */
public abstract class VideoStoryUploadTask extends rsu<StoryEntry> implements w8i, fv6 {
    public final boolean A;
    public final Object B;
    public String C;
    public final bpn0 D;
    public final bpn0 E;
    public final bpn0 F;
    public final bpn0 G;
    public gcq0 H;
    public final ekm0 I;
    public volatile long J;
    public volatile long K;
    public volatile long L;
    public final CameraVideoEncoderParameters u;
    public final ikm0 v;
    public final bpn0 w;
    public final Object x;
    public int y;
    public StoryTaskParams z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoStoryUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State AFTER_UPLOAD;
        public static final State BEFORE_UPLOAD;
        public static final State GETTING_UPLOAD_SERVER;
        public static final State SAVING;
        public static final State TASK_CREATED;
        public static final State UPLOADING;

        static {
            State state = new State("TASK_CREATED", 0);
            TASK_CREATED = state;
            State state2 = new State("BEFORE_UPLOAD", 1);
            BEFORE_UPLOAD = state2;
            State state3 = new State("GETTING_UPLOAD_SERVER", 2);
            GETTING_UPLOAD_SERVER = state3;
            State state4 = new State("UPLOADING", 3);
            UPLOADING = state4;
            State state5 = new State("SAVING", 4);
            SAVING = state5;
            State state6 = new State("AFTER_UPLOAD", 5);
            AFTER_UPLOAD = state6;
            State[] stateArr = {state, state2, state3, state4, state5, state6};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoStoryUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class a implements mdq0 {
        public a() {
        }

        @Override // xsna.mdq0
        public final void a(long j, long j2) {
            VideoStoryUploadTask.this.c0((int) ((j / j2) * 100), 100, false);
        }
    }

    public VideoStoryUploadTask(String str, CameraVideoEncoderParameters cameraVideoEncoderParameters, String str2) {
        super(str);
        this.u = cameraVideoEncoderParameters;
        this.v = new ikm0();
        this.w = new bpn0(new afl0(this, 21));
        this.x = new Object();
        this.y = -1;
        this.A = true;
        State state = State.TASK_CREATED;
        this.B = new Object();
        this.C = str2;
        this.D = new bpn0(new orj0(this, 24));
        this.E = new bpn0(new oqh0(this, 20));
        this.F = new bpn0(new ghn0(this, 16));
        this.G = new bpn0(new bem0(4));
        this.I = new ekm0();
    }

    @Override // xsna.rsu, xsna.sp6
    public final void L(Parcelable parcelable) {
        Integer num;
        PrivateFiles.a b;
        StoryTaskParams storyTaskParams;
        StoryUploadParams storyUploadParams;
        CameraVideoEncoderParameters cameraVideoEncoderParameters;
        CameraVideoEncoderParameters cameraVideoEncoderParameters2;
        StoryEntry storyEntry = (StoryEntry) parcelable;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.J;
        String str = this.C;
        if (str != null) {
            MediaUtils.f e = MediaUtils.a.e(str, true);
            num = e != null ? Integer.valueOf(e.e()) : null;
        } else {
            num = null;
        }
        z6m0 z6m0Var = (z6m0) this.D.getValue();
        int i = this.d;
        Long valueOf = storyEntry != null ? Long.valueOf(storyEntry.c) : null;
        s0q s0qVar = new s0q(this.J, SystemClock.elapsedRealtime(), 0L);
        StoryTaskParams storyTaskParams2 = this.z;
        z6m0Var.d(i, valueOf, false, s0qVar, (storyTaskParams2 == null || (cameraVideoEncoderParameters2 = storyTaskParams2.c) == null) ? null : Long.valueOf(cameraVideoEncoderParameters2.Db()), null, this.u.Eb(), this.u.Fb(), num, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType.UPLOAD);
        z6m0 z6m0Var2 = (z6m0) this.D.getValue();
        int i2 = this.d;
        Long valueOf2 = storyEntry != null ? Long.valueOf(storyEntry.c) : null;
        s0q s0qVar2 = new s0q(this.L, SystemClock.elapsedRealtime(), 0L);
        StoryTaskParams storyTaskParams3 = this.z;
        z6m0Var2.d(i2, valueOf2, false, s0qVar2, (storyTaskParams3 == null || (cameraVideoEncoderParameters = storyTaskParams3.c) == null) ? null : Long.valueOf(cameraVideoEncoderParameters.Db()), null, this.u.Eb(), this.u.Fb(), num, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType.UPLOAD_NETWORK);
        State state = State.TASK_CREATED;
        super.L(storyEntry);
        if (storyEntry != null) {
            ((uvl0) this.F.getValue()).e(this.d, storyEntry, (int) elapsedRealtime, g());
        }
        String str2 = this.p;
        Regex regex = com.vk.core.files.a.a;
        vhk0.c(str2);
        b = e8r.a.b(r2, PrivateSubdir.STORIES_TEMP.h(), true);
        File file = b.a;
        CameraVideoEncoderParameters cameraVideoEncoderParameters3 = this.u;
        File parentFile = cameraVideoEncoderParameters3.zb().getParentFile();
        if (epx.f(parentFile != null ? parentFile.getAbsolutePath() : null, file.getAbsolutePath()) && ((storyTaskParams = this.z) == null || (storyUploadParams = storyTaskParams.f) == null || !storyUploadParams.J)) {
            vhk0.b(cameraVideoEncoderParameters3.zb());
        }
        e8r.b.a(false);
        n0().A().h(this.d);
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return true;
    }

    @Override // xsna.sp6
    public final void W(Exception exc) {
        Integer num;
        CameraVideoEncoderParameters cameraVideoEncoderParameters;
        CameraVideoEncoderParameters cameraVideoEncoderParameters2;
        String str = this.C;
        if (str != null) {
            MediaUtils.f e = MediaUtils.a.e(str, true);
            num = e != null ? Integer.valueOf(e.e()) : null;
        } else {
            num = null;
        }
        z6m0 z6m0Var = (z6m0) this.D.getValue();
        int i = this.d;
        s0q s0qVar = new s0q(this.J, 0L, SystemClock.elapsedRealtime());
        StoryTaskParams storyTaskParams = this.z;
        z6m0Var.d(i, null, false, s0qVar, (storyTaskParams == null || (cameraVideoEncoderParameters2 = storyTaskParams.c) == null) ? null : Long.valueOf(cameraVideoEncoderParameters2.Db()), exc, this.u.Eb(), this.u.Fb(), num, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType.UPLOAD);
        z6m0 z6m0Var2 = (z6m0) this.D.getValue();
        int i2 = this.d;
        s0q s0qVar2 = new s0q(this.L, 0L, SystemClock.elapsedRealtime());
        StoryTaskParams storyTaskParams2 = this.z;
        z6m0Var2.d(i2, null, false, s0qVar2, (storyTaskParams2 == null || (cameraVideoEncoderParameters = storyTaskParams2.c) == null) ? null : Long.valueOf(cameraVideoEncoderParameters.Db()), exc, this.u.Eb(), this.u.Fb(), num, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType.UPLOAD_NETWORK);
        ((uvl0) this.F.getValue()).k(this.d, null);
    }

    @Override // xsna.sp6
    public final void X() {
        try {
            super.X();
        } catch (Throwable th) {
            ((uvl0) this.F.getValue()).k(this.d, this.C);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        State state = State.TASK_CREATED;
        StoryTaskParams storyTaskParams = this.z;
        if (storyTaskParams == null || this.H == null) {
            return null;
        }
        dz2 x = yfb.x(zul0.c((zul0) this.G.getValue(), this.H.a(), tsl0.a(), 1));
        p0(x);
        StoryEntry storyEntry = (StoryEntry) rsg0.a0(x).U(new he40(new n9b(this.I, 11), 19)).a();
        storyEntry.Wb(storyTaskParams.e.Gb());
        return storyEntry;
    }

    @Override // xsna.rsu, xsna.sp6
    public final void Z(String str) {
        while (!this.A) {
            synchronized (this.x) {
                this.x.wait(3000L);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        this.L = SystemClock.elapsedRealtime();
        State state = State.TASK_CREATED;
        ldq0.a(Uri.parse(str), o0(), 8, new a(), null);
        zcq0 zcq0Var = this.c;
        this.H = new gcq0(Collections.singletonList(new StoriesUploadResultDto(zcq0Var != null ? zcq0Var.b() : null)));
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.story_sending);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ac  */
    @Override // com.vk.upload.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q<ncq0> b0() {
        StoriesGetVideoUploadServerAttachTypeDto storiesGetVideoUploadServerAttachTypeDto;
        StoriesGetVideoUploadServerLifetimeDto storiesGetVideoUploadServerLifetimeDto;
        String Kb;
        ArrayList arrayList;
        ArrayList arrayList2;
        String i;
        StoriesInvolvementChoice Db;
        String str;
        String str2;
        zul0 zul0Var;
        Float f;
        String str3;
        StorySharingInfo storySharingInfo;
        UserId userId;
        Integer num;
        String str4;
        String str5;
        Integer num2;
        String str6;
        ArrayList arrayList3;
        OrdData Jb;
        OrdData Jb2;
        OrdData Jb3;
        String Cb;
        String Hb;
        StoryStatContainer Pb;
        List<StickersStatInfo> zb;
        ClickableStickers Bb;
        Long Cb2;
        Long Db2;
        Location Fb;
        Location Fb2;
        StoryStatContainer Pb2;
        JSONArray Ab;
        List<QuestionInfo> Mb;
        StoryEntryExtended Gb;
        StoryEntry zb2;
        List<Long> Bb2;
        String Hb2;
        StoryUploadParams.CameraType Ab2;
        String zb3;
        Integer Eb;
        while (!this.A) {
            synchronized (this.x) {
                this.x.wait(3000L);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        State state = State.TASK_CREATED;
        StoryTaskParams storyTaskParams = this.z;
        if (storyTaskParams == null) {
            throw new IllegalStateException("params must not be null");
        }
        r0();
        storyTaskParams.f.Yb(Integer.valueOf(storyTaskParams.c.Fb()));
        storyTaskParams.f.Xb(Integer.valueOf(storyTaskParams.c.Eb()));
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_VIDEO_UPLOAD_CODEGEN;
        storiesFeatures.getClass();
        if (!b.A.a(storiesFeatures)) {
            qsl0 b = qsl0.a.b(storyTaskParams.f, storyTaskParams.e, n0().a0().e(storyTaskParams.e, storyTaskParams.f));
            p0(b);
            this.g = b.b;
            return rsg0.a0(b);
        }
        ikm0 ikm0Var = this.v;
        CommonUploadParams commonUploadParams = storyTaskParams.e;
        StoryUploadParams storyUploadParams = storyTaskParams.f;
        StorySharingInfo Ib = commonUploadParams != null ? commonUploadParams.Ib() : null;
        if (Ib != null) {
            int zb4 = Ib.zb();
            ikm0Var.getClass();
            storiesGetVideoUploadServerAttachTypeDto = ikm0.f(zb4);
        } else {
            storiesGetVideoUploadServerAttachTypeDto = null;
        }
        if (storyUploadParams == null || (Eb = storyUploadParams.Eb()) == null) {
            storiesGetVideoUploadServerLifetimeDto = null;
        } else {
            int intValue = Eb.intValue();
            ikm0Var.getClass();
            storiesGetVideoUploadServerLifetimeDto = ikm0.d(intValue);
        }
        List singletonList = ((commonUploadParams != null && commonUploadParams.Kb()) || storyUploadParams == null || (Kb = storyUploadParams.Kb()) == null) ? null : Collections.singletonList(Kb);
        String zb5 = storyUploadParams != null ? storyUploadParams.zb() : null;
        ikm0Var.getClass();
        boolean a2 = ikm0.a(zb5);
        StoriesGetVideoUploadServerEffectDto c = (storyUploadParams == null || (zb3 = storyUploadParams.zb()) == null) ? null : ikm0.c(zb3);
        StoriesGetVideoUploadServerCameraTypeDto b2 = (storyUploadParams == null || (Ab2 = storyUploadParams.Ab()) == null) ? null : ikm0.b(Ab2);
        StoriesGetVideoUploadServerMemoryTypeDto e = (storyUploadParams == null || (Hb2 = storyUploadParams.Hb()) == null) ? null : ikm0.e(Hb2);
        zul0 zul0Var2 = (zul0) this.G.getValue();
        Boolean valueOf = commonUploadParams != null ? Boolean.valueOf(commonUploadParams.Ab()) : null;
        if (commonUploadParams != null && (Bb2 = commonUploadParams.Bb()) != null) {
            if (Bb2.isEmpty()) {
                Bb2 = null;
            }
            if (Bb2 != null) {
                List<Long> list = Bb2;
                ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    dq.h(((Number) it.next()).longValue(), arrayList4);
                }
                arrayList = arrayList4;
                if (commonUploadParams != null || (Gb = commonUploadParams.Gb()) == null || (zb2 = Gb.zb()) == null || (r10 = zb2.Fb()) == null || !commonUploadParams.Mb()) {
                    String str7 = null;
                }
                if (storyUploadParams != null && (Mb = storyUploadParams.Mb()) != null) {
                    if (Mb.isEmpty()) {
                        Mb = null;
                    }
                    if (Mb != null) {
                        ArrayList arrayList5 = new ArrayList(c5g.u(Mb, 10));
                        Iterator<T> it2 = Mb.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(((QuestionInfo) it2.next()).zb());
                        }
                        arrayList2 = arrayList5;
                        if (Ib != null || (i = Ib.Ab()) == null) {
                            i = (storyUploadParams != null || (Db = storyUploadParams.Db()) == null) ? null : Db.i();
                        }
                        if (Ib != null || (str = Ib.Bb()) == null || storiesGetVideoUploadServerAttachTypeDto != null || str.length() <= 0) {
                            str = null;
                        }
                        if (storyUploadParams != null || (str2 = storyUploadParams.Gb()) == null || str2.length() <= 0) {
                            str2 = null;
                        }
                        String str8 = storyUploadParams != null ? storyUploadParams.L : null;
                        UserId Db3 = commonUploadParams != null ? commonUploadParams.Db() : null;
                        Integer Nb = storyUploadParams != null ? storyUploadParams.Nb() : null;
                        String jSONArray = (storyUploadParams != null || (Pb2 = storyUploadParams.Pb()) == null || (Ab = Pb2.Ab()) == null) ? null : Ab.toString();
                        if (storyUploadParams != null || (Fb2 = storyUploadParams.Fb()) == null) {
                            zul0Var = zul0Var2;
                            f = null;
                        } else {
                            zul0Var = zul0Var2;
                            f = Float.valueOf((float) Fb2.getLatitude());
                        }
                        Float valueOf2 = (storyUploadParams != null || (Fb = storyUploadParams.Fb()) == null) ? null : Float.valueOf((float) Fb.getLongitude());
                        if (Ib != null && (Db2 = Ib.Db()) != null) {
                            if (storiesGetVideoUploadServerAttachTypeDto == null) {
                                Db2 = null;
                            }
                            if (Db2 != null) {
                                str3 = str8;
                                storySharingInfo = Ib;
                                userId = new UserId(Db2.longValue());
                                if (storySharingInfo != null && (Cb2 = storySharingInfo.Cb()) != null) {
                                    if (storiesGetVideoUploadServerAttachTypeDto == null) {
                                        Cb2 = null;
                                    }
                                    if (Cb2 != null) {
                                        num = Integer.valueOf((int) Cb2.longValue());
                                        if (storySharingInfo != null || (str4 = storySharingInfo.C1()) == null || storiesGetVideoUploadServerAttachTypeDto == null || str4.length() <= 0) {
                                            str4 = null;
                                        }
                                        Boolean valueOf3 = storyUploadParams != null ? Boolean.valueOf(storyUploadParams.Sb()) : null;
                                        Boolean valueOf4 = Boolean.valueOf(a2);
                                        if (storyUploadParams != null && (Bb = storyUploadParams.Bb()) != null) {
                                            if (Bb.Cb().isEmpty()) {
                                                Bb = null;
                                            }
                                            if (Bb != null) {
                                                str5 = Bb.e5().toString();
                                                if (storyUploadParams != null || (Pb = storyUploadParams.Pb()) == null || (zb = Pb.zb()) == null) {
                                                    num2 = num;
                                                    str6 = str4;
                                                    arrayList3 = null;
                                                } else {
                                                    List<StickersStatInfo> list2 = zb;
                                                    num2 = num;
                                                    str6 = str4;
                                                    arrayList3 = new ArrayList(c5g.u(list2, 10));
                                                    Iterator<T> it3 = list2.iterator();
                                                    while (it3.hasNext()) {
                                                        arrayList3.add(Long.valueOf(((StickersStatInfo) it3.next()).zb()));
                                                    }
                                                }
                                                dz2 x = yfb.x(zul0Var.e(valueOf, arrayList, str7, arrayList2, i, str, str2, e, str3, Db3, Nb, b2, c, jSONArray, f, valueOf2, storiesGetVideoUploadServerAttachTypeDto, userId, num2, str6, valueOf3, valueOf4, str5, arrayList3, (commonUploadParams != null || (Hb = commonUploadParams.Hb()) == null || Hb.length() <= 0) ? null : Hb, (commonUploadParams != null || (Cb = commonUploadParams.Cb()) == null || Cb.length() <= 0) ? null : Cb, n0().a0().e(commonUploadParams, storyUploadParams), storyUploadParams == null ? storyUploadParams.Ub() : null, commonUploadParams == null ? Boolean.valueOf(commonUploadParams.Lb()) : null, commonUploadParams == null ? commonUploadParams.Eb() : null, storyUploadParams == null ? storyUploadParams.Ob() : null, storyUploadParams == null ? storyUploadParams.Lb() : null, storyUploadParams == null ? storyUploadParams.Ib() : null, commonUploadParams == null ? commonUploadParams.Fb() : null, storyUploadParams == null ? storyUploadParams.Rb() : null, storyUploadParams == null ? storyUploadParams.Qb() : null, singletonList, (storyUploadParams != null || (Jb3 = storyUploadParams.Jb()) == null) ? null : Jb3.Bb(), (storyUploadParams != null || (Jb2 = storyUploadParams.Jb()) == null) ? null : Jb2.Ab(), (storyUploadParams != null || (Jb = storyUploadParams.Jb()) == null) ? null : Boolean.valueOf(Jb.W3()), storiesGetVideoUploadServerLifetimeDto, storyUploadParams == null ? Boolean.valueOf(storyUploadParams.Tb()) : null, storyUploadParams == null ? storyUploadParams.G : null));
                                                p0(x);
                                                this.g = x.b;
                                                return rsg0.a0(x).U(new je40(new c220(28), 19));
                                            }
                                        }
                                        str5 = null;
                                        if (storyUploadParams != null) {
                                        }
                                        num2 = num;
                                        str6 = str4;
                                        arrayList3 = null;
                                        dz2 x2 = yfb.x(zul0Var.e(valueOf, arrayList, str7, arrayList2, i, str, str2, e, str3, Db3, Nb, b2, c, jSONArray, f, valueOf2, storiesGetVideoUploadServerAttachTypeDto, userId, num2, str6, valueOf3, valueOf4, str5, arrayList3, (commonUploadParams != null || (Hb = commonUploadParams.Hb()) == null || Hb.length() <= 0) ? null : Hb, (commonUploadParams != null || (Cb = commonUploadParams.Cb()) == null || Cb.length() <= 0) ? null : Cb, n0().a0().e(commonUploadParams, storyUploadParams), storyUploadParams == null ? storyUploadParams.Ub() : null, commonUploadParams == null ? Boolean.valueOf(commonUploadParams.Lb()) : null, commonUploadParams == null ? commonUploadParams.Eb() : null, storyUploadParams == null ? storyUploadParams.Ob() : null, storyUploadParams == null ? storyUploadParams.Lb() : null, storyUploadParams == null ? storyUploadParams.Ib() : null, commonUploadParams == null ? commonUploadParams.Fb() : null, storyUploadParams == null ? storyUploadParams.Rb() : null, storyUploadParams == null ? storyUploadParams.Qb() : null, singletonList, (storyUploadParams != null || (Jb3 = storyUploadParams.Jb()) == null) ? null : Jb3.Bb(), (storyUploadParams != null || (Jb2 = storyUploadParams.Jb()) == null) ? null : Jb2.Ab(), (storyUploadParams != null || (Jb = storyUploadParams.Jb()) == null) ? null : Boolean.valueOf(Jb.W3()), storiesGetVideoUploadServerLifetimeDto, storyUploadParams == null ? Boolean.valueOf(storyUploadParams.Tb()) : null, storyUploadParams == null ? storyUploadParams.G : null));
                                        p0(x2);
                                        this.g = x2.b;
                                        return rsg0.a0(x2).U(new je40(new c220(28), 19));
                                    }
                                }
                                num = null;
                                if (storySharingInfo != null) {
                                }
                                str4 = null;
                                if (storyUploadParams != null) {
                                }
                                Boolean valueOf42 = Boolean.valueOf(a2);
                                if (storyUploadParams != null) {
                                    if (Bb.Cb().isEmpty()) {
                                    }
                                    if (Bb != null) {
                                    }
                                }
                                str5 = null;
                                if (storyUploadParams != null) {
                                }
                                num2 = num;
                                str6 = str4;
                                arrayList3 = null;
                                dz2 x22 = yfb.x(zul0Var.e(valueOf, arrayList, str7, arrayList2, i, str, str2, e, str3, Db3, Nb, b2, c, jSONArray, f, valueOf2, storiesGetVideoUploadServerAttachTypeDto, userId, num2, str6, valueOf3, valueOf42, str5, arrayList3, (commonUploadParams != null || (Hb = commonUploadParams.Hb()) == null || Hb.length() <= 0) ? null : Hb, (commonUploadParams != null || (Cb = commonUploadParams.Cb()) == null || Cb.length() <= 0) ? null : Cb, n0().a0().e(commonUploadParams, storyUploadParams), storyUploadParams == null ? storyUploadParams.Ub() : null, commonUploadParams == null ? Boolean.valueOf(commonUploadParams.Lb()) : null, commonUploadParams == null ? commonUploadParams.Eb() : null, storyUploadParams == null ? storyUploadParams.Ob() : null, storyUploadParams == null ? storyUploadParams.Lb() : null, storyUploadParams == null ? storyUploadParams.Ib() : null, commonUploadParams == null ? commonUploadParams.Fb() : null, storyUploadParams == null ? storyUploadParams.Rb() : null, storyUploadParams == null ? storyUploadParams.Qb() : null, singletonList, (storyUploadParams != null || (Jb3 = storyUploadParams.Jb()) == null) ? null : Jb3.Bb(), (storyUploadParams != null || (Jb2 = storyUploadParams.Jb()) == null) ? null : Jb2.Ab(), (storyUploadParams != null || (Jb = storyUploadParams.Jb()) == null) ? null : Boolean.valueOf(Jb.W3()), storiesGetVideoUploadServerLifetimeDto, storyUploadParams == null ? Boolean.valueOf(storyUploadParams.Tb()) : null, storyUploadParams == null ? storyUploadParams.G : null));
                                p0(x22);
                                this.g = x22.b;
                                return rsg0.a0(x22).U(new je40(new c220(28), 19));
                            }
                        }
                        str3 = str8;
                        storySharingInfo = Ib;
                        userId = null;
                        if (storySharingInfo != null) {
                            if (storiesGetVideoUploadServerAttachTypeDto == null) {
                            }
                            if (Cb2 != null) {
                            }
                        }
                        num = null;
                        if (storySharingInfo != null) {
                        }
                        str4 = null;
                        if (storyUploadParams != null) {
                        }
                        Boolean valueOf422 = Boolean.valueOf(a2);
                        if (storyUploadParams != null) {
                        }
                        str5 = null;
                        if (storyUploadParams != null) {
                        }
                        num2 = num;
                        str6 = str4;
                        arrayList3 = null;
                        dz2 x222 = yfb.x(zul0Var.e(valueOf, arrayList, str7, arrayList2, i, str, str2, e, str3, Db3, Nb, b2, c, jSONArray, f, valueOf2, storiesGetVideoUploadServerAttachTypeDto, userId, num2, str6, valueOf3, valueOf422, str5, arrayList3, (commonUploadParams != null || (Hb = commonUploadParams.Hb()) == null || Hb.length() <= 0) ? null : Hb, (commonUploadParams != null || (Cb = commonUploadParams.Cb()) == null || Cb.length() <= 0) ? null : Cb, n0().a0().e(commonUploadParams, storyUploadParams), storyUploadParams == null ? storyUploadParams.Ub() : null, commonUploadParams == null ? Boolean.valueOf(commonUploadParams.Lb()) : null, commonUploadParams == null ? commonUploadParams.Eb() : null, storyUploadParams == null ? storyUploadParams.Ob() : null, storyUploadParams == null ? storyUploadParams.Lb() : null, storyUploadParams == null ? storyUploadParams.Ib() : null, commonUploadParams == null ? commonUploadParams.Fb() : null, storyUploadParams == null ? storyUploadParams.Rb() : null, storyUploadParams == null ? storyUploadParams.Qb() : null, singletonList, (storyUploadParams != null || (Jb3 = storyUploadParams.Jb()) == null) ? null : Jb3.Bb(), (storyUploadParams != null || (Jb2 = storyUploadParams.Jb()) == null) ? null : Jb2.Ab(), (storyUploadParams != null || (Jb = storyUploadParams.Jb()) == null) ? null : Boolean.valueOf(Jb.W3()), storiesGetVideoUploadServerLifetimeDto, storyUploadParams == null ? Boolean.valueOf(storyUploadParams.Tb()) : null, storyUploadParams == null ? storyUploadParams.G : null));
                        p0(x222);
                        this.g = x222.b;
                        return rsg0.a0(x222).U(new je40(new c220(28), 19));
                    }
                }
                arrayList2 = null;
                if (Ib != null) {
                }
                if (storyUploadParams != null) {
                }
                if (Ib != null) {
                }
                str = null;
                if (storyUploadParams != null) {
                }
                str2 = null;
                if (storyUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                if (storyUploadParams != null) {
                }
                if (storyUploadParams != null) {
                }
                if (storyUploadParams != null) {
                }
                zul0Var = zul0Var2;
                f = null;
                if (storyUploadParams != null) {
                }
                if (Ib != null) {
                    if (storiesGetVideoUploadServerAttachTypeDto == null) {
                    }
                    if (Db2 != null) {
                    }
                }
                str3 = str8;
                storySharingInfo = Ib;
                userId = null;
                if (storySharingInfo != null) {
                }
                num = null;
                if (storySharingInfo != null) {
                }
                str4 = null;
                if (storyUploadParams != null) {
                }
                Boolean valueOf4222 = Boolean.valueOf(a2);
                if (storyUploadParams != null) {
                }
                str5 = null;
                if (storyUploadParams != null) {
                }
                num2 = num;
                str6 = str4;
                arrayList3 = null;
                dz2 x2222 = yfb.x(zul0Var.e(valueOf, arrayList, str7, arrayList2, i, str, str2, e, str3, Db3, Nb, b2, c, jSONArray, f, valueOf2, storiesGetVideoUploadServerAttachTypeDto, userId, num2, str6, valueOf3, valueOf4222, str5, arrayList3, (commonUploadParams != null || (Hb = commonUploadParams.Hb()) == null || Hb.length() <= 0) ? null : Hb, (commonUploadParams != null || (Cb = commonUploadParams.Cb()) == null || Cb.length() <= 0) ? null : Cb, n0().a0().e(commonUploadParams, storyUploadParams), storyUploadParams == null ? storyUploadParams.Ub() : null, commonUploadParams == null ? Boolean.valueOf(commonUploadParams.Lb()) : null, commonUploadParams == null ? commonUploadParams.Eb() : null, storyUploadParams == null ? storyUploadParams.Ob() : null, storyUploadParams == null ? storyUploadParams.Lb() : null, storyUploadParams == null ? storyUploadParams.Ib() : null, commonUploadParams == null ? commonUploadParams.Fb() : null, storyUploadParams == null ? storyUploadParams.Rb() : null, storyUploadParams == null ? storyUploadParams.Qb() : null, singletonList, (storyUploadParams != null || (Jb3 = storyUploadParams.Jb()) == null) ? null : Jb3.Bb(), (storyUploadParams != null || (Jb2 = storyUploadParams.Jb()) == null) ? null : Jb2.Ab(), (storyUploadParams != null || (Jb = storyUploadParams.Jb()) == null) ? null : Boolean.valueOf(Jb.W3()), storiesGetVideoUploadServerLifetimeDto, storyUploadParams == null ? Boolean.valueOf(storyUploadParams.Tb()) : null, storyUploadParams == null ? storyUploadParams.G : null));
                p0(x2222);
                this.g = x2222.b;
                return rsg0.a0(x2222).U(new je40(new c220(28), 19));
            }
        }
        arrayList = null;
        if (commonUploadParams != null) {
        }
        String str72 = null;
        if (storyUploadParams != null) {
            if (Mb.isEmpty()) {
            }
            if (Mb != null) {
            }
        }
        arrayList2 = null;
        if (Ib != null) {
        }
        if (storyUploadParams != null) {
        }
        if (Ib != null) {
        }
        str = null;
        if (storyUploadParams != null) {
        }
        str2 = null;
        if (storyUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        if (storyUploadParams != null) {
        }
        if (storyUploadParams != null) {
        }
        if (storyUploadParams != null) {
        }
        zul0Var = zul0Var2;
        f = null;
        if (storyUploadParams != null) {
        }
        if (Ib != null) {
        }
        str3 = str8;
        storySharingInfo = Ib;
        userId = null;
        if (storySharingInfo != null) {
        }
        num = null;
        if (storySharingInfo != null) {
        }
        str4 = null;
        if (storyUploadParams != null) {
        }
        Boolean valueOf42222 = Boolean.valueOf(a2);
        if (storyUploadParams != null) {
        }
        str5 = null;
        if (storyUploadParams != null) {
        }
        num2 = num;
        str6 = str4;
        arrayList3 = null;
        dz2 x22222 = yfb.x(zul0Var.e(valueOf, arrayList, str72, arrayList2, i, str, str2, e, str3, Db3, Nb, b2, c, jSONArray, f, valueOf2, storiesGetVideoUploadServerAttachTypeDto, userId, num2, str6, valueOf3, valueOf42222, str5, arrayList3, (commonUploadParams != null || (Hb = commonUploadParams.Hb()) == null || Hb.length() <= 0) ? null : Hb, (commonUploadParams != null || (Cb = commonUploadParams.Cb()) == null || Cb.length() <= 0) ? null : Cb, n0().a0().e(commonUploadParams, storyUploadParams), storyUploadParams == null ? storyUploadParams.Ub() : null, commonUploadParams == null ? Boolean.valueOf(commonUploadParams.Lb()) : null, commonUploadParams == null ? commonUploadParams.Eb() : null, storyUploadParams == null ? storyUploadParams.Ob() : null, storyUploadParams == null ? storyUploadParams.Lb() : null, storyUploadParams == null ? storyUploadParams.Ib() : null, commonUploadParams == null ? commonUploadParams.Fb() : null, storyUploadParams == null ? storyUploadParams.Rb() : null, storyUploadParams == null ? storyUploadParams.Qb() : null, singletonList, (storyUploadParams != null || (Jb3 = storyUploadParams.Jb()) == null) ? null : Jb3.Bb(), (storyUploadParams != null || (Jb2 = storyUploadParams.Jb()) == null) ? null : Jb2.Ab(), (storyUploadParams != null || (Jb = storyUploadParams.Jb()) == null) ? null : Boolean.valueOf(Jb.W3()), storiesGetVideoUploadServerLifetimeDto, storyUploadParams == null ? Boolean.valueOf(storyUploadParams.Tb()) : null, storyUploadParams == null ? storyUploadParams.G : null));
        p0(x22222);
        this.g = x22222.b;
        return rsg0.a0(x22222).U(new je40(new c220(28), 19));
    }

    @Override // xsna.fv6
    public final gcq0 e() {
        return this.H;
    }

    @Override // xsna.rsu
    public final void e0(String str) throws UploadException {
        try {
            this.H = new gcq0(Collections.singletonList(new StoriesUploadResultDto(new JSONObject(str).getJSONObject("response").getString("upload_result"))));
        } catch (Exception e) {
            Uri c = rf3.c(this.C, new StringBuilder("file://"));
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            gbr.a a2 = gbr.a(context, c);
            StringBuilder a3 = t33.a("can't parse upload response: \"", str, "\" for file ");
            a3.append(this.i);
            a3.append(" (");
            a3.append(a2);
            a3.append(')');
            throw new UploadException(a3.toString(), str, e);
        }
    }

    @Override // xsna.fv6
    public final int g() {
        String str = this.C;
        if (str == null) {
            return 0;
        }
        return (int) (new File(str).length() / 1024);
    }

    @Override // xsna.rsu
    public final long m0() {
        return PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public final BridgeComponent n0() {
        return (BridgeComponent) this.w.getValue();
    }

    public abstract RandomAccessFile o0();

    public final void p0(rsg0 rsg0Var) {
        String s = n0().s().s(this.z.e.Jb());
        if (s != null) {
            rsg0Var.B(s, "");
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "story-upload-queue";
    }

    public final void q0() {
        synchronized (this.B) {
            this.B.notifyAll();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void r0() {
        StoryUploadParams storyUploadParams;
        String str;
        MediaUtils.f e;
        String str2;
        StoryTaskParams storyTaskParams = this.z;
        if (storyTaskParams == null || (storyUploadParams = storyTaskParams.f) == null || (str = this.C) == null || (e = MediaUtils.a.e(str, false)) == null) {
            return;
        }
        float max = Math.max(e.c(), e.a());
        float f = 100;
        Bitmap j = MediaUtils.a.j(str, new MediaUtils.d((int) ((e.c() / max) * f), (int) (f * (e.a() / max))));
        if (j != null) {
            try {
                str2 = jso0.a(j);
            } catch (Throwable th) {
                L.i(th);
                str2 = null;
            }
            storyUploadParams.G = str2;
        }
    }

    @Override // xsna.rsu, com.vk.upload.impl.b, xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public final void u(Object obj) {
        this.p = null;
        k0();
        e8r.b.a(false);
        n0().A().g();
        super.u(obj);
    }

    @Override // xsna.ye6, com.vk.instantjobs.InstantJob
    public final void v(Object obj, Throwable th) {
        super.v(obj, th);
        n0().A().g();
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean x() {
        return false;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean y() {
        return false;
    }
}
