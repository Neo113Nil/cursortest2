package com.vk.movika.sdk.base.logic.dto;

import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.s;

/* loaded from: classes3.dex */
public abstract class c {
    public final String a;

    public static final class a extends c {
    }

    public static final class b extends c {
        public final com.vk.movika.sdk.base.model.f b;

        public b(com.vk.movika.sdk.base.model.f fVar) {
            super("EventBind");
            this.b = fVar;
        }
    }

    /* renamed from: com.vk.movika.sdk.base.logic.dto.c$c, reason: collision with other inner class name */
    public static final class C1298c extends c {
        public final com.vk.movika.sdk.base.model.f b;

        public C1298c(com.vk.movika.sdk.base.model.f fVar) {
            super("EventTimeOut");
            this.b = fVar;
        }
    }

    public static final class d extends c {
        public final Chapter b;

        public d(Chapter chapter) {
            super("EndAllChapters");
            this.b = chapter;
        }
    }

    public static final class e extends c {
        public final s b;
        public final com.vk.movika.sdk.base.presenter.a c;
        public final com.vk.movika.sdk.base.model.o d;
        public final String e;
        public final String f;
        public final boolean g;

        public e(s sVar, com.vk.movika.sdk.base.presenter.a aVar, com.vk.movika.sdk.base.model.o oVar, String str, String str2, boolean z) {
            super("Init");
            this.b = sVar;
            this.c = aVar;
            this.d = oVar;
            this.e = str;
            this.f = str2;
            this.g = z;
        }
    }

    public static final class f extends c {
        public final com.vk.movika.sdk.base.model.l b;

        public f(com.vk.movika.sdk.base.model.l lVar) {
            super("Interactive");
            this.b = lVar;
        }
    }

    public static final class g extends c {
        public final Long b;

        public g() {
            this(null);
        }

        public g(Long l) {
            super("Pause");
            this.b = l;
        }
    }

    public static final class h extends c {
        public final Long b;

        public h() {
            this(null);
        }

        public h(Long l) {
            super("Play");
            this.b = l;
        }
    }

    public static final class i extends c {
        public final long b;
        public final long c;

        public i(long j, long j2) {
            super("Seek");
            this.b = j;
            this.c = j2;
        }
    }

    public static final class j extends c {
    }

    public static final class k extends c {
        public k() {
            super("SeekToPreviousChapter");
        }
    }

    public static final class l extends c {
        public final com.vk.movika.sdk.base.model.o b;

        public l(com.vk.movika.sdk.base.model.o oVar) {
            super("SetHistory");
            this.b = oVar;
        }
    }

    public static final class m extends c {
        public final boolean b;

        public m(boolean z) {
            super("SetLoop");
            this.b = z;
        }
    }

    public static final class n extends c {
        public final Chapter b;
        public final Chapter c;

        public n(Chapter chapter, Chapter chapter2) {
            super("SwitchChapter");
            this.b = chapter;
            this.c = chapter2;
        }
    }

    public static final class o extends c {
        public final long b;

        public o(long j) {
            super("UpdateTime");
            this.b = j;
        }

        @Override // com.vk.movika.sdk.base.logic.dto.c
        public final String toString() {
            return this.a + " time=" + this.b;
        }
    }

    public c(String str) {
        this.a = str;
    }

    public String toString() {
        return this.a;
    }
}
