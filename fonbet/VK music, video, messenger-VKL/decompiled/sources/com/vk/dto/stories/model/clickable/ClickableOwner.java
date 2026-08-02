package com.vk.dto.stories.model.clickable;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.q500;
import xsna.zcl;

/* compiled from: ClickableOwner.kt */
/* loaded from: classes18.dex */
public final class ClickableOwner extends ClickableSticker {
    public static final Serializer.c<ClickableOwner> CREATOR = new a();
    public final UserId e;
    public final WebStickerType f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableOwner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableOwner a(Serializer serializer) {
            return new ClickableOwner(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableOwner[i];
        }
    }

    public ClickableOwner() {
        this(0L, null, null, null, 15, null);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.f;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.e0(this.e);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        UserId userId = UserId.d;
        UserId userId2 = this.e;
        if (!epx.f(userId2, userId)) {
            e5.put("owner_id", userId2.b);
        }
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableOwner) || !super.equals(obj)) {
            return false;
        }
        ClickableOwner clickableOwner = (ClickableOwner) obj;
        return epx.f(this.e, clickableOwner.e) && this.f == clickableOwner.f;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        return this.f.hashCode() + bh10.a(super.hashCode() * 31, 31, this.e.b);
    }

    public ClickableOwner(long j, List<WebClickablePoint> list, q500 q500Var, UserId userId) {
        super(j, list, q500Var);
        this.e = userId;
        this.f = WebStickerType.OWNER;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableOwner(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), (UserId) serializer.A(UserId.class.getClassLoader()));
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }

    public ClickableOwner(long j, List list, q500 q500Var, UserId userId, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? EmptyList.b : list, (i & 4) != 0 ? null : q500Var, (i & 8) != 0 ? UserId.d : userId);
    }
}
