package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: ShowStoryBoxLoadFinish.kt */
/* loaded from: classes6.dex */
public final class ShowStoryBoxLoadFinish$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: ShowStoryBoxLoadFinish.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("story_id")
        private final int storyId;

        @pmi0("story_owner_id")
        private final int storyOwnerId;

        public Data(int i, int i2, String str) {
            this.storyOwnerId = i;
            this.storyId = i2;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.storyOwnerId == data.storyOwnerId && this.storyId == data.storyId && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = shy.a(this.storyId, Integer.hashCode(this.storyOwnerId) * 31, 31);
            String str = this.requestId;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(storyOwnerId=");
            sb.append(this.storyOwnerId);
            sb.append(", storyId=");
            sb.append(this.storyId);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public ShowStoryBoxLoadFinish$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new ShowStoryBoxLoadFinish$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowStoryBoxLoadFinish$Response)) {
            return false;
        }
        ShowStoryBoxLoadFinish$Response showStoryBoxLoadFinish$Response = (ShowStoryBoxLoadFinish$Response) obj;
        return epx.f(this.type, showStoryBoxLoadFinish$Response.type) && epx.f(this.data, showStoryBoxLoadFinish$Response.data) && epx.f(this.requestId, showStoryBoxLoadFinish$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ ShowStoryBoxLoadFinish$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppShowStoryBoxLoadFinish" : str, data, str2);
    }
}
