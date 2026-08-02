package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.StatPixel;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.donut.VideoDonut;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.interactive.InteractiveInfo;
import com.vk.dto.common.live.LivePlayBackSettings;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoNotificationsStatus;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.bss0;
import xsna.bxx;
import xsna.dpe0;
import xsna.nsk0;
import xsna.r11;

/* compiled from: VideoFile.kt */
/* loaded from: classes18.dex */
public interface VideoFile extends Serializer.StreamParcelable, bxx {

    /* compiled from: VideoFile.kt */
    public static final class a {
        public static String a(int i, UserId userId) {
            return r11.b(new StringBuilder(), userId.b, '_', i);
        }

        public static String b(long j, UserId userId) {
            StringBuilder sb = new StringBuilder();
            sb.append(userId.b);
            sb.append('_');
            sb.append(j);
            return sb.toString();
        }

        public static VideoFileOld c() {
            return new VideoFileOld();
        }

        public static VideoFileOld d(JSONObject jSONObject) {
            return new VideoFileOld(jSONObject);
        }
    }

    boolean A0();

    boolean A1();

    VideoSkippablePart A2();

    int A7();

    Boolean Aa();

    TimelineThumbs B0();

    int B4();

    void C0(int i);

    String C1();

    boolean C2();

    String C3();

    boolean C5();

    void C7(Map<StatPixel.a, nsk0> map);

    boolean D5();

    void D9(Image image);

    void E(String str);

    float E0();

    void E4(String str);

    VideoCanDownload F4();

    String F5();

    void F8(List<VideoEpisode> list);

    void F9(String str);

    boolean Fa();

    void G5(int i);

    boolean G7();

    VideoAccessInfo G9();

    Counters H();

    Long H1();

    boolean H3();

    boolean H6();

    TitleAction Ha();

    UserId I0();

    boolean I1();

    boolean I6();

    boolean Ia();

    String J1();

    void J6(VideoNotificationsStatus videoNotificationsStatus);

    boolean J8();

    void J9(LivePlayBackSettings livePlayBackSettings);

    LivePlayBackSettings K1();

    Integer K2();

    String K5();

    Integer L3();

    VideoUrlStorage L7();

    int L8();

    boolean L9();

    String M0();

    String M4();

    boolean M5();

    boolean N();

    VideoDownloadDto N5();

    void N6(boolean z);

    void N8(String str);

    long Na();

    VideoRestriction O();

    default String O1() {
        return "{ uniqueKey= \"" + r1() + "\" ovid= " + Y6() + " type= " + getType() + " oid= " + I0() + " vid= " + o0() + ' ' + getWidth() + 'x' + getHeight() + " videoId= " + a1() + " isMessage= " + Sa() + " isGif= " + x5() + " videoUrlStorage= {" + w9() + "} duration= " + getDuration() + " failoverHost= " + K5() + " descr= \"" + j1() + "\" }";
    }

    ServerEffect O5();

    boolean O9();

    String P();

    void P2(int i);

    void P6(OrdAdInfo ordAdInfo);

    Boolean P8();

    bss0 Pa();

    Boolean Q();

    boolean Q0();

    void Q4(int i);

    InteractiveInfo R7();

    String S3();

    void S5(int i);

    boolean Sa();

    boolean T1();

    boolean T3();

    String T7();

    boolean U();

    VideoDonut U3();

    InstreamAd U7();

    void V9(UserId userId);

    int W7();

    void W8(int i);

    boolean W9();

    boolean X();

    VideoAdInfo X0();

    boolean X2();

    void Xa(boolean z);

    VerifyInfo Y();

    void Y2(List<? extends PrivacySetting.PrivacyRule> list);

    List<VideoEpisode> Y3();

    String Y6();

    boolean Z1();

    void Z7();

    boolean Z9();

    String a1();

    void a2(int i);

    Integer a6();

    boolean aa();

    OfferVkVideo ab();

    int b0();

    void b2(VideoCanDownload videoCanDownload);

    List<VideoFile> b7();

    void bb();

    boolean c0();

    int c1();

    VideoFileOld copy();

    String d7();

    boolean d8();

    Map<StatPixel.a, nsk0> e0();

    Image e1();

    boolean e2();

    void e4(Boolean bool);

    JSONObject e8(String str);

    void eb(VideoSkippablePart videoSkippablePart);

    void f0(boolean z);

    void f1(Owner owner);

    String f2();

    void f8(int i);

    boolean g1();

    Boolean g4();

    int getDuration();

    int getHeight();

    Image getImage();

    String getPlatform();

    List<PrivacySetting.PrivacyRule> getPrivacy();

    long getTimestamp();

    String getTitle();

    String getType();

    UserId getUid();

    int getWidth();

    boolean h1();

    void h2(boolean z);

    boolean i0();

    List<PrivacySetting.PrivacyRule> i6();

    boolean i9();

    boolean isEmpty();

    boolean isExternal();

    boolean isHorizontal();

    boolean j0();

    String j1();

    Integer j2();

    Long j5();

    void jb(List<? extends VideoFile> list);

    boolean k0();

    int k1();

    String k2();

    void k3(boolean z);

    void k4(boolean z);

    void k6(boolean z);

    int l1();

    int l6();

    void l8(int i);

    void la(int i);

    void m(String str);

    ActionLink m1();

    Boolean m3();

    void m6(long j);

    void m8(String str);

    void n2(List<? extends PrivacySetting.PrivacyRule> list);

    float n5();

    void n8(boolean z);

    int o0();

    void o5(Integer num);

    VideoNotificationsStatus o8();

    boolean p0();

    OrdAdInfo p1();

    boolean p2();

    void p5(Boolean bool);

    void pb(boolean z);

    boolean q0();

    void q6(Boolean bool);

    String r();

    void r0(boolean z);

    String r1();

    String ra();

    void rb(VideoAdInfo videoAdInfo);

    Owner s();

    void s0(boolean z);

    void s2(String str);

    boolean s5();

    void s9(boolean z);

    void setCover(boolean z);

    void setTimestamp(long j);

    void setTrackCode(String str);

    boolean t0();

    boolean t2();

    Integer t9();

    void ta(int i);

    void u7(ActionLink actionLink);

    void u9(boolean z);

    void ua(VideoUrlStorage videoUrlStorage);

    boolean v();

    boolean v2();

    Long v4();

    Image w2();

    dpe0 w4();

    void w5(VideoDonut videoDonut);

    boolean w8();

    VideoUrlStorage w9();

    boolean x0();

    boolean x5();

    String x8();

    void y7(int i);

    boolean yb();

    boolean z0();

    DownloadRestrictionReason z2();

    Long z7();
}
