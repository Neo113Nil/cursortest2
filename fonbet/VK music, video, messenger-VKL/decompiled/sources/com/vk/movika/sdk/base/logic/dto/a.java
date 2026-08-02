package com.vk.movika.sdk.base.logic.dto;

import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.o;

/* loaded from: classes3.dex */
public abstract class a {
    public final String a;

    /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1294a extends a {

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$a, reason: collision with other inner class name */
        public static final class C1295a extends AbstractC1294a {
            public C1295a() {
                super("ChapterJump");
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$b */
        public static final class b extends AbstractC1294a {
            public final com.vk.movika.sdk.base.model.f b;

            public b(com.vk.movika.sdk.base.model.f fVar) {
                super("ContainerBind");
                this.b = fVar;
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$c */
        public static final class c extends AbstractC1294a {
            public final com.vk.movika.sdk.base.model.f b;

            public c(com.vk.movika.sdk.base.model.f fVar) {
                super("ContainerTimeout");
                this.b = fVar;
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$d */
        public static final class d extends AbstractC1294a {
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$e */
        public static final class e extends AbstractC1294a {
            public final com.vk.movika.sdk.base.logic.e b;
            public final o c;
            public final boolean d;
            public final String e;
            public final String f;

            public e() {
                this(null, null, false, null, "");
            }

            public e(com.vk.movika.sdk.base.logic.e eVar, o oVar, boolean z, String str, String str2) {
                super("Init");
                this.b = eVar;
                this.c = oVar;
                this.d = z;
                this.e = str;
                this.f = str2;
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$f */
        public static final class f extends AbstractC1294a {
            public final com.vk.movika.sdk.base.model.l b;

            public f(com.vk.movika.sdk.base.model.l lVar) {
                super("Interactive");
                this.b = lVar;
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$g */
        public static final class g extends AbstractC1294a {
            public final long b;
            public final long c;

            public g(long j, long j2) {
                super("Seek");
                this.b = j;
                this.c = j2;
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$h */
        public static final class h extends AbstractC1294a {
            public h() {
                super("SeekToChapterStart");
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$i */
        public static final class i extends AbstractC1294a {
            public i() {
                super("SeekToPreviousChapter");
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$j */
        public static final class j extends AbstractC1294a {
            public final o b;

            public j(o oVar) {
                super("SetHistory");
                this.b = oVar;
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$k */
        public static final class k extends AbstractC1294a {
            public final Chapter b;
            public final Chapter c;

            public k(Chapter chapter, Chapter chapter2) {
                super("SwitchChapter");
                this.b = chapter;
                this.c = chapter2;
            }
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$a$l */
        public static final class l extends AbstractC1294a {
            public final long b;

            public l(long j) {
                super("UpdateTime");
                this.b = j;
            }
        }
    }

    public static abstract class b extends a {

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$b$a, reason: collision with other inner class name */
        public static final class C1296a extends b {
            public static final C1296a b = new C1296a("ChangeAudioTrack");
        }

        /* renamed from: com.vk.movika.sdk.base.logic.dto.a$b$b, reason: collision with other inner class name */
        public static final class C1297b extends b {
            public static final C1297b b = new C1297b("ChangeSubtitles");
        }

        public static final class c extends b {
            public final Long b;

            public c() {
                this(null);
            }

            public c(Long l) {
                super("Pause");
                this.b = l;
            }
        }

        public static final class d extends b {
            public final Long b;

            public d() {
                this(null);
            }

            public d(Long l) {
                super("Play");
                this.b = l;
            }
        }

        public static final class e extends b {
            public final boolean b;

            public e(boolean z) {
                super("SetLoop");
                this.b = z;
            }
        }
    }

    public a(String str) {
        this.a = str;
    }
}
