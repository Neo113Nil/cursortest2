package com.vk.video.polls.data;

import java.util.ArrayList;

/* compiled from: PollQuestionDto.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: PollQuestionDto.kt */
    public static final class a implements b {
        public final int a;
        public final String b;
        public final com.vk.video.polls.data.a c;
        public final ArrayList d;
        public final C1954a e;

        /* compiled from: PollQuestionDto.kt */
        /* renamed from: com.vk.video.polls.data.b$a$a, reason: collision with other inner class name */
        public static final class C1954a {
            public final String a;
            public final boolean b;
            public final boolean c;

            public C1954a(String str, boolean z, boolean z2) {
                this.a = str;
                this.b = z;
                this.c = z2;
            }
        }

        public a(int i, String str, com.vk.video.polls.data.a aVar, ArrayList arrayList, C1954a c1954a) {
            this.a = i;
            this.b = str;
            this.c = aVar;
            this.d = arrayList;
            this.e = c1954a;
        }
    }

    /* compiled from: PollQuestionDto.kt */
    /* renamed from: com.vk.video.polls.data.b$b, reason: collision with other inner class name */
    public static final class C1955b implements b {
        public final int a;
        public final String b;
        public final com.vk.video.polls.data.a c;
        public final int d;
        public final String e;
        public final String f;

        public C1955b(int i, String str, com.vk.video.polls.data.a aVar, int i2, String str2, String str3) {
            this.a = i;
            this.b = str;
            this.c = aVar;
            this.d = i2;
            this.e = str2;
            this.f = str3;
        }
    }

    /* compiled from: PollQuestionDto.kt */
    public static final class c implements b {
        public final int a;
        public final String b;
        public final com.vk.video.polls.data.a c;
        public final String d;

        public c(int i, String str, com.vk.video.polls.data.a aVar, String str2) {
            this.a = i;
            this.b = str;
            this.c = aVar;
            this.d = str2;
        }
    }

    /* compiled from: PollQuestionDto.kt */
    public static final class d implements b {
        public final int a;
        public final String b;
        public final com.vk.video.polls.data.a c;
        public final int d;

        public d(int i, String str, com.vk.video.polls.data.a aVar, int i2) {
            this.a = i;
            this.b = str;
            this.c = aVar;
            this.d = i2;
        }
    }
}
