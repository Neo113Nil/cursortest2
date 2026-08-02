package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.Objects;
import org.json.JSONObject;
import xsna.epx;
import xsna.yq;

/* compiled from: ActionOpenEditMarketAlbum.kt */
/* loaded from: classes18.dex */
public class ActionOpenEditMarketAlbum extends Action {
    public static final Serializer.c<ActionOpenEditMarketAlbum> CREATOR = new a();
    public final UserId c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionOpenEditMarketAlbum> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenEditMarketAlbum a(Serializer serializer) {
            return new ActionOpenEditMarketAlbum((UserId) serializer.A(UserId.class.getClassLoader()), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenEditMarketAlbum[i];
        }
    }

    public ActionOpenEditMarketAlbum(UserId userId, int i) {
        this.c = userId;
        this.d = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.c);
        serializer.S(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject d = yq.d("type", "market_edit_album");
        d.put("owner_id", this.c);
        d.put("album_id", this.d);
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionOpenEditMarketAlbum)) {
            return false;
        }
        ActionOpenEditMarketAlbum actionOpenEditMarketAlbum = (ActionOpenEditMarketAlbum) obj;
        return epx.f(this.c, actionOpenEditMarketAlbum.c) && this.d == actionOpenEditMarketAlbum.d;
    }

    public final int hashCode() {
        return Objects.hash(this.c, Integer.valueOf(this.d));
    }
}
