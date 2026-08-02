package com.vk.pending;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.upload.impl.b;
import com.vk.upload.impl.tasks.j;
import com.vkontakte.android.attachments.GraffitiAttachment;
import xsna.ju90;
import xsna.obr;

/* loaded from: classes4.dex */
public class PendingGraffitiAttachment extends GraffitiAttachment implements ju90 {
    public static final Serializer.c<PendingGraffitiAttachment> CREATOR = new a();

    public class a extends Serializer.c<PendingGraffitiAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingGraffitiAttachment a(@NonNull Serializer serializer) {
            return new PendingGraffitiAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingGraffitiAttachment[i];
        }
    }

    public PendingGraffitiAttachment(int i, UserId userId, String str, int i2, int i3, String str2) {
        super(i, userId, str, i2, i3, str2);
    }

    @Override // xsna.ju90
    public final void O3(int i) {
        this.f = i;
    }

    @Override // xsna.ju90
    public final int S() {
        return this.f;
    }

    @Override // xsna.ju90
    public final String getUri() {
        return this.h;
    }

    @Override // xsna.ju90
    public final b y6() {
        j jVar = new j(this.h, obr.g().a().y());
        jVar.d = this.f;
        return jVar;
    }

    public PendingGraffitiAttachment(Serializer serializer) {
        super(serializer);
    }
}
