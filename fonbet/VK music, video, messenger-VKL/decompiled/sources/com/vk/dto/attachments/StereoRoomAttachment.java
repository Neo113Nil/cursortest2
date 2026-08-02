package com.vk.dto.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.stereo.StereoRoom;
import com.vkontakte.android.R;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dd80;
import xsna.epx;
import xsna.ptx0;

/* compiled from: StereoRoomAttachment.kt */
/* loaded from: classes18.dex */
public final class StereoRoomAttachment extends Attachment implements ptx0 {
    public static final Serializer.c<StereoRoomAttachment> CREATOR = new b();
    public final StereoRoom f;
    public final int g = 19;

    /* compiled from: StereoRoomAttachment.kt */
    public static final class a {
        public static StereoRoomAttachment a(JSONObject jSONObject, Map map) {
            Serializer.c<StereoRoom> cVar = StereoRoom.CREATOR;
            return new StereoRoomAttachment(StereoRoom.a.a(jSONObject, map));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StereoRoomAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StereoRoomAttachment a(Serializer serializer) {
            StereoRoom stereoRoom = (StereoRoom) serializer.G(StereoRoom.class.getClassLoader());
            if (stereoRoom == null) {
                return null;
            }
            return new StereoRoomAttachment(stereoRoom);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StereoRoomAttachment[i];
        }
    }

    public StereoRoomAttachment(StereoRoom stereoRoom) {
        this.f = stereoRoom;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return this.g;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.q;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return StereoRoomAttachment.class.equals(obj != null ? obj.getClass() : null) && (obj instanceof StereoRoomAttachment) && epx.f(this.f.b, ((StereoRoomAttachment) obj).f.b);
    }

    public final int hashCode() {
        return this.f.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SignalingProtocol.KEY_ROOM);
        StereoRoom stereoRoom = this.f;
        sb.append(stereoRoom.e);
        sb.append('_');
        sb.append(stereoRoom.b);
        return sb.toString();
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.stereo_room;
    }
}
