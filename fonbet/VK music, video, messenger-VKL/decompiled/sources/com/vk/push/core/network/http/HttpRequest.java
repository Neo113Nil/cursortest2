package com.vk.push.core.network.http;

import xsna.epx;
import xsna.zcl;

/* compiled from: HttpRequest.kt */
/* loaded from: classes.dex */
public abstract class HttpRequest {
    public final String a;
    public final String b;
    public final String c;

    /* compiled from: HttpRequest.kt */
    /* loaded from: classes5.dex */
    public static final class Get extends HttpRequest {
        public final String d;

        public Get(String str) {
            super("GET", str, null, null);
            this.d = str;
        }

        public static /* synthetic */ Get copy$default(Get get, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = get.getUrl();
            }
            return get.copy(str);
        }

        public final String component1() {
            return getUrl();
        }

        public final Get copy(String str) {
            return new Get(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Get) && epx.f(getUrl(), ((Get) obj).getUrl());
        }

        @Override // com.vk.push.core.network.http.HttpRequest
        public String getUrl() {
            return this.d;
        }

        public int hashCode() {
            return getUrl().hashCode();
        }

        public String toString() {
            return "Get(url=" + getUrl() + ')';
        }
    }

    /* compiled from: HttpRequest.kt */
    public static final class Post extends HttpRequest {
        public final String d;
        public final String e;

        public Post(String str, String str2) {
            super("POST", str, str2, null);
            this.d = str;
            this.e = str2;
        }

        public static /* synthetic */ Post copy$default(Post post, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = post.getUrl();
            }
            if ((i & 2) != 0) {
                str2 = post.getBody();
            }
            return post.copy(str, str2);
        }

        public final String component1() {
            return getUrl();
        }

        public final String component2() {
            return getBody();
        }

        public final Post copy(String str, String str2) {
            return new Post(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Post)) {
                return false;
            }
            Post post = (Post) obj;
            return epx.f(getUrl(), post.getUrl()) && epx.f(getBody(), post.getBody());
        }

        @Override // com.vk.push.core.network.http.HttpRequest
        public String getBody() {
            return this.e;
        }

        @Override // com.vk.push.core.network.http.HttpRequest
        public String getUrl() {
            return this.d;
        }

        public int hashCode() {
            return getBody().hashCode() + (getUrl().hashCode() * 31);
        }

        public String toString() {
            return "Post(url=" + getUrl() + ", body=" + getBody() + ')';
        }
    }

    public HttpRequest(String str, String str2, String str3, zcl zclVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String getBody() {
        return this.c;
    }

    public final String getMethod() {
        return this.a;
    }

    public String getUrl() {
        return this.b;
    }
}
