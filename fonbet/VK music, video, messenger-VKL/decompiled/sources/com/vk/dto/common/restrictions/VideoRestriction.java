package com.vk.dto.common.restrictions;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.Iterator;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aay;
import xsna.ajf;
import xsna.asp;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.zrp;

/* compiled from: VideoRestriction.kt */
/* loaded from: classes18.dex */
public final class VideoRestriction extends Restriction implements bxx {
    public static final Serializer.c<VideoRestriction> CREATOR = new b();
    public static final a k = new a();
    public final boolean f;
    public final Image g;
    public final Image h;
    public final int i;
    public final String j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoRestriction.kt */
    public static final class SupportedAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SupportedAction[] $VALUES;
        public static final a Companion;
        public static final SupportedAction DELETE;
        public static final SupportedAction LOGIN;
        public static final SupportedAction PLAY;
        public static final SupportedAction SUBSCRIBE;
        public static final SupportedAction UPDATE;
        private final String raw;

        /* compiled from: VideoRestriction.kt */
        public static final class a {
            public static boolean a(RestrictionButton restrictionButton) {
                zrp<SupportedAction> h = SupportedAction.h();
                if (h != null && h.isEmpty()) {
                    return false;
                }
                Iterator<E> it = h.iterator();
                while (it.hasNext()) {
                    if (epx.f(((SupportedAction) it.next()).i(), restrictionButton.b)) {
                        return true;
                    }
                }
                return false;
            }
        }

        static {
            SupportedAction supportedAction = new SupportedAction("PLAY", 0, "play");
            PLAY = supportedAction;
            SupportedAction supportedAction2 = new SupportedAction("SUBSCRIBE", 1, "subscribe");
            SUBSCRIBE = supportedAction2;
            SupportedAction supportedAction3 = new SupportedAction("LOGIN", 2, "login");
            LOGIN = supportedAction3;
            SupportedAction supportedAction4 = new SupportedAction("DELETE", 3, "delete");
            DELETE = supportedAction4;
            SupportedAction supportedAction5 = new SupportedAction(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE, 4, "update");
            UPDATE = supportedAction5;
            SupportedAction[] supportedActionArr = {supportedAction, supportedAction2, supportedAction3, supportedAction4, supportedAction5};
            $VALUES = supportedActionArr;
            $ENTRIES = new asp(supportedActionArr);
            Companion = new a();
        }

        public SupportedAction(String str, int i, String str2) {
            this.raw = str2;
        }

        public static zrp<SupportedAction> h() {
            return $ENTRIES;
        }

        public static SupportedAction valueOf(String str) {
            return (SupportedAction) Enum.valueOf(SupportedAction.class, str);
        }

        public static SupportedAction[] values() {
            return (SupportedAction[]) $VALUES.clone();
        }

        public final String i() {
            return this.raw;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<VideoRestriction> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.aay
        public final VideoRestriction a(JSONObject jSONObject) {
            String str = null;
            try {
                String string = jSONObject.getString("title");
                String string2 = jSONObject.getString("text");
                Serializer.c<VideoRestriction> cVar = VideoRestriction.CREATOR;
                Object opt = jSONObject.opt("blur");
                boolean booleanValue = opt instanceof Boolean ? ((Boolean) opt).booleanValue() : opt instanceof Number ? epx.f(opt, 1) : false;
                boolean z = jSONObject.optInt("can_play") == 1;
                int i = 2;
                Image image = new Image(jSONObject.getJSONArray("card_icon"), str, i, null == true ? 1 : 0);
                Image image2 = new Image(jSONObject.getJSONArray("list_icon"), null == true ? 1 : 0, i, null == true ? 1 : 0);
                JSONObject optJSONObject = jSONObject.optJSONObject("button");
                return new VideoRestriction(string, string2, booleanValue, optJSONObject != null ? (RestrictionButton) RestrictionButton.e.a(optJSONObject) : null, z, image, image2, jSONObject.optInt("disclaimer_type"), jSONObject.optString("mute_info_link"));
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VideoRestriction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoRestriction a(Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            boolean m = serializer.m();
            RestrictionButton restrictionButton = (RestrictionButton) serializer.G(RestrictionButton.class.getClassLoader());
            boolean m2 = serializer.m();
            Image image = (Image) serializer.G(Image.class.getClassLoader());
            Image image2 = (Image) serializer.G(Image.class.getClassLoader());
            int u = serializer.u();
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = "";
            }
            return new VideoRestriction(H, H2, m, restrictionButton, m2, image, image2, u, H3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoRestriction[i];
        }
    }

    public VideoRestriction(String str, String str2, boolean z, RestrictionButton restrictionButton, boolean z2, Image image, Image image2, int i, String str3) {
        super(str, str2, z, restrictionButton);
        this.f = z2;
        this.g = image;
        this.h = image2;
        this.i = i;
        this.j = str3;
    }

    public final boolean Bb() {
        return this.f;
    }

    public final int Cb() {
        return this.i;
    }

    public final Image Db() {
        return this.h;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.i0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.i0(this.g);
        serializer.i0(this.h);
        serializer.S(this.i);
        serializer.j0(this.j);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new ajf(this, this.f ? 1 : 0, 2));
    }
}
