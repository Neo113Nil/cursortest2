package com.vk.pending;

import androidx.annotation.NonNull;
import com.vk.audio.AudioMsgTrackByRecord;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.upload.impl.b;
import com.vk.upload.impl.tasks.c;
import com.vkontakte.android.attachments.AudioMessageAttachment;
import java.util.Arrays;
import xsna.ju90;
import xsna.obr;
import xsna.xq4;

/* loaded from: classes4.dex */
public class PendingAudioMessageAttachment extends AudioMessageAttachment implements ju90 {
    public static final Serializer.c<PendingAudioMessageAttachment> CREATOR = new a();
    public AudioMsgTrackByRecord z;

    public class a extends Serializer.c<PendingAudioMessageAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingAudioMessageAttachment a(@NonNull Serializer serializer) {
            return new PendingAudioMessageAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingAudioMessageAttachment[i];
        }
    }

    public PendingAudioMessageAttachment(String str, String str2, int i, UserId userId, int i2, String str3, int i3, byte[] bArr) {
        super(null, null, i3, bArr, str, str2, i, userId, i2, str3);
        this.g = xq4.e(i2, userId, str2);
    }

    @Override // xsna.ju90
    public final void O3(int i) {
        this.k = i;
        this.g = xq4.e(i, this.o, this.g);
    }

    @Override // xsna.ju90
    public final int S() {
        return this.k;
    }

    @Override // xsna.ju90
    public final String getUri() {
        return this.g;
    }

    @Override // xsna.ju90
    public final b y6() {
        String str = this.g;
        byte[] bArr = this.y;
        c cVar = new c(str, bArr != null ? Arrays.toString(bArr).replace(" ", "") : null, obr.g().a().y());
        cVar.d = this.k;
        return cVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PendingAudioMessageAttachment(AudioMsgTrackByRecord audioMsgTrackByRecord) {
        super(null, r2, audioMsgTrackByRecord.g, audioMsgTrackByRecord.h, "", r2, 0, audioMsgTrackByRecord.d, audioMsgTrackByRecord.c, "ogg");
        String str = audioMsgTrackByRecord.f;
        this.z = audioMsgTrackByRecord;
        this.g = audioMsgTrackByRecord.e;
    }

    public PendingAudioMessageAttachment(Serializer serializer) {
        super(serializer);
    }
}
