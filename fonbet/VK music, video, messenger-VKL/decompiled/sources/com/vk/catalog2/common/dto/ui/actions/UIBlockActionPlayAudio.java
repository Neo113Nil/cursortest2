package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import java.util.Objects;
import xsna.epx;
import xsna.qjg;
import xsna.uqi;

/* compiled from: UIBlockActionPlayAudio.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionPlayAudio extends UIBlockAction {
    public static final Serializer.c<UIBlockActionPlayAudio> CREATOR = new a();
    public final MusicTrack z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionPlayAudio> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionPlayAudio a(Serializer serializer) {
            return new UIBlockActionPlayAudio(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionPlayAudio[i];
        }
    }

    public UIBlockActionPlayAudio(com.vk.catalog2.common.dto.api.ui.a aVar, String str, MusicTrack musicTrack) {
        super(aVar, str);
        this.z = musicTrack;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.e0(this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionPlayAudio zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        MusicTrack musicTrack = this.z;
        return new UIBlockActionPlayAudio(Ab, this.y, musicTrack != null ? MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048575) : null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionPlayAudio)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y)) {
            return epx.f(this.z, ((UIBlockActionPlayAudio) obj).z);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<[");
        sb.append(this.d);
        sb.append("]: ");
        MusicTrack musicTrack = this.z;
        sb.append(musicTrack != null ? musicTrack.c : null);
        sb.append('_');
        return uqi.b(sb, musicTrack != null ? Integer.valueOf(musicTrack.b) : null, '>');
    }

    public UIBlockActionPlayAudio(Serializer serializer) {
        super(serializer);
        this.z = (MusicTrack) serializer.A(MusicTrack.class.getClassLoader());
    }
}
