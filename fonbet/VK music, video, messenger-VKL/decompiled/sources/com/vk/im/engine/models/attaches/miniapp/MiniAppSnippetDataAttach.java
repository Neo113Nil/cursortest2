package com.vk.im.engine.models.attaches.miniapp;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import java.util.Objects;
import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.sr;
import xsna.yq;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MiniAppSnippetDataAttach.kt */
/* loaded from: classes2.dex */
public final class MiniAppSnippetDataAttach implements AttachWithId {
    public static final Serializer.c<MiniAppSnippetDataAttach> CREATOR = new a();
    public final long b;
    public final String c;
    public final Type d;
    public final String e;
    public final String f;
    public final String g;
    public final ApiApplication h;
    public final ImageList i;
    public final UserStack j;
    public final Integer k;
    public final String l;
    public int m;
    public AttachSyncState n;
    public final UserId o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MiniAppSnippetDataAttach.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type APP;
        public static final Type GAME;
        private final String raw;

        static {
            Type type = new Type("GAME", 0, "game");
            GAME = type;
            Type type2 = new Type("APP", 1, "mini_app");
            APP = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type(String str, int i, String str2) {
            this.raw = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String h() {
            return this.raw;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MiniAppSnippetDataAttach> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MiniAppSnippetDataAttach a(Serializer serializer) {
            return new MiniAppSnippetDataAttach(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MiniAppSnippetDataAttach[i];
        }
    }

    public MiniAppSnippetDataAttach(long j, String str, Type type, String str2, String str3, String str4, ApiApplication apiApplication, ImageList imageList, UserStack userStack, Integer num, String str5, int i, AttachSyncState attachSyncState, UserId userId) {
        this.b = j;
        this.c = str;
        this.d = type;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = apiApplication;
        this.i = imageList;
        this.j = userStack;
        this.k = num;
        this.l = str5;
        this.m = i;
        this.n = attachSyncState;
        this.o = userId;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.n;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return "";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.V(this.k);
        serializer.j0(this.l);
        serializer.j0(this.c);
        serializer.g0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.e0(this.h);
        serializer.e0(this.i);
        serializer.e0(this.j);
        serializer.S(this.m);
        serializer.S(this.n.h());
        serializer.e0(this.o);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.n = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new MiniAppSnippetDataAttach(this);
    }

    public final String d() {
        JSONObject d = yq.d("type", "app_action");
        d.put("app_id", this.b);
        d.put("title", this.c);
        d.put("icon_id", this.k);
        d.put("description", this.l);
        d.put("hash", this.g);
        return d.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniAppSnippetDataAttach)) {
            return false;
        }
        MiniAppSnippetDataAttach miniAppSnippetDataAttach = (MiniAppSnippetDataAttach) obj;
        return this.b == miniAppSnippetDataAttach.b && epx.f(this.c, miniAppSnippetDataAttach.c) && this.d == miniAppSnippetDataAttach.d && epx.f(this.e, miniAppSnippetDataAttach.e) && epx.f(this.f, miniAppSnippetDataAttach.f) && epx.f(this.g, miniAppSnippetDataAttach.g) && epx.f(this.h, miniAppSnippetDataAttach.h) && epx.f(this.i, miniAppSnippetDataAttach.i) && epx.f(this.j, miniAppSnippetDataAttach.j) && this.m == miniAppSnippetDataAttach.m && this.n == miniAppSnippetDataAttach.n && epx.f(this.o, miniAppSnippetDataAttach.o) && epx.f(this.k, miniAppSnippetDataAttach.k) && epx.f(this.l, miniAppSnippetDataAttach.l);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(this.m), this.n, this.o, this.l, this.k);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.m = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.m;
    }

    public /* synthetic */ MiniAppSnippetDataAttach(long j, String str, Type type, String str2, String str3, String str4, ApiApplication apiApplication, ImageList imageList, UserStack userStack, Integer num, String str5, int i, AttachSyncState attachSyncState, UserId userId, int i2, zcl zclVar) {
        this(j, str, type, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : apiApplication, (i2 & 128) != 0 ? null : imageList, (i2 & 256) != 0 ? null : userStack, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : str5, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) != 0 ? AttachSyncState.DONE : attachSyncState, (i2 & 8192) != 0 ? UserId.d : userId);
    }

    public MiniAppSnippetDataAttach(MiniAppSnippetDataAttach miniAppSnippetDataAttach) {
        this(miniAppSnippetDataAttach.b, miniAppSnippetDataAttach.c, miniAppSnippetDataAttach.d, miniAppSnippetDataAttach.e, miniAppSnippetDataAttach.f, miniAppSnippetDataAttach.g, miniAppSnippetDataAttach.h, miniAppSnippetDataAttach.i, miniAppSnippetDataAttach.j, miniAppSnippetDataAttach.k, miniAppSnippetDataAttach.l, miniAppSnippetDataAttach.m, miniAppSnippetDataAttach.n, miniAppSnippetDataAttach.o);
    }

    public MiniAppSnippetDataAttach(Serializer serializer) {
        this(serializer.w(), serializer.H(), (Type) serializer.C(), serializer.H(), serializer.H(), serializer.H(), (ApiApplication) serializer.A(ApiApplication.class.getClassLoader()), (ImageList) serializer.A(ImageList.class.getClassLoader()), (UserStack) serializer.A(UserStack.class.getClassLoader()), serializer.v(), serializer.H(), serializer.u(), sr.b(serializer, AttachSyncState.Companion), (UserId) serializer.A(UserId.class.getClassLoader()));
    }
}
