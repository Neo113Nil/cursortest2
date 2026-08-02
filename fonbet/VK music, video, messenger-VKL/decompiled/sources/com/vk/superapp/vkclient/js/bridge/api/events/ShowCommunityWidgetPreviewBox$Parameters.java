package com.vk.superapp.vkclient.js.bridge.api.events;

import com.ironsource.B5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ShowCommunityWidgetPreviewBox.kt */
/* loaded from: classes6.dex */
public final class ShowCommunityWidgetPreviewBox$Parameters implements ad6 {

    @pmi0("code")
    private final String code;

    @pmi0("group_id")
    private final int groupId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowCommunityWidgetPreviewBox.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("compact_list")
        public static final Type COMPACT_LIST;

        @pmi0("cover_list")
        public static final Type COVER_LIST;

        @pmi0("list")
        public static final Type LIST;

        @pmi0("match")
        public static final Type MATCH;

        @pmi0("matches")
        public static final Type MATCHES;

        @pmi0(B5.R)
        public static final Type TABLE;

        @pmi0("text")
        public static final Type TEXT;

        @pmi0("tiles")
        public static final Type TILES;

        static {
            Type type = new Type("TEXT", 0);
            TEXT = type;
            Type type2 = new Type("LIST", 1);
            LIST = type2;
            Type type3 = new Type("TABLE", 2);
            TABLE = type3;
            Type type4 = new Type("TILES", 3);
            TILES = type4;
            Type type5 = new Type("COMPACT_LIST", 4);
            COMPACT_LIST = type5;
            Type type6 = new Type("COVER_LIST", 5);
            COVER_LIST = type6;
            Type type7 = new Type("MATCH", 6);
            MATCH = type7;
            Type type8 = new Type("MATCHES", 7);
            MATCHES = type8;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ShowCommunityWidgetPreviewBox$Parameters(int i, Type type, String str, String str2) {
        this.groupId = i;
        this.type = type;
        this.code = str;
        this.requestId = str2;
    }

    public static final ShowCommunityWidgetPreviewBox$Parameters a(ShowCommunityWidgetPreviewBox$Parameters showCommunityWidgetPreviewBox$Parameters) {
        return showCommunityWidgetPreviewBox$Parameters.requestId == null ? new ShowCommunityWidgetPreviewBox$Parameters(showCommunityWidgetPreviewBox$Parameters.groupId, showCommunityWidgetPreviewBox$Parameters.type, showCommunityWidgetPreviewBox$Parameters.code, "default_request_id") : showCommunityWidgetPreviewBox$Parameters;
    }

    public static final void b(ShowCommunityWidgetPreviewBox$Parameters showCommunityWidgetPreviewBox$Parameters) {
        if (showCommunityWidgetPreviewBox$Parameters.groupId < 1) {
            throw new IllegalArgumentException("Value groupId cannot be less than 1");
        }
    }

    public static final void c(ShowCommunityWidgetPreviewBox$Parameters showCommunityWidgetPreviewBox$Parameters) {
        if (showCommunityWidgetPreviewBox$Parameters.type == null) {
            throw new IllegalArgumentException("Value of non-nullable member type cannot be\n                        null");
        }
        if (showCommunityWidgetPreviewBox$Parameters.code == null) {
            throw new IllegalArgumentException("Value of non-nullable member code cannot be\n                        null");
        }
        if (showCommunityWidgetPreviewBox$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowCommunityWidgetPreviewBox$Parameters)) {
            return false;
        }
        ShowCommunityWidgetPreviewBox$Parameters showCommunityWidgetPreviewBox$Parameters = (ShowCommunityWidgetPreviewBox$Parameters) obj;
        return this.groupId == showCommunityWidgetPreviewBox$Parameters.groupId && this.type == showCommunityWidgetPreviewBox$Parameters.type && epx.f(this.code, showCommunityWidgetPreviewBox$Parameters.code) && epx.f(this.requestId, showCommunityWidgetPreviewBox$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + urd0.a((this.type.hashCode() + (Integer.hashCode(this.groupId) * 31)) * 31, 31, this.code);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(groupId=");
        sb.append(this.groupId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
